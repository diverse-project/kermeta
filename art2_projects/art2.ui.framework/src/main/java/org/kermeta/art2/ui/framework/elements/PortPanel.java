/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework.elements;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author ffouquet
 */
public class PortPanel extends JPanel {

    /**
     * contructor
     * @param _control
     */
    public PortPanel() {
        setOpaque(false);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(30, 30));
        this.setMaximumSize(new Dimension(30, 30));
        this.setMinimumSize(new Dimension(30, 30));
        this.setSize(new Dimension(30, 30));
    }
    
    private Color actualFillColor = new Color(0, 0, 0, 150);

    protected void paintComponent(Graphics g) {
        int x = 5;
        int y = 5;
        int w = getWidth() - 10;
        int h = getHeight() - 10;
        int arc = 30;

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        /*
        if (shadow != null) {
        int xOffset = (shadow.getWidth() - w) / 2;
        int yOffset = (shadow.getHeight() - h) / 2;
        g2.drawImage(shadow, x - xOffset, y - yOffset, null);
        }
         */
        g2.setColor(new Color(0, 0, 0, 150));
        //g2.setColor(Color.WHITE);

        GradientPaint grad = new GradientPaint(new Point(0, 0), actualFillColor, new Point(0, getHeight()), new Color(150, 150, 150, 180));
        g2.setPaint(grad);
        g2.fillRoundRect(x, y, w, h, arc, arc);
        g2.setStroke(new BasicStroke(3f));
        g2.setColor(new Color(255, 255, 255, 220));
        g2.drawRoundRect(x, y, w, h, arc, arc);
        g2.dispose();
    }

    public void highlightDisable() {
        actualFillColor = new Color(255, 0, 0, 150);
        repaint();
        revalidate();
    }

    /**
     * semantic returns : enable the highlights
     */
    //@Override
    public void highlightEnable() {
        actualFillColor = new Color(0, 255, 0, 150);
        repaint();
        revalidate();
    }

    /**
     * semantic returns : stop the highlights
     */
    //@Override
    public void highlightStop() {
        actualFillColor = new Color(0, 0, 0, 150);
        repaint();
        revalidate();
    }
}
