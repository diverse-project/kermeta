package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import java.util._
import _root_.org.kermeta.compilo.scala.visitor._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait PackageAspect extends ObjectAspect with IVisitable with LogAspect {
  this : Package =>
	
  override def accept(visitor : IVisitor){
    visitor.visit(this)
  }

  override def getQualifiedNameCompilo():String ={k2.utils.TypeEquivalence.getPackageEquivalence(getQualifiedName()) }
	
  def getQualifiedName():String ={
    var res : String=""
    if (this.getNestingPackage !=null){
      res = this.getNestingPackage.getQualifiedName +"."
    } 
    res = res + this.getName
    return res
  }
	
  def getQualifiedNameKermeta():String ={
    var res : String=""
    if (this.getNestingPackage !=null){
      res = this.getNestingPackage.getQualifiedName +"::"
    }
    res = res + this.getName
    return res
  }

	
	
}
