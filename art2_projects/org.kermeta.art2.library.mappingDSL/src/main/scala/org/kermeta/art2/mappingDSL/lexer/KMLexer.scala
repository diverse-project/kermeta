/* $Id: KMLexer.scala 11856 2010-07-23 12:41:04Z dvojtise $
 * Project    : .loader.scalaKMTorg.kermeta.language
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 12 dec. 2004
 * Authors : 
 *           Francois Fouquet 
 */

package org.kermeta.art2.mappingDSL.lexer

class KMLexer(content : String) extends KMLexical {

  var tokens = new this.Scanner(content)

  def nextToken : Token = {
    var tok = tokens.first
    tokens = tokens.rest
   tok
  }

  def atEnd = tokens.atEnd

}
