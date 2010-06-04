/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework;

/**
 *
 * @author ffouquet
 */
public abstract class AbstractPort implements Port {

    private Object component = null;
    private String name;

    public Object getComponent() {
        return component;
    }

    public void setComponent(Object component) {
        this.component = component;
    }

    @Override
    public String getName() {
        return this.name;
    }


}
