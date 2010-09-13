package view;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.MouseInputAdapter;

import org.jdesktop.swingx.JXMapKit;
import org.jdesktop.swingx.JXMapViewer;
import org.jdesktop.swingx.mapviewer.DefaultTileFactory;
import org.jdesktop.swingx.mapviewer.GeoPosition;
import org.jdesktop.swingx.mapviewer.TileFactory;
import org.jdesktop.swingx.mapviewer.TileFactoryInfo;
import org.jdesktop.swingx.painter.CompoundPainter;
import org.jdesktop.swingx.painter.Painter;

import control.AbstractCommandFactory;
import control.Adapter;
import control.Command;
import control.Ctrl;
import control.FactoryMaker;

public class MapWidget {
	private int actualZoomLevel;
	private double actualLat;
	private double actualLong;
	private JXMapKit map;
	private List<MapItem> shapes;
	private Painter<JXMapViewer> shapePainter;
	private MapItem selected;
	private boolean drawShape = false;
	private boolean drawLine = false;
	private boolean drawBrush = false;
	private Color color;
	private static final Color defaultColor = Color.red;
	private FactoryMaker factoryMaker;
	private AbstractCommandFactory factory;
	private Ctrl controller;
	private MapItem currentItem;

	private static final int CREATE_ITEM = 0;
	private static final int MOVE_ITEM = 1;
	private static final int SELECT_ITEM = 3;
	private static final int MOVE_POINT = 6;
	private static final int REMOVE_ITEM = 7;

	public MapWidget(int zoom, double lat, double long_, Ctrl c) {
		actualZoomLevel = zoom;
		actualLat = lat;
		actualLong = long_;
		map = new JXMapKit();
		shapes = new ArrayList<MapItem>();
		final int max = 18;
		TileFactoryInfo info = new TileFactoryInfo(0, max - 2, max, 256, true,
				true, "http://tile.openstreetmap.org", "x", "y", "z") {

			@Override
			public String getTileUrl(int x, int y, int zoom) {
				zoom = max - zoom;
				String url = this.baseURL + "/" + zoom + "/" + x + "/" + y
						+ ".png";
				return url;
			}
		};
		TileFactory tf = new DefaultTileFactory(info);
		map.setTileFactory(tf);
		map.setZoom(actualZoomLevel);
		map.setAddressLocation(new GeoPosition(actualLat, actualLong));
		map.setMiniMapVisible(false);
		map.setAddressLocationShown(false);
		MouseInputAdapter listener = new MapListener();
		map.getMainMap().addMouseListener(listener);
		map.getMainMap().addMouseMotionListener(listener);
		DragHandler handler = new DragHandler();
		handler.setMap(this);
		map.getMainMap().setTransferHandler(handler);
		addPainters();

		controller = c;
		Adapter adapter = new Adapter(this);
		factoryMaker = new FactoryMaker(adapter);
	}

	public JXMapKit getMap() {
		return map;
	}

	public void setColor(Color c) {
		color = c;
	}

	public void setDrawLineMode(boolean b) {
		drawLine = b;
		if (drawLine)
		{
			currentItem = new MapLine();
			if (color!=null)
				currentItem.setColor(color);
			else
				currentItem.setColor(defaultColor);
		}
	}

	public void setDrawZoneMode(boolean b) {
		drawShape = b;
		if (drawShape)
		{
			currentItem = new MapZone();
			if (color!=null)
				currentItem.setColor(color);
			else
				currentItem.setColor(defaultColor);
		}
	}

	public void setDrawBrushMode(boolean b) {
		drawBrush = b;
	}
	
	public void removeItem(String type)
	{
		if (type.equals("line") && selected instanceof MapLine ||
			type.equals("zone") && selected instanceof MapZone ||
			type.equals("item point") && selected instanceof MapItemPoint)
			{
				factoryMaker.setMapItem(selected);
				factory=factoryMaker.create(REMOVE_ITEM);
				Command cmd=factory.create();
				controller.execute(cmd);
				map.repaint();
			}
	}
	
	public MapItem moveItem()
	{
		return selected;
	}

	public void addItem(Point p, Rectangle r, Color c, Line2D.Float[] lines, String desc) {
		Rectangle rect = map.getMainMap().getViewportBounds();
		Point p1 = new Point(Math.abs(p.x + rect.x), Math.abs(p.y + rect.y));
		GeoPosition gp = map.getMainMap().getTileFactory().pixelToGeo(p1,
				map.getMainMap().getZoom());
		MapPoint mp = new MapPoint(gp);
		MapItemPoint item = new MapItemPoint(mp);
		factoryMaker.setMapItem(item);
		factory=factoryMaker.create(CREATE_ITEM);
		Command cmd=factory.create();
		controller.execute(cmd);
		item.setDesc(desc);
		Shape[] s = new Shape[lines.length + 1];
		s[0] = r;
		for (int i = 0; i < lines.length; i++)
			s[i + 1] = lines[i];
		item.setShapes(s);
		item.setColor(c);
		map.repaint();
	}
	
