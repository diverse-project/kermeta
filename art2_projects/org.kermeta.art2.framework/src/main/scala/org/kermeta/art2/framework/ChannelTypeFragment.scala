/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework

import java.util.HashMap
import org.kermeta.art2.framework.message._
import org.slf4j.LoggerFactory
import scala.collection.JavaConversions._
import scala.reflect.BeanProperty

trait ChannelTypeFragment extends Art2ChannelFragment with ChannelFragment {

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
  override def forward(delegate : Art2Actor,msg : Art2Message) : Object = {

    delegate match {
      case p: Art2Port => {
          if(msg.inOut.booleanValue){
            return (delegate !? msg.getContent).asInstanceOf[Object]
          } else {
            (delegate ! msg.getContent);return null
          }
        }
      case f : Art2ChannelFragment =>
        msg.setDestChannelName(f.getName)
        msg.setDestNodeName(f.getNodeName)

        if(msg.inOut.booleanValue){
          return (delegate !? msg).asInstanceOf[Object]
        } else {
          (delegate ! msg);return null
        }
      case _ => println("WTF !!!");return null
    }
  }

  private def createPortKey(a : Any) : String = {
    a match {
      case msg : Art2PortBindMessage => msg.getNodeName+"-"+msg.getComponentName+"-"+msg.getNodeName
      case msg : Art2PortUnbindMessage => msg.getNodeName+"-"+msg.getComponentName+"-"+msg.getNodeName
      case msg : Art2FragmentBindMessage => msg.getChannelName+"-"+msg.getFragmentNodeName
      case msg : Art2FragmentUnbindMessage => msg.getChannelName+"-"+msg.getFragmentNodeName
      case _=>""
    }
  }

  def act()={
    loop{
      react {
        case STOP => exit //TODO EMPTY WAITING LIST
        case msg : Art2FragmentBindMessage=> {
            fragementBinded.put(createPortKey(msg), msg.getProxy);
            msg.getProxy.start;
            reply(true)
          }
        case msg : Art2FragmentUnbindMessage=> {
            var actorPort = fragementBinded.get(createPortKey(msg))
            if(actorPort!=null){
              actorPort.stop
              fragementBinded.remove(createPortKey(msg))
            } else {
              println("Can't unbind Fragment "+createPortKey(msg))
            }
            reply(true)
          }
        case msg : Art2PortBindMessage => portsBinded.put(createPortKey(msg), msg.getProxy);reply(true)
        case msg : Art2PortUnbindMessage => portsBinded.remove(createPortKey(msg));reply(true)
          //USE CASE A MSG REC BY OTHER FRAGMENT
        case msg : Art2Message => {
            if(msg.inOut.booleanValue){
              reply(dispatch(msg))
            } else {
              dispatch(msg)
            }
          }
        case msg : MethodCallMessage =>{
            var msg2 = new Art2Message
            msg2.setInOut(true)
            msg2.setContent(msg)
            reply(dispatch(msg2))
          }
        case msg : Object => {
            var msg2 = new Art2Message
            msg2.setInOut(false)
            msg2.setContent(msg)
            dispatch(msg2)
          }
        case _ @ msg => println("WTF !")
      }
    }
  }

}
