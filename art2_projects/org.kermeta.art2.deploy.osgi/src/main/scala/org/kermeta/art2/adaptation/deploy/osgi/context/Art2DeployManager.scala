/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.context

import org.kermeta.art2.api.service.adaptation.deploy.Art2AdaptationDeployService
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;import org.osgi.util.tracker.ServiceTracker


class Art2DeployManager {

  var bundle : Bundle = null
  def setBundle(b : Bundle)  = { bundle = b }
  var bundleContext : BundleContext = null;
  def setBundleContext(bc : BundleContext) = bundleContext = bc
  //var bundleContainer : BlueprintContainer = null;
 // def setBundleContainer(bc : BlueprintContainer) = bundleContainer = bc
 // var modelHandler : Art2ModelHandlerService = null;
//  def setModelHandler(mh : Art2ModelHandlerService) = modelHandler = mh

  var bundleMapping : java.util.List[Art2OSGiBundle] = new java.util.ArrayList[Art2OSGiBundle]();

  def setModelHandlerServiceTracker(st : ServiceTracker) = modelHandlerServiceTracker = st
  private var modelHandlerServiceTracker : ServiceTracker = null
  def getServiceHandler : Art2ModelHandlerService = modelHandlerServiceTracker.getService.asInstanceOf[Art2ModelHandlerService]

  

}


