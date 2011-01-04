package org.kermeta.language.compiler.aspects

import org.kermeta.language.compiler.RichAspectImplicit._
import org.kermeta.language.compiler.UTilScala

trait TypeLiteralAspect extends ObjectAspect {
	 
    override def generateScalaCode(res : StringBuilder) : Unit = {
        if (this.getTyperef().getType.isInstanceOf[org.kermeta.language.structure.Class]){
            res.append("scalaUtil.Util.getMetaClass(\"")
            res.append(UTilScala.getQualifiedNameType(this.getTyperef().getType, "."))

        }else{
            res.append("_root_." + UTilScala.getQualifiedNameType(this.getTyperef().getType, "."))
        }
        //this.getTyperef().getType.generateScalaCode(res)
        if (this.getTyperef().getType.isInstanceOf[org.kermeta.language.structure.Class]){
            res.append("\")")
        }        
    }

    def generateScalaCodeForInstanceOf(res : StringBuilder) : Unit = {
//        res.append("scalaUtil.Util.getMetaClass(\"")
        this.getTyperef().getType.generateScalaCode(res)
        //       res.append("\")")

    }


}
 