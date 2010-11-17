/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.editor.component.creator.palettes;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author gnain
 */
public class Library extends Art2Element {

    private JPanel graphicalElement;

    public Library() {
        graphicalElement = new LibPanel();
    }


    public JPanel getGraphicalElement() {
        return graphicalElement;
    }

    @Override
    public String getElementName() {
        return "Library";
    }

    private class LibPanel extends JPanel {

        public LibPanel() {
            setOpaque(false);
            add(new JLabel(new ImageIcon(getClass().getResource("/icons/library.gif"))));
        }

    }
}
