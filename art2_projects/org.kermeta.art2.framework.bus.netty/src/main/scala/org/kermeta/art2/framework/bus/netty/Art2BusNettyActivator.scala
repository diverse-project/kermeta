/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty

import org.kermeta.art2.api.configuration.ConfigurationService
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.kermeta.art2.api.service.remote.Art2Dispatcher
import org.kermeta.art2.api.service.remote.Art2ModelDispatcher
import org.kermeta.art2.framework.Constants
import org.kermeta.art2.framework.bus.netty.remote.Art2DiscoveryServer
import org.kermeta.art2.framework.bus.netty.remote.Art2DiscoveryClient
import org.kermeta.art2.framework.bus.netty.remote.Art2DispatcherActor
import org.kermeta.art2.framework.bus.netty.fileserver.Art2ProvisioningServer
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.osgi.util.tracker.ServiceTracker
import java.util.Hashtable
import org.kermeta.art2.api.configuration.ConfigConstants
import org.slf4j.LoggerFactory

class Art2BusNettyActivator extends BundleActivator {

//  var bean : Art2KompareBean = null
  var modelHandlerServiceTracker : ServiceTracker = null
  var configServiceTracker : ServiceTracker = null
//  var discoveryActor : Art2PlatformDiscoveryActor = null
  var modelSynchRemoteActor : Art2ModelSynch = null
  var art2dispatcher : Art2DispatcherActor = null
  var logger = LoggerFactory.getLogger(this.getClass);

  var discoveryServer : Art2DiscoveryServer = null;
  var discoveryClient : Art2DiscoveryClient = null;

  var provisioningServer : Art2ProvisioningServer = null

  def start(bc : BundleContext){

    provisioningServer= new Art2ProvisioningServer()
provisioningServer.start
    
    modelHandlerServiceTracker = new ServiceTracker(bc,classOf[Art2ModelHandlerService].getName,null)
    configServiceTracker = new ServiceTracker(bc,classOf[ConfigurationService].getName,null)

    new Thread {
      override def run(){
        modelHandlerServiceTracker.open
        configServiceTracker.open

        var mhandler = modelHandlerServiceTracker.waitForService(10000).asInstanceOf[Art2ModelHandlerService]
        var configService = configServiceTracker.waitForService(10000).asInstanceOf[ConfigurationService]

        /* create model synch service */
        var modelDispatcherPort = configService.getProperty(ConfigConstants.ART2_NODE_MODELSYNC_PORT)

        println("PropFound="+modelDispatcherPort)

        if(modelDispatcherPort == Constants.ART2_PORT_AUTO){
          logger.info("Port Auto => search for a free port for Model Dispatcher")
          var i = 8000
          var found = false
          while( (!found) && (i<9000) ){     
            if(NetworkUtility.available(i)){
              modelDispatcherPort = i.toString
              found = true
            }
            i = i +1
          }
        }
        try{
          var modelDispatcherPortInt = Integer.parseInt(modelDispatcherPort)
          modelSynchRemoteActor = new Art2ModelSynch(modelDispatcherPortInt,mhandler)
          logger.info("Art2 Model Dispatcher start on port => "+modelDispatcherPortInt)
          modelSynchRemoteActor.start

          var props = new Hashtable[String,Object]();
          props.put(ConfigConstants.ART2_NODE_MODELSYNC_PORT.getValue, modelDispatcherPort.toString)
          bc.registerService(classOf[Art2ModelDispatcher].getName(), modelSynchRemoteActor, props);

        } catch {
          case _ @ e => logger.info("Bad Port Number => "+modelDispatcherPort,e)
        }
        /* create model synch service */
        var msgDispatcherPort = configService.getProperty(ConfigConstants.ART2_NODE_DISPATCHER_PORT)
        if(msgDispatcherPort == Constants.ART2_PORT_AUTO){
          logger.info("Port Auto => search for a free port for Msg Dispatcher")
          var i = 8000
          var found = false
          while( (!found) && (i<9000) ){
            if(NetworkUtility.available(i)){
              msgDispatcherPort = i.toString
              found = true
            }
            i = i +1
          }
        }
        try{
          var msgDispatcherPortInt = Integer.parseInt(msgDispatcherPort)
          art2dispatcher = new Art2DispatcherActor(msgDispatcherPortInt,bc)
          logger.info("Art2 Msg Dispatcher start on port => "+msgDispatcherPortInt)
          art2dispatcher.start

          var props = new Hashtable[String,Object]();
          props.put(ConfigConstants.ART2_NODE_DISPATCHER_PORT.getValue, msgDispatcherPort.toString)
          bc.registerService(classOf[Art2Dispatcher].getName(), art2dispatcher,props);

        } catch {
          case _ @ e => logger.info("Bad Port Number => "+modelDispatcherPort,e)
        }

        //START AUTO DISCOVERY
        try{
          discoveryServer = new Art2DiscoveryServer(6789)
          discoveryServer.start

          discoveryClient = new Art2DiscoveryClient(10000,6789,mhandler.getNodeName,Integer.parseInt(modelDispatcherPort),Integer.parseInt(msgDispatcherPort))
          discoveryClient.start

        } catch {
          case _ @ e => logger.info("Discovery Module Error",e)
        }



      }
    }.start



    //  bean = new Art2KompareBean
    // bc.registerService(classOf[org.kermeta.art2.api.service.core.kompare.ModelKompareService].getName(), bean, new Hashtable());
  }

  def stop(bc : BundleContext){

    try{ provisioningServer } catch { case _ @ e => logger.error("Art2StopError", e)}

    try{ discoveryServer.stop } catch { case _ @ e => logger.error("Art2StopError", e)}
    try{discoveryClient.stop} catch { case _ @ e => logger.error("Art2StopError", e)}

    try{modelHandlerServiceTracker.close} catch { case _ @ e => logger.error("Art2StopError", e)}
    try{configServiceTracker.close} catch { case _ @ e => logger.error("Art2StopError", e)}
    //discoveryActor.stop
    try{modelSynchRemoteActor.stop} catch { case _ @ e => logger.error("Art2StopError", e)}
    try{art2dispatcher.stop} catch { case _ @ e => logger.error("Art2StopError", e)}
  }
}

