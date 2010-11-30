/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.modelService

trait MetricsService {

  def updatePortMetric(nodeName : String,componentName:String,portName:String,value :String,typeName : String)
  def updateChannelMetric(nodeName : String,ChannelName:String,value :String,typeName : String)

}
