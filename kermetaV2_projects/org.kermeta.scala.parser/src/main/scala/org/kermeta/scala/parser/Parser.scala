
package org.kermeta.scala.parser

import scala.util.parsing.combinator.syntactical.StandardTokenParsers
import fr.irisa.triskell.kermeta.language.structure._
import fr.irisa.triskell.kermeta.language.behavior._
import scala.collection.JavaConversions._

object Parser extends StandardTokenParsers {
  lexical.reserved += ("package","require","using","class","aspect","abstract","inv","operation","method","is","do","end","var")
  lexical.delimiters += ("=",";","::","@","{","}","(",")",":",":=",".",",")

  def parse(content : String) : Option[List[Any]] = {
    val tokens = new lexical.Scanner(content)
    val result : ParseResult[List[Any]] = phrase(program)(tokens)
    result match {
      case Success(tree, _) => {Some(tree) }
      case e: NoSuccess => {
          Console.err.println(e)
          exit(100)
          None
        }
    }
  }

  def program = scompUnit+
  def scompUnit = (packageDecl|importStmts|usingStmts|topLevelDecl)
  def packageDecl = "package" ~ expr ~ ";" ^^ { case _ ~ p ~ _ => {
        var newp =StructureFactory.eINSTANCE.createPackage
        newp.setName(p)
        newp
      }}
  def importStmts = importStmt+
  def importStmt = "require" <~ expr ^^ { case e =>
      var newo =StructureFactory.eINSTANCE.createRequire
      newo.setUri(e.toString)
      newo
  }
  def usingStmts = "using" ~> ident ~ packageQualifiedName ^^ { case id ~ name =>
      var newo =StructureFactory.eINSTANCE.createUsing
      newo.setQualifiedName(id.toString+"::"+name.toString)
  }
  def packageQualifiedName =  ( "::" ~ ident )*
//def topLevelDecls = (topLevelDecl)
  def topLevelDecl : Parser[Any] = (annotation | annotableElement)+
  private def annotation : Parser[Tag] = "@" ~> ident ~ stringLit ^^ { case id1 ~ st1 =>
      var newo =StructureFactory.eINSTANCE.createTag
      newo.setName(id1.toString)
      newo.setValue(st1.toString)
      newo
  }
  def annotableElement = (subPackageDecl | classDecl)// | modelTypeDecl | classDecl | enumDecl | dataTypeDecl )
  def subPackageDecl = ("package" ~> ident <~ "{" ~ (topLevelDeclOpt) ~ "}" )
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
        case "operation" => println("oper")
        case "method" => println("method")
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
      //TODO FAIRE UN SET DE TYPE PROXY

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
  def fCall : Parser[CallFeature] = (ident ~ callFeatureQualifiedName) ^^ { case id1 ~ qualName =>
      var newo = BehaviorFactory.eINSTANCE.createCallFeature
      id1 match {
        case "super" => {
            var newo = BehaviorFactory.eINSTANCE.createCallSuperOperation
            newo
          }
          //TODO
        case _ => 
      }
      newo
  }

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

  def callFeatureQualifiedName =  ( "." ~ ident ^^ {case _ ~ name =>
        var newo = BehaviorFactory.eINSTANCE.createCallVariable
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
  )*
  private def callFeatureParams = ( fStatement ~ callFeatureParam ^^ { case stat ~statL => List(stat)++statL } )?
  private def callFeatureParam = (("," ~ fStatement ^^ { case delim ~ stat => stat } )*)

  def expr = (stringLit | ident )

}


