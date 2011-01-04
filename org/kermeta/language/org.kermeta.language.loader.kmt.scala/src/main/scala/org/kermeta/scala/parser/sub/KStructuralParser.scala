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
 * Sub parser dedicated to parse Block and Expression lists (using parenthesis) in KMT textual syntax  
 */
trait KStructuralParser extends KAbstractParser {

  def fExpressionLst : Parser[List[Expression]] = rep(fStatement) ^^ { case list =>
      /* POST PROCESS, LINK CALLFEATURE EACH OTHER */
      var previous : Option[CallFeature] = None
      var inverstedList : List[Expression] = List()
      list.toList.reverse.foreach(p=>{
          p match {
            case cf : CallFeature if(cf.getTarget.isInstanceOf[NESTED_NEEDED]) => {
                previous match {
                  case None => previous=Some(cf);inverstedList = cf::inverstedList
                  case Some(pe)=> pe.setTarget(cf);previous=Some(cf)
                }
            }
            case _ @ e =>{
                previous match {
                  case None =>inverstedList = e::inverstedList
                  case Some(pe)=> pe.setTarget(e);previous=None
                }
              }

          }

        })
      inverstedList.reverse
  }
  def pExpression : Parser[Expression] = "(" ~> fStatement <~ ")"

  def fBlock : Parser[Expression] = "do" ~> fExpressionLst ~ (fRescueLst?) <~ "end" ^^ { case expL ~ rescueL =>

      var newo = BehaviorFactory.eINSTANCE.createBlock
      newo.getStatement.addAll(expL)
      newo.getStatement.add(rescueL getOrElse BehaviorFactory.eINSTANCE.createEmptyExpression)
      newo
  }

  def fRescueLst = ident ^^^ {BehaviorFactory.eINSTANCE.createEmptyExpression}
  
}
