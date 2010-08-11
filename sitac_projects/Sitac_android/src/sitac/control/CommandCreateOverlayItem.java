package sitac.control;

import sitac.view.MapPoint;
import sitac.view.MyOverlayItem;

public class CommandCreateOverlayItem extends Command {

	private Adapter adapter;
	private MyOverlayItem item;
	private int type,group;
	private MapPoint point;
	
	public CommandCreateOverlayItem(Adapter adapter, int type, int group,MapPoint point)
	{
		this.adapter=adapter;
		this.type=type;
		this.group=group;
		this.point=point;
	}
	
	@Override
	public void execute() {
		item=adapter.createOverlayItem(type, group, point);

	}

	@Override
	public void redo() {
		adapter.placeOverlayItem(item);

	}

	@Override
	public void undo() {
		adapter.deleteOverlayItem(item);

	}
	
	public MyOverlayItem getCreatedItem()
	{
		return item;
	}

}
