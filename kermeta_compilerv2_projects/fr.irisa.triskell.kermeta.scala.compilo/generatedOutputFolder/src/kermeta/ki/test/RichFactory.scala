package kermeta.ki.test
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
object RichFactory{
 def createTestFouquetsParser : kermeta.ki.test.TestFouquetsParser = { new kermeta.ki.test.RichTestFouquetsParser }
}

