package org.kermeta.language.compiler

object RichUtil {
	
	implicit def rich[A] (xs : Iterable[A]) = new RichIterable(xs)

}
