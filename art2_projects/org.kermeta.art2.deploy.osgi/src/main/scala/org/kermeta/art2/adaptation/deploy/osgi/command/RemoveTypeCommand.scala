/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command

import org.kermeta.art2._
import org.kermeta.art2.adaptation.deploy.osgi.context.Art2DeployManager
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._

case class RemoveTypeCommand(ct : TypeDefinition, ctx : Art2DeployManager) extends PrimitiveCommand {

  var logger = LoggerFactory.getLogger(this.getClass)

  def execute() : Boolean= {
    ctx.bundleMapping.find({bundle =>bundle.name==ct.getName && bundle.objClassName==ct.getClass.getName}) match {
      case Some(bundle)=> ctx.bundleMapping.remove(bundle);true
      case None => false
    }
  }

  def undo() = {
    AddTypeCommand(ct,ctx).execute
  }
}
