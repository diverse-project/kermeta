/* $Id: KLoopParser.scala 14584 2011-03-09 16:53:49Z bouhours $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import scala.collection.JavaConversions.seqAsJavaList

import org.kermeta.language.behavior.BehaviorFactory
import org.kermeta.language.behavior.Expression

/**
 * Sub parser dedicated to parse Loop expression in KMT textual syntax  
 */
trait KLoopParser extends KAbstractParser {

  def fLoop : Parser[Expression] = "from" ~ /*fExpressionLst*/fStatement ~ "until" ~ fStatement ~ "loop" ~ fExpressionLst ~ "end" ^^ { case _ ~ init ~ _ ~ stop ~ _ ~ body ~ _ =>

      var newo = BehaviorFactory.eINSTANCE.createLoop
      
      //newBlock.getStatement.addAll(init)
      newo.setInitialization(init)
      newo.setStopCondition(stop)
      var newBlock = BehaviorFactory.eINSTANCE.createBlock
      newBlock = BehaviorFactory.eINSTANCE.createBlock
      newBlock.getStatement.addAll(body)
      newo.setBody(newBlock)
      newo
  }

}
