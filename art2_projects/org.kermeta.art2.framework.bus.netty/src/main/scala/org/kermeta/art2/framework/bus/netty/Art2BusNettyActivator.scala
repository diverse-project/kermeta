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
import org.kermeta.art2.framework.bus.netty.remote.Art2DispatcherActor
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
  var discoveryActor : Art2PlatformDiscoveryActor = null
  var modelSynchRemoteActor : Art2ModelSynch = null
  var art2dispatcher : Art2DispatcherActor = null
  var logger = LoggerFactory.getLogger(this.getClass);

  def start(bc : BundleContext){

    
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
        if(modelDispatcherPort == Constants.ART2_PORT_AUTO){
          var i = 8000
          var found = false
          while( (!found) && (i<9000) ){
            if(NetworkUtility.available(i)){
              modelDispatcherPort = i.toString
              found = true
            }
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
          var i = 8000
          var found = false
          while( (!found) && (i<9000) ){
            if(NetworkUtility.available(i)){
              msgDispatcherPort = i.toString
              found = true
            }
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


      }
    }.start



    //  bean = new Art2KompareBean
    // bc.registerService(classOf[org.kermeta.art2.api.service.core.kompare.ModelKompareService].getName(), bean, new Hashtable());
  }

  def stop(bc : BundleContext){
    modelHandlerServiceTracker.close
    configServiceTracker.close
    //discoveryActor.stop
    modelSynchRemoteActor.stop
    art2dispatcher.stop
  }
}

