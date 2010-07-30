package sitac.view;

import org.andnav.osm.views.OpenStreetMapView;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;

public class MapZone extends MapItem{

	private static final int nopoints=20;
	
	public MapZone() {
		super();
	}

	public void addPoint(MapPoint gp)
	{
		if(this.points.size()<MapZone.nopoints)
			this.points.add(gp);
	}
	
	public void draw(Canvas canvas, OpenStreetMapView mapview) 
	{
		int size=this.points.size();
		Paint paint=new Paint();
		paint.setColor(this.color);
		paint.setStrokeWidth(3);
		
		Path path=new Path();
		if(size>0)
		{
		Point p1=mapview.getProjection().toMapPixels(this.points.get(0).toGeoPoint(), null);
		path.moveTo(p1.x, p1.y);
		
		for(int i=0;i<size-1;i++)
		{		    
			Point p=mapview.getProjection().toMapPixels(this.points.get(i).toGeoPoint(), null);
			Point p2=mapview.getProjection().toMapPixels(this.points.get(i+1).toGeoPoint(),null);
			path.lineTo(p2.x, p2.y);
			
			canvas.drawLine(p.x, p.y, p2.x, p2.y, paint);
			
			if(this.isSelected==true)
			{
				paint.setColor(Color.BLACK);
				canvas.drawCircle(p1.x, p1.y, 2, paint);
				canvas.drawCircle(p2.x, p2.y, 2, paint);
			}
			
		}
		
		//path.setFillType(Path.FillType.EVEN_ODD);
		path.close();
		canvas.drawPath(path, paint);
		}
	}
}
