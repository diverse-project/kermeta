package control;

public class CommandSendMessageFactory extends AbstractCommandFactory{
	private Adapter adapter;
	private String mess;
	
	public CommandSendMessageFactory(Adapter adapter, String mess)
	{
		this.adapter=adapter;
		this.mess=mess;
	}
	
	@Override
	public Command create() {
		return new CommandSendMessage(adapter,mess);
	}

}
