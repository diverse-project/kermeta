package sitac.view;

import java.util.List;

import org.andnav.osm.ResourceProxy;
import org.andnav.osm.views.OpenStreetMapView;
import org.andnav.osm.views.overlay.OpenStreetMapViewItemizedOverlay;

import sitac.control.AbstractCommandFactory;
import sitac.control.Adapter;
import sitac.control.Ctrl;
import sitac.control.CtrlMoyens;
import sitac.control.FactoryMaker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;

/**
 * 
 * @author Catalin Cupse
 * The class represents the map overlay which contains all the engines added on the map ( engines repersented by
 * MyOverlayItem objects ).
 */
public class MyItemizedOverlay extends OpenStreetMapViewItemizedOverlay<MyOverlayItem> {
	
	private boolean newitem=false;
	private Context context;

	public MyItemizedOverlay(Context ctx, List<MyOverlayItem> list, Drawable marker,
			Point markerHotspot, OnItemTapListener<MyOverlayItem> onItemTapListener,
			ResourceProxy resourceProxy) {
		super(ctx, list, marker, markerHotspot, onItemTapListener, resourceProxy);
		this.context=ctx;
		CtrlMoyens.getInstance().setItemizedOverlay(this);
	}
	
	public void addItem(MyOverlayItem item)
	{
		this.mItemList.add(item);
	}
	
	public void deleteItem(MyOverlayItem item)
	{
		this.mItemList.remove(item);
	}

	protected int itemSelected()
	{
		int index=-1;
		int size=this.mItemList.size();
		for(int i=0;i<size;i++)
		{
			if(this.mItemList.get(i).isSelected()==true)
			{
				index=i;
				break;
			}
		}
		return index;
	}
	
	public List<MyOverlayItem> getOverlayItems()
	{
		return this.mItemList;
	}
	
	public void setNewItem(boolean s)
	{
		this.newitem=s;
	}
	
	public boolean getNewItem()
	{
		return this.newitem;
	}

	@Override
	/**
	 * You can select an item by tapping on it; you can drag the selected item on the map. 
	 * In order to create a new item, you tap on the map on the desired position for the item 
	 * ( after you have selected the type of the item you want to create from the LibToolBox ).
	 */
	public boolean onTouchEvent(MotionEvent event,OpenStreetMapView mapview)
	{
		FactoryMaker.getInstance().setAdapter(new Adapter(context));
		int i=this.itemSelected();
		if(i!=-1)
		{
			int ev=event.getAction();
			float x=event.getX();
			float y=event.getY();
			MapPoint gp=new MapPoint(mapview.getProjection().fromPixels(x, y).getLatitudeE6(),mapview.getProjection().fromPixels(x, y).getLongitudeE6());
			switch(ev)
			{
			case MotionEvent.ACTION_MOVE:
				this.mItemList.get(i).setPosition(gp);
				mapview.invalidate();
				break;
			case MotionEvent.ACTION_UP:
				AbstractCommandFactory acf=FactoryMaker.getInstance().create(10);
				Ctrl.getInstance().execute(acf.create());
				
				this.mItemList.get(i).setSelected(false);
				break;
			}
			return true;
		}
		else
			if(this.newitem==true)
			{
				float x=event.getX();
				float y=event.getY();
				MapPoint gp=new MapPoint(mapview.getProjection().fromPixels(x, y).getLatitudeE6(),mapview.getProjection().fromPixels(x, y).getLongitudeE6());
			    this.newitem=false;
			    
			    FactoryMaker.getInstance().setOldMapPoint(gp);
			    AbstractCommandFactory acf=FactoryMaker.getInstance().create(12);
			    Ctrl.getInstance().execute(acf.create());
			    return true;
			}
		return super.onTouchEvent(event, mapview);
	}
	
	@Override
	protected void onDrawItem(final Canvas c, final int index, final Point curScreenCoords) 
	{
        final int left = curScreenCoords.x - this.mMarkerHotSpot.x;
        final int right = left + this.mMarkerWidth;
        final int top = curScreenCoords.y - this.mMarkerHotSpot.y;
        final int bottom = top + this.mMarkerHeight;
    
        if(this.mItemList.get(index).getMarker()!=null)
        {
        	int right2=left+this.mItemList.get(index).getMarker().getIntrinsicWidth();
        	int bottom2=top+this.mItemList.get(index).getMarker().getIntrinsicHeight();
        	this.mItemList.get(index).getMarker().setBounds(left, top, right2, bottom2);
        	this.mItemList.get(index).getMarker().draw(c);
        }
        else
        {
        	this.mMarker.setBounds(left, top, right, bottom);
            this.mMarker.draw(c);
        }
   }
	
	/**
	 * If you change the name of an engine in the EnginesActivity tab, the map item representing
	 * that engine will update with respect to that changes.
	 * @param index the index of the engine with the name changed
	 */
	public void updateItemDescription(int index)
	{
		int size=mItemList.size();
		for(int i=0;i<size;i++)
		{
			if(mItemList.get(i).getItemType().getMoyenId()==index)
			{
				mItemList.get(i).getItemType().setDescription(CtrlMoyens.getInstance().getMoyenName(index));
				break;
			}
		}
	}
	
	/**
	 * When an engine arrives at the indicated place, the icon on the map representing that 
	 * engine will turn from a dashed line to a solid line.
	 * @param index the index of the engine that have arrived 
	 */
	public void updateItemIcon(int index)
	{
		int size=mItemList.size();
		for(int i=0;i<size;i++)
		{
			if(mItemList.get(i).getItemType().getMoyenId()==index)
			{
				if(mItemList.get(i).getItemType().getTitle().equals("FPT"))
					mItemList.get(i).getItemType().setIcon(context.getResources().getDrawable(R.drawable.redsingle));
				else
					mItemList.get(i).getItemType().setIcon(context.getResources().getDrawable(R.drawable.greensingle));
				((MapWidget)context).getMapView().invalidate();
				break;
			}
		}
	}
	
}
