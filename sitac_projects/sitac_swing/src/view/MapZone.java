/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import org.jdesktop.swingx.JXMapKit;
import org.jdesktop.swingx.JXMapViewer;
import org.jdesktop.swingx.mapviewer.GeoPosition;

public class MapZone extends MapItem{
    private List<MapPoint> points;
    private MapPoint selPoint;
    private GeneralPath shapePath;
    protected static final Color selectedColor = new Color(255,100,0,100);

    public MapZone()
    {
        points=new ArrayList<MapPoint>();
    }

    public void addPoint(MapPoint p)
    {
        points.add(p);
    }
    
    public void setPoints(List<MapPoint> p)
    {
    	points=new ArrayList<MapPoint>();
    	for (int i=0;i<p.size();i++)
    	{
    		MapPoint mp=new MapPoint(p.get(i).getPoint());
    		points.add(mp);
    	}
    }
    
    public List<MapPoint> getPoints()
    {
    	return points;
    }
    
    public void setColor(Color c)
    {
    	color=new Color(c.getRed(),c.getGreen(),c.getBlue(),100);
    }

    public void removeLastPoint()
    {
        points.remove(points.size()-1);
    }

    public int size()
    {
        return points.size();
    }

    public void render(Graphics2D g,JXMapViewer map)
    {
    	if (isSelected())
    	{
    		g.setColor(selectedColor);
    		drawCorners(g,map);
    	}
    	else
    		g.setColor(color);
        GeneralPath polygon=new GeneralPath(GeneralPath.WIND_EVEN_ODD,points.size());
        MapPoint gp;
        Point2D pt;
        if (points.size() > 0)
        {
	        for (int j=0;j<points.size();j++)
	        {
	            gp = points.get(j);
	            pt = map.getTileFactory().geoToPixel(gp.getPoint(), map.getZoom());
	            if (j == 0) {
	                polygon.moveTo(pt.getX(), pt.getY());
	            } else {
	                polygon.lineTo(pt.getX(), pt.getY());
	            }
	        }
	        polygon.closePath();
			g.draw(polygon);
			g.fill(polygon);
			shapePath=polygon;
        }
    }

    public void drawCorners(Graphics2D g,JXMapViewer map)
    {
        MapPoint gp;
        Point2D pt;
        for (int j=0;j<points.size();j++)
        {
            gp=points.get(j);
            pt = map.getTileFactory().geoToPixel(gp.getPoint(), map.getZoom());
            g.fillOval((int)pt.getX()-5,(int)pt.getY()-5,10,10);
        }
    }

    public void move(JXMapKit map,int deltax,int deltay)
    {
    	for (int i=0;i<points.size();i++)
        {
            MapPoint gp1 = points.get(i);
            Point2D pt = map.getMainMap().getTileFactory().geoToPixel(gp1.getPoint(), map.getMainMap().getZoom());
            Point2D.Double p1 = new Point2D.Double(pt.getX() + deltax, pt.getY() + deltay);
            gp1.setPoint(map.getMainMap().getTileFactory().pixelToGeo(p1, map.getMainMap().getZoom()));       
        }
    }

    public void setPoint(MapPoint gp)
    {
        if (points.contains(selPoint))
        	selPoint.setPoint(gp.getPoint());
    }
    
    public MapPoint getSelectedPoint()
    {
    	return selPoint;
    }
    
    public boolean findZone(Point2D pt)
    {
    	return shapePath.contains(pt);
    }

    public void setPoint(JXMapKit map,GeoPosition gp)
    {
        Point2D pt = map.getMainMap().getTileFactory().geoToPixel(gp, map.getMainMap().getZoom());
        for (int i = 0; i < points.size(); i++) {
            MapPoint gp1 = points.get(i);
            Point2D pt1 = map.getMainMap().getTileFactory().geoToPixel(gp1.getPoint(), map.getMainMap().getZoom());
            if (Point2D.distance(pt.getX(), pt.getY(), pt1.getX(), pt1.getY()) < 10) {
                {
                    selPoint=gp1;
                    return;
                }
            }
        }
        selPoint=null;
    }

    public boolean isPointSelected()
    {
        return (selPoint!=null);
    }
}
