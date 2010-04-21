package fr.irisa.triskell.kermeta.compilo.scala.rich.richAspect

import fr.irisa.triskell.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import fr.irisa.triskell.kermeta.compilo.scala._
import fr.irisa.triskell.kermeta.language._
import fr.irisa.triskell.kermeta.language.structure._ 
import fr.irisa.triskell.kermeta.language.behavior._
import fr.irisa.triskell.kermeta.compilo.scala.rich.RichAspectImplicit._

trait TypeLiteralAspect extends ObjectAspect {
	 
    override def generateScalaCode(res : StringBuilder) : Unit = {
        if (this.getTyperef().getType.isInstanceOf[Class]){
            res.append("scalaUtil.Util.getMetaClass(\"")
        }
        this.getTyperef().getType.generateScalaCode(res)
        if (this.getTyperef().getType.isInstanceOf[Class]){
            res.append("\")")
        }        
    }

    def generateScalaCodeForInstanceOf(res : StringBuilder) : Unit = {
//        res.append("scalaUtil.Util.getMetaClass(\"")
        this.getTyperef().getType.generateScalaCode(res)
        //       res.append("\")")

    }


}
 