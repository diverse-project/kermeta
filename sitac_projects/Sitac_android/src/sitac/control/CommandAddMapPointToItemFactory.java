package sitac.control;

import sitac.view.MapItem;
import sitac.view.MapPoint;

public class CommandAddMapPointToItemFactory extends AbstractCommandFactory {
	
	private Adapter adapter;
	private MapItem item;
	private MapPoint point;

	public CommandAddMapPointToItemFactory(Adapter adapter,MapItem item,MapPoint point)
	{
		this.adapter=adapter;
		this.item=item;
		this.point=point;
	}
	
	@Override
	public Command create() {
		return new CommandAddMapPointToItem(adapter,item,point);
	}

}
