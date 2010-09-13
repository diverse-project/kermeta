package control;

import java.util.ArrayList;
import java.util.List;

import org.jdesktop.swingx.mapviewer.GeoPosition;

import view.MapItem;
import view.MapItemPoint;
import view.MapLine;
import view.MapPoint;
import view.MapWidget;
import view.MapZone;
import view.Selectable;

/**This class represents the command receiver**/
public class Adapter {
	private MapWidget map;
	private List<InfoPosCtrl> posControl;
	private List<InfoLigneCtrl> lineControl;
	private List<InfoZoneCtrl> zoneControl;
	
	public Adapter(MapWidget map)
	{
		this.map = map;
		posControl = new ArrayList<InfoPosCtrl>();
		lineControl = new ArrayList<InfoLigneCtrl>();
		zoneControl = new ArrayList<InfoZoneCtrl>();
	}
	
	public void undoMoveItem(MapItem item, List<MapPoint> points)
	{
		List<MapPoint> p=item.getPoints();
		for (int i=0;i<points.size();i++)
		{
			MapPoint mp=points.get(i);
			GeoPosition gp=mp.getPoint();
			mp.setPoint(p.get(i).getPoint());
			p.get(i).setPoint(gp);
		}
		map.getMap().repaint();
		updatePosCtrl(item);
	}
	
	public void undoMovePoint(MapPoint oldPoint, MapPoint newPoint, MapItem item)
	{
		GeoPosition gp=oldPoint.getPoint();
		oldPoint.setPoint(newPoint.getPoint());
		newPoint.setPoint(gp);
		item.setPoint(newPoint);
		map.getMap().repaint();
		updatePosCtrl(item);
	}
	
	public void createItem(MapItem item)
	{
		createPosCtrl(item);
		map.addItem(item);
	}
	
	public void undoCreateItem(MapItem item)
	{
		map.removeItem(item);
	}
	
	public void redoCreateItem(MapItem item)
	{
		map.addItem(item);
	}
	
	public void removeItem(MapItem item)
	{
		map.removeItem(item);
	}
	
	public void undoRemoveItem(MapItem item)
	{
		map.addItem(item);
	}
	
	public void selectItem(Selectable sel, boolean b)
	{
		sel.setSelected(b);
		map.getMap().repaint();
	}
	
	public void sendMessage(String mess)
	{
		
	}
	
	public void receiveMessage(String mess)
	{
		
	}
	
	public void updateView()
	{
		
	}
	
	private void createPosCtrl(MapItem item)
	{
		List<MapPoint> points = item.getPoints();
		if (item instanceof MapLine)
			lineControl.add(new InfoLigneCtrl(points, (MapLine)item));
		else if (item instanceof MapZone)
			zoneControl.add(new InfoZoneCtrl(points, (MapZone)item));
		else
			posControl.add(new InfoPosCtrl(points.get(0).getLat(), points.get(0).getLong(), (MapItemPoint)item));
	}
	
	private void updatePosCtrl(MapItem item)
	{
		if (item instanceof MapZone)
		{
			for (int i=0; i<zoneControl.size(); i++)
				if (zoneControl.get(i).getView().equals(item))
				{
					List<MapPoint> points = item.getPoints();
					zoneControl.get(i).updatePosition(points);
					return;
				}
		}
		else if (item instanceof MapLine) 
		{
			for (int i=0; i<lineControl.size(); i++)
				if (lineControl.get(i).getView().equals(item))
				{
					List<MapPoint> points = item.getPoints();
					lineControl.get(i).updatePosition(points);
					return;
				}
		}
		else
			for (int i=0; i<posControl.size(); i++)
				if (posControl.get(i).getView().equals(item))
				{
					posControl.get(i).updatePosition(item.getPoints().get(0).getLat(), item.getPoints().get(0).getLong());
					return;
				}
	}
}	

