/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2.Instance
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager

case class RemoveInstanceCommand(c : Instance, ctx : Art2DeployManager,nodeName : String)  extends PrimitiveCommand{

  def execute() : Boolean= {
    println("CMD REMOVE CT EXECUTION");

    var bundles = ctx.bundleMapping.filter({bm=> bm.obj  == c })

    bundles.forall{mp=>
      mp.bundle.stop;mp.bundle.uninstall;true
    }
  }

  def undo() = {
    AddInstanceCommand(c,ctx,nodeName).execute
  }

}
