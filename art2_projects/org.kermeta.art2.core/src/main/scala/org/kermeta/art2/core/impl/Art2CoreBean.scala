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
import org.kermeta.art2.framework.Art2XmiHelper
import org.osgi.framework.BundleContext
import org.slf4j.LoggerFactory
import scala.reflect.BeanProperty
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
    if (lastModelssaved.getTotalSpace() != 0) {
      /* Load previous state */
      var model = Art2XmiHelper.load(lastModelssaved.getAbsolutePath());
      switchToNewModel(model)
      //models.add(model)
      //models = models ++ List(model)
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
        case Art2PreviousModel() => reply(models)
        case Art2LastModel() => reply(model) /* TODO DEEP CLONE */
        case Art2UpdateModel(newmodel) => {
            println("REC")
            if (newmodel == null) { logger.error("Null model")} else {

              println("previous model = "+model.getNodes.mkString(","))
              println("new model = "+newmodel.getNodes.mkString(","))

              var adaptationModel = kompareService.kompare(model, newmodel, nodeName);
              var deployResult = deployService.deploy(adaptationModel,nodeName);
              //models = models ++ List(newmodel)
              switchToNewModel(newmodel)
              logger.info("Deploy result " + deployResult)
            }
          }
        case _ @ unknow=> logger.warn("unknow message  "+unknow)
      }
    }
  }
  
  override def getLastModel : ContainerRoot = (this !? Art2LastModel()).asInstanceOf[ContainerRoot]
  override def updateModel(model : ContainerRoot) ={ this ! Art2UpdateModel(model) }
  override def getPreviousModel : java.util.List[ContainerRoot] = (this !? Art2PreviousModel).asInstanceOf[java.util.List[ContainerRoot]]

}
