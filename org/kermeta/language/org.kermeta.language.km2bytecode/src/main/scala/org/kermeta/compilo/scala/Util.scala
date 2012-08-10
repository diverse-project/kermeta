/* Util.scala
 * Creation date: November 25, 2009
 * License: EPL
 * Copyright: IRISA / INRIA / Universite Rennes 1
 * Authors: Olivier BARAIS <barais@irisa.fr>
 *			Francois FOUQUET <ffouquet@irisa.fr>
 */

package org.kermeta.compilo.scala

import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import java.io.File
import java.io.IOException
import java.util._
import scala.collection.JavaConversions._
import java.util.concurrent.Executors
import java.util.concurrent.ExecutorService
import org.kermeta.compilo.scala.rich._
import org.kermeta.compilo.scala.rich.richAspect._

object Util extends LogAspect {
  /**
   * Check if a model element has an Ecore Tag
   * @param obj model element to test
   * @return true if ecore tag is found
   */
  def hasEcoreTag(obj: KermetaModelElement): Boolean = {
    obj.getKOwnedTags().exists(e => "ecore".equals(e.asInstanceOf[Tag].getName()))
  }

  /**
   * Check if a model element has an ecore.EDataType_instanceClassName Tag
   * @param obj model element to test
   * @return true if ecore tag is found
   */
  def hasEcoreEDataTypeInstanceClassNameTag(obj: KermetaModelElement): Boolean = {
    obj.getKOwnedTags().exists(e => "ecore.EDataType_instanceClassName".equals(e.asInstanceOf[Tag].getName()))
  }
  /**
   * Check if a model element has an ecore.EDataType_instanceClassName Tag
   * @param obj model element to test
   * @return true if ecore tag is found
   */
  def getEcoreEDataTypeInstanceClassNameTag(obj: KermetaModelElement): String = {
    obj.getKOwnedTags().find(e => "ecore.EDataType_instanceClassName".equals(e.asInstanceOf[Tag].getName())).get.getValue()
  }
  def isAMapEntry(obj: ClassDefinition): Boolean = {
    !obj.getName().equals("EStringToStringMapEntryAspect") && !obj.eContainer().asInstanceOf[Package].getName().equals("ecore") && hasEcoreTag(obj) && obj.getOwnedAttribute().size() == 2 && obj.getOwnedAttribute().exists(e => e.getName() == "key") && obj.getOwnedAttribute().exists(e => e.getName() == "value")
  }

