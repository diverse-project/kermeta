package fr.irisa.triskell.kermeta.compilo.scala.visitor.impl

import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.rich._
import fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._
import scala.collection.JavaConversions._

class ScalaAspectVisitor extends IVisitor with RichAspectImplicit with LogAspect {
	
	def visit(par : ModelingUnit){
		par.getPackages().foreach(p => p.accept(this))		
	}     

	def visit(par : Package){
		var actualPackage = par.getQualifiedName
                if (Util.doesGeneratePackage(actualPackage)){
			var subTask = new ScalaAspectPackageVisitorRunnable
			VisitorAsyncUtility.runAfter(par,subTask)
 			par.getNestedPackage.foreach(p=> {p.accept(this)})
		}
	}
 
	def visit(par : ClassDefinition){Console.println("multithread error")}
	
	def init(){}
	
	def close(){}
	
}

class ScalaAspectPackageVisitorRunnable extends IVisitor with RichAspectImplicit with LogAspect  {

	def visit(par : ModelingUnit){Console.println("multithread error")}
	
	var actualPackage : String = ""
	
	def visit(par : Package){
		actualPackage = par.getQualifiedName
		
		par.getOwnedTypeDefinition filter(p => p.isInstanceOf[ClassDefinition]) foreach(p=> p.asInstanceOf[ClassDefinition].accept(this))
		par.getOwnedTypeDefinition filter(p => p.isInstanceOf[Enumeration]) foreach(p=> p.asInstanceOf[EnumerationAspect].generateEnum())
	}
	
	def visit(par : ClassDefinition){
		if (!Util.hasCompilerIgnoreTag(par)){ 

			var genpackageName : StringBuilder= new StringBuilder
			//var packageName : StringBuilder= new StringBuilder
			
			genpackageName.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(par.eContainer.asInstanceOf[PackageAspect].getQualifiedNameCompilo))
			
			log.debug("AspectVisitor ClassDef Gen | {} | {}",genpackageName.toString,par.eContainer.asInstanceOf[PackageAspect].getQualifiedNameCompilo)
			
			if (Util.hasEcoreTag(par.eContainer().asInstanceOf[Package])){
				//genpackageName.append("ScalaAspect")
                                genpackageName.insert(0, GlobalConfiguration.scalaAspectPrefix+".")
			}
			//packageName.append(genpackageName.toString)
			//packageName.append(".")
			
			var res : StringBuilder = new StringBuilder
			res.append("package "+genpackageName+"\n")
			res.append("import kermeta.io._\n")			
			res.append("import kermeta.standard._\n")
			res.append("import  kermeta.standard.JavaConversions._\n")
			res.append("import kermeta.standard.PrimitiveConversion._\n")
			res.append("import kermeta.kunit.KunitConversions._\n")
			par.generateScalaCode(res)
			Util.generateFile(genpackageName.toString, par.getName+"Aspect", res.toString())
			if (!Util.hasEcoreTag(par)){
				var res1 : StringBuilder = new StringBuilder
				res1.append("package "+genpackageName+"\n")
				res1.append("trait ")
				res1.append(par.getName())	
				
				par.generateParamerterClass(res1);
				if(!par.getSuperType().first.asInstanceOf[Class].getTypeDefinition.getQualifiedNameCompilo.equals("kermeta.language.structure.Object")){
					//log.debug("SuperTypefound="+ par.getSuperType().first.asInstanceOf[Class].getTypeDefinition.getQualifiedNameCompilo)
					var listSuperTypes = par.getSuperType()
					var i = 0
					for(a <- listSuperTypes){
						if(i == 0) { res1.append(" extends ") } else { res1.append(" with ") } 
						res1.append(Util.protectScalaKeyword(Util.getQualifiedNamedBase(a.asInstanceOf[Class].getTypeDefinition)))
                                                par.generateBindingParamerterClass(a.asInstanceOf[Class],res1)
						i = i + 1
					}
				} 
				//res1.append("trait " + par.getName + " extends "+superQualifiedName+" with fr.irisa.triskell.kermeta.scala.framework.language.structure.ObjectAspect")
				Util.generateFile(genpackageName.toString, par.getName, res1.toString())
			}
		}
	}
	
	def init(){}
	
	def close(){}
	
}
