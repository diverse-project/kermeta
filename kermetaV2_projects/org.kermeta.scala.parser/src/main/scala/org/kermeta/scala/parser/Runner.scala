/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser

import scala.io.Source

object Runner{

  def main(args: Array[String]): Unit = {
    val input = Source.fromFile(new java.io.File("sample.kmt")).getLines("\n").reduceLeft[String](_ + '\n' + _)
    var result = Parser.parse(input)
    result match {
      case Some(_ @ res) => LoadSaveKM.saveKmModelingUnit("parsed.km", res) //new Interpreter(res).run
      case None =>
    }
  }
}
