/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.core.impl

import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.kermeta.art2.framework.modelService._

case class Art2MetricsServiceBean(handler : Art2ModelHandlerService) extends MetricsService {

  def updatePortMetric(nodeName : String,componentName:String,portName:String,value :String,typeName : String)={
    println("UPDATE PMETRIC "+nodeName+"-"+componentName+"-"+portName)
  }
  def updateChannelMetric(nodeName : String,channelName:String,value :String,typeName : String)={
    println("UPDATE CMETRIC "+nodeName+"-"+channelName)
  }
  
}
