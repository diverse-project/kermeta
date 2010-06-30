package ScalaAspect.org.eclipse.emf.ecore
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait EParameterAspect extends ScalaAspect.org.eclipse.emf.ecore.ETypedElementAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with org.eclipse.emf.ecore.EParameter{
def ScalaeOperation : _root_.org.eclipse.emf.ecore.EOperation={this.getEOperation()}.asInstanceOf[_root_.org.eclipse.emf.ecore.EOperation]
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("ecore.EParameter"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

