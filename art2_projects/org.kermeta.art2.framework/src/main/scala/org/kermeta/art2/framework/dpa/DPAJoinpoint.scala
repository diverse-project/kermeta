/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.dpa

trait DPAJoinpoint {

  def getJoinpointElement(name : String)

  def getNames : List[String]

}
