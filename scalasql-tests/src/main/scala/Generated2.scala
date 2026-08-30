package scalasql.generated
import scalasql.core.{Queryable, Expr}
import scalasql.query.Column
trait Insert[V[_[_]], R]{
  def batched[T1, T2](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2])(
    items: (Expr[T1], Expr[T2])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3])(
    items: (Expr[T1], Expr[T2], Expr[T3])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7, T8](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15], f16: V[Column] => Column[T16])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15], Expr[T16])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15], f16: V[Column] => Column[T16], f17: V[Column] => Column[T17])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15], Expr[T16], Expr[T17])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15], f16: V[Column] => Column[T16], f17: V[Column] => Column[T17], f18: V[Column] => Column[T18])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15], Expr[T16], Expr[T17], Expr[T18])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15], f16: V[Column] => Column[T16], f17: V[Column] => Column[T17], f18: V[Column] => Column[T18], f19: V[Column] => Column[T19])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15], Expr[T16], Expr[T17], Expr[T18], Expr[T19])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15], f16: V[Column] => Column[T16], f17: V[Column] => Column[T17], f18: V[Column] => Column[T18], f19: V[Column] => Column[T19], f20: V[Column] => Column[T20])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15], Expr[T16], Expr[T17], Expr[T18], Expr[T19], Expr[T20])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15], f16: V[Column] => Column[T16], f17: V[Column] => Column[T17], f18: V[Column] => Column[T18], f19: V[Column] => Column[T19], f20: V[Column] => Column[T20], f21: V[Column] => Column[T21])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15], Expr[T16], Expr[T17], Expr[T18], Expr[T19], Expr[T20], Expr[T21])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15], f16: V[Column] => Column[T16], f17: V[Column] => Column[T17], f18: V[Column] => Column[T18], f19: V[Column] => Column[T19], f20: V[Column] => Column[T20], f21: V[Column] => Column[T21], f22: V[Column] => Column[T22])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15], Expr[T16], Expr[T17], Expr[T18], Expr[T19], Expr[T20], Expr[T21], Expr[T22])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] 
}
trait InsertImpl[V[_[_]], R] extends Insert[V, R]{ this: scalasql.query.Insert[V, R] =>
  def newInsertValues[R](
        insert: scalasql.query.Insert[V, R],
        columns: Seq[Column[_]],
        valuesLists: Seq[Seq[Expr[_]]]
    )(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R]
  def batched[T1, T2](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2])(
    items: (Expr[T1], Expr[T2])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2))
      )


def batched[T1, T2, T3](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3])(
    items: (Expr[T1], Expr[T2], Expr[T3])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3))
      )


def batched[T1, T2, T3, T4](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4))
      )


def batched[T1, T2, T3, T4, T5](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5))
      )


def batched[T1, T2, T3, T4, T5, T6](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6))
      )


def batched[T1, T2, T3, T4, T5, T6, T7](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7))
      )


def batched[T1, T2, T3, T4, T5, T6, T7, T8](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr), f8(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8))
      )


def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr), f8(expr), f9(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9))
      )


def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr), f8(expr), f9(expr), f10(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10))
      )


def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr), f8(expr), f9(expr), f10(expr), f11(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11))
      )


def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr), f8(expr), f9(expr), f10(expr), f11(expr), f12(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12))
      )


def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr), f8(expr), f9(expr), f10(expr), f11(expr), f12(expr), f13(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13))
      )


def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr), f8(expr), f9(expr), f10(expr), f11(expr), f12(expr), f13(expr), f14(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14))
      )


def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr), f8(expr), f9(expr), f10(expr), f11(expr), f12(expr), f13(expr), f14(expr), f15(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15))
      )


def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15], f16: V[Column] => Column[T16])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15], Expr[T16])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr), f8(expr), f9(expr), f10(expr), f11(expr), f12(expr), f13(expr), f14(expr), f15(expr), f16(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16))
      )


def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15], f16: V[Column] => Column[T16], f17: V[Column] => Column[T17])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15], Expr[T16], Expr[T17])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr), f8(expr), f9(expr), f10(expr), f11(expr), f12(expr), f13(expr), f14(expr), f15(expr), f16(expr), f17(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17))
      )


