/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2.ComponentType
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.DeployUnit
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2OSGiBundle
import scala.collection.JavaConversions._

case class AddComponentTypeCommand(ct : ComponentType, ctx : Art2DeployManager)  extends PrimitiveCommand{

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

  def findLib(ct : ComponentType) : Option[DeployUnit] = {
    ct.eContainer.asInstanceOf[ContainerRoot].getLibrariy.find{lib=>
      lib.getSubComponentTypes.exists({sct => sct == ct})
    }
  }

  var lastExecutionBundle : Option[org.osgi.framework.Bundle] = None
  def execute() : Boolean= {
    println("CMD ADD CT EXECUTION");
    /* Actually deploy only bundle from library  */
    findLib(ct) match {
      case Some(l) => {
          try{
            lastExecutionBundle = Some(ctx.bundleContext.installBundle(buildQuery(l)));
            ctx.bundleMapping.append(Art2OSGiBundle(ct,ct.getName,ct.getClass,lastExecutionBundle.get))
            lastExecutionBundle.get.start
            true
          } catch {
            case _ @ e =>e.printStackTrace; false
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
