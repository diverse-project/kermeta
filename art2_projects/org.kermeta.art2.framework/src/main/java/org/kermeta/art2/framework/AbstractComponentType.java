/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.framework;

import java.util.HashMap;
import java.util.Properties;

/**
 *
 * @author ffouquet
 */
public class AbstractComponentType implements ComponentType {

    private HashMap<String,Object> hostedPorts = new HashMap<String,Object>();
    private HashMap<String,Object> neededPorts = new HashMap<String,Object>();
    private Properties dictionary = new Properties();

    @Override
    public Properties getDictionary() {
        return this.dictionary;
    }

    @Override
    public void setDictionary(Properties dictionary) {
        this.dictionary = dictionary;
    }

    @Override
    public void setHostedPorts(HashMap<String,Object> ports) {
        this.hostedPorts = ports;
        for(Object p: this.hostedPorts.values()){
            ((AbstractPort)p).setComponent(this);
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
        if(this.getHostedPorts().containsKey(portName)){
            port = this.getHostedPorts().get(portName);
        }
        if(this.getNeededPorts().containsKey(portName)){
            port = this.getNeededPorts().get(portName);
        }
        return port;
    }

    @Override
    public <T> T getPortByName(String name, Class<T> type) {
        Object retp = getPortByName(name);
        return (T)retp;
    }

    @Override
    public HashMap<String, Object> getHostedPorts() {
       return this.hostedPorts;
    }



}
