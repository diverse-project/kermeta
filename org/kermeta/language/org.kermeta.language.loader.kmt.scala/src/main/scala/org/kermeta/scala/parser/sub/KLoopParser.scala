/* $Id$
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.scala.parser.sub

import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.structure.impl._
import org.kermeta.language.behavior.impl._
import scala.collection.JavaConversions._

/**
 * Sub parser dedicated to parse Loop expression in KMT textual syntax  
 */
trait KLoopParser extends KAbstractParser {

  def fLoop : Parser[Expression] = "from" ~ fStatement ~ "until" ~ fStatement ~ "loop" ~ fStatement ~ "end" ^^ { case _ ~ init ~ _ ~ stop ~ _ ~ body ~ _ =>



      var newo = BehaviorFactory.eINSTANCE.createLoop
      newo.setInitialization(init)
      newo.setStopCondition(stop)
      newo.setBody(body)
      newo
  }

}
