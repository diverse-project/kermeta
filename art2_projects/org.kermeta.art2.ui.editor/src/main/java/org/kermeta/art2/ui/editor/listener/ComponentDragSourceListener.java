/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.listener;

import java.awt.Component;
import java.awt.Container;
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
import javax.swing.SwingUtilities;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.framework.elements.ComponentPanel;

/**
 * implementation of the drag source listener for the Dnd of a component
 * @author francoisfouquet
 */
public class ComponentDragSourceListener extends DragSourceAdapter implements DragSourceMotionListener, DragGestureListener {

    private Container sourceNode = null;
    private Art2UIKernel kernel;
    private ComponentPanel flightComponent;
    private DragSource dragSource;
    private DragGestureEvent dragOriginEvent;
    private Transferable transferable;
    private Point origin2;

    /**
     * constructor
     * @param _p
     * @param _panel
     */
    public ComponentDragSourceListener(ComponentPanel _ct, Art2UIKernel _kernel) {
        //this.panel = _panel;
        this.flightComponent = _ct;
        this.kernel = _kernel;
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

    /**
     * callback when the mouse is moved
     * @param dsde
     */
    @Override
    public void dragMouseMoved(DragSourceDragEvent dsde) {
        if (dsde.getDragSourceContext().getComponent().equals(this.flightComponent)) {

            Point p = dsde.getLocation();
            Point p2 = (Point) p.clone();
            SwingUtilities.convertPointFromScreen(p2, kernel.getModelPanel());

            //tempPanel.setLocation(new Point(p2.x - origin2.x, p2.y - origin2.y));
            // kernel.getModelPanel().setFlightObject(flightComponent, new Point(p2.x - origin2.x, p2.y - origin2.y));

            flightComponent.setBounds(p2.x - origin2.x, p2.y - origin2.y, flightComponent.getWidth(), flightComponent.getHeight());
            kernel.getModelPanel().repaint();
        }
    }

    /**
     * callback when the DnD is finished
     * @param dsde
     */
    @Override
    public void dragDropEnd(DragSourceDropEvent dsde) {
        if (!dsde.getDropSuccess()) {
            sourceNode.add(this.flightComponent);
        }

        //tv.showTrashZone(false);

        //App.view.desktop.remove(flightComponent);
        //tv.add(flightComponent);

        //flightComponent.setActive(false);
        kernel.getModelPanel().unsetFlightObject(flightComponent);
        kernel.getModelPanel().repaint();
        kernel.getModelPanel().revalidate();
    }

    /**
     * callback when a DnD begining is detected
     * @param dge
     */
    @Override
    public void dragGestureRecognized(DragGestureEvent dge) {
        //tempPanel = new ComponentPanel();
        //tempPanel.setPreferredSize(new Dimension(200,200));
        sourceNode = this.flightComponent.getParent();


        dragOriginEvent = dge;
        Point origin = dragOriginEvent.getDragOrigin();
        origin2 = (Point) origin.clone();
        //SwingUtilities.convertPointToScreen(origin2, p);
        //SwingUtilities.convertPointFromScreen(origin2,(Component) p);
        dragSource.startDrag(dragOriginEvent, DragSource.DefaultLinkDrop, transferable, this);

        //tv.showTrashZone(true);

        // flightComponent.setActive(true);

        sourceNode.remove(this.flightComponent);
        kernel.getModelPanel().setFlightObject(this.flightComponent);

        // tv.remove(flightComponent);
        // App.view.desktop.add(flightComponent);

        kernel.getModelPanel().repaint();
        kernel.getModelPanel().revalidate();

    }
}
