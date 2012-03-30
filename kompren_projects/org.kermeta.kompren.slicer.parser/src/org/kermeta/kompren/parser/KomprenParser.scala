package org.kermeta.kompren.parser

import org2.kermeta.kompren.slicer.Slicer
import org.kermeta.kompren.parser.sub.KomprenAbstractParser
import org.kermeta.kompren.parser.sub.SlicerParser

class KomprenParser extends KomprenAbstractParser with SlicerParser {

  def parseSlicer(content: String): Option[Slicer] = {
    val tokens = new lexical.Scanner(content + "\n")
    val result = phrase(parseSlicer)(tokens)
    
    result match {
      case Success(tree, _) => Some(tree)
      case e: NoSuccess => None
    }
  }
}
