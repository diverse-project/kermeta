
package org.kermeta.art2.adaptation.deploy.osgi

import org.kermeta.art2.adaptation.deploy.osgi.command._
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.api.service.adaptation.deploy.Art2AdaptationDeployService
import org.kermeta.art2adaptation.AdaptationModel
import org.kermeta.art2adaptation.AdaptationPrimitive
import org.kermeta.art2adaptation.AddComponentInstance
import org.kermeta.art2adaptation.AddComponentType
import org.kermeta.art2adaptation.AddThirdParty
import org.kermeta.art2adaptation.ComponentInstanceAdaptation
import org.kermeta.art2adaptation.ComponentTypeAdaptation
import org.kermeta.art2adaptation.RemoveComponentInstance
import org.kermeta.art2adaptation.RemoveComponentType
import org.kermeta.art2adaptation.RemoveThirdParty
import org.kermeta.art2adaptation.ThirdPartyAdaptation
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._

class Art2AdaptationDeployServiceOSGi extends Art2AdaptationDeployService {

  var ctx : Art2DeployManager = null
  
  var internalLog : Logger = LoggerFactory.getLogger("org.kermeta.art2.deploy.osgi.Art2AdaptationDeployServiceOSGi")

  def setContext(context : Art2DeployManager) = { ctx = context }


  def phase(cmds: List[PrimitiveCommand] ):Boolean = {
    var intermediate = cmds.forall(c=> {
        try{ c.execute } catch {
          case _ @ e => internalLog.error("ART2 DEPLOY ERROR="+e);false
        }
      })
    if(intermediate){
      intermediate = cmds.forall(c=> {
          try{
            c.getLastExecutionBundle match {
              case None => false
              case Some(b) => b.start;true
            }
          } catch {
            case _ @ e => internalLog.error("ART2 START ERROR="+e);false
          }
        })
    }
    if(!intermediate){
      cmds.foreach(c=>{
          try{
            c.undo
          } catch {
            case _ @ e => internalLog.error("ART2 ROLLBACK !!!! DEPLOYERROR="+e);
          }
        })
    }
    intermediate
  }


  def deploy(model : AdaptationModel) = {
    var executedCommandTP :List[PrimitiveCommand] = List()
    var executedCommandCT :List[PrimitiveCommand] = List()
    var executedCommandCI :List[PrimitiveCommand] = List()

    var listPrimitive = plan(model)
    internalLog.debug("plansize="+listPrimitive.size)    
    listPrimitive foreach{ p => p match {
        //ThirdParty
        case tpa : AddThirdParty =>executedCommandTP = executedCommandTP ++ List(AddThirdPartyCommand(tpa.getRef,ctx))
        case tpa : RemoveThirdParty =>executedCommandTP = executedCommandTP ++ List(RemoveThirdPartyCommand(tpa.getRef,ctx))
          //ComponentType
        case cta : AddComponentType =>executedCommandCT = executedCommandCT ++ List(AddComponentTypeCommand(cta.getRef,ctx))
        case cta : RemoveComponentType =>executedCommandCT = executedCommandCT ++ List(RemoveComponentTypeCommand(cta.getRef,ctx))
          //ComponentInstance
        case ca : AddComponentInstance =>executedCommandCI = executedCommandCI ++ List(AddComponentInstanceCommand(ca.getRef,ctx))
        case ca : RemoveComponentInstance =>executedCommandCI = executedCommandCI ++ List(RemoveComponentInstanceCommand(ca.getRef,ctx))
        case _ => internalLog.error("Unknow art2 adaptation primitive");false
      }
    }

    var executionResult = true
    internalLog.debug("Phase 1 install ThirdParty "+executedCommandTP.size)
    if(executionResult){ executionResult = phase(executedCommandTP) }
   internalLog.debug("Phase 2 install ComponentType "+executedCommandCT.size)
    if(executionResult){ executionResult = phase(executedCommandCT) }
   internalLog.debug("Phase 3 install ComponentInstance "+executedCommandCI.size)
    if(executionResult){ executionResult = phase(executedCommandCI) }

    executionResult
  }


  /* Simple plan algorithme / separe primitive type */
  def plan(model : AdaptationModel) : List[AdaptationPrimitive] = {
    var thirdPartiesAdaptations = model.getAdaptations.filter({a => a.isInstanceOf[ThirdPartyAdaptation] }).toList
    var componentTypeAdaptations = model.getAdaptations.filter({a => a.isInstanceOf[ComponentTypeAdaptation] }).toList
    var componentInstanceAdaptations = model.getAdaptations.filter({a => a.isInstanceOf[ComponentInstanceAdaptation] }).toList
    var res = thirdPartiesAdaptations ++ componentTypeAdaptations ++ componentInstanceAdaptations
    res.toList
  }
  

}
