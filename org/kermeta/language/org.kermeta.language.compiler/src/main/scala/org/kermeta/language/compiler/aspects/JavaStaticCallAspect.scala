/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.language.compiler.aspects

import scala.collection.JavaConversions._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.language.compiler.RichAspectImplicit._

trait JavaStaticCallAspect extends ObjectAspect with LogAspect {

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
      this.getOwnedTags.foreach{ tag =>
            println("extern call"+tag.getName+" "+tag.getValue)
          if(tag.getName.contains("compiledJavaExtern")){
            res.append(tag.getValue)
          }

      }*/

  }
}
