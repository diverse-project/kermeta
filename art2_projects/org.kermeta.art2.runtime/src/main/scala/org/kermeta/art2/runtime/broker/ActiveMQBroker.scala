/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.runtime.broker

import java.io.File
import java.net.URI
import org.apache.activemq.broker.BrokerFactory
import org.apache.activemq.broker.BrokerService
import org.apache.activemq.broker.TransportConnector
import org.apache.activemq.broker.jmx.ManagementContext
import org.apache.activemq.network.NetworkConnector
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
      
      println("Starting, embedded Broker to "+dataDir)


      //  System.out.println(this.getClass.getClassLoader.getResource("activemq.xml").getPath);
      

      //  broker = BrokerFactory.createBroker(new URI("xbean:../../../../../activemq.xml"),true)

      broker = new BrokerService
      broker.setBrokerName("art2broker")
      broker.setUseShutdownHook(false)

      var dataDirFile = new File(dataDir)
      if(!dataDirFile.exists){
        dataDirFile.mkdir
      }

      broker.setDataDirectoryFile(dataDirFile)
      broker.getPersistenceAdapter.setDirectory(dataDirFile)

      var connector = broker.addNetworkConnector("multicast://"+"default");
      connector.setDuplex(true);
      connector.setName("default-nc")
      broker.addConnector("tcp://localhost:61616");

      
      

      

      //  broker.setPersistent(true)

      //var mcontext = new ManagementContext();
      // mcontext.setCreateConnector(false)
      // broker.setManagementContext(mcontext)

      // broker.setUseJmx(true)

      // broker.setDataDirectory(dataDir)
      // persistance = new KahaDBPersistenceAdapter()
      // persistance.setBrokerService(broker)
      

      // broker.setBrokerName("art2broker")
      //broker.addConnector("tcp://0.0.0.0:61616")
      //broker.setUseShutdownHook(false)
      /*
       var nc = new org.apache.activemq.network.MulticastNetworkConnector
       nc.setRemoteURI(new URI("multicast://default"))
       nc.setName("default-nc")
       nc.setBrokerService(broker)
       nc.setDuplex(true)

       broker.addNetworkConnector(nc)


       broker.setPersistenceAdapter(persistance)
*/
       var tc = new TransportConnector
       tc.setName("openwire")
       tc.setUri(new URI("tcp://0.0.0.0:61616"))
       tc.setDiscoveryUri(new URI("multicast://default"))
       tc.setBrokerService(broker)
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
