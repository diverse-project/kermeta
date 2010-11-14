/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.mappingDSL.parser.impl

import org.kermeta.art2.mappingDSL.ast.MappingInstruction
import org.kermeta.art2.mappingDSL.parser.AbstractParser.Parser
import org.kermeta.art2.mappingDSL.parser.AbstractParser._
import org.kermeta.art2.mappingDSL.parser.api.{MappingInstructionParser => MappingInstructionParserAPI}

class MappingInstructionLightParser extends MappingInstructionParserAPI {

  def parseInstruction : Parser[MappingInstruction] = ident ~ "=>" ~ ident ^^ { case in ~ _ ~ out => MappingInstruction(in,out) }

}
