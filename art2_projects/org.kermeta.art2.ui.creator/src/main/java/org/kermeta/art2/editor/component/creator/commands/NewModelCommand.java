/* $Id: SaveActuelModelCommand.java 13086 2010-10-21 11:40:48Z francoisfouquet $ 
 * License    : EPL 								
 * Copyright  : IRISA / INRIA / Universite de Rennes 1 */
package org.kermeta.art2.editor.component.creator.commands;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


/**
 *
 * @author ffouquet
 */
public class NewModelCommand extends Command {

    private JFileChooser filechooser = new JFileChooser();
    private static String defaultLocation = null;

    public static void setDefaultLocation(String uri) {
        defaultLocation = uri;
    }

    @Override
    public void execute(Object p) {
        boolean resume = true;
        if (kernel.getModelHandler().containsUnsavedChanges()) {
            int answer = JOptionPane.showConfirmDialog(null, "Il existe des modifications non enregistrées. Poursuivre ?", "Attention", JOptionPane.YES_NO_OPTION);
            resume = (answer == JOptionPane.YES_OPTION);
        }
        if (resume) {
            kernel.getModelHandler().newModel();
            kernel.getModelPanel().clearAll();
        }
    }
}
