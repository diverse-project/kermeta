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
	
	@Override
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
			
			//-------------Drawing the arrow tip-------------	
			if(i==size-2)
			{
				double sin=(Math.sqrt(2))/2;
				double cos=(Math.sqrt(2))/2;

				double xp=p1.x*cos-p1.y*sin-p2.x*cos+p2.y*sin+p2.x;
				double yp=p1.x*sin+p1.y*cos-p2.x*sin-p2.y*cos+p2.y;
				double xk=xp/10+9*p2.x/10;
				double yk=yp/10+9*p2.y/10;
				canvas.drawLine(p2.x, p2.y, (float)xk, (float)yk, paint);

				xp=p1.x*cos+p1.y*sin-p2.x*cos-p2.y*sin+p2.x;
				yp=(-1)*p1.x*sin+p1.y*cos+p2.x*sin-p2.y*cos+p2.y;
				xk=xp/10+9*p2.x/10;
				yk=yp/10+9*p2.y/10;
				canvas.drawLine(p2.x, p2.y, (float)xk, (float)yk, paint);
			}
			//--------------------------
		}	
	}
}
