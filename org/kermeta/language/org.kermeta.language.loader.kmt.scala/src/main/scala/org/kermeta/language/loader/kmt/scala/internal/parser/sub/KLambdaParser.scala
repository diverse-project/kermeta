/* $Id: KLambdaParser.scala 13969 2010-12-23 12:16:40Z dvojtise $
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
 * Sub parser dedicated to parse Lambda expression in KMT textual syntax
 */
trait KLambdaParser extends KAbstractParser {

  def fLambda : Parser[Expression] = "{" ~ repsep(ident, ",") ~ "|" ~ fExpressionLst ~ "}" ^^ {
    case _ ~ params ~ _ ~ exps ~ _ => {
	 	  
        var newLambdaExp = BehaviorFactory.eINSTANCE.createLambdaExpression
	 	 
        params.foreach{pname=>
          var newLambdaP = BehaviorFactory.eINSTANCE.createLambdaParameter
          newLambdaP.setName(pname)
          //var newType = StructureFactory.eINSTANCE.createUnresolvedType
          //var newTypeRef = BehaviorFactory.eINSTANCE.createTypeReference
          //newTypeRef.setKType(newType)
          //newLambdaP.setType(newTypeRef)
          //newLambdaExp.getContainedType.add(newType) 

          newLambdaExp.getParameters.add(newLambdaP)
        }
	var newBlock = BehaviorFactory.eINSTANCE.createBlock
        newBlock.getStatement.addAll(exps)
        newLambdaExp.setBody(newBlock)
        newLambdaExp
      }
	  
  }

  def lambdaType : Parser[Type] = "<" ~ ( lambdaTypeParam | lambdaSingleTypeParam )  ~ "->" ~ genericQualifiedType ~ ">" ^^ {case _ ~ params ~ _ ~ res ~ _ =>
      var newType = StructureFactory.eINSTANCE.createFunctionType
      newType.setKType(res)
      newType.getContainedType.add(res)
      var left = StructureFactory.eINSTANCE.createProductType
      newType.getContainedType.add(left)
      left.getType.addAll(params) 
      newType.setLeft(left)
      newType.setRight(res)
      
      left.getContainedType.addAll(params)

      newType
  }

  def lambdaSingleTypeParam : Parser[List[UnresolvedType]] = packageName ^^{ case name =>
      var newType = StructureFactory.eINSTANCE.createUnresolvedType
      newType.setTypeIdentifier(name)
      List(newType)
  }
  def lambdaTypeParam : Parser[List[Type]] = "[" ~ rep1sep(genericQualifiedType,",") ~ "]" ^^ { case _ ~ unresolvedType ~ _ =>
    unresolvedType
  }

  
  

}
