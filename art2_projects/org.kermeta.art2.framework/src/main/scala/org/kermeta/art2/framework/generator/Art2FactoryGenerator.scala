/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.generator

import com.sun.mirror.apt.Filer
import java.io.File
import org.kermeta.art2.ContainerRoot
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._
import org.kermeta.art2.ChannelType
import org.kermeta.art2.ComponentType
import org.kermeta.art2.framework.aspects.Art2Aspects._

object Art2FactoryGenerator {

  var logger = LoggerFactory.getLogger(this.getClass);

  /* GENERATE FACTORY FOR COMPONENT & PORT  */
  def generateFactory(root:ContainerRoot,filer:Filer){

    /* STEP COMPONENT TYPE DEFINITION */
    root.getTypeDefinitions.filter(p=> p.isInstanceOf[ComponentType]).foreach{ctt=>
      var ct = ctt.asInstanceOf[ComponentType]
      var componentPackage = ct.getFactoryBean().substring(0, ct.getFactoryBean().lastIndexOf("."));
      var factoryName = ct.getFactoryBean.substring(ct.getFactoryBean.lastIndexOf(".")+1)
      var componentBean = ct.getFactoryBean.substring(0, ct.getFactoryBean.indexOf("Factory"))
      var wrapper = filer.createTextFile(com.sun.mirror.apt.Filer.Location.SOURCE_TREE, "", new File(componentPackage.replace(".", "/")+"/"+factoryName+".scala"), "UTF-8");

      //var wrapper = filer.createSourceFile(ct.getFactoryBean);
      wrapper.append("package "+componentPackage+"\n");
      wrapper.append("import org.kermeta.art2.framework._\n")
      wrapper.append("object "+factoryName+"{\n")

      /* create Component Actor */
      wrapper.append("def createComponentActor() : Art2Component = {\n")
      wrapper.append("new Art2Component(create"+ct.getName+"()){")

      if(ct.getStartMethod == null){
        error("Start method is mandatory for component name => "+ct.getName);System.exit(1)
      }
      if( ct.getStopMethod == null){
        logger.error("Stop method is mandatory for component name => "+ct.getName);System.exit(1)
      }
      wrapper.append("def startComponent(){getArt2ComponentType.asInstanceOf["+componentBean+"]."+ct.getStartMethod+"()}\n")
      wrapper.append("def stopComponent(){getArt2ComponentType.asInstanceOf["+componentBean+"]."+ct.getStopMethod+"()}\n")
      wrapper.append("}}\n")

      /* create Component */
      wrapper.append("def "+"create"+ct.getName+"() : "+componentBean+" ={\n")
      wrapper.append("var newcomponent = new "+componentBean+"();\n")
      /* INJECT HOSTED PORT */
      ct.getProvided.foreach{ref=>
        var portName = ct.getName()+"PORT"+ref.getName();
        wrapper.append("newcomponent.getHostedPorts().put(\""+ref.getName()+"\",create"+portName+"(newcomponent))\n")
      }
      ct.getRequired.foreach{ref=>
        var portName = ct.getName()+"PORT"+ref.getName();
        wrapper.append("newcomponent.getNeededPorts().put(\""+ref.getName()+"\",create"+portName+"())\n")
      }
      wrapper.append("newcomponent}\n")

      /* CREATE NEW PROVIDED PORT & PROXY */
      ct.getProvided.foreach{ref=>
        var portName = ct.getName()+"PORT"+ref.getName();
        // var portNameProxy = ct.getName()+"PORTPROXY"+ref.getName();
        wrapper.append("def create"+portName+"(component : "+ct.getName+") : "+portName+" ={ new "+portName+"(component)}\n")
        //  wrapper.append("def create"+portNameProxy+"() : "+portNameProxy+" = { new "+portNameProxy+"()}\n")
      }

      /* CREATE NEW REQUIRED PROXY */
      ct.getRequired.foreach{ref=>
        var portName = ct.getName()+"PORT"+ref.getName();
//        var portNameProxy = ct.getName()+"PORTPROXY"+ref.getName();

        wrapper.append("def create"+portName+"() : "+portName+" ={ return new "+portName+"();}\n")

        //wrapper.append("public static "+portName+" create"+portName+"(){ return new "+portName+"();}\n")
        //wrapper.append("def create"+portNameProxy+"() : "+portNameProxy+" ={ return new "+portNameProxy+"();}\n")
      }

      wrapper.append("}\n")
      wrapper.close
    }

    /* STEP CHANNEL TYPE DEFINITION */
    root.getTypeDefinitions.filter(p=> p.isInstanceOf[ChannelType]).foreach{ctt=>
      var ct = ctt.asInstanceOf[ChannelType]
      var channelTypePackage = ct.getFactoryBean().substring(0, ct.getFactoryBean().lastIndexOf("."));
      var factoryName = ct.getFactoryBean.substring(ct.getFactoryBean.lastIndexOf(".")+1)
      var componentBean = ct.getFactoryBean.substring(0, ct.getFactoryBean.indexOf("Factory"))
      var wrapper = filer.createTextFile(com.sun.mirror.apt.Filer.Location.SOURCE_TREE, "", new File(channelTypePackage.replace(".", "/")+"/"+factoryName+".scala"), "UTF-8");

      //var wrapper = filer.createSourceFile(ct.getFactoryBean);
      wrapper.append("package "+channelTypePackage+"\n");
      wrapper.append("import org.kermeta.art2.framework._\n")
      wrapper.append("object "+factoryName+"{\n")

      wrapper.append("def createChannel()={new "+ct.getBean+" with ChannelTypeFragment {\n")


      if(ct.getStartMethod != null){
        wrapper.append("override def startChannelFragment(){this.asInstanceOf["+componentBean+"]."+ct.getStartMethod+"()}\n")
      }
      if(ct.getStopMethod != null){
        wrapper.append("override def stopChannelFragment(){this.asInstanceOf["+componentBean+"]."+ct.getStopMethod+"()}\n")
      }

      wrapper.append("}}}\n")
    }


  }

}