  def getQualifiedNameForMapEntry(par: ClassDefinition, visitor: ObjectVisitor, firstpass: Boolean): String = {
    var res1 = new StringBuilder
    //    	    if (par.getOwnedAttribute().filter(e => e.getName().equals("value")).get(0).getUpper().equals(1))
    if (firstpass)
      res1.append("java.util.Map.Entry[") //
    else
      res1.append("org.eclipse.emf.common.util.EMap[")

    var typekey = par.getOwnedAttribute().filter(e => e.getName.equals("key")).get(0).getType
    var typevalue = par.getOwnedAttribute().filter(e => e.getName.equals("value")).get(0).getType
    var typekeystring: String = null
    var typevaluestring: String = null
    if (Util.isAMapEntry(typekey)) {
      typekeystring = getQualifiedNameForMapEntry(typekey.asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition], visitor, true)
    } else {
      typekeystring = visitor.getQualifiedNameCompilo(typekey)
    }
    if (Util.isAMapEntry(typevalue)) {
      if (par.getOwnedAttribute().filter(e => e.getName().equals("value")).get(0).getUpper().equals(1)) {
        typevaluestring = getQualifiedNameForMapEntry(typevalue.asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition], visitor, true)
      } else {
        typevaluestring = getQualifiedNameForMapEntry(typevalue.asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition], visitor, false)
      }
    } else {
      typevaluestring = visitor.getQualifiedNameCompilo(typevalue)
    }

    res1.append(typekeystring)
    res1.append(",")
    res1.append(typevaluestring)
    res1.append("]")
    return res1.toString

  }

  def isAMapEntry(obj: Type): Boolean = {
    if (obj.isInstanceOf[Class])
      return isAMapEntry(obj.asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition])
    else
      return false
  }

  /**
   * Check if a model element has an EcoreFromAPI Tag
   * @param obj model element to test
   * @return true if ecore tag is found
   */

  def hasEcoreFromAPITag(obj: KermetaModelElement): Boolean = {
    obj.getKOwnedTags.exists(e => "ecoreFromAPI".equals(e.asInstanceOf[Tag].getName()))
  }

  /**
   * Check if a model element has an
   * @param obj model element to test
   * @return true if CompilerIgnore tag is found
   */
  def hasCompilerIgnoreTag(obj: KermetaModelElement): Boolean = {
    obj.getKOwnedTags.exists(e => "CompilerIgnore".equals(e.asInstanceOf[Tag].getName()))
  }

  /**
   * Utility method, generate src file
   * @param repName Target directory name, sub directory separated by .
   * @param fileName Target file name
   * @param content Target file content
   */
  def generateFile(repName: String, fileName: String, content: String) {
    // println("REPNAME="+repName+"-"+fileName)
    var f: java.io.File = new java.io.File(GlobalConfiguration.outputFolder + java.io.File.separator + repName.replace(".", java.io.File.separator))
    if (!f.exists()) f.mkdirs
    var f1: java.io.File = new java.io.File(GlobalConfiguration.outputFolder + java.io.File.separator + repName.replace(".", java.io.File.separator) + java.io.File.separator + fileName + ".scala")
    var output: java.io.FileOutputStream = new java.io.FileOutputStream(f1)
    var writer: java.io.PrintWriter = new java.io.PrintWriter(output)
    writer.println(content)
    writer.flush
    writer.close
    output.close
  }

  def cleanFolder(repName: String) {
    if (repName != null) {
      var f: java.io.File = new java.io.File(repName)
      if (f != null) {
        cleanFolder(f)
      } else {
        log.debug("Cleaning : folder : {} ,not exist", repName)
      }
    }
  }

  def cleanFolder(f: java.io.File) {
    if (f.exists()) {
      var children = f.list
      for (i <- 0 until children.length) {
        var subF = new java.io.File(f + java.io.File.separator + children(i))
        if (subF.isDirectory) {
          cleanFolder(subF)
        } else {
          subF.delete
        }
      }
      f.delete()
    } else {
      log.debug("Cleaning : folder : {} ,not exist", f.getName())
    }
  }

  val keywords = scala.List("implicit", "match", "requires", "type", "var", "abstract", "do", "finally", "import", "object", "throw", "val", "case", "else", "for", "lazy", "override", "return", "trait", "catch", "extends", "forSome", "match", "package", "sealed", "try", "while", "class", "false", "if", "new", "private", "super", "true", "with", "def", "final", "implicit", "null", "protected", "this", "yield", "_", ":", "=", "=>", "<-", "<:", "<%", ">:", "#", "@")
  val badChar = scala.List("_")
  def protectScalaKeyword(value: String): String = {
    var returnString = new StringBuilder
    var splittedVal = new RichIterable(value.split('.'))
    splittedVal.foreachCtx((e, ctx) => {
      if (!ctx.isFirst) { returnString.append(".") }
      if (badChar.exists({ p => e.contains(p) }) || keywords.exists(p => p.equals(e))) {
        returnString append "`" + e + "`"
        //log.debug("Reserved Scala Keyword : {}, backquote protection : ",e)
      } else {
        returnString append e
      }
    })
    return returnString.toString
  }

  /*
     def getProtectedQualifiedName(p : Package) : String = {
     var genpackageName = _root_.k2.utils.TypeEquivalence.getPackageEquivalence(p.getQualifiedNameCompilo)
     if (Util.hasEcoreTag(p)){
     //problem qualifiedname can finish by `
     if(genpackageName.endsWith("`")){
     genpackageName = genpackageName.substring(0, genpackageName.size-1)
     genpackageName = genpackageName + "ScalaAspect"
     genpackageName = genpackageName + "`"
     } else {
     genpackageName = genpackageName + "ScalaAspect"
     }
     }
     return genpackageName.toString
     }
     */

  def getImplPackageSuffix(packName: String): String = {
    if ("org.eclipse.uml2.uml".equals(packName) || (GlobalConfiguration.scalaAspectPrefix + ".org.eclipse.uml2.uml").equals(packName) || "uml".equals(packName.toString))
      return ".internal.impl."
    else { //println("toto "+ packName)
      return ".impl."
    }
  }

  def getPackagePrefix(packName: String): String = {
    if ("Kermeta".equals(packName)) {
      return "Km"
    } else if ("Uml".equals(packName) || "Uml".equals(packName.toString)) {
      return "UML"
    } else {
      return packName
    }
  }

  /**
   * Global Compiler Thread Executor
   */
  var threadExecutor: ExecutorService = null

  /*   def generateScalaCodeEach[A <: Object](res : StringBuilder,list : Iterable[A],sep : String )={
        implicit def rich (xs : Iterable[A]) = new RichIterable(list)
        list.foreachCtx((e,ctx) => {
                if(!ctx.isFirst) {res.append(sep) }
                e.asInstanceOf[ObjectAspect].generateScalaCode(res)
            })
    }
   
   
    def generateProtectedScalaCodeEach[A <: Object](res : StringBuilder,list : Iterable[A],sep : String )={
        implicit def rich (xs : Iterable[A]) = new RichIterable(list)
        list.foreachCtx((e,ctx) => {
                if(!ctx.isFirst) {res.append(sep) }
                var temp = new StringBuilder
                e.asInstanceOf[ObjectAspect].generateScalaCode(temp)
                res.append(protectScalaKeyword(temp.toString))
            })
        //TODO CAS INTERESSANT POUR LES FONCTIONS ANONYM
        /*
         for(i <- 0 until list.size){
         if(i != 0) {res.append(sep) }
         list.get(i).generateScalaCode(res)
         }*/
    }*/

  def createTempDirectory: File = {
    val temp = File.createTempFile("temp", System.nanoTime.toString)
    if (!temp.delete)
      ioError("Could not delete temp file: " + temp.getAbsolutePath)
    if (!temp.mkdir)
      ioError("Could not create temp directory: " + temp.getAbsolutePath)
    return temp
  }

  def ioError(msg: String) = throw new IOException(msg)

  def doesGeneratePackage(packQualifiedName: String): Boolean = {
    var hasToGenerate: Boolean = true
    if (GlobalConfiguration.props.getProperty("use.default.aspect.km") == true) {
      hasToGenerate && !packQualifiedName.startsWith("org.kermeta.language")
    }
    if (GlobalConfiguration.props.getProperty("use.default.aspect.uml") == true) {
      hasToGenerate && !packQualifiedName.startsWith("")
    }
    if (GlobalConfiguration.props.getProperty("use.default.aspect.ecore") == true) {
      hasToGenerate && !packQualifiedName.startsWith("org.eclipse.emf")
    }
    if (!hasToGenerate) { log.debug("Exclude compilation package |" + packQualifiedName) }
    return hasToGenerate
  }

  def getEcoreRenameOperation(op1: Operation): String = {
    if ((Util.hasEcoreTag(op1) && op1.getBody != null) ||
      (op1.eContainer.asInstanceOf[ClassDefinition].getOwnedOperation.filter(op => op.getName().equals("op_" + op1.getName())).size > 0)) {
      return "EMFRENAME" + op1.getName
    } else if (op1.getSuperOperation != null && op1.getSuperOperation() != op1) {
      return getEcoreRenameOperation(op1.getSuperOperation.asInstanceOf[Operation])
    } else {
      return op1.getName
    }
  }

  def getClassLoaderForClasspath(classpath: String): java.net.URLClassLoader = {
    var urls: scala.Array[java.net.URL] = scala.Array[java.net.URL]()
    var splittedclasspath = new RichIterable(classpath.split(System.getProperty("path.separator")))
    splittedclasspath.foreachCtx((e, ctx) => {
      if (!e.isEmpty()) {
        urls = urls :+ (new java.net.URL("file:///" + e)) // need 3 / with windows
      }
    })

    return new java.net.URLClassLoader(urls) //java.net.URLClassLoader.newInstance(urls) 
  }

  def doesMethodExists(className: String, methodName: String): Boolean = {
    val cl = getClassLoaderForClasspath(GlobalConfiguration.props.getProperty("user.additional.classpath"))
    try {
      val c = cl.loadClass(className)
      return c.getDeclaredMethods().exists((m) => {
        m.getName().equals(methodName)
      })
    } catch {
      case e: java.lang.ClassNotFoundException => {
        log.debug(e + " in " + cl.getURLs().deepToString() + " cl.getURL.size=" + cl.getURLs().length)
        return false
      }
    }
    return false
  }

}

   

