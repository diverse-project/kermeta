package org.kermeta.compilo.scala.visitor.impl

import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.compilo.scala.rich._
import org.kermeta.compilo.scala.rich.richAspect._
import org.kermeta.compilo.scala._
import org.kermeta.compilo.scala.visitor._
import scala.collection.JavaConversions._
import org.kermeta.language.util.ModelingUnit

class ScalaAspectVisitor(compilerConfiguration: CompilerConfiguration) extends IVisitor with LogAspect {

  def visit(mu: ModelingUnit) {
    //PreCompiler.visit(par)
    //    mu.getMetamodels().foreach(p =>
    //      (this.visit(p)))

    this.visit(mu.getCurrentMetamodel())
  }

  def visit(mm: Metamodel) {
    UtilModelTypeDefinition.preprocessMetamodel(mm)
    //PreCompiler.visit(par)
    mm.getOwnedModelTypeDefinitions().foreach(mdt => this.visit(mdt))
    mm.getPackages().foreach(p => (this.visit(p)))
  }

  def visit(par: Package) {
    var util = new PackageVisitor(compilerConfiguration)

    var actualPackage = util.getQualifiedName(par)
    if (Util.doesGeneratePackage(actualPackage)) {
      var subTask = new ScalaAspectPackageVisitorRunnable(compilerConfiguration)
      VisitorAsyncUtility.runAfter(new AcceptablePackage(par), subTask)
      par.getNestedPackage.foreach(p => { new AcceptablePackage(p).accept(this) })
    }
  }

  def visit(par: ClassDefinition) { Console.println("multithread error") }

  def init() {}

  def close() {}

  //MODELTYPE ADDITION
  def visit(par: ModelTypeDefinition) {
    var subTask = new ScalaAspectPackageVisitorRunnable(compilerConfiguration)
    VisitorAsyncUtility.runAfter(new AcceptableModelTypeDefinition(par), subTask)
  }

}

class ScalaAspectPackageVisitorRunnable(compilerConfiguration: CompilerConfiguration) extends IVisitor with LogAspect {

  def visit(par: ModelingUnit) { Console.println("multithread error") }

  var actualPackage: String = ""

  var visitor: PackageVisitor = new PackageVisitor(compilerConfiguration)

  def visit(mm: Metamodel) { Console.println("multithread error") }

  def visit(par: Package) {
    actualPackage = visitor.getQualifiedName(par)

    par.getOwnedTypeDefinition filter (p => p.isInstanceOf[ClassDefinition]) foreach (p => new AcceptableClassDef(p.asInstanceOf[ClassDefinition]).accept(this))
    par.getOwnedTypeDefinition filter (p => p.isInstanceOf[Enumeration]) foreach (p => visitor.generateEnum(p.asInstanceOf[Enumeration]))
  }

  def visit(cd: ClassDefinition) {
    var genpackageName: StringBuilder = new StringBuilder

    genpackageName.append(k2.utils.TypeEquivalence.getPackageEquivalence(visitor.getQualifiedNameCompilo(cd.eContainer)))
    
    if (!Util.hasCompilerIgnoreTag(cd)) {
      generateScalaAspectFileForClassDefinition(cd, genpackageName.toString)
      if (!Util.hasEcoreTag(cd)) {
    	  generatePureKermetaScalaFileForClassDefinition(cd, genpackageName.toString)
      }
    }
    if(GlobalConfiguration.generateJavaHelper) {
    	generateJavaHelperFileForClassDefinition(cd, genpackageName.toString)
    }
  }

  /**
   * generates the scala file for the aspect part of this ClassDefinition, normally called only when there is no compilerIgnore tag
   */
  def generateScalaAspectFileForClassDefinition(par: ClassDefinition, genpackageName : String ) {
    var res: StringBuilder = new StringBuilder
    res.append("package " + Util.protectScalaKeyword(genpackageName.toString) + "\n")
    res.append("import _root_.k2.io._\n")
    res.append("import _root_.k2.standard._\n")
    res.append("import _root_.k2.standard.JavaCollectionConversions._\n")
    res.append("import _root_.k2.standard.PrimitiveConversion._\n")
    //      res.append("import _root_.kermeta.kunit.KunitConversions._\n")
    try {
      visitor.visit(par, res)
    } catch {
      case e: Throwable =>
        log.error("Problem while generating " + par.getName + "Aspect.scala : " + e.getMessage(), e)
      case _ =>
    }
    Util.generateScalaFile(genpackageName.toString, par.getName + "Aspect", res.toString())
  }
  
