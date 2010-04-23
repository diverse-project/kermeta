/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser

class Interpreter(tree: List[_]) {
  def run() {
    walkTree(tree)
  }
  private def walkTree(tree: List[_]) {
    tree match {
      case e :: rest => {println(e.toString);walkTree(rest)  }
      case Nil =>
    }
  }

}
