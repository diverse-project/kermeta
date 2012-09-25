/* $Id: KModelingUnitParser.scala 13990 2011-01-04 10:49:56Z dvojtise $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 * 		Clement Guy <clement.guy@irisa.fr>
 * 		Didier Vojtisek <didier.vojtisek@inria.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import java.util.ArrayList

import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.asScalaIterator
import scala.util.parsing.input.Positional

import org.kermeta.language.behavior.Expression
import org.kermeta.language.behavior.UnresolvedCall
import org.kermeta.language.loader.kmt.scala.internal.parser.sub.KAbstractParser
import org.kermeta.language.loader.kmt.scala.internal.parser.sub.KAliasParser
import org.kermeta.language.loader.kmt.scala.internal.parser.sub.KTagParser
import org.kermeta.language.loader.kmt.scala.internal.parser.sub.KUsingParser
import org.kermeta.language.structure.ClassDefinition
import org.kermeta.language.structure.Enumeration
import org.kermeta.language.structure.Metamodel
import org.kermeta.language.structure.Package
import org.kermeta.language.structure.PrimitiveType
import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.Tag
import org.kermeta.language.structure.UnresolvedMetamodel
import org.kermeta.language.structure.UnresolvedType
import org.kermeta.language.structure.Using
import org.kermeta.language.util.ModelingUnit

/**
 * Sub parser dedicated to parse ModelingUnit in KMT textual syntax
 */
trait KModelingUnitParser extends KAbstractParser with KTagParser with KUsingParser with KAliasParser {

  case class NameSpacePrefix(name: String) extends Positional
  case class ExpressionWrapper(expr: Expression) extends Positional
  case class PositionalString(value: String) extends Positional

  /* */
  def classDecl: Parser[ClassDefinition]
  def enumDecl: Parser[Enumeration]

  /* Root of a kmt file */
  def program = opt((annotation)+) ~ opt(packageNamespaceDecl) ~ opt(kermetaUnitHeader) ~ opt(kermetaUnitContent) ^^ {
    case rootTag ~ packPrefix ~ header ~ unitContent =>
      var newModelingUnit = new ModelingUnit();
      var rootMetamodel = StructureFactory.eINSTANCE.createUnresolvedMetamodel()
      newModelingUnit.getMetamodels().add(rootMetamodel)

      rootTag.foreach{elem => elem match {
          case l : List[_] => l.asInstanceOf[List[_]].foreach{listElem => listElem match {
              case t : Tag => 	rootMetamodel.getKTag.add(t);
              					rootMetamodel.getKOwnedTags.add(t)
              case _ @ elem => println("TODO unknow elem in rootTag:" + elem)
          } }
          case _ @ d => println("TODO modeling unit roottag content: "+d)
      } }
      
      var lastPackageRoot: Option[Package] = None
      packPrefix match {
        case Some(d) => {

          d.name.split("::").foreach { topPackage =>
            var newPackage = StructureFactory.eINSTANCE.createPackage()
            newPackage.setName(topPackage)
            lastPackageRoot match {
              case Some(previous) => previous.getNestedPackage.add(newPackage)
              case None => rootMetamodel.getPackages.add(newPackage)
            }
            lastPackageRoot = Some(newPackage)
          }
        }
        case None =>
      }

      var usings: List[Using] = List()
      header.foreach{elem => elem match {
          case l : List[_] => l.asInstanceOf[List[_]].foreach{listElem => listElem match {
              case u : Using => usings = usings ++ List(u)
              case _ @ elem => println("TODO unknow elem in header:" + elem)
          } }
          case _ @ d => println("TODO modeling unit header content: "+d)
      } }

      //var rootMetamodel: Option[UnresolvedMetamodel] = None
      unitContent.foreach { elem =>
        elem match {
          case l: List[_] => l.asInstanceOf[List[_]].foreach { listElem =>
            listElem match {
              //case t : Tag => newp.getKTag.add(t);newp.getKOwnedTags.add(t)
              case l: List[_] => l.asInstanceOf[List[_]].foreach { lelem =>
                lelem match {

                  case p: Package => {
                    lastPackageRoot match {
                      case Some(previous) => previous.getNestedPackage.add(p)
                      case None => rootMetamodel.getPackages.add(p)

                    }

                  }
                  case cd: ClassDefinition => {
                    lastPackageRoot match {
                      case Some(previous) => previous.getOwnedTypeDefinition.add(cd)
                      case None => //newp.getOwnedTypeDefinition.add(cd) //TODO ERROR ?
                    }
                  }
                  case enum: Enumeration => {
                    lastPackageRoot match {
                      case Some(previous) => previous.getOwnedTypeDefinition.add(enum)
                      case None => //newp.getOwnedTypeDefinition.add(enum) //TODO ERROR ?
                    }
                  }

                  case _@ elem => println("TODO unknow elem in main content:" + elem)
                }
              }
            }
          }

          case _@ d => println("TODO modeling unit main content: " + d)
        }
      }
      /* USING POST PROCESS */
      //Add Using clone to all UnresolvedType and UnresolvedCall
      newModelingUnit.getMetamodels.foreach { mm =>
        mm.eAllContents.filter(p => p.isInstanceOf[UnresolvedType] || p.isInstanceOf[UnresolvedCall]).foreach { ut =>
          var localUsings = List() ++ usings.toList //CLONE USING
          localUsings.foreach { lu =>
            var newo = StructureFactory.eINSTANCE.createUsing
            newo.setFromQName(lu.getFromQName)
            newo.setToName(lu.getToName)
            ut match {
              case unresolvedType: UnresolvedType => unresolvedType.getUsings.add(newo)
              case unresolvedCall: UnresolvedCall => unresolvedCall.getUsings.add(newo)
            }
          }
        }
      }
      newModelingUnit
  }

