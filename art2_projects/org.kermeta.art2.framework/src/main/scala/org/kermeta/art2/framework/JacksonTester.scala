/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import JacksonSerializer._
import scala.reflect.BeanProperty
import scala.runtime.BoxedUnit
import org.codehaus.jackson.annotate._

object JacksonTester {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    var t = new PJO
    var json = t.toJSON

    println(json)

    var result = json.toString.fromJSON(classOf[PJO])

    println(result)

  }


  def toto : Unit = {
    println("echo")
  }

  class PJO{
    @BeanProperty
    var dedeString : String = "def"

    @BeanProperty
    var msg : Msg = new MyMsg

  }


  class MyMsg extends Msg {
    @BeanProperty
    var dede = "def"
  }

  @JsonTypeInfo(use=org.codehaus.jackson.annotate.JsonTypeInfo.Id.CLASS, include=org.codehaus.jackson.annotate.JsonTypeInfo.As.PROPERTY, property="class")
  class Msg {
    @BeanProperty
    var mydede = "defdef"
  }

}
