/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Panel;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author ffouquet
 */
public class ThreePartRoundedPanel extends RoundedTitledPanel {

    private JPanel c_left = new JPanel();
    private JPanel c_center = new JPanel();
    private JPanel c_right = new JPanel();

    public ThreePartRoundedPanel() {
        c_left.setOpaque(false);
        c_center.setOpaque(false);
        c_right.setOpaque(false);

        c_left.setLayout(new BoxLayout(c_left, BoxLayout.PAGE_AXIS));
        c_right.setLayout(new BoxLayout(c_right, BoxLayout.PAGE_AXIS));
        c_center.setLayout(new BoxLayout(c_center, BoxLayout.PAGE_AXIS));

        this.content.setLayout(new BorderLayout());
        this.content.add(c_left, BorderLayout.WEST);
        this.content.add(c_center, BorderLayout.CENTER);
        this.content.add(c_right, BorderLayout.EAST);
    }

    public Component addLeft(JComponent p) {
        return c_left.add(p);
    }

    public Component addRight(JComponent p) {
        return c_right.add(p);
    }

    public Component addCenter(JComponent p) {
        return c_center.add(p);
    }

    public Component add(JPanel p) {
        return c_center.add(p);
    }
}
