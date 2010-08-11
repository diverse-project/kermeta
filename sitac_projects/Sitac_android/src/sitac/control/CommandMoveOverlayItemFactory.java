package sitac.control;

import sitac.view.MapPoint;
import sitac.view.MyOverlayItem;

public class CommandMoveOverlayItemFactory extends AbstractCommandFactory {
	
	private Adapter adapter;
	private MyOverlayItem item;
	private MapPoint point;
	
	public CommandMoveOverlayItemFactory(Adapter adapter,MyOverlayItem item,MapPoint point)
	{
		this.adapter=adapter;
		this.item=item;
		this.point=point;
	}

	@Override
	public Command create() {
		return new CommandMoveOverlayItem(adapter,item,point);
	}

}
