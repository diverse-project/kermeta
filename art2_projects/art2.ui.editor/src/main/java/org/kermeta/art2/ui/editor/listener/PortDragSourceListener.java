/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.art2.ui.editor.listener;

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
import javax.swing.SwingUtilities;
import org.kermeta.art2.ui.editor.Art2UIKernel;
import org.kermeta.art2.ui.editor.command.CleanRequirePortBinding;
import org.kermeta.art2.ui.editor.widget.FlightPortPanel;
import org.kermeta.art2.ui.framework.elements.Binding;
import org.kermeta.art2.ui.framework.elements.PortPanel;

/**
 * implementation of the drag source listener for the Dnd of a component
 * @author francoisfouquet
 */
public class PortDragSourceListener extends DragSourceAdapter implements DragSourceMotionListener, DragGestureListener {

    private Art2UIKernel kernel;
    private PortPanel eventSourcePanel;
    private DragSource dragSource;
    private DragGestureEvent dragOriginEvent;
    private Transferable transferable;
    private Point origin2;
    private FlightPortPanel tempPanel= new FlightPortPanel();

    private Binding tempBinding = new Binding();

    /**
     * constructor
     * @param _p
     * @param _panel
     */
    public PortDragSourceListener(PortPanel _ct, Art2UIKernel _kernel) {
        //this.panel = _panel;
        this.eventSourcePanel = _ct;

        this.kernel = _kernel;
        this.dragSource = DragSource.getDefaultDragSource();
        this.dragSource.createDefaultDragGestureRecognizer((Component) this.eventSourcePanel, DnDConstants.ACTION_MOVE, this);
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
                return eventSourcePanel;
            }
        };

    }

    /**
     * callback when the mouse is moved
     * @param dsde
     */
    @Override
    public void dragMouseMoved(DragSourceDragEvent dsde) {
        if (dsde.getDragSourceContext().getComponent().equals(this.eventSourcePanel)) {

            Point p = dsde.getLocation();
            Point p2 = (Point) p.clone();
            SwingUtilities.convertPointFromScreen(p2, kernel.getModelPanel());

            //tempPanel.setLocation(new Point(p2.x - origin2.x, p2.y - origin2.y));
            // kernel.getModelPanel().setFlightObject(flightComponent, new Point(p2.x - origin2.x, p2.y - origin2.y));

            tempPanel.setBounds(p2.x - origin2.x, p2.y - origin2.y, eventSourcePanel.getWidth(), eventSourcePanel.getHeight());

            kernel.getModelPanel().repaint();
           // kernel.getModelPanel().revalidate();
        }
    }

    /**
     * callback when the DnD is finished
     * @param dsde
     */
    @Override
    public void dragDropEnd(DragSourceDropEvent dsde) {
        //tv.showTrashZone(false);

        //App.view.desktop.remove(flightComponent);
        //tv.add(flightComponent);

        //flightComponent.setActive(false);
        kernel.getModelPanel().unsetFlightObject(tempPanel);
        kernel.getModelPanel().removeBinding(tempBinding);

        kernel.getModelPanel().repaint();
        kernel.getModelPanel().revalidate();
    }

    /**
     * callback when a DnD begining is detected
     * @param dge
     */
    @Override
    public void dragGestureRecognized(DragGestureEvent dge) {
        CleanRequirePortBinding commandclean = new CleanRequirePortBinding();
        commandclean.setKernel(kernel);
        commandclean.setPortpanel(eventSourcePanel);
        commandclean.execute(null);

        //tempPanel = new ComponentPanel();
        //tempPanel.setPreferredSize(new Dimension(200,200));

        dragOriginEvent = dge;
        Point origin = dragOriginEvent.getDragOrigin();
        origin2 = (Point) origin.clone();
        //SwingUtilities.convertPointToScreen(origin2, p);
        //SwingUtilities.convertPointFromScreen(origin2,(Component) p);
        dragSource.startDrag(dragOriginEvent, DragSource.DefaultLinkDrop, transferable, this);

        //tv.showTrashZone(true);

        // flightComponent.setActive(true);

        tempBinding.setFromPort(eventSourcePanel);

        

        tempBinding.setToPort(tempPanel);
        kernel.getModelPanel().addBinding(tempBinding);
        kernel.getModelPanel().setFlightObject(tempPanel);

        // tv.remove(flightComponent);
        // App.view.desktop.add(flightComponent);

    }
}
