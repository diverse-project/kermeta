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

import org.kermeta.language.util.ModelingUnit
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.structure.impl._
import org.kermeta.language.behavior.impl._
import scala.collection.JavaConversions._
import scala.util.parsing.input.OffsetPosition
import scala.util.parsing.input.Positional
import java.util.ArrayList

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
  def program =  opt(kermetaUnitHeader) ~ opt(kermetaUnitContent) ^^ {
    case header ~ unitContent =>
      var newModelingUnit = new ModelingUnit(new ArrayList());
      var usings: List[Using] = List()

      var rootMetamodel: Option[UnresolvedMetamodel] = None
      unitContent.foreach { elem =>
        elem match {
          case l: List[_] => l.asInstanceOf[List[_]].foreach { listElem =>
            listElem match {
              //case t : Tag => newp.getKTag.add(t);newp.getKOwnedTags.add(t)
              case l: List[_] => l.asInstanceOf[List[_]].foreach { lelem =>
                lelem match {

                  case p: Package => {
                    rootMetamodel match {
                      case Some(x) => { x.getPackages.add(p) }
                      case None => {
                        // create a new default "unnamed"/no uri UnresolvedMetamodel
                        val x: UnresolvedMetamodel = StructureFactory.eINSTANCE.createUnresolvedMetamodel()
                        rootMetamodel = Some(x)
                        x.getPackages.add(p)
                      }
                    }

                  }
                  case mu: Metamodel => {
                    newModelingUnit.getMetamodels().add(mu)
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

  // header part of the ModelingUnit : using 
  def kermetaUnitHeader = (kpositioned(usingStmt)+)

  // main part of the ModelingUnit : package and modeling unit declaration including their annotations
  def kermetaUnitContent = (modelingUnitTopLevelDecl+)

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

  // reassign annotation to the following annotable element
  private def modelingUnitTopLevelDecl: Parser[List[Object]] = ((annotation | annotableModelingUnitElement)+) ^^ {
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

  //TODO rename
  def annotableModelingUnitElement = kpositioned(subPackageDecl | metamodelDecl | classDecl | enumDecl | aliasStmt)
  /*
	 * MODELTYPE ADDITION
	 * Parse a modeltype/metamodel declaration with its ClassDefinition and Enumeration declarations
	 */
  def metamodelDecl = "metamodel" ~ ident ~ "{" ~ (modelingUnitTopLevelDecl?) ~ "}" ^^ {
    case _ ~ modelTypeName ~ _ ~ decls ~ _ =>
      var newmt = StructureFactory.eINSTANCE.createUnresolvedMetamodel()
      newmt.setName(modelTypeName)
      decls match {
        case Some(_@ subElem) => subElem.asInstanceOf[List[_]].foreach { elem =>
          elem match {
            case subPack: Package => newmt.getPackages.add(subPack);
            case _ => println("unknow subelem")
          }
        }
        case None => println("Warning : Empty Metamodel " + newmt.getName)
      }
      newmt
  }

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
