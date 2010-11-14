/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.aspects

import org.kermeta.art2._
import org.kermeta.art2.framework.Art2Utility
import org.kermeta.art2.ui.editor.Art2UIKernel
import org.kermeta.art2.ui.framework.elements.ChannelPanel
import org.kermeta.art2.ui.framework.elements.ModelPanel
import scala.collection.JavaConversions._
import Art2UIAspects._

case class ChannelAspect(self : Channel) {

  def removeModelAndUI(kernel : Art2UIKernel)={
          var root : ContainerRoot = self.eContainer.asInstanceOf[ContainerRoot]
          Art2Utility.getRelatedBinding(self).foreach{b=>
            b.removeModelAndUI(kernel)
          }
          var panel = kernel.getUifactory().getMapping().get(self).asInstanceOf[ChannelPanel]
          var modelPanel = kernel.getUifactory().getMapping().get(root).asInstanceOf[ModelPanel]
          modelPanel.removeInstance(panel)
          root.getHubs.remove(self)
          kernel.getUifactory().getMapping().unbind(panel, self);
  }

}
