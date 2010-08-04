/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor;

import javax.swing.JPanel;
import org.kermeta.art2.ui.editor.command.LoadModelCommand;
import org.kermeta.art2.ui.editor.panel.Art2EditorPanel;

/**
 *
 * @author ffouquet
 */
public class Art2Editor {

    private Art2EditorPanel panel = new Art2EditorPanel();

    public JPanel getPanel(){
        return panel;
    }

    public void loadModel(String uri){
        LoadModelCommand command = new LoadModelCommand();
        command.setKernel(panel.getKernel());
        command.execute(uri);
    }

    public void loadLib(){
        //TODO
    }


}
