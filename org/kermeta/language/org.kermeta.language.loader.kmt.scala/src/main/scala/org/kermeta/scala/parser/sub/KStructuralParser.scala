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
      /* POST PROCESS, LINK UnresolvedCall to each other */
      var previousUnresolvedCall : Option[UnresolvedCall] = None
      var processedList : List[Expression] = List()
      // navigate the original list in the reverse order and rebuild a list with the correct exprseeion,
      // recreate a hierachy for Calls that must be nested in the target of another expression
      list.toList.reverse.foreach(p=>{
          p match {
            case cf : UnresolvedCall if(cf.getTarget.isInstanceOf[NESTED_NEEDED]) => {
                previousUnresolvedCall match {
                  case None => previousUnresolvedCall=Some(cf);processedList = cf::processedList
                  case Some(pe)=> pe.setTarget(cf);previousUnresolvedCall=Some(cf)
                }
            }
            case _ @ e =>{
                previousUnresolvedCall match {
                  case None =>processedList = e::processedList
                  case Some(pe)=> pe.setTarget(e);previousUnresolvedCall=None
                }
              }

          }

        })
      processedList
  }
  def pExpression : Parser[Expression] = "(" ~> fStatement <~ ")"

  def fBlock : Parser[Expression] = "do" ~> fExpressionLst ~ (fRescueLst?) <~ "end" ^^ { case expL ~ rescueL =>

      var newo = BehaviorFactory.eINSTANCE.createBlock
      newo.getStatement.addAll(expL)
      newo.getStatement.add(rescueL getOrElse BehaviorFactory.eINSTANCE.createEmptyExpression)
      newo
  }

  def fRescueLst = ident ^^^ { BehaviorFactory.eINSTANCE.createEmptyExpression }
  
}
