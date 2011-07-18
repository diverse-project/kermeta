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
import scala.annotation.tailrec
import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer

/**
 * Sub parser dedicated to parse Block and Expression lists (using parenthesis) in KMT textual syntax  
 */
trait KStructuralParser extends KAbstractParser {

  def fExpressionExpressionWithCallParser = Parser { in =>
    val elems = new ListBuffer[Expression]
    val p0 = fExpression    // avoid repeatedly re-evaluating by-name parser     
    @tailrec def applyp(in0: Input): ParseResult[List[Expression]] = 
      p0(in0) match {
        case Success(x, rest)   => {
            x match {
              case cf : Literal => {
                  elems += x ; applyp(rest)
                }
              case cf : UnresolvedCall if(cf.getTarget.isInstanceOf[NESTED_NEEDED]) => {
                  elems += x ; applyp(rest)
                }
              case cf : UnresolvedCall if(!cf.getTarget.isInstanceOf[NESTED_NEEDED]) => {                 
                  if(elems.size == 0){
                    elems += x ; applyp(rest)
                  } else {
                    Success(elems.toList, in0)
                  }
                }
              case _ @ e => {
                  if(elems.size > 0){
                   // Error("kermeta expression expected",in0)
                   Success(elems.toList, in0)
                    
                  }  else {
                    elems += x ;
                    Success(elems.toList, rest)
                  }
                  
                  
                  //SI ELEMS > 0
                  // SUCESS
                  // otherwise 
                  //  NoSucess
                }  
            }
          }
        case ns: NoSuccess      => {
                      
            
            if(elems.size > 0){
              //Success((), in)
              Success(elems.toList, in0)
            } else {
              ns
            }
          }
      }
	     
    applyp(in)
  }


  /**
   * Parses a one or several expressions but returns only one expression. This method thus link the input
   * expressions.
   */
  def fExpressionMergedCall : Parser[Expression] = fExpressionExpressionWithCallParser ^^ { case l =>
      var previousUnresolvedCall : Option[UnresolvedCall] = None
      var processedList : List[Expression] = List()
      // navigate the original list in the reverse order and rebuild a list with the correct exprseeion,
      // recreate a hierachy for Calls that must be nested in the target of another expression
      l.reverse.foreach(p=>{
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
      if(processedList.size > 1){
        println("fail")
        println(processedList.mkString)
        failure("Chain expression failed !")
      }
      processedList.head
  }


  /**
   * Parses a list of statements and expressions that can contain unresolved and unlinked calls. THis method
   * also contains a process to link these unresolved calls.
   */
  def fExpressionLst : Parser[List[Expression]] = rep(fStatement) ^^ { case list =>
      /* POST PROCESS, LINK UnresolvedCall to each other */
      var previousUnresolvedCall : Option[UnresolvedCall] = None
      var processedList : List[Expression] = List()
      // navigate the original list in the reverse order and rebuild a list with the correct expression,
      // recreate a hierarchy for Calls that must be nested in the target of another expression
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

  def fRescue : Parser[Rescue] = "rescue" ~ "(" ~> ident ~ ":" ~ packageName ~ ")" ~ fExpressionLst ^^ { case rIdent~_~rPname~_~rescueL =>

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
