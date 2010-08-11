package sitac.control;

import sitac.view.MapItem;


public class CommandCreateItem extends Command{
	private MapItem item;
	private String itemType;
	private Adapter adapter;
	
	public CommandCreateItem(Adapter adapter,String itemType)
	{
		this.adapter=adapter;
		this.itemType=itemType;
	}
	
	public MapItem getCreatedItem()
	{
		return item;
	}
	
	@Override
	public void execute() {
		item=adapter.createItem(itemType);
	}

	@Override
	public void redo() {
		adapter.placeItem(item);
	}

	@Override
	public void undo() {
		adapter.deleteItem(item);
	}

}
