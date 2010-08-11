package sitac.control;

import sitac.view.MyOverlayItem;

public class CommandChangeOverlayItemProperty extends Command {

	private Adapter adapter;
	private MyOverlayItem item;
	private int type;
	
	public CommandChangeOverlayItemProperty(Adapter adapter, MyOverlayItem item, int type)
	{
		this.adapter=adapter;
		this.item=item;
		this.type=type;
	}
	
	@Override
	public void execute() {
		type=adapter.changeOverlayItemProperty(item, type);

	}

	@Override
	public void redo() {
		type=adapter.changeOverlayItemProperty(item, type);

	}

	@Override
	public void undo() {
		type=adapter.changeOverlayItemProperty(item, type);

	}

}
