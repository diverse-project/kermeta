/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework;

import org.kermeta.art2.ui.framework.elements.NodePanel;
import org.kermeta.art2.ui.framework.elements.ModelPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jdesktop.swingx.JXTitledPanel;
import org.kermeta.art2.ui.framework.elements.Binding;
import org.kermeta.art2.ui.framework.elements.PortPanel;

/**
 *
 * @author ffouquet
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame jframe = new JFrame("Art2 UI Tester");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setPreferredSize(new Dimension(800,600));
        


        ModelPanel model = new ModelPanel();
        NodePanel node1 = new NodePanel();
        NodePanel node2 = new NodePanel();
        model.add(node2);
        model.add(node1);

        ThreePartRoundedTitledPanel c1 = new ThreePartRoundedTitledPanel();
        ThreePartRoundedTitledPanel c2 = new ThreePartRoundedTitledPanel();
        ThreePartRoundedTitledPanel c3 = new ThreePartRoundedTitledPanel();
        RoundedTitledPanel c4 = new RoundedTitledPanel();

        PortPanel p11 = new PortPanel();
        PortPanel p12 = new PortPanel();
        PortPanel p21 = new PortPanel();
        PortPanel p22 = new PortPanel();

        
        Binding b = new Binding();
        b.setFromPort(p11);
        b.setToPort(p22);
        model.add(b);

        c1.setTitle("c1");
        c1.addLeft(p11);
        c1.addRight(p12);
        c1.add(new JButton("HELLO"));
        c2.setTitle("c2");
        c2.add(p21);
        c2.add(p22);

        node1.setTitle("node1");


        node1.add(c1);
        node1.add(c2);
        node2.add(c3);
        node2.add(c4);


        jframe.add(model, BorderLayout.CENTER);

        jframe.pack();
        jframe.setVisible(true);




    }
}
