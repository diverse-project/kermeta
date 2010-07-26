package org.kermeta.art2.ui.editor;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import org.kermeta.art2.ui.editor.panel.Art2EditorPanel;

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

        Art2EditorPanel artpanel = new Art2EditorPanel();
        jframe.add(artpanel,BorderLayout.CENTER);

        jframe.pack();
        jframe.setVisible(true);
    }
}
