/* $Id: Runner.scala 13986 2011-01-04 08:05:10Z francoisfouquet $
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.language.loader.kmt.scala.internal.parser

import org.kermeta.language.loader.kmt.scala.internal.lexer.KMLexer
import scala.io.Source
import java.lang.StringBuffer
import org.kermeta.language.loader.kmt.scala.internal.printer.PrettyPrinter

/**
 * test operation for loading a kmt, parse and save it in the xmi file 
 *
 */
object Runner {

  def main(args: Array[String]): Unit = {

    val input = Source.fromFile(new java.io.File("bug2.kmt")).getLines().reduceLeft[String](_ + '\n' + _)


    //  val input = Source.fromFile(new java.io.File("022_testExpression.kmt")).getLines().reduceLeft[String](_ + '\n' + _)
    //val input = Source.fromFile(new java.io.File("callExpr.kmt")).getLines().reduceLeft[String](_ + '\n' + _)
    //val input = Source.fromFile(new java.io.File("expressionBloc.kmt")).getLines().reduceLeft[String](_ + '\n' + _)
    //val input = Source.fromFile(new java.io.File("LambdaExpression_CollectionEach_501.kmt")).getLines().reduceLeft[String](_ + '\n' + _)
    //val input = Source.fromFile(new java.io.File("io.kmt")).getLines().reduceLeft[String](_ + '\n' + _)


    var lexResult = new KMLexer(input)

    //    while(!lexResult.atEnd){
    //     println(lexResult.nextToken)
    //   }

    val parser = new KParser()


    val result = parser.parse(input)
    // var result = new KParser().parseExpression(input)
    // var result = org.kermeta.language.POC.test(input)

    result match {
      //case Some(_ @ res )=> println(res)
      //case Some(_ @ res) => LoadSaveKM.saveKmModelingUnit("parsed.km", res) //new Interpreter(res).run
      case Some(_@res) => {
        LoadSaveKM.saveKmModelingUnit("parsed.km", res)

        val buffer = new StringBuffer()
        PrettyPrinter.print(res, buffer)
        println(buffer.toString)

      }
      case None => println(parser.lastNoSucess)
    }
  }
}
