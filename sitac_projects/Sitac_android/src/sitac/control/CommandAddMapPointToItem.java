package sitac.control;

import sitac.view.MapItem;
import sitac.view.MapPoint;

public class CommandAddMapPointToItem extends Command {
	
	private Adapter adapter;
	private MapItem item;
	private MapPoint point;

	public CommandAddMapPointToItem(Adapter adapter,MapItem item,MapPoint point)
	{
		this.adapter=adapter;
		this.item=item;
		this.point=point;
	}
	
	@Override
	public void execute() {
		adapter.addPointToItem(item, point);

	}

	@Override
	public void redo() {
		adapter.addPointToItem(item, point);

	}

	@Override
	public void undo() {
		adapter.removePointFromItem(item, point);

	}

}
