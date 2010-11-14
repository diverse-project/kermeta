/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.mappingDSL.parser

import org.kermeta.art2.mappingDSL.ast.Mapping
import org.kermeta.art2.mappingDSL.lexer.KMLexical
import org.kermeta.art2.mappingDSL.parser.api.MappingParser
import scala.collection.mutable.HashMap
import scala.reflect.BeanProperty
import scala.util.parsing.combinator.syntactical.TokenParsers

object AbstractParser extends TokenParsers {

  type Tokens = org.kermeta.art2.mappingDSL.lexer.KTokens
  val lexical = new KMLexical {
    override def whitespace: Parser[Any] = rep(whitespaceChar | comment)
  }
  import lexical._

  /** A parser which matches a string literal */
  def stringLit: Parser[String] =
    elem("string literal", _.isInstanceOf[StringLit]) ^^ (_.chars)

  /** A parser which matches an identifier */
  def ident: Parser[String] =
    elem("identifier", _.isInstanceOf[Identifier]) ^^ (_.chars)

  protected val keywordCache : HashMap[String, Parser[String]] = HashMap.empty
  protected val delimCache : HashMap[String, Parser[String]] = HashMap.empty


  //an implicit keyword function that gives a warning when a given word is not in the reserved/delimiters list
  implicit def keyword(chars : String): Parser[String] =
    if(lexical.reserved.contains(chars)) keywordCache.getOrElseUpdate(chars, accept(Keyword(chars)) ^^ (_.chars))
  else if(lexical.delimiters.contains(chars)) delimCache.getOrElseUpdate(chars, accept(Delimiter(chars)) ^^ (_.chars))
  else failure("You are trying to parse \""+chars+"\", but it is neither contained in the delimiters list, nor in the reserved keyword list of your lexical object")

  @BeanProperty
  var language : MappingParser = new MappingParser(){
    def parseMapping : Parser[Mapping] = failure("Configuration error")
  }

  def parse(content : String) : Option[Mapping] = {
    val tokens = new lexical.Scanner(content)
    val result = phrase(language.parseMapping)(tokens)
    result match {
      case Success(tree, _) => {Some(tree) }
      case e: NoSuccess => {println(e);None}
    }
  }


}
