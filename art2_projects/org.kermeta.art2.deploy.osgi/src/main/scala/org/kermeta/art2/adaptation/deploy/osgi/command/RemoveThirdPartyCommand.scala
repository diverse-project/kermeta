/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2.DeployUnit
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager

case class RemoveThirdPartyCommand(ct : DeployUnit, ctx : Art2DeployManager) extends PrimitiveCommand {

  def execute() : Boolean= {
    println("Not implemented")
    true
  }

  def undo() = {
    println("Not implemented")
  }


}
