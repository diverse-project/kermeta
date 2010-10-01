/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2.ComponentType
import org.kermeta.art2._
import org.kermeta.art2.DeployUnit
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2OSGiBundle
import scala.collection.JavaConversions._
import org.slf4j.LoggerFactory

case class AddTypeCommand(ct : TypeDefinition, ctx : Art2DeployManager)  extends PrimitiveCommand{

  var logger = LoggerFactory.getLogger(this.getClass);
	
  def buildQuery(du : DeployUnit) : String = {
    var query = new StringBuilder
    query.append("mvn:")
    query.append(du.getGroupName)
    query.append("/")
    query.append(du.getUnitName)
    du.getVersion match {
      case "default"=>
      case ""=>
      case _ => query.append("/");query.append(du.getVersion)
    }
    query.toString
  }

  def findLib(ct : TypeDefinition) : Option[DeployUnit] = {
    //ct.eContainer.asInstanceOf[ContainerRoot].getLibraries.find{lib=>
    //  lib.getSubTypes.exists({sct => sct == ct})
    //}
    //
    Some(ct.getDeployUnit)
  }

  //var lastExecutionBundle : Option[org.osgi.framework.Bundle] = None
  def execute() : Boolean= {
    logger.info("CMD ADD CT EXECUTION");
    /* Actually deploy only bundle from library  */
    findLib(ct) match {
      case Some(l) => {
          try{
            lastExecutionBundle = Some(ctx.bundleContext.installBundle(buildQuery(l)));
            var symbolicName : String = lastExecutionBundle.get.getSymbolicName
            ctx.bundleMapping.append(Art2OSGiBundle(ct.getName,ct.getClass,lastExecutionBundle.get))
            lastExecutionBundle.get.start
            true
          } catch {
            case _ @ e =>logger.error("failed to perform CMD ADD CT EXECUTION on " +lastExecutionBundle.get.getSymbolicName,e); false
          }
        }
      case None => false
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
