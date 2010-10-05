/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework.listener;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author ffouquet
 */
public class DragDropLayout implements LayoutManager {

    //private List<Component> l = new ArrayList();
    @Override
    public void addLayoutComponent(String name, Component comp) {
        //l.add(comp);
    }

    @Override
    public void removeLayoutComponent(Component comp) {
        //l.remove(comp);
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return new Dimension();
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return new Dimension();
    }

    @Override
    public void layoutContainer(Container p) {

        int n = p.getComponents().length;
        for (int i = 0; i < n; i++) {
            Component c = p.getComponent(i);
            if(c.isVisible()){
                Dimension d = c.getPreferredSize();
                c.setSize(d.width, d.height);
                c.setBounds(c.getX(), c.getY(), c.getWidth(), c.getHeight());
            }
        }
    }
}
