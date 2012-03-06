
/**
 * Created by IntelliJ IDEA.
 * User: jfalcou
 * Date: 06/03/12
 * Time: 10:51
 * To change this template use File | Settings | File Templates.
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure.{PrimitiveType, StructureFactory}

trait KAliasParser extends KAbstractParser {

  def aliasStmt : Parser[PrimitiveType] = "alias" ~ ident ~ ":" ~ genericQualifiedType ^^ { case _ ~ name ~ _ ~ typeName =>
      var newo =StructureFactory.eINSTANCE.createPrimitiveType()
      newo.setName(name)
      newo.setInstanceType(typeName)
      newo.getContainedType.add(typeName)
      newo
  }
}