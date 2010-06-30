/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.runtime.proxy;

/**
 *
 * @author ffouquet
 */
public class Factory {
  public static ActiveMQConsumer createConsumer() { return new ActiveMQConsumer(); }

  public static ActiveMQProducerActor createProducer() { return new ActiveMQProducerActor(); }
}
