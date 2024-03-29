
package org.kermeta.art2.adaptation.deploy.osgi

import org.kermeta.art2.ComponentInstance
import org.kermeta.art2.adaptation.deploy.osgi.command.AddFragmentBindingCommand
import org.kermeta.art2.adaptation.deploy.osgi.command._
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.api.service.adaptation.deploy.Art2AdaptationDeployService
import org.kermeta.art2adaptation.AdaptationModel
import org.kermeta.art2adaptation.AddBinding
import org.kermeta.art2adaptation.AddDeployUnit
import org.kermeta.art2adaptation.AddFragmentBinding
import org.kermeta.art2adaptation.AddInstance
import org.kermeta.art2adaptation.AddType
import org.kermeta.art2adaptation.AddThirdParty
import org.kermeta.art2adaptation.RemoveBinding
import org.kermeta.art2adaptation.RemoveDeployUnit
import org.kermeta.art2adaptation.RemoveFragmentBinding
import org.kermeta.art2adaptation.RemoveInstance
import org.kermeta.art2adaptation.RemoveType
import org.kermeta.art2adaptation.RemoveThirdParty
import org.kermeta.art2adaptation.UpdateBinding
import org.kermeta.art2adaptation.UpdateDeployUnit
import org.kermeta.art2adaptation.UpdateDictionaryInstance
import org.kermeta.art2adaptation.UpdateInstance
import org.kermeta.art2adaptation.UpdateType
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._

class Art2AdaptationDeployServiceOSGi extends Art2AdaptationDeployService {

  var ctx : Art2DeployManager = null
  var logger = LoggerFactory.getLogger(this.getClass);

