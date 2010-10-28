/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.kompare.sub

import org.kermeta.art2._
import org.kermeta.art2adaptation._
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.aspects.Art2Aspects._

trait UpdateChannelKompare {

  def getUpdateChannelAdaptationModel(actualChannel : Channel,updateChannel : Channel,nodeName : String) : AdaptationModel = {
    var adaptationModel = org.kermeta.art2adaptation.Art2adaptationFactory.eINSTANCE.createAdaptationModel

    updateChannel.getOtherFragment(nodeName).foreach{newhubBindingNodeName=>
      actualChannel.getOtherFragment(nodeName).find(b=> b == newhubBindingNodeName) match {
        case None => {
            //NEW BINDING TODO
            var addccmd = Art2adaptationFactory.eINSTANCE.createAddFragmentBinding
            addccmd.setRef(updateChannel)
            addccmd.setTargetNodeName(newhubBindingNodeName)
            adaptationModel.getAdaptations.add(addccmd)
          }
        case Some(bname)=> //OK ALREADY BINDED
      }
    }
    actualChannel.getOtherFragment(nodeName).foreach{previousHubBindingNodeName=>
      updateChannel.getOtherFragment(nodeName).find(b=> b ==previousHubBindingNodeName) match {
        case None => {
            //REMOVE BINDING TODO
            var addccmd = Art2adaptationFactory.eINSTANCE.createRemoveFragmentBinding
            addccmd.setRef(updateChannel)
            addccmd.setTargetNodeName(previousHubBindingNodeName)
            adaptationModel.getAdaptations.add(addccmd)
          }
        case Some(bname)=> //OK ALREADY BINDED
      }
    }
    adaptationModel
  }

}
