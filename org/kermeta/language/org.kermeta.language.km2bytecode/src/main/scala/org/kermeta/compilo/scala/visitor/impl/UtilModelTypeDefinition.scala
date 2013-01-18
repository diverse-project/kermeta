package org.kermeta.compilo.scala.visitor.impl
import org.kermeta.language.structure.ModelTypeDefinition
import org.kermeta.language.structure.ModelElementTypeDefinition
import scala.collection.JavaConversions._
import org.kermeta.language.structure.Operation
import org.kermeta.language.structure.ModelTransformation
import org.kermeta.compilo.scala.Util
import scala.collection.mutable.HashMap
import org.kermeta.language.structure.GenericTypeDefinition
import org.kermeta.language.structure.ClassDefinition
import org.kermeta.language.structure.Metamodel

//MODELTYPE ADDITION
object UtilModelTypeDefinition {

  /**
   * Maps used during the generation
   */
  var typeDefinitionToModelTypeDefinition: HashMap[ModelElementTypeDefinition, java.util.Set[ModelTypeDefinition]] = new HashMap[ModelElementTypeDefinition, java.util.Set[ModelTypeDefinition]]
  var typeDefinitionBindings: HashMap[ModelElementTypeDefinition, java.util.Set[Pair[ModelElementTypeDefinition, ModelTypeDefinition]]] = new HashMap[ModelElementTypeDefinition, java.util.Set[Pair[ModelElementTypeDefinition, ModelTypeDefinition]]]
  var typeDefinitionDirectBindings: HashMap[ModelElementTypeDefinition, java.util.Set[ModelElementTypeDefinition]] = new HashMap[ModelElementTypeDefinition, java.util.Set[ModelElementTypeDefinition]]
  var ruleToTransformation: HashMap[Operation, java.util.Set[ModelTransformation]] = new HashMap[Operation, java.util.Set[ModelTransformation]]

  /**
   * Methods to access the shared maps
   */
  def isReferencedByModelTypeDefinition(td: ModelElementTypeDefinition): Boolean = {
    return typeDefinitionToModelTypeDefinition.containsKey(td)
  }

  def getReferencingModelTypeDefinitions(td: ModelElementTypeDefinition): Option[java.util.Set[ModelTypeDefinition]] = {
    return typeDefinitionToModelTypeDefinition.get(td)
  }

  def getTypeDefinitionBindings(td: ModelElementTypeDefinition): Option[java.util.Set[Pair[ModelElementTypeDefinition, ModelTypeDefinition]]] = {
    return typeDefinitionBindings.get(td)
  }

  def getTypeDefinitionDirectBindings(td: ModelElementTypeDefinition): Option[java.util.Set[ModelElementTypeDefinition]] = {
    return typeDefinitionDirectBindings.get(td)
  }

  def isTransformationRule(op: Operation): Boolean = {
    return ruleToTransformation.containsKey(op)
  }

  /**
   * Preprocessing filling the different maps used during the generation of ModelTypeDefinitions
   */
  def preprocessModelTypeDefinition(mtd: ModelTypeDefinition) = {
    fillTypeDefinitionMap(mtd)
    fillTypeDefinitionBindings(mtd)
    fillRuleMap(mtd)
  }

  def fillTypeDefinitionMap(mtd: ModelTypeDefinition) = {
    mtd.getTypeDefinitions().foreach(td => {
      if (!typeDefinitionToModelTypeDefinition.containsKey(td)) {
        typeDefinitionToModelTypeDefinition.put(td, new java.util.HashSet[ModelTypeDefinition])
      }
      typeDefinitionToModelTypeDefinition.get(td) match {
        case Some(s) => s.add(mtd)
        case None => //This case will never happen
      }
    })
  }

