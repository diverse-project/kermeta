/* $Id: KTokens.scala 13252 2010-10-29 09:32:24Z francoisfouquet $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.lexer

import scala.util.parsing.input._
import org.kermeta.language.loader.kmt.scala.api.IKToken
import scala.util.parsing.combinator.Parsers
import scala.util.parsing.combinator.token.Tokens
import scala.util.parsing.input.OffsetPosition
import scala.util.parsing.input.Positional
import scala.collection.JavaConversions._

trait KTokens extends Tokens with Parsers {

  abstract case class KToken extends Token with Positional with IKToken {
    def getOffset : java.lang.Integer  = this.pos.asInstanceOf[OffsetPosition].offset
    def getLength : java.lang.Integer = this.toString.length
  }

  /** The class of comment tokens */
  case class WHITESPACE extends KToken {
    override def chars = ' '.toString
    override def toString = ' '.toString
  }

  /** The class of comment tokens */
  case class Comment(chars: String) extends KToken {
    override def toString = "//"+chars
  }

  /** The class of comment tokens */
  case class MLComment(chars: String) extends KToken {
    override def toString = "/*"+chars+"*/"
  }
  /** The class of comment tokens */
  case class ERR_MLComment(chars: String) extends KToken {
    override def toString = "/* "+chars+" */"
  }
  /** The class of delim tokens */
  case class Delimiter(chars: String) extends KToken {
    override def toString = chars
  }

  /** The class of keyword tokens */
  case class Keyword(chars: String) extends KToken {
    override def toString = chars
  }

  /** The class of numeric literal tokens */
  case class NumericLit(chars: String) extends KToken {
    override def toString = chars
  }

  /** The class of string literal tokens */
  case class StringLit(chars: String) extends KToken {
    override def toString = "\""+chars+"\""
  }

  /** The class of identifier tokens */
  case class Identifier(chars: String) extends KToken {
    override def toString = chars
  }

  case class KEOF extends KToken {
    override def toString = ""
    override def chars = ' '.toString
  }

  case class KIncomplet(chars:String,msg:String) extends KToken {
    override def toString = chars
  }

  case class KError(chars: String) extends KToken{
    override def toString = chars
    override def getLength = 1
  }


}
