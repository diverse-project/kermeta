package control;

import view.MapItem;

public class CommandCreateItem extends Command{
	private MapItem item;
	private String itemType;
	private Adapter adapter;
	
	public CommandCreateItem(Adapter adapter,String itemType)
	{
		this.adapter=adapter;
		this.itemType=itemType;
	}
	
	@Override
	public void execute() {
		item=adapter.createItem(itemType);
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
