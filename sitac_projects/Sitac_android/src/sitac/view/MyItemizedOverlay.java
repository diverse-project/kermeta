package sitac.view;

import java.util.List;

import org.andnav.osm.ResourceProxy;
import org.andnav.osm.views.OpenStreetMapView;
import org.andnav.osm.views.overlay.OpenStreetMapViewItemizedOverlay;

import sitac.view.util.OverlayItemFactory;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;

public class MyItemizedOverlay extends OpenStreetMapViewItemizedOverlay<MyOverlayItem> {
	
	private boolean newitem=false;
	private int newitemtype=-1;
	private int newitemgroup=-1;
	private Context context;

	public MyItemizedOverlay(Context ctx, List<MyOverlayItem> list, Drawable marker,
			Point markerHotspot, OnItemTapListener<MyOverlayItem> onItemTapListener,
			ResourceProxy resourceProxy) {
		super(ctx, list, marker, markerHotspot, onItemTapListener, resourceProxy);
		this.context=ctx;
		// TODO Auto-generated constructor stub
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
	
	public void setNewItemType(int t)
	{
		this.newitemtype=t;
	}
	
	public void setNewItemGroup(int g)
	{
		this.newitemgroup=g;
	}
	
	public boolean onTouchEvent(MotionEvent event,OpenStreetMapView mapview)
	{
		int i=this.itemSelected();
		if(i!=-1)
		{
			this.mItemList.get(i).getMarker().setAlpha(255);
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
				this.mItemList.get(i).setSelected(false);
				this.mItemList.get(i).getMarker().setAlpha(150);
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
				this.createNewItem(this.newitemtype, this.newitemgroup, gp);
			    this.newitem=false;
			    mapview.invalidate();
			    return true;
			}
		return super.onTouchEvent(event, mapview);
	}
	
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
	
	private void createNewItem(int type,int group,MapPoint gp)
	{
		OverlayItemFactory fact=new OverlayItemFactory();
		ItemType itemtype=fact.createNewItem(type, group,this.context);
		MyOverlayItem item=new MyOverlayItem(itemtype,gp);
		if(item!=null)
			this.addItem(item);
	}

}
