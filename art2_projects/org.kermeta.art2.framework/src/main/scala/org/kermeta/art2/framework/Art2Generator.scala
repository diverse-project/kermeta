/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import art2.ContainerRoot
import art2.MessagePortType
import art2.ServicePortType
import com.sun.mirror.apt.Filer
import java.io.File
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
        var portNameProxy = ct.getName()+"PORTPROXY"+ref.getName();
        wrapper.append("public static "+portName+" create"+portName+"(){ return new "+portName+"();}\n")
        wrapper.append("public static "+portNameProxy+" create"+portNameProxy+"(){ return new "+portNameProxy+"();}\n")
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
  def generatePortProxy(root:ContainerRoot,filer:Filer){
    root.getComponentTypes.foreach{ct=>
      ct.getProvided.foreach{ref=>
        var portPackage = ct.getFactoryBean().substring(0, ct.getFactoryBean().lastIndexOf("."));
        var portName = ct.getName()+"PORTPROXY"+ref.getName();
        //var wrapper = filer.createSourceFile(portPackage+"."+portName);
        var wrapper = filer.createTextFile(com.sun.mirror.apt.Filer.Location.SOURCE_TREE, "", new File(portPackage.replace(".", "/")+"/"+portName+".scala"), "UTF-8");
        wrapper.append("package "+portPackage+";\n");
        wrapper.append("import org.kermeta.art2.framework.AbstractPort;\n");
        wrapper.append("import "+ref.getRef().getName()+";\n");
        wrapper.append("import scala.actors.Actor;\n");
        wrapper.append("class "+portName+" extends AbstractPort with "+ref.getRef().getName()+" {\n");
        //wrapper.append("public "+portName+"(Object c){setComponent(c);}\n") /* AVOID CIRCULAR REFERENCE */

        wrapper.append("var delegate : Actor = null\n")

        ref.getRef match {
          case sPT : ServicePortType=> sPT.getOperations.foreach{op=>
              /* Convert void return type in unit */
              op.getReturnType.getName match {
                case "void" => op.getReturnType.setName("Unit")
                case _ =>
              }

              /* GENERATE CASE CLASS */
              wrapper.append("case class CALLMSG"+op.getName+"(")
              op.getParameters.foreach{param=>
                wrapper.append(param.getName+":"+param.getType.getName)
                if(op.getParameters.indexOf(param) != (op.getParameters.size-1)){
                  wrapper.append(",")
                }
              }
              wrapper.append(")\n")


              wrapper.append("def "+op.getName+"(")
              op.getParameters.foreach{param=>
                wrapper.append(param.getName+":"+param.getType.getName)
                if(op.getParameters.indexOf(param) != (op.getParameters.size-1)){
                  wrapper.append(",")
                }
              }
              wrapper.append(") : "+op.getReturnType.getName+"={\n");
              wrapper.append("delegate ! CALLMSG"+op.getName+"(")
              op.getParameters.foreach{param=>
                wrapper.append(param.getName)
                if(op.getParameters.indexOf(param) != (op.getParameters.size-1)){
                  wrapper.append(",")
                }
              }
              wrapper.append(")}\n")
            }
          case mPT : MessagePortType=> {
              wrapper.append("def process(o:Object):Unit={delegate ! o}\n")
          }
          case _=> //TODO MESSAGE PORT
        }

        wrapper.append("}\n");
        wrapper.close();
      }
    }


  }

}
