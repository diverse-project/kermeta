/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */

package org.kermeta.art2.framework.generator

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.MessagePortType
import org.kermeta.art2.ServicePortType
import com.sun.mirror.apt.AnnotationProcessorEnvironment
import com.sun.mirror.apt.Filer
import scala.collection.JavaConversions._
import org.kermeta.art2.ComponentType
import org.kermeta.art2.framework.aspects.Art2Aspects._

object Art2Generator {

  def generateLibURI(env:AnnotationProcessorEnvironment) = {
    "file://" + env.getOptions.find({op => op._1.contains("art2.lib.target")}).getOrElse{("key=","")}._1.split('=').toList.get(1)
  }

  /* GENERATE WRAPPER FOR DECLARATIF PORT */
  def generatePortWrapper(root:ContainerRoot,filer:Filer){
    root.getTypeDefinitions.filter(p=> p.isInstanceOf[ComponentType]).foreach{ctt=> var ct = ctt.asInstanceOf[ComponentType]
      ct.getProvided.foreach{ref=>
        var portPackage = ct.getFactoryBean().substring(0, ct.getFactoryBean().lastIndexOf("."));
        var portName = ct.getName()+"PORT"+ref.getName();
        var wrapper = filer.createSourceFile(portPackage+"."+portName);
        wrapper.append("package "+portPackage+";\n");
        wrapper.append("import org.kermeta.art2.framework.AbstractPort;\n");
        wrapper.append("import "+ref.getRef().getName()+";\n");
        wrapper.append("public class "+portName+" extends AbstractPort implements "+ref.getRef().getName()+" {\n");
        //wrapper.append("public "+portName+"(Object c){setComponent(c);}\n") /* AVOID CIRCULAR REFERENCE */
        ref.getRef match {
          case sPT : ServicePortType=> sPT.getOperations.foreach{op=>
              wrapper.append("public "+op.getReturnType.getName+" "+op.getName+"(")
              op.getParameters.foreach{param=>
                wrapper.append(param.getType.print('<','>')+" "+param.getName)
                if(op.getParameters.indexOf(param) != (op.getParameters.size-1)){
                  wrapper.append(",")
                }
              }
              wrapper.append("){\n");
              if(!op.getReturnType.getName.equals("void")) { wrapper.append("return ") }
              wrapper.append("(("+ct.getFactoryBean.substring(0, ct.getFactoryBean.indexOf("Factory"))+")getComponent()).")

              ref.getMappings.find(map=>{map.getServiceMethodName.equals(op.getName)}) match {
                case Some(mapping)=>wrapper.append(mapping.getBeanMethodName+"(")
                case None => println("WARNING METHOD NOT MAP "+op.getName)
              }

              //wrapper.append(ref.getMappings.find(map=>{map.getServiceMethodName.equals(op.getName)}).get.getBeanMethodName+"(")
              op.getParameters.foreach{param=>
                wrapper.append(param.getName)
                if(op.getParameters.indexOf(param) != (op.getParameters.size-1)){
                  wrapper.append(",")
                }
              }
              wrapper.append(");}\n")
            }
          case mPT : MessagePortType => {
              ref.getMappings.find(map=>{map.getServiceMethodName.equals("process")}) match {
                case Some(mapping)=>{
                    wrapper.append("public void process(Object o){\n")
                    wrapper.append("(("+ct.getFactoryBean.substring(0, ct.getFactoryBean.indexOf("Factory"))+")getComponent()).")
                    wrapper.append(mapping.getBeanMethodName+"(o);\n")
                    wrapper.append("}\n")
                  }
                case None => println("WARNING METHOD NOT MAP process")
              }
            }
          case _=> //TODO MESSAGE PORT
        }

        wrapper.append("}\n");
        wrapper.close();
      }
    }
  }
    
  /*  */


  def generatePort(root:ContainerRoot,filer:Filer){
    root.getTypeDefinitions.filter(p=> p.isInstanceOf[ComponentType]).foreach{ctt=> var ct = ctt.asInstanceOf[ComponentType]
      ct.getProvided.foreach{ref=> Art2ProvidedPortGenerator.generate(root, filer, ct, ref)  }
      //ct.getProvided.foreach{ref=> Art2ProvidedProxyGenerator.generate(root, filer, ct, ref)  }
      ct.getRequired.foreach{ref=> Art2RequiredPortGenerator.generate(root, filer, ct, ref)  }
    }
  }


}
