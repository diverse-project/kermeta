package control;

public class CommandSendMessage extends Command{
	private Adapter adapter;
	private String mess;
	
	public CommandSendMessage(Adapter adapter, String m)
	{
		this.adapter=adapter;
		mess=m;
	}
	
	
	@Override
	public void execute() {
		adapter.sendMessage(mess);
	}

	@Override
	public void redo() {
		
	}

	@Override
	public void undo() {
		
	}

}
