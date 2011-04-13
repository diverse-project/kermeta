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
  
  def attribute : Parser[Property] = propertyDeclKeyword ~ ident ~ ":" ~ genericQualifiedType ~ opt(attributeBound|attributeBounds) ^^ { case propertyKeyword ~ id ~ _ ~ qType ~ bounds =>
      var newo = StructureFactory.eINSTANCE.createProperty
      newo.setName(id)
      propertyKeyword match {
        case "attribute" => newo.setIsComposite(true)
        case "reference" => newo.setIsComposite(false)
      }
      bounds match {
        case None => newo.setLower(0);newo.setUpper(1)
        case Some(bb)=> newo.setLower(bb._1);newo.setUpper(bb._2)
      }
      var newqType = KmBuildHelper.selectType(newo,qType)
      newo.getContainedType.add(newqType)
      //newtype.setTypeIdentifier(name)
      newo.setType(newqType)
      newo
  }

  def attributeBound : Parser[Tuple2[Int,Int]] = "[" ~ ( numericLit | "*" ) ~ "]" ^^ { case _ ~ bound ~ _ =>
      bound match {
        case "*" => (-1,-1)
        case s : String => (Integer.parseInt(s),Integer.parseInt(s))
      }
      
  }
  def attributeBounds : Parser[Tuple2[Int,Int]] = "[" ~> numericLit ~ ".." ~ (numericLit | "*" ) <~ "]" ^^{ case lower ~_ ~upper =>
      upper match {
        case "*"=> Tuple2(Integer.parseInt(lower),-1)
        case upper : String => Tuple2(Integer.parseInt(lower),Integer.parseInt(upper))
      }
  }

}
