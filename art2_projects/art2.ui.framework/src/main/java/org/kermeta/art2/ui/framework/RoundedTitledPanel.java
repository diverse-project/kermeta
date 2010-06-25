/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import org.jdesktop.swingx.JXTitledSeparator;

/**
 *
 * @author ffouquet
 */
public class RoundedTitledPanel extends RoundPanel implements TitledElement {

    private JPanel contentPanel = new JPanel();
    private JPanel layoutPanel = new JPanel();
    private JXTitledSeparator title = new JXTitledSeparator();

    public RoundedTitledPanel() {
        contentPanel.setOpaque(false);
        layoutPanel.setOpaque(false);
        layoutPanel.setLayout(new BorderLayout());
        super.add(layoutPanel);
        layoutPanel.add(title, BorderLayout.NORTH);
        layoutPanel.add(contentPanel, BorderLayout.CENTER);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setForeground(Color.WHITE);
    }

    @Override
    public Component add(Component comp) {
        return contentPanel.add(comp);
    }

    @Override
    public void setTitle(String _title) {
        title.setTitle(_title);
    }
}