  def setContext(context : Art2DeployManager) = { ctx = context }
  def deploy(model : AdaptationModel,nodeName:String) = {

    var phase = new Art2DeployPhase

    var executedCommandTP :List[PrimitiveCommand] = List()
    //var executedCommandCT :List[PrimitiveCommand] = List()
    //var executedCommandCI :List[PrimitiveCommand] = List()
    //  var executedCommandBI :List[PrimitiveCommand] = List()


    //DEPLOY UNIT COMMAND
    var command_add_deployUnit :List[PrimitiveCommand] = List()
    var command_remove_deployUnit :List[PrimitiveCommand] = List()

    //TYPE LIST
    var command_add_type :List[PrimitiveCommand] = List()
    var command_remove_type :List[PrimitiveCommand] = List()

    //INSTANCE LIST
    var command_add_instance :List[PrimitiveCommand] = List()
    var command_remove_instance :List[PrimitiveCommand] = List()

    //BINDING LIST
    var command_remove_binding :List[PrimitiveCommand] = List()
    var command_add_binding :List[PrimitiveCommand] = List()

    //Life cycle command COMMAND
    var stopCommand :List[PrimitiveCommand] = List()
    var startCommand :List[PrimitiveCommand] = List()

    var updateDictionaryCommand :List[PrimitiveCommand] = List()

    // var listPrimitive = plan(model)
    //println("plansize="+listPrimitive.size);
    model.getAdaptations foreach{ p => p match {

        //DEPLOY UNIT CRUD ( TYPE PROVISIONNING )
        //ThirdParty CRUD
        case tpa : AddDeployUnit =>command_add_deployUnit = command_add_deployUnit ++ List(AddDeployUnitCommand(tpa.getRef,ctx))
        case tpa : RemoveDeployUnit =>command_remove_deployUnit = command_remove_deployUnit ++ List(RemoveDeployUnitCommand(tpa.getRef,ctx))
          //UPDATE US MAPPED ON REMOVE INSTALL
        case tpa : UpdateDeployUnit =>{
            command_remove_deployUnit = command_remove_deployUnit ++ List(RemoveDeployUnitCommand(tpa.getRef,ctx))
            command_add_deployUnit = command_add_deployUnit ++ List(AddDeployUnitCommand(tpa.getRef,ctx))
          }

          //ThirdParty CRUD
        case tpa : AddThirdParty =>executedCommandTP = executedCommandTP ++ List(AddThirdPartyCommand(tpa.getRef,ctx))
        case tpa : RemoveThirdParty =>executedCommandTP = executedCommandTP ++ List(RemoveThirdPartyCommand(tpa.getRef,ctx))

          //Type CRUD
        case cta : AddType =>command_add_type = command_add_type ++ List(AddTypeCommand(cta.getRef,ctx))
        case cta : RemoveType =>command_remove_type = command_remove_type ++ List(RemoveTypeCommand(cta.getRef,ctx))
        case cta : UpdateType => {
            //UPDATE IS MAPPED UN REMOVE & INSTALL
            command_remove_type = command_remove_type ++ List(RemoveTypeCommand(cta.getRef,ctx))
            command_add_type = command_add_type ++ List(AddTypeCommand(cta.getRef,ctx))
          }
          //Instance CRUD
        case ca : AddInstance => {
            command_add_instance = command_add_instance ++ List(AddInstanceCommand(ca.getRef,ctx,nodeName))
            updateDictionaryCommand = updateDictionaryCommand ++ List(UpdateDictionaryCommand(ca.getRef,ctx,nodeName))
           // if(ca.getRef.isInstanceOf[ComponentInstance]){
              startCommand = startCommand ++ List(StartInstanceCommand(ca.getRef,ctx,nodeName))
           // }
          }
        case ca : RemoveInstance =>{
            command_remove_instance = command_remove_instance ++ List(RemoveInstanceCommand(ca.getRef,ctx,nodeName))
            //if(ca.getRef.isInstanceOf[ComponentInstance]){
              stopCommand = stopCommand ++ List(StopInstanceCommand(ca.getRef,ctx,nodeName))
            //}
          }
        case ca : UpdateInstance => {
            //STOP & REMOVE
            command_remove_instance = command_remove_instance ++ List(RemoveInstanceCommand(ca.getRef,ctx,nodeName))
            //if(ca.getRef.isInstanceOf[ComponentInstance]){
              stopCommand = stopCommand ++ List(StopInstanceCommand(ca.getRef,ctx,nodeName))
              startCommand = startCommand ++ List(StartInstanceCommand(ca.getRef,ctx,nodeName))
            //}
            command_add_instance = command_add_instance ++ List(AddInstanceCommand(ca.getRef,ctx,nodeName))
            updateDictionaryCommand = updateDictionaryCommand ++ List(UpdateDictionaryCommand(ca.getRef,ctx,nodeName))
          }
        case ca : UpdateDictionaryInstance => {
            updateDictionaryCommand = updateDictionaryCommand ++ List(UpdateDictionaryCommand(ca.getRef,ctx,nodeName))
          }

          //Binding CRUD
        case ca : AddBinding =>command_add_binding = command_add_binding ++ List(AddBindingCommand(ca.getRef,ctx,nodeName))
        case ca : RemoveBinding =>command_remove_binding = command_remove_binding ++ List(RemoveBindingCommand(ca.getRef,ctx,nodeName))
        case ca : UpdateBinding => {
            //UPDATE MAP ON REMOVE & INSTALL
            command_add_binding = command_add_binding ++ List(AddBindingCommand(ca.getRef,ctx,nodeName))
            command_remove_binding = command_remove_binding ++ List(RemoveBindingCommand(ca.getRef,ctx,nodeName))
        }

          //Channel binding
        case ca : AddFragmentBinding =>command_add_binding = command_add_binding ++ List(AddFragmentBindingCommand(ca.getRef,ca.getTargetNodeName,ctx,nodeName))
        case ca : RemoveFragmentBinding =>command_remove_binding = command_remove_binding ++ List(RemoveFragmentBindingCommand(ca.getRef,ca.getTargetNodeName,ctx,nodeName))

        case _ => logger.error("Unknow art2 adaptation primitive");false
      }
    }

    var executionResult = true

    if(executionResult){ executionResult=phase.phase(stopCommand,"Phase 0 STOP COMPONENT") }
    if(executionResult){ executionResult=phase.phase(command_remove_binding,"Phase 1 Remove Binding") }
    if(executionResult){ executionResult=phase.phase(command_remove_instance,"Phase 2 Remove Instance") }
    if(executionResult){ executionResult=phase.phase(command_remove_type,"Phase 3 Remove ComponentType") }
    if(executionResult){ executionResult=phase.phase(command_remove_deployUnit,"Phase 4 Remove TypeDefinition DeployUnit") }

    //INSTALL TYPE
    if(executionResult){ executionResult=phase.phase(executedCommandTP,"Phase 5 ThirdParty") }
    if(executionResult){ executionResult=phase.phase(command_add_deployUnit,"Phase 6 Add TypeDefinition DeployUnit") }
    if(executionResult){ executionResult=phase.phase(command_add_type,"Phase 7 Add ComponentType") }

    //INSTALL ISTANCE
    if(executionResult){ executionResult=phase.phase(command_add_instance,"Phase 8 install ComponentInstance") }
    if(executionResult){ executionResult=phase.phase(command_add_binding,"Phase 9 install Bindings") }
    if(executionResult){ executionResult=phase.phase(updateDictionaryCommand,"Phase 10 SET PROPERTY") }
    if(executionResult){ executionResult=phase.phase(startCommand,"Phase 11 START COMPONENT") }

    if(!executionResult){phase.rollback}

    executionResult
  }


  /* Simple plan algorithme / separe primitive type */
  /*
   def plan(model : AdaptationModel) : List[AdaptationPrimitive] = {
   var thirdPartiesAdaptations = model.getAdaptations.filter({a => a.isInstanceOf[ThirdPartyAdaptation] }).toList
   var componentTypeAdaptations = model.getAdaptations.filter({a => a.isInstanceOf[TypeAdaptation] }).toList
   var componentInstanceAdaptations = model.getAdaptations.filter({a => a.isInstanceOf[InstanceAdaptation] }).toList
   var bindingAdaptations = model.getAdaptations.filter({a => a.isInstanceOf[BindingAdaptation] }).toList
   var res = thirdPartiesAdaptations ++ componentTypeAdaptations ++ componentInstanceAdaptations ++ bindingAdaptations
   res.toList
   }*/
  

}
