package mainpackage
import ScalaImplicit.group.KermetaDoc.ImplicitConversion._
object KerRichFactory{
 def createMainClass() : mainpackage.MainClass = { new mainpackage.RichMainClass }
}

