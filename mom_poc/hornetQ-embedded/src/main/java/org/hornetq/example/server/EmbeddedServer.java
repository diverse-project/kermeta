/*
 * Copyright 2009 Red Hat, Inc.
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.hornetq.example.server;

import org.hornetq.api.core.SimpleString;
import org.hornetq.api.core.TransportConfiguration;
import org.hornetq.api.core.client.ClientConsumer;
import org.hornetq.api.core.client.ClientMessage;
import org.hornetq.api.core.client.ClientProducer;
import org.hornetq.api.core.client.ClientSession;
import org.hornetq.api.core.client.ClientSessionFactory;
import org.hornetq.api.core.client.HornetQClient;
import org.hornetq.api.core.client.MessageHandler;
import org.hornetq.core.config.BroadcastGroupConfiguration;
import org.hornetq.core.config.ClusterConnectionConfiguration;
import org.hornetq.core.config.Configuration;
import org.hornetq.core.config.DiscoveryGroupConfiguration;
import org.hornetq.core.config.impl.ConfigurationImpl;
import org.hornetq.core.remoting.impl.invm.InVMAcceptorFactory;
import org.hornetq.core.remoting.impl.invm.InVMConnectorFactory;
import org.hornetq.core.remoting.impl.netty.NettyAcceptor;
import org.hornetq.core.remoting.impl.netty.NettyAcceptorFactory;
import org.hornetq.core.remoting.impl.netty.NettyConnector;
import org.hornetq.core.remoting.impl.netty.NettyConnectorFactory;
import org.hornetq.core.server.HornetQServer;
import org.hornetq.core.server.HornetQServers;
import org.hornetq.core.server.JournalType;
import org.hornetq.core.server.impl.HornetQServerImpl;
import org.hornetq.spi.core.security.HornetQSecurityManagerImpl;

/**
 * @author <a href="mailto:andy.taylor@jboss.org">Andy Taylor</a>
 */
public class EmbeddedServer {

    public static void main(String[] args) throws Exception {



            // Step 1. Create the Configuration, and set the properties accordingly
         Configuration configuration = new ConfigurationImpl();
         //configuration.setPersistenceEnabled(true);
         configuration.setJournalType(JournalType.NIO);
         configuration.setSecurityEnabled(false);
         //configuration.setJMXManagementEnabled(false);
         
         
         configuration.getAcceptorConfigurations().add(new TransportConfiguration(InVMAcceptorFactory.class.getName()));
         configuration.getAcceptorConfigurations().add(new TransportConfiguration(NettyAcceptorFactory.class.getName()));


         configuration.getDiscoveryGroupConfigurations().put("art2broker", new DiscoveryGroupConfiguration("art2broker-group", null, "231.7.7.7", 9876, 10000));


         configuration.getClusterConfigurations().add(new ClusterConnectionConfiguration("art2Cluster", "art2", 500, true, true, 1, 1, "art2broker-group"));



         configuration.setClusterUser("art2");
         configuration.setClusterPassword("art2");

         configuration.setClustered(true);


         //configuration.getConnectorConfigurations().put("netty",new TransportConfiguration(NettyConnectorFactory.class.getName()));
         


         // Step 2. Create and start the server
         HornetQServer server = new HornetQServerImpl(configuration, null, new HornetQSecurityManagerImpl());
         server.start();

         
         try{
            ClientSessionFactory nettyFactory = HornetQClient.createClientSessionFactory(new TransportConfiguration(
                    InVMConnectorFactory.class.getName()));


            ClientSession session = nettyFactory.createSession();

            if(!session.queueQuery(new SimpleString("art2.q1")).isExists()){
                session.createQueue("art2.q1", "art2.q1", true);
            }

            ClientProducer producer = session.createProducer("example");
            ClientMessage message = session.createMessage(true);
            message.getBodyBuffer().writeString("Hello");

            producer.send(message);
            session.start();


            ClientConsumer consumer = session.createConsumer("example");
            consumer.setMessageHandler(new MessageHandler() {

                @Override
                public void onMessage(ClientMessage cm) {
                    System.out.println("message = " + cm.getBodyBuffer().readString());
                }
            });


            Thread.currentThread().sleep(36000);
            session.close();

            

        } catch (Throwable e) {
            System.out.println("FAILED::");
            e.printStackTrace();
        }
    }
}
