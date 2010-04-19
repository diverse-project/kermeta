/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser


import scala.io.Source
import scala.util.parsing.combinator.syntactical.StandardTokenParsers
import fr.irisa.triskell.kermeta.language.structure._

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
  def packageDecl = ("package" ~ expr ~ ";" ^^ { case _ ~ p ~ _ => {
          var newp =StructureFactory.eINSTANCE.createPackage
          newp.setName(p)
          newp
        }})
  def importStmts = importStmt+
  def importStmt = ("require" ~ expr ^^ { case _ ~ e => println(e);e })
  def usingStmts = ("using" ~ ident ~ packageQualifiedName  )
  def packageQualifiedName =  ( "::" ~ ident )*
//def topLevelDecls = (topLevelDecl)
  def topLevelDecl : Parser[Any] = (annotations | annotableElement)+
  def annotations = ("@" ~ ident ~ stringLit )
  def annotableElement = (subPackageDecl | classDecl)// | modelTypeDecl | classDecl | enumDecl | dataTypeDecl )
  def subPackageDecl = ("package" ~ ident ~ "{" ~ (topLevelDeclOpt) ~ "}" )
  def topLevelDeclOpt = (topLevelDecl ?)
  /*def modelTypeDecl = ("")
   def classDecl = ("")
   def enumDecl = ("")
   def dataTypeDecl = ("")*/

  def classDecl = ( aspectModifier ~ abstractModifier ~ classKind ~ ident ~ "{" ~ classMemberDecls ~ "}" )
  // def classDecl = (aspectModifier)? (abstractModifier)? classKind ident"inherits" superTypes=typelst)? LCURLY classMemberDecls RCURLY;

  def classMemberDecls = (annotableClassMemberDecl+)
  def annotableClassMemberDecl = ( (annotations?) ~ classMemberDecl)
  def classMemberDecl = ( invariant | operation | property ) //attribute | reference | operation ;

  def invariant = ("inv" ~ expr )
  def operation = (operationKind ~ ident ~ "(" ~ ")" ~ ":" ~ ident ~ "is" ~ operationBody)
  def operationKind = ("operation" | "method")
  def property = ""
  def classKind = "class" //| "interface" ;
  def abstractModifier = ("abstract")?
  def aspectModifier = ("aspect")?

  def operationBody = (operationEmptyBody | operationExpressionBody)
  def operationEmptyBody = ("abstract")
  def operationExpressionBody = ( (annotations?) ~ fExpressionLst)

  def fExpressionLst = (fStatement+)
  def fStatement : Parser[Any] = (fBlock | fVariableDecl | fAssignement | fCall | fLiteral )//fLoop | fConditional | fRaiseException |  | fAssignement)
  /*
   *
   *def fLoop = ""
   def fConditional = ""
   def fRaiseException = ""
   */
  def fVariableDecl : Parser[Any] = ("var" ~ ident ~ ":" ~ ident ~ packageQualifiedName ^^ { case _ ~ id1 ~ _ ~ id2  => println("echo") }  )
  def fAssignement = ( ident ~ ":=" ~ fStatement)

  def fBlock = ("do" ~ fExpressionLst ~ (fRescueLst?) ~ "end")
  def fRescueLst = ident
  def fCall = (ident ~ callFeatureQualifiedName)

  def fLiteral = ( stringLit | fBooleanLiteral | numericLit | fVoidLiteral )
  def fBooleanLiteral = ("true" | "false")
  def fVoidLiteral = ( "Void" )
  def callFeatureQualifiedName =  ( "." ~ ident ||| "." ~ ident ~ "(" ~ callFeatureParams ~ ")" )*
  def callFeatureParams = ( fStatement ~ callFeatureParam )?
  def callFeatureParam = ("," ~ fStatement)*

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