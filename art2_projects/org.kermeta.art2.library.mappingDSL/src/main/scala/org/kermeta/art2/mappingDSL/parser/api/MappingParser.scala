/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.mappingDSL.parser.api

import org.kermeta.art2.mappingDSL.ast.Mapping
import org.kermeta.art2.mappingDSL.parser._
import org.kermeta.art2.mappingDSL.parser.AbstractParser.Parser

trait MappingParser {

  def parseMapping : Parser[Mapping]

}
