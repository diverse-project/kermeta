/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2.ComponentInstance
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager

case class RemoveComponentInstanceCommand(c : ComponentInstance, ctx : Art2DeployManager)  extends PrimitiveCommand{

  def execute() : Boolean= {
    println("CMD REMOVE CT EXECUTION");

    var bundles = ctx.bundleMapping.filter({bm=> bm.obj  == c })

    bundles.forall{mp=>
      mp.bundle.stop;mp.bundle.uninstall;true
    }
  }

  def undo() = {
    AddComponentInstanceCommand(c,ctx).execute
  }

}
