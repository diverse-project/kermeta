/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework;

import org.kermeta.art2.ui.framework.elements.NodePanel;
import org.kermeta.art2.ui.framework.elements.ModelPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import org.kermeta.art2.ui.framework.elements.Binding;
import org.kermeta.art2.ui.framework.elements.ComponentPanel;
import org.kermeta.art2.ui.framework.elements.ChannelPanel;
import org.kermeta.art2.ui.framework.elements.PortPanel;
import org.kermeta.art2.ui.framework.elements.PortPanel.PortType;

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
        jframe.setPreferredSize(new Dimension(800, 600));



        ModelPanel model = new ModelPanel();
        NodePanel node1 = new NodePanel();
        NodePanel node2 = new NodePanel();
        model.addNode(node2);
        model.addNode(node1);


        ChannelPanel hub1 = new ChannelPanel();
        hub1.setTitle("topic1");
        model.addHub(hub1);


        ComponentPanel c1 = new ComponentPanel();
        ComponentPanel c2 = new ComponentPanel();
        ComponentPanel c3 = new ComponentPanel();
        ComponentPanel c4 = new ComponentPanel();

        PortPanel p11 = new PortPanel();
        p11.setType(PortType.PROVIDED);
        p11.setNature(PortPanel.PortNature.SERVICE);


        PortPanel p12 = new PortPanel();
        p12.setType(PortType.REQUIRED);
        p12.setNature(PortPanel.PortNature.SERVICE);
        PortPanel p21 = new PortPanel();
        p21.setType(PortType.PROVIDED);
        p21.setNature(PortPanel.PortNature.SERVICE);
        PortPanel p22 = new PortPanel();
        p22.setType(PortType.REQUIRED);
        p22.setNature(PortPanel.PortNature.SERVICE);
        PortPanel p23 = new PortPanel();
        p23.setType(PortType.REQUIRED);
        p23.setNature(PortPanel.PortNature.SERVICE);
        PortPanel p24 = new PortPanel();
        p24.setType(PortType.REQUIRED);
        p24.setNature(PortPanel.PortNature.MESSAGE);



        p11.setTitle("P11");
        p12.setTitle("P12");
        p21.setTitle("P21");
        p22.setTitle("P22");
        p23.setTitle("P23");
        p24.setTitle("P24");


        Binding b = new Binding(Binding.Type.input);
        b.setSelected(false);
        b.setFrom(p11);
        b.setTo(p22);
        model.addBinding(b);

        Binding sb = new Binding(Binding.Type.input);
        sb.setSelected(true);
        sb.setFrom(p12);
        sb.setTo(p23);
        model.addBinding(sb);

        Binding mb = new Binding(Binding.Type.ouput);
        mb.setSelected(true);
        mb.setFrom(p24);
        mb.setTo(hub1);
        model.addBinding(mb);

        c1.setTitle("c1");
        c1.addLeft(p11);
        c1.addRight(p12);
        c2.setTitle("c2");
        c2.addLeft(p21);
        c2.addRight(p22);
        c2.addRight(p23);
        c2.addRight(p24);

        node1.setTitle("node1");


        node1.add(c1);
        node1.add(c2);
        node2.add(c3);
        node2.add(c4);


        JScrollPane scrollPane = new JScrollPane(model, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        jframe.add(scrollPane, BorderLayout.CENTER);

        jframe.pack();
        jframe.setVisible(true);




    }
}
