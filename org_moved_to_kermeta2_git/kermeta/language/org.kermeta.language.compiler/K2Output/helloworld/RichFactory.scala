package helloworld
import ScalaImplicit.generated.ImplicitConversion._
object RichFactory{
 def createHelloWorld : helloworld.HelloWorld = { new helloworld.RichHelloWorld }
}

