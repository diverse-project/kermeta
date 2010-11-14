/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.mappingDSL.parser.impl

import org.kermeta.art2.mappingDSL.ast.Mapping
import org.kermeta.art2.mappingDSL.ast.MappingInstruction
import org.kermeta.art2.mappingDSL.parser.api.MappingInstructionParser
import org.kermeta.art2.mappingDSL.parser.AbstractParser.Parser
import org.kermeta.art2.mappingDSL.parser.AbstractParser._
import scala.reflect.BeanProperty
import org.kermeta.art2.mappingDSL.parser.api.{MappingParser => MappingParserAPI}

class MappingParser extends MappingParserAPI {

  @BeanProperty
  var sub : MappingInstructionParser = new MappingInstructionParser {
    def parseInstruction : Parser[MappingInstruction] = failure("Mapping Parser Configuration Incorrect")
  }

  def parseMapping : Parser[Mapping] = rep(parseInstr) ^^ { case lIstr => Mapping(lIstr)  }

  def parseInstr = "map" ~ sub.parseInstruction ~ ";" ^^{ case _ ~ istr ~ _ => istr }


}
