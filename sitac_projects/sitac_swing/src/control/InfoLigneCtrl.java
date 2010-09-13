package control;

import java.util.ArrayList;
import java.util.List;

import model.InfoLignePos;
import model.Position;
import model.PositionGPS;
import view.MapLine;
import view.MapPoint;

public class InfoLigneCtrl {
	private InfoLignePos model;
	private MapLine view;
	
	public InfoLigneCtrl(List<MapPoint> points, MapLine view)
	{
		model = new InfoLignePos();
		for (int i=0; i<points.size(); i++)
			model.addPosition(points.get(i).getLat(), points.get(i).getLong());
		this.view = view;
	}
	
	public MapLine getView()
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
