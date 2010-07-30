/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Graphics2D;
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

    public void removeLastPoint()
    {
        points.remove(points.size()-1);
    }

    public int size()
    {
        return points.size();
    }

    public GeneralPath render(JXMapViewer map)
    {
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
            if (j==points.size()-1)
            {

            }
        }
        return polyline;
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

    public MapItem move(JXMapKit map,int deltax,int deltay)
    {
        MapLine newLine=new MapLine();
        for (int i=0;i<points.size();i++)
        {
            MapPoint gp1 = points.get(i);
            Point2D pt = map.getMainMap().getTileFactory().geoToPixel(gp1.getPoint(), map.getMainMap().getZoom());
            Point2D.Double p1 = new Point2D.Double(pt.getX() + deltax, pt.getY() + deltay);
            gp1.setPoint(map.getMainMap().getTileFactory().pixelToGeo(p1, map.getMainMap().getZoom()));
            newLine.addPoint(gp1);
        }
        return newLine;
    }

    public void movePoint(MapPoint gp)
    {
        if (points.contains(selPoint))
        {
        int ind=points.indexOf(selPoint);
        points.remove(selPoint);
        selPoint = gp;
        points.add(ind, selPoint);
        }
    }

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

    public void setLinePoint(JXMapKit map,GeoPosition gp)
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
