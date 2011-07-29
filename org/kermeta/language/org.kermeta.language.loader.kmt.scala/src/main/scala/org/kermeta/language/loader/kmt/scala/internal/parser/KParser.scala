/* $Id: KParser.scala 13545 2010-11-18 15:04:30Z francoisfouquet $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser

import org.kermeta.language.loader.kmt.scala.internal.parser.sub.KAbstractParser
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.structure.impl._
import org.kermeta.language.behavior.impl._
import org.kermeta.language.loader.kmt.scala.internal.parser.sub._
import scala.collection.JavaConversions._
import scala.util.parsing.input.OffsetPosition

/**
 * Parser of Kermeta for the full KMT textual syntax (including Expression, ModelingUnit and ClassDefinition
 * It is built by combining sub parsers
 */
class KParser extends KExpressionParser
                 with KModelingUnitParser
                 with KClassDefinitionParser
                 with KEnumerationParser {

  def parse(content : String) : Option[ModelingUnit] = {
    val tokens = new lexical.Scanner(content)

    val result = phrase(program)(tokens)
    result match {
      case Success(tree, _) => {Some(tree) }
      case e: NoSuccess => {
          //println(e)
          lastNoSucess = Some(e)
          None
        }
    }
  }

  def parseSynch(content : String) : Option[ModelingUnit] = {

    parse(content) match {
      case Some(e) => Some(e)
      case None => None
    }

  }

  var lastNoSucess : Option[NoSuccess] = None

  def getErrors : Option[ParseException] = {
    lastNoSucess match {
      case Some(err) => {
          val pos = err.next.pos
          var except = new ParseException
          except.line = pos.line
          except.colonne = pos.column
          except.errMsg = err.msg
          pos match {
            case opos : OffsetPosition=> except.offsetBegin_=(opos.offset);except.offsetEnd_=(opos.offset+opos.lineContents.size-opos.column)
            case _ => println("Warning Position Not Offset")
          }

          return Some(except)
        }
      case None => None
    }

  }


}
