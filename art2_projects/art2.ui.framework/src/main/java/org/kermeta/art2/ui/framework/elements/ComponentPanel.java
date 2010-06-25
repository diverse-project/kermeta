/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework.elements;

import java.awt.Color;
import org.jdesktop.swingx.JXTitledSeparator;
import org.kermeta.art2.ui.framework.SelectElement;
import org.kermeta.art2.ui.framework.ThreePartRoundedPanel;
import org.kermeta.art2.ui.framework.TitledElement;

/**
 *
 * @author ffouquet
 */
public class ComponentPanel extends ThreePartRoundedPanel implements SelectElement, TitledElement {

    JXTitledSeparator titlebar = new JXTitledSeparator();

    public ComponentPanel() {
        titlebar.setForeground(Color.WHITE);
        this.content.add(titlebar);
    }

    @Override
    public void setTitle(String title) {
        titlebar.setTitle(title);
    }
    private Boolean selected = false;

    @Override
    public void setSelected(Boolean _selected) {
        selected = _selected;
        active = _selected;
    }

    @Override
    public Boolean getSelected() {
        return selected;
    }
}
