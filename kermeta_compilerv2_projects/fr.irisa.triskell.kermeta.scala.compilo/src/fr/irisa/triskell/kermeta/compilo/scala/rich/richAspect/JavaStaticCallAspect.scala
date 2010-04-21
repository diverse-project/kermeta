/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.rich.RichAspectImplicit._

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
