/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import art2.ContainerRoot
import art2.ServicePortType
import com.sun.mirror.apt.Filer
import scala.collection.JavaConversions._

object Art2Generator {

  /* GENERATE FACTORY FOR COMPONENT & PORT  */
  def generateFactory(root:ContainerRoot,filer:Filer){
    root.getComponentTypes.foreach{ct=>
      var componentPackage = ct.getFactoryBean().substring(0, ct.getFactoryBean().lastIndexOf("."));
      var factoryName = ct.getFactoryBean.substring(ct.getFactoryBean.lastIndexOf(".")+1)
      var componentBean = ct.getFactoryBean.substring(0, ct.getFactoryBean.indexOf("Factory"))
      var wrapper = filer.createSourceFile(ct.getFactoryBean);
      wrapper.append("package "+componentPackage+";\n");
      wrapper.append("public class "+factoryName+"{\n")
      wrapper.append("public static "+componentBean+" create"+ct.getName+"(){"+"return new "+componentBean+"();}\n")
      ct.getProvided.foreach{ref=>
        var portName = ct.getName()+"PORT"+ref.getName();
        wrapper.append("public static "+portName+" create"+portName+"(){ return new "+portName+"();}\n")
      }
      wrapper.append("}\n")
      wrapper.close
    }
  }

  /* GENERATE WRAPPER FOR DECLARATIF PORT */
  def generatePortWrapper(root:ContainerRoot,filer:Filer){
    root.getComponentTypes.foreach{ct=>
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
                wrapper.append(param.getType.getName+" "+param.getName) 
                if(op.getParameters.indexOf(param) != (op.getParameters.size-1)){
                  wrapper.append(",")
                }
              }
              wrapper.append("){\n");
              if(!op.getReturnType.getName.equals("void")) { wrapper.append("return ") }
              wrapper.append("(("+ct.getFactoryBean.substring(0, ct.getFactoryBean.indexOf("Factory"))+")getComponent()).")

              wrapper.append(ref.getMappings.find(map=>{map.getServiceMethodName.equals(op.getName)}).get.getBeanMethodName+"(")
              op.getParameters.foreach{param=>
                wrapper.append(param.getName)
                if(op.getParameters.indexOf(param) != (op.getParameters.size-1)){
                  wrapper.append(",")
                }
              }
              wrapper.append(");}\n")
            }
          case _=> //TODO MESSAGE PORT
        }

        wrapper.append("}\n");
        wrapper.close();
      }

    }


  }

}
