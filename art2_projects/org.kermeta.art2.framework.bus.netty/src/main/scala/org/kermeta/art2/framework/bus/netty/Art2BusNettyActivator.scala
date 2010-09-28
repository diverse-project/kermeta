/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.netty

import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.kermeta.art2.framework.bus.netty.remote.Art2DispatcherActor
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.osgi.util.tracker.ServiceTracker

class Art2BusNettyActivator extends BundleActivator {

//  var bean : Art2KompareBean = null
  var modelHandlerServiceTracker : ServiceTracker = null
  var discoveryActor : Art2PlatformDiscoveryActor = null
  var modelSynchRemoteActor : Art2ModelSynch = null
  var art2dispatcher : Art2DispatcherActor = null


  def start(bc : BundleContext){

    modelHandlerServiceTracker = new ServiceTracker(bc,classOf[Art2ModelHandlerService].getName,null)

    new Thread {
      override def run(){
        modelHandlerServiceTracker.open
        var mhandler = modelHandlerServiceTracker.waitForService(10000).asInstanceOf[Art2ModelHandlerService]

        //discoveryActor = new Art2PlatformDiscoveryActor(8081,8080,mhandler)
        modelSynchRemoteActor = new Art2ModelSynch(8081,mhandler)
        modelSynchRemoteActor.start
        //discoveryActor.start


        art2dispatcher = new Art2DispatcherActor(8080,bc)
      //  art2dispatcher = new Art2Dispatcher(8080,bc)
        art2dispatcher.start

      }
    }.start



    //  bean = new Art2KompareBean
    // bc.registerService(classOf[org.kermeta.art2.api.service.core.kompare.ModelKompareService].getName(), bean, new Hashtable());
  }

  def stop(bc : BundleContext){
    modelHandlerServiceTracker.close
    //discoveryActor.stop
    modelSynchRemoteActor.stop
    art2dispatcher.stop
  }
}

