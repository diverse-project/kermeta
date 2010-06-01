/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework;

/**
 *
 * @author ffouquet
 */
public interface ComponentType {
    
    public <T> T getPortByName(String name, Class<T> type);

}
