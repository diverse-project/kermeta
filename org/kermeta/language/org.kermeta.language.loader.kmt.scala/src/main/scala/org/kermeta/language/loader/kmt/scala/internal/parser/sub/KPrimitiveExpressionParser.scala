/* $Id: KPrimitiveExpressionParser.scala 14540 2011-03-08 16:24:43Z bouhours $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */


package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.behavior.BehaviorFactory
import org.kermeta.language.behavior.CallExpression
import org.kermeta.language.behavior.Expression
/**
 * Sub parser dedicated to parse Assignment expression and operators in KMT textual syntax  
 */
trait KPrimitiveExpressionParser extends KAbstractParser with KStructuralParser {

   // override def fStatement : Parser[Expression] = fAssignement
   //override def fStatement : Parser[Expression] = fLiteral | fBlock | pExpression | fVariableDecl | fCall | fLoop | fConditional


    def fAssignement : Parser[Expression] = fLogicalExpression ~ opt(  (":=" | "?=") ~ fLogicalExpression) ^^ { case target ~ statment =>
      statment match {
        case Some(e) => {
            var newo = BehaviorFactory.eINSTANCE.createAssignment //TODO CHECK CALL FEATURE
            newo.setTarget(target.asInstanceOf[CallExpression])
            e match {
              case ":=" ~ t => {
                newo.setValue(t)
              }
             case "?=" ~ t => {
                newo.setValue(t)
                newo.setIsCast(true)
              }
            }
            newo
          }
        case None => target
      }
  }

  def fLogicalExpression : Parser[Expression] = fRelationalExpression ~ rep(fLogicalOp ~ fRelationalExpression ) ^^{ case exp ~ bexp =>
      var result : Expression  = exp
      bexp.foreach{bexpp=>
        var newo = BehaviorFactory.eINSTANCE.createUnresolvedCall
        newo.setTarget(result)
        bexpp match {
          case "and" ~ e => newo.setName("and");newo.getParameters.add(e)
          case "or" ~ e => newo.setName("or");newo.getParameters.add(e)
        }
        result = newo
      }
      result
  }
  def fLogicalOp = "and" | "or"
  def fRelationalExpression : Parser[Expression] = fAddExpression ~ rep(fRelationalOp ~ fAddExpression ) ^^{ case exp ~ bexp =>
      var result : Expression  = exp
      bexp.foreach{bexpp=>
        var newo = BehaviorFactory.eINSTANCE.createUnresolvedCall
        newo.setTarget(result)
        bexpp match {
          case "==" ~ e => newo.setName("equals");newo.getParameters.add(e)
          case "!=" ~ e => newo.setName("isNotEqual");newo.getParameters.add(e)
          case "<" ~ e => newo.setName("isLower");newo.getParameters.add(e)
          case ">" ~ e => newo.setName("isGreater");newo.getParameters.add(e)
          case "<=" ~ e => newo.setName("isLowerOrEqual");newo.getParameters.add(e)
          case ">=" ~ e => newo.setName("isGreaterOrEqual");newo.getParameters.add(e)
        }
        result = newo
      }
      result
  }
  def fRelationalOp = "==" | "!=" | "<" | ">" | "<=" | ">="
  def fAddExpression : Parser[Expression] = fMultExpression ~ rep(fAddOp ~ fMultExpression ) ^^{ case exp ~ bexp =>
      var result : Expression  = exp
      bexp.foreach{bexpp=>
        var newo = BehaviorFactory.eINSTANCE.createUnresolvedCall
        newo.setTarget(result)
        bexpp match {
          case "+" ~ e => newo.setName("plus");newo.getParameters.add(e)
          case "-" ~ e => newo.setName("minus");newo.getParameters.add(e)
        }
        result = newo
      }
      result
  }
  def fAddOp = "+" | "-"
  def fMultExpression : Parser[Expression] = fUnaryExpression ~ rep(fMultOp ~ fUnaryExpression ) ^^{ case exp ~ bexp =>
      var result : Expression  = exp
      bexp.foreach{bexpp=>
        var newo = BehaviorFactory.eINSTANCE.createUnresolvedCall
        newo.setTarget(result)
        bexpp match {
          case "*" ~ e => newo.setName("mult");newo.getParameters.add(e)
          case "/" ~ e => newo.setName("div");newo.getParameters.add(e)
        }
        result = newo
      }
      result
  }
  def fMultOp = "*" | "/"
  def fUnaryExpression : Parser[Expression] = (fUnaryOp?) ~ fExpressionMergedCall   ^^ {
    case op ~ stat => {
        op match {
          case Some(op) => {
              var newo = BehaviorFactory.eINSTANCE.createUnresolvedCall
              newo.setTarget(stat)
              op match {
                case "not" => newo.setName("not")
                case "!" => newo.setName("not")
                case "-" => newo.setName("uminus")
              }
              newo
            }
          case None => stat
        }
      }
  }
  
  def fUnaryOp = "not" | "!" | "-"

}
