/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.panel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.editor.command.AddNodeCommand;
import org.kermeta.art2.ui.editor.command.SaveActuelModelCommand;
import org.kermeta.art2.ui.editor.widget.JCommandButton;

/**
 *
 * @author ffouquet
 */
public class CommandPanel extends JPanel {

    public CommandPanel(Art2UIKernel kernel){
        this.setOpaque(false);
        this.setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));

        JCommandButton btAddNode = new JCommandButton("Add node");
        AddNodeCommand btAddNodeCommand = new AddNodeCommand();
        btAddNodeCommand.setKernel(kernel);
        btAddNode.setCommand(btAddNodeCommand);

        JCommandButton btSave = new JCommandButton("Save");
        SaveActuelModelCommand btSaveCommand = new SaveActuelModelCommand();
        btSaveCommand.setKernel(kernel);
        btSave.setCommand(btSaveCommand);

        add(btAddNode);
        add(btSave);

        

    }

}
