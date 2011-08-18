/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait JavaStaticCallAspect extends KermetaModelElementAspect with LogAspect {

  override def generateScalaCode(res : StringBuilder) : Unit = {

res.append(this.getJclass.replace("::", ".")+"."+this.getJmethod+"(")
var i = 0
this.getParameters.foreach{par=>
if(i != 0){res append ","}
par.generateScalaCode(res)
i = i + 1
}
res.append(")")


      /*
      this.getKOwnedTags.foreach{ tag =>
            println("extern call"+tag.getName+" "+tag.getValue)
          if(tag.getName.contains("compiledJavaExtern")){
            res.append(tag.getValue)
          }

      }*/

  }
}
