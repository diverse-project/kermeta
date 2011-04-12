/* $Id: KStructuralParser.scala 14622 2011-03-11 17:11:36Z bouhours $
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

  def fBlock : Parser[Expression] = "do" ~> fExpressionLst ~ rep(fRescue) <~ "end" ^^ { case expL ~ rescueL =>

      var newo = BehaviorFactory.eINSTANCE.createBlock
      newo.getStatement.addAll(expL)
      newo.getRescueBlock.addAll(rescueL)
      newo
  }

  def fRescue : Parser[Rescue] = "rescue"~"(" ~> ident ~ ":" ~ packageName ~ ")" ~ fExpressionLst ^^ { case rIdent~_~rPname~_~rescueL =>

      var newo = BehaviorFactory.eINSTANCE.createRescue
      newo.setExceptionName(rIdent)
      var newtyperef = BehaviorFactory.eINSTANCE.createTypeReference
      var newtype = StructureFactory.eINSTANCE.createUnresolvedType
      newtype.setTypeIdentifier(rPname)
      newtyperef.setName(rPname)
      newtyperef.setType(newtype)
      newtyperef.getContainedType.add(newtype)
      newo.setExceptionType(newtyperef)
      newo.getBody.addAll(rescueL)

      newo
  }
  
}
