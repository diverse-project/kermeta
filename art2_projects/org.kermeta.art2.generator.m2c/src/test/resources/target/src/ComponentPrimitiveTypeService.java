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
import org.kermeta.art2.annotation.Start;
import org.kermeta.art2.annotation.Stop;
import org.kermeta.art2.framework.AbstractComponentType;
import org.kermeta.art2.lib4tests.service.ServicePrimitifReturnTypes;

/**
 *
 * @author gnain
 */
@Provides({
    @ProvidedPort(name = "portPrimitiveTypes", type = PortType.SERVICE, className = ServicePrimitifReturnTypes.class)
})
@Library(name = "ART2_TESTS")
@ComponentType
public class ComponentPrimitiveTypeService extends AbstractComponentType implements ServicePrimitifReturnTypes {

    @Port(name = "portPrimitiveTypes", method = "methodShort")
    public short methodShort(short s) {
        return (short) 42;
    }

    @Port(name = "portPrimitiveTypes", method = "methodInt")
    public int methodInt(int i) {
        return (int) 42;
    }

    @Port(name = "portPrimitiveTypes", method = "methodLong")
    public long methodLong(long l) {
        return 42L;
    }

    @Port(name = "portPrimitiveTypes", method = "methodDouble")
    public double methodDouble(double d) {
        return 42d;
    }

    @Port(name = "portPrimitiveTypes", method = "methodFloat")
    public float methodFloat(float f) {
        return 42f;
    }

    @Port(name = "portPrimitiveTypes", method = "methodChar")
    public char methodChar(char c) {
        return (char) 'b';
    }

    @Port(name = "portPrimitiveTypes", method = "methodVoid")
    public void methodVoid() {
    }

    @Port(name = "portPrimitiveTypes", method = "methodByte")
    public byte methodByte(byte b) {
        return (byte) 0x42;
    }

    @Port(name = "portPrimitiveTypes", method = "methodBoolean")
    public boolean methodBoolean(boolean b) {
        return true;
    }

    @Start
    public void start() {
        System.out.println("ComponentPrimitiveTypeServce::start");
    }

    @Stop
    public void stop() {
        System.out.println("ComponentPrimitiveTypeServce::stop");
    }
}
