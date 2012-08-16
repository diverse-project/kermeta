package org.kermeta.compilo.scala.visitor
import org.kermeta.language.structure._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala.Util

object PreCompiler {
  
  /**
   * Visits the model to find containment properties.
   * If one of those do not have an opposite, create one opposite and adds it.
   */
  def visit(o:org.kermeta.language.structure.KermetaModelElement) : Unit = o match {
    case o:ModelingUnit => 
      o.getPackages().foreach(visit)
      o.getOwnedTypeDefinition().filter(_.isInstanceOf[ClassDefinition]).foreach(visit)
    case o:Package => 
      o.getNestedPackage().foreach(visit)
      o.getOwnedTypeDefinition().filter(_.isInstanceOf[ClassDefinition]).foreach(visit)
    case o:ClassDefinition => 
      o.getOwnedAttribute().toBuffer.foreach(visit) 
    case o:Property if (o.getIsComposite() && o.getOpposite()==null && o.getType().isInstanceOf[Class] && !(Util.isValueType(o.getType.asInstanceOf[Class])) && !Util.hasCompilerIgnoreTag(o.getOwningClass) && !Util.hasCompilerIgnoreTag(o.getType.asInstanceOf[Class].getTypeDefinition)
        && !Util.hasEcoreTag(o))=> 
      val opp : Property = StructurePackage.eINSTANCE.getEFactoryInstance().asInstanceOf[StructureFactory].createProperty()
      opp.setOpposite(o)
      o.setOpposite(opp)
      opp.setOwningClass(o.getType.asInstanceOf[Class].getTypeDefinition().asInstanceOf[ClassDefinition])
      opp.setName("_KermetaContainer000"+next)
      val c : Class = StructurePackage.eINSTANCE.getEFactoryInstance().asInstanceOf[StructureFactory].createClass
      c.setTypeDefinition(o.getOwningClass())
      opp.setType(c)
    case _ => ()
  }
  
  // unique number generator
  var n = 100
  def next() = {n+=1 ; n}
}