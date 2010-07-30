package view;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Draggable implements Transferable{
	private ItemType item;
	private DataFlavor rectangleFlavor;
	
	public Draggable(ItemType it)
	{
		try {
			rectangleFlavor=new DataFlavor(DataFlavor.javaJVMLocalObjectMimeType+";class=view.ItemType");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		item=it;
	}
	
	@Override
	public Object getTransferData(DataFlavor flavor)
			throws UnsupportedFlavorException, IOException {
		return item;
	}

	@Override
	public DataFlavor[] getTransferDataFlavors() {
		DataFlavor[] df=new DataFlavor[]{rectangleFlavor};
		return df;
	}

	@Override
	public boolean isDataFlavorSupported(DataFlavor flavor) {
		if (flavor.equals(rectangleFlavor))
			return true;
		else
			return false;
	}

}
