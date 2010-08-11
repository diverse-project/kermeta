package control;

import java.awt.Color;
import java.util.LinkedList;

import view.TabView;

public class Ctrl {
	private LinkedList<Command> commands;
	private int level=0;
	private TabView view;
	
	public Ctrl()
	{
		commands=new LinkedList<Command>();
	}
	
	public void addView(TabView v)
	{
		view=v;
	}
	
	public void removeLastCommand()
	{
		commands.removeLast();
	}
	
	public void execute(Command command)
	{
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
	
	public void setDrawLineMode(boolean b)
	{
		view.getMap().setDrawLineMode(b);
	}
	
	public void setDrawZoneMode(boolean b)
	{
		view.getMap().setDrawZoneMode(b);
	}
	
	public void setDrawBrushMode(boolean b)
	{
		view.getMap().setDrawBrushMode(b);
	}
	
	public void setColor(Color c)
	{
		view.getMap().setColor(c);
	}
	
	public void removeLine()
	{
		view.getMap().removeItem("line");
	}
	
	public void removeZone()
	{
		view.getMap().removeItem("zone");
	}
	
	public void removeItem()
	{
		view.getMap().removeItem("item point");
	}
	
	public void changeItemType()
	{
		view.getMap().changeItemType();
	}
}
