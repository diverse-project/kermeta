package org.kermeta.language.loader.kmt.scala.internal.printer

import org.kermeta.KmPackage
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.kermeta.language.structure.ModelingUnit
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import scala.collection.JavaConversions._
import java.util.regex.Pattern

object PrettyPrinter {

  def main(args: Array[String]): Unit = {

    var res = new StringBuffer
    print(loadKM("/home/barais/workspaces/compiloV2/org.kermeta.language.loader.kmt.scala/parsed.km"), res)
    println(res.toString)
  }

  def loadKM(fileName: String): ModelingUnit = {
    var rs = new ResourceSetImpl()
    var f = rs.getResourceFactoryRegistry()
    var m = f.getExtensionToFactoryMap()
    m.put("km", new XMIResourceFactoryImpl())
    rs.getPackageRegistry().put(KmPackage.eNS_URI, KmPackage.eINSTANCE);
    var uri = URI.createFileURI(fileName)
    var resource = rs.getResource(uri, true)
    var mu: ModelingUnit = null;
    if (resource.isLoaded() && resource.getContents().size() > 0) {
      mu = resource.getContents().get(0).asInstanceOf[ModelingUnit]
    }
    return mu;
  }

  /**
   * printer of labels for an outline
   */
  def printOutline(o: EObject, res: java.lang.StringBuffer): Unit = {
    o match {
      case m: ModelingUnit => {
        m.getPackages.foreach(p => printOutline(p, res))
        m.getOwnedTypeDefinition.foreach(p => printOutline(p, res))
      }
      case p: Package => {
        res.append(p.getName())
      }
      case pt: PrimitiveType => {
        pt.getKOwnedTags.foreach { tag =>
          res.append("\t")
          printOutline(tag, res)
        }
        res.append("\t")
        res.append("alias " + pt.getName() + " : ")
        printOutline(pt.getInstanceType, res)
        res.append("\n")
      }
      case c: Class => {
        res.append(c.getTypeDefinition().getName())
        if (!c.getTypeParamBinding().isEmpty()) {
          res.append("[")
          var i: Int = 0;
          c.getTypeParamBinding().foreach { tpb =>
            if (i == 0) {
              printOutline(tpb, res)
            } else {
              res.append(", ")
              printOutline(tpb, res)
            }
            i = i + 1
          }
          res.append("]")
        }
      }
      case c: ClassDefinition => {
        
        if (c.getIsAbstract)
          res.append("abstract ")
        if (c.getIsAspect)
          res.append("aspect ")
        if (c.getIsSingleton)
          res.append("singleton ")
        res.append("class " + c.getName())
        //Generic parameters
        if (c.getTypeParameter.size() > 0) {
          res.append("<")
          var i: Int = 0;
          c.getTypeParameter.foreach { tp =>
            if (i == 0) {
              res.append(tp.getName)
            } else {
              res.append(", " + tp.getName)
            }
            tp.getSupertype match {
              case urt: UnresolvedType => res.append(" : " + urt.getTypeIdentifier)
              case (_) =>
            }
            i = i + 1
          }
          res.append(">")
        }

      }
      case p: Property => {

        if (p.getIsReadOnly)
          res.append("readonly ")

        res.append(p.getName + " : ")
        printMultiplicityElementTypeType(p, res)
        p.getOpposite() match {
          case oppositeProperty: Property => {
        	  res.append("#"+oppositeProperty.getName())
          }
          case oppositeProperty: UnresolvedProperty => {
        	  res.append("#"+oppositeProperty.getPropertyIdentifier())
          }
          case (_) =>
        }

      }
      case op: Operation => {        
        res.append(op.getName)
        if (op.getTypeParameter.size() > 0) {
          res.append("[")
          var i = 0
          op.getTypeParameter.foreach(tp => {
            if (i != 0)
              res.append(", ")
            res.append(tp.getName)
            tp.getSupertype match {
              case urt: UnresolvedType => res.append(" : " + urt.getTypeIdentifier)
              case (_) =>
            }
            i = i + 1
          })
          res.append("]")
        }

        res.append("(")
        var i = 0
        op.getOwnedParameter.foreach(p => {
          if (i != 0)
            res.append(", ")
          printOutline(p, res)
          i = i + 1
        })
        res.append(") : ")
        printMultiplicityElementTypeType(op, res)
        
      }

      case p: Parameter => {
        res.append(p.getName + " : ")
        printMultiplicityElementTypeType(p, res)
      }
      case p: UnresolvedType => {
        res.append(p.getTypeIdentifier)
        if (p.getGenerics.size > 0)
          res.append("<")
        var i = 0
        p.getGenerics.foreach(g => {
          if (i != 0)
            res.append(", ")
          printOutline(g, res)
          i = i + 1
        })
        if (p.getGenerics.size > 0)
          res.append(">")
      }

      
      case i: VoidLiteral => {
        res.append("void")

      }
      case f: FunctionType => {
        res.append("<")

        printOutline(f.getLeft, res)
        res.append("->")
        printOutline(f.getRight, res)

        res.append(">")
      }

      
      case c: ProductType => {
        res.append("[")
        var i = 0
        c.getType.foreach(p => {
          if (i != 0)
            res.append(",")
          printOutline(p, res)
          i = i + 1
        })
        res.append("]")
      }

      case c: EnumerationLiteral => {
        res.append(c.getName )
      }

      case c: Enumeration => {
        res.append("enum " + c.getName + " {")
        c.getOwnedLiteral.foreach(p => printOutline(p, res))
        res.append("}")
      }

      case t: Tag => {
        res.append("@")
        res.append(t.getName)
        res.append(" \"")
        res.append(t.getValue)
        res.append("\"")
      }

      case o: EObject => res.append("todo " + o.getClass)
    }
    return ;
  }

