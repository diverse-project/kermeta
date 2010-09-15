/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.kompare

import java.util.Hashtable
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

class Art2KompareActivator extends BundleActivator {

  var bean : Art2KompareBean = null

  def start(bc : BundleContext){
    bean = new Art2KompareBean
    bc.registerService(classOf[org.kermeta.art2.api.service.core.kompare.ModelKompareService].getName(), bean, new Hashtable());
  }

  def stop(bc : BundleContext){
    bean = null
  }
}
