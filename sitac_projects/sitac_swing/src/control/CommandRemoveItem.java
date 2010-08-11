package control;

import view.MapItem;

public class CommandRemoveItem extends Command {
	private Adapter adapter;
	private MapItem item;
	
	public CommandRemoveItem(Adapter adapter, MapItem item)
	{
		this.adapter=adapter;
		this.item=item;
	}
	
	@Override
	public void execute() {
		adapter.removeItem(item);
	}

	@Override
	public void redo() {
		adapter.removeItem(item);
	}

	@Override
	public void undo() {
		adapter.undoRemoveItem(item);
	}

}
