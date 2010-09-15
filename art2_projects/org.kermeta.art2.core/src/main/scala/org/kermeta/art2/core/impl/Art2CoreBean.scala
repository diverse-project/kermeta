/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.core.impl

import org.kermeta.art2.Art2Factory
import org.kermeta.art2.Art2Package
import org.kermeta.art2.ContainerRoot
import org.kermeta.art2.api.service.adaptation.deploy.Art2AdaptationDeployService
import org.kermeta.art2.api.service.core.handler.Art2ModelHandlerService
import org.kermeta.art2.api.service.core.kompare.ModelKompareService
import org.kermeta.art2.framework.Art2Actor
import org.kermeta.art2.framework.Art2XmiHelper
import org.kermeta.art2adaptation.AdaptationModel
import org.osgi.framework.BundleContext
import org.slf4j.LoggerFactory
import scala.reflect.BeanProperty
import org.kermeta.art2.framework.message._
import scala.actors.Actor
import scala.actors.Scheduler
import scala.collection.JavaConversions._

class Art2CoreBean extends Art2ModelHandlerService with Art2Actor {

  @BeanProperty var bundleContext : BundleContext = null;
  @BeanProperty var kompareService :org.kermeta.art2.api.service.core.kompare.ModelKompareService = null
  @BeanProperty var deployService :org.kermeta.art2.api.service.adaptation.deploy.Art2AdaptationDeployService = null
  @BeanProperty var nodeName : String = ""
  var models : List[ContainerRoot] = List()
  var logger = LoggerFactory.getLogger(this.getClass);

  override def start : Actor={
    logger.info("Start event rec : node name = "+bundleContext.getProperty("art2.node.name"))
    setNodeName(bundleContext.getProperty("art2.node.name"));
    super.start

    /* DEBUG ONLY */
    /*
    super.start
    models = models ++ List(Art2Factory.eINSTANCE.createContainerRoot())
    var umodel = Art2XmiHelper.load("/Users/ffouquet/Desktop/AS2.art2");
    updateModel(umodel);
    System.out.println("Model DEBUG UPDATED");
    if (true) {return this;}
    */
    //System.out.println("NoUse STATMENT");


    var lastModelssaved = bundleContext.getDataFile("lastModel.xmi");
    if (lastModelssaved.getTotalSpace() != 0) {
      /* Load previous state */
      var model = Art2XmiHelper.load(lastModelssaved.getAbsolutePath());
      models = models ++ List(model)
    } else {
      /* INIT EMPTY model */
      models = models ++ List(Art2Factory.eINSTANCE.createContainerRoot())
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
        case Art2PreviousModel() => sender ! models.tail
        case Art2LastModel() => sender ! models.head /* TODO DEEP CLONE */
        case Art2UpdateModel(newmodel) => {
            println("REC")
            if (newmodel == null) { logger.error("Null model")} else {
              var adaptationModel = kompareService.kompare(models.head, newmodel, nodeName);
              var deployResult = deployService.deploy(adaptationModel,nodeName);
              models = models ++ List(newmodel)
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
