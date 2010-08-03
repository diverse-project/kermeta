
package org.kermeta.art2.adaptation.deploy.osgi

import org.kermeta.art2.adaptation.deploy.osgi.command._
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.api.service.adaptation.deploy.Art2AdaptationDeployService
import org.kermeta.art2adaptation.AdaptationModel
import org.kermeta.art2adaptation.AdaptationPrimitive
import org.kermeta.art2adaptation.AddComponentInstance
import org.kermeta.art2adaptation.AddComponentType
import org.kermeta.art2adaptation.ComponentInstanceAdaptation
import org.kermeta.art2adaptation.ComponentTypeAdaptation
import org.kermeta.art2adaptation.RemoveComponentInstance
import org.kermeta.art2adaptation.RemoveComponentType
import scala.collection.JavaConversions._

class Art2AdaptationDeployServiceOSGi extends Art2AdaptationDeployService {

  var ctx : Art2DeployManager = null

  def setContext(context : Art2DeployManager) = { ctx = context }

  def deploy(model : AdaptationModel) = {
    var executedCommand :List[PrimitiveCommand] = List()
    var listPrimitive = plan(model)
    println("plansize="+listPrimitive.size);
    listPrimitive foreach{ p => p match {
        case cta : AddComponentType =>executedCommand = executedCommand ++ List(AddComponentTypeCommand(cta.getRef,ctx))
        case cta : RemoveComponentType =>executedCommand = executedCommand ++ List(RemoveComponentTypeCommand(cta.getRef,ctx))
        case ca : AddComponentInstance =>executedCommand = executedCommand ++ List(AddComponentInstanceCommand(ca.getRef,ctx))
        case ca : RemoveComponentInstance =>executedCommand = executedCommand ++ List(RemoveComponentInstanceCommand(ca.getRef,ctx))
        case _ => println("Unknow art2 adaptation primitive");false
      }
    }
    var allResult = executedCommand.forall(c=> {
        try{
          c.execute
        } catch {
          case _ @ e => println("ART2DEPLOYERROR="+e);false
        }
      })
    if(!allResult) executedCommand.foreach(c=>{
        try{
          c.undo
        } catch {
          case _ @ e => println("ART2DEPLOYERROR="+e);
        }
      })
    allResult
  }


  /* Simple plan algorithme / separe primitive type */
  def plan(model : AdaptationModel) : List[AdaptationPrimitive] = {
    var componentTypeAdaptations = model.getAdaptations.filter({a => a.isInstanceOf[ComponentTypeAdaptation] }).toList
    var componentInstanceAdaptations = model.getAdaptations.filter({a => a.isInstanceOf[ComponentInstanceAdaptation] }).toList
    var res = componentTypeAdaptations ++ componentInstanceAdaptations
    res.toList
  }
  

}
