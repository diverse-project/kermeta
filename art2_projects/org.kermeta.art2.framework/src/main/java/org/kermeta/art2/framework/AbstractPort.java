/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.framework;

import org.kermeta.art2.framework.Component;
import org.kermeta.art2.framework.Port;

/**
 *
 * @author ffouquet
 */
public abstract class AbstractPort implements Port {

    private Component component = null;
    private String name;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }



}
