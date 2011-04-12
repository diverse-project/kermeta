/* $Id: ParseException.scala 13544 2010-11-18 15:04:13Z francoisfouquet $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser

/**
 * Exception throwed by the Kermeta Parser
 */
class ParseException extends Throwable {

  var line : Int = _
  var colonne : Int = _
  var errMsg : String = _
  var offsetBegin : Int = _
  var offsetEnd : Int = _
}
