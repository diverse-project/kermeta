/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.aspects

import org.kermeta.art2._
import org.kermeta.art2.ui.editor.Art2UIKernel
import org.kermeta.art2.ui.framework.elements.ModelPanel
import org.kermeta.art2.ui.framework.elements.NodePanel
import scala.collection.JavaConversions._
import Art2UIAspects._

case class NodeAspect(self : ContainerNode) {

  def removeModelAndUI(kernel : Art2UIKernel)={

    var root : ContainerRoot = self.eContainer.asInstanceOf[ContainerRoot]

    //REMOVE SUB NODE

    var subcomponent = self.getComponents.toList ++ List()

    subcomponent.foreach{c => c.removeModelAndUI(kernel)}

    //REMOVE UI
    var nodePanel = kernel.getUifactory().getMapping().get(self).asInstanceOf[NodePanel]
    var modelPanel = kernel.getUifactory().getMapping().get(self.eContainer).asInstanceOf[ModelPanel]

    println(nodePanel+"-"+modelPanel)

    modelPanel.removeInstance(nodePanel)

    //REMOVE INSTANCE
    root.getNodes.remove(self)

    //UNBIND
    kernel.getUifactory().getMapping().unbind(nodePanel, self);

  }

}
