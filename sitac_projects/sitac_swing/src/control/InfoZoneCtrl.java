package control;

import java.util.ArrayList;
import java.util.List;

import model.InfoZonePos;
import model.Position;
import model.PositionGPS;
import view.MapPoint;
import view.MapZone;

public class InfoZoneCtrl {
	private InfoZonePos model;
	private MapZone view;
	
	public InfoZoneCtrl(List<MapPoint> points, MapZone view)
	{
		model = new InfoZonePos("name");
		for (int i=0; i<points.size(); i++)
			model.addPosition(points.get(i).getLat(), points.get(i).getLong());
		this.view = view;
	}
	
	public MapZone getView()
	{
		return view;
	}
	
	public void updatePosition(List<MapPoint> points)
	{
		List<Position> pos = new ArrayList<Position>();
		for (int i=0; i<points.size(); i++)
			pos.add(new PositionGPS(points.get(i).getLat(), points.get(i).getLong()));
		model.setPositions(pos);
	}
}
