package control;

import view.Selectable;

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
		adapter.selectItem(selItem,true);
	}

	@Override
	public void redo() {
		adapter.selectItem(selItem,true);
	}

	@Override
	public void undo() {
		adapter.selectItem(selItem,false);
	}

}
