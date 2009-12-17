package fr.irisa.triskell.kermeta.compilo.scala.visitor.impl

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.visitor._


class ScalaFactoryAndImplicitVisitor extends IVisitor with RichAspectImplicit with LogAspect {
 
	var viewDef : StringBuilder = _
	var implicitDef : StringBuilder = _
	var actualPackage : String = _
	var factoryDefClass : StringBuilder =_
	
	def initForEcorePackage(parentpack : String,packNam:String):String={
		var res : StringBuilder = new StringBuilder
		var packNameUpper :String = packNam.substring(0,1).toUpperCase + packNam.substring(1,packNam.size)
		var packName :String = null
		if("".equals(parentpack)){
			packName=packNam
		}else{
			packName=parentpack+"."+packNam
		}
		packName= kermeta.utils.TypeEquivalence.getPackageEquivalence(packName)
		var impName = packName+".impl."+packNameUpper+"PackageImpl"
		res.append("{\tvar c : java.lang.reflect.Constructor[_] = classOf["+impName+"].getDeclaredConstructors.first\n")
		res.append("\tc.setAccessible(true);\n")
	    res.append("\tvar pack : "+ impName + " =  c.newInstance().asInstanceOf["+ impName + "]\n")
		res.append("\tpack.setEFactoryInstance(" + packName + "ScalaAspect.RichFactory)\n " )
		res.append("\tvar f : java.lang.reflect.Field = classOf[org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField(\"ecoreFactory\")\n")
	    res.append("\tf.setAccessible(true)\n")
	    if(packName.equals("ecore")){
	    	res.append("\tf.set(pack, "+ packName + "ScalaAspect.RichFactory)\n")
	    } 
		res.append("\torg.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put("+packName + "."+ packNameUpper+"Package.eNS_URI, pack)\n")
		res.append("\tkermeta.persistence.EcorePackages.getPacks().put("+packName + "."+ packNameUpper+"Package.eNS_URI, pack)\n")
		res.append("\t"+impName +".init\n}\n")
		res.toString
	}
	
	def init { 
		viewDef = new StringBuilder
		implicitDef = new StringBuilder
		implicitDef append "package "+GlobalConfiguration.frameworkGeneratedPackageName+"\n"
		implicitDef append "trait "+GlobalConfiguration.implicitConvTraitName+" {\n"
		factoryDefClass = new StringBuilder
	}
	 var packages : java.util.List[Package] = _
	
	 def addPackage(packs : java.util.List[Package]):Unit={
		 packs.foreach({e=> if (Util.hasEcoreTag(e)) packages.add(e); addPackage(e.getNestedPackage())})
	 }
	 
	def visit(par : ModelingUnit){
		packages = new java.util.ArrayList[Package]()
		addPackage(par.getPackages());
		                                        
		var mainClass : String = par.getTag().filter{e=> "mainClass".equals(e.getName)}.first.getValue
		var mainOperation : String = par.getTag().filter{e=> "mainOperation".equals(e.getName)}.first.getValue
		var packageName :String= mainClass.substring(0,mainClass.lastIndexOf("::")).replace("::", ".")
		var className :String=mainClass.substring(mainClass.lastIndexOf("::")+2).replace("::", ".")
		//TODO gérer le cas des package venant d'ecore
		var res :StringBuilder= new StringBuilder
		res.append("package runner \n")
		res.append("import java.io.PrintStream\n")
		res.append("object MainRunner  extends fr.irisa.triskell.scala.generated.fw.ImplicitConversion{\n" +
		"def main(args : Array[String]) : Unit = {\n\t" )
		res.append("System.setOut(new PrintStream(\"outputStream\"));\n")
		res.append("kermeta.persistence.EcorePackages.workspaceURI = \"" + GlobalConfiguration.workspaceURI + "\"\n")
		res.append("kermeta.persistence.EcorePackages.pluginURI = \"" + GlobalConfiguration.pluginURI+ "\";\n")
		
		packages.sort((a,b)->{true}).foreach{e=> if (!(e.getQualifiedName.startsWith("kermeta")|| e.getQualifiedName.startsWith("language")))
			{if (e.getNestingPackage() == null){
				res.append(
				initForEcorePackage("", e.getName()))
				}
			else{
				res.append(
						initForEcorePackage(e.getNestingPackage().getQualifiedName(), e.getName()))}
			}
		}
		res.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(packageName))
		
		if (packages.filter{e=>  e.getQualifiedName().equals(packageName)}.size==1)
			{
			res.append("ScalaAspect")
			}
		res.append(".RichFactory.create"+ className+"."+mainOperation +"\n}\n}") 
		Util.generateFile("runner", "MainRunner", res.toString())
		
