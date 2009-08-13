/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2009, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$

// generated by genprod on Wed Jun 17 14:10:05 PDT 2009

package scala


import Predef._

object Product1 {
  def unapply[T1](x: Product1[T1]): Option[Product1[T1]] =
    Some(x)
}

/** Product1 is a cartesian product of 1 component.
 *
 *  @since 2.3
 */
trait Product1[+T1] extends Product {
  /**
   *  The arity of this product.
   *  @return 1
   */
  override def productArity = 1

  /**
   *  Returns the n-th projection of this product if 0&lt;=n&lt;arity,
   *  otherwise null.
   *
   *  @param n number of the projection to be returned
   *  @return  same as _(n+1)
   *  @throws  IndexOutOfBoundsException
   */
  @throws(classOf[IndexOutOfBoundsException])
  override def productElement(n: Int) = n match {
    case 0 => _1
    case _ => throw new IndexOutOfBoundsException(n.toString())
 }

  /** projection of this product */
  def _1: T1



}
