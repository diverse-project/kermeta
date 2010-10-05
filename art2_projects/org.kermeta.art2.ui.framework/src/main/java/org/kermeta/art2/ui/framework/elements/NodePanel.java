/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework.elements;

import java.awt.Color;
import org.kermeta.art2.ui.framework.RoundedTitledPanel;
import org.kermeta.art2.ui.framework.SelectElement;

/**
 *
 * @author ffouquet
 */
public class NodePanel extends RoundedTitledPanel implements SelectElement {

    public NodePanel() {

        this.setBackground(new Color(100, 100, 100, 150));
    }

    private Boolean selected= false;

    @Override
    public void setSelected(Boolean _selected) {
        selected = _selected;
        active = _selected;
    }

    @Override
    public Boolean getSelected() {
        return selected;
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
