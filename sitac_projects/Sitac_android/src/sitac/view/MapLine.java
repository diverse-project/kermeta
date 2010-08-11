package sitac.view;

import java.util.ArrayList;

import org.andnav.osm.views.OpenStreetMapView;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

public class MapLine extends MapItem{
	
	public MapLine()
	{
		super();
	}
	
	public void addPoints(ArrayList<MapPoint> gps)
	{
		this.points.addAll(gps);
	}
	
	public void draw(Canvas canvas, OpenStreetMapView mapview) 
	{
		int size=this.points.size();
		Paint paint=new Paint();
		paint.setColor(this.color);
		paint.setStrokeWidth(3);
		
		for(int i=0;i<size-1;i++)
		{
		    Point p1=mapview.getProjection().toMapPixels(this.points.get(i).toGeoPoint(), null);
			Point p2=mapview.getProjection().toMapPixels(this.points.get(i+1).toGeoPoint(),null);
			canvas.drawLine(p1.x, p1.y, p2.x, p2.y, paint);
			
			if(this.isSelected==true)
			{
				canvas.drawCircle(p1.x, p1.y, 3, paint);
				canvas.drawCircle(p2.x, p2.y, 3, paint);
			}
			
		}	
	}
}
