/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.framework;

/**
 *
 * @author ffouquet
 */
public class AbstractSelectElement implements SelectElement {

    @Override
    public Boolean getSelected() {
        return selected;
    }

    @Override
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    private Boolean selected = false;

}
