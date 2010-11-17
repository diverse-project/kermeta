/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.kermeta.art2.editor.component.creator.commands;

import java.awt.Point;
import org.kermeta.art2.editor.component.creator.model.ComponentModelElement;

/**
 *
 * @author gnain
 */
public class CreateComponentCommand extends Command {

    private Object parentModelElement;

    private Point p;

    public void setPoint(Point p) {
        this.p = p;
    }

    public void setParentModelElement(Object parentModelElement) {
        this.parentModelElement = parentModelElement;
    }


    public void execute(Object o) {
        ComponentModelElement modelElement = kernel.getModelHandler().addComponent(parentModelElement);
        modelElement.setLocation(p);
        kernel.getModelPanel().addComponent(
                kernel.getModelMapper().getGraphicalElement(parentModelElement).getGraphicalRepresentation(),
                modelElement.getGraphicalRepresentation());
        kernel.getModelPanel().revalidate();
        kernel.getModelPanel().repaint();
    }
}
