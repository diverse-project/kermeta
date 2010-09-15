/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2.MBinding
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.slf4j.LoggerFactory

case class RemoveBindingCommand(c : MBinding, ctx : Art2DeployManager,nodeName:String) extends PrimitiveCommand {

  var logger = LoggerFactory.getLogger(this.getClass);

  def execute() : Boolean= {
    logger.warn("Not yep implemented")
    true
  }

  def undo() = {
    logger.warn("Not yep implemented")
  }

}
