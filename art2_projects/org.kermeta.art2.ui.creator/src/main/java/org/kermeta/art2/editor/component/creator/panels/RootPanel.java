/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.editor.component.creator.panels;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import org.kermeta.art2.editor.component.creator.Kernel;

/**
 *
 * @author gnain
 */
public class RootPanel extends JPanel {

    private Kernel kernel;
    private JSplitPane splitPane;
    private JPanel left, right;

    public RootPanel(Kernel k) {
        kernel = k;
        initComponents();
        layoutComponents();
    }

    private void initComponents() {
        left = new JPanel();
        
        right = new JPanel();

        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setOneTouchExpandable(true);
    }

    private void layoutComponents() {

        left.setLayout(new BoxLayout(left, BoxLayout.PAGE_AXIS));
        left.add(kernel.getBasicCommandsPanel());
        left.add(kernel.getPalette());

        right.setLayout(new BorderLayout());
        right.add(kernel.getModelPanel(), BorderLayout.CENTER);

        splitPane.setLeftComponent(left);
        
        splitPane.setRightComponent(right);

        //splitPane.setDividerLocation(left.getPreferredSize().getWidth());


        setLayout(new BorderLayout());
        add(splitPane, BorderLayout.CENTER);

    }
}
