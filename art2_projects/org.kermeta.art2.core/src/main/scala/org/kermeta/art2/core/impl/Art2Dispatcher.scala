/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty

import org.kermeta.art2.framework.bus.netty.remote.TcpServerRemoteActor
import org.kermeta.art2.framework.message.Art2Message
import org.osgi.framework.BundleContext
import org.osgi.util.tracker.ServiceTracker
import org.slf4j.LoggerFactory
import org.kermeta.art2.framework.Art2Actor
import org.kermeta.art2.framework.Constants
import org.kermeta.art2.framework.JacksonSerializer._
import scala.collection.JavaConversions._
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService

class Art2Dispatcher(port : Int,handler : Art2ModelHandlerService,bc : BundleContext) extends Art2Actor {

  var logger = LoggerFactory.getLogger(this.getClass);
  var server = new TcpServerRemoteActor(port,this)
  var waitingMessage = List()
  var serviceTracker = new ServiceTracker(bc,classOf[Art2Actor].getName(), null)


  def act = {

    loop {
      react {
        case jsoncontent : String => {
            try {
              /* unserialize */
              var art2message = jsoncontent.fromJSON(classOf[Art2Message])
              /* retrive service */
              var servicefound = serviceTracker.getServiceReferences.find(sr => {sr.getProperty(Constants.ART2_NODE_NAME) == art2message.destNodeName && sr.getProperty(Constants.ART2_INSTANCE_NAME) == art2message.getDestComponentName && sr.getProperty(Constants.ART2_PORT_NAME) == art2message.getDestPortName} )
              if(art2message.inOut.booleanValue){
                servicefound match {
                  case None => logger.error("Not implemented yet !!! ")
                  case Some(sr)=> {
                      reply(serviceTracker.getService(sr).asInstanceOf[Art2Actor] !? art2message.getContent)
                  }
                }
              } else {
                servicefound match {
                  case None => logger.error("Not implemented yet !!! ")
                  case Some(sr)=> serviceTracker.getService(sr).asInstanceOf[Art2Actor] ! art2message.getContent
                }
              }
            } catch {case _ @ e => logger.error("Unexpected exception, while sending msg.",e) }
          }
        case _ @ msg =>
      }
    }
  }

  override def start = server.start;serviceTracker.open;super.start;this
  override def stop : Unit = serviceTracker.close;server.stop;exit

}
