package org.kermeta.ki.visual.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.Scrollable;
import javax.swing.SwingConstants;

import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;
import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;
import org.kermeta.ki.visual.Force;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;

public class MetamodelView extends JPanel implements Scrollable {
	private static final long serialVersionUID = 1L;

	protected List<EntityView> entities;
	
	protected List<LinkView> links;
	
	protected EventManagerWrapper eventManager;
	
	
	
	public static RuntimeObject onEntityAdded(RuntimeObject mmRO, RuntimeObject entityRO, RuntimeObject isAspectRO, RuntimeObject positionRO) {
		MetamodelView metamodelView = (MetamodelView) mmRO.getUserData();
		int position 	  = Integer.getValue(positionRO);
		boolean isAspect  = Boolean.getValue(isAspectRO);
		EntityView view   = isAspect ? new AspectView("aspect") : new ClassView("class");

		metamodelView.addEntity(position, view);
		entityRO.setUserData(view);
		RuntimeObject2JavaMap.MAP.put(view, entityRO);
		metamodelView.repaint();
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}

	
	
	public static RuntimeObject onLinkAdded(RuntimeObject mmRO, RuntimeObject linkRO, RuntimeObject compositionRO, RuntimeObject srcClassRO, 
							RuntimeObject tarClassRO, RuntimeObject positionRO) {
		MetamodelView metamodelView = (MetamodelView) mmRO.getUserData();
		int position		   = Integer.getValue(positionRO);
//		boolean isComposition  = Boolean.getValue(compositionRO);
		EntityView srcClass    = (EntityView) srcClassRO.getUserData();
		EntityView tarClass    = (EntityView) tarClassRO.getUserData();
		LinkView view = new RelationView(srcClass, tarClass);
		
		view.visible = true;
		metamodelView.addLink(position, view);
		metamodelView.repaint();
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject onInheritanceAdded(RuntimeObject mmRO, RuntimeObject srcClassRO, RuntimeObject tarClassRO, RuntimeObject positionRO) {
		MetamodelView metamodelView = (MetamodelView) mmRO.getUserData();
		EntityView srcClass    = (EntityView) srcClassRO.getUserData();
		EntityView tarClass    = (EntityView) tarClassRO.getUserData();
		int position		   = Integer.getValue(positionRO);
		InheritanceView view   = new InheritanceView(srcClass, tarClass);
		
		view.visible = true;
		metamodelView.addLink(position, view);
		metamodelView.repaint();
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public MetamodelView(EventManagerWrapper emw) {
		super();

		eventManager = emw;
		entities  	 = new ArrayList<EntityView>();
		links 		 = new ArrayList<LinkView>();
		
		setFocusable(true);
		
		if(eventManager!=null)
			eventManager.attachTo(this);
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
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		g2.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, getWidth(), getHeight());
		
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
	
	
	
	public double reorganise() { 
		Force sum = new Force();
		EntityView e1, e2, entity;
		double change=0.;
		int i, j;
		final int nbEntities = entities.size();
		final int nbLinks    = entities.size();

		for(i=0; i<nbEntities; i++) { 
			sum.setX(0.);
			sum.setY(0.);

			entity = entities.get(i);

			for(j=0; j<nbEntities; j++)
				if(j!=i) 
					sum = sum.addForces(entity.influenceEntity(entities.get(j)));

			for(j=0; j<nbLinks; j++){
				e1 = links.get(j).entitySrc;
				e2 = links.get(j).entityTar;

				if(e1 == entity || e2 == entity) 
					sum = sum.addForces(entity.forceArc(links.get(j)));
			}

			change += sum.getX() + sum.getY();

			entities.get(i).setX((int)(entities.get(i).getX() + sum.getX()));
			entities.get(i).setY((int)(entities.get(i).getY() + sum.getY()));
		}
		
		for(EntityView e : entities)
			e.update();
		
		for(LinkView link : links)
			link.update();

		return change;
	}
	
	
	
	public void recentre() {
		double xMin, yMin;
		int i, nbEntities = entities.size();
		Rectangle2D rec;
		xMin = Double.MAX_VALUE;
		yMin = Double.MAX_VALUE;

		for(i=1; i<nbEntities; i++) {
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
	
	
	
	public boolean getScrollableTracksViewportHeight() {
		return getParent() instanceof JViewport ? ((JViewport)getParent()).getHeight() > getPreferredSize().height : false;
	}
	

	public boolean getScrollableTracksViewportWidth() {
		return getParent() instanceof JViewport ? ((JViewport)getParent()).getWidth() > getPreferredSize().width : false;
	}
	

	
	public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
		return 4;
	}


	public Dimension getPreferredScrollableViewportSize() {	
		return new Dimension(-100, 100);
	}


	public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
        return (orientation == SwingConstants.VERTICAL) ? visibleRect.height : visibleRect.width;
	}
}
