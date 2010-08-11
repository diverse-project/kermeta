package sitac.control;

import sitac.view.MyOverlayItem;

public class CommandChangeOverlayItemPropertyFactory extends
		AbstractCommandFactory {
	
	private Adapter adapter;
	private MyOverlayItem item;
	private int type;

	public CommandChangeOverlayItemPropertyFactory(Adapter adapter, MyOverlayItem item, int type)
	{
		this.adapter=adapter;
		this.item=item;
		this.type=type;
	}
	
	@Override
	public Command create() {
		return new CommandChangeOverlayItemProperty(adapter,item,type);
	}

}
