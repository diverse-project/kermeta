package sitac.control;

import sitac.view.ItemType;
import sitac.view.MapPoint;

public class CommandCreateOverlayItemFactory extends AbstractCommandFactory {

	private Adapter adapter;
	private MapPoint point;
	private ItemType itemtype;
	
	public CommandCreateOverlayItemFactory(Adapter adapter,MapPoint point,ItemType itemtype)
	{
		this.adapter=adapter;
		this.point=point;
		this.itemtype=itemtype;
	}
	
	@Override
	public Command create() {
		return new CommandCreateOverlayItem(adapter,itemtype,point);
	}

}
