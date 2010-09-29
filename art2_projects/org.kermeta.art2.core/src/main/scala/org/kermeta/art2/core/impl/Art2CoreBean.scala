/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.core.impl

import org.kermeta.art2.Art2Factory
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.api.service.adaptation.deploy.Art2AdaptationDeployService
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.kermeta.art2.api.service.core.kompare.ModelKompareService
import org.kermeta.art2.framework.Art2Actor
import org.kermeta.art2.framework.Art2PlatformHelper
import org.kermeta.art2.framework.Art2XmiHelper
import org.osgi.framework.BundleContext
import org.slf4j.LoggerFactory
import scala.reflect.BeanProperty
import org.kermeta.art2.framework.merger.Art2PlatformMerger
import org.kermeta.art2.framework.message.Art2PlatformModelUpdate
import org.kermeta.art2.framework.message._
import scala.actors.Actor
import scala.collection.JavaConversions._

class Art2CoreBean extends Art2ModelHandlerService with Art2Actor {

  @BeanProperty var bundleContext : BundleContext = null;
  @BeanProperty var kompareService :org.kermeta.art2.api.service.core.kompare.ModelKompareService = null
  @BeanProperty var deployService :org.kermeta.art2.api.service.adaptation.deploy.Art2AdaptationDeployService = null
  @BeanProperty var nodeName : String = ""

  var models : java.util.ArrayList[ContainerRoot] = new java.util.ArrayList()
  var model : ContainerRoot = Art2Factory.eINSTANCE.createContainerRoot()

  var logger = LoggerFactory.getLogger(this.getClass);

  private def switchToNewModel(c : ContainerRoot)={
    models.add(model)
    model = c
  }

  override def start : Actor={
    logger.info("Start event rec : node name = "+bundleContext.getProperty("art2.node.name"))
    setNodeName(bundleContext.getProperty("art2.node.name"));
    super.start

    var lastModelssaved = bundleContext.getDataFile("lastModel.xmi");
    if (lastModelssaved.length() != 0) {
      /* Load previous state */
      var model = Art2XmiHelper.load(lastModelssaved.getAbsolutePath());
      switchToNewModel(model)
    }
    this
  }

  override def stop() : Unit = {
    Art2XmiHelper.save(bundleContext.getDataFile("lastModel.xmi").getAbsolutePath(), models.head);
    exit
  }

  def act()={
    loop{
      react {
        case updateMsg : Art2PlatformModelUpdate => Art2PlatformHelper.updateNodeLinkProp(model,nodeName, updateMsg.targetNodeName, updateMsg.key, updateMsg.value, updateMsg.networkType, updateMsg.weight)
        case Art2PreviousModel() => reply(models)
        case Art2LastModel() => reply(model) /* TODO DEEP CLONE */
        case Art2UpdateModel(newmodel) => {
            if (newmodel == null) { logger.error("Null model")} else {

              var adaptationModel = kompareService.kompare(model, newmodel, nodeName);
              var deployResult = deployService.deploy(adaptationModel,nodeName);

              if(deployResult){
                //MErge previous model on new model for platform model
                Art2PlatformMerger.merge(newmodel,model)
                switchToNewModel(newmodel)
                logger.info("Deploy result " + deployResult)
              } else {
                //KEEP FAIL MODEL
              }
              reply(deployResult)

            }
          }
        case _ @ unknow=> logger.warn("unknow message  "+unknow)
      }
    }
  }
  
  override def getLastModel : ContainerRoot = (this !? Art2LastModel()).asInstanceOf[ContainerRoot]
  override def updateModel(model : ContainerRoot) : java.lang.Boolean ={ (this !? Art2UpdateModel(model)).asInstanceOf[Boolean] }
  override def getPreviousModel : java.util.List[ContainerRoot] = (this !? Art2PreviousModel).asInstanceOf[java.util.List[ContainerRoot]]

}
