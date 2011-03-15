package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait CallTypeLiteralAspect extends ObjectAspect {
	 
    override def generateScalaCode(res : StringBuilder) : Unit = {
      var singleton : scala.Boolean =false
        if (this.getTyperef().getType.isInstanceOf[Class]){
         singleton=   this.getTyperef().getType.asInstanceOf[Class]
             .getTypeDefinition.asInstanceOf[ClassDefinition].getIsSingleton.booleanValue
          if (singleton)
           {
              res.append("_root_."+kermeta.utils.UTilScala.getQualifiedNameType(this.getTyperef().getType, "."))
           }else{
                res.append("scalaUtil.Util.getMetaClass(\"")
                res.append(kermeta.utils.UTilScala.getQualifiedNameType(this.getTyperef().getType, "."))
           }
        }else{
            res.append("_root_." + kermeta.utils.UTilScala.getQualifiedNameType(this.getTyperef().getType, "."))
        }
        //this.getTyperef().getType.generateScalaCode(res)
        if (this.getTyperef().getType.isInstanceOf[Class] && !singleton){
            res.append("\")")
        }        
    }

    def generateScalaCodeForInstanceOf(res : StringBuilder) : Unit = {
//        res.append("scalaUtil.Util.getMetaClass(\"")
        this.getTyperef().getType.generateScalaCode(res)
        //       res.append("\")")

    }


}
 