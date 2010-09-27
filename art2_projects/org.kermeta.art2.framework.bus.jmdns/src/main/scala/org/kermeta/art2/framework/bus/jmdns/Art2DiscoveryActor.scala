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
import java.util.HashMap
import javax.jmdns._
import scala.actors.TIMEOUT
import scala.collection.JavaConversions._

class Art2DiscoveryActor(time: Int,modelHandler : Art2ModelHandlerService,dispatcherPort : Int,modelSynchPort : Int) extends Art2Actor with ServiceListener {

  var jmdns : JmDNS = null
  var logger = LoggerFactory.getLogger(this.getClass);

  case class UPDATE_PLATFORM_MSG

  def act()={
    loop{
      reactWithin(time) {
        case STOP => exit
        case UPDATE_PLATFORM_MSG => updatePlatformModelFromJMDNS()
        case TIMEOUT => updatePlatformModelFromJMDNS()
      }
    }
  }

  override def start() : Actor = {
    super.start
    jmdns = JmDNS.create()
    jmdns.addServiceListener(Constants.ART2_SERVICE, this)
    var nodeName = modelHandler.getNodeName
    nodeName = nodeName.replace(".", "-")
    //LOCAL ART2 SERVICE REGISTER
    var props = new HashMap[String,Object]
    props.put(Constants.ART2_PLATFORM_REMOTE_NODE_DISPATCHER_PORT, dispatcherPort.toString)
    props.put(Constants.ART2_PLATFORM_REMOTE_NODE_MODELSYNCH_PORT, modelSynchPort.toString)
    var serviceInfoDispatcher = ServiceInfo.create(Constants.ART2_SERVICE, nodeName, dispatcherPort,0,0, props)
    jmdns.registerService(serviceInfoDispatcher)
    this ! UPDATE_PLATFORM_MSG
    this
  }

  override def stop(){jmdns.close();this ! STOP}
  def serviceAdded(event: javax.jmdns.ServiceEvent)={this ! UPDATE_PLATFORM_MSG }
  def serviceRemoved(event: javax.jmdns.ServiceEvent)={this ! UPDATE_PLATFORM_MSG }
  def serviceResolved(event: javax.jmdns.ServiceEvent)={this ! UPDATE_PLATFORM_MSG }

  def updatePlatformModelFromJMDNS()={
    try{
      var actualModel = modelHandler.getLastModel
      //PROCESS ART2MODEL SERVICE
      var infos = jmdns.list(Constants.ART2_SERVICE);
      infos.foreach{info=>
        var nodeName = info.getName.replace("-", ".")

        info.getPropertyString(Constants.ART2_PLATFORM_REMOTE_NODE_DISPATCHER_PORT)

        modelHandler.asInstanceOf[Art2Actor] ! Art2PlatformModelUpdate(nodeName,Constants.ART2_PLATFORM_REMOTE_NODE_IP,info.getHostAddress,"lan",info.getWeight)
        modelHandler.asInstanceOf[Art2Actor] ! Art2PlatformModelUpdate(nodeName,Constants.ART2_PLATFORM_REMOTE_NODE_MODELSYNCH_PORT,info.getPropertyString(Constants.ART2_PLATFORM_REMOTE_NODE_MODELSYNCH_PORT),"lan",info.getWeight)
        modelHandler.asInstanceOf[Art2Actor] ! Art2PlatformModelUpdate(nodeName,Constants.ART2_PLATFORM_REMOTE_NODE_DISPATCHER_PORT,info.getPropertyString(Constants.ART2_PLATFORM_REMOTE_NODE_DISPATCHER_PORT),"lan",info.getWeight)

      }

    } catch {
      case _ @ e => logger.error("ART2 Platform model update error", e)
    }
  }

}
