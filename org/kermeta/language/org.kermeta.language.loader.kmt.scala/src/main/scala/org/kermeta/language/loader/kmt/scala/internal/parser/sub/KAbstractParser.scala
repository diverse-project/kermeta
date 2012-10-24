/* $Id: KAbstractParser.scala 14584 2011-03-09 16:53:49Z bouhours $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import scala.collection.mutable.HashMap
import scala.util.parsing.combinator.syntactical.TokenParsers

import org.kermeta.language.behavior.Expression
import org.kermeta.language.behavior.impl.EmptyExpressionImpl
import org.kermeta.language.loader.kmt.scala.internal.lexer.KMLexical
import org.kermeta.language.structure.Type

/**
 * Common part of all Sub parsers
 */
trait KAbstractParser extends TokenParsers {


  case class NESTED_NEEDED extends EmptyExpressionImpl


  //var lastExpression : Option[Expression] = None

  type Tokens = org.kermeta.language.loader.kmt.scala.internal.lexer.KTokens
  val lexical = new KMLexical {
    override def whitespace: Parser[Any] = rep(whitespaceChar | comment)
  }
  import lexical._

  def fStatement : Parser[Expression]
  def fExpression : Parser[Expression] = fLiteral
  def fExpressionLst : Parser[List[Expression]]
  def genericQualifiedType : Parser[Type]
  def fLiteral : Parser[Expression]
  def packageName : Parser[String]
  def attributeBounds : Parser[Tuple2[Int,Int]]
  
  def fCall : Parser[Expression] 
  
  def kpositioned[T](p : Parser[T]) : Parser[T]

  protected val keywordCache : HashMap[String, Parser[String]] = HashMap.empty
  protected val delimCache : HashMap[String, Parser[String]] = HashMap.empty

  /** A parser which matches a numeric literal */
  def numericLit: Parser[String] =
    elem("number", _.isInstanceOf[NumericLit]) ^^ (_.chars)

  /** A parser which matches a string literal */
  def stringLit: Parser[String] =
    elem("string literal", _.isInstanceOf[StringLit]) ^^ (_.chars)
    
  /** A parser which matches a string literal */
  def docComment: Parser[String] =
    elem("documentation comment", _.isInstanceOf[MLDocumentation]) ^^ (_.chars)

  /** A parser which matches an identifier */
  def ident: Parser[String] =
    elem("identifier", _.isInstanceOf[Identifier]) ^^ (_.chars)


  def resetUnik = unikP.clear
  val unikP  = new scala.collection.mutable.HashMap[Parser[_],Boolean]()
  def kunik[T](p : Parser[T]) : Parser[T] = Parser { in =>
    p(in) match {
      case Success(x,rest) if(unikP.get(p).isEmpty) => {
          unikP.put(p,true)
        Success(x,rest)  
      }
      case Success(x,rest) if(!unikP.get(p).isEmpty) => {
        Error("Cannot repeat expression ", in)
      }      
      case ns: NoSuccess => {
          ns
      }
    }
  }
  


  //an implicit keyword function that gives a warning when a given word is not in the reserved/delimiters list
  implicit def keyword(chars : String): Parser[String] =
    if(lexical.reserved.contains(chars)) keywordCache.getOrElseUpdate(chars, accept(Keyword(chars)) ^^ (_.chars))
    else if(lexical.delimiters.contains(chars)) delimCache.getOrElseUpdate(chars, accept(Delimiter(chars)) ^^ (_.chars))
    else failure("You are trying to parse \""+chars+"\", but it is neither contained in the delimiters list, nor in the reserved keyword list of your lexical object")


}
