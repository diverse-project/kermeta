/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.aspects

import org.kermeta.art2._
import org.kermeta.art2.framework.Art2Utility
import org.kermeta.art2.ui.editor.Art2UIKernel
import org.kermeta.art2.ui.framework.elements.ComponentPanel
import org.kermeta.art2.ui.framework.elements.ModelPanel
import org.kermeta.art2.ui.framework.elements.NodePanel
import scala.collection.JavaConversions._
import Art2UIAspects._

case class ComponentAspect(self : ComponentInstance) {

  def removeModelAndUI(kernel : Art2UIKernel)={
    var node : ContainerNode = self.eContainer.asInstanceOf[ContainerNode]
    var root : ContainerRoot = self.eContainer.eContainer.asInstanceOf[ContainerRoot]

    //BINDING
    Art2Utility.getRelatedBinding(self).foreach{b=>
      b.removeModelAndUI(kernel)
    }

    //REMOVE UI
    var nodepanel = kernel.getUifactory().getMapping().get(node).asInstanceOf[NodePanel]
    var componentPanel = kernel.getUifactory().getMapping().get(self).asInstanceOf[ComponentPanel]
    nodepanel.remove(componentPanel)

    //REMOVE INSTANCE
    node.getComponents.remove(self)


    //UNBIND
    kernel.getUifactory().getMapping().unbind(componentPanel, self)



  }

}
