/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.panel;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.editor.command.AddNodeCommand;
import org.kermeta.art2.ui.editor.command.ClearModelCommand;
import org.kermeta.art2.ui.editor.command.LoadModelCommand;
import org.kermeta.art2.ui.editor.command.LoadModelCommandUI;
import org.kermeta.art2.ui.editor.command.LoadNewLibCommand;
import org.kermeta.art2.ui.editor.command.RefreshModelCommand;
import org.kermeta.art2.ui.editor.command.SaveActuelModelCommand;
import org.kermeta.art2.ui.editor.widget.JCommandButton;

/**
 *
 * @author ffouquet
 */
public class CommandPanel extends JPanel {

    public CommandPanel(Art2UIKernel kernel) {
        this.setOpaque(false);
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        /*
        JCommandButton btAddHub = new JCommandButton("Add hub");
        AddHubCommand btAddHubCommand = new AddHubCommand();
        btAddHubCommand.setKernel(kernel);
        btAddHub.setCommand(btAddHubCommand);
         */
        JCommandButton btAddNode = new JCommandButton("Add node");
        AddNodeCommand btAddNodeCommand = new AddNodeCommand();
        btAddNodeCommand.setKernel(kernel);
        btAddNode.setCommand(btAddNodeCommand);

        JCommandButton btSave = new JCommandButton("Save");
        SaveActuelModelCommand btSaveCommand = new SaveActuelModelCommand();
        btSaveCommand.setKernel(kernel);
        btSave.setCommand(btSaveCommand);

        JCommandButton btLoadModel = new JCommandButton("LoadModel");
        LoadModelCommandUI btLoadLibCommandUI = new LoadModelCommandUI();
        btLoadLibCommandUI.setKernel(kernel);
        btLoadModel.setCommand(btLoadLibCommandUI);

        
        JCommandButton btClearModel = new JCommandButton("ClearModel");
        ClearModelCommand btClearModelCommand = new ClearModelCommand();
        btClearModelCommand.setKernel(kernel);
        btClearModel.setCommand(btClearModelCommand);
         
        
        JCommandButton btLoadLib = new JCommandButton("LoadLib");
        LoadNewLibCommand btLoadLibCommand = new LoadNewLibCommand();
        btLoadLibCommand.setKernel(kernel);
        btLoadLib.setCommand(btLoadLibCommand);
        
        
        JCommandButton btRefresh = new JCommandButton("Refresh Model");
        RefreshModelCommand loadModel = new RefreshModelCommand();
        loadModel.setKernel(kernel);
        btRefresh.setCommand(loadModel);


        // add(btAddHub);
        add(btAddNode);
        add(btSave);
        add(btLoadModel);
        add(btLoadLib);
        add(btClearModel);
        add(btRefresh);


    }
}
