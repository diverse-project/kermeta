/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi

import java.util.Hashtable
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import org.osgi.service.packageadmin.PackageAdmin
import org.osgi.util.tracker.ServiceTracker

class Art2DeployActivator extends BundleActivator {

  var bean : Art2AdaptationDeployServiceOSGi = null
  var context : Art2DeployManager = null
  var modelHandlerServiceTracker : ServiceTracker = null

  var packageAdminServiceTracker : ServiceTracker = null

  def start(bc : BundleContext){
    modelHandlerServiceTracker = new ServiceTracker(bc,classOf[Art2ModelHandlerService].getName,null)
    packageAdminServiceTracker = new ServiceTracker(bc,classOf[PackageAdmin].getName,null)

    modelHandlerServiceTracker.open
    packageAdminServiceTracker.open

    context = new Art2DeployManager
    context.setBundle(bc.getBundle)
    context.setBundleContext(bc)
    context.setModelHandlerServiceTracker(modelHandlerServiceTracker)
    context.setPackageAdminServiceTracker(packageAdminServiceTracker)

    bean = new Art2AdaptationDeployServiceOSGi
    bean.setContext(context)

    bc.registerService(classOf[org.kermeta.art2.api.service.adaptation.deploy.Art2AdaptationDeployService].getName(), bean, new Hashtable());
  }

  def stop(bc : BundleContext){
    modelHandlerServiceTracker.close
    packageAdminServiceTracker.close
    bean = null
    context = null
  }
}