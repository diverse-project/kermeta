/* $Id: KModelingUnitParser.scala 13990 2011-01-04 10:49:56Z dvojtise $
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
import scala.util.parsing.input.OffsetPosition
import scala.util.parsing.input.Positional

/**
 * Sub parser dedicated to parse ModelingUnit in KMT textual syntax  
 */
trait KModelingUnitParser extends KAbstractParser with KTagParser with KUsingParser  {
	
  case class NameSpacePrefix(name : String) extends Positional
  case class ExpressionWrapper(expr : Expression) extends Positional
  case class PositionalString(value : String ) extends Positional
	

  /* */
  def classDecl : Parser[ClassDefinition]

  def enumDecl : Parser[Enumeration]

  def program = opt((annotation)+) ~ opt(packageNamespaceDecl) ~ opt(kermetaUnitHeader) ~ kermetaUnitContent ^^ { case rootTag ~ packPrefix ~ header ~ unitContent =>
      var newp =StructureFactory.eINSTANCE.createModelingUnit
      var usings : List[Using] = List()

      var lastPackageRoot : Option[Package] = None

      rootTag.foreach{elem => elem match {
          case l : List[_] => l.asInstanceOf[List[_]].foreach{listElem => listElem match {
              case t : Tag => newp.getKTag.add(t);newp.getKOwnedTags.add(t)
              case _ @ elem => println("TODO unknow elem in rootTag:" + elem)
          } }
          case _ @ d => println("TODO modeling unit roottag content: "+d)
      } }
      packPrefix match{
        case Some(d)=> {

           d.name.split("::").foreach{ topPackage =>
               var newPackage = StructureFactory.eINSTANCE.createPackage()
               newPackage.setName(topPackage)
               lastPackageRoot match {
                 case Some(previous)=> previous.getNestedPackage.add(newPackage)
                 case None => newp.getPackages.add(newPackage)
               }
               lastPackageRoot = Some(newPackage)
           }
        }
        case None =>
      }

      header.foreach{elem => elem match {
          case l : List[_] => l.asInstanceOf[List[_]].foreach{listElem => listElem match {
              case r : Require => newp.getRequires.add(r)
              case u : Using => usings = usings ++ List(u)
              case _ @ elem => println("TODO unknow elem in header:" + elem)
          } }
          case _ @ d => println("TODO modeling unit header content: "+d)
      } }
      unitContent.foreach{elem => elem match {
          case l : List[_] => l.asInstanceOf[List[_]].foreach{listElem => listElem match {
                //case t : Tag => newp.getKTag.add(t);newp.getKOwnedTags.add(t)
                case p : Package => {
                  lastPackageRoot match {
                    case Some(previous)=> previous.getNestedPackage.add(p)
                    case None => newp.getPackages.add(p)
                  }
                }
                case cd : ClassDefinition => {
                   lastPackageRoot match {
                    case Some(previous)=> previous.getOwnedTypeDefinition.add(cd)
                    case None => newp.getOwnedTypeDefinition.add(cd)
                  }
                }
                case enum : Enumeration => {
                  lastPackageRoot match {
                    case Some(previous)=> previous.getOwnedTypeDefinition.add(enum)
                    case None => newp.getOwnedTypeDefinition.add(enum)
                  }
                }
                case _ @ elem => println("TODO unknow elem in main content:" + elem)
              }}

          case _ @ d => println("TODO modeling unit main content: "+d)
        }}
      /* USING POST PROCESS */
      //Add Using clone to all UnresolvedType and UnresolvedCall
      newp.eAllContents.filter(p=> p.isInstanceOf[UnresolvedType] || p.isInstanceOf[UnresolvedCall]).foreach{ut =>
        var localUsings = List() ++ usings.toList //CLONE USING
        localUsings.foreach{lu=>
          var newo =StructureFactory.eINSTANCE.createUsing
          newo.setFromQName(lu.getFromQName)
          newo.setToName(lu.getToName)
          ut match {
            case unresolvedType : UnresolvedType => unresolvedType.getUsings.add(newo)
            case unresolvedCall : UnresolvedCall => unresolvedCall.getUsings.add(newo)
          }
        }
      }
      newp
  }


  // prefix
  def packageNamespaceDecl : Parser[NameSpacePrefix] =  "package" ~> packageName <~ ";" ^^ { case p =>  NameSpacePrefix(p)}


  // header part of the ModelingUnit : using and optional require
  def kermetaUnitHeader = ((kpositioned(importStmt) | kpositioned(usingStmt))+)
  private def importStmt = "require" ~ ( packageName | stringLit ) ^^ { case _ ~ e =>
      var newo =StructureFactory.eINSTANCE.createRequire
      newo.setUri(e.toString)
      newo
  }



  // main part of the ModelingUnit : package class and enumeration declaration including their annotations
  def kermetaUnitContent = (topLevelDecl+)
  // reassign annotation to the following annotable element
  private def topLevelDecl : Parser[List[Object]] = ((annotation | annotableElement)+) ^^ { case elems =>
      var listAnnotElem : List[Object] = List()
      var listTempTagToAdd : List[Tag] = List()
      for(elem <- elems ){
        elem match {
          case t : Tag => listTempTagToAdd=listTempTagToAdd++List(t)
          case o : Object => {
              listTempTagToAdd.foreach{tag=>o.getKTag.add(tag);o.getKOwnedTags.add(tag)}
              listAnnotElem = listAnnotElem ++ List(o)
              listTempTagToAdd = Nil
            }
        }
      }
      if(listTempTagToAdd != Nil){ listAnnotElem = listAnnotElem++listTempTagToAdd}
      listAnnotElem
  }


  def annotableElement = kpositioned (subPackageDecl | classDecl | enumDecl)// | modelTypeDecl | classDecl | enumDecl | dataTypeDecl )

  def subPackageDecl = "package" ~ rep1sep(ident,"::") ~ "{" ~ (topLevelDecl?) ~ "}" ^^ { case _ ~ packageName ~ _ ~ decls ~ _ =>
      var newp =StructureFactory.eINSTANCE.createPackage
      //newp.setName(packageName)
      //var currentPackage = newp
      var i = 0
      var currentPackage=newp
      packageName.foreach(pack=>{
        if (i==0) {
          newp.setName(pack)
          i=i+1
        } else {
          var localPackage = StructureFactory.eINSTANCE.createPackage()
          localPackage.setName(pack)
          currentPackage.getNestedPackage.add(localPackage)
          localPackage.setNestingPackage(currentPackage)
          currentPackage=localPackage
          i=i+1
        }
      })

      decls match {
        case Some(_ @ subElem) => subElem.asInstanceOf[List[_]].foreach{elem => elem match {
          case cdef : ClassDefinition => currentPackage.getOwnedTypeDefinition.add(cdef)
          case enum : Enumeration => currentPackage.getOwnedTypeDefinition.add(enum)
          case subPack : Package => currentPackage.getNestedPackage.add(subPack);subPack.setNestingPackage(currentPackage)
          case _ => println("unknow subelem")
              /*
              case cdef : ClassDefinition => newp.getOwnedTypeDefinition.add(cdef)
              case enum : Enumeration => newp.getOwnedTypeDefinition.add(enum)
              case subPack : Package => newp.getNestedPackage.add(subPack);subPack.setNestingPackage(newp)
              case _ => println("unknow subelem")
              */
            }}
        case None => println("Warning : Empty Package "+currentPackage.getName)
      }
      newp
  }

}
