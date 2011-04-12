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

import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.structure.impl._
import org.kermeta.language.behavior.impl._
import scala.collection.JavaConversions._

/**
 * Sub parser dedicated to parse Loop expression in KMT textual syntax  
 */
trait KLoopParser extends KAbstractParser {

  def fLoop : Parser[Expression] = "from" ~ fExpressionLst ~ "until" ~ fStatement ~ "loop" ~ fExpressionLst ~ "end" ^^ { case _ ~ init ~ _ ~ stop ~ _ ~ body ~ _ =>



      var newo = BehaviorFactory.eINSTANCE.createLoop
      var newBlock = BehaviorFactory.eINSTANCE.createBlock
      newBlock.getStatement.addAll(init)
      newo.setInitialization(newBlock)
      newo.setStopCondition(stop)
      newBlock = BehaviorFactory.eINSTANCE.createBlock
      newBlock.getStatement.addAll(body)
      newo.setBody(newBlock)
      newo
  }

}
