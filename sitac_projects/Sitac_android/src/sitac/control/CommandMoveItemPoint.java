package sitac.control;

import sitac.view.MapItem;
import sitac.view.MapPoint;

public class CommandMoveItemPoint extends Command {
	
	private Adapter adapter;
	private MapPoint oldpoint,currentpoint;
	private MapItem item;
	private int index;

	public CommandMoveItemPoint(Adapter adapter,MapItem item,MapPoint old,MapPoint curr,int i)
	{
		this.adapter=adapter;
		this.item=item;
		oldpoint=old;
		currentpoint=curr;
		index=i;
	}
	
	@Override
	public void execute() {
		// adapter.moveItemPoint(item, oldpoint, index);

	}

	@Override
	public void redo() {
		adapter.moveItemPoint(item, currentpoint, index);

	}

	@Override
	public void undo() {
		adapter.moveItemPoint(item, oldpoint, index);

	}

}
