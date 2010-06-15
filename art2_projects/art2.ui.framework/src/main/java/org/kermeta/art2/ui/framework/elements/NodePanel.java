/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework.elements;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import org.kermeta.art2.ui.framework.RoundedTitledPanel;

/**
 *
 * @author ffouquet
 */
public class NodePanel extends RoundedTitledPanel {

    public NodePanel() {

        this.setBackground(new Color(100, 100, 100, 150));
    }
/*
    @Override
    public Dimension getPreferredSize() {
        Dimension parentsize = this.getParent().getSize();

    //    System.out.println(this.get"")

        Dimension preferedDim = new Dimension(0, 0);
        for (Component child : content.getComponents()) {
            preferedDim.width = Math.max(child.getMinimumSize().width, preferedDim.width);
            preferedDim.height = Math.max(child.getLocation().y + child.getSize().height, preferedDim.height);
        }
        return preferedDim;
    }*/
}
