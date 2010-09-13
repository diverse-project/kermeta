package control;

import view.MapItem;
import view.MapPoint;

public class CommandMovePoint extends Command {
	private Adapter adapter;
	private MapPoint oldPoint;
	private MapPoint newPoint;
	private MapItem item;
	
	public CommandMovePoint(Adapter adapter, MapPoint oldPoint, MapPoint newPoint, MapItem item)
	{
		this.adapter=adapter;
		this.oldPoint=oldPoint;
		this.newPoint=newPoint;
		this.item=item;
	}
	
	@Override
	public void execute() {
		
	}

	@Override
	public void redo() {
		adapter.undoMovePoint(oldPoint, newPoint, item);
	}

	@Override
	public void undo() {
		adapter.undoMovePoint(oldPoint, newPoint, item);
	}

}
