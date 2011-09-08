
package org.kermeta.compilo.scala.visitor.impl


import org.kermeta.compilo.scala.rich.RichAspectImplicit._
import org.kermeta.compilo.scala.rich._
import org.kermeta.compilo.scala.rich.richAspect._
import org.antlr.stringtemplate.StringTemplate
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.compilo.scala.visitor._


class ScalaFactoryAndImplicitVisitor extends IVisitor with LogAspect {

  
    var viewDef : StringBuilder = _
    var implicitDef : StringBuilder = _
    var actualPackage : String = _
    var factoryDefClass : StringBuilder =_
	
    def initForEclipseEcorePackage(parentpack : String,packNam:String):String={
        var res : StringBuilder = new StringBuilder
        var packNameUpper :String = packNam.substring(0,1).toUpperCase + packNam.substring(1,packNam.size)
        var packName :String = null
        if("".equals(parentpack)){
            packName=packNam
        }else{
            packName=parentpack+"."+packNam
        }
        packName= k2.utils.TypeEquivalence.getPackageEquivalence(packName)
        var impName = packName+ Util.getImplPackageSuffix(packName)+Util.getPackagePrefix(packNameUpper)+"PackageImpl"
       
    res.append(Util.protectScalaKeyword(impName +".init()"))        
 res.append(".setEFactoryInstance(")
            res.append(Util.protectScalaKeyword(GlobalConfiguration.scalaAspectPrefix+"."+packName+"."+GlobalConfiguration.factoryName+""))
            res.append(")")
            res.append("\n")        
        return res.toString()
        }
    
