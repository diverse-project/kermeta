package org.kermeta.ki.visual.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.Scrollable;
import javax.swing.SwingConstants;

import org.kermeta.ki.malai.Zoomable;
import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;
import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;
import org.kermeta.ki.visual.MetamodelVizuFrame;
import org.kermeta.ki.visual.view.ComponentView.Visibility;

import edu.uci.ics.jung.algorithms.layout.KKLayout;
import edu.uci.ics.jung.algorithms.layout.TreeLayout;
import edu.uci.ics.jung.graph.DelegateForest;
import edu.uci.ics.jung.graph.Forest;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;

public class MetamodelView extends JPanel implements Scrollable, Zoomable, MouseListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;

	protected List<EntityView> entities;
	
	protected List<LinkView> links;
	
	protected EventManagerWrapper eventManager;
	
	protected Forest<EntityView, LinkView> forest;
	
	protected static double zoom;
	
	
	public static RuntimeObject refresh(RuntimeObject mmRO) {
		MetamodelView metamodelView = (MetamodelView) mmRO.getUserData();
		
		metamodelView.repaint();
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	public static RuntimeObject updateArrows(RuntimeObject mmRO) {
		MetamodelView metamodelView = (MetamodelView) mmRO.getUserData();
		
		for(LinkView link : metamodelView.links)
			link.update();
		
		metamodelView.repaint();
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject onEntityRemoved(RuntimeObject mmRO, RuntimeObject entityRO) {
		MetamodelView metamodelView = (MetamodelView) mmRO.getUserData();
		EntityView view   			= (EntityView) entityRO.getUserData();
		
		metamodelView.entities.remove(view);
		RuntimeObject2JavaMap.MAP.remove(view);
		// We do not release the user data.
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject onEntityAdded(RuntimeObject mmRO, RuntimeObject entityRO, RuntimeObject isAspectRO, RuntimeObject positionRO, RuntimeObject nameRO) {
		Object obj		  = entityRO.getUserData();
		Object name		  = fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(nameRO);
		MetamodelView metamodelView = (MetamodelView) mmRO.getUserData();
		int position 	  = Integer.getValue(positionRO);
		boolean isAspect  = Boolean.getValue(isAspectRO);
		// If an object is attached as user data, we use it.
		EntityView view = null;
		
		if(isAspect) {
			int i = 0, size = metamodelView.entities.size();
			
			while(view==null && i<size) {
				if(metamodelView.entities.get(i).getName().equals(name))
					view = metamodelView.entities.get(i);
				else
					i++;
			}
			
			if(view==null) {
				System.err.println("ERROR: aspect added but not its reference class");
				return mmRO.getFactory().getMemory().voidINSTANCE;
			}
			
			entityRO.setUserData(view);
			return mmRO.getFactory().getMemory().voidINSTANCE;
		}
		
		view = (EntityView) (obj==null ? new ClassView("class") : obj);

		metamodelView.addEntity(position, view);
		entityRO.setUserData(view);
		RuntimeObject2JavaMap.MAP.put(view, entityRO);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}

	
	
	public static RuntimeObject onLinkAdded(RuntimeObject mmRO, RuntimeObject linkRO, RuntimeObject compositionRO, RuntimeObject srcClassRO, 
											RuntimeObject tarClassRO, RuntimeObject srcNameRO, RuntimeObject srcCardRO, RuntimeObject tarNameRO,
											RuntimeObject tarCardRO, RuntimeObject positionRO) {
		MetamodelView metamodelView = (MetamodelView) mmRO.getUserData();
		int position		  	= Integer.getValue(positionRO);
		EntityView srcClass    	= (EntityView) srcClassRO.getUserData();
		EntityView tarClass    	= (EntityView) tarClassRO.getUserData();
		String srcRole			= srcNameRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(srcNameRO);
		String targetRole		= tarNameRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(tarNameRO);
		String srcCard			= srcCardRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(srcCardRO);
		String targetCard		= tarCardRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(tarCardRO);
		
		LinkView view = new RelationView(srcClass, tarClass, Boolean.getValue(compositionRO), 
										srcRole, targetRole, srcCard, targetCard);

		linkRO.setUserData(view);
		view.visibility = Visibility.STANDARD;
		metamodelView.addLink(position, view);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject onLinkRemoved(RuntimeObject mmRO, RuntimeObject linkRO) {
		MetamodelView metamodelView = (MetamodelView) mmRO.getUserData();
		LinkView view 				= (LinkView) linkRO.getUserData(); 
		
		metamodelView.links.remove(view);
		linkRO.setUserData(null);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject onInheritanceRemoved(RuntimeObject mmRO, RuntimeObject srcClassRO, RuntimeObject tarClassRO) {
		MetamodelView metamodelView = (MetamodelView) mmRO.getUserData();
		EntityView srcClass    		= (EntityView) srcClassRO.getUserData();
		EntityView tarClass    		= (EntityView) tarClassRO.getUserData();
		InheritanceView view;
		boolean again				= true;
		final int size				= metamodelView.links.size();
		int i						= 0;
		LinkView link;
		
		while(again && i<size) {
			link = metamodelView.links.get(i);
			
			if(link instanceof InheritanceView) {
				view = (InheritanceView) link;
				
				if(view.entitySrc==srcClass && view.entityTar==tarClass) {
					metamodelView.links.remove(link);
					again = false;
				}
			}
			
			i++;
		}
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject onInheritanceAdded(RuntimeObject mmRO, RuntimeObject srcClassRO, RuntimeObject tarClassRO, RuntimeObject positionRO) {
		MetamodelView metamodelView = (MetamodelView) mmRO.getUserData();
		EntityView srcClass    		= (EntityView) srcClassRO.getUserData();
		EntityView tarClass    		= (EntityView) tarClassRO.getUserData();
		int position		   		= Integer.getValue(positionRO);
		InheritanceView view   		= new InheritanceView(srcClass, tarClass);
		
		view.visibility = Visibility.STANDARD;
		metamodelView.addLink(position, view);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject update(RuntimeObject mmRO) {
		MetamodelView metamodelView = (MetamodelView) mmRO.getUserData();
		
		for(EntityView entity : metamodelView.entities)
			entity.update();
		
		metamodelView.recentre();
		
		for(LinkView link : metamodelView.links)
			link.update();
		
		metamodelView.repaint();
		metamodelView.updatePreferredSize();
		metamodelView.revalidate();
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	
	public MetamodelView(EventManagerWrapper emw) {
		super();

		eventManager = emw;
		entities  	 = new ArrayList<EntityView>();
		links 		 = new ArrayList<LinkView>();
		zoom		 = 1.;
		
		setFocusable(true);
		
		if(eventManager!=null)
			eventManager.attachTo(this);
		
		addMouseListener(this); //TODO to remove!!
		addMouseMotionListener(this); //TODO to remove!!
	}
	
	
	
	
	public void initialiseForest() {
		forest = new DelegateForest<EntityView, LinkView>();

		for(EntityView entity : entities)
			if(entity.isVisible())
				forest.addVertex(entity);
		
//		Map<EntityView, EntityView> linksAdded = new IdentityHashMap<EntityView, EntityView>();
		
		for(LinkView link : links)
			if(link.isVisible() && link instanceof InheritanceView) {
//				//if(linksAdded.get(link.getEntitySrc())!=link.getEntityTar() && linksAdded.get(link.getEntityTar())!=link.getEntitySrc())
					forest.addEdge(link, link.getEntitySrc(), link.getEntityTar());
			}
	}
	
	
	
	
	public void setTreeLayout() {
//		MyTreeLayout<EntityView,LinkView> treeLayout   = new MyTreeLayout<EntityView,LinkView>(forest, 200, 200);
//		Iterator<Entry<EntityView, Point2D>> locations = treeLayout.getLocations().entrySet().iterator();
//		Entry<EntityView, Point2D> location;
//		
//		while(locations.hasNext()) {
//			location = locations.next();
//			location.getKey().setCentre(location.getValue());
//			location.getKey().update();
//		}
		KKLayout<EntityView,LinkView> treeLayout = new KKLayout<EntityView,LinkView>(forest, new DistanceVisu(this));
		treeLayout.setSize(new Dimension(1000, 1000));
		
		for(EntityView entity : entities) {
			entity.setCentre((int)treeLayout.getX(entity), (int)treeLayout.getY(entity));
			entity.update();
		}
		
		
		for(LinkView link : links)
			link.update();
		
		recentre();
		repaint();
		updatePreferredSize();
	}
	
	
	
	
	public Forest<EntityView, LinkView> getForest() {
		return forest;
	}



	public void addLink(int position, LinkView link) {
		if(link!=null && position<entities.size() && position>=0)
			links.add(position, link);
		else
			if((position==-1 || position==entities.size()) && link!=null)
				links.add(link);
	}
	
	public void addEntity(int position, EntityView entity) {
		if(entity!=null && position<entities.size() && position>=0)
			entities.add(position, entity);
		else
			if((position==-1 || position==entities.size()) && entity!=null)
				entities.add(entity);
	}
	
	
	
	public EventManagerWrapper getEventManager() {
		return eventManager;
	}



	public List<EntityView> getEntities() {
		return entities;
	}



	public List<LinkView> getLinks() {
		return links;
	}



	@Override
	public void paint(Graphics g) {
		requestFocus();
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		g2.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, getWidth(), getHeight());
		
		g2.scale(zoom, zoom);

		for(EntityView entity : entities)
			entity.paint(g2);
		
		for(LinkView link : links)
			link.paint(g2);
	}
	
	
	public void addClassView(String name) {
		entities.add(new ClassView(name));
	}
	
	
	public void addAspectView(String name) {
		entities.add(new ClassView(name));
	}
	
	
	
	public void recentre() {
		double xMin, yMin;
		int i, nbEntities = entities.size();
		Rectangle2D rec;
		xMin = Double.MAX_VALUE;
		yMin = Double.MAX_VALUE;

		for(i=0; i<nbEntities; i++) {
			rec = entities.get(i).getBorders();
			if(rec.getMinX() < xMin) xMin = rec.getMinX();
			if(rec.getMinY() < yMin) yMin = rec.getMinY();
		}

		xMin = 10-xMin;
		yMin = 10-yMin;
		
		for(EntityView e : entities) {
			e.centre.setLocation(e.centre.x+xMin, e.centre.y+yMin);
			e.update();
		}
		
		for(LinkView link : links)
			link.update();
	}

	
	
	public void updatePreferredSize() {
		double maxX = Double.MIN_VALUE;
		double maxY = Double.MIN_VALUE;
		Rectangle2D dim;
		
		for(EntityView entity : entities) {
			dim = entity.getBorders();
			
			if(dim.getMaxX()>maxX)
				maxX = dim.getMaxX();
			if(dim.getMaxY()>maxY)
				maxY = dim.getMaxY();
		}
		
		setPreferredSize(new Dimension((int)(maxX*zoom), (int)(maxY*zoom)));
	}
	
	
	
	public Dimension getPreferredScrollableViewportSize()
	{	return new Dimension(-100, 100);  }
	

	
	public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
        return (orientation == SwingConstants.VERTICAL) ? visibleRect.height : visibleRect.width;
	}
	
	
	
	public boolean getScrollableTracksViewportHeight() {
		return getParent() instanceof JViewport ? ((JViewport)getParent()).getHeight() > getPreferredSize().height : false;
	}
	

	public boolean getScrollableTracksViewportWidth() {
		return getParent() instanceof JViewport ? ((JViewport)getParent()).getWidth() > getPreferredSize().width : false;
	}
	

	
	public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
		return 4;
	}


	public void zoomDefault() {
		zoom = 1.;
	}


	public void zoomIn(double increment) {
		zoom += increment;
	}


	public void zoomOut(double decrement) {
		zoom -= decrement;
	}


	public void mouseClicked(MouseEvent e) {
		// 
		
	}


	public void mouseEntered(MouseEvent e) {
		// 
		
	}


	public void mouseExited(MouseEvent e) {
//		
	}


	public EntityView draggedShape;//TODO to remove!!
	public int startX;
	public int startY;
	
	public void mousePressed(MouseEvent e) {//TODO to remove
		if(MetamodelVizuFrame.hand.isSelected()) {
			draggedShape = null;
			int i=0, size = entities.size();
			
			while(draggedShape==null && i<size) {
				if(entities.get(i).getBorders().contains(e.getX(), e.getY())) {
					draggedShape = entities.get(i);
					startX = e.getX();
					startY = e.getY();
				}
				else
					i++;
			}
		}
	}


	public void mouseReleased(MouseEvent e) {
		draggedShape = null;
		startX = 0;
		startY = 0;
	}


	public void mouseDragged(MouseEvent e) {
		if(draggedShape!=null) {
			int gapX = e.getX() - startX;
			int gapY = e.getY() - startY;
			draggedShape.setCentre((int)draggedShape.getCentre().x + gapX, (int)draggedShape.getCentre().y + gapY);
			startX = e.getX();
			startY = e.getY();
			
			draggedShape.update();
			
			for(LinkView link : links)
				if(link.getEntitySrc()==draggedShape || link.getEntityTar()==draggedShape)
					link.update();
				
			repaint();
			revalidate();
		}
	}


	public void mouseMoved(MouseEvent e) {
		// 
	}
}



class MyTreeLayout<V, E> extends TreeLayout<V, E> {

	public MyTreeLayout(Forest<V, E> g, int distx, int disty) {
		super(g, distx, disty);
	}
	
	
	public Map<V, Point2D> getLocations() {
		return locations;
	}
}

