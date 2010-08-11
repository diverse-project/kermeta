package sitac.control;

import sitac.view.MyOverlayItem;

public class CommandDeleteOverlayItemFactory extends AbstractCommandFactory {

	private Adapter adapter;
	private MyOverlayItem item;
	
	public CommandDeleteOverlayItemFactory(Adapter adapter, MyOverlayItem item)
	{
		this.adapter=adapter;
		this.item=item;
	}
	
	@Override
	public Command create() {
		return new CommandDeleteOverlayItem(adapter,item);
	}

}
