/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.jgroup

import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.kermeta.art2.api.service.remote.Art2Dispatcher
import org.kermeta.art2.api.service.remote.Art2ModelDispatcher
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.osgi.util.tracker.ServiceTracker
import org.kermeta.art2.api.configuration.ConfigConstants

class Art2JgroupActivator extends BundleActivator {
//  var bean : Art2KompareBean = null
  var modelHandlerServiceTracker : ServiceTracker = null
  var art2modelsynch : Art2JgroupModelSynchActor = null


  def start(bc : BundleContext){

    modelHandlerServiceTracker = new ServiceTracker(bc,classOf[Art2ModelHandlerService].getName,null)

    new Thread {
      override def run(){
        modelHandlerServiceTracker.open
        var mhandler = modelHandlerServiceTracker.waitForService(10000).asInstanceOf[Art2ModelHandlerService]

        var protocolPath : String = this.getClass.getClassLoader.getResource("udp.xml").getFile

        art2modelsynch = new Art2JgroupModelSynchActor(mhandler,protocolPath)
        art2modelsynch.start

      }
    }.start
  }

  def stop(bc : BundleContext){
    modelHandlerServiceTracker.close
    art2modelsynch.stop
  }
}
