/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.osgi

import java.util.Hashtable
import org.kermeta.art2.framework.Art2ChannelFragment
import org.kermeta.art2.framework.Constants
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import scala.collection.JavaConversions._

abstract class Art2ChannelFragmentActivator extends BundleActivator {

  def callFactory() : Art2ChannelFragment
  var nodeName : String = ""
  var componentName : String = ""
  var channelActor : Art2ChannelFragment = null
  var bundleContext : BundleContext = null

  def start(bc : BundleContext){
    bundleContext = bc
    /* SEARCH HEADERS VALUE */
    nodeName = bc.getBundle.getHeaders.find(dic => dic._1 == Constants.ART2_NODE_NAME_HEADER).get._2.toString
    componentName = bc.getBundle.getHeaders.find(dic => dic._1 == Constants.ART2_INSTANCE_NAME_HEADER).get._2.toString
    /* Create component actor */
    channelActor = callFactory()
    /* Start actor */
    channelActor.start
    /* Expose component in OSGI */
    var props = new Hashtable[String,String]()
    props.put(Constants.ART2_NODE_NAME, nodeName)
    props.put(Constants.ART2_INSTANCE_NAME, componentName)
    bc.registerService(classOf[Art2ChannelFragment].getName(), channelActor, props);

    /* PUT INITIAL PROPERTIES */
    channelActor.getDictionary.put(Constants.ART2_PROPERTY_OSGI_BUNDLE, bc.getBundle)

    //channelActor.startChannelFragment //DEPRECATED DONE BY DEPLOY
  }

  def stop(bc : BundleContext){
    channelActor.stop
    //channelActor.stopChannelFragment //DEPRECATED DONE BY DEPLOY
    channelActor = null
  }
}
