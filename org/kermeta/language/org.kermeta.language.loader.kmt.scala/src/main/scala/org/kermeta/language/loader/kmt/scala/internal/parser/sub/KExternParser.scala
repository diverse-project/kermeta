/**
 * Created by IntelliJ IDEA.
 * User: jfalcou
 * Date: 08/02/12
 * Time: 14:50
 * To change this template use File | Settings | File Templates.
 */

package org.kermeta.language.loader.kmt.scala.internal.parser.sub

import org.kermeta.language.behavior.{BehaviorFactory, Expression}

trait KExternParser extends KAbstractParser {

    def fExtern : Parser[Expression] = "extern" ~ packageName ~ "." ~ ident ~ "(" ~ repsep(fStatement, ",")  ~ ")" ^^ { case _ ~ pName ~ _ ~ fName ~ _ ~ params ~ _ =>
      var newo = BehaviorFactory.eINSTANCE.createJavaStaticCall()
      println("found an extern call !!")

      newo.setJclass(pName)
      newo.setJmethod(fName)

      params.foreach{ par =>
        newo.getParameters.add(par)
      }


      newo
    }

  def fExternTest : Parser[Expression] = "extern" ^^ { case _  =>
    var newo = BehaviorFactory.eINSTANCE.createJavaStaticCall()
    println("found an extern call !!")
    newo
  }


}