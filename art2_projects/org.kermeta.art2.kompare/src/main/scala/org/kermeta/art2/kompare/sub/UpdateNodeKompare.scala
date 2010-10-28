/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.kompare.sub

import org.kermeta.art2._
import org.kermeta.art2adaptation._
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.aspects.Art2Aspects._

trait UpdateNodeKompare extends AbstractKompare with UpdateChannelKompare {
  
  def getUpdateNodeAdaptationModel(actualNode : ContainerNode,updateNode : ContainerNode) : AdaptationModel = {
    var adaptationModel = org.kermeta.art2adaptation.Art2adaptationFactory.eINSTANCE.createAdaptationModel
    logger.info("UPDATE NODE "+actualNode.getName)

    
    var actualRoot = actualNode.eContainer.asInstanceOf[ContainerRoot]
    var updateRoot = updateNode.eContainer.asInstanceOf[ContainerRoot]
    
    //Update Type Step
    updateNode.getUsedTypeDefinition.foreach{uct=>
      actualNode.getUsedTypeDefinition.find({act=> act.isModelEquals(uct) }) match {
        case Some(ct)=> {
            //CHECK IF TYPE IS UPDATE
            if(ct.isUpdated(uct)){
              var adaptcmd = Art2adaptationFactory.eINSTANCE.createUpdateType
              adaptcmd.setRef(uct)
              adaptationModel.getAdaptations.add(adaptcmd)
            }
          }
        case None => {
            //ADD TYPE
            var ctcmd = Art2adaptationFactory.eINSTANCE.createAddType
            ctcmd.setRef(uct)
            adaptationModel.getAdaptations.add(ctcmd)

            /* add deploy unit if necessary */
            //CHECK IF A PREVIOUS INSTALLED TYPE DEFINITION USE THIS DEPLOY UNIT
            actualNode.getUsedTypeDefinition.find(typeDef => typeDef.getDeployUnit.isModelEquals(uct.getDeployUnit)) match {
              case None => {
                  //CHECK IF THIS DEPLOY UNIT IS ALREADY MARK AS TO BE INSTALLED
                  adaptationModel.getAdaptations.filter(adaptation => adaptation.isInstanceOf[AddDeployUnit]).find(adaptation=> adaptation.asInstanceOf[AddDeployUnit].getRef.isModelEquals(uct.getDeployUnit) ) match {
                    case None => {
                        var ctcmd = Art2adaptationFactory.eINSTANCE.createAddDeployUnit
                        ctcmd.setRef(uct.getDeployUnit)
                        adaptationModel.getAdaptations.add(ctcmd)
                      }
                    case Some(e)=> //SIMILAR DEPLOY UNIT PRIMITIVE ALREADY REGISTERED
                  }
                }
              case Some(_)=> // TYPE DEFINITION ALREADY USE DEPLOY UNIT IN PREVIOUS MODEL
            }


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
        case Some(ct)=> //OK CHECK ALEADY DONE IN PREVIOUS STEP
        case None => {

            //ADD TYPE
            var ctcmd = Art2adaptationFactory.eINSTANCE.createRemoveType
            ctcmd.setRef(act)
            adaptationModel.getAdaptations.add(ctcmd)

            /* remove deploy unit if necessary */
            updateNode.getUsedTypeDefinition.find(typeDef => (typeDef != act) &&  typeDef.getDeployUnit.isModelEquals(act.getDeployUnit)) match {
              case Some(_)=> // DO NOT UNINSTALL DEPLOY UNIT
              case None => {
                  adaptationModel.getAdaptations.filter(adaptation => adaptation.isInstanceOf[RemoveDeployUnit]).find(adaptation=> adaptation.asInstanceOf[RemoveDeployUnit].getRef.isModelEquals(act.getDeployUnit) ) match {
                    case None => {
                        var ctcmd = Art2adaptationFactory.eINSTANCE.createRemoveDeployUnit
                        ctcmd.setRef(act.getDeployUnit)
                        adaptationModel.getAdaptations.add(ctcmd)
                      }
                    case Some(e)=> //SIMILAR DEPLOY UNIT PRIMITIVE ALREADY REGISTERED
                  }

                }
            }



            //TODO REMOVE TIRDPARTY

          }
      }
    }

    //INSTANCE STEP
    updateNode.getInstances.foreach{uc=>
      actualNode.getInstances.find({ac=> ac.isModelEquals(uc) }) match {
        case Some(c)=>{
            //CHECK IF INSTANCE TYPE DEFINITION IS NOT UPDATED
            if(uc.getTypeDefinition.isUpdated(c.getTypeDefinition)){
              var adaptcmd = Art2adaptationFactory.eINSTANCE.createUpdateInstance
              adaptcmd.setRef(uc)
              adaptationModel.getAdaptations.add(adaptcmd)
            } else {
              //CHECK IS DICTIONARY IS UPDATED
              if(uc.getDictionary.isUpdated(c.getDictionary)){
                var adaptcmd = Art2adaptationFactory.eINSTANCE.createUpdateDictionaryInstance
                adaptcmd.setRef(uc)
                adaptationModel.getAdaptations.add(adaptcmd)
              }

            }
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
        case Some(c)=> //OK , CASE ALREADY PROCESS BY PREVIOUS STEP
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
    updateRoot.getHubs.filter(hub=> hub.usedByNode(updateNode.getName)).foreach{newhub=>
      actualRoot.getHubs.filter(hub=> hub.usedByNode(updateNode.getName)).find(hub=> newhub.getName == hub.getName) match {
        case None => {
            //NEW HUB INIT BINDING
            newhub.getOtherFragment(updateNode.getName).foreach{remoteName =>
              var addccmd = Art2adaptationFactory.eINSTANCE.createAddFragmentBinding
              addccmd.setRef(newhub)
              addccmd.setTargetNodeName(remoteName)
              adaptationModel.getAdaptations.add(addccmd)
            }
          }

        case Some(previousHub)=>{
            adaptationModel.getAdaptations.addAll(getUpdateChannelAdaptationModel(previousHub,newhub,updateNode.getName).getAdaptations)
          }
      }
    }
    actualRoot.getHubs.filter(hub=> hub.usedByNode(updateNode.getName)).foreach{newhub=>
      updateRoot.getHubs.filter(hub=> hub.usedByNode(updateNode.getName)).find(hub=> newhub.getName == hub.getName) match {
        case None => // NOTHING TO DO HUB WILL BE UNINSTALL, NO UNBIND IS NECESSARY
        case Some(previousHub)=> {
            //CHECK AND UPDATE MBINDING
            adaptationModel.getAdaptations.addAll(getUpdateChannelAdaptationModel(previousHub,newhub,updateNode.getName).getAdaptations)
          }
      }
    }


    adaptationModel
  }
  
}
