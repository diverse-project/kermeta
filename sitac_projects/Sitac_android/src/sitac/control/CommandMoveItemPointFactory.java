package sitac.control;

import sitac.view.MapItem;
import sitac.view.MapPoint;

public class CommandMoveItemPointFactory extends AbstractCommandFactory {

	private Adapter adapter;
	private MapPoint oldpoint,currentpoint;
	private MapItem item;
	private int index;
	
	public CommandMoveItemPointFactory(Adapter adapter,MapItem item,MapPoint oldp,MapPoint currp,int i)
	{
		this.adapter=adapter;
		this.item=item;
		oldpoint=oldp;
		currentpoint=currp;
		index=i;
	}
	
	@Override
	public Command create() {
		return new CommandMoveItemPoint(adapter,item,oldpoint,currentpoint,index);
	}

}
