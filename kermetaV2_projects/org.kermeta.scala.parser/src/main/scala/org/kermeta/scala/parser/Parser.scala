
package org.kermeta.scala.parser

import scala.io.Source
import scala.util.parsing.combinator.syntactical.StandardTokenParsers
import fr.irisa.triskell.kermeta.language.structure._
import fr.irisa.triskell.kermeta.language.behavior._

object Parser extends StandardTokenParsers {
  lexical.reserved += ("package","require","using","class","aspect","abstract","inv","operation","method","is","do","end","var")
  lexical.delimiters += ("=",";","::","@","{","}","(",")",":",":=",".",",")

  def parse : Unit = {

    val input = Source.fromFile(new java.io.File("sample.kmt")).getLines("\n").reduceLeft[String](_ + '\n' + _)
    val tokens = new lexical.Scanner(input)
    val result = phrase(program)(tokens)

    result match {
      case Success(tree, _) => new Interpreter(tree).run()
      case e: NoSuccess => {
          Console.err.println(e)
          exit(100)
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

      //TODO remplir class definition
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
  def operation = operationKind ~ ident ~ "(" ~ ")" ~ ":" ~ ident ~ "is" ~ operationBody ^^ { case opkind ~ opName ~ _ ~ _  ~ _ ~ id2 ~ _ ~ body =>
      var newo =StructureFactory.eINSTANCE.createOperation

      opkind match {
        case "operation" => println("oper")
        case "method" => println("method")
      }
      newo.setName(opName)
      newo
  }
  def operationKind = ("operation" | "method")
  def property = ""
  def abstractModifier = ("abstract")?
  def aspectModifier = ("aspect")?

  def operationBody = (operationEmptyBody | operationExpressionBody)
  def operationEmptyBody = ("abstract")
  def operationExpressionBody = ( (annotation?) ~ fExpressionLst)

  def fExpressionLst = (fStatement+)
  def fStatement : Parser[Any] = (fBlock | fVariableDecl | fAssignement | fCall | fLiteral )//fLoop | fConditional | fRaiseException |  | fAssignement)
  /*
   *
   *def fLoop = ""
   def fConditional = ""
   def fRaiseException = ""
   */
  def fVariableDecl : Parser[Any] = "var" ~> ident ~ ":" ~ ident ~ packageQualifiedName ^^ { case id1 ~ _ ~ id2 ~ id3  =>
      var newo = BehaviorFactory.eINSTANCE.createVariableDecl
      newo.setIdentifier(id1.toString)
      newo
  }
  def fAssignement = ( ident ~ ":=" ~ fStatement) ^^ { case id ~ _ ~ statment =>
      var newo = BehaviorFactory.eINSTANCE.createAssignment
      //newo.setTarget(ident)
      //newo.setValue(fStatement)
      newo
  }

  def fBlock = "do" ~> fExpressionLst ~ (fRescueLst?) <~ "end" ^^ { case expL ~ rescueL =>
      var newo = BehaviorFactory.eINSTANCE.createBlock
      
      newo
  }
  def fRescueLst = ident
  def fCall : Parser[Expression] = (ident ~ callFeatureQualifiedName) ^^ { case id1 ~ qualName =>
      var newo = BehaviorFactory.eINSTANCE.createCallFeature
      id1 match {
        case "super" => {
            var newo = BehaviorFactory.eINSTANCE.createCallSuperOperation
        }
        case _ => 
      }
      newo
  }

  def fLiteral = ( stringLit | fBooleanLiteral | numericLit | fVoidLiteral )
  def fBooleanLiteral = ("true" | "false")
  def fVoidLiteral = ( "Void" ) ^^^ {BehaviorFactory.eINSTANCE.createVoidLiteral}
  def callFeatureQualifiedName =  ( "." ~ ident ||| "." ~ ident ~ "(" ~ callFeatureParams ~ ")" )*
  def callFeatureParams = ( fStatement ~ callFeatureParam )?
  def callFeatureParam = (("," ~ fStatement)*)  ^^^ println("PARAM")

  def expr = (stringLit | ident )

  /*

   def stmt: Parser[Statement] = ( "print" ~ expr ^^ { case _ ~ e => Print(e) }
   | "space" ^^^ Space()
   | "repeat" ~ numericLit ~ (stmt+) ~ "next" ^^ {
   case _ ~ times ~ stmts ~ _ => Repeat(times.toInt, stmts)
   }
   | "let" ~ ident ~ "=" ~ expr ^^ { case _ ~ id ~ _ ~ e => Let(id, e) } )

   def expr = ( "HELLO" ^^^ Hello()
   | "GOODBYE" ^^^ Goodbye()
   | stringLit ^^ { case s => Literal(s) }
   | numericLit ^^ { case s => Literal(s) }
   | ident ^^ { case id => Variable(id) } )

   */
}

class Interpreter(tree: List[_]) {
  def run() {
    walkTree(tree)
  }
  private def walkTree(tree: List[_]) {
    tree match {
      case e :: rest => {println(e.toString);walkTree(rest)  }
      case Nil =>
    }
  }

}


