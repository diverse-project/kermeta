package control;

import view.MapItem;

public class CommandCreateItem extends Command{
	private MapItem item;
	private Adapter adapter;
	
	public CommandCreateItem(Adapter adapter, MapItem item)
	{
		this.adapter = adapter;
		this.item = item;
	}
	
	@Override
	public void execute() {
		adapter.createItem(item);
	}

	@Override
	public void redo() {
		adapter.redoCreateItem(item);
	}

	@Override
	public void undo() {
		adapter.undoCreateItem(item);
	}

}
