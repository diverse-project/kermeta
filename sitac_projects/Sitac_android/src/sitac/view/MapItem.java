package sitac.view;

import java.util.ArrayList;

import org.andnav.osm.views.OpenStreetMapView;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;

public class MapItem extends Selectable{

	protected ArrayList<MapPoint> points;
	protected int color;
	
	public MapItem()
	{
		super();
		isSelected=false;
		color=Color.BLACK;
		points=new ArrayList<MapPoint>();
	}
	
	public void setColor(int col)
	{
		color=col;
	}
	
	public int getColor()
	{
		return this.color;
	}
	
	public void draw(Canvas canvas, OpenStreetMapView mapview)
	{
		Paint paint=new Paint();
		paint.setColor(this.color);
		paint.setStrokeWidth(3);
	}
	
	public void addPoint(MapPoint mp)
	{
		this.points.add(mp);
	}
	public ArrayList<MapPoint> getPoints()
	{
		return this.points;
	}
	
	public int pointClicked(MapPoint mp,OpenStreetMapView mapview)
	{
		int ok=-1;
		int size=points.size();
		for(int j=0;j<size;j++)
		{
			Point p1=mapview.getProjection().toMapPixels(mp.toGeoPoint(), null);
			Point p2=mapview.getProjection().toMapPixels(points.get(j).toGeoPoint(), null);
			if((Math.abs(p1.x-p2.x)<=2)&&(Math.abs(p1.y-p2.y)<=2))
			{
				ok=j;
				break;
			}
		}
		return ok;
	}
	
	public boolean isSelectedDragnDrop(MapPoint mp,OpenStreetMapView mapview)
	{
		boolean ok=false;
		int size=points.size();
		for(int j=0;j<size;j++)
		{
			Point p1=mapview.getProjection().toMapPixels(mp.toGeoPoint(), null);
			Point p2=mapview.getProjection().toMapPixels(points.get(j).toGeoPoint(), null);
			if((Math.abs(p1.x-p2.x)<=10)&&(Math.abs(p1.y-p2.y)<=10))
			{
				ok=true;
				break;
			}
		}
		return ok;
	}
}
