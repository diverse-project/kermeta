
package org.kermeta.compilo.scala.visitor.impl

import org.kermeta.compilo.scala.rich._
import org.kermeta.compilo.scala.rich.richAspect._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.compilo.scala.visitor._
import org.kermeta.language.util.ModelingUnit

class ScalaFactoryAndImplicitVisitor(compilerConfiguration: CompilerConfiguration) extends IVisitor with LogAspect {

  var viewDef: StringBuilder = _
  var implicitDef: StringBuilder = _
  var actualPackage: String = _
  var factoryDefClass: StringBuilder = _

  var visitor: PackageVisitor = new PackageVisitor(compilerConfiguration)

  def initForEclipseEcorePackage(parentpack: Package, pack: Package): String = {
    var packNam = pack.getName()
    var res: StringBuilder = new StringBuilder
    var packNameUpper: String = packNam.substring(0, 1).toUpperCase + packNam.substring(1, packNam.size)

    var packName: String = null
    var packNameMM: String = null

    if (parentpack == null) {
      packName = packNam
      packNameMM = visitor.getQualifiedName(pack)
    } else {
      packName = visitor.getPQualifiedName(parentpack) + "." + packNam
      packNameMM = visitor.getQualifiedName(parentpack) + "." + packNam
    }
    packName = k2.utils.TypeEquivalence.getPackageEquivalence(packName)
    var impName = packName + Util.getImplPackageSuffix(packName) + Util.getPackagePrefix(packNameUpper) + "PackageImpl"

    res.append("_root_." + Util.protectScalaKeyword(impName + ".init()"))
    res.append(".setEFactoryInstance(")
    res.append(Util.protectScalaKeyword( /*GlobalConfiguration.scalaAspectPrefix + "." +*/ packNameMM + "." + GlobalConfiguration.factoryName + ""))
    res.append(")")
    res.append("\n")
    return res.toString()
  }

