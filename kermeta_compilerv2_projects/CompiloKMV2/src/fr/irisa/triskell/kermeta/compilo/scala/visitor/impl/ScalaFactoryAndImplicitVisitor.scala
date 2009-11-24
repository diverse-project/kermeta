package fr.irisa.triskell.kermeta.compilo.scala.visitor.impl

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._

 
class ScalaFactoryAndImplicitVisitor extends IVisitor with EcoreRichAspectImplicit {
	 
	var viewDef : StringBuilder = _
	var implicitDef : StringBuilder = _
	var actualPackage : String = _
	var factoryDefClass : StringBuilder =_
	def init { 
		viewDef = new StringBuilder
		implicitDef = new StringBuilder
		
		implicitDef append "package "+GlobalConfiguration.frameworkGeneratedPackageName+"\n"
		implicitDef append "trait "+GlobalConfiguration.implicitConvTraitName+" {\n"
		factoryDefClass = new StringBuilder
	}
	  
	def visit(par : ModelingUnit){
		var mainClass : String = par.getTag().filter{e=> "mainClass".equals(e.getName)}.first.getValue
		var mainOperation : String = par.getTag().filter{e=> "mainOperation".equals(e.getName)}.first.getValue
		var packageName :String= mainClass.substring(0,mainClass.lastIndexOf("::")).replace("::", ".")
		var className :String=mainClass.substring(mainClass.lastIndexOf("::")+2).replace("::", ".")
		
		var res = "package runner \n" +
		"object MainRunner  extends fr.irisa.triskell.scala.generated.fw.ImplicitConversion{\n" +
		"def main(args : Array[String]) : Unit = {\n\t" +
		packageName+".RichFactory.create"+ className+"."+mainOperation +"\n}\n}"; 
		Util.generateFile("runner", "MainRunner", res.toString())
		
  		par.getPackages().foreach(p => p.accept(this) ) 		
	}
	  
	def visit(par : Package){
		actualPackage = kermeta.utils.TypeEquivalence.packageEquivelence.get(par.asInstanceOf[Package].getQualifiedName())
		if (actualPackage == null)
			actualPackage=par.getQualifiedName()
		
		if (!actualPackage.startsWith("kermeta")){
			var factoryDef : StringBuilder =  new StringBuilder
		
			factoryDef append "package "+actualPackage+"\n"
			factoryDef append "object "+GlobalConfiguration.factoryName + " extends "
			if (par.getOwnedTypeDefinition.filter{e=> Util.hasEcoreTag(par)}.size>0)
				factoryDef append actualPackage+"."+ par.getName.substring(0,1).toUpperCase + par.getName.substring(1,par.getName.size)+"Factory with" 
			factoryDef append " "+GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName
			factoryDef append "{\n"
			viewDef append "package "+actualPackage+"\n"
			//viewDef append "trait "+viewDefTraitName+"{\n" 
			
			factoryDefClass.clear
			par.getOwnedTypeDefinition filter(p => p.isInstanceOf[ClassDefinition]) foreach(p=> p.asInstanceOf[ClassDefinitionAspect].accept(this))
			factoryDef.append(factoryDefClass.toString())
			//viewDef append "}\n"
			factoryDef append "}\n"
			Util.generateFile(actualPackage, GlobalConfiguration.factoryName, factoryDef.toString())
			Util.generateFile(actualPackage, GlobalConfiguration.viewDefTraitName, viewDef.toString())
			viewDef.clear
			factoryDef.clear
			par.getNestedPackage.foreach(p=> {p.accept(this)}) // Go futher in subpackage
			
		}
		
	}  

	def visit(par : ClassDefinition){
	//	if(actualPackage == "org.eclipse.emf.ecore"  ) { //TODO REMOVE DEBUG MODE
			 
			var packageName : StringBuilder= new StringBuilder
			packageName.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(par.eContainer.asInstanceOf[PackageAspect].getQualifiedName))
			packageName.append(".")
			
			viewDef.append(" class Rich"+par.getName()+" extends "+ kermeta.utils.TypeEquivalence.getTypeEquivalence(packageName.toString + par.getName())+" with "+packageName.toString +par.getName+"Aspect \n")
			implicitDef append " implicit def richAspect(v : "+ kermeta.utils.TypeEquivalence.getTypeEquivalence(packageName.toString+par.getName())+") = v.asInstanceOf["+ packageName.toString+ "Rich"+par.getName+"]\n" 
			implicitDef append " implicit def richAspect(v : "+ packageName.toString+par.getName()+"Aspect) = v.asInstanceOf["+ packageName.toString+"Rich"+par.getName+"]\n"
			if (Util.hasEcoreTag(par))
				factoryDefClass append " override"
			factoryDefClass append " def create"+par.getName()+" : "+ kermeta.utils.TypeEquivalence.getTypeEquivalence(packageName.toString+par.getName())+" = { new "+ packageName.toString+"Rich"+par.getName+" }\n"
			
	//}
	}
	
	def close {
		
		implicitDef append "}\n"
		Util.generateFile(GlobalConfiguration.frameworkGeneratedPackageName, GlobalConfiguration.implicitConvTraitName, implicitDef.toString())
	} 
	
}
