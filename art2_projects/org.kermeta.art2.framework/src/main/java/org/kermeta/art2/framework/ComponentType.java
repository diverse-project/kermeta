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
public interface ComponentType {

    public void setHostedPorts(HashMap<String, Object> ports);

    public HashMap<String, Object> getHostedPorts();

    public void setNeededPorts(HashMap<String, Object> ports);

    public HashMap<String, Object> getNeededPorts();

    public HashMap<String,Object> getDictionary();

    public void setDictionary(HashMap<String,Object> dictionary);

    public <T> T getPortByName(String name, Class<T> type);
}
