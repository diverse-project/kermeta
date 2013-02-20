package org.kermeta.language.compiler.aspects.sub

import org.kermeta.language.compiler.TypeEquivalence
import org.kermeta.language.compiler.visitor.IVisitable
import org.kermeta.language.compiler.visitor.IVisitor
import org.kermeta.language.structure.{Package => KPackage}
import org.kermeta.language.compiler.aspects.ImplicitAspects._

trait PackageAspect extends ObjectAspect with IVisitable {

  lazy val PackageAspect_self = self.asInstanceOf[KPackage]
	
  override def accept(visitor : IVisitor){
    visitor.visit(PackageAspect_self)
  }

  override def getQualifiedNameCompilo():String ={TypeEquivalence.getPackageEquivalence(getQualifiedName()) }
	
  def getQualifiedName():String ={
    var res : String=""
    if (PackageAspect_self.getNestingPackage !=null){
      res = PackageAspect_self.getNestingPackage.getQualifiedName +"."
    } 
    res = res + PackageAspect_self.getName
    return res
  }
	
  def getQualifiedNameKermeta():String ={
    var res : String= ""
    if (PackageAspect_self.getNestingPackage !=null){
      res = PackageAspect_self.getNestingPackage.getQualifiedName +"::"
    }
    res = res + PackageAspect_self.getName
    return res
  }

	
}


case class RichPackage(_self : KPackage) extends PackageAspect { self = _self  }
