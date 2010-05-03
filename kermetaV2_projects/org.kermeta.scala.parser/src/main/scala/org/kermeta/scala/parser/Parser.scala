
package org.kermeta.scala.parser

import scala.util.parsing.combinator.syntactical.StandardTokenParsers
import fr.irisa.triskell.kermeta.language.structure._
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.language.structure.impl._
import fr.irisa.triskell.kermeta.language.behavior.impl._
import scala.collection.JavaConversions._

object Parser extends StandardTokenParsers {
  lexical.reserved += ("package","require","using","class","aspect","abstract","inv","operation","method","is","do","end","var")
  lexical.delimiters += ("=",";","::","@","{","}","(",")",":",":=",".",",")

  def parse(content : String) : Option[ModelingUnit] = {
    val tokens = new lexical.Scanner(content)
    val result = phrase(program)(tokens)
    result match {
      case Success(tree, _) => {Some(tree) }
      case e: NoSuccess => {
          Console.err.println(e)
          exit(100)
          None
        }
    }
  }

  /* MODELING UNIT DEFINITION */
  def program = kermetaUnit ^^ { case unit => 
      var newp =StructureFactory.eINSTANCE.createModelingUnit
      unit.foreach{elem => elem match {
          case l : List[_] => l.asInstanceOf[List[_]].foreach{listElem => listElem match {
                case t : Tag => newp.getTag.add(t)
                case r : Require => newp.getRequires.add(r)
                case p : Package => newp.getPackages.add(p)
                case _ => println("unknow elem")
          }}
        case _ => println("TODO modeling unit catch some type sub elem")
      }}
      newp
  }
  def kermetaUnit = scompUnit+

  def scompUnit = (/*packageDecl|*/importStmts|usingStmts|topLevelDecl) // TODO ADD ANNOTATION TO ELEM

  /* DEPRECATED */
  /*
  def packageDecl = "package" ~ expr ~ ";" ^^ { case _ ~ p ~ _ => {
        var newp =StructureFactory.eINSTANCE.createPackage
        newp.setName(p)
        newp
      }}*/
  def importStmts = importStmt+
  private def importStmt = "require" <~ expr ^^ { case e =>
      var newo =StructureFactory.eINSTANCE.createRequire
      newo.setUri(e.toString)
      newo
  }
  private def usingStmts = "using" ~> ident ~ packageQualifiedName ^^ { case id ~ name =>
      var newo =StructureFactory.eINSTANCE.createUsing
      newo.setQualifiedName(id.toString+"::"+name.toString)
  }
  private def packageQualifiedName =  ( "::" ~ ident )*
  def topLevelDecl : Parser[Any] = ((annotation | annotableElement)+) ^^ { case elems =>

  }
  private def annotation : Parser[Tag] = "@" ~> ident ~ stringLit ^^ { case id1 ~ st1 =>
      var newo =StructureFactory.eINSTANCE.createTag
      newo.setName(id1.toString)
      newo.setValue(st1.toString)
      newo
  }
  def annotableElement = (subPackageDecl | classDecl)// | modelTypeDecl | classDecl | enumDecl | dataTypeDecl )
  def subPackageDecl = ("package" ~ ident ~ "{" ~ (topLevelDeclOpt) ~ "}" ) ^^ { case _ ~ packageName ~ _ ~ decls ~ _ =>
      var newp =StructureFactory.eINSTANCE.createPackage
      newp.setName(packageName)
      decls match {
        case Some(_ @ subElem) => subElem.asInstanceOf[List[_]].foreach{elem => elem match {
              case cdef : ClassDefinition => newp.getOwnedTypeDefinition.add(cdef)
              case subPack : Package => newp.getNestedPackage.add(subPack);subPack.setNestingPackage(newp)
              case _ =>
            }}
        case None => println("Warning : Empty Package "+newp.getName)
      }
      newp
  }
  def topLevelDeclOpt = (topLevelDecl ?)
  /*def modelTypeDecl = ("")
   def classDecl = ("")
   def enumDecl = ("")
   def dataTypeDecl = ("")*/

  private def classDecl = aspectModifier ~ abstractModifier ~ "class" ~ ident ~ "{" ~ classMemberDecls ~ "}" ^^ { case aspectM ~ abstractM ~ _ ~ id1 ~ _ ~ members ~ _ =>
      var newo =StructureFactory.eINSTANCE.createClassDefinition
      newo.setName(id1.toString)
      aspectM match {
        case Some(_) =>  newo.setIsAspect(true)
        case None => newo.setIsAspect(false)
      }
      abstractM match {
        case Some(_) =>  newo.setIsAbstract(true)
        case None => newo.setIsAbstract(false)
      }
      members.foreach{member => {
          member match {
            case m : Constraint => newo.getInv.add(m)
            case m : Operation => newo.getOwnedOperation.add(m)
            case _ => println("class def add new member type")
          }
        }}
      newo
  }

  private def classMemberDecls = annotableClassMemberDecl +
  private def annotableClassMemberDecl = (annotation?) ~ classMemberDecl ^^ { case e ~ e1 =>
      e match {
        case Some(_) => println("TODO ADD ANNOTATION")
        case None => //NOTHING TO DO
      }
      e1
  }
  def classMemberDecl = ( invariant | operation | property ) //attribute | reference | operation ;

