/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty.remote
import java.net.InetSocketAddress
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.kermeta.art2.framework.message.Art2FragmentBindMessage
import scala.actors.Actor
import scala.collection.JavaConversions._

class Art2RequirePortRemoteClient(bindmsg : Art2FragmentBindMessage,modelHandler : Art2ModelHandlerService,delegate : Actor,timeout : Int) extends TcpClientRemoteActor(delegate : Actor,timeout : Int) {

  def getRemoteAddr : InetSocketAddress = {

    /* Trivial algorithme search only one */
    var platformModel = modelHandler.getLastModel.getPlatformModel
    var nodenetwork = platformModel.getNodeNetworks.filter{loopNN=> loopNN.getTarget == bindmsg.getChannelName }
    nodenetwork.find(nn=>true) match {
      case None => new InetSocketAddress(0)
      case Some(nn) => {
          nn.getLink.find(l=> true) match {
            case None => new InetSocketAddress(0)
            case Some(l)=> {
                if(l.getNetworkType == "lan"){
                  var remoteIP = l.getNetworkProperties.find(p=> p.getName == "art2.remote.node.ip").get
                  var remotePORT = l.getNetworkProperties.find(p=> p.getName == "art2.remote.node.port").get
                  new InetSocketAddress(remoteIP.getValue,Integer.parseInt(remotePORT.getValue))
                } else {
                  new InetSocketAddress(0)
                }
              }
          }
        }
    }
    new InetSocketAddress(0)
  }
}
