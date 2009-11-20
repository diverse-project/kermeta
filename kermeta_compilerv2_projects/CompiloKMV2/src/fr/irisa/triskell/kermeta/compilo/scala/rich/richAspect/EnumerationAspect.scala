package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._

trait EnumerationAspect extends EcoreRichAspectImplicit with ObjectAspect {
	
	override def generateScalaCode(res : StringBuilder) : Unit = {
		//println("passe par enum")
		res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[Package].getQualifiedName)+"."+this.getName()+"."+this.getName())
	}
	
	def generateEnum():Unit = {
		
		var res : StringBuilder = new StringBuilder
		res.append("package "+kermeta.utils.TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[Package].getQualifiedName)+"\n")
			res.append("import kermeta.io._\n")			
			res.append("import kermeta.standard._\n")
			res.append("import  kermeta.standard.JavaConversions._\n")
				
		res append "object "+this.getName()+" extends Enumeration {\n"+
			"type "+this.getName()+" = Value\n"+
			"val "
			var i =0
			this.getOwnedLiteral().foreach{e=> 
			if (i!=0) res.append(",")	
				res.append(e.getName())
				i=i+1
			}
			res append " = Value\n"+"}"
			Util.generateFile(kermeta.utils.TypeEquivalence.getPackageEquivalence(this.eContainer().asInstanceOf[Package].getQualifiedName), this.getName, res.toString())			
	}
	/*
def generateVisitor(tabsString 	: String) : String = { 
		 return this.getName;
	} */
}
