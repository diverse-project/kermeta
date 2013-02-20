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
import org.kermeta.language.structure.Property

//MODELTYPE ADDITION
object UtilModelTypeDefinition {

  /**
   * Maps used during the generation
   */
  var typeDefinitionToModelTypeDefinition: HashMap[ModelElementTypeDefinition, java.util.Set[ModelTypeDefinition]] = new HashMap[ModelElementTypeDefinition, java.util.Set[ModelTypeDefinition]]
  /*
   * All bindings for model element type definitions (including direct ones and inherited ones from super model types of super model types)
   */
  var typeDefinitionBindings: HashMap[ModelElementTypeDefinition, java.util.HashSet[ModelElementTypeDefinition]] = new HashMap[ModelElementTypeDefinition, java.util.HashSet[ModelElementTypeDefinition]]
  /*
   * Direct bindings for model element type definitions
   */
  var typeDefinitionDirectBindings: HashMap[ModelElementTypeDefinition, java.util.Set[ModelElementTypeDefinition]] = new HashMap[ModelElementTypeDefinition, java.util.Set[ModelElementTypeDefinition]]

  var ruleToTransformation: HashMap[Operation, java.util.Set[ModelTransformation]] = new HashMap[Operation, java.util.Set[ModelTransformation]]

  var operationsFromMatchedClassDefinitions: HashMap[ClassDefinition, java.util.Set[Operation]] = new HashMap[ClassDefinition, java.util.Set[Operation]]

  /**
   * Methods to access the shared maps
   */
  def isReferencedByModelTypeDefinition(td: ModelElementTypeDefinition): Boolean = {
    return typeDefinitionToModelTypeDefinition.containsKey(td)
  }

  def getReferencingModelTypeDefinitions(td: ModelElementTypeDefinition): Option[java.util.Set[ModelTypeDefinition]] = {
    return typeDefinitionToModelTypeDefinition.get(td)
  }

  def getTypeDefinitionBindings(td: ModelElementTypeDefinition): Option[java.util.Set[ModelElementTypeDefinition]] = {
    return typeDefinitionBindings.get(td)
  }

  def getTypeDefinitionDirectBindings(td: ModelElementTypeDefinition): Option[java.util.Set[ModelElementTypeDefinition]] = {
    return typeDefinitionDirectBindings.get(td)
  }

  def isTransformationRule(op: Operation): Boolean = {
    return ruleToTransformation.containsKey(op)
  }
  
  def getOperationsFromMatchedClassDefinitions(cd : ClassDefinition) : Option[java.util.Set[Operation]] = {
    return operationsFromMatchedClassDefinitions.get(cd)
  }
  
  /**
   * Preprocessing filling the different maps used during the generation of ModelTypeDefinitions
   */
  def preprocessMetamodel(mm: Metamodel) = {
    mm.getOwnedModelTypeDefinitions().foreach(mtd => {
      //Link model element type definitions to the different model type definitions referencing them
      fillTypeDefinitionMap(mtd)
      //Link operations to the different model transformations using them
      fillRuleMap(mtd)
    })
    //Link model element type definitions to all their matched model element type definitions
    fillAllTypeDefinitionBindings(mm)
    //Link class definitions to all the operations from their matched class definitions they must implement
    fillClassDefinitionToOperations(mm)
  }

