/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.editor.component.creator.panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import org.kermeta.art2.editor.component.creator.Kernel;
import org.kermeta.art2.editor.component.creator.commands.NewModelCommand;
import org.kermeta.art2.editor.component.creator.commands.SaveModelCommand;

/**
 *
 * @author gnain
 */
public class BasicCommandsPanel extends JPanel {

    private Kernel kernel;

    public BasicCommandsPanel(Kernel k) {
        kernel = k;

        add(createNewModelElement());
        add(createSaveModelElement());
    }

    private JButton createNewModelElement() {
        JButton bt = new JButton(new ImageIcon(getClass().getResource("/icons/new_model.png")));
        bt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                NewModelCommand command = new NewModelCommand();
                command.setKernel(kernel);
                command.execute(null);
            }
        });
        return bt;
    }


    private JButton createSaveModelElement() {
        JButton bt = new JButton(new ImageIcon(getClass().getResource("/icons/save_model.png")));
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                SaveModelCommand command = new SaveModelCommand();
                command.setKernel(kernel);
                command.execute(null);
            }
        });
        return bt;
    }
}
