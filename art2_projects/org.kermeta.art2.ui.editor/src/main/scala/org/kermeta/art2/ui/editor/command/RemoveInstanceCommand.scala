/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.command

import org.kermeta.art2.Channel
import org.kermeta.art2.ComponentInstance
import org.kermeta.art2.ContainerNode
import org.kermeta.art2.ui.editor.Art2UIKernel
import scala.reflect.BeanProperty
import scala.collection.JavaConversions._
import org.kermeta.art2.ui.editor.aspects.Art2UIAspects._

class RemoveInstanceCommand(elem : org.kermeta.art2.NamedElement) extends Command {

  @BeanProperty
  var kernel : Art2UIKernel = null

  def execute(p :Object) {

    elem match {
      case inst : Channel => inst.removeModelAndUI(kernel)
      case inst : ComponentInstance => inst.removeModelAndUI(kernel)
      case inst : ContainerNode => inst.removeModelAndUI(kernel)
    }

    kernel.getEditorPanel.unshowPropertyEditor()

  }


}