    def initForEcorePackage(parentpack : String,packNam:String):String={
        var res : StringBuilder = new StringBuilder
        var packNameUpper :String = packNam.substring(0,1).toUpperCase + packNam.substring(1,packNam.size)
        var packName :String = null
        if("".equals(parentpack)){
            packName=packNam
        }else{
            packName=parentpack+"."+packNam
        }
        packName= k2.utils.TypeEquivalence.getPackageEquivalence(packName)
        var impName = packName+ Util.getImplPackageSuffix(packName)+Util.getPackagePrefix(packNameUpper)+"PackageImpl"
       if (packName.equals("org.eclipse.emf.ecore")){
            //res.append("\n{\n\tvar c : java.lang.reflect.Constructor[_] = classOf["+impName+"].getDeclaredConstructors.first\n")
            //res.append("\tc.setAccessible(true);\n")
            res.append("\n{\n\tvar pack : org.eclipse.emf.ecore.EcorePackage =  org.eclipse.emf.ecore.impl.EcorePackageImpl.init\n")
            res.append("\torg.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(org.eclipse.emf.ecore.EcorePackage.eNS_URI,pack)\n")
                  
//            res.append("\tvar pack : "+ impName + " =  c.newInstance().asInstanceOf["+ impName + "]\n")
            res.append("\tpack.setEFactoryInstance(" +GlobalConfiguration.scalaAspectPrefix+"."+ packName + "."+GlobalConfiguration.factoryName+")\n " )
            res.append("\tvar f : java.lang.reflect.Field = classOf[org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField(\"ecoreFactory\")\n")
            res.append("\tf.setAccessible(true)\n")
            if(packName.equals("org.eclipse.emf.ecore")){
                res.append("\tf.set(pack, "+ GlobalConfiguration.scalaAspectPrefix+"."+ packName + "."+GlobalConfiguration.factoryName+")\n")
            }
            res.append("\torg.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put("+Util.protectScalaKeyword(packName) + "."+ packNameUpper+"Package.eNS_URI, pack)\n")
            res.append("\tk2.persistence.EcorePackages.getPacks().put("+Util.protectScalaKeyword(packName) + "."+ packNameUpper+"Package.eNS_URI, pack)\n")
            res.append("\t"+impName +".init\n}\n")
            return res.toString
        }
        else {
            res.append("\n{\n\t")
            res.append("var pack : "+Util.protectScalaKeyword(packName+"."+ Util.getPackagePrefix( packNameUpper)+"Package")+" = "+Util.protectScalaKeyword(impName +".init")+"\n")
            res.append("\torg.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put("+Util.protectScalaKeyword(packName + "."+ Util.getPackagePrefix( packNameUpper)+"Package.eNS_URI")+", pack)\n")
            res.append("\tk2.persistence.EcorePackages.getPacks().put("+Util.protectScalaKeyword(packName + "."+ Util.getPackagePrefix( packNameUpper)+"Package.eNS_URI")+", pack)\n")
            res.append("\tpack.setEFactoryInstance(")
            res.append(Util.protectScalaKeyword(GlobalConfiguration.scalaAspectPrefix+"."+packName+"."+GlobalConfiguration.factoryName+""))
            res.append(")")
            res.append("\n}\n\n")
            return res.toString
        }
    
  /*      packName= k2.utils.TypeEquivalence.getPackageEquivalence(packName)
        if (packName.equals("org.eclipse.emf.ecore")){
            res.append("\n{\n\tvar c : java.lang.reflect.Constructor[_] = classOf["+impName+"].getDeclaredConstructors.first\n")
            res.append("\tc.setAccessible(true);\n")
            res.append("\tvar pack : "+ impName + " =  c.newInstance().asInstanceOf["+ impName + "]\n")
            res.append("\tpack.setEFactoryInstance(" +GlobalConfiguration.scalaAspectPrefix+"."+ packName + ".RichFactory)\n " )
            res.append("\tvar f : java.lang.reflect.Field = classOf[org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField(\"ecoreFactory\")\n")
            res.append("\tf.setAccessible(true)\n")
            if(packName.equals("org.eclipse.emf.ecore")){
                res.append("\tf.set(pack, "+ GlobalConfiguration.scalaAspectPrefix+"."+ packName + ".RichFactory)\n")
            }
            res.append("\torg.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put("+Util.protectScalaKeyword(packName) + "."+ packNameUpper+"Package.eNS_URI, pack)\n")
            res.append("\tk2.persistence.EcorePackages.getPacks().put("+Util.protectScalaKeyword(packName) + "."+ packNameUpper+"Package.eNS_URI, pack)\n")
            res.append("\t"+impName +".init\n}\n")
            return res.toString
        }
        else {
            res.append("\n{\n")
            var protectedPackNameUpperPackage  = Util.protectScalaKeyword(packName+"."+ Util.getPackagePrefix( packNameUpper)+"Package")
            res.append("\tvar pack : org.eclipse.emf.ecore.EPackage = null\n")
            res.append("\tvar refObject : Object = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.get("+protectedPackNameUpperPackage+".eNS_URI)\n")
            res.append("\trefObject match {\n")
            res.append("\t\tcase x:org.eclipse.emf.ecore.EPackage.Descriptor => {pack = x.getEPackage}\n")
            res.append("\t\tcase x:org.eclipse.emf.ecore.EPackage => {pack = x }\n")
            res.append("\t\tcase _ => null\n")
            res.append("\t}\n")

            res.append("\tif( pack == null ){\n")
            res.append("\t// Set registry only if necessary\n")
            res.append("\t\tpack = "+Util.protectScalaKeyword(impName +".init")+"\n")
            res.append("\t\torg.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put("+Util.protectScalaKeyword(packName + "."+ Util.getPackagePrefix( packNameUpper)+"Package.eNS_URI")+", pack)\n")
            res.append("\t}\n")
            res.append("\tif(k2.persistence.EcorePackages.getPacks().get("+protectedPackNameUpperPackage+".eNS_URI) == null){\n")
            res.append("\t// Set persistency support only if necessary\n")
            res.append("\t\tk2.persistence.EcorePackages.getPacks().put("+Util.protectScalaKeyword(packName + "."+ Util.getPackagePrefix( packNameUpper)+"Package.eNS_URI")+", pack)\n")
            res.append("\t}\n")
            res.append("\tpack.setEFactoryInstance(")
            res.append(Util.protectScalaKeyword(GlobalConfiguration.scalaAspectPrefix+"."+packName+".RichFactory"))
            res.append(")")
            res.append("\n}\n\n")
            return res.toString
        }*/
    }
	
