/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.dpa

import org.kermeta.art2.ContainerRoot
import java.util.{List=> jul}

trait DPATransformation {

  def getCost(dpaP : DPAPointcut,nodeName : String) : DPACost

  def getImpactedMetricTypes(nodeName : String) : jul[DPAMetricTypeEvolution]

  def getImpactedMetrics(dapP : DPAPointcut,nodeName : String) : jul[DPAMetricEvolution]

  def perform(dpaP : DPAPointcut,root : ContainerRoot,nodeName : String) : Boolean

}
