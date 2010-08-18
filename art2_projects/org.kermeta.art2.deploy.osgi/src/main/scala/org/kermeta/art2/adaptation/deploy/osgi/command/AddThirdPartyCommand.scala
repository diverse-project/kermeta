/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2.DeployUnit
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2OSGiBundle

case class AddThirdPartyCommand(ct : DeployUnit, ctx : Art2DeployManager)  extends PrimitiveCommand {


  var lastExecutionBundle : Option[org.osgi.framework.Bundle] = None
  def execute() : Boolean= {
    println("CMD ADD CT EXECUTION");
    /* Actually deploy only bundle from library  */
    try{
      lastExecutionBundle = Some(ctx.bundleContext.installBundle(ct.getUrl));
      var symbolicName : String = lastExecutionBundle.get.getSymbolicName
      ctx.bundleMapping.append(Art2OSGiBundle(ct,ct.getName,ct.getClass,lastExecutionBundle.get))
      lastExecutionBundle.get.start
      true
    } catch {
      case _ @ e =>e.printStackTrace; false
    }

  }

  def undo() = {
    lastExecutionBundle match {
      case Some(bundle)=> bundle.stop;bundle.uninstall
      case None=> //NOTHING CAN BE DOING HERE
    }
    /* TODO CALL refreshPackage */
  }


}
