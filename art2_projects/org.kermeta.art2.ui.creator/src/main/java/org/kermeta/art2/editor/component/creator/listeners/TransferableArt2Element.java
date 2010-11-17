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
import org.eclipse.emf.common.command.Command;
import org.kermeta.art2.editor.component.creator.palettes.Art2Element;

/**
 *
 * @author gnain
 */
public class TransferableArt2Element implements Transferable {

    public static DataFlavor graphicalElementFlavor = new DataFlavor(JPanel.class, "Art2GraphicalElement");
    public static DataFlavor art2ElementFlavor = new DataFlavor(Art2Element.class, "Art2Element");

    protected DataFlavor[] acceptedFlavours = new DataFlavor[]{
        graphicalElementFlavor,
        art2ElementFlavor,
        DataFlavor.stringFlavor
    };

    private Art2Element element;

    public TransferableArt2Element(Art2Element e) {
        element = e;
    }

    @Override
    public DataFlavor[] getTransferDataFlavors() {
        return acceptedFlavours;
    }

    @Override
    public boolean isDataFlavorSupported(DataFlavor df) {
        return (df==graphicalElementFlavor||df==art2ElementFlavor||df==DataFlavor.stringFlavor);
    }

    @Override
    public Object getTransferData(DataFlavor df) throws UnsupportedFlavorException, IOException {
        if(df==graphicalElementFlavor){
            return element.getGraphicalElement();
        } else if(df==art2ElementFlavor) {
            return element;
        } else if(df==DataFlavor.stringFlavor) {
            return element.getElementName();
        } else {
            throw new UnsupportedFlavorException(df);
        }
    }

}
