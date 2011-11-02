package group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.org.kermeta.language.sample.callEcoreSample.ImplicitConversion._
trait PrimitiveTypeAspect extends group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.DataTypeAspect with `_root_`.org.kermeta.language.structure.PrimitiveType{
def ScalainstanceType : _root_.org.kermeta.language.structure.Type={this.getInstanceType()}.asInstanceOf[_root_.org.kermeta.language.structure.Type]
def ScalainstanceType_=(value : _root_.org.kermeta.language.structure.Type)={this.setInstanceType(value)}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.structure.PrimitiveType"); 
         if (cd !=null){ 
 var cl = group.org.kermeta.language.sample.callEcoreSample.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

