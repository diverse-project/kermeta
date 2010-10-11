/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.core.impl

import java.util.Hashtable
import org.kermeta.art2.api.configuration.ConfigurationService
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.osgi.util.tracker.ServiceTracker

class Art2CoreActivator extends BundleActivator {

  var myBean : Art2CoreBean = null
  var kompareServiceTracker : ServiceTracker = null
  var deployServiceTracker : ServiceTracker = null

  def start(bc : BundleContext){

    //START CONFIG SERVICE
    var configBean = new Art2ConfigServiceBean
    bc.registerService(classOf[ConfigurationService].getName(), configBean, new Hashtable());


    myBean = new Art2CoreBean
    myBean.setBundleContext(bc)
    kompareServiceTracker = new ServiceTracker(bc,classOf[org.kermeta.art2.api.service.core.kompare.ModelKompareService].getName,null)
    deployServiceTracker = new ServiceTracker(bc,classOf[org.kermeta.art2.api.service.adaptation.deploy.Art2AdaptationDeployService].getName,null)
    new Thread {
      override def run(){
        kompareServiceTracker.open
        deployServiceTracker.open

        myBean.setKompareService(kompareServiceTracker.waitForService(10000).asInstanceOf[org.kermeta.art2.api.service.core.kompare.ModelKompareService])
        myBean.setDeployService(deployServiceTracker.waitForService(10000).asInstanceOf[org.kermeta.art2.api.service.adaptation.deploy.Art2AdaptationDeployService])
        myBean.start
        /* TODO CHECK UNSET SERVICE */

        /* EXPOSE SERVICE */
        bc.registerService(classOf[Art2ModelHandlerService].getName(), myBean, new Hashtable());

      }
    }.start

  }

  def stop(bc : BundleContext){

    myBean.stop
    kompareServiceTracker.close
    deployServiceTracker.close
  }

}
