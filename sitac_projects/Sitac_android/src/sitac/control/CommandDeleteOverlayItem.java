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
		if(item.getItemType().getTitle().equals("FPT")||item.getItemType().getTitle().equals("VSAV"))
			adapter.deleteOverlayItem(item,item.getItemType());
		else
			adapter.deleteOverlayItem(item);
	}

	@Override
	public void redo() {
		if(item.getItemType().getTitle().equals("FPT")||item.getItemType().getTitle().equals("VSAV"))
			adapter.deleteOverlayItem(item,item.getItemType());
		else
			adapter.deleteOverlayItem(item);
	}

	@Override
	public void undo() {
		if(item.getItemType().getTitle().equals("FPT")||item.getItemType().getTitle().equals("VSAV"))
			adapter.placeOverlayItem(item,item.getItemType());
		else
			adapter.placeOverlayItem(item);
	}

}
