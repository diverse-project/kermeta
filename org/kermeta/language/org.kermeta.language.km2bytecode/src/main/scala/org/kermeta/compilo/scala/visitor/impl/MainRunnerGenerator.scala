package org.kermeta.compilo.scala.visitor.impl
import org.kermeta.language.util.ModelingUnit
import org.kermeta.compilo.scala.GlobalConfiguration
import org.kermeta.compilo.scala.CompilerConfiguration
import org.kermeta.language.structure.Operation
import org.kermeta.language.structure.Package
import org.kermeta.language.structure.ClassDefinition
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala.rich.richAspect.PackageVisitor
import org.kermeta.compilo.scala.Util
import org.kermeta.language.structure.Metamodel
import org.kermeta.language.structure.ModelTypeDefinition
import org.kermeta.language.structure.ModelTransformation

/**
 * generates the classes and objects for the declared main classes
 */
class MainRunnerGenerator(ecorePackages: java.util.List[Package], visitor: PackageVisitor, compilerConfiguration: CompilerConfiguration) {

  def generateDefaultRunner(mu: ModelingUnit, res: StringBuilder) {

    // var baseMetamodel: String = GlobalConfiguration.baseMetamodel()
    var mainClass: String = GlobalConfiguration.baseClass() //par.getKTag().filter{e=> "mainClass".equals(e.getName)}.first.getValue
    var mainOperation: String = GlobalConfiguration.baseOperation() // par.getKTag().filter{e=> "mainOperation".equals(e.getName)}.first.getValue

    var mainTransformationName: String = GlobalConfiguration.baseTransformation()

    var packageName: String = if (mainClass != null) { mainClass.substring(0, mainClass.lastIndexOf("::")).replace("::", ".").replace("^", ".") } else { "" }
    var className: String = if (mainClass != null) { mainClass.substring(mainClass.lastIndexOf("::") + 2) } else { "" }
    var mainClassDef: org.eclipse.emf.ecore.EObject = null
    var mainOperationSize = 0
    try {

      mainClassDef = mu.getAllMetamodelsContents().filter { e => e.isInstanceOf[ClassDefinition] }.filter(e => (new PackageVisitor(compilerConfiguration)).getQualifiedNameKermeta(e.asInstanceOf[ClassDefinition]).equals(mainClass)).toList.first

      mainOperationSize = mainClassDef.asInstanceOf[ClassDefinition].getOwnedOperation.filter { e => e.getName.equals(mainOperation) }.first.asInstanceOf[Operation].getOwnedParameter.size
    } catch {
      case e: java.util.NoSuchElementException => {
        mainClassDef = null
        mainOperation = null
      }
    }

    res.append("object DefaultRunner extends DefaultRunner {\n")
    res.append("  def main(args : Array[String]) : Unit = {\n")
    //if (packages.exists(pac=> "ecore".equals(pac.getName))){
    //     res.append("\t org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.asInstanceOf[org.eclipse.emf.ecore.EcoreFactoryWrapper].setWrap("+org.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix+".org.eclipse.emf.ecore."+GlobalConfiguration.factoryName+") \n \t" )
    //CopyEcoreFile.copyEcorefiles(GlobalConfiguration.outputFolder)
    //}
    res.append("    init() \n")
    res.append("    _root_.org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper.fillMapFromSystemPropertyFile(false)\n")
    if (mainClassDef != null && mainOperation != null) {
      res.append("    " + "_root_.")
      if (ecorePackages.filter { e => visitor.getQualifiedName(e).equals(packageName) }.size == 1) {
        res.append(GlobalConfiguration.scalaAspectPrefix + ".")

      }
      res.append(k2.utils.TypeEquivalence.getPackageEquivalence(packageName))

      res.append("." + GlobalConfiguration.factoryName + ".create" + className + "." + mainOperation)

      res.append("(")
      for (i <- 0 until mainOperationSize) {
        if (i != 0) { res.append(" , ") }
        res.append("args(" + i + ")")
      }
      res.append(")")
    }
    if (mainTransformationName != null) {
      var mm : Metamodel = mu.getCurrentMetamodel()
      var mtd : ModelTypeDefinition = null
      mm.getOwnedModelTypeDefinitions().foreach(m => {
        if (m.getName() == mm.getName()) {
          mtd = m
        }
      })
      var t : ModelTransformation = null
      mtd.getOwnedTransformations().foreach(mt => {
        if (mt.getName() == mainTransformationName) {
          t = mt
        }
      })
      
      res.append("    " + "_root_.")

      res.append(mm.getName())

      res.append("." + mtd.getName() + "." + Util.getModelTypeFactoryTypeName() + ".create_Model_" + mtd.getName + "." + t.getName)

      res.append("(")
      for (i <- 0 until t.getOwnedParameter().size()) {
        if (i != 0) { res.append(" , ") }
        res.append("args(" + i + ")")
      }
      res.append(")")
    }
    res.append("\n  }\n}")
  }