    def init {

    

        viewDef = new StringBuilder
        implicitDef = new StringBuilder
        implicitDef append "package "+GlobalConfiguration.frameworkGeneratedPackageName+"\n"
        implicitDef append "object "+GlobalConfiguration.implicitConvTraitName+" {\n"
/*        implicitDef.append(" implicit def richAspect(v : _root_.java.lang.Object) :org.kermeta.language.structure.Object = v.asInstanceOf[org.kermeta.language.structure.Object]\n")
//    implicitDef.append(" implicit def richAspect1(v : _root_.java.lang.Object) : ScalaAspect.org.kermeta.language.structure.KermetaModelElementAspect = v.asInstanceOf[org.kermeta.language.structure.Object]\n")

        implicitDef.append("      implicit def richAspect1(o : _root_.java.lang.Object) : k2.standard.EObjectImplForPrimitive = {\n")
     
        implicitDef.append("     if (o != null && o.isInstanceOf[java.lang.String]){\n")
        implicitDef.append("       return new k2.standard.RichString(o.asInstanceOf[java.lang.String])\n")
        implicitDef.append("     }\n")
        implicitDef.append("     else if (o != null && o.isInstanceOf[java.lang.Boolean]){\n")
        implicitDef.append("       return new k2.standard.RichJavaBoolean(o.asInstanceOf[java.lang.Boolean])\n")
        implicitDef.append("     }\n")
        implicitDef.append("     else if (o != null && o.isInstanceOf[java.lang.Integer]){\n")
        implicitDef.append("       return new k2.standard.RichInteger(o.asInstanceOf[java.lang.Integer].intValue)\n")
        implicitDef.append("     }\n")
        implicitDef.append("     else if (o != null && o.isInstanceOf[java.util.List[_]]){\n")
        implicitDef.append("       return new k2.standard.JavaConversions.RichKermetaList(o.asInstanceOf[java.util.List[_]])\n")
        implicitDef.append("     }\n")
        
        implicitDef.append("     if ( o.isInstanceOf[org.kermeta.language.structure.Object])\n")
        implicitDef.append("       return o.asInstanceOf[org.kermeta.language.structure.Object]\n")
        implicitDef.append("     else if (o!=null)\n")
        implicitDef.append("     {\n")
        implicitDef.append("      return new k2.standard.RichEnum(o)\n}\n")
        implicitDef.append("     else\n")
        implicitDef.append("       null.asInstanceOf[k2.standard.EObjectImplForPrimitive]\n")
        implicitDef.append("   }\n")
        implicitDef.append("   implicit def richAspect2(o : _root_.java.lang.Object) : " + org.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix + ".org.kermeta.language.structure.KermetaModelElementAspect ={\n")
        implicitDef.append("   o.asInstanceOf["+org.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix+".org.kermeta.language.structure.KermetaModelElementAspect] \n \t } \n ")
*/
      implicitDef.append("implicit def richAspect(o : _root_.java.lang.Object)  =  o match {\n")
      implicitDef.append("  case s:String => new k2.standard.RichString(s)\n")
      implicitDef.append("   case s : java.lang.Boolean => new k2.standard.RichJavaBoolean(s)\n")
      implicitDef.append("   case s : java.lang.Integer =>\n")
      implicitDef.append(" new k2.standard.RichInteger(s.intValue)\n")
      implicitDef.append("   case s : java.util.List[_] => new k2.standard.JavaConversions.RichKermetaList(s)\n")
      implicitDef.append("   case s:  "+ org.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix +".org.kermeta.language.structure.KermetaModelElementAspect => s\n")
      implicitDef.append("   case _ =>  if (o!=null)\n")
      implicitDef.append("     new k2.standard.RichEnum(o)\n")
      implicitDef.append("    else\n")
      implicitDef.append("       null.asInstanceOf[k2.standard.EObjectImplForPrimitive]\n")
      implicitDef.append(" }\n")

        
        factoryDefClass = new StringBuilder
    }
    var packages : java.util.List[Package] = _
	
