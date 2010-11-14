/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.mappingDSL.parser

import org.kermeta.art2.mappingDSL.parser.impl._
import org.kermeta.art2.mappingDSL.parser.impl.MappingParser
import scala.io.Source

object Main {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    println("Hello, world! PArser")

    val input = Source.fromFile(new java.io.File("test.art2map")).getLines().reduceLeft[String](_ + '\n' + _)


    var c = new MappingParser

    var i = new MappingInstuctionFullParser
    var i2 = new MappingInstructionLightParser
    c.setSub(i)
    //c.setSub(i2)

    AbstractParser.setLanguage(c)
    var res = AbstractParser.parse(input)

    println("result"+res)


  }

}
