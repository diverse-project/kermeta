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
        input, ouput
    };

    public Binding(Type t) {
        if (t.equals(Type.input)) {
            selectedcolor = new Color(254, 238, 100, 180);
            unselectedcolor = new Color(200, 238, 39, 180);
        }
        if (t.equals(Type.ouput)) {
            selectedcolor = new Color(254, 0, 0, 180);
            unselectedcolor = new Color(200, 0, 0, 180);
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
