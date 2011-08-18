package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala._
import _root_.java.util._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait CallEnumLiteralAspect extends CallExpressionAspect with LogAspect {








  def generateName(res: StringBuilder) {
    res.append(this.getStaticEnumLiteral.getName())
  }


  override def generateScalaCode(res: StringBuilder): Unit = {
          res.append(this.getStaticEnumLiteral.getEnumeration.getQualifiedNameCompilo)
    res.append(".");
    if (Util.hasEcoreTag(this.getStaticEnumLiteral.getEnumeration)) {
      var res1: StringBuilder = new StringBuilder
      generateName(res1)
      res.append("getByName(\"" + res1.toString + "\")")
    } else {
      generateName(res)
    }


  }


}
