package control;

public class CommandReceiveMessageFactory extends AbstractCommandFactory{
	private Adapter adapter;
	private String mess;
	
	public CommandReceiveMessageFactory(Adapter adapter, String mess)
	{
		this.adapter=adapter;
		this.mess=mess;
	}
	
	@Override
	public Command create() {
		return new CommandReceiveMessage(adapter,mess);
	}

}
