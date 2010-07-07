package ScalaAspect.fr.irisa.triskell.kermeta.language.structure
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ObjectAspect extends fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with fr.irisa.triskell.kermeta.language.structure.Object{
def Scalatag : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Tag]={this.getTag()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Tag]]
def Scalatag_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Tag])={this.getTag().clear
this.getTag().addAll(value)
}
def ScalaownedTags : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Tag]={this.getOwnedTags()}.asInstanceOf[java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Tag]]
def ScalaownedTags_=(value : java.util.List[_root_.fr.irisa.triskell.kermeta.language.structure.Tag])={this.getOwnedTags().clear
this.getOwnedTags().addAll(value)
}

    def isKindOf(cl : _root_.fr.irisa.triskell.kermeta.language.structure.Class):Boolean = {
var result : Boolean = null.asInstanceOf[Boolean]; 


{
result = (((this).getMetaClass()) == (cl));}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("kermeta.language.structure.Object"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

