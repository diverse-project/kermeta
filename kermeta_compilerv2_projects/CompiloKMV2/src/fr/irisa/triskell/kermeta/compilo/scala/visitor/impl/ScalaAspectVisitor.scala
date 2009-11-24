package fr.irisa.triskell.kermeta.compilo.scala.visitor.impl

import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.rich._
import fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._
import scala.collection.JavaConversions._

class ScalaAspectVisitor extends IVisitor with EcoreRichAspectImplicit {
	   
	var actualPackage : String = _
	
	def visit(par : ModelingUnit){
		par.getPackages().foreach(p => p.accept(this))		
	}     
	  
	def visit(par : Package){ 
		actualPackage = par.getQualifiedName
		Console.println("pack name "+actualPackage)
		if (!actualPackage.startsWith("kermeta")){
			var subTask = new ScalaAspectPackageVisitorRunnable(par,actualPackage)
			Util.threadExecutor.execute(subTask)
 			par.getNestedPackage.foreach(p=> {p.accept(this)}) // Go futher in subpackage
		}
	}
 
	def visit(par : ClassDefinition){Console.println("multithread error")}
	
}

class ScalaAspectPackageVisitorRunnable(par : Package,actualPackage : String) extends Runnable with IVisitor with EcoreRichAspectImplicit  {
	def run() = {
			par.getOwnedTypeDefinition filter(p => p.isInstanceOf[ClassDefinition]) foreach(p=> p.asInstanceOf[ClassDefinition].accept(this))
			par.getOwnedTypeDefinition filter(p => p.isInstanceOf[Enumeration]) foreach(p=> p.asInstanceOf[EnumerationAspect].generateEnum())
	}
	
	def visit(par : ModelingUnit){Console.println("multithread error")}
	 
	def visit(par : Package){Console.println("multithread error")}
	
	def visit(par : ClassDefinition){
		
		var genpackageName : StringBuilder= new StringBuilder
			var packageName : StringBuilder= new StringBuilder
			
			genpackageName.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(par.eContainer.asInstanceOf[PackageAspect].getQualifiedName))
			if (Util.hasEcoreTag(par.eContainer().asInstanceOf[Package])){
				genpackageName.append("ScalaAspect")
			}
			packageName.append(genpackageName.toString)
			packageName.append(".")
			
			var res : StringBuilder = new StringBuilder
			res.append("package "+genpackageName+"\n")
			res.append("import kermeta.io._\n")			
			res.append("import kermeta.standard._\n")
			res.append("import  kermeta.standard.JavaConversions._\n")
			res.append("import kermeta.standard.PrimitiveConversion._\n")
			par.generateScalaCode(res)
			Util.generateFile(genpackageName.toString, par.getName+"Aspect", res.toString())
			if (!Util.hasEcoreTag(par)){

				var res1 : StringBuilder = new StringBuilder
				res1.append("package "+genpackageName+"\n")
				res1.append("class " + par.getName + " extends org.eclipse.emf.ecore.impl.EObjectImpl")
				Util.generateFile(genpackageName.toString, par.getName, res1.toString())
			}
	}
	
}
