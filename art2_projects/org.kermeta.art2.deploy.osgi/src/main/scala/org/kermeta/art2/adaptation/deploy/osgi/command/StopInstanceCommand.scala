/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2._
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.framework.Art2Actor
import org.kermeta.art2.framework.Constants
import org.kermeta.art2.framework.message.Art2StopMessage
import scala.collection.JavaConversions._

case class StopInstanceCommand(c : Instance, ctx : Art2DeployManager,nodeName:String) extends PrimitiveCommand {

  def execute() : Boolean= {
    ctx.bundleMapping.find(map=>map.objClassName == c.getClass.getName && map.name == c.getName) match {
      case None => false
      case Some(mapfound)=> {
          var componentBundle = mapfound.bundle
          componentBundle.getRegisteredServices.find({sr=> sr.getProperty(Constants.ART2_NODE_NAME)==nodeName && sr.getProperty(Constants.ART2_INSTANCE_NAME)==c.getName }) match {
            case None => false
            case Some(sr)=> (componentBundle.getBundleContext.getService(sr).asInstanceOf[Art2Actor] !? Art2StopMessage ).asInstanceOf[Boolean]
          }
        }
    }
  }

  def undo() = {
    StartInstanceCommand(c,ctx,nodeName)
  }

}
