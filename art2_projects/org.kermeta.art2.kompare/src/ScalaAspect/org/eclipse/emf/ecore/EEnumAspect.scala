package ScalaAspect.org.eclipse.emf.ecore
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait EEnumAspect extends ScalaAspect.org.eclipse.emf.ecore.EDataTypeAspect with fr.irisa.triskell.kermeta.language.structureScalaAspect.aspect.ObjectAspect with org.eclipse.emf.ecore.EEnum{
def ScalaeLiterals : java.util.List[_root_.org.eclipse.emf.ecore.EEnumLiteral]={this.getELiterals()}.asInstanceOf[java.util.List[_root_.org.eclipse.emf.ecore.EEnumLiteral]]
def ScalaeLiterals_=(value : java.util.List[_root_.org.eclipse.emf.ecore.EEnumLiteral])={this.getELiterals().clear
this.getELiterals().addAll(value)
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("ecore.EEnum"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

