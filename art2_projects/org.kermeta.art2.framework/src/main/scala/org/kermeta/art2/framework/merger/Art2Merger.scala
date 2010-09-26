/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.merger

import org.kermeta.art2.ContainerRoot

trait Art2Merger {

  def merge(actualModel : ContainerRoot,modelToMerge : ContainerRoot) : Unit



}
