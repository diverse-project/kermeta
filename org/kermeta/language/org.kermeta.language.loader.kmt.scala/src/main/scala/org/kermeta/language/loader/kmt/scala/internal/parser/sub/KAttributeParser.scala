/* $Id: ParserUtil.scala 11790 2010-07-19 09:21:17Z dvojtise $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors :
 * 		Francois Fouquet <ffouquet@irisa.fr>
 * 		Didier Vojtisek <didier.vojtisek@inria.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure.Property
import org.kermeta.language.structure.StructureFactory
import scala.Predef._

trait KAttributeParser extends KAbstractParser with KMultiplicityParser {

  def propertyDeclKeyword = ( "attribute" | "reference" )
  def readonlyModifier = opt("readonly")


  def attribute : Parser[Property] = propertyDeclKeyword ~ readonlyModifier ~ ident ~ ":" ~ multiplicityType ~ opt("#" ~> ident) ^^ { case propertyKeyword ~ readonlyM ~ id ~ _ ~ mType ~ ooposite =>
      val newo = StructureFactory.eINSTANCE.createProperty
      newo.setName(id)
      propertyKeyword match {
        case "attribute" => newo.setIsComposite(true)
        case "reference" => newo.setIsComposite(false)
      }
      readonlyM match {
        case Some(_) => newo.setIsReadOnly(true)
        case None => newo.setIsReadOnly(false)
      }
      // copy Type and multiplicity information in this Property
      mType.copyToKElem(newo)

      ooposite match {
        case Some(opositeName)=>{
          val unresolveProp = StructureFactory.eINSTANCE.createUnresolvedProperty()
          unresolveProp.setPropertyIdentifier(opositeName)
          newo.getOwnedUnresolvedProperties.add(unresolveProp)
          newo.setOpposite(unresolveProp)
        }
        case None =>
      }

      newo
  }






}
