/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.jmdns

import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.kermeta.art2.framework.Art2Actor
import org.kermeta.art2.framework.Constants
import org.kermeta.art2.framework.message.Art2PlatformModelUpdate
import org.slf4j.LoggerFactory
import scala.actors.Actor
import java.net.NetworkInterface
import java.util.HashMap
import javax.jmdns._
import scala.actors.TIMEOUT
import scala.collection.JavaConversions._

class Art2DiscoveryActor(secondes:Int,modelHandler : Art2ModelHandlerService,dispatcherPort : Int,modelSynchPort : Int) extends Art2Actor with ServiceListener {

  var jmdns : List[JmDNS] = List()
  var logger = LoggerFactory.getLogger(this.getClass);

  //case class UPDATE_PLATFORM_MSG

  override def act()={
    loop{
      reactWithin(secondes*1000) {
        case STOP_ACTOR => exit
          //case UPDATE_PLATFORM_MSG => updatePlatformModelFromJMDNS()
        case TIMEOUT => { logger.info("Periodic update");updatePlatformModelFromJMDNS() }
      }
    }
  }

  override def start() : Actor = {
    super.start

    /* Build safe node Name */
    //TO REMOVE
    var nodeName = modelHandler.getNodeName
    var nodeNameProtected = new StringBuilder
    nodeName.foreach{c =>
      if(c.isLetter) {
        nodeNameProtected.append(c)
      }
    }


    //LOCAL ART2 SERVICE REGISTER
    //COMMON PROPERTIES
    var props = new HashMap[String,Object]
    props.put(Constants.ART2_NODE_NAME, nodeName)
    props.put(Constants.ART2_PLATFORM_REMOTE_NODE_DISPATCHER_PORT, dispatcherPort.toString)
    props.put(Constants.ART2_PLATFORM_REMOTE_NODE_MODELSYNCH_PORT, modelSynchPort.toString)

    NetworkInterface.getNetworkInterfaces.foreach{it =>
      
      //IT SPECIFIC PROP
      props.put(Constants.ART2_PLATFORM_REMOTE_MTU, it.getMTU.toString)
      props.put(Constants.ART2_PLATFORM_REMOTE_NETWORK_TYPE, it.getName)

      /* DO NOT EXPOSE LOCAL HOST INTERFACE */
      if( (!it.isLoopback) && it.isUp){
        it.getInetAddresses.foreach{addr =>

          var jmdnsNodeName = nodeNameProtected.toString+"-"+it.getName
          logger.info("Start JMDNS for interface, "+jmdnsNodeName+", addr="+addr.getHostAddress)
          var jmdnsIT = JmDNS.create(addr,jmdnsNodeName)
          jmdnsIT.addServiceListener(Constants.ART2_SERVICE, this)
          var serviceInfo = ServiceInfo.create(Constants.ART2_SERVICE, jmdnsNodeName, dispatcherPort,0,0, props)
          jmdnsIT.registerService(serviceInfo)
          jmdns = jmdns ++ List(jmdnsIT)

        }
      }

    }

    this
  }

  /* STOP ALL JMDNS SERVICE */
  override def stop(){jmdns.foreach{j=>j.close()};super[Art2Actor].forceStop}

  def serviceAdded(event: javax.jmdns.ServiceEvent)={
    /*
     println("added")
     var info = event.getInfo
     var nodeName = info.getName.replace("-", ".")
     info.getPropertyString(Constants.ART2_PLATFORM_REMOTE_NODE_DISPATCHER_PORT)
     modelHandler.asInstanceOf[Art2Actor] ! Art2PlatformModelUpdate(nodeName,Constants.ART2_PLATFORM_REMOTE_NODE_IP,info.getHostAddress,"lan",info.getWeight)
     modelHandler.asInstanceOf[Art2Actor] ! Art2PlatformModelUpdate(nodeName,Constants.ART2_PLATFORM_REMOTE_NODE_MODELSYNCH_PORT,info.getPropertyString(Constants.ART2_PLATFORM_REMOTE_NODE_MODELSYNCH_PORT),"lan",info.getWeight)
     modelHandler.asInstanceOf[Art2Actor] ! Art2PlatformModelUpdate(nodeName,Constants.ART2_PLATFORM_REMOTE_NODE_DISPATCHER_PORT,info.getPropertyString(Constants.ART2_PLATFORM_REMOTE_NODE_DISPATCHER_PORT),"lan",info.getWeight)
     */
  }
  def serviceRemoved(event: javax.jmdns.ServiceEvent)={
    //this ! UPDATE_PLATFORM_MSG
  }
  def serviceResolved(event: javax.jmdns.ServiceEvent)={
    //this ! UPDATE_PLATFORM_MSG
    var info = event.getInfo
    var nodeName = info.getPropertyString(Constants.ART2_NODE_NAME)
    var typeNetwork = info.getPropertyString(Constants.ART2_PLATFORM_REMOTE_NETWORK_TYPE)
    modelHandler.asInstanceOf[Art2Actor] ! Art2PlatformModelUpdate(nodeName,Constants.ART2_PLATFORM_REMOTE_NODE_IP,info.getHostAddress,typeNetwork,info.getWeight)
    modelHandler.asInstanceOf[Art2Actor] ! Art2PlatformModelUpdate(nodeName,Constants.ART2_PLATFORM_REMOTE_NODE_MODELSYNCH_PORT,info.getPropertyString(Constants.ART2_PLATFORM_REMOTE_NODE_MODELSYNCH_PORT),typeNetwork,info.getWeight)
    modelHandler.asInstanceOf[Art2Actor] ! Art2PlatformModelUpdate(nodeName,Constants.ART2_PLATFORM_REMOTE_NODE_DISPATCHER_PORT,info.getPropertyString(Constants.ART2_PLATFORM_REMOTE_NODE_DISPATCHER_PORT),typeNetwork,info.getWeight)
  }

  
  def updatePlatformModelFromJMDNS()={
    try{
      var actualModel = modelHandler.getLastModel
      //PROCESS ART2MODEL SERVICE
      var infos = jmdns.get(0).list(Constants.ART2_SERVICE);
      infos.foreach{info=>
        var nodeName = info.getPropertyString(Constants.ART2_NODE_NAME)
        var typeNetwork = info.getPropertyString(Constants.ART2_PLATFORM_REMOTE_NETWORK_TYPE)
        modelHandler.asInstanceOf[Art2Actor] ! Art2PlatformModelUpdate(nodeName,Constants.ART2_PLATFORM_REMOTE_NODE_IP,info.getHostAddress,typeNetwork,info.getWeight)
        modelHandler.asInstanceOf[Art2Actor] ! Art2PlatformModelUpdate(nodeName,Constants.ART2_PLATFORM_REMOTE_NODE_MODELSYNCH_PORT,info.getPropertyString(Constants.ART2_PLATFORM_REMOTE_NODE_MODELSYNCH_PORT),typeNetwork,info.getWeight)
        modelHandler.asInstanceOf[Art2Actor] ! Art2PlatformModelUpdate(nodeName,Constants.ART2_PLATFORM_REMOTE_NODE_DISPATCHER_PORT,info.getPropertyString(Constants.ART2_PLATFORM_REMOTE_NODE_DISPATCHER_PORT),typeNetwork,info.getWeight)
      }

    } catch {
      case _ @ e => logger.error("ART2 Platform model update error", e)
    }
  }

    def internal_process(msg : Any) = {

    }

}
