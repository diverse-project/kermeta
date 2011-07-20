/* $Id: ParserUtil.scala 11790 2010-07-19 09:21:17Z dvojtise $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors :
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure.Property
import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.loader.kmt.scala.internal.parser.KmBuildHelper

trait KAttributeParser extends KAbstractParser with KGenericTypeParser {

  def propertyDeclKeyword = ( "attribute" | "reference" )
  def collectionModifierKeyword = ("set" | "seq" | "oset" |"bag")
  
  def attribute : Parser[Property] = propertyDeclKeyword ~ ident ~ ":" ~ opt(collectionModifierKeyword) ~ genericQualifiedType ~ opt("#" ~> ident) ~ opt(attributeBounds) ^^ { case propertyKeyword ~ id ~ _ ~ collectionModifier ~ qType ~ ooposite ~ bounds =>
      val newo = StructureFactory.eINSTANCE.createProperty
      newo.setName(id)
      propertyKeyword match {
        case "attribute" => newo.setIsComposite(true)
        case "reference" => newo.setIsComposite(false)
      }
      collectionModifier match{
        case None => newo.setIsOrdered(true);newo.setIsUnique(true)
        case Some(cMod) => cMod match{
            case "set" => newo.setIsOrdered(false);newo.setIsUnique(true)
            case "oset" => newo.setIsOrdered(true);newo.setIsUnique(true)
            case "seq" => newo.setIsOrdered(true);newo.setIsUnique(false)
            case "bag" => newo.setIsOrdered(false);newo.setIsUnique(false)
        }
      }
      bounds match {
        case None => newo.setLower(0);newo.setUpper(1)
        case Some(bb)=> newo.setLower(bb._1);newo.setUpper(bb._2)
      }
      ooposite match {
        case Some(opositeName)=>{
          val unresolveProp = StructureFactory.eINSTANCE.createUnresolvedProperty()
          unresolveProp.setPropertyIdentifier(opositeName)
          newo.getOwnedUnresolvedProperties.add(unresolveProp)
          newo.setOpposite(unresolveProp)
        }
        case None =>
      }

      val newqType = KmBuildHelper.selectType(newo,qType)
      newo.getContainedType.add(newqType)
      //newtype.setTypeIdentifier(name)
      newo.setType(newqType)
      newo
  }






}
