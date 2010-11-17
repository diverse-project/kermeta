/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.editor.component.creator.panels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DropTarget;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JComponent;
import javax.swing.JPanel;
import org.kermeta.art2.editor.component.creator.Kernel;
import org.kermeta.art2.editor.component.creator.layout.DragDropLayout;
import org.kermeta.art2.editor.component.creator.listeners.ModelPanelDropTargetListener;

/**
 *
 * @author gnain
 */
public class ModelPanel extends JPanel {

    private Kernel kernel;
    private Map<Object,JPanel> mapping;

    public ModelPanel(Kernel k) {
        kernel = k;
        initComponents();
    }

    private void initComponents() {

        mapping = new HashMap<Object,JPanel>();

        new ModelPanelDropTargetListener(kernel, this);

        setLayout(new DragDropLayout());
        setPreferredSize(new Dimension(400,400));
        setBackground(new Color(0, 0, 0, 200));
        setOpaque(true);
    }

    public void addLibrary(JPanel element) {
        add(element);
    }

    public void addComponent(JPanel parent, JPanel element) {
        parent.add(element);
        parent.revalidate();
        parent.repaint();
    }

    public void clearAll() {
        removeAll();
        revalidate();
        repaint();
    }

}
