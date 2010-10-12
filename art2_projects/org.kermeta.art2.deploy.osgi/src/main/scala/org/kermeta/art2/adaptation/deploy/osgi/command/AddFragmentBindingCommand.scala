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
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._

case class AddFragmentBindingCommand(c : Channel,remoteNodeName:String, ctx : Art2DeployManager,nodeName:String) extends PrimitiveCommand {

  var logger = LoggerFactory.getLogger(this.getClass)

  def execute() : Boolean= {

    
    println("Search for Bunding "+c.getClass.getName+","+c.getName)
    ctx.bundleMapping.foreach{map=>

      println("Map =>"+map.name+","+map.objClass.getName+","+map.bundle.getBundleId )

    }

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

          var bindmsg = new Art2FragmentBindMessage
          var proxy = new org.kermeta.art2.framework.bus.netty.remote.Art2RemoteChannelClient(remoteNodeName,c.getName,ctx.getServiceHandler,3000)
          bindmsg.setChannelName(c.getName)
          bindmsg.setFragmentNodeName(remoteNodeName)
          bindmsg.setProxy(proxy)
          
          (channel !? bindmsg).asInstanceOf[Boolean]

        }
    }
  }

  def undo() = {
    RemoveFragmentBindingCommand(c,remoteNodeName,ctx,nodeName).execute
  }

}
