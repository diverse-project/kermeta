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
import org.kermeta.scala.parser.KmBuildHelper
import scala.collection.JavaConversions._

/**
 * Sub parser dedicated to parse Conditional expression in KMT textual syntax
 */
trait KLambdaParser extends KAbstractParser {

  def fLambda : Parser[Expression] = "{" ~ repsep(ident, ",") ~ "|" ~ fExpression ~ "}" ^^ { 
    case ob1 ~ params ~ pipe ~ exp ~ cb1 => {
	 	  
        var newLambdaExp = BehaviorFactory.eINSTANCE.createLambdaExpression
	 	  
        params.foreach{pname=>
          var newLambdaP = BehaviorFactory.eINSTANCE.createLambdaParameter
          newLambdaP.setName(pname)
          newLambdaExp.getParameters.add(newLambdaP)
        }
	 	  
        newLambdaExp.setBody(exp)
        newLambdaExp
      }
	  
  }

  def lambdaType : Parser[Type] = "<" ~ ( lambdaTypeParam | lambdaSingleTypeParam )  ~ "->" ~ packageName ~ ">" ^^ {case _ ~ params ~ _ ~ res ~ _ =>
      var newType = StructureFactory.eINSTANCE.createProductType
      var unresolveType = KmBuildHelper.getOrCreateUnresolvedType(newType,res) //StructureFactory.eINSTANCE.createUnresolvedType
      //unresolveType.setTypeIdentifier(res)
      newType.setKType(unresolveType)
      //newType.getContainedType.add(unresolveType)
      newType.getType.addAll(params)
      newType.getContainedType.addAll(params)

      newType
  }

  def lambdaSingleTypeParam : Parser[List[UnresolvedType]] = packageName ^^{ case name =>
      var newType = StructureFactory.eINSTANCE.createUnresolvedType
      newType.setTypeIdentifier(name)
      List(newType)
  }
  def lambdaTypeParam : Parser[List[UnresolvedType]] = "[" ~ rep1sep(packageName,",") ~ "]" ^^ { case _ ~ unresolvedType ~ _ =>
      for(name <- unresolvedType) yield {
        var newType = StructureFactory.eINSTANCE.createUnresolvedType
        newType.setTypeIdentifier(name)
        newType
      }
  }

  
  

}
