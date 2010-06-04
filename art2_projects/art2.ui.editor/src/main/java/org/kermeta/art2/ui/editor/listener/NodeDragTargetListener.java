/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.listener;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.editor.command.AddComponentCommand;
import org.kermeta.art2.ui.framework.elements.NodePanel;

/**
 * implementation of the target listener
 * @author francoisfouquet
 */
public class NodeDragTargetListener extends DropTarget {

    Art2UIKernel kernel;
    NodePanel target;

    /**
     * constructor
     * @param _p the table view panel
     * @param _target the view of the component
     */
    public NodeDragTargetListener(NodePanel _target, Art2UIKernel _kernel) {
        kernel = _kernel;
        target = _target;
    }

    /**
     * callback when DnD is finished
     * @param arg0
     */
    @Override
    public void drop(DropTargetDropEvent arg0) {
        AddComponentCommand command = new AddComponentCommand();
        command.setKernel(kernel);
        command.setNodepanel(target);
        try {
            command.execute(arg0.getTransferable().getTransferData(new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType)));
        } catch (Exception ex) {
            Logger.getLogger(NodeDragTargetListener.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*
        IComponentControl newctrl = ((IComponentView) target).getControl();
        if (newctrl != null) {
        IComponentCable newcable = ConcreteFactory.getInstance().newCableMonoToMono();
        if (!newcable.plug(newctrl, panel.previousSelectedPort)) {
        ((IComponent) newcable).destroy();
        arg0.rejectDrop();
        ((IComponentTable)panel.tableview.getControl()).warningBadCable();
        } else {
        panel.tableview.getControl().addChild((IComponent) newcable);
        }
        }*/
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
