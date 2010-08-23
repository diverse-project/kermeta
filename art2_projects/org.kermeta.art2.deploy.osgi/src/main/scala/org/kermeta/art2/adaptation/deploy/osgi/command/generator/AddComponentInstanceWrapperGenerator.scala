/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.adaptation.deploy.osgi.command.generator

import org.kermeta.art2.Binding
import org.kermeta.art2.ComponentInstance
import scala.collection.JavaConversions._
import scala.xml._
import org.kermeta.art2._
import org.kermeta.art2.framework.aspects.Art2Aspects._

object AddComponentInstanceWrapperGenerator {

  def generate(c : ComponentInstance) : String = {
    var content =
      //  <?xml version="1.0" encoding="UTF-8"?>
    <blueprint xmlns="http://www.osgi.org/xmlns/blueprint/v1.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.osgi.org/xmlns/blueprint/v1.0.0 http://www.osgi.org/xmlns/blueprint/v1.0.0/blueprint.xsd">
      <reference id="cf" interface="javax.jms.ConnectionFactory" />
      {
        var required : scala.collection.mutable.ArrayBuffer[scala.xml.NodeBuffer] = new scala.collection.mutable.ArrayBuffer[scala.xml.NodeBuffer]
        c.getRequired.foreach{ rp =>
          if(rp.isBind){
            rp.getPortTypeRef.getRef match {

              case spt : ServicePortType => {
                  c.eContainer.eContainer.asInstanceOf[ContainerRoot].getBindings.find({b=> b.isUsingPort(rp) }) match {
                    case Some(b) => {
                        var remotePort = b.opositePort(rp).get
                        var remoteNode = remotePort.eContainer.eContainer.asInstanceOf[ContainerNode]

                        if(remoteNode.isModelEquals(c.eContainer.asInstanceOf[ContainerNode])){
                          //collocated binding, no proxy injection
                        } else {
                          required.add(
                            <bean id={rp.getPortTypeRef.getName+"proxyProducer"} class="org.kermeta.art2.runtime.proxy.Factory" factory-method="createProducer" init-method="init" destroy-method="stop">
                              <property name="uri" value={remotePort.getProxyURI} />
                              <property name="hubType" value={rp.getProxyHubType} />
                            </bean>

                            <bean id={rp.getPortTypeRef.getName+"proxy"} class={c.getComponentType.getFactoryBean} factory-method={"create"+c.getComponentType.getName+"PORTPROXY"+rp.getPortTypeRef.getName}>
                              <property name="delegate"><ref component-id={rp.getPortTypeRef.getName+"proxyProducer"} /></property>
                            </bean>

                            <service ref={rp.getPortTypeRef.getName+"proxy"} interface={rp.getPortTypeRef.getRef.getName}>
                              <service-properties>
                                <entry key="artPortName" value={rp.getPortTypeRef.getName} />
                                <entry key="artComponentName" value={remotePort.eContainer.asInstanceOf[ComponentInstance].getName} />
                              </service-properties>
                            </service>
                          )
                        }
                      }
                    case None =>
                  }
                }
              case mpt : MessagePortType => {
                  var portBinding= c.eContainer.eContainer.asInstanceOf[ContainerRoot].getMBindings.foreach{mb=> mb.getPort.isModelEquals(rp)  }
                  required.add(

                    <bean id={rp.getPortTypeRef.getName+"proxyProducer"} class="org.kermeta.art2.runtime.proxy.Factory" factory-method="createProducer" init-method="init" destroy-method="stop">
                      <property name="uri" value={rp.getProxyURI} />
                      <property name="hubType" value={rp.getProxyHubType} />
                    </bean>

                    <bean id={rp.getPortTypeRef.getName+"proxy"} class={c.getComponentType.getFactoryBean} factory-method={"create"+c.getComponentType.getName+"PORTPROXY"+rp.getPortTypeRef.getName}>
                      <property name="delegate"><ref component-id={rp.getPortTypeRef.getName+"proxyProducer"} /></property>
                    </bean>

                    <service ref={rp.getPortTypeRef.getName+"proxy"} interface="org.kermeta.art2.framework.MessagePort">
                      <service-properties>
                        <entry key="artPortName" value={rp.getPortTypeRef.getName} />
                        <entry key="artComponentName" value={c.getName} />
                      </service-properties>
                    </service>
                  )
                }
              case _ @ uncatch => println(uncatch)
            }
          }
        }
        required
      }
      <!-- create the bean -->
      <bean id={c.getName} class={c.getComponentType.getFactoryBean} factory-method={"create"+c.getComponentType.getName}  init-method={c.getComponentType.getStartMethod} destroy-method={c.getComponentType.getStopMethod}>

        <property name="dictionary">
          <map>
            <entry key="art.name"><ref component-id={c.getName} /></entry>
            <entry key="osgi.bundle"><ref component-id="blueprintBundle" /></entry>
          </map>
        </property>

        <property name="hostedPorts">
          <map>
            {
              var entries = new scala.collection.mutable.ArrayBuffer[scala.xml.Elem]
              c.getProvided.foreach{hp =>
                if(hp.isBind){
                  entries.append(
                    <entry key={hp.getPortTypeRef.getName}>
                      <ref component-id={hp.getPortTypeRef.getName} />
                    </entry>
                  )
                }
              }
              entries
            }
          </map>
        </property>
        <property name="neededPorts">
          <map>
            {
              var entries = new scala.collection.mutable.ArrayBuffer[scala.xml.Elem]
              c.getRequired.foreach{np =>
                if(np.isBind){
                  entries.append(
                    <entry key={np.getPortTypeRef.getName}>
                      <ref component-id={np.getPortTypeRef.getName} />
                    </entry>
                  )
                }
              }
              entries
            }
          </map>
        </property>
      </bean>
    </blueprint>;
    content.toString
  }

}
