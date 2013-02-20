package org.kermeta.language.compiler.aspects.sub


import scala.collection.JavaConversions._
import org.kermeta.language.compiler.TypeEquivalence
import org.kermeta.language.compiler.Util
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.aspects.ImplicitAspects._

trait EnumerationAspect extends ObjectAspect {

  lazy val  EnumerationAspect_self = self.asInstanceOf[Enumeration]

  override def generateScalaCode(res : StringBuilder) : Unit = {
    if (!Util.hasEcoreTag(EnumerationAspect_self)){
      //res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[PackageAspect].getQualifiedName)+"."+this.getName())
      res.append("_root_."+TypeEquivalence.getPackageEquivalence(EnumerationAspect_self.eContainer().asInstanceOf[PackageAspect].getQualifiedName)+"."+EnumerationAspect_self.getName()+"."+EnumerationAspect_self.getName())
    }else{
      res.append("_root_."+TypeEquivalence.getPackageEquivalence(EnumerationAspect_self.eContainer().asInstanceOf[PackageAspect].getQualifiedName)+"."+EnumerationAspect_self.getName())
    }
  }
	
  def generateEnum():Unit = {
		
    if (!Util.hasEcoreTag(EnumerationAspect_self)){
      var res : StringBuilder = new StringBuilder
      res.append("package "+TypeEquivalence.getPackageEquivalence(EnumerationAspect_self.eContainer().asInstanceOf[PackageAspect].getQualifiedName)+"\n")
      res.append("import kermeta.io._\n")
      res.append("import kermeta.standard._\n")
      res.append("import kermeta.standard.JavaConversions._\n")
      res append "object "+EnumerationAspect_self.getName()+" extends Enumeration {\n"
      res append "type "+EnumerationAspect_self.getName()+" = Value\n"
      res append "val "
      var i =0
      EnumerationAspect_self.getOwnedLiteral().foreach{e=>
        if (i!=0) res.append(",")
        res.append(Util.protectScalaKeyword(e.getName()))
        i=i+1
      }
      res append " = Value\n"+"}"
      Util.generateFile(TypeEquivalence.getPackageEquivalence(EnumerationAspect_self.eContainer().asInstanceOf[Package].getQualifiedName), EnumerationAspect_self.getName, res.toString())
    }

  }
	
  override def getQualifiedNameCompilo():String ={
    return EnumerationAspect_self.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo() + "."+ EnumerationAspect_self.getName();
	  
  }

}
case class RichEnumeration(_self : Enumeration) extends EnumerationAspect { self = _self  }