/* $Id: KMLexer.scala 13478 2010-11-15 12:07:05Z francoisfouquet $
 * Project    : .loader.scalaKMTorg.kermeta.language
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 12 dec. 2004
 * Authors : 
 *           Francois Fouquet 
 */

package org.kermeta.language.loader.kmt.scala.internal.lexer

import java.io.File

class KMLexer(content : String) extends KMLexical {

  var tokens = new Scanner(content)

 // def getAllToken = tokens

  def nextToken : Token = {
    var tok = tokens.first
    //tokens.
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


object Main1 extends scala.Application
{
  println(scala.io.Source.fromFile(new File("/home/barais/workspaces/compiloV2/org.kermeta.language.loader.kmt.scala/sample.kmt")).getLines.size);
  var buffer = new StringBuffer
  scala.io.Source.fromFile(new File("/home/barais/workspaces/compiloV2/org.kermeta.language.loader.kmt.scala/sample.kmt")).getLines.foreach(eq=>
    buffer.append(eq + " ")
  )
  var lex =  new KMLexer(buffer.toString)
  var v =lex.nextToken
//  new KMLexer(buffer.toString).

//  println("toto")
}
