package sitac.control;

import sitac.view.MapItem;
import sitac.view.MapPoint;


public class CommandMoveItem extends Command{
	private Adapter adapter;
	private MapPoint currentpoint,oldpoint;
	private MapItem item;
	
	public CommandMoveItem(Adapter adapter, MapPoint curr,MapPoint o, MapItem item)
	{
		this.adapter=adapter;
		this.item=item;
		this.oldpoint=o;
		this.currentpoint=curr;
	}
	
	@Override
	public void execute() {
		//adapter.moveItem(item,currentpoint,oldpoint);
		
	}

	@Override
	public void redo() {
		adapter.moveItem(item, currentpoint, oldpoint);
	}

	@Override
	public void undo() {
		adapter.moveItem(item,oldpoint, currentpoint);
	}

}
