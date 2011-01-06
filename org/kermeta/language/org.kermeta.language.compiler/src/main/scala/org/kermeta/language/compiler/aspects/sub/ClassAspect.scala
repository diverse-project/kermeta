/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.compiler.aspects.sub

import org.kermeta.language.compiler.Util
import scala.collection.JavaConversions._
import org.kermeta.language.structure.{Class => KClass}
import org.kermeta.language.compiler.aspects.ImplicitAspects._

trait ClassAspect extends ObjectAspect {

  lazy val ClassAspect_self = self.asInstanceOf[KClass]

  override def generateScalaCode(res : StringBuilder) : Unit = {
    var qualifiedName = this.getQualifiedNameCompilo()
    if (qualifiedName.contains( "org.kermeta.language.structure.Object") && !qualifiedName.contains("ObjectTypeVariable") ){
      res.append(qualifiedName.replace("org.kermeta.language.structure.Object","java.lang.Object"))
    }else{
      res.append(qualifiedName)
    }		
    if (ClassAspect_self.getTypeParamBinding.size()>0){		
      var i : Int = 1
      res.append("[")
      self.asInstanceOf[KClass].getTypeParamBinding.foreach(e=> {
          var res1: StringBuilder = new StringBuilder
          e.generateScalaCode(res1)
          if (false && res1.toString.contains(classOf[org.kermeta.language.structure.Object].getCanonicalName))
            res.append("_ <: _root_.java.lang.Object")
          else
            res.append(res1.toString)
          if (i< ClassAspect_self.getTypeParamBinding.size()){
            res.append(", ")
          }
          i=i+1;
        })
      res.append("]")
    }
    else{
      try{
        var c = java.lang.Class.forName(this.getQualifiedNameCompilo())
        if(c.getTypeParameters.size > 0){
          res.append("[")
          for(i <- 0 until c.getTypeParameters.length ){
            res.append("_")
            if(i < c.getTypeParameters.length -1){
              res.append(",")
            }
          }
          res.append("]")
        }
      } catch {
        case _ =>
      }
    }
  }
	
  override def getQualifiedNameCompilo():String ={
    var res = new StringBuilder
    var typename = Util.protectScalaKeyword(Util.getQualifiedNamedBase(ClassAspect_self.getTypeDefinition))
    if(typename.contains(".")) res.append("_root_.")
    res.append(typename)
    return res.toString
  }

}
case class RichClass(_self : KClass) extends ClassAspect { self = _self  }