def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15], f16: V[Column] => Column[T16], f17: V[Column] => Column[T17], f18: V[Column] => Column[T18])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15], Expr[T16], Expr[T17], Expr[T18])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr), f8(expr), f9(expr), f10(expr), f11(expr), f12(expr), f13(expr), f14(expr), f15(expr), f16(expr), f17(expr), f18(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18))
      )


def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15], f16: V[Column] => Column[T16], f17: V[Column] => Column[T17], f18: V[Column] => Column[T18], f19: V[Column] => Column[T19])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15], Expr[T16], Expr[T17], Expr[T18], Expr[T19])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr), f8(expr), f9(expr), f10(expr), f11(expr), f12(expr), f13(expr), f14(expr), f15(expr), f16(expr), f17(expr), f18(expr), f19(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19))
      )


def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15], f16: V[Column] => Column[T16], f17: V[Column] => Column[T17], f18: V[Column] => Column[T18], f19: V[Column] => Column[T19], f20: V[Column] => Column[T20])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15], Expr[T16], Expr[T17], Expr[T18], Expr[T19], Expr[T20])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr), f8(expr), f9(expr), f10(expr), f11(expr), f12(expr), f13(expr), f14(expr), f15(expr), f16(expr), f17(expr), f18(expr), f19(expr), f20(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19, t._20))
      )


def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15], f16: V[Column] => Column[T16], f17: V[Column] => Column[T17], f18: V[Column] => Column[T18], f19: V[Column] => Column[T19], f20: V[Column] => Column[T20], f21: V[Column] => Column[T21])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15], Expr[T16], Expr[T17], Expr[T18], Expr[T19], Expr[T20], Expr[T21])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr), f8(expr), f9(expr), f10(expr), f11(expr), f12(expr), f13(expr), f14(expr), f15(expr), f16(expr), f17(expr), f18(expr), f19(expr), f20(expr), f21(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19, t._20, t._21))
      )


def batched[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22](f1: V[Column] => Column[T1], f2: V[Column] => Column[T2], f3: V[Column] => Column[T3], f4: V[Column] => Column[T4], f5: V[Column] => Column[T5], f6: V[Column] => Column[T6], f7: V[Column] => Column[T7], f8: V[Column] => Column[T8], f9: V[Column] => Column[T9], f10: V[Column] => Column[T10], f11: V[Column] => Column[T11], f12: V[Column] => Column[T12], f13: V[Column] => Column[T13], f14: V[Column] => Column[T14], f15: V[Column] => Column[T15], f16: V[Column] => Column[T16], f17: V[Column] => Column[T17], f18: V[Column] => Column[T18], f19: V[Column] => Column[T19], f20: V[Column] => Column[T20], f21: V[Column] => Column[T21], f22: V[Column] => Column[T22])(
    items: (Expr[T1], Expr[T2], Expr[T3], Expr[T4], Expr[T5], Expr[T6], Expr[T7], Expr[T8], Expr[T9], Expr[T10], Expr[T11], Expr[T12], Expr[T13], Expr[T14], Expr[T15], Expr[T16], Expr[T17], Expr[T18], Expr[T19], Expr[T20], Expr[T21], Expr[T22])*
)(implicit qr: Queryable[V[Column], R]): scalasql.query.InsertColumns[V, R] = newInsertValues(
        this,
        columns = Seq(f1(expr), f2(expr), f3(expr), f4(expr), f5(expr), f6(expr), f7(expr), f8(expr), f9(expr), f10(expr), f11(expr), f12(expr), f13(expr), f14(expr), f15(expr), f16(expr), f17(expr), f18(expr), f19(expr), f20(expr), f21(expr), f22(expr)),
        valuesLists = items.map(t => Seq(t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19, t._20, t._21, t._22))
      )


}

