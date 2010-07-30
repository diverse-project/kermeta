/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import org.jdesktop.swingx.JXMapKit;
import org.jdesktop.swingx.JXMapViewer;
import org.jdesktop.swingx.mapviewer.GeoPosition;
import org.jdesktop.swingx.mapviewer.Waypoint;

public class MapItemPoint extends MapItem{
    private MapPoint pos;
    private Waypoint point;

    public MapItemPoint(MapPoint p)
    {
        pos=p;
        point=new Waypoint(pos.getPoint());
    }
    
    public GeoPosition getPosition()
    {
        return point.getPosition();
    }

    public void setPosition(MapPoint p)
    {
        pos=p;
        point.setPosition(pos.getPoint());
    }

    @Override
    public GeneralPath render(JXMapViewer map) {
        return null;
    }

    @Override
    public void drawCorners(Graphics2D g, JXMapViewer map) {

    }

    @Override
    public MapItem move(JXMapKit map, int deltax, int deltay) {
        return null;
    }

    @Override
    public void movePoint(MapPoint gp) {
        pos=gp;
        point.setPosition(pos.getPoint());
    }

}
