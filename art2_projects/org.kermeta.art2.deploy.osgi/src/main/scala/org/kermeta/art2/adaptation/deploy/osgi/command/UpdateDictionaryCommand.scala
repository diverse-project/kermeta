/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2._
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2OSGiBundle
import org.kermeta.art2.framework.Art2Component
import org.kermeta.art2.framework.Constants
import org.kermeta.art2.framework.message.Art2StartMessage
import org.kermeta.art2.framework.message.Art2UpdateDictionaryMessage
import org.kermeta.art2.framework.Art2Actor
import scala.collection.JavaConversions._
import scala.collection.JavaConversions._

case class UpdateDictionaryCommand(c : Instance, ctx : Art2DeployManager,nodeName:String) extends PrimitiveCommand {

  def execute() : Boolean= {
    if(c.getDictionary != null){
      
      //BUILD MAP
      var dictionary : java.util.HashMap[String,String]= new java.util.HashMap[String,String]
      c.getTypeDefinition.getDictionaryType.getDefaultValues.foreach{dv=>
        dictionary.put(dv.getAttribute.getName, dv.getValue)
      }
      c.getDictionary.getValues.foreach{v=>
        dictionary.put(v.getAttribute.getName, v.getValue)
      }

      ctx.bundleMapping.find(map=>map.objClass == c.getClass && map.name == c.getName) match {
        case None => false
        case Some(mapfound)=> {
            var componentBundle = mapfound.bundle
            componentBundle.getRegisteredServices.find({sr=> sr.getProperty(Constants.ART2_NODE_NAME)==nodeName && sr.getProperty(Constants.ART2_INSTANCE_NAME)==c.getName }) match {
              case None => false
              case Some(sr)=> (componentBundle.getBundleContext.getService(sr).asInstanceOf[Art2Actor] !? Art2UpdateDictionaryMessage(dictionary) ).asInstanceOf[Boolean]
            }
          }
      }} else {
      true
    }
  }

  def undo() = {
    StopComponentCommand(c,ctx,nodeName)
  }

}
