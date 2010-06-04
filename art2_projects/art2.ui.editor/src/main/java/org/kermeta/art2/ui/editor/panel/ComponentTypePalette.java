/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.panel;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;
import org.kermeta.art2.ui.framework.elements.ComponentTypePanel;

/**
 *
 * @author ffouquet
 */
public class ComponentTypePalette extends JPanel {

    private JPanel listCTP = new JPanel();
    private JScrollPane scrollpane;

    public void addComponentTypePanel(ComponentTypePanel ctp){
        listCTP.add(ctp);
    }

    public ComponentTypePalette(){
        
        this.setOpaque(false);
        listCTP.setOpaque(false);
        listCTP.setLayout(new BoxLayout(listCTP,BoxLayout.PAGE_AXIS));
        scrollpane = new JScrollPane();
        scrollpane.setOpaque(false);
        scrollpane.setPreferredSize(new Dimension(200,400));
        scrollpane.setLayout(new ScrollPaneLayout());
        scrollpane.setViewportView(listCTP);
        scrollpane.setAutoscrolls(true);
        add(scrollpane);
    }

}
