/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2._
import org.kermeta.art2.DeployUnit
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2OSGiBundle
import scala.collection.JavaConversions._
import org.osgi.framework.BundleException
import org.osgi.service.packageadmin.PackageAdmin
import org.slf4j.LoggerFactory

case class AddDeployUnitCommand(deployUnit : DeployUnit, ctx : Art2DeployManager)  extends PrimitiveCommand{

  var logger = LoggerFactory.getLogger(this.getClass);
	
  def execute() : Boolean= {
    logger.info("CMD ADD DEPLOY UNIT EXECUTION ");

    try{
      logger.info("Try to install from URI, "+CommandHelper.buildQuery(deployUnit))
      lastExecutionBundle = Some(ctx.bundleContext.installBundle(CommandHelper.buildQuery(deployUnit)));
      var symbolicName : String = lastExecutionBundle.get.getSymbolicName

      //FOR DEPLOY UNIT DO NOT USE ONLY NAME
      ctx.bundleMapping.append(Art2OSGiBundle(CommandHelper.buildKEY(deployUnit),deployUnit.getClass.getName,lastExecutionBundle.get))
      lastExecutionBundle.get.start
      mustBeStarted = true
      true
    } catch {
      case e : BundleException if(e.getType == BundleException.DUPLICATE_BUNDLE_ERROR) => {
          logger.warn("DeployUnit conflict ! ",e)
          mustBeStarted = false
          true
        }
            
      case _ @ e =>{
          try{
            lastExecutionBundle match {
              case None => logger.error("failed to perform CMD ADD CT EXECUTION")
              case Some(bundle) => logger.error("failed to perform CMD ADD CT EXECUTION on " +bundle.getSymbolicName,e);
            }
          } catch {
            case _=> logger.error("failed to perform CMD ADD CT EXECUTION")
          }
          false
        }
    }
       

  }

  def undo() = {
    lastExecutionBundle match {
      case Some(bundle)=> {
          bundle.stop;
          bundle.uninstall
          var srPackageAdmin = ctx.bundleContext.getServiceReference(classOf[PackageAdmin].getName)
          var padmin : PackageAdmin = ctx.bundleContext.getService(srPackageAdmin).asInstanceOf[PackageAdmin]
          padmin.resolveBundles(Array(bundle))
        }
      case None=> //NOTHING CAN BE DOING HERE
    }
    /* TODO CALL refreshPackage */
  }

}
