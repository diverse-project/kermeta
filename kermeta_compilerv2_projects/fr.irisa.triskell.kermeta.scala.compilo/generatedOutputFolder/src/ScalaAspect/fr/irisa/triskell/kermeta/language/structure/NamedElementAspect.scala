package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait NamedElementAspect extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.NamedElement{
def Scalaname : java.lang.String={this.getName()}.asInstanceOf[java.lang.String]
def Scalaname_=(value : java.lang.String)={this.setName(value)}

    def qualifiedName():java.lang.String = {
var result : java.lang.String = null.asInstanceOf[java.lang.String]; 


{
var elem : _root_.fr.irisa.triskell.kermeta.language.structure.NamedElement = this;
result = (this).Scalaname;
if (((elem).container()).isInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.NamedElement])

{


{try{
elem = (elem).container().asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.NamedElement];
}catch { case e:ClassCastException => {}}

while (!(((elem) == (null))))


{
result = (((elem).Scalaname).plus("::")).plus(result);
if (((elem).container()).isInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.NamedElement])

{
try{
elem = (elem).container().asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.NamedElement];
}catch { case e:ClassCastException => {}}
}
else 


{
elem = null.asInstanceOf[_root_.fr.irisa.triskell.kermeta.language.structure.NamedElement];}
}
}}
}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.NamedElement"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

