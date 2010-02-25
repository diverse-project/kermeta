/* Util.scala
 * Creation date: November 25, 2009
 * License: EPL
 * Copyright: IRISA / INRIA / Universite Rennes 1
 * Authors: Olivier BARAIS <barais@irisa.fr>
 *			Francois FOUQUET <ffouquet@irisa.fr>
 */
 
package fr.irisa.triskell.kermeta.compilo.scala
 
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._
import scala.collection.JavaConversions._
import java.util.concurrent.Executors
import java.util.concurrent.ExecutorService
import fr.irisa.triskell.kermeta.compilo.scala.rich._
import fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect._

object Util extends LogAspect with RichAspectImplicit  {
  /**
   * Check if a model element has an Ecore Tag
   * @param obj model element to test
   * @return true if ecore tag is found
   */
  def hasEcoreTag(obj : Object) : Boolean = {
    obj.getOwnedTags.exists(e=> "ecore".equals(e.asInstanceOf[Tag].getName()))
  }
  /**
   * Check if a model element has an
   * @param obj model element to test
   * @return true if CompilerIgnore tag is found
   */
  def hasCompilerIgnoreTag(obj : Object) : Boolean = {
    obj.getOwnedTags.exists(e=> "CompilerIgnore".equals(e.asInstanceOf[Tag].getName()))
  }

   
  /**
   * Utility method, generate src file
   * @param repName Target directory name, sub directory separated by .
   * @param fileName Target file name
   * @param content Target file content
   */
  def generateFile(repName : String,fileName : String,content : String){
    var f : java.io.File = new java.io.File(GlobalConfiguration.outputFolder + java.io.File.separator + repName.replace(".", java.io.File.separator) )
    if(!f.exists()) f.mkdirs
    var f1 : java.io.File = new java.io.File(GlobalConfiguration.outputFolder + java.io.File.separator + repName.replace(".", java.io.File.separator) + java.io.File.separator + fileName + ".scala")
    var output : java.io.FileOutputStream = new java.io.FileOutputStream(f1)
    var writer : java.io.PrintWriter = new java.io.PrintWriter(output)
    writer.println(content)
    writer.flush
    writer.close
    output.close
  }
   
  def cleanFolder(repName : String){
    var f : java.io.File = new java.io.File(repName)
    cleanFolder(f)
  }
  def cleanFolder(f : java.io.File){
    if(f.exists()){
      var children  = f.list
      for (i <- 0 until children.length){
        var subF = new java.io.File(f+java.io.File.separator+children(i))
        if(subF.isDirectory){
          cleanFolder(subF)
        } else {
          subF.delete
        }
      }
      f.delete()
    } else {
      log.debug("Cleaning : folder : {} ,not exist",f.getName())
    }
  }
	
  val keywords = scala.List("implicit","match","requires","type","var","abstract","do","finally","import","object","throw","val","case","else","for","lazy","override","return","trait","catch","extends","forSome","match","package","sealed","try","while","class","false","if","new","private","super","true","with","def","final","implicit","null","protected","this","yield","_",":","=","=>","<-","<:","<%",">:","#","@")
  def protectScalaKeyword(value : String) : String = {
    var returnString  = new StringBuilder
    var splittedVal = new RichIterable(value.split('.'))
    splittedVal.foreachCtx((e,ctx) => {
        if(!ctx.isFirst){ returnString.append(".") }
        if(keywords.exists(p => p.equals(e))){
          returnString append "`"+e+"`"
          log.info("Reserved Scala Keyword : {}, backquote protection : ",value)
        } else {
          returnString append e
        }
      }
    )
    return returnString.toString
  }
	
  /*
   def getProtectedQualifiedName(p : Package) : String = {
   var genpackageName = kermeta.utils.TypeEquivalence.getPackageEquivalence(p.getQualifiedNameCompilo)
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
	
  def getImplPackageSuffix(packName:String):String={
    if ("org.eclipse.uml2.uml".equals(packName) || "uml".equals(packName.toString) || ("org.eclipse.uml2.uml"+GlobalConfiguration.scalaAspectPrefix).equals(packName.toString))
    {//println("toti "+ packName)
     return ".internal.impl."
    }		else
    {//	println("toto "+ packName)
     return ".impl."
    }
  }

  def getPackagePrefix(packName:String):String={
    if ("Kermeta".equals(packName) || "uml".equals(packName.toString) || ("org.eclipse.uml2.uml"+GlobalConfiguration.scalaAspectPrefix).equals(packName.toString))
    {
      return "Km"
    }else if ("Uml".equals(packName) || "Uml".equals(packName.toString) || ("org.eclipse.uml2.uml"+GlobalConfiguration.scalaAspectPrefix).equals(packName.toString))
    {
      return "UML"
    }else
    {
      return packName
    }
  }

	
  /**
   * Global Compiler Thread Executor
   */
  var threadExecutor : ExecutorService = null
   
   
  def generateScalaCodeEach[A <: Object](res : StringBuilder,list : Iterable[A],sep : String ){
    implicit def rich (xs : Iterable[A]) = new RichIterable(list)
    list.foreachCtx((e,ctx) => {
        if(!ctx.isFirst) {res.append(sep) }
        e.asInstanceOf[ObjectAspect].generateScalaCode(res)
      })
    //TODO CAS INTERESSANT POUR LES FONCTIONS ANONYM
    /*
     for(i <- 0 until list.size){
     if(i != 0) {res.append(sep) }
     list.get(i).generateScalaCode(res)
     }*/
  }
   
   
  def generateProtectedScalaCodeEach[A <: Object](res : StringBuilder,list : Iterable[A],sep : String ){
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
  }
   
   
   
   
   
}
