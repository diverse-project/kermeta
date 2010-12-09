/* $Id$
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.scala.parser

import org.kermeta.scala.parser.sub.KAbstractParser
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.structure.impl._
import org.kermeta.language.behavior.impl._
import org.kermeta.scala.parser.sub._
import scala.collection.JavaConversions._

/**
 * Parser of Kermeta expression in KMT textual syntax
 *
 */
trait KExpressionParser extends KAbstractParser
                           with KStructuralParser
                           with KQualifiedNameParser
                           with KVarParser
                           with KConditionalParser
                           with KLiteralParser
                           with KLoopParser
                           with KCallParser
                           with KPrimitiveExpressionParser
                           with KLambdaParser
                           with KThrowParser{

  /**
   * extend the fExpression parser with sub parser
   */
  override def fExpression : Parser[Expression] = ( fThrow | fLiteral | fBlock | pExpression | fVariableDecl | fCall | fLoop | fConditional | fLambda )
  override def fStatement : Parser[Expression] = fAssignement

  def parseExpression(content : String) : Option[Expression] = {
    val tokens = new lexical.Scanner(content)
    val result = phrase(fStatement)(tokens)
    result match {
      case Success(tree, _) => {Some(tree) }
      case e: NoSuccess => {println(e);None}
    }
  }

}