    def addPackage(packs : java.util.List[Package]):Unit={
        packs.foreach({e=> if (Util.hasEcoreTag(e))
            packages.add(e);
                       addPackage(e.getNestedPackage())})
    }
	 
    def visit(par : ModelingUnit){
                packages = new java.util.ArrayList[Package]()
    addPackage(par.getPackages());
    var mainClass: String = null
    var packageName: String =null
    var mainOperation: String = null
    var className: String = null
    var mainOperationSize = 0
    try {
      mainClass = GlobalConfiguration.baseClass
      mainOperation = GlobalConfiguration.baseOperation
      packageName = mainClass.substring(0, mainClass.lastIndexOf("::")).replace("::", ".")
      className = mainClass.substring(mainClass.lastIndexOf("::") + 2).replace("::", ".")

      var mainClassDef = par.eAllContents.filter {
        e => e.isInstanceOf[ClassDefinition]
      }.filter(e => e.asInstanceOf[ClassDefinition].getName.equals(className)).toList.first
      mainOperationSize = mainClassDef.asInstanceOf[ClassDefinition].getOwnedOperation.filter {
        e => e.getName.equals(mainOperation)
      }.first.asInstanceOf[Operation].getOwnedParameter.size
    } catch {
      case e: java.lang.Exception => {}
    }


        //TODO gérer le cas des package venant d'ecore
        var res :StringBuilder= new StringBuilder
        var resinitEclipse :StringBuilder= new StringBuilder
        res.append("package "+GlobalConfiguration.scalaAspectPrefix+"runner \n")
        res.append("import java.io.PrintStream\n")
        res.append("import "+ GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName +"._\n")

        res.append("object MainRunner  {\n")
        //res.append("def main(args : Array[String]) : Unit = {\n\t" )
        res.append("def init() : Unit = {\n\t" )
        if (GlobalConfiguration.isTest){
            res.append("System.setOut(new PrintStream(\"outputStream\"));\n")
        }
        res.append("k2.persistence.EcorePackages.workspaceURI = \"" + GlobalConfiguration.workspaceURI + "\"\n")
        res.append("k2.persistence.EcorePackages.pluginURI = \"" + GlobalConfiguration.pluginURI+ "\";\n")
        java.util.Collections.sort(packages, new java.util.Comparator[Package]{
                def compare(o1:Package , o2:Package):Int={
                    if ("ecore".equals(o1.getName))
                        return -1;
                    else if ("ecore".equals(o2.getName))
                        return 1;
                    else
                        return 0;
				
                };
                override def equals(obj:Any):Boolean =false;
            }
				
        );
        packages.foreach(e=> //if (!(e.getQualifiedName.startsWith("kermeta")|| e.getQualifiedName.startsWith("language")))
            if (!(e.getOwnedTypeDefinition.size()==0 ||
                  e.getOwnedTypeDefinition.filter(t=> t.isInstanceOf[ClassDefinition]).filter(t=> Util.hasEcoreTag(t)).size==0	||
                  e.getOwnedTypeDefinition.filter(t=> t.isInstanceOf[ClassDefinition]).forall(t=> Util.hasCompilerIgnoreTag(t)) )){
                if (!Util.hasEcoreFromAPITag(e)){
                    
                    if (e.getNestingPackage() == null ){
                        res.append(
                            initForEcorePackage("", e.getName()))
                           resinitEclipse.append(initForEclipseEcorePackage("", e.getName()))
                    }
                    else{
                        res.append(
                            initForEcorePackage(e.getNestingPackage().getQualifiedName(), e.getName()))
                        resinitEclipse.append(
                            initForEclipseEcorePackage(e.getNestingPackage().getQualifiedName(), e.getName()))
                        
                    }
                }
            }
        )
		
        res.append("\n\t _root_.k2.utils.ReflexivityLoader.pref(\"" + GlobalConfiguration.scalaAspectPrefix + "\")\n")
      res.append("\n\t _root_.k2.utils.UTilScala.setScalaAspectPrefix(\"" + GlobalConfiguration.scalaAspectPrefix + "\")\n")
            
        res.append("}\n")
        res.append("def init4eclipse() : Unit = {\n\t" )
        res.append(resinitEclipse.toString)
        res.append("\n\t _root_.k2.utils.ReflexivityLoader.pref(\"" + GlobalConfiguration.scalaAspectPrefix + "\")\n")
      res.append("\n\t _root_.k2.utils.UTilScala.setScalaAspectPrefix(\"" + GlobalConfiguration.scalaAspectPrefix + "\")\n")
              res.append("}\n")


        res.append("def main(args : Array[String]) : Unit = {\n")
        //if (packages.exists(pac=> "ecore".equals(pac.getName))){
       //     res.append("\t org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.asInstanceOf[org.eclipse.emf.ecore.EcoreFactoryWrapper].setWrap("+org.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix+".org.eclipse.emf.ecore."+GlobalConfiguration.factoryName+") \n \t" )
            //CopyEcoreFile.copyEcorefiles(GlobalConfiguration.outputFolder)
        //}
        res.append("\t init() \n")
        res.append("\ttry {\n")
        res.append("\t\t"+"_root_." )
        if (packages.filter{e=>  e.getQualifiedName().equals(packageName)}.size==1)
        {
            res.append(GlobalConfiguration.scalaAspectPrefix+".")

        }
        res.append(k2.utils.TypeEquivalence.getPackageEquivalence(packageName))
		

        res.append("."+GlobalConfiguration.factoryName+".create"+ className+"."+mainOperation )
		
        res.append("(")
        for(i <- 0 until mainOperationSize){
            if(i != 0){ res.append(" , ")}
            res.append("args("+i+")")
        }
        res.append(")\n")
        res.append("\t} catch {\n")
        res.append("\t\t case e :_root_.k2.exceptions.Exception => println(\"Exception caught \"+e+\" \"+e.message) \n" )
			  res.append("\t\t\t if(e.getCause != null) {e.getCause.printStackTrace()} else {e.printStackTrace()}\n")
		    res.append("\t\t case e => println(\"Exception caught \"+e)\n")
        res.append("\t\t\t e.printStackTrace()\n")
        res.append("\t}\n")

        res.append("}\n}")
		
        Util.generateFile(GlobalConfiguration.scalaAspectPrefix + "runner", "MainRunner", res.toString())
        this.genetateUtilObject
		
        par.getPackages().foreach(p => p.accept(this) )
    }
	  
