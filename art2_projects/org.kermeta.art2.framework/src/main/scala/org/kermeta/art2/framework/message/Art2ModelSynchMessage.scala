/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.message

import scala.reflect.BeanProperty
import java.{util => ju}

class Art2ModelSynchMessage {

  @BeanProperty
  var nodeSenderName : String = ""

  @BeanProperty
  var newModelAsString : String = ""

  @BeanProperty
  var passedNodes : ju.List[String] = new ju.ArrayList[String]()

}