  // prefix
  def packageNamespaceDecl: Parser[NameSpacePrefix] = "package" ~> packageName <~ ";" ^^ { case p => NameSpacePrefix(p) }

  // header part of the ModelingUnit : using 
  def kermetaUnitHeader = (kpositioned(usingStmt)+)

  // main part of the ModelingUnit : package and modeling unit declaration including their annotations
  def kermetaUnitContent = (packageTopLevelDecl+)

  // reassign annotation to the following annotable element
  private def packageTopLevelDecl: Parser[List[Object]] = ((annotation | annotablePackageElement)+) ^^ {
    case elems =>
      var listAnnotElem: List[Object] = List()
      var listTempTagToAdd: List[Tag] = List()
      for (elem <- elems) {
        elem match {
          case t: Tag => listTempTagToAdd = listTempTagToAdd ++ List(t)
          case o: Object => {
            listTempTagToAdd.foreach { tag => o.getKTag.add(tag); o.getKOwnedTags.add(tag) }
            listAnnotElem = listAnnotElem ++ List(o)
            listTempTagToAdd = Nil
          }
        }
      }
      if (listTempTagToAdd != Nil) { listAnnotElem = listAnnotElem ++ listTempTagToAdd }
      listAnnotElem
  }


  def annotablePackageElement = kpositioned(subPackageDecl | classDecl | enumDecl | aliasStmt) //  | classDecl | enumDecl | dataTypeDecl )


  def subPackageDecl = "package" ~ rep1sep(ident, "::") ~ "{" ~ (packageTopLevelDecl?) ~ "}" ^^ {
    case _ ~ packageName ~ _ ~ decls ~ _ =>
      var newp = StructureFactory.eINSTANCE.createPackage
      //newp.setName(packageName)
      //var currentPackage = newp
      var i = 0
      var currentPackage = newp
      packageName.foreach(pack => {
        if (i == 0) {
          newp.setName(pack)
          i = i + 1
        } else {
          var localPackage = StructureFactory.eINSTANCE.createPackage()
          localPackage.setName(pack)
          currentPackage.getNestedPackage.add(localPackage)
          localPackage.setNestingPackage(currentPackage)
          currentPackage = localPackage
          i = i + 1
        }
      })

      decls match {
        case Some(_@ subElem) => subElem.asInstanceOf[List[_]].foreach { elem =>
          elem match {
            case cdef: ClassDefinition => currentPackage.getOwnedTypeDefinition.add(cdef)
            case enum: Enumeration => currentPackage.getOwnedTypeDefinition.add(enum)
            case subPack: Package => currentPackage.getNestedPackage.add(subPack); subPack.setNestingPackage(currentPackage)
            case alias: PrimitiveType => currentPackage.getOwnedTypeDefinition.add(alias)
            case _ => println("unknow subelem")
            /*
              case cdef : ClassDefinition => newp.getOwnedTypeDefinition.add(cdef)
              case enum : Enumeration => newp.getOwnedTypeDefinition.add(enum)
              case subPack : Package => newp.getNestedPackage.add(subPack);subPack.setNestingPackage(newp)
              case _ => println("unknow subelem")
              */
          }
        }
        case None => println("Warning : Empty Package " + currentPackage.getName)
      }
      newp
  }

}
