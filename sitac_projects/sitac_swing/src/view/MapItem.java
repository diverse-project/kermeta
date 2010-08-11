/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;

import org.jdesktop.swingx.JXMapKit;
import org.jdesktop.swingx.JXMapViewer;
import org.jdesktop.swingx.mapviewer.GeoPosition;


public abstract class MapItem extends Selectable {
	protected Color color;
	protected static final Color selectedColor = new Color(255,100,0);
	
    public abstract void render(Graphics2D g,JXMapViewer map);
    public abstract void drawCorners(Graphics2D g,JXMapViewer map);
    public abstract void move(JXMapKit map,int deltax,int deltay);
    public abstract void setPoint(MapPoint gp);
    public void setPoint(JXMapKit map, GeoPosition gp){};
    public abstract MapPoint getSelectedPoint();
    public abstract List<MapPoint> getPoints();
    public abstract void setPoints(List<MapPoint> points);
    public boolean isPointSelected()
    {
    	return true;
    }
    public int size()
    {
    	return 1;
    }
    public void setColor(Color c)
    {
    	color=c;
    }
    
    public Color getColor()
    {
    	return color;
    }

}
