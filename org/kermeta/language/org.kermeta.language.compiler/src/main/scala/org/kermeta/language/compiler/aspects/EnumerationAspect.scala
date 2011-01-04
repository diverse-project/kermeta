package org.kermeta.language.compiler.aspects

import scala.collection.JavaConversions._
import org.kermeta.language.compiler.TypeEquivalence
import org.kermeta.language.compiler.Util
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.RichAspectImplicit._

trait EnumerationAspect extends ObjectAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		if (!Util.hasEcoreTag(this)){
                  	//res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[PackageAspect].getQualifiedName)+"."+this.getName())
			res.append("_root_."+TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[PackageAspect].getQualifiedName)+"."+this.getName()+"."+this.getName())
		}else{
			res.append("_root_."+TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[PackageAspect].getQualifiedName)+"."+this.getName())	
		}
	}
	
	def generateEnum():Unit = {
		
		if (!Util.hasEcoreTag(this)){
			var res : StringBuilder = new StringBuilder
			res.append("package "+TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[PackageAspect].getQualifiedName)+"\n")
			res.append("import kermeta.io._\n")			
			res.append("import kermeta.standard._\n")
			res.append("import kermeta.standard.JavaConversions._\n")
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
			Util.generateFile(TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[Package].getQualifiedName), this.getName, res.toString())			
		}

	}
	
	override def getQualifiedNameCompilo():String ={
		return this.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo() + "."+ this.getName();
	  
	}

}
