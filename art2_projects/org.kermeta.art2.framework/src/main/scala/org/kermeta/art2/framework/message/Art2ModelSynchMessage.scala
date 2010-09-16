/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework.message

import scala.reflect.BeanProperty

class Art2ModelSynchMessage {

  @BeanProperty
  var nodeSenderName : String = ""

  @BeanProperty
  var newModelAsString : String = ""

}
