/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.lib4tests;

import org.kermeta.art2.annotation.ComponentType;
import org.kermeta.art2.annotation.DictionaryAttribute;
import org.kermeta.art2.annotation.DictionaryType;
import org.kermeta.art2.annotation.Library;
import org.kermeta.art2.annotation.Port;
import org.kermeta.art2.annotation.PortType;
import org.kermeta.art2.annotation.ProvidedPort;
import org.kermeta.art2.annotation.Provides;
import org.kermeta.art2.annotation.RequiredPort;
import org.kermeta.art2.annotation.Requires;
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.art2.lib4tests.service.ServiceA;
import org.kermeta.art2.lib4tests.service.ServiceB;

/**
 *
 * @author gnain
 */


@Provides({
    @ProvidedPort(name="prov1", type=PortType.MESSAGE),
    @ProvidedPort(name="prov2", type=PortType.SERVICE, className=ServiceA.class)
})
@Requires({
    @RequiredPort(name="req1", type=PortType.MESSAGE),
    @RequiredPort(name="req2", type=PortType.SERVICE, className=ServiceB.class)
})
@DictionaryType({
    @DictionaryAttribute(name="mandatory1", optional=false),
    @DictionaryAttribute(name="mandatory2", defaultValue="DF", optional=false),
    @DictionaryAttribute(name="optional1", optional=true),
    @DictionaryAttribute(name="optional2", defaultValue="DF", optional=true)
})
@Library(name="ART_TEST")
@ComponentType
public class ComponentA extends AbstractComponentType implements ServiceA {



    @Start
    public void start() {
        System.out.println("ComponentA::start()");
    }

    @Stop
    public void stop() {
        System.out.println("ComponentA::stop()");
    }


    @Port(name="prov1")
    public void prov1Processor(Object o) {
        System.out.println("ComponentA::prov1Processor()");
    }

    @Port(name="prov2",method="methodAA")
    public String methodAA() {
        System.out.println("ComponentA::methodAA()");
        return "NOT NULL";
    }

    @Port(name="prov2",method="methodAB")
    public double methodAB() {
        System.out.println("ComponentA::methodAB()");
        return 2d;
    }

}