trait QueryableRow{
  implicit def Tuple2Queryable[Q1, Q2, R1, R2](
    implicit
    q1: Queryable.Row[Q1, R1], q2: Queryable.Row[Q2, R2]
): Queryable.Row[(Q1, Q2), (R1, R2)] = {
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
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
  import scalasql.core.SqlStr.SqlStringSyntax
  new Queryable.Row.TupleNQueryable(
    Seq(q1.walkLabels(), q2.walkLabels(), q3.walkLabels(), q4.walkLabels(), q5.walkLabels(), q6.walkLabels(), q7.walkLabels(), q8.walkLabels(), q9.walkLabels(), q10.walkLabels(), q11.walkLabels(), q12.walkLabels(), q13.walkLabels(), q14.walkLabels(), q15.walkLabels(), q16.walkLabels(), q17.walkLabels(), q18.walkLabels(), q19.walkLabels(), q20.walkLabels(), q21.walkLabels(), q22.walkLabels()),
    t => Seq(q1.walkExprs(t._1), q2.walkExprs(t._2), q3.walkExprs(t._3), q4.walkExprs(t._4), q5.walkExprs(t._5), q6.walkExprs(t._6), q7.walkExprs(t._7), q8.walkExprs(t._8), q9.walkExprs(t._9), q10.walkExprs(t._10), q11.walkExprs(t._11), q12.walkExprs(t._12), q13.walkExprs(t._13), q14.walkExprs(t._14), q15.walkExprs(t._15), q16.walkExprs(t._16), q17.walkExprs(t._17), q18.walkExprs(t._18), q19.walkExprs(t._19), q20.walkExprs(t._20), q21.walkExprs(t._21), q22.walkExprs(t._22)),
    construct0 = rsi => (q1.construct(rsi), q2.construct(rsi), q3.construct(rsi), q4.construct(rsi), q5.construct(rsi), q6.construct(rsi), q7.construct(rsi), q8.construct(rsi), q9.construct(rsi), q10.construct(rsi), q11.construct(rsi), q12.construct(rsi), q13.construct(rsi), q14.construct(rsi), q15.construct(rsi), q16.construct(rsi), q17.construct(rsi), q18.construct(rsi), q19.construct(rsi), q20.construct(rsi), q21.construct(rsi), q22.construct(rsi)),
    deconstruct0 = { is => (q1.deconstruct(is._1), q2.deconstruct(is._2), q3.deconstruct(is._3), q4.deconstruct(is._4), q5.deconstruct(is._5), q6.deconstruct(is._6), q7.deconstruct(is._7), q8.deconstruct(is._8), q9.deconstruct(is._9), q10.deconstruct(is._10), q11.deconstruct(is._11), q12.deconstruct(is._12), q13.deconstruct(is._13), q14.deconstruct(is._14), q15.deconstruct(is._15), q16.deconstruct(is._16), q17.deconstruct(is._17), q18.deconstruct(is._18), q19.deconstruct(is._19), q20.deconstruct(is._20), q21.deconstruct(is._21), q22.deconstruct(is._22)) }
  )
}
}

trait JoinAppend extends scalasql.query.JoinAppendLowPriority{
  
implicit def append2[Q1, Q2, QA, R1, R2, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, QA), (R1, R2, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2), QA, (Q1, Q2, QA), (R1, R2, RA)] = new scalasql.query.JoinAppend[(Q1, Q2), QA, (Q1, Q2, QA), (R1, R2, RA)] {
    override def appendTuple(t: (Q1, Q2), v: QA): (Q1, Q2, QA) = (t._1, t._2, v)

    def qr: Queryable.Row[(Q1, Q2, QA), (R1, R2, RA)] = qr0
}

implicit def append3[Q1, Q2, Q3, QA, R1, R2, R3, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, QA), (R1, R2, R3, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3), QA, (Q1, Q2, Q3, QA), (R1, R2, R3, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3), QA, (Q1, Q2, Q3, QA), (R1, R2, R3, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3), v: QA): (Q1, Q2, Q3, QA) = (t._1, t._2, t._3, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, QA), (R1, R2, R3, RA)] = qr0
}

