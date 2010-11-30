/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.message

case class Art2MetricsPortUpdate(componentName:String,portName:String,value:String,typeName:String)
case class Art2MetricsChannelUpdate(channelName:String,value:String,typeName:String)