  /**
   * generates the scala file for main part of pure kermeta ClassDefinition , normally called only when there is neither compilerIgnore, nor ecore tag
   */
  def generatePureKermetaScalaFileForClassDefinition(par: ClassDefinition, genpackageName : String) {
    
      var res1: StringBuilder = new StringBuilder

      res1.append("package " + Util.protectScalaKeyword(genpackageName.toString) + "\n")
      res1.append("trait ")
      res1.append(par.getName())

      visitor.generateTypeParameterForClassDefinition(par, res1);
      if (!visitor.getQualifiedNameCompilo(par.getSuperType().first.asInstanceOf[Class].getTypeDefinition).equals("kermeta.language.structure.Object")) {
        //log.debug("SuperTypefound="+ par.getSuperType().first.asInstanceOf[Class].getTypeDefinition.getQualifiedNameCompilo)
        var listSuperTypes = par.getSuperType()
        var i = 0
        for (a <- listSuperTypes) {
          if (i == 0) { res1.append(" extends ") } else { res1.append(" with ") }
          res1.append(Util.protectScalaKeyword("_root_." + visitor.getQualifiedNamedBase(a.asInstanceOf[Class].getTypeDefinition)))
          visitor.generateBindingParamerterClass(par, a.asInstanceOf[Class], res1)
          i = i + 1
        }
      }

      //GENERATE METHOD SIGNATURE
      res1.append("{\n")
      par.getOwnedOperation.foreach { op: Operation =>
        visitor.generateSignature(op, res1)
      }
      res1.append("\n}\n")
      /*
         par.getOwnedAttribute.foreach{at : Attribute

         }
         */
      //GENERATE ATTRIBUTE SIGNATURE

      // GENERATE SINGLETON
      if (par.getIsSingleton()) {
        // create companion object
        res1.append("object ")
        res1.append(par.getName())
        visitor.generateTypeParameterForClassDefinition(par, res1);
        res1.append(" extends ")
        res1.append(par.getName())
        res1.append(" with _root_." + visitor.getQualifiedNameCompilo(par.eContainer) + ".")
        res1.append(par.getName())
        res1.append("Aspect with _root_.k2.standard.EObjectImplForPrimitive")
        res1.append("{}\n")
      }
      //res1.append("trait " + par.getName + " extends "+superQualifiedName+" with org.kermeta.scala.framework.language.structure.ObjectAspect")
      Util.generateScalaFile(genpackageName.toString, par.getName, res1.toString())
    
  }

  /**
   * Generates the java helper class that ease call to all the features of this ClassDefinition, including the ones introduced by aspect
   */
  def generateJavaHelperFileForClassDefinition(cd: ClassDefinition, genpackageName : String) {
    var res: StringBuilder = new StringBuilder
    res.append("package " + genpackageName.toString + ";\n")
    res.append("public class " + cd.getName +"JavaHelper {\n")
    cd.getOwnedOperation.foreach { op: Operation =>
        generateOperationInJavaHelperFile(cd, op, res)
    }
    cd.getOwnedAttribute.foreach{prop : Property =>

    }
    
    // TODO do the same for all owned operation and properties
    
    res.append("}\n")
    Util.generateJavaFile(genpackageName.toString, cd.getName+"JavaHelper", res.toString())    
  }
  
  /**
   * Generates an operation in the java helper class
   */
  def generateOperationInJavaHelperFile(cd: ClassDefinition, op: Operation, res : StringBuilder) {
	  try{
		  var res1 : StringBuilder = new StringBuilder
		  // do not generate operation in case of trouble
	      res1.append("\t")
	      res1.append("public static ")
	      res1.append(Util.getTypeAsJavaType(op))
	      res1.append(" ")
	      res1.append(op.getName()+"( "+cd.getName+" the"+cd.getName+") {")
	      res1.append("}\n")
	      
	      res.append(res1.toString)
	  }
	  catch {
		  case e => res.append("\t ignored operation ");
		  	res.append(op.getName())
		  	res.append(" due to generator exception ")
		  	res.append(e.toString())
		}
  }
  
  def init() {}

  def close() {}

  //MODELTYPE ADDITION	
  def visit(par: ModelTypeDefinition) {
    var res: StringBuilder = new StringBuilder
    var genpackageName: StringBuilder = new StringBuilder

    genpackageName.append(k2.utils.TypeEquivalence.getPackageEquivalence(visitor.getQualifiedNameCompilo(par.eContainer)))

    res.append("package " + Util.protectScalaKeyword(genpackageName.toString) + "\n")
    res.append("import _root_.k2.io._\n")
    res.append("import _root_.k2.standard._\n")
    res.append("import _root_.k2.standard.JavaCollectionConversions._\n")
    res.append("import _root_.k2.standard.PrimitiveConversion._\n")

    res.append(visitor.generateModelTypeDefinitionInterface(par))

    Util.generateScalaFile(genpackageName.toString(), "MT_" + par.getName(), res.toString())

    par.getTypeDefinitions().foreach(td => {
      if (!Util.hasCompilerIgnoreTag(td)) {
        if (td.isInstanceOf[ClassDefinition]) {
          visitor.generateModelTypeInterface(td.asInstanceOf[ClassDefinition], par)
        }
      }

    })

    var res2: StringBuilder = new StringBuilder

    res2.append("package " + Util.protectScalaKeyword(genpackageName.toString) + "\n")
    res2.append("import _root_.k2.io._\n")
    res2.append("import _root_.k2.standard._\n")
    res2.append("import _root_.k2.standard.JavaCollectionConversions._\n")
    res2.append("import _root_.k2.standard.PrimitiveConversion._\n")
    res2.append("import " + "_root_." + GlobalConfiguration.frameworkGeneratedPackageName + "." + GlobalConfiguration.implicitConvTraitName + "._\n")

    res2.append(visitor.generateModelTypeDefinitionAspect(par))

    Util.generateScalaFile(genpackageName.toString(), "MT_" + par.getName() + "Aspect", res2.toString())
  }

}