    def visit(par : Package){

        if (Util.doesGeneratePackage(par.getQualifiedName)){

            actualPackage = k2.utils.TypeEquivalence.packageEquivelence.get(par.asInstanceOf[Package].getQualifiedName())
            if (actualPackage == null)
                actualPackage=par.getQualifiedName()
            if (Util.hasEcoreTag(par))
                actualPackage=GlobalConfiguration.scalaAspectPrefix+"."+actualPackage;

            if (!(par.getOwnedTypeDefinition.size()==0 || par.getOwnedTypeDefinition.filter(t=> t.isInstanceOf[ClassDefinition]).forall(t=> Util.hasCompilerIgnoreTag(t)) )){
                var factoryDef : StringBuilder =  new StringBuilder
			
      
                factoryDef append "package "+Util.protectScalaKeyword(actualPackage.toString)+"\n"
                factoryDef append "import "+GlobalConfiguration.frameworkGeneratedPackageName + "."+GlobalConfiguration.implicitConvTraitName +"._\n"

                factoryDef append "object "+GlobalConfiguration.factoryName
                //e.getOwnedTypeDefinition.filter(t=> t.isInstanceOf[ClassDefinition]).filter(t=> Util.hasEcoreTag(t)).size==0
                if (par.getOwnedTypeDefinition.size!= 0 &&  par.getOwnedTypeDefinition.filter(t=> t.isInstanceOf[ClassDefinition]).filter(e=> Util.hasEcoreTag(e)).size>0 && !Util.hasEcoreFromAPITag(par)){
                    factoryDef.append (" extends " +Util.protectScalaKeyword(k2.utils.TypeEquivalence.getPackageEquivalence(par.asInstanceOf[Package].getQualifiedName())+Util.getImplPackageSuffix(actualPackage)+ Util.getPackagePrefix(par.getName.substring(0,1).toUpperCase + par.getName.substring(1,par.getName.size))+"FactoryImpl"))
                }
                factoryDef append "{\n"
                viewDef append "package "+Util.protectScalaKeyword(actualPackage.toString)+"\n"
                //viewDef append "trait "+viewDefTraitName+"{\n"
				
                factoryDefClass.clear
                par.getOwnedTypeDefinition.filter(p => p.isInstanceOf[ClassDefinition]).foreach(p=> p.asInstanceOf[ClassDefinitionAspect].accept(this))
                factoryDef.append(factoryDefClass.toString())
                //viewDef append "}\n"
                factoryDef append "}\n"
                Util.generateFile(actualPackage, GlobalConfiguration.factoryName, factoryDef.toString())
                Util.generateFile(actualPackage, GlobalConfiguration.viewDefTraitName, viewDef.toString())
                viewDef.clear
                factoryDef.clear
            }
            par.getNestedPackage.foreach(p=> {p.accept(this)}) // Go futher in subpackage
			
        }
		
    }

