/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.runtime.broker

import java.io.File
import java.net.URI
import org.apache.activemq.broker.BrokerService
import org.apache.activemq.broker.TransportConnector
import org.apache.activemq.store.kahadb.KahaDBPersistenceAdapter

class ActiveMQBroker {
  /*
   var broker = new BrokerService
   broker.setBrokerName("art2broker")
   broker.addConnector("tcp://localhost:61616")
   broker.setUseShutdownHook(true)
   */

  var dataDir : String = ""

  var broker : BrokerService = null
  var persistance : KahaDBPersistenceAdapter = null

  def setDataDirectory(uri : String) = {
    dataDir = uri
  }

  def start = {
    try{
      
      broker = new BrokerService
      broker.setDataDirectory(dataDir)
      persistance = new KahaDBPersistenceAdapter
      persistance.setDirectory(new File(dataDir))

      broker.setBrokerName("art2broker")
      broker.addConnector("tcp://localhost:61616")
      broker.setUseShutdownHook(true)

      var connector = broker.addNetworkConnector("multicast://default");
      connector.setDuplex(true);

      broker.setPersistent(true)
      broker.setPersistenceAdapter(persistance)

      var tc = new TransportConnector
      tc.setName("openwire")
      tc.setUri(new URI("tcp://0.0.0.0:61616"))
      tc.setDiscoveryUri(new URI("multicast://default"))
      var tc2 = new TransportConnector
      tc2.setName("stomp")
      tc2.setUri(new URI("stomp://0.0.0.0:61613"))

      var tcs = new java.util.ArrayList[TransportConnector]
      tcs.add(tc);
      tcs.add(tc2)

      broker.setTransportConnectors(tcs)

      broker.start

    } catch {
      case e => e.printStackTrace
    }
  }

  def stop = {
    broker.stop
  }

}
