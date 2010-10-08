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
import org.kermeta.art2.framework.Constants
import org.kermeta.art2.framework.aspects.Art2Aspects._
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._

object Art2ProvidedPortGenerator {

  var logger = LoggerFactory.getLogger(this.getClass);

  def generate(root:ContainerRoot,filer:Filer,ct: ART2ComponentType,ref:PortTypeRef){
    var portPackage = ct.getFactoryBean().substring(0, ct.getFactoryBean().lastIndexOf("."));
    var portName = ct.getName()+"PORT"+ref.getName();

    var wrapper = filer.createTextFile(com.sun.mirror.apt.Filer.Location.SOURCE_TREE, "", new File(portPackage.replace(".", "/")+"/"+portName+".scala"), "UTF-8");

    wrapper.append("package "+portPackage+"\n");
    wrapper.append("import org.kermeta.art2.framework.port._\n");
    wrapper.append("import scala.{Unit=>void}\n")
    wrapper.append("class "+portName+"(component : "+ct.getName+") extends "+ref.getRef().getName()+" with Art2ProvidedPort {\n");

    wrapper.append("def getName : String = \""+ref.getName+"\"\n")

    ref.getRef match {
      case mPT : MessagePortType => {
          /* GENERATE METHOD MAPPING */
          wrapper.append("def process(o : Object) = {this ! o}\n")

          ref.getMappings.find(map=>{map.getServiceMethodName.equals(Constants.ART2_MESSAGEPORT_DEFAULTMETHOD)}) match {
            case Some(mapping)=>{
                /* GENERATE LOOP */
                wrapper.append("override def internal_process(msg : Any)=msg match {\n")
                /* CALL MAPPED METHOD */
                wrapper.append("case _ @ msg => component.")
                wrapper.append(mapping.getBeanMethodName+"(msg)\n")
                wrapper.append("}\n")
              }
            case None => logger.error("Error method mapping not found ");System.exit(1)
          }
        }

      case sPT : ServicePortType=> {
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
          /* CREATE ACTOR LOOP */
           wrapper.append("override def internal_process(msg : Any)=msg match {\n")
          wrapper.append("case opcall : org.kermeta.art2.framework.MethodCallMessage => reply(opcall.getMethodName match {\n")
          sPT.getOperations.foreach{op=>
            /* FOUND METHOD MAPPING */
            ref.getMappings.find(map=>{map.getServiceMethodName.equals(op.getName)}) match {
              case Some(mapping)=> {
                  wrapper.append("case \""+op.getName+"\"=> component."+mapping.getBeanMethodName+"(")
                  op.getParameters.foreach{param=>
                    wrapper.append("opcall.getParams.get(\""+param.getName+"\").asInstanceOf["+param.getType.print('[',']')+"]")
                    if(op.getParameters.indexOf(param) != (op.getParameters.size-1)){wrapper.append(",")}
                  }
                  wrapper.append(")\n")

                }
              case None => logger.error("Error method mapping not found ");System.exit(1)
            }
          }
          wrapper.append("case _ @ o => println(\"uncatch message , method not found in service declaration : \"+o);null \n")
          wrapper.append("})}\n")
        }

    }

    wrapper.append("}\n");
    wrapper.close();
  }

}
