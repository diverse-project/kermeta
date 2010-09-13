package control;

import view.MapItem;
import view.MapPoint;

public class CommandMovePointFactory extends AbstractCommandFactory {
	private Adapter adapter;
	private MapPoint oldPoint;
	private MapPoint newPoint;
	private MapItem item;
	
	public CommandMovePointFactory(Adapter adapter, MapPoint oldPoint, MapPoint newPoint, MapItem item)
	{
		this.adapter=adapter;
		this.oldPoint=oldPoint;
		this.newPoint=newPoint;
		this.item=item;
	}
	
	@Override
	public Command create() {
		return new CommandMovePoint(adapter,oldPoint,newPoint,item);
	}

}
