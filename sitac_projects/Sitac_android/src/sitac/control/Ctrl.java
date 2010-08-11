package sitac.control;

import java.util.LinkedList;

public class Ctrl {
	private LinkedList<Command> commands;
	private int level=0;
	
	private final int maxim=100;
	
	private static Ctrl instance;
	
	private Ctrl()
	{
		commands=new LinkedList<Command>();
	}
	
	public static Ctrl getInstance()
	{
		if(instance==null)
			instance=new Ctrl();
		return instance;
	}
	
	public void execute(Command command)
	{
		if(commands.size()==maxim)
		{
			commands.removeFirst();
			if(level>0)
				level--;
		}
		commands.addLast(command);
		command.execute();
	}
	
	public void undo()
	{
		if (level<commands.size())
		{
			Command command=commands.getLast();
			commands.removeLast();
			commands.addFirst(command);
			command.undo();
			level++;
		}
	}
	
	public void redo()
	{
		if (level>0)
		{
			Command command=commands.getFirst();
			commands.removeFirst();
			commands.addLast(command);
			command.redo();
			level--;
		}
	}
	
	public void deleteLastCommands(int number)
	{
		for(int i=1;(i<=number)&&(commands.isEmpty()==false);i++)
		{
			commands.removeLast();
		}
		
		boolean ok=false;
		while((ok==false)&&(commands.isEmpty()==false))
		{
			if(commands.getFirst() instanceof CommandAddMapPointToItem)
			{
				commands.removeFirst();
				level--;
			}
			else
				ok=true;
		}
	}
	
	public void deleteCommandsOnDelete(int number)
	{
		Command command=commands.getLast();
		commands.removeLast();
		if(commands.getLast() instanceof CommandAddMapPointToItem)
			this.deleteLastCommands(number);
		commands.addLast(command);
	}
}
