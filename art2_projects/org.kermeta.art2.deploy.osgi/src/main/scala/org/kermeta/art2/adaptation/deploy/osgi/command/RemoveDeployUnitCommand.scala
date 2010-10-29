/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2._
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.osgi.service.packageadmin.PackageAdmin
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._

case class RemoveDeployUnitCommand(deployUnit : DeployUnit, ctx : Art2DeployManager) extends PrimitiveCommand {

  var logger = LoggerFactory.getLogger(this.getClass)

  def execute() : Boolean= {
    ctx.bundleMapping.find({bundleMapping =>bundleMapping.name==CommandHelper.buildKEY(deployUnit) && bundleMapping.objClassName==deployUnit.getClass.getName}) match {
      case Some(bundleMappingFound)=> {
          var osgibundleContext = bundleMappingFound.bundle.getBundleContext
          var bundle = osgibundleContext.getBundle
          bundle.uninstall
          logger.info("Deploy Unit Bundle remove , try to refresh package")

          ctx.getServicePackageAdmin.refreshPackages(Array(bundle))

          //REMOVE BUNDLE MAPPING
          ctx.bundleMapping.remove(bundleMappingFound)
          true
        }
      case None => logger.error("Type Bundle not found & Or Error while uninstall !!! ");false
    }
  }

  def undo() = {
    AddDeployUnitCommand(deployUnit,ctx).execute
  }
}
