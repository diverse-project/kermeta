package sitac.control;

import sitac.view.MapItem;

public class CommandDeleteItem extends Command {

	private Adapter adapter;
	private MapItem item;
	
	public CommandDeleteItem(Adapter adapter, MapItem item)
	{
		this.adapter=adapter;
		this.item=item;
	}
	@Override
	public void execute() {
		adapter.deleteItem(item);

	}

	@Override
	public void redo() {
		adapter.deleteItem(item);

	}

	@Override
	public void undo() {
		adapter.placeItem(item);

	}

}
