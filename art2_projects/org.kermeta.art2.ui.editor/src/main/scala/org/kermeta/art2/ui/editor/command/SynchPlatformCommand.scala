/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.command

import java.io.ByteArrayOutputStream
import org.kermeta.art2.framework.Art2XmiHelper
import org.kermeta.art2.framework.message.Art2ModelSynchMessage
import org.kermeta.art2.ui.editor.Art2Cluster
import org.kermeta.art2.ui.editor.Art2UIKernel
import org.kermeta.art2.framework.JacksonSerializer._
import scala.reflect.BeanProperty
import scala.collection.JavaConversions._

class SynchPlatformCommand extends Command {

  @BeanProperty
  var kernel : Art2UIKernel = null

  @BeanProperty
  var destNodeName : String = null

  def execute(p :Object) {

    
    var outStream = new ByteArrayOutputStream
    Art2XmiHelper.saveStream(outStream, kernel.getModelHandler.getActualModel)
    outStream.flush
    // var msg = outStream.toString
    var msg = new Art2ModelSynchMessage
    msg.setNodeSenderName("art2editor")
    msg.setNewModelAsString(outStream.toString)
    Art2Cluster.push(msg.toJSON)
    outStream.close

  }

}
