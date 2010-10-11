/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.jmdns

import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.kermeta.art2.api.service.remote.Art2Dispatcher
import org.kermeta.art2.api.service.remote.Art2ModelDispatcher
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.osgi.util.tracker.ServiceTracker
import org.kermeta.art2.api.configuration.ConfigConstants

class Art2JmDNSActivator extends BundleActivator {

//  var bean : Art2KompareBean = null
  var modelHandlerServiceTracker : ServiceTracker = null
  var modelDispatchServiceTracker : ServiceTracker = null
  var msgDispatcherServiceTracker : ServiceTracker = null
  var art2discovery : Art2DiscoveryActor = null


  def start(bc : BundleContext){

    modelHandlerServiceTracker = new ServiceTracker(bc,classOf[Art2ModelHandlerService].getName,null)

    modelDispatchServiceTracker = new ServiceTracker(bc,classOf[Art2ModelDispatcher].getName,null)
    msgDispatcherServiceTracker = new ServiceTracker(bc,classOf[Art2Dispatcher].getName,null)


    new Thread {
      override def run(){
        modelHandlerServiceTracker.open
        modelDispatchServiceTracker.open
        msgDispatcherServiceTracker.open

        var mhandler = modelHandlerServiceTracker.waitForService(10000).asInstanceOf[Art2ModelHandlerService]

        modelDispatchServiceTracker.waitForService(10000)
        msgDispatcherServiceTracker.waitForService(10000)

        var modelPort = modelDispatchServiceTracker.getServiceReference.getProperty(ConfigConstants.ART2_NODE_MODELSYNC_PORT.getValue).toString
        var msgPort = msgDispatcherServiceTracker.getServiceReference.getProperty(ConfigConstants.ART2_NODE_DISPATCHER_PORT.getValue).toString

     

        art2discovery = new Art2DiscoveryActor(30,mhandler,Integer.parseInt(msgPort),Integer.parseInt(modelPort))
        art2discovery.start

      }
    }.start
  }

  def stop(bc : BundleContext){
    modelHandlerServiceTracker.close
    modelDispatchServiceTracker.close
    msgDispatcherServiceTracker.close
    art2discovery.stop
  }
}