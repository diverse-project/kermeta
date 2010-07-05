/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.runtime.proxy

import javax.jms.Session
import org.apache.activemq.ActiveMQConnectionFactory
import javax.jms.Message
import javax.jms.Connection
import javax.jms.Destination
import javax.jms.MessageProducer

class ActiveMQProducerActor extends org.kermeta.art2.framework.MessagePort{
  var uri : String = ""
  var producer : MessageProducer = null
  var session : Session = null
  var destination : Destination = null
  var connection : Option[Connection] = None

  def getUri() : String = uri
  def setUri(u : String) = {
    uri = u
  }

  var hubType : String = ""
  def getHubType() : String = hubType
  def setHubType(u : String) = {
    hubType = u
  }

  def getName : String = "dummyProxy"

  def start() = {
    var connectionFactory = new ActiveMQConnectionFactory("vm://art2broker?create=false")
    connection = Some(connectionFactory.createConnection())
    connection.get.start
    session = connection.get.createSession(false, Session.AUTO_ACKNOWLEDGE)
    destination = hubType match {
      case "queue"=> session.createQueue(uri);
      case "topic"=> session.createTopic(uri);
      case _ => session.createQueue(uri);
    }
    producer = session.createProducer(destination);
    
    //super.start
  }

  def init() = {
    start()
  }

  def stop() = {
    exit()
  }

  def exit() = {
    producer.close
    session.close
    connection match {
      case Some(c) => c.stop
      case None =>
    }
    //super.exit
  }

  override def process(o : Object) : Unit =  { o match {
      //loop {
      // receive {
      case s : String => {
          var message : Message = session.createTextMessage(s)
          producer.send(message)
        }

      case e  : java.io.Serializable => {
          var message : Message = session.createObjectMessage(e)
          producer.send(message)
        }
      case _ => println("Can't send no serialisation object")

        // }
    }
  }
}
