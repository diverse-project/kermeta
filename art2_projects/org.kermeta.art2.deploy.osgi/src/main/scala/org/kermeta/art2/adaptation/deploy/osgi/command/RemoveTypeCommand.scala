/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2._
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager

case class RemoveTypeCommand(ct : TypeDefinition, ctx : Art2DeployManager) extends PrimitiveCommand {

  def execute() : Boolean= {
    println("CMD REMOVE CT EXECUTION");
    ctx.bundleMapping.find({bm=> bm.objClass  == ct.getClass && bm.name == ct.getName }) match {
      case Some(mp) => { mp.bundle.stop;mp.bundle.uninstall;true }
      case None => false
    }
  }

  def undo() = {
    AddTypeCommand(ct,ctx).execute
  }
}
