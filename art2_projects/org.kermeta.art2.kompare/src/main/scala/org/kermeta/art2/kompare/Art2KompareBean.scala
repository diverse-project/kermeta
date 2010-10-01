/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.kompare

import org.kermeta.art2._
import org.kermeta.art2.kompare.sub.AbstractKompare
import org.kermeta.art2.kompare.sub.InitNodeKompare
import org.kermeta.art2.kompare.sub.StopNodeKompare
import org.kermeta.art2.kompare.sub.UpdateNodeKompare
import org.kermeta.art2adaptation._
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.aspects.Art2Aspects._

class Art2KompareBean extends org.kermeta.art2.api.service.core.kompare.ModelKompareService with InitNodeKompare with StopNodeKompare with UpdateNodeKompare with AbstractKompare  {

  def kompare(actualModel : ContainerRoot,targetModel:ContainerRoot,nodeName : String) : AdaptationModel = {

    var adaptationModel = org.kermeta.art2adaptation.Art2adaptationFactory.eINSTANCE.createAdaptationModel
    //STEP 0 - FOUND LOCAL NODE
    var actualLocalNode = actualModel.getNodes.find{c=> c.getName==nodeName }
    var updateLocalNode = targetModel.getNodes.find{c=> c.getName==nodeName }
    updateLocalNode match {
      case Some(uln)=> {
          
          actualLocalNode match {
            case Some(aln)=> getUpdateNodeAdaptationModel(aln,uln) //UPDATE
            case None=> getInitNodeAdaptationModel(uln)
          }
        }
      case None=> {
          actualLocalNode match {
            case Some(aln) => getStopNodeAdaptationModel(aln)
            case None => {
                adaptationModel
                /* BEST EFFORT PREPARE PLATEFORM */
                //updateAllThirdParties(actualModel,targetModel)
              }
          }
        }
    }
  }

  


}
