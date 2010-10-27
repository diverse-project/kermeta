/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.Art2Factory
import org.kermeta.art2.merger.Art2MergerComponent
import scala.collection.JavaConversions._

class Art2Handler {

  private var merger = new Art2MergerComponent
  private var actualModel : ContainerRoot = Art2Factory.eINSTANCE.createContainerRoot

  def merge(modelToMerge : ContainerRoot) : Unit = {
    actualModel = merger.merge(actualModel, modelToMerge)

   // merger.Art2RootMerger.merge(actualModel, modelToMerge)
  }

  /* ACESSOR TO MODEL */
  def getActualModel : ContainerRoot = {actualModel}

  def setActualModel(c : ContainerRoot) = {
    actualModel = c
  }
}
