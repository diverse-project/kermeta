/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.framework;

import java.util.HashMap;
import java.util.Properties;
import org.kermeta.art2.framework.port.Art2RequiredPort;

/**
 *
 * @author ffouquet
 */
public class AbstractComponentType implements ComponentType {

    private HashMap<String, Object> hostedPorts = new HashMap<String, Object>();
    private HashMap<String, Object> neededPorts = new HashMap<String, Object>();
    private HashMap<String, Object> dictionary = new HashMap<String, Object>();

    @Override
    public HashMap<String, Object> getDictionary() {
        return this.dictionary;
    }

    @Override
    public void setDictionary(HashMap<String, Object> dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public void setHostedPorts(HashMap<String, Object> ports) {
        this.hostedPorts = ports;
        for (Object p : this.hostedPorts.values()) {
            ((AbstractPort) p).setComponent(this);
        }
    }

    @Override
    public HashMap<String, Object> getNeededPorts() {
        return neededPorts;
    }

    @Override
    public void setNeededPorts(HashMap<String, Object> neededPorts) {
        this.neededPorts = neededPorts;
    }

    public Object getPortByName(String portName) {
        Object port = null;
        if (this.getHostedPorts().containsKey(portName)) {
            port = this.getHostedPorts().get(portName);
        }
        if (this.getNeededPorts().containsKey(portName)) {
            port = this.getNeededPorts().get(portName);
        }
        return port;
    }

    @Override
    public <T> T getPortByName(String name, Class<T> type) {
        Object retp = getPortByName(name);
        if (retp != null) {
            return (T) retp;
        } else {
            return null;
        }
    }

    @Override
    public HashMap<String, Object> getHostedPorts() {
        return this.hostedPorts;
    }

    @Override
    public Boolean isPortBind(String portName) {
        Object port = null;
        if (this.getNeededPorts().containsKey(portName)) {
            port = this.getNeededPorts().get(portName);
        }
        if (port != null) {
            Art2RequiredPort rport = (Art2RequiredPort) port;
            return rport.getIsBind();
        } else {
            return false;
        }
    }
}
