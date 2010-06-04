/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.listener;

import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.editor.command.AddBindingCommand;
import org.kermeta.art2.ui.framework.elements.PortPanel;

/**
 * implementation of the target listener
 * @author francoisfouquet
 */
public class PortDragTargetListener extends DropTarget {

    Art2UIKernel kernel;
    PortPanel target;

    /**
     * constructor
     * @param _p the table view panel
     * @param _target the view of the component
     */
    public PortDragTargetListener(PortPanel _target, Art2UIKernel _kernel) {
        kernel = _kernel;
        target = _target;
    }

    /**
     * callback when DnD is finished
     * @param arg0
     */
    @Override
    public void drop(DropTargetDropEvent arg0) {
        AddBindingCommand command = new AddBindingCommand();
        command.setKernel(kernel);
        command.setTarget(target);
        try {
            command.execute(arg0.getTransferable().getTransferData(new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType)));
        } catch (Exception ex) {
            Logger.getLogger(PortDragTargetListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        kernel.getModelPanel().repaint();
        kernel.getModelPanel().revalidate();
        arg0.dropComplete(true);
    }

    /**
     * not implemented
     * @param dtde
     */
    //@Override
    public void dragEnter(DropTargetDragEvent dtde) {
    }

    /**
     * not implemented
     * @param arg0
     */
    //@Override
    public void dragExit(DropTargetEvent arg0) {
    }

    /**
     * not implemented
     * @param arg0
     */
    //@Override
    public void dragOver(DropTargetDragEvent arg0) {
        
    }

    /**
     * not implemented
     * @param arg0
     */
    //@Override
    public void dropActionChanged(DropTargetDragEvent arg0) {
    }
}
