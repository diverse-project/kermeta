package control;

import view.MapPoint;

public class CommandMovePointFactory extends AbstractCommandFactory {
	private Adapter adapter;
	private MapPoint oldPoint;
	private MapPoint newPoint;
	
	public CommandMovePointFactory(Adapter adapter, MapPoint oldPoint, MapPoint newPoint)
	{
		this.adapter=adapter;
		this.oldPoint=oldPoint;
		this.newPoint=newPoint;
	}
	
	@Override
	public Command create() {
		return new CommandMovePoint(adapter,oldPoint,newPoint);
	}

}
