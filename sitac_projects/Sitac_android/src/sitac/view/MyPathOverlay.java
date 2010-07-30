package sitac.view;

import java.util.ArrayList;

import org.andnav.osm.views.OpenStreetMapView;
import org.andnav.osm.views.overlay.OpenStreetMapViewPathOverlay;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

public class MyPathOverlay extends OpenStreetMapViewPathOverlay {

	private ArrayList<MapItem> items;
	private boolean createitem;
	private MapItem currentitem;
	private boolean itemselected;
	private int itemindex=-1;
	private int currentpoint=-1;
	private MapPoint MapPoint;
	private boolean dragndrop=false;
	private int itemtype=0;
	private Context context;
	
	public MyPathOverlay(int color, Context ctx) {
		super(color, ctx);
		// TODO Auto-generated constructor stub
		this.items=new ArrayList<MapItem>();
		this.createitem=false;
		this.itemselected=false;
		this.MapPoint=new MapPoint(1,1);
		this.context=ctx;
	}
	
	public void addItem(MapItem s)
	{
		this.items.add(s);
	}
	
	public ArrayList<MapItem> getItems()
	{
		return this.items;
	}
	
	public int getItemIndex()
	{
		return this.itemindex;
	}
	
	public void setItemIndex(int index)
	{
		this.itemindex=index;
	}
	
	public void setItemSelected(boolean sel)
	{
		this.itemselected=sel;
	}
	
	public void setItemType(int type)
	{
		this.itemtype=type;
	}
	
	public void onDraw(Canvas canvas,OpenStreetMapView mapview)
	{
		int size=this.items.size();
		for(int i=0;i<size;i++)
			this.items.get(i).draw(canvas, mapview);
	}
	
	public boolean onLongPress(MotionEvent event, OpenStreetMapView mapview)
	{
	    if(this.createitem==true)
	   	    	this.createitem=false;
	    this.itemtype=0;
	    return true;
	}
	
	public void putNewItem(OpenStreetMapView mapview)
	{
		this.createitem=true;
    	if(this.itemtype==0)
    		this.currentitem=new MapItemPoint(new MapPoint(mapview.getMapCenterLatitudeE6(),mapview.getMapCenterLongitudeE6()));
    	if(this.itemtype==2)
    		this.currentitem=new MapZone();
    	if(this.itemtype==1)
    		this.currentitem=new MapLine();
    	this.currentitem.setColor(this.mPaint.getColor());
    	this.addItem(this.currentitem);
    	this.itemindex=this.items.size()-1;
    	this.itemtype=0;
	}
	
	public boolean onSingleTapUp(MotionEvent event, OpenStreetMapView mapview)
	{
	  if(this.itemselected==false)
	  {
		if(this.createitem==true)
		{
			this.currentitem.addPoint(new MapPoint(mapview.getDrawnBoundingBoxE6().getGeoPointOfRelativePositionWithLinearInterpolation(event.getX() / mapview.getWidth(), event.getY() / mapview.getHeight()).getLatitudeE6(),mapview.getDrawnBoundingBoxE6().getGeoPointOfRelativePositionWithLinearInterpolation(event.getX() / mapview.getWidth(), event.getY() / mapview.getHeight()).getLongitudeE6()));
			
		}
		else
		{
			MapPoint gp=new MapPoint(mapview.getProjection().fromPixels(event.getX(), event.getY()).getLatitudeE6(),mapview.getProjection().fromPixels(event.getX(), event.getY()).getLongitudeE6());
			int size=this.items.size();
			for(int i=0;i<size;i++)
			{
				MapItem item=this.items.get(i);
				int ok=item.pointClicked(gp, mapview);
				if(ok!=-1)
				{
					item.setSelected(true);
					this.itemselected=true;
					this.itemindex=i;
					MapWidget mapw=(MapWidget)context;
					mapw.getPropertyEditor().setSelectable(item);
					mapw.getPropertyEditor().setSelectableButtonsVisible();
					mapw.getPropertyEditor().setVisibility(View.VISIBLE);
					break;
				}
			}
		}
	  }
	  else
	  {
		  this.itemselected=false;
	  }
		
		mapview.invalidate();
		return true;
	}
	
	public boolean onTouchEvent(MotionEvent event,OpenStreetMapView mapview)
	{
		if(this.itemselected==true)
		{
			int ev=event.getAction();
			float x=event.getX();
			float y=event.getY();
			MapPoint gp=new MapPoint(mapview.getProjection().fromPixels(x, y).getLatitudeE6(),mapview.getProjection().fromPixels(x, y).getLongitudeE6());
			switch(ev)
			{
			case MotionEvent.ACTION_DOWN:
				this.currentpoint=items.get(itemindex).pointClicked(gp,mapview);
				if(items.get(itemindex).isSelectedDragnDrop(gp,mapview)==true)
				{
					this.MapPoint=gp;
					this.dragndrop=true;
				}
				break;
			case MotionEvent.ACTION_MOVE:
				if(this.currentpoint!=-1)
				{
					this.items.get(this.itemindex).getPoints().remove(this.currentpoint);
					this.items.get(this.itemindex).getPoints().add(this.currentpoint, gp);
					mapview.invalidate();
				}
				else 
					if(this.dragndrop==true)
					{
						this.moveItem(this.itemindex,this.MapPoint,gp);
						this.MapPoint=gp;
						mapview.invalidate();
					}
				break;
			case MotionEvent.ACTION_UP:
				this.currentpoint=-1;
				this.itemselected=false;
				this.items.get(this.itemindex).setSelected(false);
				this.itemindex=-1;
				this.dragndrop=false;
				mapview.invalidate();
				break;
			}
			return true;
		}
		
		return super.onTouchEvent(event, mapview);
	}
	
	private void moveItem(int index,MapPoint oldp,MapPoint newp)
	{
		int latoffset=newp.getLatitudeE6()-oldp.getLatitudeE6();
		int longitoffset=newp.getLongitudeE6()-oldp.getLongitudeE6();
		
		int size=this.items.get(index).getPoints().size();
		for(int i=0;i<size;i++)
		{
			MapPoint gp=this.items.get(index).getPoints().get(i);
			this.items.get(index).getPoints().get(i).setCoordsE6(gp.getLatitudeE6()+latoffset,gp.getLongitudeE6()+longitoffset);
		}
	}
}
