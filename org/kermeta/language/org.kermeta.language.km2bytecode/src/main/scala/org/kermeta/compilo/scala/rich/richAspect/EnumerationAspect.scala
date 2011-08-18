package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import _root_.java.util._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait EnumerationAspect extends KermetaModelElementAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		if (!Util.hasEcoreTag(this)){
                  	//res.append(k2.utils.TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[PackageAspect].getQualifiedName)+"."+this.getName())
			res.append("_root_."+_root_.k2.utils.TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[PackageAspect].getQualifiedName)+"."+this.getName()+"."+this.getName())
		}else{
			res.append("_root_."+_root_.k2.utils.TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[PackageAspect].getQualifiedName)+"."+this.getName())
		}
	}
	
	def generateEnum():Unit = {
		
		if (!Util.hasEcoreTag(this)){
			var res : StringBuilder = new StringBuilder
			res.append("package "+_root_.k2.utils.TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[PackageAspect].getQualifiedName)+"\n")
			res.append("import k2.io._\n")
			res.append("import k2.standard._\n")
			res.append("import k2.standard.JavaConversions._\n")
			res append "object "+this.getName()+" extends Enumeration {\n"
			res append "type "+this.getName()+" = Value\n"
			res append "val "
			var i =0
			this.getOwnedLiteral().foreach{e=> 
			if (i!=0) res.append(",")	
				res.append(Util.protectScalaKeyword(e.getName()))
				i=i+1
			}
			res append " = Value\n"+"}"
			Util.generateFile(_root_.k2.utils.TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[Package].getQualifiedName), this.getName, res.toString())
		}

	}
	
	override def getQualifiedNameCompilo():String ={
		return Util.protectScalaKeyword(this.eContainer().asInstanceOf[KermetaModelElementAspect].getQualifiedNameCompilo() + "."+ this.getName());
	  
	}

}
