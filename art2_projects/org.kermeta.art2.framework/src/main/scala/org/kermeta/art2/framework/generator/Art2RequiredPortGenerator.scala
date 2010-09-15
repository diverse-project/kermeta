/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.generator

import com.sun.mirror.apt.Filer
import java.io.File
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.MessagePortType
import org.kermeta.art2.PortTypeRef
import org.kermeta.art2.{ComponentType => ART2ComponentType }
import org.kermeta.art2.ServicePortType
import org.kermeta.art2.framework.aspects.Art2Aspects._
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._

object Art2RequiredPortGenerator {

  var logger = LoggerFactory.getLogger(this.getClass);

  def generate(root:ContainerRoot,filer:Filer,ct: ART2ComponentType,ref:PortTypeRef){
    var portPackage = ct.getFactoryBean().substring(0, ct.getFactoryBean().lastIndexOf("."));
    var portName = ct.getName()+"PORT"+ref.getName();
    var wrapper = filer.createTextFile(com.sun.mirror.apt.Filer.Location.SOURCE_TREE, "", new File(portPackage.replace(".", "/")+"/"+portName+".scala"), "UTF-8");

    wrapper.append("package "+portPackage+"\n");
    wrapper.append("import org.kermeta.art2.framework.port._\n");
    wrapper.append("import scala.{Unit=>void}\n")
    wrapper.append("class "+portName+"() extends "+ref.getRef().getName()+" with Art2RequiredPort {\n");

    wrapper.append("def getName : String = \""+ref.getName+"\"\n")

    ref.getRef match {
      case mPT : MessagePortType => {
          /* GENERATE METHOD MAPPING */
          wrapper.append("def process(o : Object) = {this ! o}\n")
          wrapper.append("def getInOut = false\n")
        }

      case sPT : ServicePortType=> {
          wrapper.append("def getInOut = true\n")
          /* CREATE INTERFACE ACTOR MOK */
          sPT.getOperations.foreach{op=>
            /* GENERATE METHOD SIGNATURE */
            wrapper.append("def "+op.getName+"(")
            op.getParameters.foreach{param=>
              wrapper.append(param.getName+":"+param.getType.print('[',']'))
              if(op.getParameters.indexOf(param) != (op.getParameters.size-1)){wrapper.append(",")}
            }
            wrapper.append(") : "+op.getReturnType.getName+" ={\n");

            /* Generate method corpus */
            /* CREATE MSG OP CALL */
            wrapper.append("var msgcall = new org.kermeta.art2.framework.MethodCallMessage\n")
            wrapper.append("msgcall.setMethodName(\""+op.getName+"\");\n")
            op.getParameters.foreach{param=>
              wrapper.append("msgcall.getParams.put(\""+param.getName+"\","+param.getName+");\n")
            }
            wrapper.append("this !? msgcall")
            wrapper.append("}\n")
          }
        }

    }

    wrapper.append("}\n");
    wrapper.close();
  }


}