    def visit(par : ClassDefinition){
		
        if (!Util.hasCompilerIgnoreTag(par)){
            var genpackageName : StringBuilder= new StringBuilder
            var packageName : StringBuilder= new StringBuilder
            var viewDefTemp : StringBuilder= new StringBuilder
				
            genpackageName.append(k2.utils.TypeEquivalence.getPackageEquivalence(par.eContainer.asInstanceOf[PackageAspect].getQualifiedName))
            packageName.append(genpackageName.toString)
            if (Util.hasEcoreTag(par.eContainer().asInstanceOf[Package])){
                packageName.insert(0,GlobalConfiguration.scalaAspectPrefix+".")
            }
            genpackageName.append(".")
				
//            if (par.getIsAbstract())
//                viewDef.append( " abstract")
					
					
				
            var param : StringBuilder = new StringBuilder
            par.generateParamerterClass(param);
            
            if (Util.hasEcoreTag(par) ){
                var  implName:String = Util.getImplPackageSuffix(packageName.toString)
                viewDefTemp.append(" class Rich"+par.getName() + param.toString)
                if (Util.hasEcoreFromAPITag(par))
                    viewDefTemp.append(" extends "+ Util.protectScalaKeyword(k2.utils.TypeEquivalence.getTypeEquivalence(genpackageName.toString + par.getName()))+ param.toString)
                else
                    viewDefTemp.append(" extends "+ Util.protectScalaKeyword(k2.utils.TypeEquivalence.getTypeEquivalence(genpackageName.toString+implName.substring(1,implName.size) + par.getName()+"Impl"))+ param.toString)
                viewDefTemp.append(" with "+Util.protectScalaKeyword(packageName.toString +"."+par.getName+"Aspect") + param.toString+ " ")



                if (!par.eContainer.asInstanceOf[NamedElement].getQualifiedNameCompilo.contains("org.kermeta")){//!IsObjectClassChildren(par)){
                    viewDefTemp.append("with " + "_root_.k2.standard.KermetaObject")
                    if (Util.hasEcoreFromAPITag(par))
                        viewDefTemp.append(" with k2.standard.EObjectImplForPrimitive")
                }
                viewDefTemp.append("\n")


                /*if("EObject".equals(par.getName)){
                    implicitDef append " implicit def richAspect"+ param.toString+"(v : "+ Util.protectScalaKeyword(k2.utils.TypeEquivalence.getTypeEquivalence(genpackageName.toString+par.getName()))+ param.toString+") = v.asInstanceOf[org.kermeta.language.structureScalaAspect.aspect.KermetaModelElementAspect]\n"
                }else*/ if("EGenericType".equals(par.getName)) {
                  implicitDef.append(" implicit def richAspect(v : org.eclipse.emf.ecore.EGenericType) : "+ org.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix +".org.eclipse.emf.ecore.EGenericTypeAspect = { \n")
                implicitDef.append(" if (v.isInstanceOf["+ org.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix +".org.eclipse.emf.ecore.EGenericTypeAspect])\n")
                implicitDef.append("  return v.asInstanceOf["+ org.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix +".org.eclipse.emf.ecore.EGenericTypeAspect]\n")
                implicitDef.append(" else\n")
                implicitDef.append("  return utils.ConvertGenericType.convert(v).asInstanceOf["+ org.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix +".org.eclipse.emf.ecore.EGenericTypeAspect]\n")
             implicitDef.append("  }\n")

                }
                else {
                    implicitDef append " implicit def richAspect"+ param.toString+"(v : "+ Util.protectScalaKeyword(k2.utils.TypeEquivalence.getTypeEquivalence(genpackageName.toString+par.getName()))+ param.toString+") = v.asInstanceOf["+ (Util.protectScalaKeyword(packageName.toString)+"."+ par.getName+"Aspect").replace(GlobalConfiguration.scalaAspectPrefix + ".org.kermeta.language.structure.KermetaModelElementAspect1", "org.kermeta.language.structureScalaAspect.aspect.KermetaModelElementAspect"+ param.toString)+ param.toString+"]\n"
               

                }
                if (Util.hasEcoreFromAPITag(par) || par.getIsAbstract){
                    implicitDef append " implicit def richAspect"+ param.toString+"(v : "+ Util.protectScalaKeyword(packageName.toString+"."+par.getName()+"Aspect") + param.toString+") = v.asInstanceOf["+ Util.protectScalaKeyword(par.eContainer().asInstanceOf[KermetaModelElementAspect].getQualifiedNameCompilo+ "." + par.getName)+ param.toString+"]\n"
                }
                else
                    implicitDef append " implicit def richAspect"+ param.toString+"(v : "+ Util.protectScalaKeyword(packageName.toString+"."+par.getName()+"Aspect") + param.toString+") = v.asInstanceOf["+ Util.protectScalaKeyword(par.eContainer().asInstanceOf[KermetaModelElementAspect].getQualifiedNameCompilo+ Util.getImplPackageSuffix(packageName.toString) + par.getName+"Impl")+ param.toString+"]\n"
            }else{

                //Tisse la class d'implem ecore hérité'
                var cd = getEcoreSuperClass(par)
					
                //cd.eContainer().asInstanceOf[KermetaModelElementAspect].getQualifiedNameCompilo +".impl." + cd.getName +"Impl
                viewDefTemp.append(" class Rich"+par.getName()+ param.toString +" extends ")
                if (!IsAnExceptionChildren(par)){
                   if (cd != null ){
                  viewDefTemp.append(cd.eContainer().asInstanceOf[KermetaModelElementAspect].getQualifiedNameCompilo +".impl." + cd.getName +"Impl with ")
                }
                }
                viewDefTemp.append( k2.utils.TypeEquivalence.getTypeEquivalence(packageName.toString +"."+ par.getName())+ param.toString +" with "+packageName.toString +"."+par.getName+"Aspect" + param.toString )
                    var superClassName :String = "k2.standard.Object"
         if (cd!=null){
        superClassName= cd.eContainer().asInstanceOf[KermetaModelElementAspect].getQualifiedNameCompilo + "." + cd.getName
         }
              if (!(classOf[Object].getCanonicalName.equals(superClassName)
                      || classOf[org.kermeta.language.structure.Constraint].getCanonicalName.equals(superClassName)) ){
                           viewDefTemp.append(" with " + "_root_.k2.standard.KermetaObject with k2.standard.EObjectImplForPrimitive")
                }else{
                    
                    //println(cd.eContainer().asInstanceOf[KermetaModelElementAspect].getQualifiedNameCompilo + "."+ cd.getName)
                }
                viewDefTemp.append(" \n")

                implicitDef append " implicit def richAspect" + param.toString + "(v : "+ k2.utils.TypeEquivalence.getTypeEquivalence(packageName.toString+"."+par.getName())+ param.toString +") = v.asInstanceOf["+ packageName.toString+"."+par.getName+"Aspect"+ param.toString +"]\n"
                implicitDef append " implicit def richAspect" + param.toString +"(v : "+ packageName.toString+"."+par.getName()+"Aspect" + param.toString +") = v.asInstanceOf["+ packageName.toString+"."+par.getName+ param.toString +"]\n"

            }
				
            if (!par.getIsAbstract()){
                viewDef.append(viewDefTemp.toString)
                if (Util.hasEcoreTag(par)){
                    if (!Util.hasEcoreFromAPITag(par))
                        factoryDefClass append " override"
                    factoryDefClass append " def create"+par.getName()+ param.toString +"() : "+ Util.protectScalaKeyword(k2.utils.TypeEquivalence.getTypeEquivalence(genpackageName.toString+par.getName())+param.toString)+" = { new "+ Util.protectScalaKeyword(packageName.toString)+".Rich"+par.getName + param.toString +" }\n"
                }
                else{
                    factoryDefClass append " def create"+par.getName()+ param.toString +"() : "+ Util.protectScalaKeyword(k2.utils.TypeEquivalence.getTypeEquivalence(packageName.toString+"."+par.getName())+param.toString)+" = { new "+ Util.protectScalaKeyword(packageName.toString)+".Rich"+par.getName+ param.toString +" }\n"
                }
            }
        }
    }
	
