package control;

import java.util.List;

import view.MapItem;
import view.MapPoint;

public class CommandMoveItem extends Command{
	private Adapter adapter;
	private List<MapPoint> points;
	private MapItem item;
	
	public CommandMoveItem(Adapter adapter, List<MapPoint> points, MapItem item)
	{
		this.adapter=adapter;
		this.points=points;
		this.item=item;
	}
	
	@Override
	public void execute() {

	}

	@Override
	public void redo() {
		adapter.undoMoveItem(item,points);
	}

	@Override
	public void undo() {
		adapter.undoMoveItem(item,points);
	}

}
