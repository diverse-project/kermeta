package sitac.control;

import sitac.view.Selectable;

public class CommandChangeSelectablePropertyFactory extends AbstractCommandFactory {

	private Adapter adapter;
	private Selectable selItem;
	private int color;
	
	public CommandChangeSelectablePropertyFactory(Adapter adapter, Selectable sel,int col)
	{
		this.adapter=adapter;
		selItem=sel;
		color=col;
	}
	
	@Override
	public Command create() {
		return new CommandChangeSelectableProperty(adapter,selItem,color);
	}

}
