package sitac.view;

import org.andnav.osm.views.overlay.OpenStreetMapViewOverlayItem;

import android.graphics.drawable.Drawable;

public class MyOverlayItem extends OpenStreetMapViewOverlayItem {
	
	private boolean selected=false;
	private ItemType itemtype;
	private MapPoint mMapPoint;

	public MyOverlayItem(String title, String description, MapPoint MapPoint) {
		super(title, description, MapPoint.toGeoPoint());
		this.mMapPoint=MapPoint;
		this.itemtype=new ItemType();
		// TODO Auto-generated constructor stub
	}
	
	public MyOverlayItem(ItemType item,MapPoint mappoint)
	{
		super(item.getTitle(), item.getDescription(), mappoint.toGeoPoint());
		this.mMapPoint=mappoint;
		this.itemtype=item;
	}
	
	public void setPosition(MapPoint point)
	{
		this.mMapPoint.setLatitudeE6(point.getLatitudeE6());
		this.mMapPoint.setLongitudeE6(point.getLongitudeE6());
		this.mGeoPoint.setLatitudeE6(point.getLatitudeE6());
		this.mGeoPoint.setLongitudeE6(point.getLongitudeE6());
	}
	
	public MapPoint getPosition()
	{
		return this.mMapPoint;
	}
	
	public boolean isSelected()
	{
		return this.selected;
	}
	
	public void setSelected(boolean sel)
	{
		this.selected=sel;
	}
	
	public void setMarker(Drawable m)
	{
		this.itemtype.setIcon(m);
	}
	
	public Drawable getMarker()
	{
		return this.itemtype.getIcon();
	}

	public int getType()
	{
		return this.itemtype.getType();
	}
	
	
	public int getGroup()
	{
		return this.itemtype.getGroup();
	}
	
	public void setItemType(ItemType item)
	{
		itemtype=item;
	}
	
	public String getDescription()
	{
		return itemtype.getDescription();
	}
	
	public String getTitle()
	{
		return itemtype.getTitle();
	}
}
