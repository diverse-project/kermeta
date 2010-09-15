/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi

import java.util.Hashtable
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

class Art2DeployActivator extends BundleActivator {

  var bean : Art2AdaptationDeployServiceOSGi = null
  var context : Art2DeployManager = null

  def start(bc : BundleContext){
    context = new Art2DeployManager
    context.setBundle(bc.getBundle)
    context.setBundleContext(bc)

    bean = new Art2AdaptationDeployServiceOSGi
    bean.setContext(context)

    bc.registerService(classOf[org.kermeta.art2.api.service.adaptation.deploy.Art2AdaptationDeployService].getName(), bean, new Hashtable());
  }

  def stop(bc : BundleContext){
    bean = null
    context = null
  }
}