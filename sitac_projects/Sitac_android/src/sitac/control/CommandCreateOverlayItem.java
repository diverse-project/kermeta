package sitac.control;

import sitac.view.ItemType;
import sitac.view.MapPoint;
import sitac.view.MyOverlayItem;

public class CommandCreateOverlayItem extends Command {

	private Adapter adapter;
	private MyOverlayItem item;
	private ItemType itemtype;
	private MapPoint point;
	
	public CommandCreateOverlayItem(Adapter adapter, ItemType itemtype, MapPoint point)
	{
		this.adapter=adapter;
		this.itemtype=itemtype;
		this.point=point;
	}
	
	@Override
	public void execute() {
		item=adapter.createOverlayItem(itemtype, point);

	}

	@Override
	public void redo() {
		adapter.placeOverlayItem(item,itemtype);

	}

	@Override
	public void undo() {
		adapter.deleteOverlayItem(item, itemtype);

	}
	
	public MyOverlayItem getCreatedItem()
	{
		return item;
	}

}
