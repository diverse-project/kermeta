package fr.irisa.triskell.kermeta.compilo.scala.visitor

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._


class ScalaFactoryAndImplicitVisitor extends IVisitor with EcoreRichAspectImplicit with GlobalConfiguration {
	
	var viewDef : StringBuilder = _
	var implicitDef : StringBuilder = _
	var actualPackage : String = _
	var factoryDefClass : StringBuilder =_
	def init {
		viewDef = new StringBuilder
		implicitDef = new StringBuilder
		viewDef append "package "+frameworkGeneratedPackageName+"\n"
		viewDef append "trait "+viewDefTraitName+"{\n" 
		implicitDef append "package "+frameworkGeneratedPackageName+"\n"
		implicitDef append "trait "+implicitConvTraitName+" with "+viewDefTraitName+" {\n"
		factoryDefClass = new StringBuilder
	}
	
	def visit(par : ModelingUnit){
		par.getPackages().foreach(p => p.accept(this) ) 		
	}
	
	def visit(par : Package){
		
		actualPackage = kermeta.utils.TypeEquivalence.packageEquivelence.get(par.getQualifiedName())
		if (actualPackage == null)
			actualPackage=par.getQualifiedName()
		
		if (!actualPackage.startsWith("kermeta")){
			var factoryDef : StringBuilder =  new StringBuilder
		
			factoryDef append "package "+actualPackage+"\n"
			factoryDef append "class "+factoryName
			factoryDef append " extends "+actualPackage+"."+ par.getName+"FactoryImpl"
			factoryDef append " with "+frameworkGeneratedPackageName + "."+implicitConvTraitName
			factoryDef append "{\n"
			factoryDefClass.clear
			par.getOwnedTypeDefinition filter(p => p.isInstanceOf[ClassDefinition]) foreach(p=> p.asInstanceOf[ClassDefinition].accept(this))
			par.getNestedPackage.foreach(p=> {p.accept(this)}) // Go futher in subpackage
			factoryDef.append(factoryDefClass.toString())
			
			factoryDef append "}\n"
			Util.generateFile(actualPackage, factoryName, factoryDef.toString())
		}
		
	}  

	def visit(par : ClassDefinition){
		if(actualPackage == "org.eclipse.emf.ecore"  ) { //TODO REMOVE DEBUG MODE
			
			var packageName : StringBuilder= new StringBuilder
			packageName.append(kermeta.utils.TypeEquivalence.packageEquivelence.get(par.eContainer.asInstanceOf[Package].getQualifiedName))
			packageName.append(".")
						
			viewDef.append(" class Rich"+par.getName()+" extends "+ packageName.toString + par.getName+" with "+packageName.toString +par.getName+"Aspect \n")
			implicitDef append " implicit def richAspect(v : "+ packageName.toString+par.getName()+") = v.asInstanceOf["+ packageName.toString+ "Rich"+par.getName+"]\n" 
			implicitDef append " implicit def richAspect(v : "+ packageName.toString+par.getName()+"Aspect) = v.asInstanceOf["+ packageName.toString+"Rich"+par.getName+"]\n"
			
			factoryDefClass append " override def create"+par.getName()+" : "+ packageName.toString+par.getName()+" = { new "+ packageName.toString+"Rich"+par.getName+" }\n"
		}
	}
	
	def close {
		viewDef append "}\n"
		implicitDef append "}\n"
		Util.generateFile(frameworkGeneratedPackageName, viewDefTraitName, viewDef.toString())
		Util.generateFile(frameworkGeneratedPackageName, implicitConvTraitName, implicitDef.toString())
	}
	
}