  /**
   * full pretty printer
   */
  def print(o: EObject, res: java.lang.StringBuffer): Unit = {
    o match {
      case m: ModelingUnit => {
        m.getPackages.foreach(p => print(p, res))
        m.getOwnedTypeDefinition.foreach(p => print(p, res))
      }
      case p: Package => {
        p.getKOwnedTags.foreach { tag =>
          print(tag, res)
        }
        res.append("package " + p.getName() + " {\n")
        p.getNestedPackage.foreach(e => print(e, res))
        p.getOwnedTypeDefinition.foreach(e => print(e, res))
        res.append("\n}\n")
      }
      case pt: PrimitiveType => {
        pt.getKOwnedTags.foreach { tag =>
          res.append("\t")
          print(tag, res)
        }
        res.append("\t")
        res.append("alias " + pt.getName() + " : ")
        print(pt.getInstanceType, res)
        res.append("\n")
      }
      case c: Class => {
        res.append(c.getTypeDefinition().getName())
        if (!c.getTypeParamBinding().isEmpty()) {
          res.append("[")
          var i: Int = 0;
          c.getTypeParamBinding().foreach { tpb =>
            if (i == 0) {
              print(tpb, res)
            } else {
              res.append(", ")
              print(tpb, res)
            }
            i = i + 1
          }
          res.append("]")
        }
      }
      case c: ClassDefinition => {
        c.getKOwnedTags.foreach { tag =>
          res.append("\t")
          print(tag, res)
        }
        res.append("\t")
        if (c.getIsAbstract)
          res.append("abstract ")
        if (c.getIsAspect)
          res.append("aspect ")
        if (c.getIsSingleton)
          res.append("singleton ")
        res.append("class " + c.getName())
        //Generic parameters
        if (c.getTypeParameter.size() > 0) {
          res.append("<")
          var i: Int = 0;
          c.getTypeParameter.foreach { tp =>
            if (i == 0) {
              res.append(tp.getName)
            } else {
              res.append(", " + tp.getName)
            }
            tp.getSupertype match {
              case urt: UnresolvedType => res.append(" : " + urt.getTypeIdentifier)
              case (_) =>
            }
            i = i + 1
          }
          res.append(">")
        }

        res.append(" {\n")
        //c.getTypeParameter.foreach{ tp => res.append("," + tp.getName)}
        c.getOwnedAttribute.foreach { att => print(att, res) }
        c.getOwnedOperation.foreach { op => print(op, res) }
        //TODO Generic
        //TODO Invariant
        res.append("\n\t}\n")
      }
      case p: Property => {
        p.getKOwnedTags.foreach { tag =>
          res.append("\t\t")
          print(tag, res)
        }
        if (p.getIsComposite)
          res.append("\t\tattribute ")
        else {
          if (p.getIsDerived) {
            res.append("\t\tproperty ")
          } else
            res.append("\t\treference ")
        }
        if (p.getIsReadOnly)
          res.append("readonly ")

        res.append(p.getName + " : ")
        printMultiplicityElementTypeType(p, res)

        //TODO opposite
        //TODO getter setter for derived
        res.append("\n")

        if (p.getIsDerived) {

          if (p.getGetterBody != null) {
            res.append("\t\t\tgetter is ")
            res.append(print(p.getGetterBody, res))
          }
          if (p.getSetterBody != null) {
            res.append("\t\t\tsetter is ")
            res.append(print(p.getSetterBody, res))
          }
        }

      }
      case op: Operation => {
        op.getKOwnedTags.foreach { tag =>
          res.append("\t\t")
          print(tag, res)
        }
        res.append("\t\toperation " + op.getName)

        if (op.getTypeParameter.size() > 0) {
          res.append("<")
          var i = 0
          op.getTypeParameter.foreach(tp => {
            if (i != 0)
              res.append(", ")
            res.append(tp.getName)
            tp.getSupertype match {
              case urt: UnresolvedType => res.append(" : " + urt.getTypeIdentifier)
              case (_) =>
            }
            i = i + 1
          })
          res.append(">")
        }

        res.append("(")
        var i = 0
        op.getOwnedParameter.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        res.append(") : ")
        printMultiplicityElementTypeType(op, res)
        //TODO lower upper superoperation
        op.getPre.foreach(p => {
          res.append("\n\t\t\tpre " + p.getName + "is")
          print(p.getBody, res)

        })
        op.getPost.foreach(p => {
          res.append("\n\t\t\tpost " + p.getName + "is")
          print(p.getBody, res)

        })
        res.append("\n\t\tis ")
        if (op.getIsAbstract != null && op.getIsAbstract)
          res.append(" abstract ")
        else {
          print(op.getBody, res)
          //TODO pre post
        }
        //RaiseException
        res.append("\n")
      }

      case p: Parameter => {
        res.append(p.getName + " : ")
        printMultiplicityElementTypeType(p, res)
      }
      case p: UnresolvedType => {
        res.append(p.getTypeIdentifier)
        if (p.getGenerics.size > 0)
          res.append("<")
        var i = 0
        p.getGenerics.foreach(g => {
          if (i != 0)
            res.append(", ")
          print(g, res)
          i = i + 1
        })
        if (p.getGenerics.size > 0)
          res.append(">")
      }

      case b: Block => {
        res.append("\n\t\t\tdo\n")
        b.getStatement.foreach(s => {
          res.append("\t\t\t")
          print(s, res)
          res.append("\n")
        })

        if (b.getRescueBlock.size != 0) {
          b.getRescueBlock.foreach(s => {
            res.append("rescue ")
            print(s, res)
            res.append("\n")
          })
        }
        res.append("\t\t\tend\n")

      }
      case v: VariableDecl => {
        res.append("var " + v.getIdentifier + " : ")
        printMultiplicityElementTypeType(v.getType, res)
        if (v.getInitialization != null) {
          res.append(" init ")
          print(v.getInitialization, res)
        }
      }

      case c: Conditional => {
        res.append("if (")
        print(c.getCondition, res)
        res.append(") then \n")
        print(c.getThenBody, res)
        if (c.getElseBody != null) {
          res.append("\n\t\t\t else\n")
          print(c.getElseBody, res)
        }
        res.append("\n\t\t\t end \n")

      }

      case l: Loop => {
        if (l.getInitialization != null) {
          res.append("\t\t\t from ")
          print(l.getInitialization, res)
        }
        res.append(" \n\t\t\tuntil ")
        print(l.getStopCondition, res)
        res.append(" \n\t\t\tloop ")
        print(l.getBody, res)
        res.append(" \n\t\t\tend\n ")

      }

      case l: LambdaExpression => {
        res.append("{")
        var i = 0
        l.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        res.append("|")
        print(l.getBody, res)
        res.append("\t\t\t}")
      }
      case p: LambdaParameter => {
        res.append(p.getName)
        if (p.getType != null) {
          res.append(" : ")
          print(p.getType, res)
        }
      }
      case p: TypeReference => {
        print(p.getType, res)
      }

      case i: IntegerLiteral => {
        res.append(i.getValue)
      }
      case i: StringLiteral => {
        var lit = i.getValue.replaceAll("\\\\", "\\\\\\\\")
        lit = lit.replaceAll("\n", "\\\\n")
        lit = lit.replaceAll("\t", "\\\\t")
        lit = lit.replaceAll("\r", "\\\\r")
        lit = lit.replaceAll("\f", "\\\\f")
        lit = lit.replaceAll("\"", "\\\\\"")
        lit = lit.replaceAll("\'", "\\\\\'")
        res.append("\"" + lit + "\"")
      }
      case i: BooleanLiteral => {
        res.append(i.getValue)
      }

      case i: VoidLiteral => {
        res.append("void")

      }
      case f: FunctionType => {
        res.append("<")

        print(f.getLeft, res)
        res.append("->")
        print(f.getRight, res)

        res.append(">")
      }

      case u: UnresolvedCall => {
        if (u.getTarget != null) {
          print(u.getTarget, res)
          res.append(".")
        }
        res.append(u.getName)

        var j = 0
        if (u.getGenerics.size > 0)
          res.append("[")
        u.getGenerics.foreach(p => {
          if (j != 0) res.append(", ")
          print(p, res)
          j = j + 1
        })
        if (u.getGenerics.size > 0)
          res.append("]")

        var i = 0
        if (u.getParameters.size > 0)
          res.append("(")
        u.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (u.getParameters.size > 0) {
          res.append(")")
        }
      }
      case c: CallSuperOperation => {
        res.append("super." + c.getName)
        var i = 0
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }
      }
      case c: CallOperation => {
        print(c.getTarget, res)
        res.append("." + c.getName)
        var i = 0
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }

      }
      case c: SelfExpression => {
        res.append("self")

      }

