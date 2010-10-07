/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.panel;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import org.jdesktop.swingx.JXTaskPane;
import org.kermeta.art2.ui.framework.elements.ComponentTypePanel;

/**
 *
 * @author ffouquet
 */
public class ComponentTypeLibraryPalette extends JXTaskPane {

    //private JPanel content = new JPanel();

    public ComponentTypeLibraryPalette(String name){
        this.setTitle(name);
        this.setName(name);
        //this.setLayout(new BorderLayout());
        //add(content);
        
    }

    public void addComponentTypePanel(ComponentTypePanel ctp){
        add(ctp);
        repaint();
        revalidate();
    }

 

}
