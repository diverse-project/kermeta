/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.generator

import com.sun.mirror.apt.Filer
import java.io.File
import org.kermeta.art2.ContainerRoot
import scala.collection.JavaConversions._
import org.kermeta.art2.ChannelType
import org.kermeta.art2.ComponentType
import org.kermeta.art2.framework.aspects.Art2Aspects._

object Art2ActivatorGenerator {
  def generateActivator(root:ContainerRoot,filer:Filer){
    root.getTypeDefinitions.filter(p=> p.isInstanceOf[ComponentType]).foreach{ctt=>
      var ct = ctt.asInstanceOf[ComponentType]
      var activatorPackage = ct.getFactoryBean().substring(0, ct.getFactoryBean().lastIndexOf("."))
      var activatorName = ct.getName()+"Activator"
      var wrapper = filer.createTextFile(com.sun.mirror.apt.Filer.Location.SOURCE_TREE, "", new File(activatorPackage.replace(".", "/")+"/"+activatorName+".scala"), "UTF-8")
      /* GENERATE CONTENT */
      wrapper.append("package "+activatorPackage+";\n");

      /* IMPORTED PACKAGE */
      wrapper.append("import java.util.Hashtable\n")
      wrapper.append("import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService\n")
      wrapper.append("import org.osgi.framework.BundleActivator\n")
      wrapper.append("import org.osgi.framework.BundleContext\n")
      wrapper.append("import org.osgi.util.tracker.ServiceTracker\n")
      wrapper.append("import org.kermeta.art2.framework.Art2Actor\n")
      wrapper.append("import org.kermeta.art2.framework.Art2Component\n")
      wrapper.append("import org.kermeta.art2.framework._\n")
      wrapper.append("class "+activatorName+" extends org.kermeta.art2.framework.osgi.Art2ComponentActivator {\n")
      var factoryName = ct.getFactoryBean.substring(ct.getFactoryBean.lastIndexOf(".")+1)
      wrapper.append("def callFactory() : Art2Component = { "+factoryName+".createComponentActor() } ")
      wrapper.append("}\n")

      /* END CONTENT GENERATION */
      wrapper.close();
    }

    /* STEP CHANNEL TYPE DEFINITION */
    root.getTypeDefinitions.filter(p=> p.isInstanceOf[ChannelType]).foreach{ctt=>
      var ct = ctt.asInstanceOf[ChannelType]
      var activatorPackage = ct.getFactoryBean().substring(0, ct.getFactoryBean().lastIndexOf("."))
      var activatorName = ct.getName()+"Activator"
      var wrapper = filer.createTextFile(com.sun.mirror.apt.Filer.Location.SOURCE_TREE, "", new File(activatorPackage.replace(".", "/")+"/"+activatorName+".scala"), "UTF-8")
      /* GENERATE CONTENT */
      wrapper.append("package "+activatorPackage+";\n");
      /* IMPORTED PACKAGE */
      wrapper.append("import java.util.Hashtable\n")
      wrapper.append("import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService\n")
      wrapper.append("import org.osgi.framework.BundleActivator\n")
      wrapper.append("import org.osgi.framework.BundleContext\n")
      wrapper.append("import org.osgi.util.tracker.ServiceTracker\n")
      wrapper.append("import org.kermeta.art2.framework.Art2Actor\n")
      wrapper.append("import org.kermeta.art2.framework._\n")
      wrapper.append("import org.kermeta.art2.framework.Art2Component\n")
      wrapper.append("class "+activatorName+" extends org.kermeta.art2.framework.osgi.Art2ChannelFragmentActivator {\n")
      var factoryName = ct.getFactoryBean.substring(ct.getFactoryBean.lastIndexOf(".")+1)
      wrapper.append("def callFactory() : org.kermeta.art2.framework.Art2ChannelFragment = { "+factoryName+".createChannel() } ")
      wrapper.append("}\n")
      /* END CONTENT GENERATION */
      wrapper.close();

    }

  }
}
