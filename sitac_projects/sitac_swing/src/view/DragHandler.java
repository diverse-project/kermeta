package view;

import java.awt.Color;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.InputEvent;
import java.io.IOException;

import javax.swing.JComponent;
import javax.swing.TransferHandler;

public class DragHandler extends TransferHandler{
	private DataFlavor rectangleFlavor;
	private MapWidget map;
	
	public DragHandler()
	{
		super();
		try {
			rectangleFlavor=new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType+";class=view.ItemType");
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
		System.out.println("can import");
		return true;
	}
	
	public boolean importData(TransferHandler.TransferSupport support)
	{
		System.out.println("import data");
		if (!canImport(support)) 
            return false;
        Transferable t = support.getTransferable();
        try {
        	ItemType item=(ItemType)t.getTransferData(rectangleFlavor);
			Point p=support.getDropLocation().getDropPoint();
			map.addItem(p, item.getRectangle(), item.getColor(), item.getLines());
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
			System.out.println("create transferable");
			ItemType item=(ItemType)c;
			//Rectangle r=item.getRectangle();
			Transferable t=new Draggable(item);
			return t;
		}
		else
			return null;
	}
	
	public void exportDone(JComponent source, InputEvent e, int action)
	{
		System.out.println("export done");
	}
	
	public int getSourceActions(JComponent c)
	{
		System.out.println("get actions");
		return COPY;
	}
}
