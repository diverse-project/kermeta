package view;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.TransferHandler;
import javax.swing.event.MouseInputAdapter;

import org.jdesktop.swingx.JXMapKit;
import org.jdesktop.swingx.JXMapViewer;
import org.jdesktop.swingx.mapviewer.DefaultTileFactory;
import org.jdesktop.swingx.mapviewer.GeoPosition;
import org.jdesktop.swingx.mapviewer.TileFactory;
import org.jdesktop.swingx.mapviewer.TileFactoryInfo;
import org.jdesktop.swingx.mapviewer.Waypoint;
import org.jdesktop.swingx.mapviewer.WaypointPainter;
import org.jdesktop.swingx.mapviewer.WaypointRenderer;
import org.jdesktop.swingx.painter.CompoundPainter;
import org.jdesktop.swingx.painter.Painter;

public class MapWidget /*extends DragTarget*/ {

	private int actualZoomLevel;
	private double actualLat;
	private double actualLong;
	private JXMapKit map;
	private List<MapItem> engine1;
	private List<MapItem> engine2;
	private List<MapItem> engine3;
	private List<MapItem> amb1;
	private List<MapItem> amb2;
	private List<MapItem> amb3;
	private List<MapItem> place;
	private List<MapItem> shapes;
	private List<MapItem> redPoints = new ArrayList<MapItem>();
	private List<MapItem> greenPoints = new ArrayList<MapItem>();
	private List<MapItem> bluePoints = new ArrayList<MapItem>();
	private WaypointPainter enginePainter1;
	private WaypointPainter enginePainter2;
	private WaypointPainter enginePainter3;
	private WaypointPainter ambPainter1;
	private WaypointPainter ambPainter2;
	private WaypointPainter ambPainter3;
	private WaypointPainter placePainter;
	private WaypointPainter dragPainter;
	private Painter<JXMapViewer> shapePainter;
	private Painter<JXMapViewer> brushPainter;
	private WaypointPainter selPainter;
	private WaypointPainter newPainter;
	private HashMap<Integer, GeneralPath> shapePath = new HashMap<Integer, GeneralPath>();
	private MapZone currentShape = new MapZone();
	private MapLine selLine;
	private boolean isLineSelected = false;
	private MapLine currentLine = new MapLine();
	private MapZone selShape;
	private boolean isShapeSelected = false;
	private boolean drawShape = false;
	private boolean drawLine = false;
	private boolean redBrushSelected = false;
	private boolean greenBrushSelected = false;
	private boolean blueBrushSelected = false;
	private Color color;
	private Waypoint selWaypoint;
	private JButton removeWaypoint = new JButton("Remove");
	private JButton changeWaypoint = new JButton("Change");

