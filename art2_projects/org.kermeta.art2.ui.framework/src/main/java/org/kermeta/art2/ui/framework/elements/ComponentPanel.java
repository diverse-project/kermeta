/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework.elements;

import java.awt.Color;
import javax.swing.SwingConstants;
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
    JXTitledSeparator separatorbar = new JXTitledSeparator();
    JXTitledSeparator typebar = new JXTitledSeparator();

    public ComponentPanel() {
        titlebar.setForeground(Color.WHITE);
        titlebar.setHorizontalAlignment(SwingConstants.CENTER);
        separatorbar.setForeground(Color.WHITE);
        separatorbar.setTitle("");
        separatorbar.setHorizontalAlignment(SwingConstants.CENTER);
        separatorbar.setVisible(false);
        typebar.setForeground(Color.WHITE);
        typebar.setTitle("");
        typebar.setHorizontalAlignment(SwingConstants.CENTER);
        typebar.setVisible(false);

        addCenter(titlebar);
        addCenter(separatorbar);
        addCenter(typebar);

    }

    @Override
    public void setTitle(String title) {
        titlebar.setTitle(title);
    }

    public void setTypeName(String title) {
        typebar.setTitle(title);
        separatorbar.setVisible(true);
        typebar.setVisible(true);
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
