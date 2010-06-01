/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author ffouquet
 */
public interface Component {

    public void init();
    public void stop();

    public void setHostedPorts(HashMap<String,Port> ports);
    public HashMap<String,Port> getHostedPorts();

    public void setNeededPorts(HashMap<String,Port> ports);
    public HashMap<String,Port> getNeededPorts();

    public Properties getDictionary();
    public void setDictionary(Properties dictionary);
}
