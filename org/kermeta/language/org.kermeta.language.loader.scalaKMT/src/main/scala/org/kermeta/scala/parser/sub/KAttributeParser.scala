/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser.sub

import org.kermeta.language.structure.Property
import org.kermeta.language.structure.StructureFactory

trait KAttributeParser extends KAbstractParser with KGenericTypeParser {

  def attribute : Parser[Property] = "attribute" ~> ident ~ ":" ~ genericQualifiedType ~ opt(attributeBound|attributeBounds) ^^ { case id ~ _ ~ qType ~ bounds =>
      var newo = StructureFactory.eINSTANCE.createProperty
      newo.setName(id)
      bounds match {
        case None => newo.setLower(0);newo.setUpper(1)
        case Some(bb)=> newo.setLower(bb._1);newo.setUpper(bb._2)
      }
//      var newtype = StructureFactory.eINSTANCE.createUnresolvedType
      newo.getContainedType.add(qType)
      //newtype.setTypeIdentifier(name)
      newo.setType(qType)
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
