package org.kermeta.compilo.scala.visitor.impl
import org.kermeta.language.util.ModelingUnit
import org.kermeta.compilo.scala.GlobalConfiguration
import org.kermeta.language.structure.Operation
import org.kermeta.language.structure.Package
import org.kermeta.language.structure.ClassDefinition
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala.rich.richAspect.PackageVisitor
import org.kermeta.compilo.scala.Util
import org.kermeta.language.structure.Metamodel

/**
 * generates the classes and objects for the declared main classes
 */
class MainRunnerGenerator(ecorePackages: java.util.List[Package], visitor: PackageVisitor) {

  def generateDefaultRunner(mu: ModelingUnit, res: StringBuilder) {

    var mainClass: String = GlobalConfiguration.baseClass() //par.getKTag().filter{e=> "mainClass".equals(e.getName)}.first.getValue
    var mainOperation: String = GlobalConfiguration.baseOperation() // par.getKTag().filter{e=> "mainOperation".equals(e.getName)}.first.getValue
    var packageName: String = mainClass.substring(0, mainClass.lastIndexOf("::")).replace("::", ".")
    var className: String = mainClass.substring(mainClass.lastIndexOf("::") + 2).replace("::", ".")
    var mainClassDef: org.eclipse.emf.ecore.EObject = null
    var mainOperationSize = 0
    try {
      
      
      mainClassDef = mu.getAllMetamodelsContents().filter { e => e.isInstanceOf[ClassDefinition] }.filter(e => (new PackageVisitor).getQualifiedNameKermeta(e.asInstanceOf[ClassDefinition]).equals(mainClass)).toList.first
      
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
    res.append("    org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper.fillMapFromSystemPropertyFile(false)\n")
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
    val packageName = visitor.getQualifiedName(p)
    res.append("package " + GlobalConfiguration.scalaAspectPrefix + "runner." + packageName + " \n")
    res.append("import " + GlobalConfiguration.scalaAspectPrefix + "runner.DefaultRunner\n")
    res.append("import " + GlobalConfiguration.frameworkGeneratedPackageName + "." + GlobalConfiguration.implicitConvTraitName + "._\n")
    res.append("object "+cd.getName+"_"+op.getName+" extends DefaultRunner {\n")
    res.append("  def main(args : Array[String]) : Unit = {\n")
    //if (packages.exists(pac=> "ecore".equals(pac.getName))){
    //     res.append("\t org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.asInstanceOf[org.eclipse.emf.ecore.EcoreFactoryWrapper].setWrap("+org.kermeta.compilo.scala.GlobalConfiguration.scalaAspectPrefix+".org.eclipse.emf.ecore."+GlobalConfiguration.factoryName+") \n \t" )
    //CopyEcoreFile.copyEcorefiles(GlobalConfiguration.outputFolder)
    //}
    res.append("    init() \n")
    res.append("    org.kermeta.utils.helpers.emf.ExtensibleURIConverterImplURIMapHelper.fillMapFromSystemPropertyFile(false)\n")

    res.append("    " + "_root_.")
    if (ecorePackages.filter { e => visitor.getQualifiedName(e).equals(packageName) }.size == 1) {
      res.append(GlobalConfiguration.scalaAspectPrefix + ".")

    }
    res.append(k2.utils.TypeEquivalence.getPackageEquivalence(packageName))

    res.append("." + GlobalConfiguration.factoryName + ".create" + cd.getName + "." + op.getName)

    res.append("(")
    for (i <- 0 until op.getOwnedParameter().size()) {
      if (i != 0) { res.append(" , ") }
      res.append("args(" + i + ")")
    }
    res.append(")")
    res.append("\n  }\n}")
    // generates the file
    Util.generateFile(GlobalConfiguration.scalaAspectPrefix + "runner." + packageName, cd.getName+"_"+op.getName, res.toString())
  }

}