/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.framework.elements;

/**
 *
 * @author ffouquet
 */
public class Binding {

    private PortPanel fromPort = null;
    private PortPanel toPort = null;

    public PortPanel getFromPort() {
        return fromPort;
    }

    public void setFromPort(PortPanel fromPort) {
        this.fromPort = fromPort;
    }

    public PortPanel getToPort() {
        return toPort;
    }

    public void setToPort(PortPanel toPort) {
        this.toPort = toPort;
    }

}
