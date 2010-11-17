/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.editor.component.creator.palettes;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author gnain
 */
public class MessageInputPort extends Art2Element {

    private JPanel graphicalElement;

    public MessageInputPort() {
        graphicalElement = new Round();
    }


    @Override
    public JPanel getGraphicalElement() {
        return graphicalElement;
    }

    @Override
    public String getElementName() {
        return "Message Input Port";
    }

    private class Round extends JPanel {

        public Round() {
            setOpaque(false);
            setPreferredSize(new Dimension(17,17));
        }

        @Override
        public void paint(Graphics grphcs) {
            super.paint(grphcs);
            if(grphcs instanceof Graphics2D) {
                Graphics2D g = (Graphics2D)grphcs;
                g.fillOval(0, 0, 15, 15);
            }
        }
    }
}
