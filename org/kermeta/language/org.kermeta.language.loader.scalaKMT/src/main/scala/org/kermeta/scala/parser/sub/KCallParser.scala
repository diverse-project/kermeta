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

    def fCall = fCallStart ~ rep( "." ~> fCallParam ) ^^ { case startExpr ~ targetL =>
      var result : CallFeature  = startExpr
      targetL.foreach{t=>
        t.setTarget(result)
        /*
         var newo = BehaviorFactory.eINSTANCE.createCallFeature
         newo.setTarget(result)
         bexpp match {
         case "and" ~ e => newo.setName("and");newo.getParameters.add(e)
         case "or" ~ e => newo.setName("or");newo.getParameters.add(e)
         }*/
        result = t
      }
      result
  }

  def fCallStart : Parser[CallFeature] = ( fLiteral | fCallParam ) ^^ {
    case cf : CallFeature => cf
    case _ @ e => {
        var newo = BehaviorFactory.eINSTANCE.createCallFeature
        newo.setName(e.toString)
        newo
      }
  }

  def fCallParam : Parser[CallFeature] = packageName ~ (callFeatureParams?) ^^ { case id ~ params =>
      var newo = BehaviorFactory.eINSTANCE.createCallFeature
      newo.setName(id)
      params match {
        case Some(_ @ par) => for(p <- par) newo.getParameters.add(p)
        case None => 
      }
      newo
  }

  def callFeatureParams = "(" ~> repsep( fStatement,",") <~ ")"


}
