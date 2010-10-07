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
import org.kermeta.art2.ui.editor.command.AddComponentCommand;
import org.kermeta.art2.ui.editor.command.AddChannelCommand;
import org.kermeta.art2.ui.editor.command.MoveComponentCommand;
import org.kermeta.art2.ui.framework.elements.ChannelTypePanel;
import org.kermeta.art2.ui.framework.elements.ComponentPanel;
import org.kermeta.art2.ui.framework.elements.ComponentTypePanel;
import org.kermeta.art2.ui.framework.elements.ModelPanel;
import org.kermeta.art2.ui.framework.elements.NodePanel;

/**
 * implementation of the target listener
 * @author francoisfouquet
 */
public class ModelDragTargetListener extends DropTarget {

    Art2UIKernel kernel;
    ModelPanel target;

    /**
     * constructor
     * @param _p the table view panel
     * @param _target the view of the component
     */
    public ModelDragTargetListener(ModelPanel _target, Art2UIKernel _kernel) {
        kernel = _kernel;
        target = _target;
    }

    private Boolean isDropAccept(Object o) {
        if (o instanceof ChannelTypePanel) {
            return true;
        }
        return false;
    }

    /**
     * callback when DnD is finished
     * @param arg0
     */
    @Override
    public void drop(DropTargetDropEvent arg0) {
        try {
            Object o = arg0.getTransferable().getTransferData(new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType));
            if (isDropAccept(o)) {
                if (o instanceof ChannelTypePanel) {
                    AddChannelCommand command = new AddChannelCommand();
                    command.setPoint(arg0.getLocation());
                    command.setKernel(kernel);
                    command.execute(o);
                }
                kernel.getModelPanel().repaint();
                kernel.getModelPanel().revalidate();
                arg0.dropComplete(true);
            } else {
                arg0.rejectDrop();
            }
        } catch (Exception ex) {
            Logger.getLogger(ModelDragTargetListener.class.getName()).log(Level.SEVERE, null, ex);
            arg0.rejectDrop();
        }

    }

    /**
     * not implemented
     * @param dtde
     */
    @Override
    public void dragEnter(DropTargetDragEvent dtde) {
    }

    /**
     * not implemented
     * @param arg0
     */
    @Override
    public void dragExit(DropTargetEvent arg0) {
    }

    /**
     * not implemented
     * @param arg0
     */
    @Override
    public void dragOver(DropTargetDragEvent arg0) {
    }

    /**
     * not implemented
     * @param arg0
     */
    @Override
    public void dropActionChanged(DropTargetDragEvent arg0) {
    }
}
