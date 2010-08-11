package sitac.control;

import sitac.view.Selectable;

public class CommandSelectItem extends Command{
	private Adapter adapter;
	private Selectable selItem;
	
	public CommandSelectItem(Adapter adapter, Selectable sel)
	{
		this.adapter=adapter;
		selItem=sel;
	}
	
	@Override
	public void execute() {
		adapter.selectItem(selItem);
	}

	@Override
	public void redo() {
		adapter.selectItem(selItem);
	}

	@Override
	public void undo() {
		adapter.deselectItem(selItem);
	}

}
