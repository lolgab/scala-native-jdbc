package java.sql

import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneOffset

class Timestamp(private var time: Long) extends java.util.Date(time) {
  private var nanos: Int = 0

  def this() = this(System.currentTimeMillis())

  def getNanos(): Int = nanos

  def setNanos(n: Int): Unit = {
    if (n < 0 || n > 999999999) {
      throw IllegalArgumentException("nanos > 999999999 or < 0")
    }
    nanos = n
  }

  override def setTime(time: Long): Unit = {
    super.setTime(time)
    nanos = 0
  }

  override def equals(obj: Any): Boolean = obj match {
    case ts: Timestamp => super.equals(ts) && nanos == ts.nanos
    case _             => false
  }

  override def compareTo(o: java.util.Date): Int = o match {
    case ts: Timestamp =>
      val thisTime = getTime()
      val anotherTime = ts.getTime()
      if (thisTime == anotherTime) {
        nanos.compareTo(ts.nanos)
      } else {
        thisTime.compareTo(anotherTime)
      }
    case _ =>
      super.compareTo(o)
  }

  override def toString(): String = {
    // val date = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this)
    // val nanosStr = if (nanos == 0) "" else "." + String.format("%09d", nanos)
    // date + nanosStr
    // TODO: Have proper toString
    s"Timestamp($time)"
  }

  override def hashCode(): Int = {
    val prime = 31
    var result = super.hashCode()
    result = prime * result + nanos
    result
  }
}

object Timestamp {
  def valueOf(s: String): Timestamp = {
    val timestamp = Timestamp(0)
    val parts = s.split("\\.")
    val dateStr = parts(0)
    val date = LocalDateTime.parse(dateStr)
    timestamp.setTime(date.toEpochSecond(ZoneOffset.UTC))
    if (parts.length > 1) {
      val nanos = parts(1).toInt * 1_000_000_000
      timestamp.setNanos(nanos)
    }
    timestamp
  }

  def from(instant: Instant): Timestamp = {
    val timestamp = Timestamp(instant.toEpochMilli())
    timestamp.setNanos(instant.getNano())
    timestamp
  }
}
