package sitac.control;

import sitac.view.ChatPanel;
import sitac.view.ItemType;
import sitac.view.MapItem;
import sitac.view.MapItemPoint;
import sitac.view.MapLine;
import sitac.view.MapPoint;
import sitac.view.MapWidget;
import sitac.view.MapZone;
import sitac.view.MyOverlayItem;
import sitac.view.Selectable;

import sitac.view.util.OverlayItemFactory;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

public class Adapter {
	
	private Context ctx;
	
	public Adapter(Context context)
	{
		ctx=context;
	}
	
	public void moveItem(MapItem item,MapPoint curr,MapPoint old)
	{
		int latoffset=curr.getLatitudeE6()-old.getLatitudeE6();
		int longitoffset=curr.getLongitudeE6()-old.getLongitudeE6();
		
		int size=item.getPoints().size();
		for(int i=0;i<size;i++)
		{
			MapPoint gp=item.getPoints().get(i);
			item.getPoints().get(i).setCoordsE6(gp.getLatitudeE6()+latoffset,gp.getLongitudeE6()+longitoffset);
		}
		
		((MapWidget)ctx).getMapView().invalidate();
	}
	
	public void moveItemPoint(MapItem item,MapPoint mp,int index)
	{
		item.getPoints().remove(index);
		item.getPoints().add(index, mp);
		
		((MapWidget)ctx).getMapView().invalidate();
	}
	
	public MapItem createItem(String itemType)
	{
		MapItem item=null;
		
		((MapWidget)ctx).getPathOverlay().setCreateItem(true);
		
		if(itemType.equals("MapPoint"))
			item=new MapItemPoint();
		else if(itemType.equals("MapLine"))
			item=new MapLine();
		else if(itemType.equals("MapZone"))
			item=new MapZone();
		
		item.setColor(((MapWidget)ctx).getPathOverlay().getSelectedColor());
		((MapWidget)ctx).getPathOverlay().addItem(item);
		((MapWidget)ctx).getPathOverlay().setItemIndex(((MapWidget)ctx).getPathOverlay().getItems().size()-1);
		
		return item;
	}
	
	public void deleteItem(MapItem item)
	{
		((MapWidget)ctx).getPathOverlay().deleteItem(item);
		((MapWidget)ctx).getPathOverlay().setItemSelected(false);
		((MapWidget)ctx).getPathOverlay().setCreateItem(false);
		((MapWidget)ctx).getPathOverlay().setItemIndex(-1);
		((MapWidget)ctx).getPropertyEditor().setVisibility(View.INVISIBLE);
		((MapWidget)ctx).getMapView().invalidate();
	}
	
	public void placeItem(MapItem item)
	{
		((MapWidget)ctx).getPathOverlay().addItem(item);
		item.setSelected(false);
		((MapWidget)ctx).getMapView().invalidate();
	}
	
	public void addPointToItem(MapItem item,MapPoint point)
	{
		item.addPoint(point);
		((MapWidget)ctx).getMapView().invalidate();
	}
	
	public void removePointFromItem(MapItem item,MapPoint point)
	{
		item.getPoints().remove(point);
		((MapWidget)ctx).getMapView().invalidate();
	}
	public void selectItem(Selectable sel)
	{
		sel.setSelected(true);
		((MapWidget)ctx).getPathOverlay().setItemSelected(true);
		((MapWidget)ctx).getPathOverlay().setItemIndex(((MapWidget)ctx).getPathOverlay().getItems().indexOf(sel));
		((MapWidget)ctx).getPropertyEditor().setSelectable(sel);
		((MapWidget)ctx).getPropertyEditor().setSelectableButtonsVisible(true);
		((MapWidget)ctx).getPropertyEditor().setVisibility(View.VISIBLE);
	}
	
	public void deselectItem(Selectable sel)
	{
		sel.setSelected(false);
		((MapWidget)ctx).getPropertyEditor().setVisibility(View.INVISIBLE);
	}
	
