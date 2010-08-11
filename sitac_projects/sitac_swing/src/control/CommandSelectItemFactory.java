package control;

import view.Selectable;

public class CommandSelectItemFactory extends AbstractCommandFactory{
	private Adapter adapter;
	private Selectable selItem;
	
	public CommandSelectItemFactory(Adapter adapter, Selectable sel)
	{
		this.adapter=adapter;
		selItem=sel;
	}
	
	@Override
	public Command create() {
		return new CommandSelectItem(adapter,selItem);
	}

}
