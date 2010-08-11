package control;

import java.util.List;

import org.jdesktop.swingx.mapviewer.GeoPosition;

import view.MapItem;
import view.MapItemPoint;
import view.MapLine;
import view.MapPoint;
import view.MapWidget;
import view.MapZone;
import view.Selectable;

public class Adapter {
	private MapWidget map;
	
	public Adapter(MapWidget map)
	{
		this.map=map;
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
	}
	
	public void undoMovePoint(MapPoint oldPoint, MapPoint newPoint)
	{
		GeoPosition gp=oldPoint.getPoint();
		oldPoint.setPoint(newPoint.getPoint());
		newPoint.setPoint(gp);
		map.getMap().repaint();
	}
	
	public MapItem createItem(String itemType)
	{
		MapItem item;
		if (itemType.equals("item point"))
			item = new MapItemPoint();
		else if (itemType.equals("line"))
			item = new MapLine();
		else
			item = new MapZone();
		map.addItem(item);
		return item;
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
}
