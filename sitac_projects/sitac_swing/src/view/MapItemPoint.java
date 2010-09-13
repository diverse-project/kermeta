package view;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import org.jdesktop.swingx.JXMapKit;
import org.jdesktop.swingx.JXMapViewer;
import org.jdesktop.swingx.mapviewer.GeoPosition;

public class MapItemPoint extends MapItem{
    private MapPoint pos;
    private Shape[] shapes;
    private String desc;

    public MapItemPoint()
    {
    }
    
    public MapItemPoint(MapPoint p)
    {
        pos=p;
    }
    
    public MapItemPoint(MapPoint p, String desc)
    {
    	this(p);
    	this.desc = desc;
    }
    
    public void setDesc(String desc)
    {
    	this.desc = desc;
    }
    
    public String getDesc()
    {
    	return desc;
    }
    
    public GeoPosition getPosition()
    {
    	return pos.getPoint();
    }
    
    public MapPoint getSelectedPoint()
    {
    	return pos;
    }
    
    public void setShapes(Shape[] s)
    {
    	shapes=s;
    }

    @Override
    public void render(Graphics2D g,JXMapViewer map) {
    	if (isSelected())
    		g.setColor(selectedColor);
    	else
    		g.setColor(color);
    	g.setFont(new Font("font",Font.BOLD,12));
    	Point2D p=map.getTileFactory().geoToPixel(pos.getPoint(), map.getZoom());
    	g.translate((int)p.getX()-shapes[0].getBounds().width/2,(int)p.getY()-shapes[0].getBounds().height/2);
        for (int i=0;i<shapes.length;i++)	
        {
        	g.draw(shapes[i]);
        	if (desc == null)
        		g.fill(shapes[i]);
        }
        if (desc != null)
        	g.drawString(desc, 5,20);
        g.translate(-(int)p.getX()+shapes[0].getBounds().width/2,-(int)p.getY()+shapes[0].getBounds().height/2);
    }

    @Override
    public void drawCorners(Graphics2D g, JXMapViewer map) {
    	
    }

    @Override
    public void move(JXMapKit map, int deltax, int deltay) {
    }

    @Override
    public void setPoint(MapPoint p) {
        pos=p;
    }
    
    public void setPoints(List<MapPoint> points)
    {
    	MapPoint mp=new MapPoint(points.get(0).getPoint());
    	pos=mp;
    }
    
    public List<MapPoint> getPoints()
    {
    	List<MapPoint> p=new ArrayList<MapPoint>();
    	p.add(new MapPoint(pos.getPoint()));
    	return p;
    }
    
    public boolean findItem(JXMapKit map, Point2D pt)
    {
    	GeoPosition gp = pos.getPoint();
    	Point2D pt1 = map.getMainMap().getTileFactory().geoToPixel(gp,
				map.getMainMap().getZoom());
    	return pt1.distance(pt)<20;
    }
}
