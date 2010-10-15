/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.property;

import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import org.kermeta.art2.ui.editor.Art2UIKernel;

/**
 *
 * @author ffouquet
 */
public class InstancePropertyEditor extends NamedElementPropertyEditor {

    public InstancePropertyEditor(org.kermeta.art2.Instance elem, Art2UIKernel _kernel) {
        super(elem, _kernel);

        JTable table = new JTable(new InstanceTableModel(elem));     
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);

        scrollPane.setPreferredSize(new Dimension(300,150));

        this.addCenter(scrollPane);

    }
}
