package kermeta.exception
import ScalaImplicit.generated.ImplicitConversion._
object RichFactory{
 def createNotImplementedException : kermeta.exception.NotImplementedException = { new kermeta.exception.RichNotImplementedException }
}

