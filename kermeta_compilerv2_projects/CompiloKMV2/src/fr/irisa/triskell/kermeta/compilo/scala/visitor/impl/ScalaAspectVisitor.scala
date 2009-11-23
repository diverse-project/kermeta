package fr.irisa.triskell.kermeta.compilo.scala.visitor.impl

import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.rich._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._
import scala.collection.JavaConversions._


class ScalaAspectVisitor extends IVisitor with EcoreRichAspectImplicit {
	   
	var actualPackage : String = _
	
	def visit(par : ModelingUnit){
		par.getPackages().foreach(p => p.accept(this))		
 
	}     
	  
	def visit(par : Package){ 
		
		actualPackage = par.getQualifiedName()
		//Util.currentPackage = actualPackage
		if (!actualPackage.startsWith("kermeta")){
			par.getOwnedTypeDefinition filter(p => p.isInstanceOf[ClassDefinition]) foreach(p=> p.asInstanceOf[ClassDefinition].accept(this))
			par.getOwnedTypeDefinition filter(p => p.isInstanceOf[Enumeration]) foreach(p=> p.asInstanceOf[Enumeration].generateEnum())
			
			par.getNestedPackage.foreach(p=> {p.accept(this)}) // Go futher in subpackage
		}
	}
 
	def visit(par : ClassDefinition){
		
			var res : StringBuilder = new StringBuilder
			res.append("package "+kermeta.utils.TypeEquivalence.getPackageEquivalence(actualPackage)+"\n")
			res.append("import kermeta.io._\n")			
			res.append("import kermeta.standard._\n")
			res.append("import  kermeta.standard.JavaConversions._\n")
			res.append("import kermeta.standard.PrimitiveConversion._\n")
			
			par.generateScalaCode(res)
			Util.generateFile(kermeta.utils.TypeEquivalence.getPackageEquivalence(actualPackage), par.getName+"Aspect", res.toString())
			
			var res1 : StringBuilder = new StringBuilder
			res1.append("package "+kermeta.utils.TypeEquivalence.getPackageEquivalence(actualPackage)+"\n")
			res1.append("class " + par.getName + " extends org.eclipse.emf.ecore.impl.EObjectImpl")
			Util.generateFile(kermeta.utils.TypeEquivalence.getPackageEquivalence(actualPackage), par.getName, res1.toString())
		 
	}

}
