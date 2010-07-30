/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import org.jdesktop.swingx.JXMapKit;
import org.jdesktop.swingx.JXMapViewer;


public abstract class MapItem {

    public abstract GeneralPath render(JXMapViewer map);
    public abstract void drawCorners(Graphics2D g,JXMapViewer map);
    public abstract MapItem move(JXMapKit map,int deltax,int deltay);
    public abstract void movePoint(MapPoint gp);

}
