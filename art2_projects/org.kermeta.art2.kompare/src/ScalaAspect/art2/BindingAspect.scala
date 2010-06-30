package ScalaAspect.art2
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait BindingAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with art2.Binding{
def Scalaports : java.util.List[_root_.art2.Port]={this.getPorts()}.asInstanceOf[java.util.List[_root_.art2.Port]]
def Scalaports_=(value : java.util.List[_root_.art2.Port])={this.getPorts().clear
this.getPorts().addAll(value)
}

    def isEquals(ct : _root_.art2.Binding):java.lang.Boolean = {
var result : java.lang.Boolean = null.asInstanceOf[java.lang.Boolean]; 


{
result = true;
((this).Scalaports).each({(p)=>

{
if ((((ct).Scalaports).exists({(p2)=>

{
(p).isEquals(p2)}
})).not())

{
result = false;}
}
})}
 return result
}

    def isUsingPort(p : _root_.art2.Port):java.lang.Boolean = {
var result : java.lang.Boolean = null.asInstanceOf[java.lang.Boolean]; 


{
result = false;
((this).Scalaports).each({(op)=>

{
if ((p).isEquals(op))

{
result = true;}
}
})}
 return result
}

    def opositePort(p : _root_.art2.Port):_root_.art2.Port = {
var result : _root_.art2.Port = null.asInstanceOf[_root_.art2.Port]; 


{
if (isUsingPort(p))

{
((this).Scalaports).each({(op)=>

{
if (((p).isEquals(op)).not())

{
result = op;}
}
})}
}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("art2.Binding"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

