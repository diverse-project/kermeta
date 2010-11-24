/* $Id$
 * Project : org.kermeta.language.loader.scalaKMT
 * License : EPL
 * Copyright : IRISA / INRIA/ Universite de Rennes 1
 * ----------------------------------------------------------------------------
 * Creation date : 2010
 * Authors : 
 * 		Francois Fouquet <ffouquet@irisa.fr>
 */

package org.kermeta.scala.parser

import org.kermeta.language.lexer.KMLexer
import scala.io.Source

/**
 * test operation for loading a kmt, parse and save it in the xmi file 
 *
 */
object Runner{

  def main(args: Array[String]): Unit = {
    val input = Source.fromFile(new java.io.File("022_testExpression.kmt")).getLines().reduceLeft[String](_ + '\n' + _)
   //val input = Source.fromFile(new java.io.File("callExpr.kmt")).getLines().reduceLeft[String](_ + '\n' + _)
   //val input = Source.fromFile(new java.io.File("expressionBloc.kmt")).getLines().reduceLeft[String](_ + '\n' + _)
//val input = Source.fromFile(new java.io.File("LambdaExpression_CollectionEach_501.kmt")).getLines().reduceLeft[String](_ + '\n' + _)
//val input = Source.fromFile(new java.io.File("io.kmt")).getLines().reduceLeft[String](_ + '\n' + _)



    var lexResult = new KMLexer(input)

//    while(!lexResult.atEnd){
 //     println(lexResult.nextToken)
 //   }


    var result = new KParser().parse(input)
   // var result = new KParser().parseExpression(input)
    // var result = org.kermeta.language.POC.test(input)
    
    result match {
      //case Some(_ @ res )=> println(res)
      //case Some(_ @ res) => LoadSaveKM.saveKmModelingUnit("parsed.km", res) //new Interpreter(res).run
      case Some(_ @ res) =>{
          LoadSaveKM.saveKmModelingUnit("parsed.km", res)
        }
      case None =>
    }
  }
}
