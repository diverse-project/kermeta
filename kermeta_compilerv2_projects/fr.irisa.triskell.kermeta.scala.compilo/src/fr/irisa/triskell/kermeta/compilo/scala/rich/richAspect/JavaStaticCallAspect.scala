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

trait JavaStaticCallAspect extends RichAspectImplicit with ObjectAspect with LogAspect {

  override def generateScalaCode(res : StringBuilder) : Unit = {
      this.getOwnedTags.foreach{ tag =>
          if(tag.getName.contains("compiledJavaExtern")){
            res.append(tag.getValue)
          }

      }

  }
}
