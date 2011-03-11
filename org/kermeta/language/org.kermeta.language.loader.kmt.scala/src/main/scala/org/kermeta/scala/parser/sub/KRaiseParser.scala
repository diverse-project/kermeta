/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser.sub

import org.kermeta.language.behavior.BehaviorFactory
import org.kermeta.language.behavior.Expression

trait KRaiseParser extends KAbstractParser {

  def fRaise : Parser[Expression] = "raise" ~ fStatement ^^ { case _ ~ exp =>
      var newo = BehaviorFactory.eINSTANCE.createRaise
      newo.setExpression(exp)
      newo
  }

}
