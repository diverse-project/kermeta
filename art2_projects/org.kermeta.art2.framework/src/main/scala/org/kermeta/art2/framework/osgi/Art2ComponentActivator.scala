/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.osgi

import java.util.Hashtable
import org.kermeta.art2.framework.Art2Component
import org.kermeta.art2.framework.Art2Port
import org.kermeta.art2.framework.Constants
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext
import scala.collection.JavaConversions._


/* ABSTRACT COMPONENT */
abstract class Art2ComponentActivator extends BundleActivator {

  def callFactory() : Art2Component
  var nodeName : String = ""
  var componentName : String = ""
  var componentActor : Art2Component = null
  var bundleContext : BundleContext = null

  def start(bc : BundleContext){
    bundleContext = bc
    /* SEARCH HEADERS VALUE */
    nodeName = bc.getBundle.getHeaders.find(dic => dic._1 == Constants.ART2_NODE_NAME_HEADER).get._2.toString
    componentName = bc.getBundle.getHeaders.find(dic => dic._1 == Constants.ART2_INSTANCE_NAME_HEADER).get._2.toString
    /* Create component actor */
    componentActor = callFactory()

    /* PUT INITIAL PROPERTIES */
    componentActor.getArt2ComponentType.getDictionary.put(Constants.ART2_PROPERTY_OSGI_BUNDLE, bc.getBundle)

    /* Start actor */
    componentActor.start
    /* Expose component in OSGI */
    var props = new Hashtable[String,String]()
    props.put(Constants.ART2_NODE_NAME, nodeName)
    props.put(Constants.ART2_INSTANCE_NAME, componentName)
    bc.registerService(classOf[Art2Component].getName(), componentActor, props);

    /* Expose component provided port in OSGI */
    componentActor.getArt2ComponentType.getHostedPorts.foreach{hpref=>
      var portProps = new Hashtable[String,String]()
      portProps.put(Constants.ART2_NODE_NAME, nodeName)
      portProps.put(Constants.ART2_INSTANCE_NAME, componentName)
      portProps.put(Constants.ART2_PORT_NAME, hpref._1)
      bc.registerService(classOf[Art2Port].getName(), hpref._2, portProps);
    }

    /* START NEEDPORT ACTOR */
    componentActor.getArt2ComponentType.getNeededPorts.foreach{np=>np._2.asInstanceOf[Art2Port].start}

    /* START HOSTED ACTOR */
    componentActor.getArt2ComponentType.getHostedPorts.foreach{hp=>hp._2.asInstanceOf[Art2Port].start}


  }

  def stop(bc : BundleContext){
    /* STOP NEEDED PORT */
    componentActor.getArt2ComponentType.getNeededPorts.foreach{np=>np._2.asInstanceOf[Art2Port].stop}
    /* STOP NEEDED PORT */
    componentActor.getArt2ComponentType.getHostedPorts.foreach{hp=>hp._2.asInstanceOf[Art2Port].stop}

    componentActor.stop
    componentActor = null
  }

}
