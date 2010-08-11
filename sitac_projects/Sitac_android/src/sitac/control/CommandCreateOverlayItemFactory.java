package sitac.control;

import sitac.view.MapPoint;

public class CommandCreateOverlayItemFactory extends AbstractCommandFactory {

	private Adapter adapter;
	private MapPoint point;
	private int type,group;
	
	public CommandCreateOverlayItemFactory(Adapter adapter,MapPoint point,int type,int group)
	{
		this.adapter=adapter;
		this.point=point;
		this.group=group;
		this.type=type;
	}
	
	@Override
	public Command create() {
		return new CommandCreateOverlayItem(adapter,type,group,point);
	}

}