      case c: ProductType => {
        res.append("[")
        var i = 0
        c.getType.foreach(p => {
          if (i != 0)
            res.append(",")
          print(p, res)
          i = i + 1
        })
        res.append("]")
      }

      case c: Assignment => {
        print(c.getTarget, res)
        if (c.getIsCast != null && c.getIsCast)
          res.append("?=")
        else
          res.append(":=")
        print(c.getValue, res)

      }

      case c: CallProperty => {
        print(c.getTarget, res)
        res.append("." + c.getName)
        var i = 0
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }
      }

      case c: CallResult => {
        res.append("result")
      }
      case c: CallVariable => {
        print(c.getStaticType, res)
        res.append("." + c.getName)
        var i = 0
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }
      }

      case c: EnumerationLiteral => {
        res.append(c.getName + "; ")
      }

      case c: Enumeration => {
        res.append("enum " + c.getName + " {")
        c.getOwnedLiteral.foreach(p => print(p, res))
        res.append("}\n")
      }

      case c: Rescue => {
        res.append("(" + c.getExceptionName + " : ")
        print(c.getExceptionType, res)
        res.append(")\n\tdo\n")
        c.getBody.foreach { exp =>
          {
            print(exp, res)
            res.append("\n")
          }
        }
        res.append("\tend\n")
      }

      case c: CallEnumLiteral => {
        print(c.getStaticEnumLiteral, res)
        res.append("." + c.getName)
        var i = 0
        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }

      }
      case c: CallValue => {
        res.append(c.getName)
        var i = 0

        if (c.getParameters.size > 0)
          res.append("(")
        c.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        if (c.getParameters.size > 0) {
          res.append(")")
        }

      }
      case otv: ObjectTypeVariable => {
        res.append(otv.getName)
        if (otv.getSupertype() != null) {
          res.append(" : ")
          print(otv.getSupertype(), res)
        }
      }

      case tvb: TypeVariableBinding => {
        print(tvb.getVariable(), res)
      }
      case t: Tag => {
        res.append("@")
        res.append(t.getName)
        res.append(" \"")
        res.append(t.getValue)
        res.append("\"\n")
      }

      case j: JavaStaticCall => {
        res.append("extern ")
        res.append(j.getJclass)
        res.append(".")
        res.append(j.getJmethod)
        res.append("(")
        var i = 0
        j.getParameters.foreach(p => {
          if (i != 0)
            res.append(", ")
          print(p, res)
          i = i + 1
        })
        res.append(")")
      }
      case o: EObject => res.append("todo " + o.getClass)
    }
    return ;
  }

  /**
   * operation dedicated to print the type part of a MultiplicityElement
   */
  def printMultiplicityElementTypeType(me: MultiplicityElement, res: java.lang.StringBuffer): Unit = {
    val modifier = CollectionModifier(me.getIsOrdered, me.getIsUnique)
    if (me.getUpper != 1) {
      modifier match {
        case CollectionModifier(false, false) => res.append("bag ")
        case CollectionModifier(false, true) => res.append("seq ")
        case CollectionModifier(true, false) => res.append("set ")
        case CollectionModifier(true, true) =>
      }
    }
    print(me.getType, res)
    if ((me.getUpper != 1) || me.getLower != 0) {
      res.append("[")
      res.append(me.getLower)
      res.append("..")
      res.append(("" + me.getUpper).replace("-1", "*"))
      res.append("]")
    }
  }
  case class CollectionModifier(isOrdered: Boolean, isUnique: Boolean)
}
 


