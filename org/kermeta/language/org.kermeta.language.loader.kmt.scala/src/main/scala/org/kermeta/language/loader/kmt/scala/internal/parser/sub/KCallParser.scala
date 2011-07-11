/* $Id: KCallParser.scala 14020 2011-01-06 08:06:01Z francoisfouquet $
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
 * Sub parser dedicated to parse the various way to call something in KMt textual syntax
 *
 */
trait KCallParser extends KAbstractParser with KGenericTypeParser with KLambdaParser{


  def fCall = resultCall | nCall | firstCall

  def resultCall = "result" ^^^ {
    BehaviorFactory.eINSTANCE.createCallResult
  }

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

  def firstCall : Parser[UnresolvedCall] = genericQualifiedTypeObject ~ (callFeatureParams?) ^^ { case unresType ~ params =>
      var newo = BehaviorFactory.eINSTANCE.createUnresolvedCall
      newo.setName(unresType.getTypeIdentifier())
      newo.getGenerics().addAll(unresType.getGenerics())
      params match {
        case Some(_ @ par) => for(p <- par) newo.getParameters.add(p)
        case None => 
      }
      newo
  }

  def callFeatureParams = "(" ~> repsep( fStatement,",") <~ ")" |  repsep( fLambda,",")  

}