	public void sendMessage(String mess)
	{
		((ChatPanel)ctx).getTextView().append("\n"); 
		((ChatPanel)ctx).getTextView().setTextColor(Color.RED);
		((ChatPanel)ctx).getTextView().append(mess);
		((ChatPanel)ctx).getTextView().invalidate();
		((ChatPanel)ctx).getEditText().clearComposingText();
		((ChatPanel)ctx).getEditText().setText("");
		((ChatPanel)ctx).getEditText().invalidate();
	}
	
	public void receiveMessage(String mess)
	{
		((ChatPanel)ctx).getTextView().append("\n"); 
		((ChatPanel)ctx).getTextView().setTextColor(Color.RED);
		((ChatPanel)ctx).getTextView().append(mess);
		((ChatPanel)ctx).getTextView().invalidate();
	}
	
	public int changeColor(Selectable sel,int color)
	{
		int oldcolor=0;
		if(sel instanceof MapItem)
		{
			MapItem item=(MapItem)sel;
			oldcolor=item.getColor();
			item.setColor(color);
			sel.setSelected(false);
			((MapWidget)ctx).getMapView().invalidate();
		}
		return oldcolor;
	}
	
	public MyOverlayItem createOverlayItem(ItemType itemtype,MapPoint mp)
	{
		MyOverlayItem item=new MyOverlayItem(itemtype,mp);
		if(item!=null)
		{
			((MapWidget)ctx).getItemizedOverlay().addItem(item);
			item.setSelected(false);
			((MapWidget)ctx).getMapView().invalidate();
		}
		if(itemtype.getTitle().equals("FPT")||itemtype.getTitle().equals("VSAV"))
		{
			CtrlMoyens.getInstance().deleteMoyenFromListView(itemtype);
			CtrlMoyens.getInstance().setMoyenPosTarget(itemtype.getMoyenId(), mp.getLatitudeE6()/1E6, mp.getLongitudeE6()/1E6);
		}
		((MapWidget)ctx).getToolBox().addDefaultAdapter();
		
		return item;
	}
	
	public void deleteOverlayItem(MyOverlayItem item, ItemType itemtype)
	{
		((MapWidget)ctx).getItemizedOverlay().deleteItem(item);
		((MapWidget)ctx).getMapView().invalidate();
		if(itemtype.getTitle().equals("FPT")||itemtype.getTitle().equals("VSAV"))
		{
			CtrlMoyens.getInstance().addMoyenToListView(itemtype);
		}
	}
	
	public void placeOverlayItem(MyOverlayItem item, ItemType itemtype)
	{
		((MapWidget)ctx).getItemizedOverlay().addItem(item);
		((MapWidget)ctx).getMapView().invalidate();
		if(itemtype.getTitle().equals("FPT")||itemtype.getTitle().equals("VSAV"))
		{
			CtrlMoyens.getInstance().deleteMoyenFromListView(itemtype);
		}
	}
	
	public void deleteOverlayItem(MyOverlayItem item)
	{
		((MapWidget)ctx).getItemizedOverlay().deleteItem(item);
		((MapWidget)ctx).getMapView().invalidate();
	}
	
	public void placeOverlayItem(MyOverlayItem item)
	{
		((MapWidget)ctx).getItemizedOverlay().addItem(item);
		((MapWidget)ctx).getMapView().invalidate();
	}
	
	public MapPoint moveOverlayItem(MyOverlayItem item,MapPoint mp)
	{
		MapPoint p=null;
		try {
			p = (MapPoint)item.getPosition().clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		item.setPosition(mp);
		((MapWidget)ctx).getMapView().invalidate();
		
		return p;
	}
	
	public int changeOverlayItemProperty(MyOverlayItem item, int change)
	{		
		int type=item.getType();
		int group=item.getGroup();
		int newgroup=group+change;
		if((newgroup<=2)&&(newgroup>=0))
		{   		
			OverlayItemFactory fact=new OverlayItemFactory();
			ItemType itemtype=fact.createNewItem(type, newgroup, ctx);
			item.setItemType(itemtype);
		}
	
		((MapWidget)ctx).getPropertyEditor().setVisibility(View.INVISIBLE);
		((MapWidget)ctx).getMapView().invalidate();
		item.setSelected(false);
		
		return change*(-1);
	}
	
	public void updateView()
	{
		
	}
}
