/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.editor.component.creator.listeners;

import java.awt.Component;
import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceAdapter;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceMotionListener;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.kermeta.art2.editor.component.creator.palettes.Art2Element;

/**
 *
 * @author gnain
 */
public class Art2ElementDragSourceListener extends DragSourceAdapter implements DragSourceMotionListener, DragGestureListener {

    private JPanel flyingComponent;
    private DragSource dragSource;
    private DragGestureEvent dragOriginEvent;
    private Transferable transferable;
    private Point originPointClone;

    public Art2ElementDragSourceListener(Art2Element art2Element) {
        flyingComponent = art2Element.getGraphicalElement();
        this.dragSource = DragSource.getDefaultDragSource();
        this.dragSource.createDefaultDragGestureRecognizer((Component) this.flyingComponent, DnDConstants.ACTION_COPY, this);
        dragSource.addDragSourceMotionListener(this);
        transferable = new TransferableArt2Element(art2Element);

    }

    public void dragGestureRecognized(DragGestureEvent dge) {
        System.out.println("Art2ElementDragSourceListener");
        dragOriginEvent = dge;
        Point origin = dragOriginEvent.getDragOrigin();
        originPointClone = (Point) origin.clone();
        //SwingUtilities.convertPointToScreen(origin2, p);
        //SwingUtilities.convertPointFromScreen(origin2,(Component) p);
        dragSource.startDrag(dragOriginEvent, DragSource.DefaultLinkDrop, transferable, this);

    }

    /*
    public void dragMouseMoved(DragSourceDragEvent dsde) {
        super.dragMouseMoved(dsde);
        if (dsde.getDragSourceContext().getComponent().equals(this.flyingComponent)) {
            Point p = dsde.getLocation();
            Point p2 = (Point) p.clone();
            SwingUtilities.convertPointFromScreen(p2, flyingComponent.getParent());

            //tempPanel.setLocation(new Point(p2.x - origin2.x, p2.y - origin2.y));
            // kernel.getModelPanel().setFlightObject(flightComponent, new Point(p2.x - origin2.x, p2.y - origin2.y));

            flyingComponent.setBounds(
                    p2.x - originPointClone.x,
                    p2.y - originPointClone.y,
                    flyingComponent.getWidth(),
                    flyingComponent.getHeight());


           // ((ModelPanel)this.flyingComponent.getParent().getParent()).update();
        }

    }
     * 
     */
}
