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

import org.hornetq.api.core.TransportConfiguration;
import org.hornetq.api.core.client.ClientConsumer;
import org.hornetq.api.core.client.ClientMessage;
import org.hornetq.api.core.client.ClientProducer;
import org.hornetq.api.core.client.ClientSession;
import org.hornetq.api.core.client.ClientSessionFactory;
import org.hornetq.api.core.client.HornetQClient;
import org.hornetq.core.config.Configuration;
import org.hornetq.core.config.impl.ConfigurationImpl;
import org.hornetq.core.remoting.impl.invm.InVMAcceptorFactory;
import org.hornetq.core.remoting.impl.invm.InVMConnectorFactory;
import org.hornetq.core.server.HornetQServer;
import org.hornetq.core.server.HornetQServers;
import org.hornetq.core.server.JournalType;

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
         configuration.getAcceptorConfigurations().add(new TransportConfiguration(InVMAcceptorFactory.class.getName()));

         // Step 2. Create and start the server
         HornetQServer server = HornetQServers.newHornetQServer(configuration);
         server.start();

         
         try{
            ClientSessionFactory nettyFactory = HornetQClient.createClientSessionFactory(new TransportConfiguration(
                    InVMConnectorFactory.class.getName()));


            ClientSession session = nettyFactory.createSession();
            session.createQueue("example", "example", true);
            

            ClientProducer producer = session.createProducer("example");
            ClientMessage message = session.createMessage(true);
            message.getBodyBuffer().writeString("Hello");

            producer.send(message);
            session.start();
            ClientConsumer consumer = session.createConsumer("example");

            

            ClientMessage msgReceived = consumer.receive();
            System.out.println("message = " + msgReceived.getBodyBuffer().readString());
            session.close();

            Thread.currentThread().sleep(200000);

        } catch (Throwable e) {
            System.out.println("FAILED::");
            e.printStackTrace();
        }
    }
}
