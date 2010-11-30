/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.dpa

import org.kermeta.art2.ContainerRoot

trait DPAPointcut {

  def searchJointpoints(root : ContainerRoot,nodeName : String) : DPAJoinpoint

}
