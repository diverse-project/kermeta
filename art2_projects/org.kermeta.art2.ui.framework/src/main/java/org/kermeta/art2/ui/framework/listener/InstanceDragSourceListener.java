/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.framework.listener;

import java.awt.Point;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceAdapter;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceMotionListener;
import java.awt.Component;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.kermeta.art2.ui.framework.elements.ModelPanel;

/**
 *
 * @author ffouquet
 */
public class InstanceDragSourceListener extends DragSourceAdapter implements DragSourceMotionListener, DragGestureListener {

    private JPanel flightComponent;
    private DragSource dragSource;
    private DragGestureEvent dragOriginEvent;
    private Transferable transferable;
    private Point origin2;

    public InstanceDragSourceListener(JPanel _panel) {
        flightComponent = _panel;
        this.dragSource = DragSource.getDefaultDragSource();
        this.dragSource.createDefaultDragGestureRecognizer((Component) this.flightComponent, DnDConstants.ACTION_MOVE, this);
        dragSource.addDragSourceMotionListener(this);
        transferable = new Transferable() {

            @Override
            public DataFlavor[] getTransferDataFlavors() {
                return new DataFlavor[0];
            }

            @Override
            public boolean isDataFlavorSupported(DataFlavor arg0) {
                return true;
            }

            @Override
            public Object getTransferData(DataFlavor arg0) {
                return flightComponent;
            }
        };

    }

    @Override
    public void dragGestureRecognized(DragGestureEvent dge) {
        dragOriginEvent = dge;
        Point origin = dragOriginEvent.getDragOrigin();
        origin2 = (Point) origin.clone();
        //SwingUtilities.convertPointToScreen(origin2, p);
        //SwingUtilities.convertPointFromScreen(origin2,(Component) p);
        dragSource.startDrag(dragOriginEvent, DragSource.DefaultLinkDrop, transferable, this);
    }

    @Override
    public void dragMouseMoved(DragSourceDragEvent dsde) {
        super.dragMouseMoved(dsde);
        if (dsde.getDragSourceContext().getComponent().equals(this.flightComponent)) {
            Point p = dsde.getLocation();
            Point p2 = (Point) p.clone();
            SwingUtilities.convertPointFromScreen(p2, flightComponent.getParent());

            //tempPanel.setLocation(new Point(p2.x - origin2.x, p2.y - origin2.y));
            // kernel.getModelPanel().setFlightObject(flightComponent, new Point(p2.x - origin2.x, p2.y - origin2.y));

            flightComponent.setBounds(p2.x - origin2.x, p2.y - origin2.y, flightComponent.getWidth(), flightComponent.getHeight());


            ((ModelPanel)this.flightComponent.getParent().getParent()).update();
        }

    }
}
