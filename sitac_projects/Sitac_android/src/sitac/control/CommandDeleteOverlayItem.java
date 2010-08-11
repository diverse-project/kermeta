package sitac.control;

import sitac.view.MyOverlayItem;

public class CommandDeleteOverlayItem extends Command {

	private Adapter adapter;
	private MyOverlayItem item;
	
	public CommandDeleteOverlayItem(Adapter adapter,MyOverlayItem item)
	{
		this.adapter=adapter;
		this.item=item;
	}
	
	@Override
	public void execute() {
		adapter.deleteOverlayItem(item);

	}

	@Override
	public void redo() {
		adapter.deleteOverlayItem(item);

	}

	@Override
	public void undo() {
		adapter.placeOverlayItem(item);

	}

}
