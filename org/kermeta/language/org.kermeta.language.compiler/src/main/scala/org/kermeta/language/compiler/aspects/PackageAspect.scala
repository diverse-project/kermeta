package org.kermeta.language.compiler.aspects

import org.kermeta.language.compiler.RichAspectImplicit._
import org.kermeta.language.compiler.TypeEquivalence
import org.kermeta.language.compiler.visitor.IVisitable
import org.kermeta.language.compiler.visitor.IVisitor
import org.kermeta.language.structure.{Package => KPackage}

trait PackageAspect extends ObjectAspect with IVisitable with LogAspect {
  this : KPackage =>
	
  override def accept(visitor : IVisitor){
    visitor.visit(this)
  }

  override def getQualifiedNameCompilo():String ={TypeEquivalence.getPackageEquivalence(getQualifiedName()) }
	
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
