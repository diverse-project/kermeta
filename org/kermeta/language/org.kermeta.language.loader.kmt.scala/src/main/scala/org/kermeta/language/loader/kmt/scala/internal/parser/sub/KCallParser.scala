/* $Id: KCallParser.scala 14020 2011-01-06 08:06:01Z francoisfouquet $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors :
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import scala.collection.JavaConversions._

import org.kermeta.language.behavior.BehaviorFactory
import org.kermeta.language.behavior.Expression
import org.kermeta.language.structure.UnresolvedType

/**
 * Sub parser dedicated to parse the various way to call something in KMt textual syntax
 *
 */
trait KCallParser extends KAbstractParser with KGenericTypeParser with KLambdaParser {


  def fCall: Parser[Expression] = nCall /*| firstCallLiteral*/ | firstCall | superCall

  //private def fSuperLiteral : Parser[Expression] = ( "super" ) ^^^ { BehaviorFactory.eINSTANCE.createCallSuperOperation() }


  def nCall = "." ~> ident ~ opt(opGenericParams) ~ (callFeatureParams ?) ^^ {
    case id ~ genparams ~ params =>
      val newo = BehaviorFactory.eINSTANCE.createUnresolvedCall

      newo.setName(id)
      params match {
        case Some(_@par) => for (p <- par) newo.getParameters().add(p)
        case None =>
      }
      genparams match {
        case None =>
        case Some(params) => {
            params.foreach{ param =>
              newo.getGenerics().add(param)
              newo.getContainedType().add(param)
            }
        }
      }
      newo.setIsCalledWithParenthesis( params match {
                case Some(par) =>  true
                case None =>      false
            })
      newo.setTarget(NESTED_NEEDED())
      newo
  }

  /** Parses a super call. */
  def superCall : Parser[Expression] = "super" ~ opt(superType) ~ opt(opGenericParams) ~ (callFeatureParams ?) ^^ { case _ ~ supert ~ genparams ~ params =>
    val newo = BehaviorFactory.eINSTANCE.createCallSuperOperation

    supert match {
      case Some(value) => newo.setSuperType(value)
      case None =>
    }

    params match {
      case Some(_@par) => for (p <- par) newo.getParameters.add(p)
      case None =>
    }

    genparams match {
      case None =>
      case Some(gparams) => {
        newo.getContainedType.addAll(gparams)
        newo.getStaticTypeVariableBindings.addAll(gparams)
      }
    }
    newo
  }

  def firstCall: Parser[Expression] = (genericQualifiedTypeObject /*| "super"*/) ~ (callFeatureParams ?) ^^ {
    case unresType ~ params =>

      val newo = unresType match {
        //case "super" => BehaviorFactory.eINSTANCE.createCallSuperOperation()
        case typeRef: UnresolvedType => {
          val newoo = BehaviorFactory.eINSTANCE.createUnresolvedCall
          newoo.setName(typeRef.getTypeIdentifier())
          newoo.getGenerics().addAll(typeRef.getGenerics())
          newoo.getContainedType.addAll(typeRef.getContainedType)
          newoo.setIsCalledWithParenthesis( params match {
                case Some(par) =>  true
                case None =>      false
            })
          newoo
        }
      }

      params match {
        case Some(_@par) =>
          for (p <- par) newo.getParameters.add(p)
        case None =>
      }
      newo


  }

  /** Parses the super type targeted by the super call. */
  private def superType = "<" ~ genericQualifiedTypeObject ~ ">" ^^ {case _ ~ superType ~ _ => superType }

  /** Parses the parameters of the super call. */
  private def callFeatureParams = "(" ~> repsep(fStatement, ",") <~ ")" | (fLambda ^^ {case l => List(l)})

  /** Parses the generics of the super call. */
  private def opGenericParams = "[" ~ rep1sep(genericQualifiedTypeObject,",") ~ "]" ^^{case _ ~ params ~ _ => params }
}
