/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger

import org.kermeta.art2.ContainerRoot
import scala.collection.JavaConversions._

trait Art2Merger {

  private var postProcess : List[ () => Unit ] = List()
  def addPostProcess(nq : ()=>Unit) = {
    postProcess = postProcess ++ List(nq)
  }
  def executePostProcesses = {
    postProcess.foreach{nq => nq() }
    postProcess = List()
  }


  def merge(actualModel : ContainerRoot,modelToMerge : ContainerRoot) : Unit

}
