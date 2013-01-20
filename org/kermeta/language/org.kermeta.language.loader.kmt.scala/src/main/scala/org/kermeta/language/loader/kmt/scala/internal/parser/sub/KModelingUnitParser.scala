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

import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.asScalaIterator
import scala.util.parsing.input.Positional
import org.kermeta.language.behavior.Expression
import org.kermeta.language.behavior.UnresolvedCall
import org.kermeta.language.structure.ClassDefinition
import org.kermeta.language.structure.Enumeration
import org.kermeta.language.structure.Package
import org.kermeta.language.structure.PrimitiveType
import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.Tag
import org.kermeta.language.structure.UnresolvedType
import org.kermeta.language.structure.Using
import org.kermeta.language.util.ModelingUnit
import org.kermeta.language.structure.ModelTypeDefinition

/**
 * Sub parser dedicated to parse ModelingUnit in KMT textual syntax
 */
trait KModelingUnitParser extends KAbstractParser with KMTHeaderParser with KMetamodelAspectParser {

  case class ExpressionWrapper(expr: Expression) extends Positional
  case class PositionalString(value: String) extends Positional

  /* */
  def classDecl: Parser[ClassDefinition]
  def enumDecl: Parser[Enumeration]

  /* Root of a kmt file */
  def program = kmtHeader ~ opt(kermetaUnitContent) ^^ {
    case header ~ unitContent =>
      var newModelingUnit = new ModelingUnit();

      var rootMetamodel = header._1
      newModelingUnit.getMetamodels().add(rootMetamodel)

      var lastPackageRoot: Option[Package] = None

      header._2 match {
        case Some(p) => lastPackageRoot = Some(p)
        case None =>
      }
      var usings: List[Using] = header._3

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
                  case mtd : ModelTypeDefinition => {
                    //TODO: Error if lastPackage is not empty and if there are Package declaration in the same file.
                    rootMetamodel.getOwnedModelTypeDefinitions().add(mtd)
                    mtd.setMetamodel(rootMetamodel)
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

  def annotablePackageElement = kpositioned(subPackageDecl | classDecl | enumDecl | aliasStmt | metamodelAspect) //  | classDecl | enumDecl | dataTypeDecl )

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
