package org.kermeta.ki.visual.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.Scrollable;
import javax.swing.SwingConstants;

import org.kermeta.ki.malai.Zoomable;
import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;
import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;
import org.kermeta.ki.visual.view.ComponentView.Visibility;

import edu.uci.ics.jung.algorithms.layout.TreeLayout;
import edu.uci.ics.jung.graph.DelegateForest;
import edu.uci.ics.jung.graph.Forest;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;

public class MetamodelView extends JPanel implements Scrollable, Zoomable {
	private static final long serialVersionUID = 1L;

	protected List<EntityView> entities;
	
	protected List<LinkView> links;
	
	protected EventManagerWrapper eventManager;
	
	protected Forest<EntityView, LinkView> forest;
	
	protected double zoom;
	
	
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
	
	
	
	public static RuntimeObject onEntityAdded(RuntimeObject mmRO, RuntimeObject entityRO, RuntimeObject isAspectRO, RuntimeObject positionRO) {
		Object obj		  = entityRO.getUserData();
		MetamodelView metamodelView = (MetamodelView) mmRO.getUserData();
		int position 	  = Integer.getValue(positionRO);
		boolean isAspect  = Boolean.getValue(isAspectRO);
		// If an object is attached as user data, we use it.
		EntityView view   = (EntityView) (obj==null ?( isAspect ? new AspectView("aspect") : new ClassView("class")) : obj);

		metamodelView.addEntity(position, view);
		entityRO.setUserData(view);
		RuntimeObject2JavaMap.MAP.put(view, entityRO);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}

	
	
	public static RuntimeObject onLinkAdded(RuntimeObject mmRO, RuntimeObject linkRO, RuntimeObject compositionRO, RuntimeObject srcClassRO, 
											RuntimeObject tarClassRO, RuntimeObject positionRO) {
		MetamodelView metamodelView = (MetamodelView) mmRO.getUserData();
		int position		  	= Integer.getValue(positionRO);
		EntityView srcClass    	= (EntityView) srcClassRO.getUserData();
		EntityView tarClass    	= (EntityView) tarClassRO.getUserData();
		LinkView view = new RelationView(srcClass, tarClass, Boolean.getValue(compositionRO));

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
		MyTreeLayout<EntityView,LinkView> treeLayout   = new MyTreeLayout<EntityView,LinkView>(forest, 200, 200);
		Iterator<Entry<EntityView, Point2D>> locations = treeLayout.getLocations().entrySet().iterator();
		Entry<EntityView, Point2D> location;
		
		while(locations.hasNext()) {
			location = locations.next();
			location.getKey().setCentre(location.getValue());
			location.getKey().update();
		}
//		KKLayout<EntityView,LinkView> treeLayout = new KKLayout<EntityView,LinkView>(forest, new DistanceVisu(this));
//		treeLayout.setSize(new Dimension(1000, 800));
//		
//		for(EntityView entity : entities) {
//			entity.setCentre((int)treeLayout.getX(entity), (int)treeLayout.getY(entity));
//			entity.update();
//		}
		
		
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
		
		setPreferredSize(new Dimension((int)maxX, (int)maxY));
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
}



class MyTreeLayout<V, E> extends TreeLayout<V, E> {

	public MyTreeLayout(Forest<V, E> g, int distx, int disty) {
		super(g, distx, disty);
	}
	
	
	public Map<V, Point2D> getLocations() {
		return locations;
	}
}

