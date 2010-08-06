/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.kompare

import org.kermeta.art2._
import org.kermeta.art2adaptation._
import scala.collection.JavaConversions._
import org.kermeta.art2.framework.aspects.Art2Aspects._

class Art2KompareBean extends org.kermeta.art2.api.service.core.kompare.ModelKompareService{

  def kompare(actualModel : ContainerRoot,targetModel:ContainerRoot,nodeName : String) : AdaptationModel = {

    var adaptationModel = org.kermeta.art2adaptation.Art2adaptationFactory.eINSTANCE.createAdaptationModel
    //STEP 0 - FOUND LOCAL NODE
    var actualLocalNode = actualModel.getNodes.find{c=> c.getName==nodeName }
    var updateLocalNode = targetModel.getNodes.find{c=> c.getName==nodeName }
    updateLocalNode match {
      case Some(uln)=> {
          actualLocalNode match {
            case Some(aln)=> updateNode(aln,uln) //UPDATE
            case None=> initNode(uln)
          }
        }
      case None=> {
          actualLocalNode match {
            case Some(aln) => stopNode(aln)
            case None => {
                /* BEST EFFORT PREPARE PLATEFORM */
                updateAllThirdParties(actualModel,targetModel)

              }
          }
        }
    }
  }

  def updateAllThirdParties(actualRoot : ContainerRoot, updateRoot : ContainerRoot):AdaptationModel={
    var adaptationModel = org.kermeta.art2adaptation.Art2adaptationFactory.eINSTANCE.createAdaptationModel
    updateRoot.getThirdParties.foreach{uct=>
      actualRoot.getThirdParties.find({act=> act.getName == uct.getName }) match {
        case Some(ct)=> //OK
        case None => {
            var addtpcmd = Art2adaptationFactory.eINSTANCE.createAddThirdParty
            addtpcmd.setRef(uct)
            adaptationModel.getAdaptations.add(addtpcmd)
          }
      }
    }
    actualRoot.getThirdParties.foreach{act=>
      updateRoot.getThirdParties.find({uct=> act.getName == uct.getName }) match {
        case Some(ct)=> //OK
        case None => {
            var rmtpcmd = Art2adaptationFactory.eINSTANCE.createRemoveThirdParty
            rmtpcmd.setRef(act)
            adaptationModel.getAdaptations.add(rmtpcmd)
          }
      }
    }
    adaptationModel
  }


  def stopNode(node:ContainerNode):AdaptationModel={
    var adaptationModel = org.kermeta.art2adaptation.Art2adaptationFactory.eINSTANCE.createAdaptationModel
    println("STOP NODE "+node.getName)

    var root = node.eContainer.asInstanceOf[ContainerRoot]
    root.getThirdParties.foreach{tp=>
      var rmtpcmd = Art2adaptationFactory.eINSTANCE.createRemoveThirdParty
      rmtpcmd.setRef(tp)
      adaptationModel.getAdaptations.add(rmtpcmd)
    }

    node.getComponentTypes.foreach{ct=>
      var rmctcmd = Art2adaptationFactory.eINSTANCE.createRemoveComponentType
      rmctcmd.setRef(ct)
      adaptationModel.getAdaptations.add(rmctcmd)
    }
    node.getComponents.foreach({c =>
        var rmccmd = Art2adaptationFactory.eINSTANCE.createRemoveComponentInstance
        rmccmd.setRef(c)
        adaptationModel.getAdaptations.add(rmccmd)
      })
    adaptationModel
  }


