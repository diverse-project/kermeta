package org.kermeta.artKomparator
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
object RichFactory{
 def createLauncher : org.kermeta.artKomparator.Launcher = { new org.kermeta.artKomparator.RichLauncher }
}

