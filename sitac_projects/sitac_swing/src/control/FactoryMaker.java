package control;

import java.util.ArrayList;
import java.util.List;

import view.MapItem;
import view.MapPoint;
import view.Selectable;

public class FactoryMaker{
	private Adapter adapter;
	private MapItem item;
	private String mess;
	private Selectable selItem;
	private List<MapPoint> points;
	private MapPoint oldPoint;
	private MapPoint newPoint;
	
	public FactoryMaker(Adapter adapter)
	{
		this.adapter=adapter;
	}
	
	public void setOldPoint(MapPoint p)
	{
		oldPoint=p;
	}
	
	public void setNewPoint(MapPoint p)
	{
		newPoint=p;
	}
	
	public void setMapItem(MapItem it)
	{
		item=it;
	}
	
	public void setMessage(String m)
	{
		mess=m;
	}
	
	public void setSelectable(Selectable s)
	{
		selItem=s;
	}
	
	public void setPoints(List<MapPoint> p)
	{
		points=new ArrayList<MapPoint>();
		for (int i=0;i<p.size();i++)
		{
			MapPoint mp=new MapPoint(p.get(i).getPoint());
			points.add(mp);
		}
	}
	
	public AbstractCommandFactory create(int type)
	{
		switch (type)
		{
		case 0:
			return new CommandCreateItemFactory(adapter,item);
		case 1:
			return new CommandMoveItemFactory(adapter,points,item);
		case 2:
			return new CommandReceiveMessageFactory(adapter,mess);
		case 3:
			return new CommandSelectItemFactory(adapter,selItem);
		case 4:
			return new CommandSendMessageFactory(adapter,mess);
		case 5:
			return new CommandUpdateViewFactory(adapter);
		case 6:
			return new CommandMovePointFactory(adapter,oldPoint,newPoint,item);
		case 7:
			return new CommandRemoveItemFactory(adapter,item);
		default:
			return null;
		}
	}
}
