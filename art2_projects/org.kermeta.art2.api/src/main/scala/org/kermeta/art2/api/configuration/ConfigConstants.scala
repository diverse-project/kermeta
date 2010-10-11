/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.api.configuration

object ConfigConstants extends Enumeration {
  type Value = ConfigConstant
  case class ConfigConstant(value : String,defaultValue : String) extends Val(value){
    def getValue = value
    def getDefaultValue = defaultValue
  }
  val ART2_NODE_NAME = ConfigConstant("node.name","art2DefaultNodeName")
  val ART2_NODE_MODELSYNC_PORT = ConfigConstant("node.modelsync.port","auto")
  val ART2_NODE_DISPATCHER_PORT = ConfigConstant("node.dispatcher.port","auto")
  val ART2_CONFIG = ConfigConstant("art2.config",null)
}