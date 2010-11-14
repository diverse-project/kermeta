/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.aspects

import org.kermeta.art2._
import org.kermeta.art2.ui.editor.Art2UIKernel
import org.kermeta.art2.ui.framework.elements.Binding
import org.kermeta.art2.ui.framework.elements.ModelPanel
import scala.collection.JavaConversions._
import Art2UIAspects._

case class MBindingAspect(self : MBinding) {

  def removeModelAndUI(kernel : Art2UIKernel)={
    var root = self.eContainer.asInstanceOf[ContainerRoot]

    //REMOVE UI
    var modelPanel = kernel.getUifactory().getMapping().get(root).asInstanceOf[ModelPanel]
    var panel = kernel.getUifactory().getMapping().get(self).asInstanceOf[Binding]
    modelPanel.removeBinding(panel)

    //REMOVE INSTANCE
    root.getMBindings.remove(self)

    //UNBIND UI
    kernel.getUifactory().getMapping().unbind(panel, self);

  }

}
