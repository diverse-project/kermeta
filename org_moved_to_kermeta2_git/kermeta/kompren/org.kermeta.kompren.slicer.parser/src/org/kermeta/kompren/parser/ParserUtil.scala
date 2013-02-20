package org.kermeta.kompren.parser

import scala.io.Source

/**
 * Singleton util methods used by the parser
 */
object ParserUtil {

  def loadFile(uri: String): String = {
    val res = new StringBuilder
    Source.fromFile(uri).getLines.foreach {
      l => res.append(l); res.append('\n')
    }
    res.toString
  }
}
