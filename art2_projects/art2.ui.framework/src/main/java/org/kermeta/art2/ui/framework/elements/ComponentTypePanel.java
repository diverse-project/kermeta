/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework.elements;

import java.awt.Color;
import org.jdesktop.swingx.JXTitledSeparator;
import org.kermeta.art2.ui.framework.RoundPanel;

/**
 *
 * @author ffouquet
 */
public class ComponentTypePanel extends RoundPanel {

    public ComponentTypePanel(String title) {
        JXTitledSeparator titlebar = new JXTitledSeparator();
        titlebar.setForeground(Color.WHITE);
        titlebar.setTitle(title);
        add(titlebar);
    }
}
