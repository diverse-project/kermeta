/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.editor.component.creator.listeners;

import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.kermeta.art2.editor.component.creator.Kernel;
import org.kermeta.art2.editor.component.creator.commands.CreateLibraryCommand;
import org.kermeta.art2.editor.component.creator.palettes.Library;
import org.kermeta.art2.editor.component.creator.panels.ModelPanel;

/**
 *
 * @author gnain
 */
public class ModelPanelDropTargetListener extends DropTargetAdapter {

    private DropTarget dropTarget;
    private JPanel panel;
    private JPanel flyingComponent;
    private Kernel kernel;

    public ModelPanelDropTargetListener(Kernel k, ModelPanel panel) {
        this.panel = panel;
        this.kernel = k;
        dropTarget = new DropTarget(panel, DnDConstants.ACTION_COPY, this, true, null);
    }

    @Override
    public void dragOver(DropTargetDragEvent dtde) {
        try {
            super.dragOver(dtde);
            // System.out.println("DragOver");
            Transferable trans = dtde.getTransferable();
            if (trans.isDataFlavorSupported(TransferableArt2Element.art2ElementFlavor)) {
                if (dtde.getTransferable().getTransferData(TransferableArt2Element.art2ElementFlavor) instanceof Library) {
                    dtde.acceptDrag(DnDConstants.ACTION_COPY);
                } else {
                    dtde.rejectDrag();
                }
            } else if (trans.isDataFlavorSupported(TransferableArt2ModelElement.graphicalElementFlavor)) {
                dtde.acceptDrag(DnDConstants.ACTION_MOVE);
            } else {
                System.out.println("TransferableObject unknown::" + trans.getClass());
                dtde.rejectDrag();
            }
        } catch (UnsupportedFlavorException ex) {
            Logger.getLogger(ModelPanelDropTargetListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ModelPanelDropTargetListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void drop(DropTargetDropEvent event) {
        try {
            System.out.println("Droped");
            if (event.isLocalTransfer()) {
                System.out.println("LocalTransfer");

                Transferable trans = event.getTransferable();
                if (trans.isDataFlavorSupported(TransferableArt2Element.art2ElementFlavor)) {
                    event.acceptDrop(DnDConstants.ACTION_COPY);
                    CreateLibraryCommand command = new CreateLibraryCommand();
                    command.setKernel(kernel);
                    command.setPoint(event.getLocation());
                    command.execute(null);

                    event.dropComplete(true);
                    return;

                } else if (trans.isDataFlavorSupported(TransferableArt2ModelElement.graphicalElementFlavor)) {
                    event.acceptDrop(DnDConstants.ACTION_MOVE);
                    event.dropComplete(true);
                    kernel.getModelPanel().repaint();
                    return;
                } else {
                    System.out.println("TransferableObject unknown::" + trans.getClass());
                    event.rejectDrop();
                }
            }
            event.rejectDrop();
        } catch (Exception e) {
            e.printStackTrace();
            event.rejectDrop();
        }
    }
}
