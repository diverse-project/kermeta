/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure.KermetaModelElement
import org.kermeta.language.structure.StructureFactory
import scala.util.parsing.input.Positional

trait KPositionedParser extends KAbstractParser {

  def addPosition(modelElem: KermetaModelElement,posToken : Positional) : KermetaModelElement = {
    var newtag= StructureFactory.eINSTANCE.createTag
    newtag.setName("traceability_text_reference")
    println(posToken + "/" + posToken.pos.column.toString)
    newtag.setValue(posToken.pos.line.toString + ";" + posToken.pos.column.toString)
    modelElem.getKOwnedTags.add(newtag)
    modelElem
  }
  
  def kpositioned[T](p : Parser[T]) : Parser[T] = Parser { in =>
    p(in) match {
      case Success(x,rest) => {
          var positionedResult = x
          in.first match {
            case positionedToken : Positional => { 
                x match {
                  case me : KermetaModelElement => {
                      positionedResult = addPosition(me,positionedToken).asInstanceOf[T]
                    }
                  case _ @ e=> println(e)
                }
              }
              Success(positionedResult,rest)
          }
        }
      case _ @ e => e
    }
  }  
}