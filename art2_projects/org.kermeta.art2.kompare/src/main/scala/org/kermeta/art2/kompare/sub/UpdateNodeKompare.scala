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

trait UpdateNodeKompare {
  
  var logger = LoggerFactory.getLogger(this.getClass);
  
  def getUpdateNodeAdaptationModel(actualNode : ContainerNode,updateNode : ContainerNode) : AdaptationModel = {
    var adaptationModel = org.kermeta.art2adaptation.Art2adaptationFactory.eINSTANCE.createAdaptationModel
    logger.info("INIT NODE "+actualNode.getName)

    
    var actualRoot = actualNode.eContainer.asInstanceOf[ContainerRoot]
    var updateRoot = updateNode.eContainer.asInstanceOf[ContainerRoot]
    
    //Update Type Step
    updateNode.getUsedTypeDefinition.foreach{uct=>
      actualNode.getUsedTypeDefinition.find({act=> act.isModelEquals(uct) }) match {
        case Some(ct)=> //OK TODO CHECK HASHCODE
        case None => {
            var ctcmd = Art2adaptationFactory.eINSTANCE.createAddType
            ctcmd.setRef(uct)
            adaptationModel.getAdaptations.add(ctcmd)

            //ADD USED THIRDPARTY
            uct.getRequiredLibs.foreach{tp=>
              var adaptcmd = Art2adaptationFactory.eINSTANCE.createAddThirdParty
              adaptcmd.setRef(tp)
              adaptationModel.getAdaptations.add(adaptcmd)
            }

          }
      }
    }
    actualNode.getUsedTypeDefinition.foreach{act=>
      updateNode.getUsedTypeDefinition.find({uct=> uct.isModelEquals(act) }) match {
        case Some(ct)=> //OK TODO CHECK HASHCODE
        case None => {
            var ctcmd = Art2adaptationFactory.eINSTANCE.createRemoveType
            ctcmd.setRef(act)
            adaptationModel.getAdaptations.add(ctcmd)

            //TODO REMOVE TIRDPARTY

          }
      }
    }

    //INSTANCE STEP
    updateNode.getInstances.foreach{uc=>
      actualNode.getInstances.find({ac=> ac.isModelEquals(uc) }) match {
        case Some(c)=>{
            //OK CHECK FOR UPDATE
            //TODO CHECK UPDATE
          }
        case None => {
            var ccmd = Art2adaptationFactory.eINSTANCE.createAddInstance
            ccmd.setRef(uc)
            adaptationModel.getAdaptations.add(ccmd)
          }
      }
    }
    actualNode.getInstances.foreach{ac=>
      updateNode.getInstances.find({uc=> uc.isModelEquals(ac) }) match {
        case Some(c)=> //OK
        case None => {
            var ccmd = Art2adaptationFactory.eINSTANCE.createRemoveInstance
            ccmd.setRef(ac)
            adaptationModel.getAdaptations.add(ccmd)
          }
      }
    }

    //Binding Step
    updateRoot.getMBindings.filter(mb=>mb.getPort.eContainer.eContainer.asInstanceOf[ContainerNode].getName == actualNode.getName).foreach{uct=>
      actualRoot.getMBindings.filter(mb=>mb.getPort.eContainer.eContainer.asInstanceOf[ContainerNode].getName == updateNode.getName).find({act=> act.isModelEquals(uct) }) match {
        case Some(ct)=> //OK
        case None => {
            var ctcmd = Art2adaptationFactory.eINSTANCE.createAddBinding
            ctcmd.setRef(uct)
            adaptationModel.getAdaptations.add(ctcmd)
          }
      }
    }
    actualRoot.getMBindings.filter(mb=>mb.getPort.eContainer.eContainer.asInstanceOf[ContainerNode].getName == actualNode.getName).foreach{act=>
      updateRoot.getMBindings.filter(mb=>mb.getPort.eContainer.eContainer.asInstanceOf[ContainerNode].getName == updateNode.getName).find({uct=> uct.isModelEquals(act) }) match {
        case Some(ct)=> //OK
        case None => {
            var ctcmd = Art2adaptationFactory.eINSTANCE.createRemoveBinding
            ctcmd.setRef(act)
            adaptationModel.getAdaptations.add(ctcmd)
          }
      }
    }



    //FRAGMENT BINDING STEP
    //ONLY CHECK FOR HUB NO UNINSTALL
    updateRoot.getHubs.foreach{newhub=>

      var previousHub = actualRoot.getHubs.find(hub=> newhub.getName == hub.getName) match {
        case None => // NOTHING TO DO HUB WILL BE UNINSTALL, NO UNBIND IS NECESSARY
        case Some(previousHub)=>{
            newhub.getOtherFragment(updateNode.getName).foreach{newhubBindingNodeName=>
              previousHub.getOtherFragment(actualNode.getName).find(b=> b ==newhubBindingNodeName) match {
                case None => {
                    //NEW BINDING TODO
                    var addccmd = Art2adaptationFactory.eINSTANCE.createAddFragmentBinding
                    addccmd.setRef(newhub)
                    addccmd.setTargetNodeName(newhubBindingNodeName)
                    adaptationModel.getAdaptations.add(addccmd)
                  }
                case Some(bname)=> //OK ALREADY BINDED
              }
            }
            previousHub.getOtherFragment(actualNode.getName).foreach{previousHubBindingNodeName=>
              newhub.getOtherFragment(updateNode.getName).find(b=> b ==previousHubBindingNodeName) match {
                case None => {
                    //REMOVE BINDING TODO
                    var addccmd = Art2adaptationFactory.eINSTANCE.createRemoveFragmentBinding
                    addccmd.setRef(newhub)
                    addccmd.setTargetNodeName(previousHubBindingNodeName)
                    adaptationModel.getAdaptations.add(addccmd)
                  }
                case Some(bname)=> //OK ALREADY BINDED
              }
            }
          }
      }

    }







    adaptationModel
  }
  
}
