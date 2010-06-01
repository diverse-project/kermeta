/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

/**
 *
 * @author ffouquet
 */
public abstract class AbstractComponentType implements Component {

    private HashMap<String,Port> hostedPorts = new HashMap<String,Port>();
    private HashMap<String,Port> neededPorts = new HashMap<String,Port>();
    private Properties dictionary = new Properties();

    @Override
    public Properties getDictionary() {
        return this.dictionary;
    }

    @Override
    public HashMap<String,Port> getHostedPorts() {
        return this.hostedPorts;
    }

    @Override
    public HashMap<String,Port> getNeededPorts() {
        return this.neededPorts;
    }

    @Override
    public void setDictionary(Properties dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public void setHostedPorts(HashMap<String,Port> ports) {
        this.hostedPorts = ports;
    }

    @Override
    public void setNeededPorts(HashMap<String,Port> ports) {
        this.neededPorts = ports;
    }

    public Port getPortByName(String portName) {
        Port port = null;
        if(this.getHostedPorts().containsKey(portName)){
            port = this.getHostedPorts().get(portName);
        }
        if(this.getNeededPorts().containsKey(portName)){
            port = this.getNeededPorts().get(portName);
        }
        return port;
    }



}
