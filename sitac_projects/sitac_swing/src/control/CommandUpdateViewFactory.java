package control;

public class CommandUpdateViewFactory extends AbstractCommandFactory{
	private Adapter adapter;
	
	public CommandUpdateViewFactory(Adapter adapter)
	{
		this.adapter=adapter;
	}
	
	@Override
	public Command create() {
		return new CommandUpdateView(adapter);
	}

}
