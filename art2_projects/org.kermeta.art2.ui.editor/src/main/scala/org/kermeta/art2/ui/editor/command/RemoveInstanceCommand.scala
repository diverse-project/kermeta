/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.command

import org.kermeta.art2.ui.editor.Art2UIKernel
import scala.reflect.BeanProperty

class RemoveInstanceCommand extends Command {

  @BeanProperty
  var kernel : Art2UIKernel = null

  def execute(p :Object) {



  }


}
