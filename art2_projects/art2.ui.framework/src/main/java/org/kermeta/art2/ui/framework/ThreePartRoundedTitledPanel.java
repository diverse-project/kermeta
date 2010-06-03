/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Panel;
import javax.swing.JPanel;

/**
 *
 * @author ffouquet
 */
public class ThreePartRoundedTitledPanel extends RoundedTitledPanel {

    private JPanel c_left = new JPanel();
    private JPanel c_center = new JPanel();
    private JPanel c_right = new JPanel();

    public ThreePartRoundedTitledPanel() {
        c_left.setOpaque(false);
        c_center.setOpaque(false);
        c_right.setOpaque(false);
        
        this.content.setLayout(new BorderLayout());
        this.content.add(c_left, BorderLayout.WEST);
        this.content.add(c_center, BorderLayout.CENTER);
        this.content.add(c_right, BorderLayout.EAST);
    }

    public Component addLeft(JPanel p) {
        return c_left.add(p);
    }

    public Component addRight(JPanel p) {
        return c_right.add(p);
    }

    public Component addCenter(JPanel p) {
        return c_center.add(p);
    }

    public Component add(JPanel p) {
        return c_center.add(p);
    }
}
