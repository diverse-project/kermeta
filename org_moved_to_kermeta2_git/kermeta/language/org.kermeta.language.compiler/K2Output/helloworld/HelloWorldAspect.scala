package helloworld
import _root_.kermeta.io._
import _root_.kermeta.standard._
import _root_.kermeta.standard.JavaConversions._
import _root_.kermeta.standard.PrimitiveConversion._
import _root_.kermeta.kunit.KunitConversions._
import _root_.ScalaImplicit.generated.ImplicitConversion._
trait HelloWorldAspect with `_root_`{

    def main(): = {
var result :  = null.asInstanceOf[]; 


{
(/* TODO RichCallTypeLiteral */).writeln("Hello World!")
}
 return result
}

    def main(msg : ): = {
var result :  = null.asInstanceOf[]; 


{
(/* TODO RichCallTypeLiteral */).writeln(msg)
}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   _root_.kermeta.utils.ReflexivityLoader.getMetaClass("helloworld.HelloWorld"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

