package org.kermeta.compilo.scala.visitor
import org.kermeta.language.structure._
import scala.collection.JavaConversions._

object PreCompiler {

  def visit(o:org.kermeta.language.structure.KermetaModelElement) : Unit = o match {
    case o:ModelingUnit => 
      o.getPackages().foreach(visit)
      o.getOwnedTypeDefinition().filter(td => td.isInstanceOf[ClassDefinition]).foreach(visit)
    case o:Package => 
      o.getNestedPackage().foreach(visit)
      o.getOwnedTypeDefinition().filter(td => td.isInstanceOf[ClassDefinition]).foreach(visit)
    case o:ClassDefinition => 
      o.getOwnedAttribute().foreach(visit) 
    case o:Property =>
      if(o.getIsComposite() && o.getName().startsWith("toto"))
        println("\n\n\n" + o.getName() + "\n\n\n")
    case _ => ()
  }
}