package control;

import view.MapItem;

public class CommandRemoveItemFactory extends AbstractCommandFactory  {
	private Adapter adapter;
	private MapItem item;
	
	public CommandRemoveItemFactory(Adapter adapter, MapItem item)
	{
		this.adapter=adapter;
		this.item=item;
	}
	
	@Override
	public Command create() {
		return new CommandRemoveItem(adapter,item);
	}

}
