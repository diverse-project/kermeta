/* $Id: KLiteralParser.scala 11792 2010-07-19 09:51:09Z dvojtise $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import java.util.regex.Pattern

import org.kermeta.language.behavior.BehaviorFactory
import org.kermeta.language.behavior.Expression

/**
 * Sub parser dedicated to parse Literal expression in KMT textual syntax
 * This includes booleans, Void, String, and  numeric literals  
 */
trait KLiteralParser extends KAbstractParser {

  def fLiteral : Parser[Expression] = (fVoidLiteral|fSelfLiteral|fStringLiteral|fBooleanLiteral|fNumericLiteral|fresultLiteral|fValueLiteral)
  def fBooleanLiteral : Parser[Expression] = ("true" ^^^ {
      var newo = BehaviorFactory.eINSTANCE.createBooleanLiteral;newo.setValue(true)
      newo
    } | "false" ^^^ {
      var newo = BehaviorFactory.eINSTANCE.createBooleanLiteral;newo.setValue(false)
      newo
    } )

  private def fSelfLiteral : Parser[Expression] = ( "self" ) ^^^ { BehaviorFactory.eINSTANCE.createSelfExpression() }
  //private def fSuperLiteral : Parser[Expression] = ( "super" ) ^^^ { BehaviorFactory.eINSTANCE.createCallSuperOperation() }
  private def fVoidLiteral : Parser[Expression] = ( "void" ) ^^^ { BehaviorFactory.eINSTANCE.createVoidLiteral }
  private def fresultLiteral : Parser[Expression] = ( "result" ) ^^^ { BehaviorFactory.eINSTANCE.createCallResult }
  private def fStringLiteral : Parser[Expression] = ( stringLit ^^ { case e => 
    	var newo =BehaviorFactory.eINSTANCE.createStringLiteral;
    	var lit = e.toString.replaceAll(Pattern.quote("\\n"),"\n")
    	lit = lit.replaceAll(Pattern.quote("\\t"),"\t")
    	lit = lit.replaceAll(Pattern.quote("\\r"),"\r")
    	lit = lit.replaceAll(Pattern.quote("\\f"),"\f")
    	lit = lit.replaceAll(Pattern.quote("\\\""),"\"")
      lit = lit.replaceAll(Pattern.quote("\\\'"),"\'")
    	lit = lit.replaceAll("\\\\\\\\","\\\\")
    	newo.setValue(lit);newo  
  	} 
  )
  private def fNumericLiteral : Parser[Expression] = ( numericLit ^^ { case e => var newo =BehaviorFactory.eINSTANCE.createIntegerLiteral;newo.setValue(e.toInt);newo  } )
  private def fValueLiteral : Parser[Expression] = ( "value" ^^^ {BehaviorFactory.eINSTANCE.createCallValue()} )
}
