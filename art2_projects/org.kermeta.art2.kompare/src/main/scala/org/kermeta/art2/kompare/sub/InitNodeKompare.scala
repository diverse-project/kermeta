/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.kompare.sub

import org.kermeta.art2._
import org.kermeta.art2adaptation._
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.aspects.Art2Aspects._

trait InitNodeKompare extends AbstractKompare {

  def getInitNodeAdaptationModel(node:ContainerNode):AdaptationModel= {
    var adaptationModel = org.kermeta.art2adaptation.Art2adaptationFactory.eINSTANCE.createAdaptationModel
    logger.info("INIT NODE "+node.getName)
    //UPDATE ALL COMPONENT TYPE

    var root = node.eContainer.asInstanceOf[ContainerRoot]
    
    /* add type */
    node.getUsedTypeDefinition.foreach{ct=>
      var typecmd = Art2adaptationFactory.eINSTANCE.createAddType
      typecmd.setRef(ct)
      adaptationModel.getAdaptations.add(typecmd)

      /* add all reLib */
      ct.getRequiredLibs.foreach{rLib =>
        var addcttp = Art2adaptationFactory.eINSTANCE.createAddThirdParty
        addcttp.setRef(rLib)
        adaptationModel.getAdaptations.add(addcttp)
      }
    }
    
    /* add component */
    node.getInstances.foreach({c =>
        var addccmd = Art2adaptationFactory.eINSTANCE.createAddInstance
        addccmd.setRef(c)
        adaptationModel.getAdaptations.add(addccmd)
      })
    

    /* add FRAGMENT binding */
    root.getHubs.foreach{channel =>
      channel.getOtherFragment(node.getName).foreach{remoteName =>
        var addccmd = Art2adaptationFactory.eINSTANCE.createAddFragmentBinding
        addccmd.setRef(channel)
        addccmd.setTargetNodeName(remoteName)
        adaptationModel.getAdaptations.add(addccmd)
      }
    }
    
    /* add mbinding */
    root.getMBindings.foreach{b=>
      if(b.getPort.eContainer.eContainer == node){
        var addcmd = Art2adaptationFactory.eINSTANCE.createAddBinding
        addcmd.setRef(b)
        adaptationModel.getAdaptations.add(addcmd)
      }
    }

    adaptationModel
  }
}
