/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.entimid.fakeStuff.devices;

import org.kermeta.art2.annotation.*;
import org.kermeta.art2.framework.AbstractComponentType;

/**
 *
 * @author ffouquet
 */


@Provides({
    @ProvidedPort(name="log",type=PortType.MESSAGE)
})
@ComponentType(libName="fakeLog")
public class FakeSimpleLog extends AbstractComponentType {

    @Start
    public void init() {
    }

    @Stop
    public void stop() {
    }

    @Port(name="log",method="process")
    public void processMsg(Object o){
        System.out.println(o);
    }

}
