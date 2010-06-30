package org.kermeta.art.generator
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
import kermeta.standard.PrimitiveConversion._
import kermeta.kunit.KunitConversions._
import ScalaImplicit.org.kermeta.org.kermeta.default.aspects.ImplicitConversion._
trait FeatureGeneratorAspect  extends ScalaAspect.fr.irisa.triskell.kermeta.language.structure.ObjectAspect with org.kermeta.art.generator.FeatureGenerator{

    def generate(cpt : _root_.art2.DeployUnit):_root_.java.lang.String = {
var result : _root_.java.lang.String = null.asInstanceOf[_root_.java.lang.String]; 


{
var `_res` : _root_.scala.StringBuilder = kermeta.utils.RichFactory.createStringBuffer;
(`_res`).append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<!-- Powered by KET: Kermeta Emitter Template. See http://www.kermeta.org -->\n<features>\n<feature name=\"")
(`_res`).append((cpt).Scalaname)
(`_res`).append("\" version=\"")
(`_res`).append((cpt).Scalaversion)
(`_res`).append("\"> \n\t<bundle>mvn:")
(`_res`).append((cpt).ScalagroupName)
(`_res`).append("/")
(`_res`).append((cpt).ScalaunitName)
(`_res`).append("/")
(`_res`).append((cpt).Scalaversion)
(`_res`).append("</bundle> \n</feature>\n</features>")
result = ((`_res`)+"");}
 return result
}
override def getMetaClass():fr.irisa.triskell.kermeta.language.structure.Class={
 var cd : fr.irisa.triskell.kermeta.language.structure.ClassDefinition =   kermeta.utils.ReflexivityLoader.getMetaClass("org.kermeta.art.generator.FeatureGenerator"); 
         if (cd !=null){ 
 var cl = ScalaAspect.fr.irisa.triskell.kermeta.language.structure.RichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

