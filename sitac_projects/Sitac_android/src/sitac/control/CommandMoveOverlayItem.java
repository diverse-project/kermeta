package sitac.control;

import sitac.view.MapPoint;
import sitac.view.MyOverlayItem;

public class CommandMoveOverlayItem extends Command {
	
	private Adapter adapter;
	private MyOverlayItem item;
	private MapPoint point;

	public CommandMoveOverlayItem(Adapter adapter,MyOverlayItem item,MapPoint mp)
	{
		this.adapter=adapter;
		this.item=item;
		point=mp;
	}
	
	@Override
	public void execute() {
		//point=adapter.moveOverlayItem(item, point);

	}

	@Override
	public void redo() {
		point=adapter.moveOverlayItem(item, point);

	}

	@Override
	public void undo() {
		point=adapter.moveOverlayItem(item, point);

	}

}
