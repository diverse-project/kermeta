/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.editor.component.creator;

import javax.swing.JFrame;
import org.kermeta.art2.editor.component.creator.handlers.ModelHandler;
import org.kermeta.art2.editor.component.creator.handlers.ModelMapper;
import org.kermeta.art2.editor.component.creator.panels.BasicCommandsPanel;
import org.kermeta.art2.editor.component.creator.panels.ModelPanel;
import org.kermeta.art2.editor.component.creator.panels.PalettePanel;
import org.kermeta.art2.editor.component.creator.panels.RootPanel;

/**
 *
 * @author gnain
 */
public class StandaloneLauncher {

    public static void main(String[] args) {

        Kernel k = new Kernel();
        k.setModelHandler(new ModelHandler(k));
        k.setModelMapper(new ModelMapper());
        k.setModelPanel(new ModelPanel(k));
        k.setPalette(new PalettePanel());
        k.setBasicCommandsPanel(new BasicCommandsPanel(k));

        JFrame frame = new JFrame("Component Creator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new RootPanel(k));

        frame.pack();
        frame.setVisible(true);
    }

}
