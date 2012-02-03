/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.Tag
import java.util.regex.Pattern

trait KTagParser extends KAbstractParser {

  //NO MINIMAL CONTRACT

  def annotation : Parser[Tag] = (annotationTag | documentation)

  def annotationTag : Parser[Tag] = "@" ~> ident ~ stringLit ^^ { case id1 ~ st1 =>
      var newo =StructureFactory.eINSTANCE.createTag
      newo.setName(id1.toString)
      newo.setValue(st1.toString)
      newo
  }

  def documentation : Parser[Tag] = docComment  ^^ { case  st1  =>
      println("Found documentation tag !!")
      var newt = StructureFactory.eINSTANCE.createTag
      newt.setName("documentation")
      // remove * that starts the line
      val s = st1.toString.replaceAll("\\n\\p{Blank}*\\*", "\n")
     // also remove leading and trailing /** */
      newt.setValue(s.substring(3,s.toString().length()-2))
      newt
  }
  
  

}
