/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure.KermetaModelElement
import org.kermeta.language.structure.StructureFactory
import scala.util.parsing.input.OffsetPosition
import scala.util.parsing.input.Positional

trait KPositionedParser extends KAbstractParser {

  def addPosition(modelElem: KermetaModelElement,posToken : Positional,posTokenEnd : Positional) : KermetaModelElement = {
    var newtag= StructureFactory.eINSTANCE.createTag
    newtag.setName("traceability_text_reference")
    
    
    //println(modelElem + "----"+ posToken)
    
    var beginOffset = posToken.pos.asInstanceOf[OffsetPosition].offset
    var endOffset = posTokenEnd.pos.asInstanceOf[OffsetPosition].offset
    //println(posToken+"="+beginOffset+"=>"+endOffset+"="+posTokenEnd)
    
    
    //newtag.setValue(posToken.pos.line.toString + ";" + posToken.pos.column.toString+";"+posTokenEnd.pos.line.toString + ";" + posTokenEnd.pos.column.toString)
    
    newtag.setValue(beginOffset.toString + ";" + endOffset.toString)
    
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
                      /*
                      var tokenEnd = in.rest
                      while(tokenEnd.rest.first != rest.first){
                        println(tokenEnd.first)
                        tokenEnd = tokenEnd.rest
                      }*/
                      
                      rest.first match {
                        case positionedEndToken : Positional => {
                            positionedResult = addPosition(me,positionedToken,positionedEndToken).asInstanceOf[T]  
                        }
                        case _ => //positionedResult = addPosition(me,positionedToken).asInstanceOf[T]
                      }
                      
                    }
                  case _ @ e=> println("PositionedToken which is not a KermetaModelElement : " +e)
                }
              }
              Success(positionedResult,rest)
          }
        }
      case _ @ e => e
    }
  }  
}