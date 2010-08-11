package control;

import java.util.List;

import view.MapItem;
import view.MapPoint;

public class CommandMoveItemFactory extends AbstractCommandFactory{
	private Adapter adapter;
	private MapItem item;
	private List<MapPoint> points;
	
	public CommandMoveItemFactory(Adapter adapter,List<MapPoint> p,MapItem item)
	{
		this.adapter=adapter;
		this.item=item;
		points=p;
	}
	
	@Override
	public Command create() {
		return new CommandMoveItem(adapter,points,item);
	}

}
