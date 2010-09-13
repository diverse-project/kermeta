package sitac.view;

import java.util.ArrayList;

import org.andnav.osm.views.OpenStreetMapView;
import org.andnav.osm.views.overlay.OpenStreetMapViewPathOverlay;

import sitac.control.AbstractCommandFactory;
import sitac.control.Adapter;
import sitac.control.Ctrl;
import sitac.control.FactoryMaker;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

/**
 * 
 * @author Catalin Cupse	
 * The class represents the map overlay that contains MapItems: points (MapItemPoint), lines (MapLine)
 * and zones (MapZone).
 */

public class MyPathOverlay extends OpenStreetMapViewPathOverlay {

	private ArrayList<MapItem> items;
	private boolean createitem=false;
	private boolean itemselected=false;
	private int itemindex=-1;
	private int currentpoint=-1;
	private MapPoint MapPoint;
	private boolean dragndrop=false;
	private Context ctx;
	
	public MyPathOverlay(int color, Context ctx) {
		super(color, ctx);
		this.items=new ArrayList<MapItem>();
		this.ctx=ctx;
	}
	
	public void addItem(MapItem item)
	{
		this.items.add(item);
	}
	
	public void deleteItem(MapItem item)
	{
		this.items.remove(item);
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
	
	public void setCreateItem(boolean s)
	{
		this.createitem=s;
	}
	
	public int getSelectedColor()
	{
		return this.mPaint.getColor();
	}
	
	@Override
	public void onDraw(Canvas canvas,OpenStreetMapView mapview)
	{
		int size=this.items.size();
		for(int i=0;i<size;i++)
			this.items.get(i).draw(canvas, mapview);
	}
	
	@Override
	/**
	 * In order to finish the drawing of an MapItem ( to finish adding new points to the 
	 * current MapItem ), a long press is needed.
	 */
	public boolean onLongPress(MotionEvent event, OpenStreetMapView mapview)
	{
	    if(this.createitem==true)
	    {
	    	this.createitem=false;
	    	Ctrl.getInstance().deleteLastCommands(items.get(itemindex).getPoints().size());
	    }
	    return true;
	}
	
	@Override
	/**
	 * With a single tap you can either select an existing item from the map ( if you tap on that item - the
	 * constituent points will be highlighted ), or you can add a new point to the item that is currently created.
	 */
	public boolean onSingleTapUp(MotionEvent event, OpenStreetMapView mapview)
	{
	  FactoryMaker.getInstance().setAdapter(new Adapter(ctx));
	  if(this.itemselected==false)
	  {
	    MapPoint gp=new MapPoint(mapview.getProjection().fromPixels(event.getX(), event.getY()).getLatitudeE6(),mapview.getProjection().fromPixels(event.getX(), event.getY()).getLongitudeE6());			
		if(this.createitem==true)
		{	
			FactoryMaker.getInstance().setMapItem(items.get(itemindex));
			FactoryMaker.getInstance().setOldMapPoint(gp);
			AbstractCommandFactory acf=FactoryMaker.getInstance().create(13);
			Ctrl.getInstance().execute(acf.create());
		}
		else
		{
			int size=this.items.size();
			for(int i=0;i<size;i++)
			{
				MapItem item=this.items.get(i);
				if(item.isSelectedDragnDrop(gp, mapview)==true)
				{	
					FactoryMaker.getInstance().setSelectable(item);
					AbstractCommandFactory acf=FactoryMaker.getInstance().create(3);
					Ctrl.getInstance().execute(acf.create());
					break;
				}
			}
		}
	  }
	  else
	  {
		  this.itemselected=false;
	  }
		
		return true;
	}
	
	@Override
	/**
	 * You can either drag the entire item on the map ( all the constituent points will be moved in respect to the
	 * movement of the finger on the device ), or just a point of the selected item.
	 */
	public boolean onTouchEvent(MotionEvent event,OpenStreetMapView mapview)
	{
		int ev=event.getAction();
		float x=event.getX();
		float y=event.getY();
		MapPoint gp=new MapPoint(mapview.getProjection().fromPixels(x, y).getLatitudeE6(),mapview.getProjection().fromPixels(x, y).getLongitudeE6());
		
		if(this.itemselected==true)
		{
			switch(ev)
			{
			case MotionEvent.ACTION_DOWN:
				this.currentpoint=items.get(itemindex).pointClicked(gp,mapview);			
				if(items.get(itemindex).isSelectedDragnDrop(gp,mapview)==true)
				{
					this.MapPoint=gp;
					this.dragndrop=true;
					
					FactoryMaker.getInstance().setMapItem(items.get(itemindex));
					FactoryMaker.getInstance().setOldMapPoint(gp);
				}
				else if(this.currentpoint!=-1)
				{
					FactoryMaker.getInstance().setMapItem(items.get(itemindex));
					FactoryMaker.getInstance().setIntParam(this.currentpoint);
					FactoryMaker.getInstance().setOldMapPoint(items.get(itemindex).getPoints().get(currentpoint));
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
				if(currentpoint!=-1)
				{
					FactoryMaker.getInstance().setCurrentMapPoint(gp);
					FactoryMaker.getInstance().setIntParam(currentpoint);
					AbstractCommandFactory acf=FactoryMaker.getInstance().create(7);
					Ctrl.getInstance().execute(acf.create());
				}
				else if(dragndrop==true)
				{
					FactoryMaker.getInstance().setCurrentMapPoint(gp);
					AbstractCommandFactory acf=FactoryMaker.getInstance().create(1);
					Ctrl.getInstance().execute(acf.create());
				}
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
