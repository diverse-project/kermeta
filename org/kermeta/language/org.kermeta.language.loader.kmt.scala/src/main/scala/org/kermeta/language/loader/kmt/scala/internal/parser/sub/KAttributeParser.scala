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

import org.kermeta.language.behavior.Expression
import org.kermeta.language.structure.Property
import org.kermeta.language.structure.StructureFactory

trait KAttributeParser extends KAbstractParser with KMultiplicityParser{

  def attributeDeclKeyword = ( "attribute" | "reference" )
  def propertyDeclKeyword = ("property")
  def readonlyModifier = opt("readonly")


  def getterParser = "getter" ~ "is" ~ fStatement ^^ { case k1 ~ k2 ~ exp => exp}
  def setterParser = "setter" ~ "is" ~ fStatement ^^ { case k1 ~ k2 ~ exp => exp}

  def getterFirst : Parser[Tuple2[Expression,Expression]] = getterParser ~ opt(setterParser) ^^ { case getM ~ setM =>

    var resTuple : Tuple2[Expression,Expression] = (null,null)

    setM match {
      case Some(setterBody) => resTuple  = (getM, setterBody)
      case None => resTuple  = (getM, resTuple._2)
    }
    resTuple
  }

  def setterFirst : Parser[Tuple2[Expression,Expression]] = setterParser ~ getterParser ^^ { case setM ~ getM =>

    var resTuple : Tuple2[Expression,Expression] = (getM,setM)
    resTuple
  }

  def getterSetterParser : Parser[Tuple2[Expression,Expression]] = (getterFirst | setterFirst)


  def derivedProperty : Parser[Property] = propertyDeclKeyword ~ readonlyModifier ~ ident ~ ":" ~ multiplicityType ~ opt("#" ~> ident) ~ getterSetterParser ^^ { case _ ~ readonlyM ~ id ~ _ ~ mType ~ opposite ~ getSetM =>
    val newo = StructureFactory.eINSTANCE.createProperty
    newo.setName(id)
    newo.setIsComposite(false)
    newo.setIsDerived(true)

    readonlyM match {
      case Some(_) => newo.setIsReadOnly(true)
      case None => newo.setIsReadOnly(false)
    }

    // copy Type and multiplicity information in this Property
    mType.copyToKElem(newo)

    opposite match {
        case Some(opositeName)=>{
          val unresolveProp = StructureFactory.eINSTANCE.createUnresolvedProperty()
          unresolveProp.setPropertyIdentifier(opositeName)
          newo.getOwnedUnresolvedProperties.add(unresolveProp)
          newo.setOpposite(unresolveProp)
        }
        case None =>
      }

    newo.setGetterBody(getSetM._1)
    newo.setSetterBody(getSetM._2)

    newo

  }

  def attribute : Parser[Property] = attributeDeclKeyword ~ readonlyModifier ~ ident ~ ":" ~ multiplicityType ~ opt("#" ~> ident)  ^^ { case propertyKeyword ~ readonlyM ~ id ~ _ ~ mType ~ ooposite =>
      val newo = StructureFactory.eINSTANCE.createProperty
      newo.setName(id)
      propertyKeyword match {
        case "attribute" => {
          newo.setIsComposite(true)
          newo.setIsDerived(false)
        }
        case "reference" => {
          newo.setIsComposite(false)
          newo.setIsDerived(false)
        }
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
