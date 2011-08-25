package org.kermeta.compilo.scala.rich.richAspect

import org.kermeta.compilo.scala.rich._
import scala.collection.JavaConversions._
import org.kermeta.compilo.scala._
import org.kermeta.language._
import org.kermeta.language.structure._
import org.kermeta.language.behavior._
import org.kermeta.compilo.scala.rich.RichAspectImplicit._

trait CallTypeLiteralAspect extends KermetaModelElementAspect {

              override def generateScalaCode(res : StringBuilder) : Unit = {
      var singleton : scala.Boolean =false 
        if (this.getTyperef().getType.isInstanceOf[Class]){
         if (this.getTyperef().getType.asInstanceOf[Class]
             .getTypeDefinition.asInstanceOf[ClassDefinition].getIsSingleton != null)
           singleton=   this.getTyperef().getType.asInstanceOf[Class]
             .getTypeDefinition.asInstanceOf[ClassDefinition].getIsSingleton.booleanValue
          if (singleton)
           {
              res.append("_root_."+k2.utils.UTilScala.getQualifiedNameTypeJava(this.getTyperef().getType, "."))
           }else{
                res.append("scalaUtil.Util.getMetaClass(\"")
                res.append(k2.utils.UTilScala.getQualifiedNameTypeJava(this.getTyperef().getType, "."))
           }
        }else{
            res.append("_root_." + k2.utils.UTilScala.getQualifiedNameTypeJava(this.getTyperef().getType, "."))
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

    }/*

    override def generateScalaCode(res : StringBuilder) : Unit = {
        if (this.getTyperef().getType.isInstanceOf[Class]){
            res.append("scalaUtil.Util.getMetaClass(\"")
            res.append(_root_.k2.utils.UTilScala.getQualifiedNameTypeKermeta(this.getTyperef().getType, "."))

        }else{
            res.append("_root_." + _root_.k2.utils.UTilScala.getQualifiedNameTypeKermeta(this.getTyperef().getType, "."))
        }
        //this.getTyperef().getType.generateScalaCode(res)
        if (this.getTyperef().getType.isInstanceOf[Class]){
            res.append("\")")
        }        
    }

    def generateScalaCodeForInstanceOf(res : StringBuilder) : Unit = {
//        res.append("scalaUtil.Util.getMetaClass(\"")
        this.getTyperef().getType.generateScalaCode(res)
        //       res.append("\")")

    }    */


}
 