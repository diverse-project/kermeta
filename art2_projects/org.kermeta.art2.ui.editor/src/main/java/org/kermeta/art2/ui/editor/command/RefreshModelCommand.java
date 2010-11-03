/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.command;

import org.kermeta.art2.ui.editor.Art2UIKernel;

/**
 *
 * @author ffouquet
 */
public class RefreshModelCommand implements Command {

    public void setKernel(Art2UIKernel kernel) {
        load.setKernel(kernel);
    }
    LoadModelCommand load = new LoadModelCommand();

    @Override
    public void execute(Object p) {
        if (LoadModelCommandUI.getLastLoadedModel() != null) {
            load.execute(LoadModelCommandUI.getLastLoadedModel());
        } else {
            if(SaveActuelModelCommand.getDefaultLocation() != null){
                load.execute(SaveActuelModelCommand.getDefaultLocation());
            }
        }

    }
}
