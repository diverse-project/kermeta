/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.merger.sub._

object Art2RootMerger extends Art2TypeDefinitionMerger {

  def merge(actualModel : ContainerRoot,modelToMerge : ContainerRoot) : Unit = {

    println(actualModel.hashCode)

    if(modelToMerge!= null){
      // Art2DeployUnitMerger.merge(actualModel, modelToMerge)
      mergeTypeDefinition(actualModel, modelToMerge)
      Art2TypeLibraryMerger.merge(actualModel, modelToMerge)
    }
  }

  


}
