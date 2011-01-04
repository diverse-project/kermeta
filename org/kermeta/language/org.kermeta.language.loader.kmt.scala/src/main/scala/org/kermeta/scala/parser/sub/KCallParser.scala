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
 * Sub parser dedicated to parse the various way to call something in KMt textual syntax
 *
 */
trait KCallParser extends KAbstractParser {


  def fCall = nCall | firstCall


  def nCall = "." ~> ident ~ (callFeatureParams?) ^^ { case id ~ params =>
      var newo = BehaviorFactory.eINSTANCE.createUnresolvedCall
      newo.setName(id)
      params match {
        case Some(_ @ par) => for(p <- par) newo.getParameters().add(p)
        case None =>
      }
      newo.setTarget(NESTED_NEEDED())
      newo
  }

  def firstCall : Parser[UnresolvedCall] = packageName ~ (callFeatureParams?) ^^ { case id ~ params =>
      var newo = BehaviorFactory.eINSTANCE.createUnresolvedCall
      newo.setName(id)
      params match {
        case Some(_ @ par) => for(p <- par) newo.getParameters.add(p)
        case None => 
      }
      newo
  }

  def callFeatureParams = "(" ~> repsep( fStatement,",") <~ ")"

}
