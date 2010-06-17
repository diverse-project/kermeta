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
import org.jdesktop.swingx.JXTaskPane;
import org.kermeta.art2.ui.framework.elements.ComponentTypePanel;

/**
 *
 * @author ffouquet
 */
public class ComponentTypePalette extends JPanel {

    private JPanel subpanels = new JPanel();
    private JScrollPane scrollpane;
    private List<ComponentTypeLibraryPalette> libPalettes = new ArrayList<ComponentTypeLibraryPalette>();

    public void addComponentTypePanel(ComponentTypePanel ctp, String libName) {
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

    public ComponentTypePalette() {
        this.setOpaque(false);
        subpanels.setOpaque(false);
        subpanels.setLayout(new BoxLayout(subpanels, BoxLayout.PAGE_AXIS));
        scrollpane = new JScrollPane();
        scrollpane.setOpaque(false);
        scrollpane.setPreferredSize(new Dimension(200, 400));
        scrollpane.setLayout(new ScrollPaneLayout());
        scrollpane.setViewportView(subpanels);
        scrollpane.setAutoscrolls(true);
        add(scrollpane);
    }
}
