package sitac.control;

import sitac.view.MapItem;
import sitac.view.MapPoint;
import sitac.view.MyOverlayItem;
import sitac.view.Selectable;

public class FactoryMaker{
	
	private Adapter adapter;
	private String itemType;
	private MapPoint currpoint,oldpoint;
	private MapItem item;
	private String mess;
	private Selectable selItem;
	private int param1,param2;
	private MyOverlayItem overlayitem;
	
	private static AbstractCommandFactory pf=null;
	
	private static FactoryMaker instance;
	
	private FactoryMaker()
	{
		super();
	}
	
	public static FactoryMaker getInstance()
	{
		if(instance==null)
			instance=new FactoryMaker();
		return instance;
	}
	
	public void setAdapter(Adapter adapt)
	{
		adapter=adapt;
	}
	
	public void setItemType(String itemType)
	{
		this.itemType=itemType;
	}
	
	public void setCurrentMapPoint(MapPoint p)
	{
		currpoint=p; 
	}
	
	public void setOldMapPoint(MapPoint p)
	{
		oldpoint=p;
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
	
	public void setIntParam1(int p)
	{
		param1=p;
	}
	
	public void setIntParam2(int p)
	{
		param2=p;
	}
	
	public void setOverlayItem(MyOverlayItem item)
	{
		overlayitem=item;
	}
	
	public AbstractCommandFactory create(int type)
	{
		switch (type)
		{
		case 0:
			pf=new CommandCreateItemFactory(adapter,itemType);
			break;
		case 1:
			pf=new CommandMoveItemFactory(adapter,currpoint,oldpoint,item);
			break;
		case 2:
			pf=new CommandReceiveMessageFactory(adapter,mess);
			break;
		case 3:
			pf=new CommandSelectItemFactory(adapter,selItem);
			break;
		case 4:
			pf=new CommandSendMessageFactory(adapter,mess);
			break;
		case 5:
			pf=new CommandUpdateViewFactory(adapter);
			break;
		case 6:
			pf=new CommandChangeSelectablePropertyFactory(adapter,selItem,param2);
			break;
		case 7:
			pf=new CommandMoveItemPointFactory(adapter,item,oldpoint,currpoint,param2);
			break;
		case 8:
			pf=new CommandDeleteItemFactory(adapter,item);
			break;
		case 9:
			pf=new CommandDeleteOverlayItemFactory(adapter,overlayitem);
			break;
		case 10:
			pf=new CommandMoveOverlayItemFactory(adapter,overlayitem,oldpoint);
			break;
		case 11:
			pf=new CommandChangeOverlayItemPropertyFactory(adapter,overlayitem,param2);
			break;
		case 12:
			pf=new CommandCreateOverlayItemFactory(adapter,oldpoint,param1,param2);
			break;
		case 13:
			pf=new CommandAddMapPointToItemFactory(adapter,item,oldpoint);
			break;
		}
		
		return pf;
	}
}