  def initNode(node:ContainerNode):AdaptationModel= {
    var adaptationModel = org.kermeta.art2adaptation.Art2adaptationFactory.eINSTANCE.createAdaptationModel
    println("INIT NODE "+node.getName)
    //UPDATE ALL COMPONENT TYPE

    var root = node.eContainer.asInstanceOf[ContainerRoot]
    root.getThirdParties.foreach{tp=>
      var addtpcmd = Art2adaptationFactory.eINSTANCE.createAddThirdParty
      addtpcmd.setRef(tp)
      adaptationModel.getAdaptations.add(addtpcmd)
    }

    node.getComponentTypes.foreach{ct=>
      var newctcmd = Art2adaptationFactory.eINSTANCE.createAddComponentType
      newctcmd.setRef(ct)
      adaptationModel.getAdaptations.add(newctcmd)
    }
    node.getComponents.foreach({c =>
        var newccmd = Art2adaptationFactory.eINSTANCE.createAddComponentInstance
        newccmd.setRef(c)
        adaptationModel.getAdaptations.add(newccmd)
      })
    adaptationModel
  }

  def updateNode(actualNode : ContainerNode,updateNode : ContainerNode) : AdaptationModel = {
    var adaptationModel = org.kermeta.art2adaptation.Art2adaptationFactory.eINSTANCE.createAdaptationModel
    println("INIT NODE "+actualNode.getName)


    //ThirdParty
    //ComponentType Step
    var actualRoot = actualNode.eContainer.asInstanceOf[ContainerRoot]
    var updateRoot = updateNode.eContainer.asInstanceOf[ContainerRoot]
    //TODO INSTALL ONLY USED THIRDPARTIES
    adaptationModel.getAdaptations.addAll(updateAllThirdParties(actualRoot,updateRoot).getAdaptations)


    //ComponentType Step
    updateNode.getComponentTypes.foreach{uct=>
      actualNode.getComponentTypes.find({act=> act.isModelEquals(uct) }) match {
        case Some(ct)=> //OK
        case None => {
            var ctcmd = Art2adaptationFactory.eINSTANCE.createAddComponentType
            ctcmd.setRef(uct)
            adaptationModel.getAdaptations.add(ctcmd)
          }
      }
    }
    actualNode.getComponentTypes.foreach{act=>
      updateNode.getComponentTypes.find({uct=> uct.isModelEquals(act) }) match {
        case Some(ct)=> //OK
        case None => {
            var ctcmd = Art2adaptationFactory.eINSTANCE.createRemoveComponentType
            ctcmd.setRef(act)
            adaptationModel.getAdaptations.add(ctcmd)
          }
      }
    }
    //ComponentInstance Step
    updateNode.getComponents.foreach{uc=>
      actualNode.getComponents.find({ac=> ac.isModelEquals(uc) }) match {
        case Some(c)=>{
            //OK CHECK FOR UPDATE

            //TODO CHECK UPDATE
          }
        case None => {
            var ccmd = Art2adaptationFactory.eINSTANCE.createAddComponentInstance
            ccmd.setRef(uc)
            adaptationModel.getAdaptations.add(ccmd)
          }
      }
    }
    actualNode.getComponents.foreach{ac=>
      updateNode.getComponents.find({uc=> uc.isModelEquals(ac) }) match {
        case Some(c)=> //OK
        case None => {
            var ccmd = Art2adaptationFactory.eINSTANCE.createRemoveComponentInstance
            ccmd.setRef(ac)
            adaptationModel.getAdaptations.add(ccmd)
          }
      }
    }
    adaptationModel
  }

  

  /*


   var runtimeComponentType : Set<ComponentType> init Set<ComponentType>.new
   var alreadyTestedUpdateComponentType : Set<ComponentType> init Set<ComponentType>.new



   //COMPONENT INSTANCE STEP
   runtimeNode.components.each{ rc |
   var similarComponent : ComponentInstance init updateNode.components.detect{uc| uc.isEquals(rc) }
   if(similarComponent == void)
   then result.add(factory.createCommandRemoveComponentInstance(rc))
   else
   if(rc.isUpdated(similarComponent))
   then result.add(factory.createCommandUpdateComponentInstance(similarComponent))
   end
   end
   }

   updateNode.components.each{ uc |
   var similarComponent : ComponentInstance init runtimeNode.components.detect{rc| rc.isEquals(uc) }
   if(similarComponent == void)
   then result.add(factory.createCommandAddComponentInstance(uc))
   end
   }
   end

   */


}
