/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.MessagePortType
import org.kermeta.art2.PortTypeRef
import org.kermeta.art2.ServicePortType
import org.kermeta.art2.{ComponentType => ART2ComponentType }
import com.sun.mirror.apt.Filer
import java.io.File
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.aspects.Art2Aspects._

object Art2RequiredProxyGenerator {

  def generate(root:ContainerRoot,filer:Filer,ct: ART2ComponentType,ref:PortTypeRef) = {
    var portPackage = ct.getFactoryBean().substring(0, ct.getFactoryBean().lastIndexOf("."));
    var portName = ct.getName()+"PORTPROXY"+ref.getName();
    //var wrapper = filer.createSourceFile(portPackage+"."+portName);
    var wrapper = filer.createTextFile(com.sun.mirror.apt.Filer.Location.SOURCE_TREE, "", new File(portPackage.replace(".", "/")+"/"+portName+".scala"), "UTF-8");
    wrapper.append("package "+portPackage+";\n");
    wrapper.append("import org.kermeta.art2.framework.AbstractPort;\n");
    wrapper.append("import "+ref.getRef().getName()+";\n");
    wrapper.append("class "+portName+" extends AbstractPort with "+ref.getRef().getName()+" {\n");
    //wrapper.append("public "+portName+"(Object c){setComponent(c);}\n") /* AVOID CIRCULAR REFERENCE */

    wrapper.append("var delegate : org.kermeta.art2.framework.MessagePort = null\n")
    wrapper.append("def getDelegate():org.kermeta.art2.framework.MessagePort = {delegate}\n")
    wrapper.append("def setDelegate(a : org.kermeta.art2.framework.MessagePort)={delegate=a;}\n")

    ref.getRef match {
      case sPT : ServicePortType=> sPT.getOperations.foreach{op=>
          /* Convert void return type in unit */
          op.getReturnType.getName match {
            case "void" => op.getReturnType.setName("Unit")
            case _ =>
          }

          wrapper.append("def "+op.getName+"(")
          op.getParameters.foreach{param=>
            wrapper.append(param.getName+":"+param.getType.print('[',']'))
            if(op.getParameters.indexOf(param) != (op.getParameters.size-1)){
              wrapper.append(",")
            }
          }
          wrapper.append(") : "+op.getReturnType.print('[',']')+"={\n");
          wrapper.append("var msgcall = new org.kermeta.art2.framework.MethodCallMessage;\n")
          wrapper.append("msgcall.setMethodName(\""+op.getName+"\");\n")
          op.getParameters.foreach{param=>
            wrapper.append("msgcall.getParams.put(\""+param.getName+"\","+param.getName+");\n")
          }
          wrapper.append("delegate.process(msgcall);\n")
          wrapper.append("}\n")
        }
      case mPT : MessagePortType=> {
          wrapper.append("def process(o:Object):Unit={delegate.process(o);}\n")
      }
      case _=>
    }

    wrapper.append("}\n");
    wrapper.close();
  }

}