  		par.getPackages().foreach(p => p.accept(this) ) 		
	}
	  
	def visit(par : Package){
		actualPackage = kermeta.utils.TypeEquivalence.packageEquivelence.get(par.asInstanceOf[Package].getQualifiedName())
		if (actualPackage == null)
			actualPackage=par.getQualifiedName()
		if (Util.hasEcoreTag(par))
			actualPackage=actualPackage+"ScalaAspect"
		
			if (!actualPackage.startsWith("kermeta")){
			//if (!actualPackage.startsWith("kermeta.") || actualPackage.startsWith("kermeta.kunit")){
					//if (!(actualPackage.startsWith("kermeta.io")||actualPackage.startsWith("kermeta.standard")||actualPackage.startsWith("kermeta.exceptions")||actualPackage.startsWith("kermeta.ecore"))){
		
			var factoryDef : StringBuilder =  new StringBuilder
		
			factoryDef append "package "+actualPackage+"\n"
			
			factoryDef append "object "+GlobalConfiguration.factoryName + " extends "
			if (par.getOwnedTypeDefinition.filter{e=> Util.hasEcoreTag(par)}.size>0)
				factoryDef append  kermeta.utils.TypeEquivalence.getPackageEquivalence(par.asInstanceOf[Package].getQualifiedName())+".impl."+ par.getName.substring(0,1).toUpperCase + par.getName.substring(1,par.getName.size)+"FactoryImpl with" 
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
			 
			var genpackageName : StringBuilder= new StringBuilder
			var packageName : StringBuilder= new StringBuilder
			
			genpackageName.append(kermeta.utils.TypeEquivalence.getPackageEquivalence(par.eContainer.asInstanceOf[PackageAspect].getQualifiedName))
			packageName.append(genpackageName.toString)
			if (Util.hasEcoreTag(par.eContainer().asInstanceOf[Package])){
				packageName.append("ScalaAspect")
			}
			genpackageName.append(".")
			
			if (par.isIsAbstract())
				viewDef.append( " abstract")
				
				
			
			var param : StringBuilder = new StringBuilder
			par.generateParamerterClass(param);			
			if (Util.hasEcoreTag(par)){				
				viewDef.append(" class Rich"+par.getName()+" extends "+ kermeta.utils.TypeEquivalence.getTypeEquivalence(genpackageName.toString+"impl." + par.getName()+"Impl")+" with "+packageName.toString +"."+par.getName+"Aspect \n")
				implicitDef append " implicit def richAspect(v : "+ kermeta.utils.TypeEquivalence.getTypeEquivalence(genpackageName.toString+par.getName())+") = v.asInstanceOf["+ packageName.toString+"."+ par.getName+"Aspect]\n" 
				implicitDef append " implicit def richAspect(v : "+ packageName.toString+"."+par.getName()+"Aspect) = v.asInstanceOf["+ par.eContainer().asInstanceOf[ObjectAspect].getQualifiedNameCompilo+ ".impl." + par.getName+"Impl]\n"
			}else{
				viewDef.append(" class Rich"+par.getName()+ param.toString +" extends org.eclipse.emf.ecore.impl.EObjectImpl with "+ kermeta.utils.TypeEquivalence.getTypeEquivalence(packageName.toString +"."+ par.getName())+ param.toString +" with "+packageName.toString +"."+par.getName+"Aspect" + param.toString +" \n")
				implicitDef append " implicit def richAspect" + param.toString + "(v : "+ kermeta.utils.TypeEquivalence.getTypeEquivalence(packageName.toString+"."+par.getName())+ param.toString +") = v.asInstanceOf["+ packageName.toString+"."+par.getName+"Aspect"+ param.toString +"]\n" 
				implicitDef append " implicit def richAspect" + param.toString +"(v : "+ packageName.toString+"."+par.getName()+"Aspect" + param.toString +") = v.asInstanceOf["+ packageName.toString+"."+par.getName+ param.toString +"]\n"

			}			
			
			if (!par.isIsAbstract()){
				if (Util.hasEcoreTag(par)){
					factoryDefClass append " override"
					factoryDefClass append " def create"+par.getName()+ param.toString +" : "+ kermeta.utils.TypeEquivalence.getTypeEquivalence(genpackageName.toString+par.getName())+param.toString+" = { new "+ packageName.toString+".Rich"+par.getName + param.toString +" }\n"
				}
				else{
					factoryDefClass append " def create"+par.getName()+ param.toString +" : "+ kermeta.utils.TypeEquivalence.getTypeEquivalence(packageName.toString+"."+par.getName())+param.toString+" = { new "+ packageName.toString+".Rich"+par.getName+ param.toString +" }\n"
				}
			}
	//}
	}
	
	def close {
		implicitDef append "}\n"
		Util.generateFile(GlobalConfiguration.frameworkGeneratedPackageName, GlobalConfiguration.implicitConvTraitName, implicitDef.toString())
	} 
	
}
