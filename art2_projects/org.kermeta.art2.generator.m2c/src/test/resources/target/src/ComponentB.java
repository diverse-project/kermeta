/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.lib4tests;

import org.kermeta.art2.annotation.ComponentType;
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
import org.kermeta.art2.lib4tests.service.ServiceB;

/**
 *
 * @author gnain
 */

@Provides({
    @ProvidedPort(name="prov1", type=PortType.SERVICE, className=ServiceB.class)
})
@Requires({
    @RequiredPort(name="req2", type=PortType.MESSAGE)
})
@Library(name="ART_TEST")
@ComponentType
public class ComponentB extends AbstractComponentType implements ServiceB {

    @Port(name="prov1", method="methodBA")
    public void methodBA() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Port(name="prov1", method="methodBB")
    public boolean methodBB() {
        return true;
    }

        @Start
    public void start() {
        System.out.println("ComponentB::start()");
    }

    @Stop
    public void stop() {
        System.out.println("ComponentB::stop()");
    }

}
