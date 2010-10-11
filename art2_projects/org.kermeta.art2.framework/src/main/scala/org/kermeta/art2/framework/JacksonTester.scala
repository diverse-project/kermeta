/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import JacksonSerializer._
import scala.runtime.BoxedUnit

object JacksonTester {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    var t = toto
    var json = t.toJSON

    println(json)

    var result = json.toString.fromJSON(classOf[BoxedUnit])

    println(result)

  }


  def toto : Unit = {
    println("echo")
  }

}
