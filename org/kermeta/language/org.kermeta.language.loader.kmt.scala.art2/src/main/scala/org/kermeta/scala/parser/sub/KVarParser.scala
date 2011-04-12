/* $Id$
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.scala.parser.sub

import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.structure.impl._
import org.kermeta.language.behavior.impl._
import scala.collection.JavaConversions._

/**
 * Sub parser dedicated to parse VariableDecl in KMT textual syntax  
 */
trait KVarParser extends KAbstractParser {

  def fVariableDecl : Parser[Expression] = "var" ~> ident ~ ":" ~ packageName ~ (("init" ~ fStatement)?) ^^ { case id1 ~ _ ~ name ~ initStat  =>
      var newo = BehaviorFactory.eINSTANCE.createVariableDecl
      newo.setIdentifier(id1)
      //TYPE GESTURE
      var newtyperef = BehaviorFactory.eINSTANCE.createTypeReference
      var newtype = StructureFactory.eINSTANCE.createUnresolvedType
      newo.getContainedType.add(newtype)
      newtyperef.setName(name)
      newtype.setTypeIdentifier(name)
      newtyperef.setType(newtype)

      newo.setType(newtyperef)
      initStat match {
        case None =>
        case Some(elseExp)=> elseExp match { case "init"~statm => newo.setInitialization(statm) }
      }
      newo
  }

}
