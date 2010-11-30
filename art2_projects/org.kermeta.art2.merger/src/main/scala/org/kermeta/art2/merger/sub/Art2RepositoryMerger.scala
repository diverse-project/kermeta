/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger.sub

import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.DeployUnit
import org.kermeta.art2.Repository
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.aspects.Art2Aspects._

trait Art2RepositoryMerger {

  //EXPECT TYPE DEFINITION TO BE MERGE BEFORE THIS STEP
  def mergeRepositories(actualModel : ContainerRoot,modelToMerge : ContainerRoot) : Unit = {
    var ctRepo : List[Repository] = List()++modelToMerge.getRepositories.toList
    ctRepo.foreach{toMergeRepo=>
      actualModel.getRepositories.find(lr=> lr.getUrl == toMergeRepo.getUrl) match {
        case Some(found_repo)=> mergeRepository(actualModel,found_repo,toMergeRepo)
        case None => {
            var newrepo = Art2Factory.eINSTANCE.createRepository
            newrepo.setUrl(toMergeRepo.getUrl)
            actualModel.getRepositories.add(newrepo)
            mergeRepository(actualModel,newrepo,toMergeRepo)
          }
      }
    }
  }


  def mergeRepository(actualRoot : ContainerRoot,actualRepository : Repository,toMergeRepository : Repository) : Unit = {
    var toMergeUnits : List[DeployUnit] = List()++toMergeRepository.getUnits.toList
    toMergeUnits.foreach{unit=>

      //ACTUAL UNIT
      var found_unit = actualRoot.getDeployUnits.find(du=>du.isModelEquals(unit) && du.getHashcode == unit.getHashcode)
      found_unit match {
        case None => println("Merger Error !!!!! Repository Incomplete")
        case Some(funit)=> {
            //CLEAN REPO FROM OLD DEPLOY UNIT
            actualRepository.getUnits.filter(u=> u.isModelEquals(funit) && u.getHashcode != funit.getHashcode  ).foreach{oldunit=>
              actualRepository.getUnits.remove(oldunit)
            }
            //ADD NEW UNIT TO REPO
            actualRepository.getUnits.find(u=> u == funit) match {
              case None => actualRepository.getUnits.add(funit)
              case Some(u)=> //NOTHING TO DO
            }
          }
      }
    }
  }

}
