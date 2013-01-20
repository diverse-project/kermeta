package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure.Tag
import org.kermeta.language.structure.Parameter
import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.loader.kmt.scala.internal.parser.KmBuildHelper
import org.kermeta.language.structure.Type

//MODELTYPE ADDITION
/**
 * Subparser dedicated to ModelTransformations
 */
trait KModelTransformationParser extends KAbstractParser with KMultiplicityParser {
  /* SUB PARSER CONTRACT */
  def annotation: Parser[Tag]
  /* END SUB PARSER CONTRACT */

  private def transformationParameters = repsep(transformationParameter, ",")
  private def transformationReturnType = opt(":" ~> multiplicityType)

  def modelTransformation = ("transformation" ~ ident ~ opt(transformationGenericParems) ~ "(" ~ transformationParameters ~ ")" ~
    transformationReturnType ~ "is" ~ transformationBody) ^^ {
      case _ ~ opName ~ opGParams ~ _ ~ params ~ _ ~ unresolveType ~ _ ~ body =>
        var newt = StructureFactory.eINSTANCE.createModelTransformation
        newt.setName(opName)
        if (body != null) {
          newt.setIsAbstract(false)
          newt.setBody(body)
        } else {
          newt.setIsAbstract(true)
        }

        opGParams match {
          case None =>
          case Some(params) => {
            params.foreach { param =>
              var mtvar = StructureFactory.eINSTANCE.createModelTypeVariable
              mtvar.setName(param._1)
              newt.getTypeParameters.add(mtvar)
              newt.getContainedType.add(mtvar)
              var newu = param._2
              mtvar.setSupertype(newu)
              mtvar.getContainedType.add(newu)
            }
          }
        }

        params.foreach { par => newt.getOwnedParameter.add(par) }

        unresolveType match {
          case None => {
            var newT = KmBuildHelper.getOrCreateUnresolvedType(newt, "kermeta::standard::Void")
            newt.setType(newT)
          }
          case Some(urt) => {
            // copy Type and multiplicity information in this ModelTransformation
            urt.copyToKElem(newt)
          }
        }
        newt
    }

  private def transformationGenericParems = "[" ~ rep1sep(genericDef, ",") ~ "]" ^^ { case _ ~ params ~ _ => params }

  private def genericDef: Parser[Tuple2[String, Type]] = ident ~ genericType ^^ {
    case id ~ genType =>
      var resTuple: Tuple2[String, Type] = (id, genType)
      resTuple
  }

  private def genericType = ":" ~ genericQualifiedType ^^ { case k1 ~ ident => ident }

  def transformationParameter: Parser[Parameter] = ident ~ ":" ~ multiplicityType ^^ {
    case id ~ _ ~ unresolveType =>
      var newo = StructureFactory.eINSTANCE.createParameter
      newo.setName(id)
      unresolveType.copyToKElem(newo)
      newo
  }
  
  private def transformationBody = ("abstract" ^^^ { null } | transformationExpressionBody)

  def transformationExpressionBody = ((annotation?) ~ fStatement) ^^ {
    case a1 ~ exp =>
      a1 match {
        case Some(_@ tag) =>
          exp.getKTag.add(tag)
          exp.getKOwnedTags().add(tag)
        case None =>
      }
      exp
  }
}