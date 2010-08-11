package control;

public class CommandCreateItemFactory extends AbstractCommandFactory{
	private Adapter adapter;
	private String itemType;
	
	public CommandCreateItemFactory(Adapter adapter, String itemType)
	{
		this.adapter=adapter;
		this.itemType=itemType;
	}
	
	@Override
	public Command create() {
		return new CommandCreateItem(adapter,itemType);
	}

}
