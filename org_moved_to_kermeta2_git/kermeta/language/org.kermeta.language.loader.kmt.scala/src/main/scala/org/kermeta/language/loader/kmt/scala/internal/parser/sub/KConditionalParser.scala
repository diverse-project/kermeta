/* $Id: KConditionalParser.scala 14584 2011-03-09 16:53:49Z bouhours $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors :
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import scala.collection.JavaConversions._

import org.kermeta.language.behavior.BehaviorFactory
import org.kermeta.language.behavior.Expression

/**
 * Sub parser dedicated to parse Conditional expression in KMT textual syntax
 */
trait KConditionalParser extends KAbstractParser {


  def fConditional : Parser[Expression] = "if"~fStatement~"then"~fExpressionLst~( opt("else"~fExpressionLst ))~"end" ^^ { case _~cond~_~thenBody~elseBody~_=>
      var newo = BehaviorFactory.eINSTANCE.createConditional
      newo.setCondition(cond)

      var newThenBlock = BehaviorFactory.eINSTANCE.createBlock
      newThenBlock.getStatement.addAll(thenBody)
      newo.setThenBody(newThenBlock)
      elseBody match {
        case None => //NOTHING TO DO
        case Some(_ @ parser) => parser match {
            case "else"~elseBody =>{
                var newElseBlock = BehaviorFactory.eINSTANCE.createBlock
                newElseBlock.getStatement.addAll(elseBody)
                newo.setElseBody(newElseBlock)
              }
          }
      }
      newo
  }

}
