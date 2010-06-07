/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.ui.editor.command;

import javax.swing.JFileChooser;
import org.kermeta.art2.framework.Art2XmiHelper;
import org.kermeta.art2.ui.editor.Art2UIKernel;

/**
 *
 * @author ffouquet
 */
public class SaveActuelModelCommand implements Command {

    public void setKernel(Art2UIKernel kernel) {
        this.kernel = kernel;
    }

    private Art2UIKernel kernel ;
    private JFileChooser filechooser = new JFileChooser();

    @Override
    public void execute(Object p) {
        filechooser.showSaveDialog(kernel.getModelPanel());
        Art2XmiHelper.save(filechooser.getSelectedFile().getPath(), kernel.getModelHandler().getActualModel());
    }

}
