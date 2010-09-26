/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2._
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.framework.Art2ChannelFragment
import org.kermeta.art2.framework.Constants
import org.kermeta.art2.framework.message.Art2FragmentBindMessage
import org.kermeta.art2.framework.message.Art2FragmentUnbindMessage
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._

case class RemoveFragmentBindingCommand(c : Channel,remoteNodeName:String, ctx : Art2DeployManager,nodeName:String) extends PrimitiveCommand {

  var logger = LoggerFactory.getLogger(this.getClass)

  def execute() : Boolean= {

    var art2ChannelFound = ctx.bundleMapping.find(map=>map.objClass == c.getClass && map.name == c.getName) match {
      case None => logger.error("Channel Fragment Mapping not found");None
      case Some(mapfound)=> {
          var channelBundle = mapfound.bundle
          channelBundle.getRegisteredServices.find({sr=> sr.getProperty(Constants.ART2_NODE_NAME)==nodeName && sr.getProperty(Constants.ART2_INSTANCE_NAME)==c.getName }) match {
            case None => logger.error("Channel Fragment Service not found");None
            case Some(sr)=> Some(channelBundle.getBundleContext.getService(sr).asInstanceOf[Art2ChannelFragment])}}
    }

    art2ChannelFound match {
      case None => false
      case Some(channel)=> {
          //CREATE REMOTE PROXY

          var unbindmsg = new Art2FragmentUnbindMessage
          unbindmsg.setChannelName(c.getName)
          unbindmsg.setFragmentNodeName(remoteNodeName)

          (channel !? unbindmsg).asInstanceOf[Boolean]

        }
    }
  }

  def undo() = {
    AddFragmentBindingCommand(c,remoteNodeName,ctx,nodeName).execute
  }


}
