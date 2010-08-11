package sitac.control;

public class CommandUpdateView extends Command{
	private Adapter adapter;
	
	public CommandUpdateView(Adapter adapter)
	{
		this.adapter=adapter;
	}
	
	@Override
	public void execute() {
		adapter.updateView();
	}

	@Override
	public void redo() {
		
	}

	@Override
	public void undo() {
		
	}

}
