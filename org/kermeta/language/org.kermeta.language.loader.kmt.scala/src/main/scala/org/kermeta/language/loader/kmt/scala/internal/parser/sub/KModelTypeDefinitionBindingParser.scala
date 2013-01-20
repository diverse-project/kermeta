package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.UnresolvedModelTransformation

//MODELTYPE ADDITION
/**
 * Subparser dedicated to ModelTypeDefinitionBindings (i.e., declaration of subtyping relations between model types)
 */
trait KModelTypeDefinitionBindingParser extends KAbstractParser {

  def modelTypeDefinitionBinding = ident ~ opt(partialBinding) ^^ {
    case id ~ partial => {
      //We create a new binding with an unresolved model type definition with the name of the supertype
      var newb = StructureFactory.eINSTANCE.createModelTypeDefinitionBinding()
      var newu = StructureFactory.eINSTANCE.createUnresolvedModelTypeDefinition()
      newu.setName(id)
      newb.setBoundModelTypeDefinition(newu)
      newb.getOwnedModelTypeDefinitions().add(newu)

      partial match {
        case Some(transfos) => {
          transfos.foreach(t => {
            newb.getTargetedTransformations().add(t)
            newb.getBoundModelTypeDefinition().getOwnedTransformations().add(t)
          })
        }
        case None =>
      }

      newb
    }
  }

  //If the binding is declared only for some transformations (partial)
  private def partialBinding = "[" ~ repsep(targetedTransformation, ",") ~ "]" ^^ { case _ ~ transfos ~ _ => transfos }

  private def targetedTransformation = ident ^^ {
    case id => {
      var newut: UnresolvedModelTransformation = StructureFactory.eINSTANCE.createUnresolvedModelTransformation()
      newut.setName(id)
      newut
    }
  }
}