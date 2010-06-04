/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework.elements;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import org.jdesktop.swingx.JXPanel;
import org.jdesktop.swingx.painter.CompoundPainter;
import org.jdesktop.swingx.painter.MattePainter;

/**
 *
 * @author ffouquet
 */
public class ModelPanel extends JLayeredPane {

    // private JLayeredPane layeredPane;
    private BindingPanel bindingPanel;
    private JPanel dragPanel;
    private JXPanel nodePanel;

    public ModelPanel() {
        nodePanel = new JXPanel();
        dragPanel = new JPanel();
        dragPanel.setOpaque(false);
        bindingPanel = new BindingPanel();
        //layeredPane = new JLayeredPane();

        setOpaque(false);

        add(nodePanel, JLayeredPane.DEFAULT_LAYER);
        add(dragPanel, JLayeredPane.DRAG_LAYER);
        add(bindingPanel, JLayeredPane.PALETTE_LAYER);


        GradientPaint grad = new GradientPaint(new Point(0, 0), new Color(63, 128, 187), new Point(0, getHeight()), new Color(51, 51, 51));
        MattePainter matte = new MattePainter(grad);
        CompoundPainter p = new CompoundPainter(matte);
        nodePanel.setBackgroundPainter(p);


        addComponentListener(new ComponentAdapter() {

            @Override
            public void componentResized(ComponentEvent e) {
                nodePanel.setBounds(0, 0, getWidth(), getHeight());
                bindingPanel.setBounds(0, 0, getWidth(), getHeight());
                dragPanel.setBounds(0, 0, getWidth(), getHeight());

                repaint();
                revalidate();
            }
        });
    }

    public void addNode(JPanel p) {
        nodePanel.add(p);
        repaint();
        revalidate();
    }

    public void addBinding(Binding b) {
        bindingPanel.addBinding(b);
        repaint();
        revalidate();
    }

    public void removeBinding(Binding b){
        bindingPanel.removeBinding(b);
    }

    public void setFlightObject(JPanel fobject) {
        dragPanel.add(fobject);
    }

    public void unsetFlightObject(JPanel fobject) {
        dragPanel.remove(fobject);
    }
}
