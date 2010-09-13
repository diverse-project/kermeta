package control;

import model.InfoPos;
import view.MapItemPoint;

public class InfoPosCtrl {
	private InfoPos model;
	private MapItemPoint view;
	
	public InfoPosCtrl(double lat, double lon, MapItemPoint view)
	{
		model = new InfoPos(lat, lon);
		this.view = view;
		
	}
	
	public MapItemPoint getView()
	{
		return view;
	}
	
	public void updatePosition(double lat, double lon)
	{
		model.setPosition(lat, lon);
	}
}
