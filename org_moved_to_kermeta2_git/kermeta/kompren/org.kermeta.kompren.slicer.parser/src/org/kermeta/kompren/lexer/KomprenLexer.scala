package org.kermeta.kompren.lexer


class KomprenLexer(content : String) extends KomprenLexical {

  var tokens = new Scanner(content)
  
  def nextToken : KomprenToken = {
    val tok = tokens.first
    tokens = tokens.rest
   tok.asInstanceOf[KomprenToken]
  }

  def atEnd = tokens.atEnd
}
