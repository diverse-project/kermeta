package sitac.view;

import org.andnav.osm.views.OpenStreetMapView;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public class MapItemPoint extends MapItem{

	private static final int nopoints=1;
	
	protected MapPoint pos;

	public MapItemPoint()
	{
	  super();
	}
	
	public MapItemPoint(MapPoint newPos)
	{
		this();
		pos=newPos;
		points.add(pos);
	}

	public MapPoint getPos()
	{
		return pos;
	}

	@Override
	public void addPoint(MapPoint gp)
	{
		if(this.points.size()<MapItemPoint.nopoints)
			this.points.add(gp);
		
		pos=points.get(0);
	}
	
	public void setPos(MapPoint newPos)
	{
		pos = newPos;
		points.remove(0);
		points.add(pos);
	}

	@Override
	public void draw(Canvas canvas, OpenStreetMapView mapview) 
	{
		Paint paint=new Paint();
		paint.setColor(color);
		if(points.size()!=0)
		{
			pos=points.get(0);
			Point p1=mapview.getProjection().toMapPixels(this.pos.toGeoPoint(), null);
			canvas.drawCircle(p1.x, p1.y, 2, paint);		
			if(isSelected()==true)
			{
				canvas.drawCircle(p1.x, p1.y, 3, paint);
			}
		}
	}
}