  /**
   * generates the main class for each of the operations with @main tag
   */
  def generateRunnersForClassDefinition(cd: ClassDefinition) {
    cd.getOwnedOperation().filter { op => Util.hasMainTag(op) }.foreach(op => { generateRunnerForMainOperation(op, cd, cd.eContainer().asInstanceOf[Package]) })
  }

  /**
   * generates the file for a given @main operation
   */
  def generateRunnerForMainOperation(op: Operation, cd: ClassDefinition, p: Package) {
    var res: StringBuilder = new StringBuilder
    var resinitEclipse: StringBuilder = new StringBuilder
    val packageFullName = visitor.getQualifiedName(p)
    val packageName = visitor.getPQualifiedName(p)
    res.append("package " + GlobalConfiguration.scalaAspectPrefix + "runner." + packageName + " \n")
    res.append("import " + GlobalConfiguration.scalaAspectPrefix + "runner.DefaultRunner\n")
    res.append("import " + GlobalConfiguration.frameworkGeneratedPackageName + "." + GlobalConfiguration.implicitConvTraitName + "._\n")
    res.append("object " + cd.getName + "_" + op.getName + " extends DefaultRunner {\n")
    res.append("  def main(args : Array[String]) : Unit = {\n")
    //if (packages.exists(pac=> "ecore".equals(pac.getName))){
    //     res.append("\t org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.asInstanceOf[org.eclipse.emf.ecore.EcoreFactoryWrapper].setWrap("+org.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix+".org.eclipse.emf.ecore."+GlobalConfiguration.factoryName+") \n \t" )
    //CopyEcoreFile.copyEcorefiles(GlobalConfiguration.outputFolder)
    //}
    res.append("    init() \n")
    res.append("    _root_.org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper.fillMapFromSystemPropertyFile(false)\n")

    res.append("    " + "_root_.")
    if (ecorePackages.filter { e => visitor.getQualifiedName(e).equals(packageFullName) }.size == 1) {
      res.append(GlobalConfiguration.scalaAspectPrefix + ".")

    }
    res.append(k2.utils.TypeEquivalence.getPackageEquivalence(packageFullName))

    res.append("." + GlobalConfiguration.factoryName + ".create" + cd.getName + "." + op.getName)

    res.append("(")
    for (i <- 0 until op.getOwnedParameter().size()) {
      if (i != 0) { res.append(" , ") }
      res.append("args(" + i + ")")
    }
    res.append(")")
    res.append("\n  }\n}")
    // generates the file
    Util.generateFile(GlobalConfiguration.scalaAspectPrefix + "runner." + packageName, cd.getName + "_" + op.getName, res.toString())
  }

  /**
   * generates the file for a given @main operation
   */
  def generateRunnerForMainTransformation(t: ModelTransformation, mtd: ModelTypeDefinition, mm: Metamodel) {
    var res: StringBuilder = new StringBuilder
    var resinitEclipse: StringBuilder = new StringBuilder
    val mmQName = visitor.getQualifiedName(mm)
    res.append("package " + GlobalConfiguration.scalaAspectPrefix + "runner." + mmQName + " \n")
    res.append("import " + GlobalConfiguration.scalaAspectPrefix + "runner.DefaultRunner\n")
    res.append("import " + GlobalConfiguration.frameworkGeneratedPackageName + "." + GlobalConfiguration.implicitConvTraitName + "._\n")
    res.append("object " + mtd.getName + "_" + t.getName + " extends DefaultRunner {\n")
    res.append("  def main(args : Array[String]) : Unit = {\n")
    //if (packages.exists(pac=> "ecore".equals(pac.getName))){
    //     res.append("\t org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.asInstanceOf[org.eclipse.emf.ecore.EcoreFactoryWrapper].setWrap("+org.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix+".org.eclipse.emf.ecore."+GlobalConfiguration.factoryName+") \n \t" )
    //CopyEcoreFile.copyEcorefiles(GlobalConfiguration.outputFolder)
    //}
    res.append("    init() \n")
    res.append("    _root_.org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper.fillMapFromSystemPropertyFile(false)\n")

    res.append("    " + "_root_.")

    res.append(mmQName)

    res.append("." + mtd.getName() + "." + Util.getModelTypeFactoryTypeName() + ".create_Model_" + mtd.getName + "." + t.getName)

    res.append("(")
    for (i <- 0 until t.getOwnedParameter().size()) {
      if (i != 0) { res.append(" , ") }
      res.append("args(" + i + ")")
    }
    res.append(")")
    res.append("\n  }\n}")
    // generates the file
    Util.generateFile(GlobalConfiguration.scalaAspectPrefix + "runner." + mmQName, mtd.getName + "_" + t.getName, res.toString())
  }

}