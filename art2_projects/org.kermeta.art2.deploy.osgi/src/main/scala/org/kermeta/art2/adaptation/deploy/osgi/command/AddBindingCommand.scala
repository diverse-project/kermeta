/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2._
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.framework.Art2ChannelFragment
import org.kermeta.art2.framework.Art2Component
import org.kermeta.art2.framework.Art2Port
import org.kermeta.art2.framework.Constants
import org.kermeta.art2.framework.message.Art2FragmentBindMessage
import org.kermeta.art2.framework.message.Art2PortBindMessage
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._

case class AddBindingCommand(c : MBinding, ctx : Art2DeployManager,nodeName:String) extends PrimitiveCommand {

  var logger = LoggerFactory.getLogger(this.getClass);

  def execute() : Boolean= {

    var art2ChannelFound = ctx.bundleMapping.find(map=>map.obj == c.getHub) match {
      case None => logger.error("Channel Fragment Mapping not found");None
      case Some(mapfound)=> {
          var channelBundle = mapfound.bundle
          channelBundle.getRegisteredServices.find({sr=> sr.getProperty(Constants.ART2_NODE_NAME)==nodeName && sr.getProperty(Constants.ART2_INSTANCE_NAME)==c.getHub.getName }) match {
            case None => logger.error("Channel Fragment Service not found");None
            case Some(sr)=> Some(channelBundle.getBundleContext.getService(sr).asInstanceOf[Art2ChannelFragment])}}
    }

    var art2ComponentFound = ctx.bundleMapping.find(map=>map.obj == c.getPort.eContainer.asInstanceOf[ComponentInstance]) match {
      case None => logger.error("Component Mapping not found");None
      case Some(mapfound)=> {
          var componentBundle = mapfound.bundle
          componentBundle.getRegisteredServices.find({sr=> sr.getProperty(Constants.ART2_NODE_NAME)==nodeName && sr.getProperty(Constants.ART2_INSTANCE_NAME)==c.getPort.eContainer.asInstanceOf[ComponentInstance].getName }) match {
            case None => logger.error("Component Actor Service not found");None
            case Some(sr)=> Some(componentBundle.getBundleContext.getService(sr).asInstanceOf[Art2Component])}}
    }
    
    art2ComponentFound match {
      case None => false
      case Some(cfound) => {
          var np = cfound.getArt2ComponentType.getNeededPorts.find(np => np._1 == c.getPort.getPortTypeRef.getName)
          var hp = cfound.getArt2ComponentType.getHostedPorts.find(np => np._1 == c.getPort.getPortTypeRef.getName)

          Unit match {
            case _ if(np.isEmpty && hp.isEmpty)=>logger.info("Port instance not found in component");false
            case _ if(!np.isEmpty)=> {
                /* Bind port to Channel */
                var portfound = np.get._2.asInstanceOf[Art2Port]
                art2ChannelFound match {
                  case None => logger.info("ChannelFragment not found in component");false
                  case Some(channelProxy) => {
                      var newbindmsg = new Art2FragmentBindMessage
                      newbindmsg.setChannelName(c.getHub.getName)
                      newbindmsg.setProxy(channelProxy)
                      (portfound !? newbindmsg).asInstanceOf[Boolean]
                    }
                }
              }
            case _ if(!hp.isEmpty)=>{
                /* Bind Channel to port */
                //TODO REMOTE PORT
                var portfound = hp.get._2.asInstanceOf[Art2Port]
                art2ChannelFound match {
                  case None => logger.info("ChannelFragment not found in component");false
                  case Some(channelProxy) => {
                      var bindmsg = new Art2PortBindMessage
                      bindmsg.setProxy(portfound)
                      (channelProxy.asInstanceOf[Art2ChannelFragment] !? bindmsg).asInstanceOf[Boolean]
                    }
                }
                
              }
          }
        }
    }
  }

  def undo() = {
    
  }


}
