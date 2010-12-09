/* $Id$
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 * 		Didier Vojtisek <didier.vojtisek@inria.fr>
 */

package org.kermeta.language.lexer

import scala.collection.mutable.HashSet
import scala.util.parsing.combinator.Parsers
import scala.util.parsing.combinator.lexical.Lexical
import scala.util.parsing.combinator.lexical.Scanners
import scala.util.parsing.combinator.lexical.StdLexical
import scala.util.parsing.input.CharArrayReader.EofCh
import scala.util.parsing.input.Position

class KMLexical extends Lexical with KTokens {


  /** This token is produced by a scanner {@see Scanner} when scanning failed. */
  override def errorToken(msg: String): KToken = new KError(msg)


  //def kfailure(msg: String) = Parser{ in => KError(msg, in) }
  //def keof : Parser[KToken] = Parser{in => eof ^^ { case _ => Identifier("") } }

  def eof = elem("eof", ch => ch == EofCh)
  protected def kident(name: String) : KToken = if (reserved contains name) Keyword(name) else Identifier(name)
  override def whitespace: Parser[Any] = rep(whitespaceChar)


  val reserved : HashSet[String] = HashSet("throw","inherits","package","attribute","require","using","class","aspect","abstract","inv","operation","method","is","do","end","var","from","until","loop","if","then","else","init","true","false")
  val delimiters : HashSet[String] = HashSet("=",";","::","@","{","}","(",")",":",":=",".",",","|","==","!=","-","+","!","*","/","<","<=",">",">=","[","]","..","->","=>")

  

  def comment : Parser[KToken] = (
   positioned('/' ~ '*' ~ mlcomment ^^ { case _ ~ _ ~ mlcomment => mlcomment })
   |
   positioned('/' ~> '/' ~> rep( chrExcept(EofCh, '\n') ) ^^ { case content => Comment(content.mkString) })
   )


  protected def mlcomment: Parser[MLComment] = (
    '*' ~ '/'  ^^ { case _ => MLComment("")  }
    | 
    chrExcept(EofCh) ~ mlcomment ^^ { case c ~ rc => var ml = MLComment(c+rc.chars) ; ml  }
  )

  // legal identifier chars other than digits
  def identChar = letter | elem('_')

  /*

   def floatingToken: Parser[Token] =
   rep1(digit) ~ optFraction ^^
   { case intPart ~ frac => NumericLit(
   (intPart mkString "") :: frac :: Nil mkString "")}

   def chr(c:Char) = elem("", ch => ch==c )
   def sign = chr('+') | chr('-')
   def optSign = opt(sign) ^^ {
   case None => ""
   case Some(sign) => sign
   }
   def fraction = '.' ~ rep(digit) ^^ {
   case dot ~ ff => dot :: (ff mkString "") :: Nil mkString ""
   }
   def optFraction = opt(fraction) ^^ {
   case None => ""
   case Some(fraction) => fraction
   }
   */


// see `token' in `Scanners'
  def token: Parser[KToken] = (
    positioned( '~' ~ identChar ~ rep( identChar | digit ) ^^ { case _ ~ first ~ rest => Identifier(first :: rest mkString "") } )
     |positioned( identChar ~ rep( identChar | digit ) ^^ { case first ~ rest => kident(first :: rest mkString "") } )
     | positioned(comment ^^{ case c => c })
     | positioned(digit ~ rep( digit )                              ^^ { case first ~ rest => NumericLit(first :: rest mkString "") })
     | positioned('\'' ~ rep( chrExcept('\'', '\n', EofCh) ) ~ '\'' ^^ { case '\'' ~ chars ~ '\'' => StringLit(chars mkString "") })
     | positioned('\"' ~ rep( chrExcept('\"', '\n', EofCh) ) ~ '\"' ^^ { case '\"' ~ chars ~ '\"' => StringLit(chars mkString "") })
     | positioned(eof ^^ {case _ => KEOF() })
     | positioned('\'' ^^ {case c =>KIncomplet(c.toString,"unclosed string literal")}) // ~> failure("unclosed string literal") )
     | positioned('\"' ^^ {case c =>KIncomplet(c.toString,"unclosed string literal")}) //~> failure("unclosed string literal") )
     | positioned(delim)
     /* | floatingToken*/
     |  positioned( elem("illegal character", p => true ) ^^^KError("illegal character") ) //  failure("illegal character"))
    )

  private lazy val _delim: Parser[KToken] = {
    // construct parser for delimiters by |'ing together the parsers for the individual delimiters,
    // starting with the longest one -- otherwise a delimiter D will never be matched if there is
    // another delimiter that is a prefix of D
    def parseDelim(s: String): Parser[KToken] = positioned(accept(s.toList) ^^ { x => Delimiter(s) })

    val d = new Array[String](delimiters.size)
    delimiters.copyToArray(d, 0)
    scala.util.Sorting.quickSort(d)
    (d.toList map parseDelim).foldRight(failure("no matching delimiter"): Parser[KToken])((x, y) => y | x)
  }
  protected def delim: Parser[KToken] = _delim

 // private def lift[T](f: String => T)(xs: List[Char]): T = f(xs.mkString("", "", ""))
//  private def lift2[T](f: String => T)(p: ~[Char, List[Char]]): T = lift(f)(p._1 :: p._2)


  

}
