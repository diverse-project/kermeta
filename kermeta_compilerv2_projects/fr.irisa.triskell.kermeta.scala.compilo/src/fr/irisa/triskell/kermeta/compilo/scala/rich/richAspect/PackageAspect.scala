package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import java.util._
import _root_.fr.irisa.triskell.kermeta.compilo.scala.visitor._
import fr.irisa.triskell.kermeta.compilo.scala.rich.RichAspectImplicit._

trait PackageAspect extends ObjectAspect with IVisitable with LogAspect {
  this : Package =>
	
  override def accept(visitor : IVisitor){
    visitor.visit(this)
  }

  override def getQualifiedNameCompilo():String ={kermeta.utils.TypeEquivalence.getPackageEquivalence(getQualifiedName()) }
	
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
