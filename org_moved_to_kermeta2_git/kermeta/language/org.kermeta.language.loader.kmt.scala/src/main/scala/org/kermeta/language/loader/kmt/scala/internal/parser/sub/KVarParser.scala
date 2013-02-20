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

import org.kermeta.language.behavior.BehaviorFactory
import org.kermeta.language.behavior.Expression
import org.kermeta.language.loader.kmt.scala.internal.printer.PrettyPrinter

/**
 * Sub parser dedicated to parse VariableDecl in KMT textual syntax  
 */
trait KVarParser extends KAbstractParser with KMultiplicityParser {

  def fVariableDecl : Parser[Expression] = "var" ~> ident ~ ":" ~ multiplicityType ~ (( ("init"|":="/*|"?="*/) ~ fStatement)?) ^^ { case id1 ~ _ ~ mType ~ initStat  =>
      var newo = BehaviorFactory.eINSTANCE.createVariableDecl
      newo.setIdentifier(id1)
      //TYPE GESTURE
      var newtyperef = BehaviorFactory.eINSTANCE.createTypeReference
      mType.copyToKElem(newtyperef)
      var res = new StringBuffer
      PrettyPrinter.print(newtyperef, res)
      newtyperef.setName(res.toString)


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
