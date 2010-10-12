/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.ui.editor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        JFrame jframe = new JFrame("Art2 UI Tester");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setPreferredSize(new Dimension(800, 600));

        Art2Editor artpanel = new Art2Editor();
        jframe.add(artpanel.getPanel(),BorderLayout.CENTER);


        //artpanel.loadModel("/Users/ffouquet/Desktop/AS.art2");

        jframe.pack();
        jframe.setVisible(true);
    }
}
