/* $Id: KMLexer.scala 13478 2010-11-15 12:07:05Z francoisfouquet $
 * Project    : .loader.scalaKMTorg.kermeta.language
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 12 dec. 2004
 * Authors : 
 *           Francois Fouquet 
 */

package org.kermeta.language.lexer

class KMLexer(content : String) extends KMLexical {

  var tokens = new Scanner(content)

 // def getAllToken = tokens

  def nextToken : Token = {
    var tok = tokens.first
    tokens = tokens.rest

    /*
    val retoken = tok match {
      case v : Keyword => KToken(v.chars,TOKEN_CATEG.KEYWORD)
      case v : Identifier => KToken(v.chars,TOKEN_CATEG.IDENTIFIER)
      case v : StringLit => KToken(v.chars,TOKEN_CATEG.STRINGLIT)
      case v @ _ => println("uncatch_element="+v.toString);null
    }
    retoken*/
   tok
  }

  def atEnd = tokens.atEnd

}
