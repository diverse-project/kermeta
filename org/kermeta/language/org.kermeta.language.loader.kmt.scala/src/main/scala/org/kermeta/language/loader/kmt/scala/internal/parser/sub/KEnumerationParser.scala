/* $Id: KEnumerationParser.scala 14357 2011-07-29 14:17:16Z $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2011
 * Authors :
 * 		Arnaud Blouin
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure.Enumeration
import org.kermeta.language.structure.StructureFactory


trait KEnumerationParser extends KAbstractParser {
  def enumDecl : Parser[Enumeration] = ("enumeration"|"enum") ~ ident ~ "{" ~ rep(enumLiteral) ~ "}" ^^ {
      case  _ ~ name ~ _ ~ listLiterals ~ _ =>

    var newEnum : Enumeration = StructureFactory.eINSTANCE.createEnumeration
    newEnum.setName(name)

    listLiterals.foreach{ name =>
      var newLiteral = StructureFactory.eINSTANCE.createEnumerationLiteral()
      newLiteral.setName(name)
      newEnum.getOwnedLiteral.add(newLiteral)
    }

    newEnum
  }


  def enumLiteral = ident <~ ";"
}
