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
import java.io.File
import com.sun.mirror.apt.Filer
import scala.collection.JavaConversions._

object Art2ProvidedProxyGenerator {

  def generate(root:ContainerRoot,filer:Filer,ct: ART2ComponentType,ref:PortTypeRef) = {
    var portPackage = ct.getFactoryBean().substring(0, ct.getFactoryBean().lastIndexOf("."));
    var portName = ct.getName()+"PORTPROXY"+ref.getName();
    //var wrapper = filer.createSourceFile(portPackage+"."+portName);
    var wrapper = filer.createTextFile(com.sun.mirror.apt.Filer.Location.SOURCE_TREE, "", new File(portPackage.replace(".", "/")+"/"+portName+".scala"), "UTF-8");
    wrapper.append("package "+portPackage+";\n");
    wrapper.append("import org.kermeta.art2.framework.AbstractPort;\n");
    wrapper.append("import "+ref.getRef().getName()+";\n");
    wrapper.append("class "+portName+" extends AbstractPort with org.kermeta.art2.framework.MessagePort {\n");

    wrapper.append("var delegate : "+ref.getRef().getName()+" = null\n")
    wrapper.append("def getDelegate():"+ref.getRef().getName()+" = {delegate}\n")
    wrapper.append("def setDelegate(a : "+ref.getRef().getName()+")={delegate=a;}\n")


    wrapper.append("def process(o : java.lang.Object): Unit =  { o match { \n")

    ref.getRef match {
      case sPT : ServicePortType=> {
        wrapper.append("case opcall : org.kermeta.art2.framework.MethodCallMessage => opcall.getMethodName match {\n")
        sPT.getOperations.foreach{op=>

          wrapper.append("case \""+op.getName+"\"=> delegate."+op.getName+"(")

          op.getParameters.foreach{param=>
            wrapper.append("opcall.getParams.get(\""+param.getName+"\").asInstanceOf["+param.getType.getName+"]")

            if(op.getParameters.indexOf(param) != (op.getParameters.size-1)){
              wrapper.append(",")
            }
          }
          wrapper.append(")\n")
        }
        wrapper.append("case _ => println(\"uncatch message : \"+o) \n")
        wrapper.append("}\n")
      }
        
      case mPT : MessagePortType=> {
          wrapper.append("case msg => delegate.process(msg)\n")
        }
      case _=> 
    }
    wrapper.append("}}\n")
    wrapper.append("}\n");
    wrapper.close();
  }

}
