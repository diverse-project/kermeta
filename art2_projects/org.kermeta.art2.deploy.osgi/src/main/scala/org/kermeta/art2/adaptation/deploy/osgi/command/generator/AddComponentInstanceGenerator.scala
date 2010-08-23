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

object AddComponentInstanceGenerator {

  def generate(c : ComponentInstance) : String = {
    var content =
      //  <?xml version="1.0" encoding="UTF-8"?>
    <blueprint xmlns="http://www.osgi.org/xmlns/blueprint/v1.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.osgi.org/xmlns/blueprint/v1.0.0 http://www.osgi.org/xmlns/blueprint/v1.0.0/blueprint.xsd">
      <reference id="cf" interface="javax.jms.ConnectionFactory" />
      {
        var provided : scala.collection.mutable.ArrayBuffer[scala.xml.NodeBuffer] = new scala.collection.mutable.ArrayBuffer[scala.xml.NodeBuffer]
        var required : scala.collection.mutable.ArrayBuffer[scala.xml.NodeBuffer] = new scala.collection.mutable.ArrayBuffer[scala.xml.NodeBuffer]
        c.getProvided.foreach{ pp =>
          if(pp.isBind){
            provided.add(
              <bean id={pp.getPortTypeRef.getName} class={c.getComponentType.getFactoryBean} factory-method={"create"+c.getComponentType.getName+"PORT"+pp.getPortTypeRef.getName  } />
              <service ref={pp.getPortTypeRef.getName} interface={pp.getPortTypeRef.getRef.getName} depends-on={c.getName}>
                <service-properties>
                  <entry key="artPortName" value={pp.getPortTypeRef.getName} />
                  <entry key="artComponentName" value={c.getName} />
                </service-properties>
              </service>
              <bean id={pp.getPortTypeRef.getName+"proxy"} class={c.getComponentType.getFactoryBean} factory-method={"create"+c.getComponentType.getName+"PORTPROXY"+pp.getPortTypeRef.getName}>
                <property name="delegate"><ref component-id={pp.getPortTypeRef.getName} /></property>
              </bean>

              <bean id={pp.getPortTypeRef.getName+"proxyConsumer"} class="org.kermeta.art2.runtime.proxy.Factory" factory-method="createConsumer" init-method="init" destroy-method="stop">
                <property name="uri" value={pp.getProxyURI} />
                <property name="cf" ref="cf" />
                <property name="hubType" value={pp.getProxyHubType} />
                <property name="delegate"><ref component-id={pp.getPortTypeRef.getName+"proxy"} /></property>
              </bean>
            )
          }
        }
        c.getRequired.foreach{ rp =>
          if(rp.isBind){
            rp.getPortTypeRef.getRef match {
              
              case spt : ServicePortType => {
                  c.eContainer.eContainer.asInstanceOf[ContainerRoot].getBindings.find({b=> b.isUsingPort(rp) }) match {
                    case Some(b) => {
                        var remotePort = b.opositePort(rp).get
                        var remoteNode = remotePort.eContainer.eContainer.asInstanceOf[ContainerNode]
                        required.add(
                          <!-- -->
                          <reference id={rp.getPortTypeRef.getName} interface={rp.getPortTypeRef.getRef.getName} 
                            filter={"&(artComponentName="+remotePort.eContainer.asInstanceOf[ComponentInstance].getName+")(artPortName="+remotePort.getPortTypeRef.getName+")"} 
                          />
                        )

                      }
                    case None =>
                  }
                }
              case mpt : MessagePortType => {
                  required.add(
                    <!-- -->
                    <reference id={rp.getPortTypeRef.getName} interface="org.kermeta.art2.framework.MessagePort" filter={"&(artComponentName="+c.getName+")(artPortName="+rp.getPortTypeRef.getName+")"} />
                  )
                }
              case _ @ uncatch => println(uncatch)
            }
          }
        }
        provided++required
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
