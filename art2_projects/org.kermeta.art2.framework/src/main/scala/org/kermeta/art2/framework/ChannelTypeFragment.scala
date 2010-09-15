/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import java.util.HashMap
import org.kermeta.art2.Channel
import org.kermeta.art2.framework.message.Art2FragmentUnbindMessage
import org.kermeta.art2.framework.message.Art2PortBindMessage;
import org.kermeta.art2.framework.message.Art2FragmentBindMessage
import org.kermeta.art2.framework.message.Art2PortUnbindMessage
import scala.collection.JavaConversions._
import scala.reflect.BeanProperty

trait ChannelTypeFragment extends AbstractChannelFragment with Art2ChannelFragment {

  private var portsBinded : HashMap[String,Art2Port] = new HashMap[String, Art2Port]()
  private var fragementBinded : HashMap[String,Art2ChannelFragment] = new HashMap[String, Art2ChannelFragment]()

  @BeanProperty
  var nodeName : String = ""
  @BeanProperty
  var name : String = ""
  @BeanProperty
  var dictionary : HashMap[String, Object] = new HashMap[String, Object]()

  override def getBindedPorts():java.util.List[Art2Port] = { portsBinded.values.toList } //OVERRIDE BY FACTORY
  override def getOtherFragments():java.util.List[Art2ChannelFragment] = { fragementBinded.values.toList }
  override def sendTo(delegate : Art2Actor,o:Object, synchronous : java.lang.Boolean) : Object = {
    if(synchronous.booleanValue){
      return (delegate !? o).asInstanceOf[Object]
    } else {
      (delegate ! o);return null
    }
  }

  private def createPortKey(a : Any) : String = {
    a match {
      case msg : Art2PortBindMessage => msg.getNodeName+"-"+msg.getComponentName+"-"+msg.getNodeName
      case msg : Art2PortUnbindMessage => msg.getNodeName+"-"+msg.getComponentName+"-"+msg.getNodeName
      case _=>""
    }
  }

  def act()={
    loop{
      react {
        case msg : Art2FragmentBindMessage=> fragementBinded.put(msg.getChannelName, msg.getProxy);reply(true)
        case msg : Art2FragmentUnbindMessage=> fragementBinded.remove(msg.getChannelName);reply(true)
        case msg : Art2PortBindMessage => portsBinded.put(createPortKey(msg), msg.getProxy);reply(true)
        case msg : Art2PortUnbindMessage => portsBinded.remove(createPortKey(msg));reply(true)
        case msg : MethodCallMessage => reply(dispatch(msg,true))
        case msg : Object => dispatch(msg,false)
        case _ @ msg => println("WTF !")
      }
    }
  }

}
