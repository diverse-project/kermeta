package sitac.control;

import sitac.view.MapItem;
import sitac.view.MapPoint;


public class CommandMoveItemFactory extends AbstractCommandFactory{
	private Adapter adapter;
	private MapPoint currpoint,oldpoint;
	private MapItem item;
	
	public CommandMoveItemFactory(Adapter adapter,MapPoint currp,MapPoint oldp,MapItem item)
	{
		this.adapter=adapter;
		this.item=item;
		currpoint=currp;
		oldpoint=oldp;
	}
	
	@Override
	public Command create() {
		return new CommandMoveItem(adapter,currpoint,oldpoint,item);
	}

}