	public MapWidget(int zoom, double lat, double long_) {
		//super();
		actualZoomLevel = zoom;
		actualLat = lat;
		actualLong = long_;
		map = new JXMapKit();
		engine1 = new ArrayList<MapItem>();
		engine2 = new ArrayList<MapItem>();
		engine3 = new ArrayList<MapItem>();
		amb1 = new ArrayList<MapItem>();
		amb2 = new ArrayList<MapItem>();
		amb3 = new ArrayList<MapItem>();
		place = new ArrayList<MapItem>();
		shapes = new ArrayList<MapItem>();
		removeWaypoint.setVisible(false);
		removeWaypoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeWaypoint.setVisible(false);
				changeWaypoint.setVisible(false);
				selPainter.getWaypoints().remove(selWaypoint);
				map.repaint();
			}
		});
		changeWaypoint.setVisible(false);
		changeWaypoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selPainter.getWaypoints().remove(selWaypoint);
				newPainter.getWaypoints().add(selWaypoint);
				removeWaypoint.setVisible(false);
				changeWaypoint.setVisible(false);
				map.repaint();
			}
		});
		map.getMainMap().add(removeWaypoint);
		map.getMainMap().add(changeWaypoint);
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
		DragHandler handler=new DragHandler();
		handler.setMap(this);
		map.getMainMap().setTransferHandler(handler);
		addPainters();
	}

	public JXMapKit getMap() {
		return map;
	}

	public void setColor(Color c) {
		color = c;
	}
	
	public void setDrawLine(boolean b)
	{
		drawLine=b;
	}
	
	public void setDrawShape(boolean b)
	{
		drawShape=b;
	}
	
	public void addItem(Point p,Rectangle r,Color c,Line2D.Float[] lines)
	{
		Rectangle rect=map.getMainMap().getViewportBounds();
		Point p1=new Point(Math.abs(p.x+rect.x),Math.abs(p.y+rect.y));
		GeoPosition gp=map.getMainMap().getTileFactory().pixelToGeo(p1,
				map.getMainMap().getZoom());
		Set<Waypoint> waypoints;
		if (c.equals(Color.red))
		{
			
			if (lines.length==1)
			{
				waypoints=enginePainter1.getWaypoints();
				waypoints.add(new Waypoint(gp.getLatitude(),gp.getLongitude()));
				System.out.println(waypoints.size());
				enginePainter1.setWaypoints(waypoints);
				map.repaint();
			}
			else
				if (lines.length==2)
				{
					waypoints=enginePainter2.getWaypoints();
					waypoints.add(new Waypoint(gp));
					enginePainter2.setWaypoints(waypoints);
					map.repaint();
				}
				else
				{
					waypoints=enginePainter3.getWaypoints();
					waypoints.add(new Waypoint(gp));
					enginePainter3.setWaypoints(waypoints);
					map.repaint();
				}
		}
		else
			if (c.equals(Color.blue))
			{
				if (lines.length==1)
				{
					waypoints=ambPainter1.getWaypoints();
					waypoints.add(new Waypoint(gp));
					ambPainter1.setWaypoints(waypoints);
					map.repaint();
				}
				else
					if (lines.length==2)
					{
						waypoints=ambPainter2.getWaypoints();
						waypoints.add(new Waypoint(gp));
						ambPainter2.setWaypoints(waypoints);
						map.repaint();
					}
					else
					{
						waypoints=ambPainter3.getWaypoints();
						waypoints.add(new Waypoint(gp));
						ambPainter3.setWaypoints(waypoints);
						map.repaint();
					}
			}
			else
			{
				waypoints=placePainter.getWaypoints();
				waypoints.add(new Waypoint(gp));
				placePainter.setWaypoints(waypoints);
				map.repaint();
			}
	}

	private void addPainters() {
		addEnginePainter();
		addAmbulancePainter();
		addPlacePainter();
		addShapePainter();
		addBrushPainter();
		//addDragPainter();
		CompoundPainter cp = new CompoundPainter();
		cp.setPainters(enginePainter1, enginePainter2, enginePainter3,
				ambPainter1, ambPainter2, ambPainter3, placePainter,
				shapePainter, brushPainter);
		cp.setCacheable(false);
		map.getMainMap().setOverlayPainter(cp);
	}

	private void addEnginePainter() {
		enginePainter1 = new WaypointPainter();
		enginePainter1.setRenderer(new WaypointRenderer() {

			public boolean paintWaypoint(Graphics2D g, JXMapViewer map,
					Waypoint wp) {
				g.setColor(Color.RED);
				g.drawRect(-10, -10, 20, 20);
				g.drawLine(0, -10, 0, -15);
				return true;
			}
		});

		enginePainter2 = new WaypointPainter();
		enginePainter2.setRenderer(new WaypointRenderer() {

			public boolean paintWaypoint(Graphics2D g, JXMapViewer map,
					Waypoint wp) {
				g.setColor(Color.RED);
				g.drawRect(-10, -10, 20, 20);
				g.drawLine(-2, -10, -2, -15);
				g.drawLine(2, -10, 2, -15);
				return true;
			}
		});

		enginePainter3 = new WaypointPainter();
		enginePainter3.setRenderer(new WaypointRenderer() {

			public boolean paintWaypoint(Graphics2D g, JXMapViewer map,
					Waypoint wp) {
				g.setColor(Color.RED);
				g.drawRect(-10, -10, 20, 20);
				g.drawLine(-5, -10, -5, -15);
				g.drawLine(0, -10, 0, -15);
				g.drawLine(5, -10, 5, -15);
				return true;
			}
		});
	}

	private void addAmbulancePainter() {
		ambPainter1 = new WaypointPainter();
		ambPainter1.setRenderer(new WaypointRenderer() {

			public boolean paintWaypoint(Graphics2D g, JXMapViewer map,
					Waypoint wp) {
				g.setColor(Color.blue);
				g.drawRect(-10, -10, 20, 20);
				g.drawLine(0, -10, 0, -15);
				return true;
			}
		});

		ambPainter2 = new WaypointPainter();
		ambPainter2.setRenderer(new WaypointRenderer() {

			public boolean paintWaypoint(Graphics2D g, JXMapViewer map,
					Waypoint wp) {
				g.setColor(Color.blue);
				g.drawRect(-10, -10, 20, 20);
				g.drawLine(-2, -10, -2, -15);
				g.drawLine(2, -10, 2, -15);
				return true;
			}
		});

		ambPainter3 = new WaypointPainter();
		ambPainter3.setRenderer(new WaypointRenderer() {

			public boolean paintWaypoint(Graphics2D g, JXMapViewer map,
					Waypoint wp) {
				g.setColor(Color.blue);
				g.drawRect(-10, -10, 20, 20);
				g.drawLine(-5, -10, -5, -15);
				g.drawLine(0, -10, 0, -15);
				g.drawLine(5, -10, 5, -15);
				return true;
			}
		});
	}

	private void addPlacePainter() {
		placePainter = new WaypointPainter();
		placePainter.setRenderer(new WaypointRenderer() {

			public boolean paintWaypoint(Graphics2D g, JXMapViewer map,
					Waypoint wp) {
				g.setColor(Color.green);
				g.drawRect(-10, -10, 20, 20);
				g.drawLine(-10, -15, 10, -15);
				return true;
			}
		});
	}

	private void addShapePainter() {
		shapePainter = new Painter<JXMapViewer>() {

			public void paint(Graphics2D g, JXMapViewer map, int w, int h) {
				g = (Graphics2D) g.create();
				// convert from viewport to world bitmap
				Rectangle rect = map.getViewportBounds();
				g.translate(-rect.x, -rect.y);
				Color color = new Color(255, 100, 0);
				shapePath.clear();
				Color red = new Color(255, 0, 0, 100);
				g.setColor(red);
				for (int i = 0; i < shapes.size(); i++) {
					MapItem item = shapes.get(i);
					if (item instanceof MapLine) {
						MapLine line = (MapLine) item;
						if (line.equals(selLine) && isLineSelected) {
							g.setColor(color);
							line.drawCorners(g, map);
						} else {
							g.setColor(Color.RED);
						}
						GeneralPath polyline = line.render(map);
						g.draw(polyline);
					} else if (item instanceof MapZone) {
						MapZone shape = (MapZone) item;
						if (shape.equals(selShape) && isShapeSelected) {
							g.setColor(color);
							shape.drawCorners(g, map);
						} else {
							g.setColor(red);
						}
						GeneralPath polygon = shape.render(map);
						polygon.closePath();
						g.draw(polygon);
						g.fill(polygon);
						shapePath.put(i, polygon);
					}
				}
				GeneralPath polyline = currentLine.render(map);
				g.draw(polyline);
				polyline = currentShape.render(map);
				g.draw(polyline);
				g.dispose();
			}
		};
	}

	private void addBrushPainter() {
		brushPainter = new Painter<JXMapViewer>() {

			public void paint(Graphics2D g, JXMapViewer map, int w, int h) {
				g = (Graphics2D) g.create();
				Rectangle rect = map.getViewportBounds();
				g.translate(-rect.x, -rect.y);
				g.setColor(Color.RED);
				for (int i = 0; i < redPoints.size(); i++) {
					MapItemPoint gp = (MapItemPoint) redPoints.get(i);
					Point2D pt = map.getTileFactory().geoToPixel(
							gp.getPosition(), map.getZoom());
					g.fillOval((int) pt.getX(), (int) pt.getY(), 20, 20);
				}

				g.setColor(Color.GREEN);
				for (int i = 0; i < greenPoints.size(); i++) {
					MapItemPoint gp = (MapItemPoint) greenPoints.get(i);
					Point2D pt = map.getTileFactory().geoToPixel(
							gp.getPosition(), map.getZoom());
					g.fillOval((int) pt.getX(), (int) pt.getY(), 20, 20);
				}

				g.setColor(Color.BLUE);
				for (int i = 0; i < bluePoints.size(); i++) {
					MapItemPoint gp = (MapItemPoint) bluePoints.get(i);
					Point2D pt = map.getTileFactory().geoToPixel(
							gp.getPosition(), map.getZoom());
					g.fillOval((int) pt.getX(), (int) pt.getY(), 20, 20);
				}

			}
		};
	}

	/*private void addDragPainter() {
		dragPainter = new WaypointPainter();
		dragPainter.setRenderer(new WaypointRenderer() {
			public boolean paintWaypoint(Graphics2D g, JXMapViewer map,
					Waypoint wp) {
				g.setColor(color);
				switch (nbLines) {
				case 0:
					g.drawRect(-10, -10, 20, 20);
					g.drawLine(-10, -15, 10, -15);
					break;
				case 1:
					g.drawRect(-10, -10, 20, 20);
					g.drawLine(0, -10, 0, -15);
					break;
				case 2:
					g.drawRect(-10, -10, 20, 20);
					g.drawLine(-2, -10, -2, -15);
					g.drawLine(2, -10, 2, -15);
					break;
				case 3:
					g.drawRect(-10, -10, 20, 20);
					g.drawLine(-5, -10, -5, -15);
					g.drawLine(0, -10, 0, -15);
					g.drawLine(5, -10, 5, -15);
					break;
				}
				return true;
			}
		});

	}*/

	class MapListener extends MouseInputAdapter {
		private Waypoint point;
		private Point linePoint, shapePoint;

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2 && drawShape) {
				currentShape.removeLastPoint();
				shapes.add(currentShape);
				currentShape = new MapZone();
				map.repaint();
			} else if (drawShape) {
				int x = e.getX();
				int y = e.getY();
				Rectangle rect = map.getMainMap().getViewportBounds();
				Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
				currentShape.addPoint(new MapPoint(map.getMainMap()
						.getTileFactory().pixelToGeo(p,
								map.getMainMap().getZoom())));
			} else if (e.getClickCount() == 2 && drawLine) {
				currentLine.removeLastPoint();
				shapes.add(currentLine);
				currentLine = new MapLine();
				map.repaint();
			} else if (drawLine) {
				int x = e.getX();
				int y = e.getY();
				Rectangle rect = map.getMainMap().getViewportBounds();
				Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
				currentLine.addPoint(new MapPoint(map.getMainMap()
						.getTileFactory().pixelToGeo(p,
								map.getMainMap().getZoom())));
			} else {
				int x = e.getX();
				int y = e.getY();
				Rectangle rect = map.getMainMap().getViewportBounds();
				Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
				GeoPosition gp = map.getMainMap().getTileFactory().pixelToGeo(
						p, map.getMainMap().getZoom());
				if ((selWaypoint = getWaypoint(gp)) != null
						&& selPainter != null && newPainter != null) {
					int x1 = e.getX();
					int y1 = e.getY();
					Rectangle rect1 = map.getMainMap().getViewportBounds();
					Point p2 = new Point(Math.abs(x1 + rect1.x), Math.abs(y1
							+ rect1.y));
					GeoPosition gp1 = selWaypoint.getPosition();
					Point2D p3 = map.getMainMap().getTileFactory().geoToPixel(
							gp1, map.getMainMap().getZoom());
					if (p2.distance(p3) < 20) {
						removeWaypoint.setLocation(p2.x - rect1.x, p2.y
								- rect1.y);
						changeWaypoint.setLocation(p2.x - rect1.x, p2.y + 25
								- rect1.x);
						removeWaypoint.setVisible(!removeWaypoint.isVisible());
						changeWaypoint.setVisible(!changeWaypoint.isVisible());
					} else {
						removeWaypoint.setVisible(false);
						changeWaypoint.setVisible(false);
					}
				} else {
					if (selLine != null && e.getClickCount() != 2) {
						isLineSelected = !isLineSelected;
						map.repaint();
					} else {
						isLineSelected = false;
						map.repaint();
					}
					if (selShape != null && e.getClickCount() != 2) {
						isShapeSelected = !isShapeSelected;
						map.repaint();
					} else {
						isShapeSelected = false;
						map.repaint();
					}
				}
			}
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			if (drawLine && currentLine.size() > 0) {
				if (currentLine.size() > 1) {
					currentLine.removeLastPoint();
				}
				int x = e.getX();
				int y = e.getY();
				Rectangle rect = map.getMainMap().getViewportBounds();
				Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
				currentLine.addPoint(new MapPoint(map.getMainMap()
						.getTileFactory().pixelToGeo(p,
								map.getMainMap().getZoom())));
				map.repaint();
			} else if (drawShape && currentShape.size() > 0) {
				if (currentShape.size() > 1) {
					currentShape.removeLastPoint();
				}
				int x = e.getX();
				int y = e.getY();
				Rectangle rect = map.getMainMap().getViewportBounds();
				Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
				currentShape.addPoint(new MapPoint(map.getMainMap()
						.getTileFactory().pixelToGeo(p,
								map.getMainMap().getZoom())));
				map.repaint();
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			Rectangle rect = map.getMainMap().getViewportBounds();
			Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
			GeoPosition gp = map.getMainMap().getTileFactory().pixelToGeo(p,
					map.getMainMap().getZoom());
			point = getWaypoint(gp);
			MapItem selected = getItem(gp);
			if (selected instanceof MapLine) {
				selLine = (MapLine) selected;
				selShape = null;
				linePoint = p;
				if (isLineSelected) {
					selLine.setLinePoint(map, gp);
				}
			} else if (selected instanceof MapZone) {
				selLine = null;
				selShape = (MapZone) selected;
				shapePoint = p;
				if (isShapeSelected) {
					selShape.setShapePoint(map, gp);
				}
			}
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			if (selLine == null) {
				isLineSelected = false;
				map.repaint();
			}
			if (selShape == null) {
				isShapeSelected = false;
				map.repaint();
			}
			if (selShape != null) {
				if (!selShape.isPointSelected()) {
					MapZone newShape = new MapZone();
					map.getMainMap().setPanEnabled(false);
					int x = e.getX();
					int y = e.getY();
					Rectangle rect = map.getMainMap().getViewportBounds();
					Point p = new Point(Math.abs(x + rect.x), Math.abs(y
							+ rect.y));
					int deltax = p.x - shapePoint.x;
					int deltay = p.y - shapePoint.y;
					shapePoint = p;
					newShape = (MapZone) selShape.move(map, deltax, deltay);
					shapes.remove(selShape);
					shapes.add(newShape);
					selShape = newShape;
					map.repaint();
				} else {
					map.getMainMap().setPanEnabled(false);
					int x = e.getX();
					int y = e.getY();
					Rectangle rect = map.getMainMap().getViewportBounds();
					Point p = new Point(Math.abs(x + rect.x), Math.abs(y
							+ rect.y));
					GeoPosition gp = map.getMainMap().getTileFactory()
							.pixelToGeo(p, map.getMainMap().getZoom());
					selShape.movePoint(new MapPoint(gp));
					map.repaint();
				}
			} else if (selLine != null) {
				if (!selLine.isPointSelected()) {
					MapLine newLine = new MapLine();
					map.getMainMap().setPanEnabled(false);
					int x = e.getX();
					int y = e.getY();
					Rectangle rect = map.getMainMap().getViewportBounds();
					Point p = new Point(Math.abs(x + rect.x), Math.abs(y
							+ rect.y));
					int deltax = p.x - linePoint.x;
					int deltay = p.y - linePoint.y;
					linePoint = p;
					newLine = (MapLine) selLine.move(map, deltax, deltay);
					shapes.remove(selLine);
					shapes.add(newLine);
					selLine = newLine;
					map.repaint();
				} else {
					map.getMainMap().setPanEnabled(false);
					int x = e.getX();
					int y = e.getY();
					Rectangle rect = map.getMainMap().getViewportBounds();
					Point p = new Point(Math.abs(x + rect.x), Math.abs(y
							+ rect.y));
					GeoPosition gp = map.getMainMap().getTileFactory()
							.pixelToGeo(p, map.getMainMap().getZoom());
					selLine.movePoint(new MapPoint(gp));
					map.repaint();
				}
			} else if (point != null) {
				map.getMainMap().setPanEnabled(false);
				int x = e.getX();
				int y = e.getY();
				Rectangle rect = map.getMainMap().getViewportBounds();
				Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
				GeoPosition gp = map.getMainMap().getTileFactory().pixelToGeo(
						p, map.getMainMap().getZoom());
				point.setPosition(gp);
				map.repaint();
			} else if (redBrushSelected || greenBrushSelected
					|| blueBrushSelected) {
				map.getMainMap().setPanEnabled(false);
				int x = e.getX();
				int y = e.getY();
				Rectangle rect = map.getMainMap().getViewportBounds();
				Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
				GeoPosition gp = map.getMainMap().getTileFactory().pixelToGeo(
						p, map.getMainMap().getZoom());
				if (redBrushSelected) {
					redPoints.add(new MapItemPoint(new MapPoint(gp)));
				} else if (greenBrushSelected) {
					greenPoints.add(new MapItemPoint(new MapPoint(gp)));
				} else {
					bluePoints.add(new MapItemPoint(new MapPoint(gp)));
				}
				map.repaint();
			} /*else if (nbLines >= 0 && color != null) {
				System.out.println("dasdas");
				isDragged = true;
				int x = e.getX();
				int y = e.getY();
				Rectangle rect = map.getMainMap().getViewportBounds();
				Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
				GeoPosition gp = map.getMainMap().getTileFactory().pixelToGeo(
						p, map.getMainMap().getZoom());
				Set<Waypoint> waypoints = new HashSet<Waypoint>();
				Waypoint wp = new Waypoint(gp.getLatitude(), gp.getLongitude());
				waypoints.add(wp);
				dragPainter.setWaypoints(waypoints);
			}*/
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			map.getMainMap().setPanEnabled(true);
			/*if (isDragged) {
				isDragged = false;
				int x = e.getX();
				int y = e.getY();
				Rectangle rect = map.getMainMap().getViewportBounds();
				Point p = new Point(Math.abs(x + rect.x), Math.abs(y + rect.y));
				GeoPosition gp = map.getMainMap().getTileFactory().pixelToGeo(
						p, map.getMainMap().getZoom());
				Set<Waypoint> waypoints;
				Waypoint wp = new Waypoint(gp.getLatitude(), gp.getLongitude());
				if (color == Color.red) {
					if (nbLines == 1) {
						waypoints = enginePainter1.getWaypoints();
						waypoints.add(wp);
						enginePainter1.setWaypoints(waypoints);
					} else if (nbLines == 2) {
						waypoints = enginePainter2.getWaypoints();
						waypoints.add(wp);
						enginePainter2.setWaypoints(waypoints);
					} else if (nbLines == 3) {
						waypoints = enginePainter3.getWaypoints();
						waypoints.add(wp);
						enginePainter3.setWaypoints(waypoints);
					}
				} else if (color == Color.blue) {
					if (nbLines == 1) {
						waypoints = ambPainter1.getWaypoints();
						waypoints.add(wp);
						ambPainter1.setWaypoints(waypoints);
					} else if (nbLines == 2) {
						waypoints = ambPainter2.getWaypoints();
						waypoints.add(wp);
						ambPainter2.setWaypoints(waypoints);
					} else if (nbLines == 3) {
						waypoints = ambPainter3.getWaypoints();
						waypoints.add(wp);
						ambPainter3.setWaypoints(waypoints);
					}
				} else if (color == Color.green && nbLines == 0) {
					waypoints = placePainter.getWaypoints();
					waypoints.add(wp);
					placePainter.setWaypoints(waypoints);
				}
			}*/
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
					if (line.findLine(map, x, y)) {
						return line;
					}
				} else if (item instanceof MapZone) {
					if (shapePath.get(i).contains(pt)) {
						return shapes.get(i);
					}
				}
			}
			return null;
		}

		private Waypoint getWaypoint(GeoPosition gp) {
			Point2D pt = map.getMainMap().getTileFactory().geoToPixel(gp,
					map.getMainMap().getZoom());
			Set<Waypoint> waypoints = enginePainter1.getWaypoints();
			Iterator<Waypoint> it = waypoints.iterator();
			while (it.hasNext()) {
				Waypoint wp = it.next();
				GeoPosition gp1 = wp.getPosition();
				Point2D pt1 = map.getMainMap().getTileFactory().geoToPixel(gp1,
						map.getMainMap().getZoom());
				if (pt.distance(pt1) < 20) {
					selPainter = enginePainter1;
					newPainter = enginePainter2;
					return wp;
				}
			}
			waypoints = enginePainter2.getWaypoints();
			it = waypoints.iterator();
			while (it.hasNext()) {
				Waypoint wp = it.next();
				GeoPosition gp1 = wp.getPosition();
				Point2D pt1 = map.getMainMap().getTileFactory().geoToPixel(gp1,
						map.getMainMap().getZoom());
				if (pt.distance(pt1) < 10) {
					selPainter = enginePainter2;
					newPainter = enginePainter3;
					return wp;
				}
			}
			waypoints = enginePainter3.getWaypoints();
			it = waypoints.iterator();
			while (it.hasNext()) {
				Waypoint wp = it.next();
				GeoPosition gp1 = wp.getPosition();
				Point2D pt1 = map.getMainMap().getTileFactory().geoToPixel(gp1,
						map.getMainMap().getZoom());
				if (pt.distance(pt1) < 10) {
					selPainter = enginePainter3;
					newPainter = enginePainter1;
					return wp;
				}
			}
			waypoints = ambPainter1.getWaypoints();
			it = waypoints.iterator();
			while (it.hasNext()) {
				Waypoint wp = it.next();
				GeoPosition gp1 = wp.getPosition();
				Point2D pt1 = map.getMainMap().getTileFactory().geoToPixel(gp1,
						map.getMainMap().getZoom());
				if (pt.distance(pt1) < 10) {
					selPainter = ambPainter1;
					newPainter = ambPainter2;
					return wp;
				}
			}
			waypoints = ambPainter2.getWaypoints();
			it = waypoints.iterator();
			while (it.hasNext()) {
				Waypoint wp = it.next();
				GeoPosition gp1 = wp.getPosition();
				Point2D pt1 = map.getMainMap().getTileFactory().geoToPixel(gp1,
						map.getMainMap().getZoom());
				if (pt.distance(pt1) < 10) {
					selPainter = ambPainter2;
					newPainter = ambPainter3;
					return wp;
				}
			}
			waypoints = ambPainter3.getWaypoints();
			it = waypoints.iterator();
			while (it.hasNext()) {
				Waypoint wp = it.next();
				GeoPosition gp1 = wp.getPosition();
				Point2D pt1 = map.getMainMap().getTileFactory().geoToPixel(gp1,
						map.getMainMap().getZoom());
				if (pt.distance(pt1) < 10) {
					selPainter = ambPainter3;
					newPainter = ambPainter1;
					return wp;
				}
			}
			waypoints = placePainter.getWaypoints();
			it = waypoints.iterator();
			while (it.hasNext()) {
				Waypoint wp = it.next();
				GeoPosition gp1 = wp.getPosition();
				Point2D pt1 = map.getMainMap().getTileFactory().geoToPixel(gp1,
						map.getMainMap().getZoom());
				if (pt.distance(pt1) < 10) {
					selPainter = null;
					newPainter = null;
					return wp;
				}
			}
			return null;
		}
	}
}
