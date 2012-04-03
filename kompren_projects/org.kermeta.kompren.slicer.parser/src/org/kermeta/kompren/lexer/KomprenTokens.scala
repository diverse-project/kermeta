package org.kermeta.kompren.lexer

import scala.util.parsing.combinator.Parsers
import scala.util.parsing.combinator.token.Tokens
import scala.util.parsing.input.OffsetPosition
import scala.util.parsing.input.Positional

trait KomprenTokens extends Tokens with Parsers {

  abstract case class KomprenToken() extends Token with Positional {
    def getOffset : java.lang.Integer  = this.pos.asInstanceOf[OffsetPosition].offset
    def getLength : java.lang.Integer = this.toString.length
  }

  /** The class of comment tokens */
  case class Whitespace() extends KomprenToken() {
    override def chars = ' '.toString
    override def toString = ' '.toString
  }

  /** The class of comment tokens */
  case class Comment(chars: String) extends KomprenToken() {
    override def toString = "//"+chars
  }

  /** The class of comment tokens */
  case class MLComment(chars: String) extends KomprenToken() {
    override def toString = "/*"+chars+"*/"
  }
//  /** The class of comment tokens */
//  case class ERR_MLComment(chars: String) extends KomprenToken {
//    override def toString = "/* "+chars+" */"
//  }
  /** The class of delim tokens */
  case class Delimiter(chars: String) extends KomprenToken() {
    override def toString = chars
  }

  /** The class of keyword tokens */
  case class Keyword(chars: String) extends KomprenToken() {
    override def toString = chars
  }

  /** The class of numeric literal tokens */
  case class NumericLit(chars: String) extends KomprenToken() {
    override def toString = chars
  }

  /** The class of string literal tokens */
  case class StringLit(chars: String) extends KomprenToken() {
    override def toString = "\""+chars+"\""
  }
  
  /** The class of code literal tokens */
  case class MLCode(chars: String) extends KomprenToken() {
	  override def toString = "[["+chars+"]]"
  }
  
  /** The class of identifier tokens */
  case class Identifier(chars: String) extends KomprenToken() {
    override def toString = chars
  }
  
   /** The class of identifier tokens */
  case class PointedIdentifier(chars: String) extends KomprenToken() {
    override def toString = chars
  }
  
  case class KEOF() extends KomprenToken() {
    override def toString = ""
    override def chars = ' '.toString
  }

  case class KIncomplet(chars:String,msg:String) extends KomprenToken() {
    override def toString = chars
  }

  case class KError(chars: String) extends KomprenToken() {
    override def toString = chars
    override def getLength = 1
  }
}
