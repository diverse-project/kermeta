/* $Id$
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.scala.parser

import scala.io.Source

/**
 * Singleton util methods used by the parser
 */
object ParserUtil {

  def loadFile(uri : String) : String = {

    var res = new StringBuilder
    Source.fromFile(uri).getLines.foreach{l=> res.append(l);res.append("\n")}
    res.toString

  }

}
