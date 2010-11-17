/* $Id: SaveActuelModelCommand.java 13086 2010-10-21 11:40:48Z francoisfouquet $ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.editor.component.creator.commands;

import javax.swing.JFileChooser;

import org.eclipse.emf.common.util.URI;
import org.kermeta.art2.framework.Art2XmiHelper;

/**
 *
 * @author ffouquet
 */
public class LoadModelCommand extends Command {
    
    private JFileChooser filechooser = new JFileChooser();
    private static String defaultLocation = null;

    public static void setDefaultLocation(String uri) {
        defaultLocation = uri;
    }

    @Override
    public void execute(Object p) {
        String location = "";
        if (defaultLocation == null) {
            filechooser.showSaveDialog(kernel.getModelPanel());
            location = filechooser.getSelectedFile().getPath();
        } else {
            location = defaultLocation;
        }

        kernel.getModelHandler().saveActualModel(location);
    }
}
