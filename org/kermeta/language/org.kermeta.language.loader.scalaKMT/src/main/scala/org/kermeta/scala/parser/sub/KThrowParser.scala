/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser.sub

import org.kermeta.language.behavior.BehaviorFactory
import org.kermeta.language.behavior.Expression

trait KThrowParser extends KAbstractParser {

  def fThrow : Parser[Expression] = "throw" ~ fStatement ^^ { case _ ~ exp =>
      var newo = BehaviorFactory.eINSTANCE.createRaise
      newo.setExpression(exp)
      newo
  }

}
