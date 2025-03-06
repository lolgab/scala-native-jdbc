package com.github.lolgab.jdbc.sqlite.internal

import scala.scalanative.unsafe.*
import scala.scalanative.runtime.{fromRawPtr, Intrinsics}
import scala.scalanative.runtime.Boxes

object constants {
  final val SQLITE_OK = 0
  final val SQLITE_ERROR = 1
  final val SQLITE_INTERNAL = 2
  final val SQLITE_PERM = 3
  final val SQLITE_ABORT = 4
  final val SQLITE_BUSY = 5
  final val SQLITE_LOCKED = 6
  final val SQLITE_NOMEM = 7
  final val SQLITE_READONLY = 8
  final val SQLITE_INTERRUPT = 9
  final val SQLITE_IOERR = 10
  final val SQLITE_CORRUPT = 11
  final val SQLITE_NOTFOUND = 12
  final val SQLITE_FULL = 13
  final val SQLITE_CANTOPEN = 14
  final val SQLITE_PROTOCOL = 15
  final val SQLITE_EMPTY = 16
  final val SQLITE_SCHEMA = 17
  final val SQLITE_TOOBIG = 18
  final val SQLITE_CONSTRAINT = 19
  final val SQLITE_MISMATCH = 20
  final val SQLITE_MISUSE = 21
  final val SQLITE_NOLFS = 22
  final val SQLITE_AUTH = 23
  final val SQLITE_FORMAT = 24
  final val SQLITE_RANGE = 25
  final val SQLITE_NOTADB = 26
  final val SQLITE_NOTICE = 27
  final val SQLITE_WARNING = 28
  final val SQLITE_ROW = 100
  final val SQLITE_DONE = 101

  // Column types
  final val SQLITE_INTEGER = 1
  final val SQLITE_FLOAT = 2
  final val SQLITE_TEXT = 3
  final val SQLITE_BLOB = 4
  final val SQLITE_NULL = 5

  // Open flags
  final val SQLITE_OPEN_READONLY = 0x00000001
  final val SQLITE_OPEN_READWRITE = 0x00000002
  final val SQLITE_OPEN_CREATE = 0x00000004

  final val SQLITE_STATIC = // Does not work on 32 bit architectures
    Boxes.boxToCFuncPtr1[Ptr[Byte], Unit](Intrinsics.castLongToRawPtr(0L))

  final val SQLITE_TRANSIENT = // Does not work on 32 bit architectures
    Boxes.boxToCFuncPtr1[Ptr[Byte], Unit](Intrinsics.castLongToRawPtr(-1L))
}
