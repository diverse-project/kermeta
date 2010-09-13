package control;

import view.MapItem;

public class CommandCreateItemFactory extends AbstractCommandFactory{
	private Adapter adapter;
	private MapItem item;
	
	public CommandCreateItemFactory(Adapter adapter, MapItem item)
	{
		this.adapter = adapter;
		this.item = item;
	}
	
	@Override
	public Command create() {
		return new CommandCreateItem(adapter, item);
	}

}
