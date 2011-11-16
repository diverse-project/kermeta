/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.Tag

trait KTagParser extends KAbstractParser {

  //NO MINIMAL CONTRACT

  def annotation : Parser[Tag] = (annotationTag | documentation)

  def annotationTag : Parser[Tag] = "@" ~> ident ~ stringLit ^^ { case id1 ~ st1 =>
      var newo =StructureFactory.eINSTANCE.createTag
      newo.setName(id1.toString)
      newo.setValue(st1.toString)
      newo
  }

  def documentation : Parser[Tag] = "/**" ~ stringLit ~ "*/" ^^ { case _ ~ st1 ~ _ =>
      println("Found documentation tag !!")
      var newt = StructureFactory.eINSTANCE.createTag
      newt.setName("documentation")
      newt.setValue(st1.toString)
      newt
  }

}
