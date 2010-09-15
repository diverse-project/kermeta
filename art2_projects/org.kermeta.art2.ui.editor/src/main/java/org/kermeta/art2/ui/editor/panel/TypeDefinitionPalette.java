/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.panel;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneLayout;
import org.kermeta.art2.ui.framework.elements.ComponentTypePanel;

/**
 *
 * @author ffouquet
 */
public class TypeDefinitionPalette extends JScrollPane {

    private JPanel subpanels = new JPanel();
    private List<ComponentTypeLibraryPalette> libPalettes = new ArrayList<ComponentTypeLibraryPalette>();

    public void addTypeDefinitionPanel(JPanel ctp, String libName) {
        ComponentTypeLibraryPalette foundP = null;
        for (ComponentTypeLibraryPalette p : libPalettes) {
            if (p.getName().equals(libName)) {
                foundP = p;
            }
        }
        if (foundP == null) {
            foundP = new ComponentTypeLibraryPalette(libName);
            libPalettes.add(foundP);
            subpanels.add(foundP);
            repaint();
            revalidate();
        }
        foundP.add(ctp);
    }

    public void clear(){
        libPalettes.clear();
        subpanels.removeAll();
    }

    public TypeDefinitionPalette() {
        subpanels.setOpaque(false);
        subpanels.setLayout(new BoxLayout(subpanels, BoxLayout.PAGE_AXIS));
        setOpaque(false);
        //setPreferredSize(new Dimension(200, 400));
        setLayout(new ScrollPaneLayout());
        setViewportView(subpanels);
        setAutoscrolls(true);
    }
}
