/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.bus.jmdns

import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.osgi.util.tracker.ServiceTracker

class Art2JmDNSActivator extends BundleActivator {

//  var bean : Art2KompareBean = null
  var modelHandlerServiceTracker : ServiceTracker = null
  var art2discovery : Art2DiscoveryActor = null


  def start(bc : BundleContext){

    modelHandlerServiceTracker = new ServiceTracker(bc,classOf[Art2ModelHandlerService].getName,null)

    new Thread {
      override def run(){
        modelHandlerServiceTracker.open
        var mhandler = modelHandlerServiceTracker.waitForService(10000).asInstanceOf[Art2ModelHandlerService]

        art2discovery = new Art2DiscoveryActor(20000,mhandler,8080,8081)
        art2discovery.start

      }
    }.start
  }

  def stop(bc : BundleContext){
    modelHandlerServiceTracker.close
    art2discovery.stop
  }
}