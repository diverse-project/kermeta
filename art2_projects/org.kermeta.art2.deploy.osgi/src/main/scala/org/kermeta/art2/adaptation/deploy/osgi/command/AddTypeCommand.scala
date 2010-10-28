/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2._
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2OSGiBundle
import scala.collection.JavaConversions._
import org.slf4j.LoggerFactory

/* TYPE DOES NOT INSTALL DEPLOY UNIT !! */
case class AddTypeCommand(ct : TypeDefinition, ctx : Art2DeployManager)  extends PrimitiveCommand{

  var logger = LoggerFactory.getLogger(this.getClass);

  //var lastExecutionBundle : Option[org.osgi.framework.Bundle] = None
  def execute() : Boolean= {
    logger.info("CMD ADD CT EXECUTION ");


    //FOUND TYPE DEFINITION DEPLOY UNIT BUNDLE
    var mappingFound =  ctx.bundleMapping.find({bundle =>bundle.name==CommandHelper.buildKEY(ct.getDeployUnit) && bundle.objClassName==ct.getDeployUnit.getClass.getName}) match {
      case Some(bundle)=> bundle
      case None => println("Deploy Unit Not Found"); return false; null;
    }

    //JUST ADD NEW BUNDING
    ctx.bundleMapping.add(Art2OSGiBundle(ct.getName,ct.getClass.getName,mappingFound.bundle))

    true
  }

  def undo() = RemoveTypeCommand(ct,ctx).execute

}
