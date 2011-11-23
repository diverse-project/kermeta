package group.KermetaDoc.org.kermeta.language.behavior
import _root_.k2.io._
import _root_.k2.standard._
import _root_.k2.standard.JavaConversions._
import _root_.k2.standard.PrimitiveConversion._
import _root_.ScalaImplicit.group.KermetaDoc.ImplicitConversion._
trait BlockAspect extends group.KermetaDoc.org.kermeta.language.behavior.ExpressionAspect with `_root_`.org.kermeta.language.behavior.Block{
def Scalastatement : java.util.List[_root_.org.kermeta.language.behavior.Expression]={new RichKermetaList(this.getStatement())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.behavior.Expression]]
def Scalastatement_=(value : java.util.List[_root_.org.kermeta.language.behavior.Expression])={this.getStatement().clear
this.getStatement().addAll(value)
}
def ScalarescueBlock : java.util.List[_root_.org.kermeta.language.behavior.Rescue]={new RichKermetaList(this.getRescueBlock())}.asInstanceOf[java.util.List[_root_.org.kermeta.language.behavior.Rescue]]
def ScalarescueBlock_=(value : java.util.List[_root_.org.kermeta.language.behavior.Rescue])={this.getRescueBlock().clear
this.getRescueBlock().addAll(value)
}
override def getMetaClass():org.kermeta.language.structure.Class={
 var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass("org.kermeta.language.behavior.Block"); 
         if (cd !=null){ 
 var cl = group.KermetaDoc.org.kermeta.language.structure.KerRichFactory.createClass 
 cl.setTypeDefinition(cd) 
 return cl 
 }else 
 return null; 
 }
}