	public void addItem(MapItem item)
	{
		shapes.add(item);
		map.repaint();
	}
	
	public void removeItem(MapItem item)
	{
		shapes.remove(item);
		map.repaint();
	}

	@SuppressWarnings("unchecked")
	private void addPainters() {
		addShapePainter();
		CompoundPainter cp = new CompoundPainter();
		cp.setPainters(shapePainter);
		cp.setCacheable(false);
		map.getMainMap().setOverlayPainter(cp);
	}

	private void addShapePainter() {
		shapePainter = new Painter<JXMapViewer>() {

			public void paint(Graphics2D g, JXMapViewer map, int w, int h) {
				g = (Graphics2D) g.create();
				Rectangle rect = map.getViewportBounds();
				g.translate(-rect.x, -rect.y);
				for (int i = 0; i < shapes.size(); i++) {
					MapItem item = shapes.get(i);
					item.render(g, map);
				}
				if (currentItem != null)
					currentItem.render(g, map);
				g.dispose();
			}
		};
	}

	class MapListener extends MouseInputAdapter {
		private Point point;
		private boolean itemMoved=false;
		private boolean pointMoved=false;

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2 && drawShape) {
				((MapZone)currentItem).removeLastPoint();
				factoryMaker.setMapItem(currentItem);
				factory=factoryMaker.create(CREATE_ITEM);
				Command cmd=factory.create();
				controller.execute(cmd);
				controller.endDrawZone();
				drawShape = false;
				currentItem = null;
				map.repaint();
			} else if (drawShape) {
				int x = e.getX();
				int y = e.getY();
				Rectangle rect = map.getMainMap().getViewportBounds();
				Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
				((MapZone)currentItem).addPoint(new MapPoint(map.getMainMap()
						.getTileFactory().pixelToGeo(p,
								map.getMainMap().getZoom())));
			} else if (e.getClickCount() == 2 && drawLine) {
				((MapLine)currentItem).removeLastPoint();
				factoryMaker.setMapItem(currentItem);
				factory=factoryMaker.create(CREATE_ITEM);
				Command cmd=factory.create();
				controller.execute(cmd);
				controller.endDrawLine();
				drawLine = false;
				currentItem = null;
				map.repaint();
			} else if (drawLine) {
				int x = e.getX();
				int y = e.getY();
				Rectangle rect = map.getMainMap().getViewportBounds();
				Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
				((MapLine)currentItem).addPoint(new MapPoint(map.getMainMap()
						.getTileFactory().pixelToGeo(p,
								map.getMainMap().getZoom())));
			}
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			if (drawLine) { 
				if (currentItem.size() > 0)
				{
					if (currentItem.size() > 1) 
						((MapLine)currentItem).removeLastPoint();
					int x = e.getX();
					int y = e.getY();
					Rectangle rect = map.getMainMap().getViewportBounds();
					Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
					((MapLine)currentItem).addPoint(new MapPoint(map.getMainMap()
							.getTileFactory().pixelToGeo(p,
									map.getMainMap().getZoom())));
					map.repaint();
				}
			} else if (drawShape) { 
				if (currentItem.size() > 0) 
				{
					if (currentItem.size() > 1) 
						((MapZone)currentItem).removeLastPoint();
					int x = e.getX();
					int y = e.getY();
					Rectangle rect = map.getMainMap().getViewportBounds();
					Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
					((MapZone)currentItem).addPoint(new MapPoint(map.getMainMap()
							.getTileFactory().pixelToGeo(p,
									map.getMainMap().getZoom())));
					map.repaint();
				}
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			if (!drawLine && !drawShape)
			{
				int x = e.getX();
				int y = e.getY();
				Rectangle rect = map.getMainMap().getViewportBounds();
				Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
				GeoPosition gp = map.getMainMap().getTileFactory().pixelToGeo(p,
						map.getMainMap().getZoom());
				MapItem sel = getItem(gp);
				if (sel != null)
				if (selected != null)
				{
					if (!selected.equals(sel))
					{
						selected.setSelected(false);
						selected=sel;
						point = p;
						selected.setPoint(map, gp);
						factoryMaker.setSelectable(selected);
						factory = factoryMaker.create(SELECT_ITEM);
						controller.execute(factory.create());
						factoryMaker.setMapItem(selected);
						factoryMaker.setPoints(selected.getPoints());
						if (selected.isPointSelected())
							factoryMaker.setOldPoint(new MapPoint(selected.getSelectedPoint().getPoint()));
						map.repaint();
					}
					else 
						if (!selected.isSelected())
						{
							point = p;
							selected.setSelected(true);
							selected.setPoint(map, gp);
							if (selected.isPointSelected())
								factoryMaker.setOldPoint(new MapPoint(selected.getSelectedPoint().getPoint()));
							map.repaint();
						}
						else
						{
							point = p;
							selected.setPoint(map, gp);
							factoryMaker.setPoints(selected.getPoints());
							factoryMaker.setMapItem(selected);
							if (selected.isPointSelected())
								factoryMaker.setOldPoint(new MapPoint(selected.getSelectedPoint().getPoint()));
							map.repaint();
						}
				}
				else
				{
					selected = sel;
					if (selected != null)
					{
						point = p;
						selected.setPoint(map, gp);
						factoryMaker.setSelectable(selected);
						factory = factoryMaker.create(SELECT_ITEM);
						controller.execute(factory.create());
						factoryMaker.setMapItem(selected);
						factoryMaker.setPoints(selected.getPoints());
						if (selected.isPointSelected())
							factoryMaker.setOldPoint(new MapPoint(selected.getSelectedPoint().getPoint()));
						map.repaint();
					}
				}
				else if (selected!=null)
				{
					selected.setSelected(false);
					selected=null;
					map.repaint();
				}
			}
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			if (selected != null) {
				if (selected.isPointSelected())
				{
					pointMoved=true;
					map.getMainMap().setPanEnabled(false);
					int x = e.getX();
					int y = e.getY();
					Rectangle rect = map.getMainMap().getViewportBounds();
					Point p = new Point(Math.abs(x + rect.x), Math.abs(y
							+ rect.y));
					GeoPosition gp = map.getMainMap().getTileFactory()
							.pixelToGeo(p, map.getMainMap().getZoom());
					selected.setPoint(new MapPoint(gp));
					map.repaint();
				}
				else
				{
					itemMoved=true;
					map.getMainMap().setPanEnabled(false);
					int x = e.getX();
					int y = e.getY();
					Rectangle rect = map.getMainMap().getViewportBounds();
					Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
					int deltax = p.x - point.x;
					int deltay = p.y - point.y;
					point = p;
					selected.move(map, deltax, deltay);
					map.repaint();
				}
			} else if (drawBrush) {
				map.getMainMap().setPanEnabled(false);
				int x = e.getX();
				int y = e.getY();
				Rectangle rect = map.getMainMap().getViewportBounds();
				Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
				GeoPosition gp = map.getMainMap().getTileFactory().pixelToGeo(
						p, map.getMainMap().getZoom());
				MapPoint mp = new MapPoint(gp);
				MapItemPoint item = new MapItemPoint(mp);
				factoryMaker.setMapItem(item);
				factory=factoryMaker.create(CREATE_ITEM);
				Command cmd=factory.create();
				controller.execute(cmd);
				if (color != null)
					item.setColor(color);
				else
					item.setColor(defaultColor);
				Shape[] s = new Ellipse2D.Float[] { new Ellipse2D.Float(0, 0, 20, 20) };
				item.setShapes(s);
				map.repaint();
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			map.getMainMap().setPanEnabled(true);
			if (selected != null && itemMoved)
			{
				itemMoved=false;
				factory = factoryMaker.create(MOVE_ITEM);
				Command cmd = factory.create();
				controller.execute(cmd);
			}
			else
				if (selected != null && pointMoved)
				{
					pointMoved=false;
					factoryMaker.setNewPoint(selected.getSelectedPoint());
					factory=factoryMaker.create(MOVE_POINT);
					Command cmd=factory.create();
					controller.execute(cmd);
				}
		}

		private MapItem getItem(GeoPosition gp) {
			Point2D pt = map.getMainMap().getTileFactory().geoToPixel(gp,
					map.getMainMap().getZoom());
			double x = pt.getX();
			double y = pt.getY();
			for (int i = 0; i < shapes.size(); i++) {
				MapItem item = shapes.get(i);
				if (item instanceof MapLine) {
					MapLine line = (MapLine) item;
					if (line.findLine(map, x, y))
						return line;
				} else if (item instanceof MapZone) {
					MapZone shape = (MapZone) item;
					if (shape.findZone(pt))
						return item;
				} else {
					MapItemPoint itemPoint = (MapItemPoint) item;
					if (itemPoint.findItem(map, pt))
						return item;
				}
			}
			return null;
		}
	}
}
