package sitac.control;

public class CommandReceiveMessage extends Command{
	private Adapter adapter;
	private String mess;
	
	public CommandReceiveMessage(Adapter adapter, String m)
	{
		this.adapter=adapter;
		mess=m;
	}
	
	@Override
	public void execute() {
		adapter.receiveMessage(mess);
	}

	@Override
	public void redo() {
		
	}

	@Override
	public void undo() {
		
	}

}
