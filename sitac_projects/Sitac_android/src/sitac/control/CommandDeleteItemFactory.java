package sitac.control;

import sitac.view.MapItem;


public class CommandDeleteItemFactory extends AbstractCommandFactory {
	
	private Adapter adapter;
	private MapItem item;

	public CommandDeleteItemFactory(Adapter adapter,MapItem item)
	{
		this.adapter=adapter;
		this.item=item;
	}
	
	@Override
	public Command create() {
		// TODO Auto-generated method stub
		return new CommandDeleteItem(adapter,item);
	}

}
