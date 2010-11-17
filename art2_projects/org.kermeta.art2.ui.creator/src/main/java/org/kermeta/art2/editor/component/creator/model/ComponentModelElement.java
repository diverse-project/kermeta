/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.editor.component.creator.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import org.kermeta.art2.editor.component.creator.Kernel;
import org.kermeta.art2.editor.component.creator.layout.DragDropLayout;
import org.kermeta.art2.editor.component.creator.listeners.ComponentModelElementDropTargetListener;
import org.kermeta.art2.editor.component.creator.listeners.ModelElementDragSourceListener;

/**
 *
 * @author gnain
 */
public class ComponentModelElement extends Art2ModelElement {

    private String name;
    private RepresentationPanel panel;


    public ComponentModelElement(Kernel kernel,String name) {
        this.name = name;
        panel = new RepresentationPanel(this);
        new ModelElementDragSourceListener(this);
        new ComponentModelElementDropTargetListener(kernel, this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(Point p) {
        panel.setLocation(p);
    }

    public JPanel getGraphicalRepresentation() {
       return panel;
    }

    private class RepresentationPanel extends JPanel {

        public RepresentationPanel(ComponentModelElement element) {

            setLayout(new DragDropLayout());
            setBorder(BorderFactory.createTitledBorder(
                    BorderFactory.createLineBorder(Color.red),
                    element.getName()));
            setPreferredSize(new Dimension(70,120));
        }

    }

}
