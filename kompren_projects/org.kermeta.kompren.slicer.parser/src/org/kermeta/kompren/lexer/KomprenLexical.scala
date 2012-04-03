package org.kermeta.kompren.lexer

import scala.collection.mutable.HashSet
import scala.util.parsing.combinator.Parsers
import scala.util.parsing.combinator.lexical.Lexical
import scala.util.parsing.combinator.lexical.Scanners
import scala.util.parsing.combinator.lexical.StdLexical
import scala.util.parsing.input.CharArrayReader.EofCh
import scala.util.parsing.input.Position
import scala.collection.JavaConversions._

class KomprenLexical extends Lexical with KomprenTokens {
  /** This token is produced by a scanner {@see Scanner} when scanning failed. */
  override def errorToken(msg: String): KomprenToken = new KError(msg)

  def eof = elem("eof", ch => ch == EofCh)
  protected def kident(name: String) : KomprenToken = if (reserved contains name) Keyword(name) else Identifier(name)
  override def whitespace: Parser[Any] = rep(whitespaceChar)
  val reserved : HashSet[String] = HashSet("slicer","strict","active","domain","input","slicedClass","slicedProperty","radius","constraint",
      "onStart","onEnd","helper","option","opposite")
  val delimiters : HashSet[String] = HashSet(":","{","}",",","(",")","]]","[[")

  
  def getReserved() : java.util.List[String] = reserved.toList
  

  def comment : Parser[KomprenToken] = (
   positioned('/' ~ '*' ~ mlcomment ^^ { case _ ~ _ ~ mlcomment => mlcomment })
   |
   positioned('/' ~> '/' ~> rep( chrExcept(EofCh, '\n') ) ^^ { case content => Comment(content.mkString) })
   )
   
   def identifier : Parser[KomprenToken] = (
       positioned(identChar ~ rep( identChar | digit ) ^^ { case first ~ rest => Identifier((first::rest).mkString) } )
   )
   
   def pointedIdent : Parser[KomprenToken] = (
      positioned(identifier ~ '.' ~ rep1sep(identifier, '.') ^^ { case first ~ _ ~ rest => PointedIdentifier((first::rest).mkString(".")) })
   )
   
   def blockCode : Parser[KomprenToken] = (
       positioned('[' ~ '[' ~ mlCode ^^ { case _ ~ _ ~ fooCode => fooCode })
   )
   
   protected def mlCode : Parser[MLCode] = (
	   ']' ~ ']' ^^ { case _ => MLCode("") }
	   |
	   chrExcept(EofCh) ~ mlCode ^^ { case c ~ rc => var ml = MLCode(c+rc.chars) ; ml  }
   )
   
  protected def mlcomment: Parser[MLComment] = (
    '*' ~ '/'  ^^ { case _ => MLComment("")  }
    | 
    chrExcept(EofCh) ~ mlcomment ^^ { case c ~ rc => var ml = MLComment(c+rc.chars) ; ml  }
  )

  // legal identifier chars other than digits
  def identChar = letter | elem('_')
  

// see `token' in `Scanners'
  def token: Parser[KomprenToken] = (
       positioned(pointedIdent)
     | positioned(identifier ^^{ case id => kident(id.toString) })
     | positioned(comment ^^{ case c => c })
     | positioned(blockCode)
     | positioned('\'' ~ rep( chrExcept('\'', '\n', EofCh) ) ~ '\'' ^^ { case '\'' ~ chars ~ '\'' => StringLit(chars.mkString) })
     | positioned('\"' ~ rep( chrExcept('\"', '\n', EofCh) ) ~ '\"' ^^ { case '\"' ~ chars ~ '\"' => StringLit(chars.mkString) })
     | positioned(eof ^^ {case _ => KEOF() })
     | positioned('\'' ^^ {case c =>KIncomplet(c.toString,"unclosed string literal")}) // ~> failure("unclosed string literal") )
     | positioned('\"' ^^ {case c =>KIncomplet(c.toString,"unclosed string literal")}) //~> failure("unclosed string literal") )
     | positioned(delim)
     /* | floatingToken*/
     |  positioned( elem("illegal character", p => true ) ^^^KError("illegal character") ) //  failure("illegal character"))
    )

  private lazy val _delim: Parser[KomprenToken] = {
    // construct parser for delimiters by |'ing together the parsers for the individual delimiters,
    // starting with the longest one -- otherwise a delimiter D will never be matched if there is
    // another delimiter that is a prefix of D
    def parseDelim(s: String): Parser[KomprenToken] = positioned(accept(s.toList) ^^ { x => Delimiter(s) })

    val d = new Array[String](delimiters.size)
    delimiters.copyToArray(d, 0)
    scala.util.Sorting.quickSort(d)
    (d.toList map parseDelim).foldRight(failure("no matching delimiter"): Parser[KomprenToken])((x, y) => y | x)
  }
  protected def delim: Parser[KomprenToken] = _delim
}
