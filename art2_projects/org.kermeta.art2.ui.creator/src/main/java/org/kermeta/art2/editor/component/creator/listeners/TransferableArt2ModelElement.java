/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.editor.component.creator.listeners;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import javax.swing.JPanel;
import org.kermeta.art2.editor.component.creator.model.Art2ModelElement;

/**
 *
 * @author gnain
 */
public class TransferableArt2ModelElement implements Transferable {

    public static DataFlavor graphicalElementFlavor = new DataFlavor(JPanel.class, "Art2GraphicalElement");

    protected DataFlavor[] acceptedFlavours = new DataFlavor[]{
        graphicalElementFlavor,
        DataFlavor.stringFlavor
    };

    private Art2ModelElement element;

    public TransferableArt2ModelElement(Art2ModelElement e) {
        element = e;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return acceptedFlavours;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor df) {
        return (df==graphicalElementFlavor||df==DataFlavor.stringFlavor);
    }

    @Override
    public Object getTransferData(DataFlavor df) throws UnsupportedFlavorException, IOException {
        if(df==graphicalElementFlavor){
            return element.getGraphicalRepresentation();
        } else if(df==DataFlavor.stringFlavor) {
            return element.getClass().getName();
        } else {
            throw new UnsupportedFlavorException(df);
        }
    }

}
