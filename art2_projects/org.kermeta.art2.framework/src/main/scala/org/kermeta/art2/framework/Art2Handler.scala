/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.framework.merger.Art2DeployUnitMerger
import org.kermeta.art2.framework.merger.Art2TypeDefinitionMerger
import org.kermeta.art2.framework.merger.Art2TypeLibraryMerger
import org.kermeta.art2.Art2Factory
import scala.collection.JavaConversions._

class Art2Handler {

  //TODO LOCK OBJECT

  private var actualModel : ContainerRoot = Art2Factory.eINSTANCE.createContainerRoot

  def merge(modelToMerge : ContainerRoot) : Unit = {
    if(modelToMerge!= null){
      Art2DeployUnitMerger.merge(actualModel, modelToMerge)
      Art2TypeDefinitionMerger.merge(actualModel, modelToMerge)
      Art2TypeLibraryMerger.merge(actualModel, modelToMerge)
    }
  }

  /* ACESSOR TO MODEL */
  def getActualModel : ContainerRoot = {actualModel}

  def setActualModel(c : ContainerRoot) = {
    actualModel = c
  }
}
