/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.merger.sub

import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.DeployUnit
import org.kermeta.art2.merger.Art2Merger
import scala.collection.JavaConversions._

trait Art2DeployUnitMerger extends Art2Merger {


  def mergeDeployUnit(actualModel : ContainerRoot,tp : DeployUnit) : DeployUnit = {
    actualModel.getDeployUnits.find({atp=> atp.getName == tp.getName}) match {
      case Some(ftp)=> {
          //CHECK CONSISTENCY, IF NOT JUST ADD
          if(tp.getUrl != ftp.getUrl || tp.getUnitName != ftp.getUnitName || tp.getGroupName != ftp.getGroupName || tp.getVersion != ftp.getVersion  ){
            actualModel.getDeployUnits.add(tp);tp
          } else {
            this.addPostProcess({ ()=> { ftp.setHashcode(tp.getHashcode) } })
            ftp
          }
        }
      case None => {
          actualModel.getDeployUnits.add(tp);tp
        }
    }
  }


/*

  def merge(actualModel : ContainerRoot,modelToMerge : ContainerRoot) : Unit = {
    /* STEP 0 MERGE PARTY */
    var tps : List[DeployUnit] = List()++modelToMerge.getDeployUnits.toList
    tps.foreach{tp=>
      mergeDeployUnit(actualModel,tp)
    }
  }*/
}
