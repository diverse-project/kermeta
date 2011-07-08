/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.Type
import org.kermeta.language.structure.UnresolvedType
import scala.collection.JavaConversions._

trait KGenericTypeParser extends KAbstractParser with KLambdaParser {
  /* PUBLIC METHOD */
  def genericQualifiedType : Parser[Type] = lambdaType | genericQualifiedTypeObject


  

  def genericQualifiedTypeObject : Parser[UnresolvedType] = packageName ~ opt(genericParams) ^^{case qname ~ optParams =>
      var newType =StructureFactory.eINSTANCE.createUnresolvedType
      newType.setTypeIdentifier(qname)
      optParams match {
        case None =>
        case Some(gparams) => newType.getGenerics.addAll(gparams)
      }
      newType
  }

  def genericParams : Parser[List[Type]] = "<" ~ rep1sep(genericQualifiedType,",") ~ ">" ^^{case _ ~ params ~ _ => params }

}
