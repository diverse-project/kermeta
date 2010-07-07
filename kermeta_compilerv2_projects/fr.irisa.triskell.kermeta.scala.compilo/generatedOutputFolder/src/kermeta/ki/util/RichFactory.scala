package kermeta.ki.util
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
object RichFactory{
 def createSourcePrinter : kermeta.ki.util.SourcePrinter = { new kermeta.ki.util.RichSourcePrinter }
 def createKermetaExpressionPrinter : kermeta.ki.util.KermetaExpressionPrinter = { new kermeta.ki.util.RichKermetaExpressionPrinter }
 def createJavaExpressionPrinter : kermeta.ki.util.JavaExpressionPrinter = { new kermeta.ki.util.RichJavaExpressionPrinter }
}

