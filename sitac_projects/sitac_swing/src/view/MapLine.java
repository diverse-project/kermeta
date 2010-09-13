package view;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import org.jdesktop.swingx.JXMapKit;
import org.jdesktop.swingx.JXMapViewer;
import org.jdesktop.swingx.mapviewer.GeoPosition;

public class MapLine extends MapItem{
    private List<MapPoint> points;
    private MapPoint selPoint;

    public MapLine()
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
        GeneralPath polyline=new GeneralPath(GeneralPath.WIND_EVEN_ODD,points.size());
        MapPoint gp;
        Point2D pt;
        for (int j=0;j<points.size();j++)
        {
            gp=points.get(j);
            pt = map.getTileFactory().geoToPixel(gp.getPoint(), map.getZoom());
            if (j==0)
                polyline.moveTo(pt.getX(),pt.getY());
            else
                polyline.lineTo(pt.getX(),pt.getY());
            if (j==points.size()-1 && points.size()>=2)
            {
            	Polygon poly=new Polygon();
            	GeoPosition gp1=points.get(points.size()-2).getPoint();
            	Point2D p1=map.getTileFactory().geoToPixel(gp1,map.getZoom());
            	double x1=p1.getX();
            	double y1=p1.getY();
            	GeoPosition gp2=points.get(points.size()-1).getPoint();
            	Point2D p2=map.getTileFactory().geoToPixel(gp2,map.getZoom());
            	double x2=p2.getX();
            	double y2=p2.getY();
            	double m1,m2;
            	double d=5;
            	if (x1-x2!=0 && y1-y2!=0)
            	{
            		m1=(y1-y2)/(x1-x2);
            		m2=-1/m1;
            		double x3=x2-Math.sqrt((d*d)/(1+m2*m2));
            		double y3=m2*(x3-x2)+y2;
            		double x4=x2+Math.sqrt((d*d)/(1+m2*m2));
            		double y4=m2*(x4-x2)+y2;
            		d=8;
            		double x5=x2-Math.sqrt((d*d)/(1+m1*m1));
            		double y5;
            		double x6=x2+Math.sqrt((d*d)/(1+m1*m1));
            		if (isBetween(x5,x1,x2,0.0f))
            		{
            			y5=m1*(x6-x2)+y2;
            			x5=x6;
            		}
            		else
            			y5=m1*(x5-x2)+y2;
            		poly.addPoint((int)x3, (int)y3);
            		poly.addPoint((int)x4, (int)y4);
            		poly.addPoint((int)x5, (int)y5);
            		
            	}
            	else 
            		if (x1-x2==0)
            		{
            			poly.addPoint((int)x2-5,(int)y2);
            			poly.addPoint((int)x2+5,(int)y2);
            			if (y1<y2)
            				poly.addPoint((int)x2,(int)y2+8);
            			else
            				poly.addPoint((int)x2,(int)y2-8);
            		}
            		else
            		{
            			poly.addPoint((int)x2,(int)y2-5);
            			poly.addPoint((int)x2,(int)y2+5);
            			if (x1<x2)
            				poly.addPoint((int)x2+8,(int)y2);
            			else
            				poly.addPoint((int)x2-8,(int)y2);
            		}
            	g.draw(poly);
        		g.fill(poly);
            }
        }
        g.draw(polyline);
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

    /**check if the point defined by x and y coordinates is on the line 
     (there is considered a small epsilon because the user probably won't click 
     exactly on the line)
     */
    public boolean findLine(JXMapKit map,double x,double y)
    {
        double epsilon=0.2f;
        for (int j=0;j<points.size()-1;j++)
        {
            Point2D pt1 = map.getMainMap().getTileFactory().geoToPixel(points.get(j).getPoint(), map.getMainMap().getZoom());
            Point2D pt2 = map.getMainMap().getTileFactory().geoToPixel(points.get(j + 1).getPoint(), map.getMainMap().getZoom());
            double x1 = pt1.getX();
            double x2 = pt2.getX();
            double y1 = pt1.getY();
            double y2 = pt2.getY();
            if (Math.abs(x2 - x1) < 20 * epsilon && Math.abs(x - x1) < 20 * epsilon && isBetween(y, y1, y2, epsilon)) {
                return true;
            }
            if (Math.abs(y2 - y1) < 20 * epsilon && Math.abs(y - y1) < 20 * epsilon && isBetween(x, x1, x2, epsilon)) {
                return true;
            }
            if (Math.abs((x - x1) / (x2 - x1) - (y - y1) / (y2 - y1)) < epsilon && isBetween(x, x1, x2, epsilon) && isBetween(y, y1, y2, epsilon)) {
                return true;
            }
        }
        return false;
    }

    private boolean isBetween(double x,double x1,double x2,double epsilon)
    {
        return (((x >= (x1 - 20 * epsilon)) && (x <= (x2 + 20 * epsilon)))
                || ((x >= (x2 - 20 * epsilon)) && (x <= (x1 + 20 * epsilon))));
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
