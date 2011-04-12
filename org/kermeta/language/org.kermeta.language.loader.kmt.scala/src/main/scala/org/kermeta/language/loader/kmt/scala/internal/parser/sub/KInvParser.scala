/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure.Constraint
import org.kermeta.language.structure.StructureFactory

trait KInvParser extends KAbstractParser {

  def invariant : Parser[Constraint] = ("inv" ~ ident ~ "is" ~ fStatement ) ^^ { case _ ~ ident ~ _ ~ expr =>
      var newo =StructureFactory.eINSTANCE.createConstraint
      newo.setName(ident)
      newo.setBody(expr)
      newo
  }

}
