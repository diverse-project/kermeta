/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework.elements;

import java.awt.Color;
import javax.swing.JComponent;
import org.kermeta.art2.ui.framework.AbstractSelectElement;

/**
 *
 * @author ffouquet
 */
public class Binding extends AbstractSelectElement {

    private JComponent from = null;
    private JComponent to = null;
    private Color selectedcolor = null;
    private Color unselectedcolor = null;

    public enum Type {

        simple, multi
    };

    public Binding(Type t) {
        if (t.equals(Type.simple)) {
            selectedcolor = new Color(243, 0, 0, 180);
            unselectedcolor = new Color(243, 238, 39, 180);
        }
        if (t.equals(Type.multi)) {
            selectedcolor = new Color(243, 0, 0, 180);
            unselectedcolor = new Color(255, 127, 36, 180);
        }
    }

    public JComponent getFrom() {
        return from;
    }

    public void setFrom(JComponent fromPort) {
        this.from = fromPort;
    }

    public JComponent getTo() {
        return to;
    }

    public void setTo(JComponent toPort) {
        this.to = toPort;
    }

    public Color getActualColor() {
        return this.getSelected() ? selectedcolor : unselectedcolor;
    }
}
