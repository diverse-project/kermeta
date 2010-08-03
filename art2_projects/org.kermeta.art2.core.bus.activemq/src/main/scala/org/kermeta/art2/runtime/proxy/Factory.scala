/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.runtime.proxy

object Factory {
  def createConsumer : ActiveMQConsumer = {  new ActiveMQConsumer(); }
  def createProducer : ActiveMQProducerActor = {  new ActiveMQProducerActor(); }
}
