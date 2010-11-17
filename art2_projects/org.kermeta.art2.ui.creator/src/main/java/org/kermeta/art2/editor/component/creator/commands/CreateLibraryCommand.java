/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.editor.component.creator.commands;

import java.awt.Point;
import org.kermeta.art2.editor.component.creator.Kernel;
import org.kermeta.art2.editor.component.creator.model.LibraryModelElement;

/**
 *
 * @author gnain
 */
public class CreateLibraryCommand extends Command {
    
    private Point p;

    public void setPoint(Point p) {
        this.p = p;
    }

    public void execute(Object o) {
       LibraryModelElement modelElement = kernel.getModelHandler().addLibrary();
       modelElement.setLocation(p);
        kernel.getModelPanel().addLibrary(modelElement.getGraphicalRepresentation());
        kernel.getModelPanel().revalidate();
        kernel.getModelPanel().repaint();
    }
}
