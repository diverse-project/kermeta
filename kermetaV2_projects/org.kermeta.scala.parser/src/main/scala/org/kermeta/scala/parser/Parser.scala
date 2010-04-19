/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.scala.parser


import scala.io.Source
import scala.util.parsing.combinator.syntactical.StandardTokenParsers
import fr.irisa.triskell.kermeta.language.structure._

object Parser extends StandardTokenParsers {

  lexical.reserved += ("package","require","using")
  lexical.delimiters += ("=",";","::","@","{","}")

  def parse : Unit = {


//println(new java.io.File("input.talk").toURI)
    // val input = Source.fromFile(new java.io.File("input.talk"),1024).getLines("\n").mkString("\n")
    val input = Source.fromFile(new java.io.File("sample.kmt")).getLines("\n").reduceLeft[String](_ + '\n' + _)
//println(input)
    //println("input="+input)

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
  def annotations = ("@" ~ ident ~ "=" ~ stringLit )
  def annotableElement = (subPackageDecl)// | modelTypeDecl | classDecl | enumDecl | dataTypeDecl )
  def subPackageDecl = ("package" ~ ident ~ "{" ~ (topLevelDeclOpt) ~ "}" )
  def topLevelDeclOpt = (topLevelDecl ?)
  /*def modelTypeDecl = ("")
   def classDecl = ("")
   def enumDecl = ("")
   def dataTypeDecl = ("")*/


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
    //TOO
    walkTree(tree)
  }
  private def walkTree(tree: List[_]) {
    tree match {
      case e :: rest => {println(e.toString);walkTree(rest)  }
      case Nil =>
    }
  }

}


sealed abstract class Statement