  def invariant = ("inv" ~> expr ) ^^ { case expr =>
      var newo =StructureFactory.eINSTANCE.createConstraint
      //TODO
      newo
  }
  def operation =  ( operationKind ~ ident ~ "(" ~ ")" ~ ":" ~ ident ~ "is" ~ operationExpressionBody) ^^ { case opkind ~ opName ~ _ ~ _  ~ _ ~ id2 ~ _ ~ body =>
      var newo =StructureFactory.eINSTANCE.createOperation
      opkind match {
        case "operation" => //NOTHING TO DO
        case "method" => /* println("method") SET SUPER OPERATION */
      }
      newo.setName(opName)
      newo.setBody(body)
      newo
  }
  private def operationKind = ("operation" | "method")
  def property = "prop" ^^^ StructureFactory.eINSTANCE.createProperty
  def abstractModifier = ("abstract")?
  def aspectModifier = ("aspect")?

  private def operationBody = ("abstract" ^^^ {null} | operationExpressionBody)
  def operationExpressionBody = ( (annotation?) ~ fStatement) ^^ { case a1 ~ exp =>
      a1 match {
        case Some(_ @ tag) => exp.getTag.add(tag)
        case None =>
      }
      exp
  }

  def fExpressionLst : Parser[List[Expression]] = (fStatement+)
  def fStatement : Parser[Expression] = (fBlock | fVariableDecl | fAssignement | fCall | fLiteral )//fLoop | fConditional | fRaiseException |  | fAssignement)

  def fVariableDecl : Parser[Expression] = "var" ~> ident ~ ":" ~ ident ~ packageQualifiedName ^^ { case id1 ~ _ ~ id2 ~ id3  =>
      var newo = BehaviorFactory.eINSTANCE.createVariableDecl
      newo.setIdentifier(id1)
      var typeName = id2+"::"+id3
      var newtype = BehaviorFactory.eINSTANCE.createTypeReference
      newtype.setName(typeName)
      newo.setType(newtype)
      newo
  }
  private def fAssignement : Parser[Expression] = ( fCall ~ ":=" ~ fStatement) ^^ { case target ~ _ ~ statment =>
      var newo = BehaviorFactory.eINSTANCE.createAssignment
      newo.setTarget(target)
      newo.setValue(statment)
      newo
  }
  private def fBlock : Parser[Expression] = "do" ~> fExpressionLst ~ (fRescueLst?) <~ "end" ^^ { case expL ~ rescueL =>
      var newo = BehaviorFactory.eINSTANCE.createBlock
      newo.getStatement.addAll(expL)
      newo.getStatement.add(rescueL getOrElse BehaviorFactory.eINSTANCE.createEmptyExpression)
      newo
  }
  def fRescueLst = ident ^^^ {BehaviorFactory.eINSTANCE.createEmptyExpression}

  private def fLiteral : Parser[Expression] = ( fStringLiteral | fBooleanLiteral | fNumericLiteral | fVoidLiteral )
  private def fBooleanLiteral : Parser[Expression] = ("true" ^^^ {
      var newo = BehaviorFactory.eINSTANCE.createBooleanLiteral
      newo.setValue(true)
      newo
    } | "false" ^^^ {
      var newo = BehaviorFactory.eINSTANCE.createBooleanLiteral
      newo.setValue(false)
      newo
    } ) 
  private def fVoidLiteral : Parser[Expression] = ( "Void" ) ^^^ { BehaviorFactory.eINSTANCE.createVoidLiteral }
  private def fStringLiteral : Parser[Expression] = ( stringLit ^^ { case e => var newo =BehaviorFactory.eINSTANCE.createStringLiteral;newo.setValue(e.toString);newo  } )
  private def fNumericLiteral : Parser[Expression] = ( numericLit ^^ { case e => var newo =BehaviorFactory.eINSTANCE.createIntegerLiteral;newo.setValue(e.toInt);newo  } )

  def fCall : Parser[CallFeature] = ( 
    ident ^^ {
      case e =>
        var newo = BehaviorFactory.eINSTANCE.createCallFeature;
        newo.setName(e.toString);
        println(newo)
        newo
    } |||
    ident ~ "(" ~ callFeatureParams ~ ")" ^^^println("ICI") |||
    ident ~ callFeatureQualifiedName ^^ {
      case id1 ~ callF =>
        var newo = BehaviorFactory.eINSTANCE.createCallFeature;
        newo.setName(id1.toString)
        newo.setTarget(callF)
        println(newo)
        newo
    } |||
    ident ~ "(" ~ callFeatureParams ~ ")" ~ callFeatureQualifiedName
  ) ^^ {
    case e => BehaviorFactory.eINSTANCE.createCallFeature
      /*case id1 ~ qualName =>
       var newo = BehaviorFactory.eINSTANCE.createCallFeature
       id1 match {
       case "super" => {
       var newo = BehaviorFactory.eINSTANCE.createCallSuperOperation
       newo
       }
       //TODO
       case _ =>
       }
       newo*/
  }

  def callFeatureQualifiedName : Parser[CallFeature] =  "." ~ fCall ^^ {case _ ~ subcall => subcall }
  /*
   var newo = BehaviorFactory.eINSTANCE.createCallVariable
   BehaviorFactory.eINSTANCE.createC
   newo.setName(name)
   newo
   } ||| "." ~ ident ~ "(" ~ callFeatureParams ~ ")" ^^ { case _ ~ name ~ _ ~ params ~ _ =>
   var newo = BehaviorFactory.eINSTANCE.createCallFeature
   newo.setName(name)
   params match {
   case Some(_ @ p) => newo.getParameters.addAll(p)
   case None =>
   }
   newo
   }
   )**/
  private def callFeatureParams = ( fStatement ~ callFeatureParam ^^ { case stat ~statL => List(stat)++statL } )?
  private def callFeatureParam = (("," ~ fStatement ^^ { case delim ~ stat => stat } )*)

  def expr = (stringLit | ident )

}


