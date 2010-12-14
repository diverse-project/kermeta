/* $Id$ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
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
    private Art2UIKernel kernel;
    private JFileChooser filechooser = new JFileChooser();
    private static String defaultLocation = null;

    public static String getDefaultLocation() {
        return defaultLocation;
    }

    public static void setDefaultLocation(String uri) {
        defaultLocation = uri;
    }

    @Override
    public void execute(Object p) {
        String location = "";
        if (defaultLocation == null) {
            filechooser.showSaveDialog(kernel.getModelPanel());
            if (filechooser.getSelectedFile() != null) {
                location = "file://" + filechooser.getSelectedFile().getPath();
            }
        } else {
            location = defaultLocation;
        }

        Art2XmiHelper.save(location.toString(), kernel.getModelHandler().getActualModel());
    }
}
