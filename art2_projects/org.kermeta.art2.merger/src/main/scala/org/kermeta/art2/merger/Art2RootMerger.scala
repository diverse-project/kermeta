/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.merger.sub.Art2NodeMerger
import org.kermeta.art2.merger.sub.Art2RepositoryMerger
import org.kermeta.art2.merger.sub.Art2TypeDefinitionMerger
import org.kermeta.art2.merger.sub.Art2TypeLibraryMerger

class Art2RootMerger extends Art2TypeDefinitionMerger with Art2TypeLibraryMerger with Art2NodeMerger with Art2RepositoryMerger {

  override def merge(actualModel : ContainerRoot,modelToMerge : ContainerRoot) : Unit = {
    if(modelToMerge!= null){
      // Art2DeployUnitMerger.merge(actualModel, modelToMerge)
      mergeTypeDefinition(actualModel, modelToMerge)
      mergeLibrary(actualModel, modelToMerge)

      mergeAllNode(actualModel, modelToMerge)

      mergeRepositories(actualModel, modelToMerge)

      executePostProcesses

    }
  }

  


}
