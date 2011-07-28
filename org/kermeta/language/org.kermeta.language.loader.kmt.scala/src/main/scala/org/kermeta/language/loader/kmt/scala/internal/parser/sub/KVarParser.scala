/* $Id: KVarParser.scala 13355 2010-11-08 08:22:35Z francoisfouquet $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.structure.impl._
import org.kermeta.language.behavior.impl._
import scala.collection.JavaConversions._

/**
 * Sub parser dedicated to parse VariableDecl in KMT textual syntax  
 */
trait KVarParser extends KAbstractParser with KGenericTypeParser {

  def fVariableDecl : Parser[Expression] = "var" ~> ident ~ ":" ~ genericQualifiedTypeObject ~ (( ("init"|":="/*|"?="*/) ~ fStatement)?) ^^ { case id1 ~ _ ~ unresType ~ initStat  =>
      var newo = BehaviorFactory.eINSTANCE.createVariableDecl
      newo.setIdentifier(id1)
      //TYPE GESTURE
      var newtyperef = BehaviorFactory.eINSTANCE.createTypeReference
      newo.getContainedType.add(unresType)
      newtyperef.setName(unresType.getTypeIdentifier())
      newtyperef.setType(unresType)

      newo.setType(newtyperef)
      initStat match {
        case None =>
        case Some(elseExp)=> elseExp match { 
            case "init"~statm => newo.setInitialization(statm)
            //case "?="~statm => {newo.setInitialization(statm);newo.setIsCast(true) }
            case ":="~statm => newo.setInitialization(statm)  //TODO REFACTORING
          }
      }
      newo
  }

}
