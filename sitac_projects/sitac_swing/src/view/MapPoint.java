/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import org.jdesktop.swingx.mapviewer.GeoPosition;

public class MapPoint {
    private double latitude;
    private double longitude;
    private GeoPosition point;

    public MapPoint(double lat,double long_)
    {
        point=new GeoPosition(lat,long_);
        latitude=lat;
        longitude=long_;
    }

    public MapPoint(GeoPosition gp)
    {
        point=gp;
        latitude=gp.getLatitude();
        longitude=gp.getLongitude();
    }

    public GeoPosition getPoint()
    {
        return point;
    }

    public double getLat()
    {
        return latitude;
    }

    public double getLong()
    {
        return longitude;
    }

    public void setPoint(GeoPosition gp)
    {
        point=gp;
        latitude=gp.getLatitude();
        longitude=gp.getLongitude();
    }
}
