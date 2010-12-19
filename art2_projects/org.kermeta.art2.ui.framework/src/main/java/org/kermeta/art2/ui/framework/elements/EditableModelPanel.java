/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework.elements;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import org.jdesktop.swingx.JXPanel;

/**
 *
 * @author ffouquet
 */
public class EditableModelPanel extends JLayeredPane {

    private JPanel propertiesPanel = null;
    private JButton closeProperties = new JButton("Close");
    private JComponent modelPanel = null;

    public EditableModelPanel(JComponent _modelPanel) {
        modelPanel = _modelPanel;
        closeProperties.setOpaque(false);
        closeProperties.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent me) {
                undisplayProperties();
            }
        });
        propertiesPanel = new JPanel();
        propertiesPanel.setLayout(new BorderLayout());
        propertiesPanel.setOpaque(false);
        this.setOpaque(false);

        addComponentListener(new ComponentAdapter() {

            @Override
            public void componentResized(ComponentEvent e) {
                modelPanel.setBounds(0, 0, getWidth(), getHeight());
                propertiesPanel.setBounds(0, 0, getWidth(), getHeight());
                doLayout();
                repaint();
                revalidate();
            }
        });

        add(modelPanel, JLayeredPane.DEFAULT_LAYER);
        add(propertiesPanel, JLayeredPane.POPUP_LAYER);
    }
    private JPanel previousPropertiesPanel = null;

    public void displayProperties(JPanel prop) {
        //propertiesPanel.add(closeProperties,BorderLayout.EAST);

        if (previousPropertiesPanel != null) {
            previousPropertiesPanel.setVisible(false);
            propertiesPanel.remove(previousPropertiesPanel);
            previousPropertiesPanel = null;
        }

        JPanel tempLayout = new JPanel();
        tempLayout.setOpaque(false);
        tempLayout.add(Box.createGlue());
        tempLayout.add(prop);
        tempLayout.add(Box.createGlue());


        propertiesPanel.add(tempLayout, BorderLayout.EAST);
        previousPropertiesPanel = prop;

//        Component[] childs = previousPropertiesPanel.getComponents();
//        for (int i = 0; i < childs.length; i++) {
//            System.out.println("Layout");
//            childs[i].doLayout();
//            childs[i].repaint();
//            childs[i].validate();
//
//            Component[] childs2 = ((Container) childs[i]).getComponents();
//            for (int i2 = 0; i2 < childs2.length; i2++) {
//                System.out.println("Layout");
//                childs2[i2].doLayout();
//                childs2[i2].repaint();
//                childs2[i2].validate();
//            }
//
//        }

        //propertiesPanel.setBounds(propertiesPanel.getX(), propertiesPanel.getY(), propertiesPanel.getWidth(), propertiesPanel.getHeight());

        propertiesPanel.doLayout();
        this.doLayout();
        propertiesPanel.revalidate();
        propertiesPanel.repaint();
        repaint();
        revalidate();


    }

    public void undisplayProperties() {
        if (previousPropertiesPanel != null) {
            previousPropertiesPanel.setVisible(false);
            propertiesPanel.remove(previousPropertiesPanel);
            previousPropertiesPanel = null;
        }
        propertiesPanel.repaint();
        propertiesPanel.revalidate();
        repaint();
        revalidate();
    }
}