implicit def append4[Q1, Q2, Q3, Q4, QA, R1, R2, R3, R4, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, QA), (R1, R2, R3, R4, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4), QA, (Q1, Q2, Q3, Q4, QA), (R1, R2, R3, R4, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4), QA, (Q1, Q2, Q3, Q4, QA), (R1, R2, R3, R4, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4), v: QA): (Q1, Q2, Q3, Q4, QA) = (t._1, t._2, t._3, t._4, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, QA), (R1, R2, R3, R4, RA)] = qr0
}

implicit def append5[Q1, Q2, Q3, Q4, Q5, QA, R1, R2, R3, R4, R5, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, QA), (R1, R2, R3, R4, R5, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5), QA, (Q1, Q2, Q3, Q4, Q5, QA), (R1, R2, R3, R4, R5, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5), QA, (Q1, Q2, Q3, Q4, Q5, QA), (R1, R2, R3, R4, R5, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5), v: QA): (Q1, Q2, Q3, Q4, Q5, QA) = (t._1, t._2, t._3, t._4, t._5, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, QA), (R1, R2, R3, R4, R5, RA)] = qr0
}

implicit def append6[Q1, Q2, Q3, Q4, Q5, Q6, QA, R1, R2, R3, R4, R5, R6, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, QA), (R1, R2, R3, R4, R5, R6, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6), QA, (Q1, Q2, Q3, Q4, Q5, Q6, QA), (R1, R2, R3, R4, R5, R6, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6), QA, (Q1, Q2, Q3, Q4, Q5, Q6, QA), (R1, R2, R3, R4, R5, R6, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, QA), (R1, R2, R3, R4, R5, R6, RA)] = qr0
}

implicit def append7[Q1, Q2, Q3, Q4, Q5, Q6, Q7, QA, R1, R2, R3, R4, R5, R6, R7, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, QA), (R1, R2, R3, R4, R5, R6, R7, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, QA), (R1, R2, R3, R4, R5, R6, R7, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, QA), (R1, R2, R3, R4, R5, R6, R7, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6, Q7), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, Q7, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, QA), (R1, R2, R3, R4, R5, R6, R7, RA)] = qr0
}

implicit def append8[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, QA, R1, R2, R3, R4, R5, R6, R7, R8, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, QA), (R1, R2, R3, R4, R5, R6, R7, R8, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, QA), (R1, R2, R3, R4, R5, R6, R7, R8, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, QA), (R1, R2, R3, R4, R5, R6, R7, R8, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, QA), (R1, R2, R3, R4, R5, R6, R7, R8, RA)] = qr0
}

implicit def append9[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, QA, R1, R2, R3, R4, R5, R6, R7, R8, R9, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, RA)] = qr0
}

implicit def append10[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, QA, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, RA)] = qr0
}

implicit def append11[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, QA, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, RA)] = qr0
}

implicit def append12[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, QA, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, RA)] = qr0
}

implicit def append13[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, QA, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, RA)] = qr0
}

implicit def append14[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, QA, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, RA)] = qr0
}

implicit def append15[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, QA, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, RA)] = qr0
}

implicit def append16[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, QA, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, RA)] = qr0
}

implicit def append17[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, QA, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, RA)] = qr0
}

implicit def append18[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, QA, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, RA)] = qr0
}

implicit def append19[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, QA, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, RA)] = qr0
}

implicit def append20[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, QA, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19, t._20, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20, RA)] = qr0
}

implicit def append21[Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, Q21, QA, R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20, R21, RA](
      implicit qr0: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, Q21, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20, R21, RA)],
      qr20: Queryable.Row[QA, RA]): scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, Q21), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, Q21, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20, R21, RA)] = new scalasql.query.JoinAppend[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, Q21), QA, (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, Q21, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20, R21, RA)] {
    override def appendTuple(t: (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, Q21), v: QA): (Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, Q21, QA) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19, t._20, t._21, v)

    def qr: Queryable.Row[(Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10, Q11, Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19, Q20, Q21, QA), (R1, R2, R3, R4, R5, R6, R7, R8, R9, R10, R11, R12, R13, R14, R15, R16, R17, R18, R19, R20, R21, RA)] = qr0
}
}
