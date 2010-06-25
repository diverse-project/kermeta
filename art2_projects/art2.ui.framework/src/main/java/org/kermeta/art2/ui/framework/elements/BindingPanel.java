/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework.elements;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.QuadCurve2D;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author ffouquet
 */
public class BindingPanel extends JPanel {

    private Collection<Binding> bindings = new ArrayList();

    public BindingPanel() {
        this.setOpaque(false);
    }

    public void addBinding(Binding b) {
        bindings.add(b);
    }

    public void removeBinding(Binding b) {
        bindings.remove(b);
    }

    public void drawCable(Graphics2D g2D, Point start, Point end) {
        Point intermed = new Point();
        intermed.y = Math.max(end.y, start.y) + 30;
        intermed.x = (end.x + start.x) / 2;
        g2D.draw(new QuadCurve2D.Float(start.x, start.y, intermed.x, intermed.y, end.x, end.y));
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        g.setPaintMode();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5F));
        g2d.setStroke(new BasicStroke(5, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND));


        for (Binding b : bindings) {
            //g2d.setColor(new Color(243, 238, 39, 150));
            Point p1 = null;
            Point ptemp = new Point();
            ptemp = b.getFrom().getLocationOnScreen();
            ptemp.setLocation(ptemp.getX() + (b.getFrom().getWidth() / 2), ptemp.getY() + (b.getFrom().getHeight() / 2));
            SwingUtilities.convertPointFromScreen(ptemp, this);
            p1 = ptemp;
            Point p2 = null;
            ptemp = b.getTo().getLocationOnScreen();
            ptemp.setLocation(ptemp.getX() + (b.getTo().getWidth() / 2), ptemp.getY() + (b.getTo().getHeight() / 2));
            SwingUtilities.convertPointFromScreen(ptemp, this);
            p2 = ptemp;
            if (p1 != null && p2 != null) {
                /*
                if (b.getSelected()) {
                    g2d.setColor(new Color(243, 0, 0, 150));
                } else {
                    g2d.setColor(new Color(243, 238, 39, 150));
                }*/
                g2d.setColor(b.getActualColor());

                drawCable(g2d, p1, p2);
            }
        }

        g.setColor(new Color(255, 255, 255, 150));
    }
}
