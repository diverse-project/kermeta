/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.merger.sub.Art2TypeDefinitionMerger
import org.kermeta.art2.merger.sub.Art2TypeLibraryMerger

class Art2RootMerger extends Art2TypeDefinitionMerger with Art2TypeLibraryMerger {

  override def merge(actualModel : ContainerRoot,modelToMerge : ContainerRoot) : Unit = {
    if(modelToMerge!= null){
      // Art2DeployUnitMerger.merge(actualModel, modelToMerge)
      mergeTypeDefinition(actualModel, modelToMerge)
      mergeLibrary(actualModel, modelToMerge)
      executePostProcesses

    }
  }

  


}
