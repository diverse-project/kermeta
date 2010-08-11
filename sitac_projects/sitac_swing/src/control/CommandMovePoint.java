package control;

import view.MapPoint;

public class CommandMovePoint extends Command {
	private Adapter adapter;
	private MapPoint oldPoint;
	private MapPoint newPoint;
	
	public CommandMovePoint(Adapter adapter, MapPoint oldPoint, MapPoint newPoint)
	{
		this.adapter=adapter;
		this.oldPoint=oldPoint;
		this.newPoint=newPoint;
	}
	
	@Override
	public void execute() {
		
	}

	@Override
	public void redo() {
		adapter.undoMovePoint(oldPoint, newPoint);
	}

	@Override
	public void undo() {
		adapter.undoMovePoint(oldPoint, newPoint);
	}

}
