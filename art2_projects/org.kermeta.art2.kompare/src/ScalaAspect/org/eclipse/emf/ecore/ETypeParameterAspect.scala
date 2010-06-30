package ScalaAspect.org.eclipse.emf.ecore
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait ETypeParameterAspect extends ScalaAspect.org.eclipse.emf.ecore.ENamedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with org.eclipse.emf.ecore.ETypeParameter{
def ScalaeBounds : java.util.List[_root_.org.eclipse.emf.ecore.EGenericType]={this.getEBounds()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EGenericType]]
def ScalaeBounds_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EGenericType])={this.getEBounds().clear
this.getEBounds().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("ecore.ETypeParameter"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