  def fillTypeDefinitionBindings(mtd: ModelTypeDefinition) = {
    var bindings: java.util.Set[Pair[ModelElementTypeDefinition, ModelTypeDefinition]] = new java.util.HashSet[Pair[ModelElementTypeDefinition, ModelTypeDefinition]]
    var directBindings: java.util.Set[ModelElementTypeDefinition] = new java.util.HashSet[ModelElementTypeDefinition]

    mtd.getTypeDefinitions().foreach(td => {
      mtd.getOwnedBindings().foreach(b => {
        b.getOwnedClassDefinitionBindings().foreach(cb => {
          if (cb.getSource() == td) {
            bindings.add(Pair(cb.getTarget(), b.getBoundModelTypeDefinition()))
            directBindings.add(cb.getTarget())
          }
        })
      })
      if (!typeDefinitionBindings.containsKey(td)) {
        typeDefinitionBindings.put(td, new java.util.HashSet[Pair[ModelElementTypeDefinition, ModelTypeDefinition]])
      }
      typeDefinitionBindings.get(td) match {
        case Some(s) => s.addAll(bindings)
        case None => //This case will never happen
      }
      if (!typeDefinitionDirectBindings.containsKey(td)) {
        typeDefinitionDirectBindings.put(td, new java.util.HashSet[ModelElementTypeDefinition])
      }
      typeDefinitionDirectBindings.get(td) match {
        case Some(s) => s.addAll(directBindings)
        case None => //This case will never happen
      }
    })
  }

  def fillRuleMap(mtd: ModelTypeDefinition) = {
    mtd.getOwnedTransformations().foreach(mt => {
      mt.getRules().foreach(r => {
        if (!ruleToTransformation.containsKey(r)) {
          ruleToTransformation.put(r, new java.util.HashSet[ModelTransformation])
        }
        ruleToTransformation.get(r) match {
          case Some(s) => s.add(mt)
          case None => //This case will never happen
        }
      })
    })
  }

  /*
   * Utils
   */
  def getBoundedTypeMember(td: ModelElementTypeDefinition, mtd: ModelTypeDefinition): String = {
    return "type " + Util.getTypeMemberName(td) + " <: " + "_root_." + Util.getModelTypeInterfaceQualifiedName(td)
  }

  def getFixedTypeMember(td: ModelElementTypeDefinition): String = {
    var res: StringBuilder = new StringBuilder
    res.append("type ")
    res.append(Util.getTypeMemberName(td))
    res.append(" = ")        
    res.append("_root_.")
    if (td.isInstanceOf[GenericTypeDefinition]) {
      res.append(Util.getQualifiedNamedAspect(td.asInstanceOf[GenericTypeDefinition]))
    } else {
      res.append(Util.getQualifiedNameCompilo(td))
    }
    return res.toString()
  }

  //Return all the fixed type members for one given ModelTypeDefinition (including the one inherited from its super-modeltypes)
  def getFixedTypeMembers(mtd: ModelTypeDefinition): String = {
    var fixed: StringBuilder = new StringBuilder
    mtd.getTypeDefinitions().foreach(td => {
      if (!Util.hasCompilerIgnoreTag(td)) {
        if (td.isInstanceOf[ClassDefinition]) {
          fixed.append("\t")
          fixed.append(getFixedTypeMember(td))
          fixed.append("\n")
        }
      }

    })
    fixed.append("\n\t")
    fixed.append("var ")
    fixed.append(Util.getModelTypeFactoryMainVariableName())
    fixed.append(" : ")    
    fixed.append("_root_.")
    fixed.append(Util.getModelTypeFactoryInterfaceQualifiedName(mtd))
    fixed.append(" = ")    
    fixed.append("_root_.")
    fixed.append(Util.getModelTypeFactoryTypeQualifiedName(mtd))
    fixed.append("\n")

    return fixed.toString()
  }

  //Return all the fixed type members for one given Metamodel (based on its direct ModelTypeDefinition)
  def getFixedTypeMembers(mm: Metamodel): String = {
    var mtd = mm.getOwnedModelTypeDefinitions().find(m => {m.getName() == mm.getName()})
    mtd match {
      case Some(m) => return getFixedTypeMembers(m)
      case None => return ""
    }    
  }

  //Return all the bounded type members for one given ModelTypeDefinition
  def getBoundedTypeMembers(mtd: ModelTypeDefinition): String = {
    var bounded: StringBuilder = new StringBuilder
    mtd.getTypeDefinitions().foreach(td => {
      if (!Util.hasCompilerIgnoreTag(td)) {
        if (td.isInstanceOf[ClassDefinition]) {
          bounded.append("\t")
          bounded.append(getBoundedTypeMember(td, mtd))
          bounded.append("\n")
        }
      }
    })
    bounded.append("\n\t")
    bounded.append("var ")
    bounded.append(Util.getModelTypeFactoryMainVariableName())
    bounded.append(" : ")    
    bounded.append("_root_.")
    bounded.append(Util.getModelTypeFactoryInterfaceQualifiedName(mtd))
    bounded.append("\n")

    return bounded.toString()
  }

}