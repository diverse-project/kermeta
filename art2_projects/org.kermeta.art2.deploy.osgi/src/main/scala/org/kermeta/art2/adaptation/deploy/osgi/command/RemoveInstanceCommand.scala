/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2.Instance
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.osgi.service.packageadmin.PackageAdmin
import scala.collection.JavaConversions._

case class RemoveInstanceCommand(c : Instance, ctx : Art2DeployManager,nodeName : String)  extends PrimitiveCommand{

  def execute() : Boolean= {
    println("CMD REMOVE INSTANCE EXECUTION - "+c.getName+" - type - "+c.getTypeDefinition.getName);

    var bundles = ctx.bundleMapping.filter({bm=> bm.objClassName  == c.getClass.getName && bm.name == c.getName }) ++ List()

    bundles.forall{mp=>
      mp.bundle.stop;
      mp.bundle.uninstall;

      var srPackageAdmin = ctx.bundleContext.getServiceReference(classOf[PackageAdmin].getName)
      var padmin : PackageAdmin = ctx.bundleContext.getService(srPackageAdmin).asInstanceOf[PackageAdmin]
      padmin.resolveBundles(Array(mp.bundle))

      true
    }

    ctx.bundleMapping.removeAll(bundles)




  }

  def undo() = {
    AddInstanceCommand(c,ctx,nodeName).execute
  }

}