  def initForEcorePackage(parentpack: Package, pack: Package): String = {
    var packNam = pack.getName()
    var res: StringBuilder = new StringBuilder
    var packNameUpper: String = packNam.substring(0, 1).toUpperCase + packNam.substring(1, packNam.size)

    var packName: String = null
    var packNameMM: String = null

    if (parentpack == null) {
      packName = packNam
      packNameMM = visitor.getQualifiedName(pack)
    } else {
      packName = visitor.getPQualifiedName(parentpack) + "." + packNam
      packNameMM = visitor.getQualifiedName(parentpack) + "." + packNam
    }
    packName = k2.utils.TypeEquivalence.getPackageEquivalence(packName)
    var impName = packName + Util.getImplPackageSuffix(packName) + Util.getPackagePrefix(packNameUpper) + "PackageImpl"
    if (packName.equals("org.eclipse.emf.ecore")) {
      //res.append("\n{\n\tvar c : java.lang.reflect.Constructor[_] = classOf["+impName+"].getDeclaredConstructors.first\n")
      //res.append("\tc.setAccessible(true);\n")
      res.append("\n    {\n      var pack : _root_.org.eclipse.emf.ecore.EcorePackage =  _root_.org.eclipse.emf.ecore.impl.EcorePackageImpl.init\n")
      res.append("      _root_.org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(_root_.org.eclipse.emf.ecore.EcorePackage.eNS_URI,pack)\n")

      //            res.append("\tvar pack : "+ impName + " =  c.newInstance().asInstanceOf["+ impName + "]\n")
      res.append("      pack.setEFactoryInstance(" + packNameMM + "." + GlobalConfiguration.factoryName + ")\n ")
      res.append("      var f : java.lang.reflect.Field = classOf[_root_.org.eclipse.emf.ecore.impl.EPackageImpl].getDeclaredField(\"ecoreFactory\")\n")
      res.append("      f.setAccessible(true)\n")
      if (packName.equals("org.eclipse.emf.ecore")) {
        res.append("      f.set(pack, " + packNameMM + "." + GlobalConfiguration.factoryName + ")\n")
      }
      res.append("      _root_.org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(_root_." + Util.protectScalaKeyword(packName) + "." + packNameUpper + "Package.eNS_URI, pack)\n")
      res.append("      k2.persistence.EcorePackages.getPacks().put(_root_." + Util.protectScalaKeyword(packName) + "." + packNameUpper + "Package.eNS_URI, pack)\n")
      res.append("      " + impName + ".init\n    }\n")
      return res.toString
    } else {
      res.append("\n    {\n")
      res.append("      var pack : _root_." + Util.protectScalaKeyword(packName + "." + Util.getPackagePrefix(packNameUpper) + "Package") + " = _root_." + Util.protectScalaKeyword(impName + ".init") + "\n")
      res.append("      _root_.org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(_root_." + Util.protectScalaKeyword(packName + "." + Util.getPackagePrefix(packNameUpper) + "Package.eNS_URI") + ", pack)\n")
      res.append("      k2.persistence.EcorePackages.getPacks().put(_root_." + Util.protectScalaKeyword(packName + "." + Util.getPackagePrefix(packNameUpper) + "Package.eNS_URI") + ", pack)\n")
      res.append("      pack.setEFactoryInstance(")
      res.append(Util.protectScalaKeyword( /*GlobalConfiguration.scalaAspectPrefix + "." + */ packNameMM + "." + GlobalConfiguration.factoryName + ""))
      res.append(")")
      res.append("\n    }\n\n")
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
    implicitDef append "package " + GlobalConfiguration.frameworkGeneratedPackageName + "\n"
    implicitDef append "object " + GlobalConfiguration.implicitConvTraitName + " {\n"
    /*    implicitDef.append("implicit def richAspect(o : _root_.java.lang.Object)  =  o match {\n")
    implicitDef.append("  case s:String => new k2.standard.RichString(s)\n")
    implicitDef.append("   case s : java.lang.Boolean => new k2.standard.RichBoolean(s)\n")
    implicitDef.append("   case s : java.lang.Integer =>\n")
    implicitDef.append(" new k2.standard.RichInteger(s.intValue)\n")
    implicitDef.append("   case s:  " + "k2.standard.KermetaObject => s\n")
    implicitDef.append("   case _ =>  if (o!=null)\n")
    implicitDef.append("     new k2.standard.RichEnum(o)\n")
    implicitDef.append("    else\n")
    implicitDef.append("       null.asInstanceOf[k2.standard.EObjectImplForPrimitive]\n")
    implicitDef.append(" }\n")
*/
    factoryDefClass = new StringBuilder
  }
  var ecorePackages: java.util.List[Package] = _

  /**
   * update ecorePackages with this package and subpackage if they comes from ecore
   */
  def addPackage(packs: java.util.List[Package]): Unit = {
    packs.foreach({ e =>
      if (Util.hasEcoreTag(e))
        ecorePackages.add(e);
      addPackage(e.getNestedPackage())
    })
  }

  def visit(par: ModelingUnit) {
    // gestion des cas des package venant d'ecore
    ecorePackages = new java.util.ArrayList[Package]()
    par.getMetamodels().foreach({ mm => addPackage(mm.getPackages()) })

    
    
    var res: StringBuilder = new StringBuilder
    var resinitEclipse: StringBuilder = new StringBuilder
    res.append("package " + GlobalConfiguration.scalaAspectPrefix + "runner \n")
    res.append("import java.io.PrintStream\n")
    res.append("import " + GlobalConfiguration.frameworkGeneratedPackageName + "." + GlobalConfiguration.implicitConvTraitName + "._\n")

    // generates the common part for all runners
    res.append("class DefaultRunner  {\n")
    //res.append("def main(args : Array[String]) : Unit = {\n\t" )
    res.append("  def init() : Unit = {\n    ")
    if (GlobalConfiguration.isTest) {
      res.append("System.setOut(new PrintStream(\"outputStream\"));\n")
    }
    res.append("    k2.persistence.EcorePackages.workspaceURI = \"" + GlobalConfiguration.workspaceURI + "\"\n")
    res.append("    k2.persistence.EcorePackages.pluginURI = \"" + GlobalConfiguration.pluginURI + "\";\n")
    java.util.Collections.sort(ecorePackages, new java.util.Comparator[Package] {
      def compare(o1: Package, o2: Package): Int = {
        if ("ecore".equals(o1.getName))
          return -1;
        else if ("ecore".equals(o2.getName))
          return 1;
        else
          return 0;

      };
      override def equals(obj: Any): Boolean = false;
    });
    ecorePackages.foreach(e => //if (!(e.getQualifiedName.startsWith("kermeta")|| e.getQualifiedName.startsWith("language")))
      if (!(e.getOwnedTypeDefinition.size() == 0 ||
        e.getOwnedTypeDefinition.filter(t => t.isInstanceOf[ClassDefinition]).filter(t => Util.hasEcoreTag(t)).size == 0 ||
        e.getOwnedTypeDefinition.filter(t => t.isInstanceOf[ClassDefinition]).forall(t => Util.hasCompilerIgnoreTag(t)))) {
        if (!Util.hasEcoreFromAPITag(e)) {

          if (e.getNestingPackage() == null) {
            res.append(initForEcorePackage(null, e))
            resinitEclipse.append(initForEclipseEcorePackage(null, e))
          } else {
            res.append(initForEcorePackage(e.getNestingPackage(), e))
            resinitEclipse.append(initForEclipseEcorePackage(e.getNestingPackage(), e))

          }
        }
      })

    res.append("\n      k2.utils.ReflexivityLoader.pref(\"" + GlobalConfiguration.scalaAspectPrefix + "\")\n")
    res.append("\n      k2.utils.UTilScala.setScalaAspectPrefix(\"" + GlobalConfiguration.scalaAspectPrefix + "\")\n")

    res.append("  }\n")
    res.append("  def init4eclipse() : Unit = {\n\t")
    res.append(resinitEclipse.toString)
    res.append("\n    k2.utils.ReflexivityLoader.pref(\"" + GlobalConfiguration.scalaAspectPrefix + "\")\n")
    res.append("\n    k2.utils.UTilScala.setScalaAspectPrefix(\"" + GlobalConfiguration.scalaAspectPrefix + "\")\n")
    res.append("  }\n")

    res.append("}\n")

    val mrg = new MainRunnerGenerator(ecorePackages, visitor, compilerConfiguration)
    // generates the default runner file
    mrg.generateDefaultRunner(par, res)
    Util.generateFile(GlobalConfiguration.scalaAspectPrefix + "runner", "DefaultRunner", res.toString())

    // generate the Util.scala file (used for call on Types)
    UtilObjectGenerator.genetateUtilObject(compilerConfiguration.kermetaStandardMMName)

    //par.getMetamodels().foreach(mm => new AcceptableMetamodel(mm).accept(this))

    new AcceptableMetamodel(par.getCurrentMetamodel()).accept(this)
  }

  def visit(mm: Metamodel) {

    mm.getPackages().foreach(p => new AcceptablePackage(p).accept(this))

    //MODELTYPE ADDITION
    mm.getOwnedModelTypeDefinitions().foreach(mtd => new AcceptableModelTypeDefinition(mtd).accept(this))

    //ViewType for ModelTypeDefinition generation
    var viewtype: StringBuilder = new StringBuilder
    viewtype.append("package ")
    viewtype.append(Util.getQualifiedName(mm))
    viewtype.append("\n")
    mm.getOwnedModelTypeDefinitions().foreach(mtd => {
      viewtype.append("class Rich")
      viewtype.append(mtd.getName())
      viewtype.append(" extends ")
      viewtype.append(mtd.getName())
      viewtype.append(" with ")
      viewtype.append(mtd.getName())
      viewtype.append("Aspect")
      viewtype.append("\n")
    })
    Util.generateFile(Util.getQualifiedName(mm), GlobalConfiguration.viewDefTraitName, viewtype.toString())

  }

  def visit(par: Package) {

    if (Util.doesGeneratePackage(visitor.getQualifiedName(par))) {

      actualPackage = k2.utils.TypeEquivalence.packageEquivelence.get(visitor.getQualifiedName(par))
      if (actualPackage == null)
        actualPackage = visitor.getQualifiedName(par)
      /*if (Util.hasEcoreTag(par))
        actualPackage = GlobalConfiguration.scalaAspectPrefix + "." + actualPackage;
		*/
      if (!(par.getOwnedTypeDefinition.size() == 0 || par.getOwnedTypeDefinition.filter(t => t.isInstanceOf[ClassDefinition]).forall(t => Util.hasCompilerIgnoreTag(t)))) {
        var factoryDef: StringBuilder = new StringBuilder

        factoryDef append "package " + Util.protectScalaKeyword(actualPackage.toString) + "\n"
        factoryDef append "import " + GlobalConfiguration.frameworkGeneratedPackageName + "." + GlobalConfiguration.implicitConvTraitName + "._\n"

        factoryDef append "object " + GlobalConfiguration.factoryName
        //e.getOwnedTypeDefinition.filter(t=> t.isInstanceOf[ClassDefinition]).filter(t=> Util.hasEcoreTag(t)).size==0
        if (par.getOwnedTypeDefinition.size != 0 && par.getOwnedTypeDefinition.filter(t => t.isInstanceOf[ClassDefinition]).filter(e => Util.hasEcoreTag(e)).size > 0 && !Util.hasEcoreFromAPITag(par)) {
          factoryDef.append(" extends " + Util.protectScalaKeyword(k2.utils.TypeEquivalence.getPackageEquivalence(visitor.getPQualifiedName(par)) + Util.getImplPackageSuffix(actualPackage) + Util.getPackagePrefix(par.getName.substring(0, 1).toUpperCase + par.getName.substring(1, par.getName.size)) + "FactoryImpl"))
        }
        factoryDef append "{\n"
        viewDef append "package " + Util.protectScalaKeyword(actualPackage.toString) + "\n"
        //viewDef append "trait "+viewDefTraitName+"{\n"

        factoryDefClass.clear
        par.getOwnedTypeDefinition.filter(p => p.isInstanceOf[ClassDefinition]).foreach(p => new AcceptableClassDef(p.asInstanceOf[ClassDefinition]).accept(this))
        factoryDef.append(factoryDefClass.toString())
        //viewDef append "}\n"
        factoryDef append "}\n"
        Util.generateFile(actualPackage, GlobalConfiguration.factoryName, factoryDef.toString())
        Util.generateFile(actualPackage, GlobalConfiguration.viewDefTraitName, viewDef.toString())
        viewDef.clear
        factoryDef.clear
      }
      par.getNestedPackage.foreach(p => { new AcceptablePackage(p).accept(this) }) // Go futher in subpackage

    }

  }

  //TODO à faire sauter quand bug héritage diamant résolu
  var _list: java.util.List[String] = new java.util.ArrayList[String]();
  def list() = _list

  def visit(par: ClassDefinition) {
    var s = visitor.getQualifiedNameCompilo(par)
    if (list.contains(s))
      return
    else
      list.add(s)

    if (!Util.hasCompilerIgnoreTag(par)) {
      // start by creating the main operation files
      val mrg = new MainRunnerGenerator(ecorePackages, visitor, compilerConfiguration)
      mrg.generateRunnersForClassDefinition(par)

      // then contributes the implicit conversions to the various String Builders (implicitDef, viewDef and factoryDefClass)      
      var genpackageName: StringBuilder = new StringBuilder
      var ecorepackageName: StringBuilder = new StringBuilder
      var packageName: StringBuilder = new StringBuilder
      var viewDefTemp: StringBuilder = new StringBuilder

      ecorepackageName.append(k2.utils.TypeEquivalence.getPackageEquivalence(visitor.getPQualifiedName(par.eContainer)))
      ecorepackageName.append(".")
      genpackageName.append(k2.utils.TypeEquivalence.getPackageEquivalence(visitor.getQualifiedName(par.eContainer)))
      packageName.append(genpackageName.toString)
      
      genpackageName.append(".")

      var param: StringBuilder = new StringBuilder
      var paramWithBounds : StringBuilder = new StringBuilder
      visitor.generateParamerterClass(par, param);
      visitor.generateParamerterClassWithBounds(par, paramWithBounds);

      if (Util.hasEcoreTag(par)) {
        if (!Util.isAMapEntry(par)) {
          var implName: String = Util.getImplPackageSuffix(packageName.toString)
          viewDefTemp.append(" class Rich" + par.getName() + paramWithBounds.toString)
          if (Util.hasEcoreFromAPITag(par))
            viewDefTemp.append(" extends " + Util.protectScalaKeyword(k2.utils.TypeEquivalence.getTypeEquivalence(ecorepackageName.toString + par.getName())) + param.toString)
          else
            viewDefTemp.append(" extends " + Util.protectScalaKeyword(k2.utils.TypeEquivalence.getTypeEquivalence(ecorepackageName.toString + implName.substring(1, implName.size) + par.getName() + "Impl")) + param.toString)
          viewDefTemp.append(" with " + Util.protectScalaKeyword(packageName.toString + "." + par.getName + "Aspect") + param.toString + " ")

          if (!visitor.getQualifiedNameCompilo(par.eContainer).contains("org.kermeta")) { //!IsObjectClassChildren(par)){
            viewDefTemp.append("with " + "k2.standard.KermetaObject")
            if (Util.hasEcoreFromAPITag(par))
              viewDefTemp.append(" with k2.standard.EObjectImplForPrimitive")
          }
          viewDefTemp.append("\n")
        }

        /*
         * Implicit generation if Util.hasEcoreTag(par)
         */
        if ("EObject".equals(par.getName)) {
          implicitDef append " implicit def richAspect" + paramWithBounds.toString + "(v : " + Util.protectScalaKeyword(k2.utils.TypeEquivalence.getTypeEquivalence(ecorepackageName.toString + par.getName())) + param.toString + ") = v.asInstanceOf[k2.standard.KermetaObject]\n"
        } else if ("EGenericType".equals(par.getName)) {
          implicitDef.append(" implicit def richAspect(v : org.eclipse.emf.ecore.EGenericType) : " + Util.protectScalaKeyword(packageName.toString + "." + par.getName + "Aspect") + " = { \n")
          implicitDef.append(" if (v.isInstanceOf[" + Util.protectScalaKeyword(packageName.toString + "." + par.getName + "Aspect") + "])\n")
          implicitDef.append("  return v.asInstanceOf[" + Util.protectScalaKeyword(packageName.toString + "." + par.getName + "Aspect") + "]\n")
          implicitDef.append(" else\n")
          implicitDef.append("  return k2.utils.ConvertGenericType.convert(v).asInstanceOf[" + Util.protectScalaKeyword(packageName.toString + "." + par.getName + "Aspect") + "]\n")
          implicitDef.append("  }\n")

        } else if (Util.isAMapEntry(par)) {
          implicitDef append " implicit def richAspect(v : "
          implicitDef append Util.protectScalaKeyword(visitor.getQualifiedNameCompilo(par))
          implicitDef append Util.protectScalaKeyword(") = v.wrappedvalue\n")
        } else {
          implicitDef append " implicit def richAspect" + paramWithBounds.toString + "(v : " + Util.protectScalaKeyword(k2.utils.TypeEquivalence.getTypeEquivalence(ecorepackageName.toString + par.getName())) + param.toString + ") = v.asInstanceOf[" + (Util.protectScalaKeyword(packageName.toString) + "." + par.getName + "Aspect").replace(GlobalConfiguration.scalaAspectPrefix + ".org.kermeta.language.structure.ObjectAspect", "org.kermeta.language.structureScalaAspect.aspect.ObjectAspect" + param.toString) + param.toString + "]\n"

        }
        if (Util.hasEcoreFromAPITag(par) || par.getIsAbstract) {
          implicitDef append " implicit def richAspect" + paramWithBounds.toString + "(v : " + Util.protectScalaKeyword(packageName.toString + "." + par.getName() + "Aspect") + param.toString + ") = v.asInstanceOf[" + Util.protectScalaKeyword(visitor.getPQualifiedNameCompilo(par.eContainer()) + "." + par.getName) + param.toString + "]\n"
        } else if (Util.isAMapEntry(par)) {

          implicitDef append " implicit def richAspect(v : "
          implicitDef append Util.getQualifiedNameForMapEntry(par, visitor, true)
          implicitDef append ") = new "
          implicitDef.append(visitor.getQualifiedNameCompilo(par))
          implicitDef.append(" ( v )\n")
        } else
          implicitDef append " implicit def richAspect" + paramWithBounds.toString + "(v : " + Util.protectScalaKeyword(packageName.toString + "." + par.getName() + "Aspect") + param.toString + ") = v.asInstanceOf[" + Util.protectScalaKeyword(visitor.getPQualifiedNameCompilo(par.eContainer()) + Util.getImplPackageSuffix(packageName.toString) + par.getName + "Impl") + param.toString + "]\n"
      } else {

        //Tisse la class d'implem ecore hérité'
        var cd = getEcoreSuperClass(par)

        //cd.eContainer().asInstanceOf[KermetaModelElementAspect].getQualifiedNameCompilo +".impl." + cd.getName +"Impl
        viewDefTemp.append(" class Rich" + par.getName() + paramWithBounds.toString + " extends ")
        if (!IsAnExceptionChildren(par)) {
          if (cd != null) {
            viewDefTemp.append(visitor.getQualifiedNameCompilo(cd.eContainer().asInstanceOf[KermetaModelElement]) + ".impl." + cd.getName + "Impl with ")
          }
        }
        viewDefTemp.append(k2.utils.TypeEquivalence.getTypeEquivalence(packageName.toString + "." + par.getName()) + param.toString + " with " + packageName.toString + "." + par.getName + "Aspect" + param.toString)
        var superClassName: String = "k2.standard.KermetaObject"
        if (cd != null) {
          superClassName = visitor.getQualifiedNameCompilo(cd.eContainer().asInstanceOf[KermetaModelElement]) + "." + cd.getName
        }

        if (!(classOf[Object].getCanonicalName.equals(superClassName)
          || classOf[org.kermeta.language.structure.Constraint].getCanonicalName.equals(superClassName))) {
          viewDefTemp.append(" with " + "_root_.k2.standard.KermetaObject ")
          if (!IsAnExceptionChildren(par) && cd == null)
            viewDefTemp.append("with k2.standard.EObjectImplForPrimitive")
        } else {
          //println(cd.eContainer().asInstanceOf[KermetaModelElementAspect].getQualifiedNameCompilo + "."+ cd.getName)
        }

        viewDefTemp.append(" \n")
     
        /*
         * Implicit generation if !Util.hasEcoreTag(par)
         */
        implicitDef append " implicit def richAspect" + paramWithBounds.toString + "(v : " + k2.utils.TypeEquivalence.getTypeEquivalence(packageName.toString + "." + par.getName()) + param.toString + ") = v.asInstanceOf[" + packageName.toString + "." + par.getName + "Aspect" + param.toString + "]\n"
        implicitDef append " implicit def richAspect" + paramWithBounds.toString + "(v : " + packageName.toString + "." + par.getName() + "Aspect" + param.toString + ") = v.asInstanceOf[" + packageName.toString + "." + par.getName + param.toString + "]\n"
      }

      if (!par.getIsAbstract()) {
        viewDef.append(viewDefTemp.toString)
        if (Util.hasEcoreTag(par)) {
          if (!Util.isAMapEntry(par)) {
            if (!Util.hasEcoreFromAPITag(par)) {
              factoryDefClass.append(" override")
            }
            factoryDefClass.append(" def create" + par.getName() + paramWithBounds.toString + "() : " + Util.protectScalaKeyword(k2.utils.TypeEquivalence.getTypeEquivalence(ecorepackageName.toString + par.getName()) + param.toString) + " = { ")
            generateCreateBody(packageName.toString(), par.getName(), param.toString(), factoryDefClass)
            factoryDefClass.append(" }\n")
          }
        } else {
          factoryDefClass.append(" def create" + par.getName() + paramWithBounds.toString + "() : " + Util.protectScalaKeyword(k2.utils.TypeEquivalence.getTypeEquivalence(packageName.toString + "." + par.getName()) + param.toString) + " = { ")
          generateCreateBody(packageName.toString(), par.getName(), param.toString(), factoryDefClass)
          factoryDefClass.append(" }\n")
        }
      }
    }
  }

  def generateCreateBody(packageName: String, cdName: String, param: String, res: StringBuilder) = {
    res.append("new " + "_root_." + Util.protectScalaKeyword(packageName.toString) + ".Rich" + cdName + param)
  }

  def getEcoreSuperClass(c: ClassDefinition): ClassDefinition = {
    c.getSuperType.foreach(e =>

      {
        if (Util.hasEcoreTag(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition])) {
          return e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition]
        }
      })
    c.getSuperType.foreach(e =>
      return getEcoreSuperClass(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition]))

    return null;
  }

  def IsObjectClassChildren(c: ClassDefinition): Boolean = {
    c.getSuperType.foreach(e =>

      {
        if ("Object".equals(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getName)) {
          return true
        }
      })
    c.getSuperType.foreach(e =>
      return IsObjectClassChildren(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition]))

    return false;
  }

  def IsAnExceptionChildren(c: ClassDefinition): Boolean = {
    c.getSuperType.foreach(e =>
      {
        if ("Exception".equals(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition].getName)) {
          return true
        }
      })
    c.getSuperType.foreach(e =>
      return IsAnExceptionChildren(e.asInstanceOf[Class].getTypeDefinition.asInstanceOf[ClassDefinition]))
    return false;
  }

  def close {
    implicitDef append "}\n"
    Util.generateFile(GlobalConfiguration.frameworkGeneratedPackageName, GlobalConfiguration.implicitConvTraitName, implicitDef.toString())
  }

  //MODELTYPE ADDITION
  def visit(par: ModelTypeDefinition) = {    
    //TFactory generation
    var tfactory: StringBuilder = new StringBuilder
    tfactory.append("package ")
    tfactory.append(Util.getQualifiedName(par))
    tfactory.append("\n")
    tfactory.append("trait ")
    tfactory.append(Util.getModelTypeFactoryInterfaceName())
    tfactory.append(" {\n")
    tfactory.append(UtilModelTypeDefinition.getBoundedTypeMembers(par))

    tfactory.append("\tdef create_Model_")
    tfactory.append(par.getName())
    tfactory.append("() : ")
    tfactory.append("_root_.")
    tfactory.append(Util.getQualifiedName(par))
    tfactory.append("\n")

    par.getTypeDefinitions().foreach(td => {
      if (!Util.hasCompilerIgnoreTag(td)) {
        if (td.isInstanceOf[ClassDefinition] && !td.asInstanceOf[ClassDefinition].getIsAbstract()) {
          var param: StringBuilder = new StringBuilder
          visitor.generateParamerterClass(td.asInstanceOf[ClassDefinition], param)

          tfactory.append("\tdef create")
          tfactory.append(td.getName())
          tfactory.append(param)
          tfactory.append("() : ")
          tfactory.append(Util.getTypeMemberName(td))
          tfactory.append(param)
          tfactory.append("\n")
        }
      }
    })
    tfactory.append("\n}")
    Util.generateFile(Util.getQualifiedName(par), Util.getModelTypeFactoryInterfaceName(), tfactory.toString())

    //Factory generation
    var factory: StringBuilder = new StringBuilder
    factory.append("package ")
    factory.append(Util.getQualifiedName(par))
    factory.append("\n")
    factory.append("object ")
    factory.append(Util.getModelTypeFactoryTypeName())

    factory.append(" extends ")
    factory.append(Util.getModelTypeFactoryInterfaceName())
    par.getOwnedBindings().foreach(b => {
      factory.append(" with ")
      factory.append(Util.getModelTypeFactoryInterfaceQualifiedName(b.getBoundModelTypeDefinition()))
    })

    factory.append(" {\n")
    factory.append(UtilModelTypeDefinition.getFixedTypeMembers(par))

    factory.append("\tdef create_Model_")
    factory.append(par.getName())
    factory.append("() : ")
    factory.append("_root_.")
    factory.append(Util.getQualifiedName(par))
    factory.append(" = {\n")
    factory.append("\t\t")
    factory.append("return new ")
    factory.append("_root_.")
    factory.append(Util.getQualifiedPathWithMetamodel(par))
    factory.append(".Rich")
    factory.append(par.getName())
    factory.append("\t}\n")

    par.getTypeDefinitions().foreach(td => {
      if (!Util.hasCompilerIgnoreTag(td)) {
        if (td.isInstanceOf[ClassDefinition] && !td.asInstanceOf[ClassDefinition].getIsAbstract()) {
          var param: StringBuilder = new StringBuilder
          visitor.generateParamerterClass(td.asInstanceOf[ClassDefinition], param)

          factory.append("\tdef create")
          factory.append(td.getName())
          factory.append("() : ")
          factory.append(Util.getTypeMemberName(td))
          factory.append(param)
          factory.append(" = {\n\t\t")
          generateCreateBody(Util.getQualifiedPathWithMetamodel(td), td.getName(), param.toString(), factory)
          factory.append("\n\t}\n")
        }
      }
    })
    factory.append("\n}")
    
    Util.generateFile(Util.getQualifiedName(par), Util.getModelTypeFactoryTypeName(), factory.toString())
  }

}
