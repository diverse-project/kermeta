package org.kermeta.kompren.parser.sub

import scala.collection.mutable.HashMap
import scala.util.parsing.combinator.syntactical.TokenParsers
import org.kermeta.kompren.lexer.KomprenLexical

/**
 * Common part of all Sub parsers
 */
trait KomprenAbstractParser extends TokenParsers {
  type Tokens = org.kermeta.kompren.lexer.KomprenTokens
  val lexical = new KomprenLexical {
    override def whitespace: Parser[Any] = rep(whitespaceChar | comment)
  }
  import lexical._

  protected val keywordCache : HashMap[String, Parser[String]] = HashMap.empty
  protected val delimCache : HashMap[String, Parser[String]] = HashMap.empty

  /** A parser which matches a string literal */
  def stringLit: Parser[String] =
    elem("string literal", _.isInstanceOf[StringLit]) ^^ (_.chars)

  /** A parser which matches an identifier */
  def ident: Parser[String] =
    elem("identifier", _.isInstanceOf[Identifier]) ^^ (_.chars)
    
  def pointedIdent: Parser[String] =
    elem("pointedIdentifier", _.isInstanceOf[PointedIdentifier]) ^^ (_.chars)
    
  def blockCode: Parser[String] =
    elem("blockCode", _.isInstanceOf[MLCode]) ^^ (_.chars)
    
  //Error handling
  def orFailure[A](a:Parser[A],msg:String) : Parser[A] = ( a | failure(msg) )


  //an implicit keyword function that gives a warning when a given word is not in the reserved/delimiters list
  implicit def keyword(chars : String): Parser[String] =
    if(lexical.reserved.contains(chars)) keywordCache.getOrElseUpdate(chars, accept(Keyword(chars)) ^^ (_.chars))
    else if(lexical.delimiters.contains(chars)) delimCache.getOrElseUpdate(chars, accept(Delimiter(chars)) ^^ (_.chars))
    else failure("You are trying to parse \""+chars+"\", but it is neither contained in the delimiters list, nor in the reserved keyword list of your lexical object")
}

