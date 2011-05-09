/* $Id: KClassDefinitionParser.scala 14357 2011-02-25 14:17:16Z dvojtise $
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
import org.kermeta.language.loader.kmt.scala.internal.parser.KmBuildHelper
import scala.collection.JavaConversions._

/**
 * Sub parser dedicated to parse ClassDefinition in KMt textual syntax
 */
trait KClassDefinitionParser extends KAbstractParser 
                                with KInvParser
                                with KAttributeParser
                                with KOperationParser
                                with KTagParser
                                with KGenericTypeParser{

  /* SUB PARSER MINIMAL CONTRACT */
  def invariant : Parser[Constraint]
  def annotation : Parser[Tag]
  def attribute : Parser[Property]
  def operation : Parser[Operation]
  /* END CONTRACT */

  def abstractModifier = opt("abstract")
  def aspectModifier = opt("aspect")
  def singletonModifier = opt("singleton")

  def classDeclKeyword = ( "class" | "singleton" )

  def classDecl : Parser[ClassDefinition] = aspectModifier ~ abstractModifier ~ classDeclKeyword ~ ident ~ opt(classGenericParems) ~ opt(classParentDecls) ~ "{" ~ rep(annotableClassMemberDecl) ~ "}" ^^ { case aspectM ~ abstractM ~ classKeyword ~ id1 ~params ~ parents ~ _ ~ members ~ _ =>
      var newo =StructureFactory.eINSTANCE.createClassDefinition
      newo.setName(id1.toString)
      aspectM match {
        case Some(_) =>  newo.setIsAspect(true)
        case None => newo.setIsAspect(false)
      }
      abstractM match {
        case Some(_) => newo.setIsAbstract(true)
        case None => newo.setIsAbstract(false)
      }

      classKeyword match {
        case "class" => newo.setIsSingleton(false)
        case "singleton" => newo.setIsSingleton(true)
      }
/*
      singletonM match {
        case Some(_) => newo.setIsSingleton(true)
        case None => newo.setIsSingleton(false)
      }*/
      params match {
        case None =>
        case Some(paramsI) => {
            paramsI.foreach{params =>
              var ovar =StructureFactory.eINSTANCE.createObjectTypeVariable
              ovar.setName(params)
              newo.getTypeParameter.add(ovar)
              newo.getContainedType.add(ovar)
            }
          }
      }

      parents match {
        case None => {
            // by default if there is no inherits, inherits from Object
            var newParent = KmBuildHelper.getOrCreateUnresolvedType(newo, "kermeta::standard::Object")
            newo.getSuperType.add(newParent)
        }
        case Some(parentI)=> {
            parentI.foreach{parent=>
              var newParent = KmBuildHelper.selectType(newo, parent)
              newo.getContainedType.add(newParent)
              newo.getSuperType.add(newParent)
            }
          }
      }

      members.foreach{member => {
          member match {
            case m : Constraint => newo.getInv.add(m)
            case m : Operation => {
                newo.getOwnedOperation.add(m);
               // DVK operation can own its type directly, no need to put them in the class newo.getContainedType.add(m.getType) // TODO OPTIMISATION
              }
            case m : Property => newo.getOwnedAttribute.add(m)
            case _ => println("class def add new member type")
          }
        }}
      newo
  }

  private def classGenericParems = "<" ~ rep1sep(packageName,",") ~ ">" ^^{case _ ~ params ~ _ => params }



  private def classParentDecls = "inherits" ~ rep1sep(genericQualifiedType, ",") ^^ { case _ ~ parents => parents
  }
  // private def classMemberDecls = annotableClassMemberDecl +
  private def annotableClassMemberDecl = (annotation?) ~ classMemberDecl ^^ { case e ~ e1 =>
      e match {
        case Some(_ @ annotation) => e1.getKOwnedTags.add(annotation)
        case None => //NOTHING TO DO
      }
      e1
  }

  def classMemberDecl = kpositioned ( invariant | operation | property | attribute ) //attribute | reference | operation ;



  


}
