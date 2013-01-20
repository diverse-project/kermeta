package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import scala.util.parsing.input.Positional
import org.kermeta.language.structure.Using
import org.kermeta.language.util.ModelingUnit
import org.kermeta.language.structure.StructureFactory
import org.kermeta.language.structure.Tag
import org.kermeta.language.structure.Package

trait KMTHeaderParser extends KAbstractParser with KTagParser with KUsingParser with KAliasParser {

  case class NameSpacePrefix(name: String) extends Positional

  def kmtHeader = opt((annotation)+) ~ opt(packageNamespaceDecl) ~ opt(kermetaUnitHeader) ^^ {
    case rootTag ~ packPrefix ~ header => {
      var rootMetamodel = StructureFactory.eINSTANCE.createMetamodel()
      rootMetamodel.setIsResolved(false)
      
      rootTag.foreach { elem =>
        elem match {
          case l: List[_] => l.asInstanceOf[List[_]].foreach { listElem =>
            listElem match {
              case t: Tag =>
                rootMetamodel.getKTag.add(t);
                rootMetamodel.getKOwnedTags.add(t)
              case _@ elem => println("TODO unknow elem in rootTag:" + elem)
            }
          }
          case _@ d => println("TODO modeling unit roottag content: " + d)
        }
      }

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
      header.foreach { elem =>
        elem match {
          case l: List[_] => l.asInstanceOf[List[_]].foreach { listElem =>
            listElem match {
              case u: Using => usings = usings ++ List(u)
              case _@ elem => println("TODO unknow elem in header:" + elem)
            }
          }
          case _@ d => println("TODO modeling unit header content: " + d)
        }
      }
      (rootMetamodel, lastPackageRoot, usings)
    }
  }

  // prefix
  def packageNamespaceDecl: Parser[NameSpacePrefix] = "package" ~> packageName <~ ";" ^^ { case p => NameSpacePrefix(p) }

  // header part of the ModelingUnit : using 
  def kermetaUnitHeader = (kpositioned(usingStmt)+)

}