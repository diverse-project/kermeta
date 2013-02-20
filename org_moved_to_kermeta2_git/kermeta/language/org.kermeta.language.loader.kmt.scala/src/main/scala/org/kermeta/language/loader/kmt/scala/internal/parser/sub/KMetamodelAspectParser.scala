package org.kermeta.language.loader.kmt.scala.internal.parser.sub
import org.kermeta.language.structure.ModelTypeDefinition
import org.kermeta.language.structure.ModelTransformation
import org.kermeta.language.structure.ModelTypeDefinitionBinding
import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.util.ModelingUnit
import org.kermeta.language.structure.Using
import org.kermeta.language.structure.Tag

//MODELTYPE ADDITION
/**
 * Subparser dedicated to metamodels aspects (i.e., declaration of model transformations and subtyping relations)
 */
trait KMetamodelAspectParser extends KAbstractParser with KModelTransformationParser with KModelTypeDefinitionBindingParser {

  def metamodelAspect = "metamodel" ~ ident ~ "{" ~ opt(subtypeof) ~ opt(annotableTransformation+) ~ "}" ^^ {
    case _ ~ _ ~ _ ~ bindings ~ transformations ~ _ => {  
      //Create an "empty" ModelTypeDefinition in order to contain the transformations
      //The real ModelTypeDefinitions will be computed during resolving
      var newmtd: ModelTypeDefinition = StructureFactory.eINSTANCE.createModelTypeDefinition()
      
      bindings match {
        case Some(bs) => {
          bs match {
            case l: List[ModelTypeDefinitionBinding] =>
              l.asInstanceOf[List[ModelTypeDefinitionBinding]].foreach { elem =>
                newmtd.getOwnedBindings().add(elem)
              }
          }
        }
        case None =>
      }

      transformations.foreach(elem => {
        elem match {
          case l: List[_] => l.asInstanceOf[List[_]].foreach { listElem =>
            listElem match {
              case t: ModelTransformation => newmtd.getOwnedTransformations().add(t)
              case _@ elem => println("TODO unknow elem in metamodel")
            }
          }
        }
      })

      newmtd
    }
  }

  private def subtypeof = "subtypeof" ~ repsep(modelTypeDefinitionBinding, ",") ^^ {
    case _ ~ bindings => bindings
  }
  
  private def annotableTransformation = opt((annotation)+) ~ modelTransformation ^^ {
    case tags ~ transfo => {
      tags.foreach { elem =>
        elem match {
          case l: List[_] => l.asInstanceOf[List[_]].foreach { listElem =>
            listElem match {
              case t: Tag =>
                transfo.getKOwnedTags.add(t);
                transfo.getKTag().add(t)
              case _@ elem => println("TODO unknow elem in tag:" + elem)
            }
          }
          case _@ d => println("TODO modeling unit tag content: " + d)
        }
      }
      transfo
    }
  }
}