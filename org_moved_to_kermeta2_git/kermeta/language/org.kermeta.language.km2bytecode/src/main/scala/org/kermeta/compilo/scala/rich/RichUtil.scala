package org.kermeta.compilo.scala.rich

object RichUtil {
	
	implicit def rich[A] (xs : Iterable[A]) = new RichIterable(xs)

}
