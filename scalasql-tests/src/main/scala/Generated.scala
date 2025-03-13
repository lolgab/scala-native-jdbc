package scalasql.core.generated
import scalasql.core.Queryable
trait QueryableRow{
  implicit def Tuple2Queryable[Q1, Q2, R1, R2](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2]
): Queryable.Row[(Q1, Q2), (R1, R2)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2)) }
  )
}
implicit def Tuple3Queryable[Q1, Q2, Q3, R1, R2, R3](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3]
): Queryable.Row[(Q1, Q2, Q3), (R1, R2, R3)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3)) }
  )
}
implicit def Tuple4Queryable[Q1, Q2, Q3, Q4, R1, R2, R3, R4](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4]
): Queryable.Row[(Q1, Q2, Q3, Q4), (R1, R2, R3, R4)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4)) }
  )
}
implicit def Tuple5Queryable[Q1, Q2, Q3, Q4, Q5, R1, R2, R3, R4, R5](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5), (R1, R2, R3, R4, R5)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5)) }
  )
}
implicit def Tuple6Queryable[Q1, Q2, Q3, Q4, Q5, Q6, R1, R2, R3, R4, R5, R6](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6), (R1, R2, R3, R4, R5, R6)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6)) }
  )
}
implicit def Tuple7Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, R1, R2, R3, R4, R5, R6, R7](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7), (R1, R2, R3, R4, R5, R6, R7)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7)) }
  )
}
implicit def Tuple8Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, R1, R2, R3, R4, R5, R6, R7, R8](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7], q8: Queryable.Row[Q8, R8]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8), (R1, R2, R3, R4, R5, R6, R7, R8)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8)) }
  )
}
implicit def Tuple9Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, R1, R2, R3, R4, R5, R6, R7, R8, R9](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7], q8: Queryable.Row[Q8, R8], q9: Queryable.Row[Q9, R9]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9), (R1, R2, R3, R4, R5, R6, R7, R8, R9)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels(), q9.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8), q9.walkExprs(t._9)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi), q9.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8), q9.deconstruct(is._9)) }
  )
}
implicit def Tuple10Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7], q8: Queryable.Row[Q8, R8], q9: Queryable.Row[Q9, R9], q10: Queryable.Row[Q10, R10]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels(), q9.walkLabels(), q10.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8), q9.walkExprs(t._9), q10.walkExprs(t._10)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi), q9.construct(rsi), q10.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8), q9.deconstruct(is._9), q10.deconstruct(is._10)) }
  )
}
implicit def Tuple11Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7], q8: Queryable.Row[Q8, R8], q9: Queryable.Row[Q9, R9], q10: Queryable.Row[Q10, R10], q11: Queryable.Row[Q11, R11]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels(), q9.walkLabels(), q10.walkLabels(), q11.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8), q9.walkExprs(t._9), q10.walkExprs(t._10), q11.walkExprs(t._11)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi), q9.construct(rsi), q10.construct(rsi), q11.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8), q9.deconstruct(is._9), q10.deconstruct(is._10), q11.deconstruct(is._11)) }
  )
}
implicit def Tuple12Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7], q8: Queryable.Row[Q8, R8], q9: Queryable.Row[Q9, R9], q10: Queryable.Row[Q10, R10], q11: Queryable.Row[Q11, R11], q12: Queryable.Row[Q12, R12]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels(), q9.walkLabels(), q10.walkLabels(), q11.walkLabels(), q12.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8), q9.walkExprs(t._9), q10.walkExprs(t._10), q11.walkExprs(t._11), q12.walkExprs(t._12)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi), q9.construct(rsi), q10.construct(rsi), q11.construct(rsi), q12.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8), q9.deconstruct(is._9), q10.deconstruct(is._10), q11.deconstruct(is._11), q12.deconstruct(is._12)) }
  )
}
implicit def Tuple13Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7], q8: Queryable.Row[Q8, R8], q9: Queryable.Row[Q9, R9], q10: Queryable.Row[Q10, R10], q11: Queryable.Row[Q11, R11], q12: Queryable.Row[Q12, R12], q13: Queryable.Row[Q13, R13]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels(), q9.walkLabels(), q10.walkLabels(), q11.walkLabels(), q12.walkLabels(), q13.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8), q9.walkExprs(t._9), q10.walkExprs(t._10), q11.walkExprs(t._11), q12.walkExprs(t._12), q13.walkExprs(t._13)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi), q9.construct(rsi), q10.construct(rsi), q11.construct(rsi), q12.construct(rsi), q13.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8), q9.deconstruct(is._9), q10.deconstruct(is._10), q11.deconstruct(is._11), q12.deconstruct(is._12), q13.deconstruct(is._13)) }
  )
}
implicit def Tuple14Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7], q8: Queryable.Row[Q8, R8], q9: Queryable.Row[Q9, R9], q10: Queryable.Row[Q10, R10], q11: Queryable.Row[Q11, R11], q12: Queryable.Row[Q12, R12], q13: Queryable.Row[Q13, R13], q14: Queryable.Row[Q14, R14]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels(), q9.walkLabels(), q10.walkLabels(), q11.walkLabels(), q12.walkLabels(), q13.walkLabels(), q14.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8), q9.walkExprs(t._9), q10.walkExprs(t._10), q11.walkExprs(t._11), q12.walkExprs(t._12), q13.walkExprs(t._13), q14.walkExprs(t._14)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi), q9.construct(rsi), q10.construct(rsi), q11.construct(rsi), q12.construct(rsi), q13.construct(rsi), q14.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8), q9.deconstruct(is._9), q10.deconstruct(is._10), q11.deconstruct(is._11), q12.deconstruct(is._12), q13.deconstruct(is._13), q14.deconstruct(is._14)) }
  )
}
implicit def Tuple15Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7], q8: Queryable.Row[Q8, R8], q9: Queryable.Row[Q9, R9], q10: Queryable.Row[Q10, R10], q11: Queryable.Row[Q11, R11], q12: Queryable.Row[Q12, R12], q13: Queryable.Row[Q13, R13], q14: Queryable.Row[Q14, R14], q15: Queryable.Row[Q15, R15]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels(), q9.walkLabels(), q10.walkLabels(), q11.walkLabels(), q12.walkLabels(), q13.walkLabels(), q14.walkLabels(), q15.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8), q9.walkExprs(t._9), q10.walkExprs(t._10), q11.walkExprs(t._11), q12.walkExprs(t._12), q13.walkExprs(t._13), q14.walkExprs(t._14), q15.walkExprs(t._15)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi), q9.construct(rsi), q10.construct(rsi), q11.construct(rsi), q12.construct(rsi), q13.construct(rsi), q14.construct(rsi), q15.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8), q9.deconstruct(is._9), q10.deconstruct(is._10), q11.deconstruct(is._11), q12.deconstruct(is._12), q13.deconstruct(is._13), q14.deconstruct(is._14), q15.deconstruct(is._15)) }
  )
}
implicit def Tuple16Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7], q8: Queryable.Row[Q8, R8], q9: Queryable.Row[Q9, R9], q10: Queryable.Row[Q10, R10], q11: Queryable.Row[Q11, R11], q12: Queryable.Row[Q12, R12], q13: Queryable.Row[Q13, R13], q14: Queryable.Row[Q14, R14], q15: Queryable.Row[Q15, R15], q16: Queryable.Row[Q16, R16]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels(), q9.walkLabels(), q10.walkLabels(), q11.walkLabels(), q12.walkLabels(), q13.walkLabels(), q14.walkLabels(), q15.walkLabels(), q16.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8), q9.walkExprs(t._9), q10.walkExprs(t._10), q11.walkExprs(t._11), q12.walkExprs(t._12), q13.walkExprs(t._13), q14.walkExprs(t._14), q15.walkExprs(t._15), q16.walkExprs(t._16)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi), q9.construct(rsi), q10.construct(rsi), q11.construct(rsi), q12.construct(rsi), q13.construct(rsi), q14.construct(rsi), q15.construct(rsi), q16.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8), q9.deconstruct(is._9), q10.deconstruct(is._10), q11.deconstruct(is._11), q12.deconstruct(is._12), q13.deconstruct(is._13), q14.deconstruct(is._14), q15.deconstruct(is._15), q16.deconstruct(is._16)) }
  )
}
implicit def Tuple17Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7], q8: Queryable.Row[Q8, R8], q9: Queryable.Row[Q9, R9], q10: Queryable.Row[Q10, R10], q11: Queryable.Row[Q11, R11], q12: Queryable.Row[Q12, R12], q13: Queryable.Row[Q13, R13], q14: Queryable.Row[Q14, R14], q15: Queryable.Row[Q15, R15], q16: Queryable.Row[Q16, R16], q17: Queryable.Row[Q17, R17]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels(), q9.walkLabels(), q10.walkLabels(), q11.walkLabels(), q12.walkLabels(), q13.walkLabels(), q14.walkLabels(), q15.walkLabels(), q16.walkLabels(), q17.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8), q9.walkExprs(t._9), q10.walkExprs(t._10), q11.walkExprs(t._11), q12.walkExprs(t._12), q13.walkExprs(t._13), q14.walkExprs(t._14), q15.walkExprs(t._15), q16.walkExprs(t._16), q17.walkExprs(t._17)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi), q9.construct(rsi), q10.construct(rsi), q11.construct(rsi), q12.construct(rsi), q13.construct(rsi), q14.construct(rsi), q15.construct(rsi), q16.construct(rsi), q17.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8), q9.deconstruct(is._9), q10.deconstruct(is._10), q11.deconstruct(is._11), q12.deconstruct(is._12), q13.deconstruct(is._13), q14.deconstruct(is._14), q15.deconstruct(is._15), q16.deconstruct(is._16), q17.deconstruct(is._17)) }
  )
}
implicit def Tuple18Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7], q8: Queryable.Row[Q8, R8], q9: Queryable.Row[Q9, R9], q10: Queryable.Row[Q10, R10], q11: Queryable.Row[Q11, R11], q12: Queryable.Row[Q12, R12], q13: Queryable.Row[Q13, R13], q14: Queryable.Row[Q14, R14], q15: Queryable.Row[Q15, R15], q16: Queryable.Row[Q16, R16], q17: Queryable.Row[Q17, R17], q18: Queryable.Row[Q18, R18]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels(), q9.walkLabels(), q10.walkLabels(), q11.walkLabels(), q12.walkLabels(), q13.walkLabels(), q14.walkLabels(), q15.walkLabels(), q16.walkLabels(), q17.walkLabels(), q18.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8), q9.walkExprs(t._9), q10.walkExprs(t._10), q11.walkExprs(t._11), q12.walkExprs(t._12), q13.walkExprs(t._13), q14.walkExprs(t._14), q15.walkExprs(t._15), q16.walkExprs(t._16), q17.walkExprs(t._17), q18.walkExprs(t._18)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi), q9.construct(rsi), q10.construct(rsi), q11.construct(rsi), q12.construct(rsi), q13.construct(rsi), q14.construct(rsi), q15.construct(rsi), q16.construct(rsi), q17.construct(rsi), q18.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8), q9.deconstruct(is._9), q10.deconstruct(is._10), q11.deconstruct(is._11), q12.deconstruct(is._12), q13.deconstruct(is._13), q14.deconstruct(is._14), q15.deconstruct(is._15), q16.deconstruct(is._16), q17.deconstruct(is._17), q18.deconstruct(is._18)) }
  )
}
implicit def Tuple19Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7], q8: Queryable.Row[Q8, R8], q9: Queryable.Row[Q9, R9], q10: Queryable.Row[Q10, R10], q11: Queryable.Row[Q11, R11], q12: Queryable.Row[Q12, R12], q13: Queryable.Row[Q13, R13], q14: Queryable.Row[Q14, R14], q15: Queryable.Row[Q15, R15], q16: Queryable.Row[Q16, R16], q17: Queryable.Row[Q17, R17], q18: Queryable.Row[Q18, R18], q19: Queryable.Row[Q19, R19]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels(), q9.walkLabels(), q10.walkLabels(), q11.walkLabels(), q12.walkLabels(), q13.walkLabels(), q14.walkLabels(), q15.walkLabels(), q16.walkLabels(), q17.walkLabels(), q18.walkLabels(), q19.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8), q9.walkExprs(t._9), q10.walkExprs(t._10), q11.walkExprs(t._11), q12.walkExprs(t._12), q13.walkExprs(t._13), q14.walkExprs(t._14), q15.walkExprs(t._15), q16.walkExprs(t._16), q17.walkExprs(t._17), q18.walkExprs(t._18), q19.walkExprs(t._19)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi), q9.construct(rsi), q10.construct(rsi), q11.construct(rsi), q12.construct(rsi), q13.construct(rsi), q14.construct(rsi), q15.construct(rsi), q16.construct(rsi), q17.construct(rsi), q18.construct(rsi), q19.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8), q9.deconstruct(is._9), q10.deconstruct(is._10), q11.deconstruct(is._11), q12.deconstruct(is._12), q13.deconstruct(is._13), q14.deconstruct(is._14), q15.deconstruct(is._15), q16.deconstruct(is._16), q17.deconstruct(is._17), q18.deconstruct(is._18), q19.deconstruct(is._19)) }
  )
}
implicit def Tuple20Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7], q8: Queryable.Row[Q8, R8], q9: Queryable.Row[Q9, R9], q10: Queryable.Row[Q10, R10], q11: Queryable.Row[Q11, R11], q12: Queryable.Row[Q12, R12], q13: Queryable.Row[Q13, R13], q14: Queryable.Row[Q14, R14], q15: Queryable.Row[Q15, R15], q16: Queryable.Row[Q16, R16], q17: Queryable.Row[Q17, R17], q18: Queryable.Row[Q18, R18], q19: Queryable.Row[Q19, R19], q20: Queryable.Row[Q20, R20]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels(), q9.walkLabels(), q10.walkLabels(), q11.walkLabels(), q12.walkLabels(), q13.walkLabels(), q14.walkLabels(), q15.walkLabels(), q16.walkLabels(), q17.walkLabels(), q18.walkLabels(), q19.walkLabels(), q20.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8), q9.walkExprs(t._9), q10.walkExprs(t._10), q11.walkExprs(t._11), q12.walkExprs(t._12), q13.walkExprs(t._13), q14.walkExprs(t._14), q15.walkExprs(t._15), q16.walkExprs(t._16), q17.walkExprs(t._17), q18.walkExprs(t._18), q19.walkExprs(t._19), q20.walkExprs(t._20)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi), q9.construct(rsi), q10.construct(rsi), q11.construct(rsi), q12.construct(rsi), q13.construct(rsi), q14.construct(rsi), q15.construct(rsi), q16.construct(rsi), q17.construct(rsi), q18.construct(rsi), q19.construct(rsi), q20.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8), q9.deconstruct(is._9), q10.deconstruct(is._10), q11.deconstruct(is._11), q12.deconstruct(is._12), q13.deconstruct(is._13), q14.deconstruct(is._14), q15.deconstruct(is._15), q16.deconstruct(is._16), q17.deconstruct(is._17), q18.deconstruct(is._18), q19.deconstruct(is._19), q20.deconstruct(is._20)) }
  )
}
implicit def Tuple21Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, Q21, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20, R21](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7], q8: Queryable.Row[Q8, R8], q9: Queryable.Row[Q9, R9], q10: Queryable.Row[Q10, R10], q11: Queryable.Row[Q11, R11], q12: Queryable.Row[Q12, R12], q13: Queryable.Row[Q13, R13], q14: Queryable.Row[Q14, R14], q15: Queryable.Row[Q15, R15], q16: Queryable.Row[Q16, R16], q17: Queryable.Row[Q17, R17], q18: Queryable.Row[Q18, R18], q19: Queryable.Row[Q19, R19], q20: Queryable.Row[Q20, R20], q21: Queryable.Row[Q21, R21]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, Q21), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20, R21)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels(), q9.walkLabels(), q10.walkLabels(), q11.walkLabels(), q12.walkLabels(), q13.walkLabels(), q14.walkLabels(), q15.walkLabels(), q16.walkLabels(), q17.walkLabels(), q18.walkLabels(), q19.walkLabels(), q20.walkLabels(), q21.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8), q9.walkExprs(t._9), q10.walkExprs(t._10), q11.walkExprs(t._11), q12.walkExprs(t._12), q13.walkExprs(t._13), q14.walkExprs(t._14), q15.walkExprs(t._15), q16.walkExprs(t._16), q17.walkExprs(t._17), q18.walkExprs(t._18), q19.walkExprs(t._19), q20.walkExprs(t._20), q21.walkExprs(t._21)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi), q9.construct(rsi), q10.construct(rsi), q11.construct(rsi), q12.construct(rsi), q13.construct(rsi), q14.construct(rsi), q15.construct(rsi), q16.construct(rsi), q17.construct(rsi), q18.construct(rsi), q19.construct(rsi), q20.construct(rsi), q21.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8), q9.deconstruct(is._9), q10.deconstruct(is._10), q11.deconstruct(is._11), q12.deconstruct(is._12), q13.deconstruct(is._13), q14.deconstruct(is._14), q15.deconstruct(is._15), q16.deconstruct(is._16), q17.deconstruct(is._17), q18.deconstruct(is._18), q19.deconstruct(is._19), q20.deconstruct(is._20), q21.deconstruct(is._21)) }
  )
}
implicit def Tuple22Queryable[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, Q21, Q22, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20, R21, R22](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2], q3: Queryable.Row[Q3, R3], q4: Queryable.Row[Q4, R4], q5: Queryable.Row[Q5, R5], q6: Queryable.Row[Q6, R6], q7: Queryable.Row[Q7, R7], q8: Queryable.Row[Q8, R8], q9: Queryable.Row[Q9, R9], q10: Queryable.Row[Q10, R10], q11: Queryable.Row[Q11, R11], q12: Queryable.Row[Q12, R12], q13: Queryable.Row[Q13, R13], q14: Queryable.Row[Q14, R14], q15: Queryable.Row[Q15, R15], q16: Queryable.Row[Q16, R16], q17: Queryable.Row[Q17, R17], q18: Queryable.Row[Q18, R18], q19: Queryable.Row[Q19, R19], q20: Queryable.Row[Q20, R20], q21: Queryable.Row[Q21, R21], q22: Queryable.Row[Q22, R22]
): Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, Q21, Q22), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20, R21, R22)] = {
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels(), q9.walkLabels(), q10.walkLabels(), q11.walkLabels(), q12.walkLabels(), q13.walkLabels(), q14.walkLabels(), q15.walkLabels(), q16.walkLabels(), q17.walkLabels(), q18.walkLabels(), q19.walkLabels(), q20.walkLabels(), q21.walkLabels(), q22.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8), q9.walkExprs(t._9), q10.walkExprs(t._10), q11.walkExprs(t._11), q12.walkExprs(t._12), q13.walkExprs(t._13), q14.walkExprs(t._14), q15.walkExprs(t._15), q16.walkExprs(t._16), q17.walkExprs(t._17), q18.walkExprs(t._18), q19.walkExprs(t._19), q20.walkExprs(t._20), q21.walkExprs(t._21), q22.walkExprs(t._22)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi), q9.construct(rsi), q10.construct(rsi), q11.construct(rsi), q12.construct(rsi), q13.construct(rsi), q14.construct(rsi), q15.construct(rsi), q16.construct(rsi), q17.construct(rsi), q18.construct(rsi), q19.construct(rsi), q20.construct(rsi), q21.construct(rsi), q22.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8), q9.deconstruct(is._9), q10.deconstruct(is._10), q11.deconstruct(is._11), q12.deconstruct(is._12), q13.deconstruct(is._13), q14.deconstruct(is._14), q15.deconstruct(is._15), q16.deconstruct(is._16), q17.deconstruct(is._17), q18.deconstruct(is._18), q19.deconstruct(is._19), q20.deconstruct(is._20), q21.deconstruct(is._21), q22.deconstruct(is._22)) }
  )
}
}