  private def fillTypeDefinitionMap(mtd: ModelTypeDefinition) = {
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

  private def fillClassDefinitionToOperations(mm: Metamodel) = {
    var ops: java.util.Set[Operation] = null
    mm.getOwnedModelTypeDefinitions().foreach(mtd => {
      mtd.getTypeDefinitions().foreach(td => {
        if (td.isInstanceOf[ClassDefinition]) {
          ops = new java.util.HashSet[Operation]
          
          typeDefinitionBindings.get(td) match {
            case Some(s) => {
              s.foreach(matched => {
                if (matched.isInstanceOf[ClassDefinition]) {
                  ops.addAll(matched.asInstanceOf[ClassDefinition].getOwnedOperation())
                }
              })
            }
            case None =>
          }
          
          var opsToBeRemoved = new java.util.HashSet[Operation]          
          ops.foreach(op => {
            td.asInstanceOf[ClassDefinition].getOwnedOperation().foreach(oop => {
              if (op.getName() == oop.getName() && op.getTypeParameter().size() == oop.getTypeParameter().size()) {
                opsToBeRemoved.add(op)
              }
            })
          })
          ops.removeAll(opsToBeRemoved)          
                    
          operationsFromMatchedClassDefinitions.get(td.asInstanceOf[ClassDefinition]) match {
            case Some(s) => s.addAll(ops)
            case None => operationsFromMatchedClassDefinitions.put(td.asInstanceOf[ClassDefinition], ops)
          }
         
        }
      })
    })
  }

  private def fillAllTypeDefinitionBindings(mm: Metamodel) = {
    mm.getOwnedModelTypeDefinitions().foreach(mtd => {
      fillTypeDefinitionDirectBindings(mtd)
    })
    mm.getOwnedModelTypeDefinitions().foreach(mtd => {
      fillTypeDefinitionBindings(mtd)
    })

  }

  private def fillTypeDefinitionDirectBindings(mtd: ModelTypeDefinition) = {

    var directBindings: java.util.Set[ModelElementTypeDefinition] = null

    mtd.getTypeDefinitions().foreach(td => {
      directBindings = new java.util.HashSet[ModelElementTypeDefinition]
      mtd.getOwnedBindings().foreach(b => {
        b.getOwnedClassDefinitionBindings().foreach(cb => {
          if (cb.getSource() == td) {
            directBindings.add(cb.getTarget())
          }
        })
      })
      if (!typeDefinitionDirectBindings.containsKey(td)) {
        typeDefinitionDirectBindings.put(td, new java.util.HashSet[ModelElementTypeDefinition])
      }
      typeDefinitionDirectBindings.get(td) match {
        case Some(s) => s.addAll(directBindings)
        case None => //This case will never happen
      }
    })
  }

  private def fillTypeDefinitionBindings(mtd: ModelTypeDefinition) = {
    var bindings: java.util.Set[ModelElementTypeDefinition] = null
    mtd.getTypeDefinitions().foreach(td => {
      bindings = getAllBindings(td)

      if (!typeDefinitionBindings.containsKey(td)) {
        typeDefinitionBindings.put(td, new java.util.HashSet[ModelElementTypeDefinition])
      }
      typeDefinitionBindings.get(td) match {
        case Some(s) => s.addAll(bindings)
        case None => //This case will never happen
      }
    })
  }

  private def getAllBindings(td: ModelElementTypeDefinition): java.util.Set[ModelElementTypeDefinition] = {
    var bindings: java.util.Set[ModelElementTypeDefinition] = new java.util.HashSet[ModelElementTypeDefinition]
    typeDefinitionDirectBindings.get(td) match {
      case Some(s) => {
        s.foreach(b => {
          bindings.addAll(getAllBindings(b))
        })
        bindings.addAll(s)
      }
      case None =>
    }
    return bindings
  }

  private def fillRuleMap(mtd: ModelTypeDefinition) = {
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
    var res: StringBuilder = new StringBuilder
    res.append("type ")
    res.append(Util.getTypeMemberName(td))
    res.append(" <: ")
    res.append("_root_.")
    res.append(Util.getModelTypeInterfaceQualifiedName(td))
    return res.toString()
  }

  def getFixedTypeMember(td: ModelElementTypeDefinition): String = {
    var res: StringBuilder = new StringBuilder
    res.append("type ")
    res.append(Util.getTypeMemberName(td))
    res.append(" = ")
    res.append("_root_.")
    if (td.isInstanceOf[GenericTypeDefinition]) {
      res.append(Util.getQualifiedNamedAspect(td.asInstanceOf[GenericTypeDefinition]))
      if (td.isInstanceOf[org.kermeta.language.structure.Class]) {
        Util.generateBindingParameterClass(td.asInstanceOf[org.kermeta.language.structure.Class], res)
      }
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
    var mtd = mm.getOwnedModelTypeDefinitions().find(m => { m.getName() == mm.getName() })
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