package sitac.control;

import sitac.view.Selectable;

public class CommandChangeSelectableProperty extends Command {

	private Adapter adapter;
	private Selectable item;
	private int color;
	
	public CommandChangeSelectableProperty(Adapter adapter,Selectable selItem,int col)
	{
		this.adapter=adapter;
		item=selItem;
		color=col;
	}
	
	@Override
	public void execute() {
		color=adapter.changeColor(item, color);

	}

	@Override
	public void redo() {
		color=adapter.changeColor(item, color);

	}

	@Override
	public void undo() {
		color=adapter.changeColor(item, color);

	}

}