    def getEcoreSuperClass(c:ClassDefinition):ClassDefinition={
        c.getSuperType.foreach(e=>
		
            {
                if (Util.hasEcoreTag(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition]))
                {
                    return e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition]
                }
            }
        )
        c.getSuperType.foreach(e=>
            return getEcoreSuperClass(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition])
        )
		
		
		
        return null;
    }



    def IsObjectClassChildren(c:ClassDefinition):Boolean={
        c.getSuperType.foreach(e=>
		
            {
                if ("Object".equals(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getName))
                {
                    return true
                }
            }
        )
        c.getSuperType.foreach(e=>
            return IsObjectClassChildren(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition])
        )
		
		
		
        return false;
    }


    def IsAnExceptionChildren(c:ClassDefinition):Boolean={
        c.getSuperType.foreach(e=>
            {
                if ("Exception".equals(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getName))
                {
                    return true
                }
            }
        )
        c.getSuperType.foreach(e=>
            return IsAnExceptionChildren(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition])
        )
        return false;
    }

	
    def close {
        implicitDef append "}\n"
        Util.generateFile(GlobalConfiguration.frameworkGeneratedPackageName, GlobalConfiguration.implicitConvTraitName, implicitDef.toString())
    }

    def genetateUtilObject() = {
        var template = new StringTemplate("package scalaUtil\n object Util {\n    def getMetaClass(t:String):org.kermeta.language.structure.Class={\n "+
                                          "var cd : org.kermeta.language.structure.ClassDefinition =   _root_.k2.utils.ReflexivityLoader.getMetaClass(t);\n"+
                                          "if (cd !=null){\n"+
                                          "            var cl = "+org.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix+".org.kermeta.language.structure. "+GlobalConfiguration.factoryName+".createClass\n"+
                                          "            cl.setTypeDefinition(cd)\n"+
                                          "          return cl\n"+
                                          "        }else\n"+
                                          "            return null;\n}\n"+
                                          "    def clone(t:org.kermeta.language.structure.Class, o:Any):Any={return null;\n}\n"
                                          + "}\n")

        Util.generateFile("scalaUtil","Util", template.toString)


    }

	
}
