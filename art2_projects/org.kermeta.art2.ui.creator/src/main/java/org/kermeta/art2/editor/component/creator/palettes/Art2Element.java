/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.editor.component.creator.palettes;

import javax.swing.JComponent;
import javax.swing.JPanel;
import org.kermeta.art2.editor.component.creator.listeners.Art2ElementDragSourceListener;

/**
 *
 * @author gnain
 */
public abstract class Art2Element extends JPanel {

    public Art2Element() {
        setOpaque(false);
        //new Art2ElementDragSourceListener(this);
    }

    public abstract JPanel getGraphicalElement();
    public abstract String getElementName();


}
