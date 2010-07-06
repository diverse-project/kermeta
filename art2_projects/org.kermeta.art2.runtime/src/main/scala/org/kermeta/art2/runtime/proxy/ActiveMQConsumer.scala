/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.runtime.proxy

import javax.jms._
import org.apache.activemq.ActiveMQConnectionFactory

class ActiveMQConsumer extends MessageListener {

  var uri : String = ""
  var hubType : String = ""
  var consumer : MessageConsumer = null
  var session : Session = null
  var destination : Destination = null
  var connection : Option[Connection] = None
  var delegate : org.kermeta.art2.framework.MessagePort = null


  def getDelegate():Object = {delegate}
  def setDelegate(a : Object) : Unit = {
    delegate = a.asInstanceOf[org.kermeta.art2.framework.MessagePort]
  }

  def getUri() : String = uri
  def setUri(u : String) = {
    uri = u
  }
  def getHubType() : String = hubType
  def setHubType(u : String) = {
    hubType = u
  }

  def init(){
    try{
      var connectionFactory = new ActiveMQConnectionFactory("vm://art2broker?create=false")
      connection = Some(connectionFactory.createConnection())
      connection.get.start
      session = connection.get.createSession(false, Session.AUTO_ACKNOWLEDGE)
    
      destination = hubType match {
        case "queue"=> session.createQueue(uri);
        case "topic"=> session.createTopic(uri);
        case _ => session.createQueue(uri);
      }
    
      consumer = session.createConsumer(destination);
      consumer.setMessageListener(this)
    } catch {
      case e => e.printStackTrace
    }
  }

  def stop(){
    consumer.close
    session.close
    connection match {
      case Some(c) => c.stop
      case None =>
    }
  }

  def onMessage(message : Message){
    message match {
      case s : TextMessage => delegate.process(s)
      case o : ObjectMessage => println(o.getClass.getName);delegate.process(o.getObject)
      case _ => println("Strange message ???"+message)
    }
  }


}
