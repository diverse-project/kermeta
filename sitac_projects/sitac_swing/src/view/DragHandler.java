package view;

import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

public class DragHandler extends TransferHandler{
	private DataFlavor rectangleFlavor;
	private MapWidget map;
	
	public DragHandler()
	{
		super();
		try {
			rectangleFlavor = new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType+";class=view.ItemType");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void setMap(MapWidget map)
	{
		this.map=map;
	}
	
	public boolean canImport(TransferHandler.TransferSupport support)
	{
		if (!support.isDataFlavorSupported(rectangleFlavor))
			return false;
		return true;
	}
	
	public boolean importData(TransferHandler.TransferSupport support)
	{
		if (!canImport(support)) 
            return false;
        Transferable t = support.getTransferable();
        try {
        	ItemType item=(ItemType)t.getTransferData(rectangleFlavor);
        	Point p=support.getDropLocation().getDropPoint();
        	if (item.contains(p))
        		return false;
        	else
        	{
	        	JPanel panel = (JPanel)item.getParent();
	    		panel.remove(item);
	    		panel.repaint();
	    		panel.revalidate();
				map.addItem(p, item.getRectangle(), item.getColor(), item.getLines(), item.getName());
        	}
		} catch (UnsupportedFlavorException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public Transferable createTransferable(JComponent c)
	{
		
		if (c instanceof ItemType)
		{
			ItemType item = (ItemType)c;
			Transferable t = new Draggable(item);
			return t;
		}
		else
			return null;
	}
	
	public int getSourceActions(JComponent c)
	{
		return COPY;
	}
}
