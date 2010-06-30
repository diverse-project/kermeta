package org.kermeta.komparator
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
object RichFactory{
 def createKomparator : org.kermeta.komparator.Komparator = { new org.kermeta.komparator.RichKomparator }
}

