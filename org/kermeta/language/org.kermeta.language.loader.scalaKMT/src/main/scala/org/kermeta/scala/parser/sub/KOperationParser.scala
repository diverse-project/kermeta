/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser.sub

import org.kermeta.language.structure.Parameter
import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.Tag

trait KOperationParser extends KAbstractParser with KGenericTypeParser {
  /* SUB PARSER CONTRACT */
  def annotation : Parser[Tag]

  /* END SUB PARSER CONTRACT */


  def operationParameters = repsep(operationParameter,",")
  def operationReturnType = opt(":" ~> genericQualifiedType)
  def methodFromType = opt("from" ~> ident )

  def operation =  ( operationKind ~ ident ~ opt(operationGenericParems) ~ "(" ~ operationParameters ~ ")" ~ operationReturnType ~ methodFromType ~ "is" ~ operationBody) ^^ { case opkind ~ opName ~ opGParams ~ _ ~ params ~ _  ~ unresolveType ~ fromType ~ _ ~ body =>
      var newo =StructureFactory.eINSTANCE.createOperation
      opkind match {
        case "operation" => //TODO ERROR IF FROM TYPE
        case "method" => {
            fromType match {
              case None =>
              case Some(ft)=> {
                  var newsuperO = StructureFactory.eINSTANCE.createUnresolvedOperation
                  newsuperO.setOperationIdentifier(ft)
                  newo.setSuperOperation(newsuperO)
                  newo.getOwnedUnresolvedOperations.add(newsuperO)
              }
            }
        }
      }
      newo.setName(opName)
      if(body != null) newo.setBody(body)

      opGParams match {
        case None =>
        case Some(params) => {
            params.foreach{param =>
              var ovar =StructureFactory.eINSTANCE.createObjectTypeVariable
              ovar.setName(param)
              newo.getTypeParameter.add(ovar)
              newo.getContainedType.add(ovar)
              
            }
          }
      }
      
      /*
       params match {
       case Some(_ @ lpara) => for(par <- lpara) newo.getOwnedParameter.add(par)
       case None => // DO NOTHING
       }*/
      params.foreach{par=>
        newo.getOwnedParameter.add(par)
      }

      unresolveType match {
        case None => {
            var newT = StructureFactory.eINSTANCE.createUnresolvedType
            newT.setTypeIdentifier("Void")
            newo.setType(newT)
            newo.getContainedType.add(newT)
          }
        case Some(urt)=> {
            newo.setType(urt)
            newo.getContainedType.add(urt)
          }
      }
      newo
  }

  private def operationGenericParems = "<" ~ rep1sep(packageName,",") ~ ">" ^^{case _ ~ params ~ _ => params }

  def operationParameter : Parser[Parameter] = ident ~ ":" ~ genericQualifiedType ^^ { case id ~ _ ~ unresolveType =>
      var newo = StructureFactory.eINSTANCE.createParameter
      newo.setName(id)
      newo.setType(unresolveType)
      newo.getContainedType.add(unresolveType)
      newo
  }
  /*
   def operationParameterss = (("," ~ operationParameter )*) ^^ { case params => for(par <- params) yield par match {case _ ~ p => p} }
   def operationParameters = operationParameter ~ operationParameterss ^^ { case par ~ params => List(par)++params }
   */
  private def operationKind = ("operation" | "method")
  def property = "prop" ^^^ StructureFactory.eINSTANCE.createProperty

  private def operationBody = ("abstract" ^^^ {null} | operationExpressionBody)

  def operationExpressionBody = ( (annotation?) ~ fStatement) ^^ { case a1 ~ exp =>
      a1 match {
        case Some(_ @ tag) => exp.getKTag.add(tag)
        case None =>
      }
      exp
  }

  

}
