/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.editor.component.creator.panels;

import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.kermeta.art2.editor.component.creator.palettes.Art2Element;

/**
 *
 * @author gnain
 */
public class PaletteElementPanel extends JPanel {

    private Art2Element elem;

    public Art2Element getArt2Element() {
        return elem;
    }

    public PaletteElementPanel(Art2Element elem, DragGestureListener lst) {
        this.elem = elem;
        add(elem.getGraphicalElement());
        add(new JLabel(elem.getElementName()));
        DragSource ds = new DragSource();
        ds.createDefaultDragGestureRecognizer(this,
                DnDConstants.ACTION_COPY, lst);
    }
}
