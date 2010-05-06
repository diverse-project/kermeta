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
import java.util.IdentityHashMap;
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

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;

public class MetamodelView extends JPanel implements Scrollable, Zoomable, MouseListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;

	protected List<EntityView> entities;
	
	protected List<LinkView> links;
	
	protected EventManagerWrapper eventManager;
	
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

	
	
	public static RuntimeObject onRelationAdded(RuntimeObject mmRO, RuntimeObject linkRO, RuntimeObject compositionRO, RuntimeObject srcClassRO, 
											RuntimeObject tarClassRO, RuntimeObject srcNameRO, RuntimeObject srcCardRO, RuntimeObject tarNameRO,
											RuntimeObject tarCardRO, RuntimeObject positionRO, RuntimeObject compositionAtSourceRO) {
		MetamodelView metamodelView = (MetamodelView) mmRO.getUserData();
		int position		  	= Integer.getValue(positionRO);
		EntityView srcClass    	= (EntityView) srcClassRO.getUserData();
		EntityView tarClass    	= (EntityView) tarClassRO.getUserData();
		String srcRole			= srcNameRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(srcNameRO);
		String targetRole		= tarNameRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(tarNameRO);
		String srcCard			= srcCardRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(srcCardRO);
		String targetCard		= tarCardRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(tarCardRO);
		boolean compoAtSrc		= Boolean.getValue(compositionAtSourceRO);
		
		if(targetRole!=null) {
			//checking if the target relation has been already added by its opposite.
			boolean again = true;
			int i=0, size = metamodelView.links.size();
			LinkView link;
			RelationView rel;
			
			while(again && i<size) {
				link = metamodelView.links.get(i);
				
				if(link.entitySrc==tarClass && link.entityTar==srcClass && link instanceof RelationView) {
					rel = (RelationView)link;
					
					if(rel.endingTar.name.text.equals(srcRole) && rel.endingTar.card.text.equals(srcCard))
						again = false;
				}
				
				i++;
			}
			
			if(!again)
				return mmRO.getFactory().getMemory().voidINSTANCE;
		}
		
		LinkView view = new RelationView(srcClass, tarClass, Boolean.getValue(compositionRO), compoAtSrc,
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
	
	
	
	
	public void updateLayout() {
		Map<EntityView, EntityView> hashMap = new IdentityHashMap<EntityView, EntityView>();
		ArrayList<ArrayList<ArrayList<EntityView>>> forest = new ArrayList<ArrayList<ArrayList<EntityView>>>();
		ArrayList<ArrayList<EntityView>> levels;
		
		for(EntityView entity : entities)
			if(entity.isVisible())
				hashMap.put(entity, entity);
		
		ArrayList<EntityView> roots = getRootEntities(this);
		
		while(!roots.isEmpty()) {
			if(hashMap.get(roots.get(0))!=null) {
				levels = new ArrayList<ArrayList<EntityView>>(); 
				
				setLevels(roots.get(0), levels, hashMap);
				forest.add(levels);
			}
			roots.remove(0);
		}
		
		for(ArrayList<ArrayList<EntityView>> subForest : forest) {
			System.out.println("---------------------");
			
			for(ArrayList<EntityView> level : subForest) {
				for(EntityView entity : level)
					System.out.print(entity.name + " "); 
				System.out.print("\n-\n");
			}
		}
		
		setMetamodelPosition(forest);
		recentre();
		updatePreferredSize();
		revalidate();
	}
	
	
	
	protected void setMetamodelPosition(ArrayList<ArrayList<ArrayList<EntityView>>> forest) {
		Point2D pointMax = new Point2D.Double();
		
		for(ArrayList<ArrayList<EntityView>> subForest : forest)
			if(!subForest.isEmpty())
				setPositions(subForest, 0, pointMax.getX()+110, pointMax);
	}
	
	
	
	protected Rectangle2D setPositions(ArrayList<ArrayList<EntityView>> subForest, int level, double x, Point2D pointMax) {
		Rectangle2D bounds = setLevelPositions(subForest.get(level), x, 0);
		
		if(subForest.size()>(level+1)) {
			Rectangle2D rec = setPositions(subForest, level+1, x, pointMax);
			final double gapX = rec.getCenterX()-bounds.getCenterX();
			final double gapY = bounds.getMinY() - rec.getMinY() + bounds.getHeight() + 110;

			for(EntityView entity : subForest.get(level))
				entity.setCentre((int)(entity.getCentre().x+gapX), (int)(entity.getCentre().y-gapY));
			
			bounds.setFrame(bounds.getX()+gapX, bounds.getY()-gapY, bounds.getWidth(), bounds.getHeight());
		}
		
		if(bounds.getMaxX()>pointMax.getX())
			pointMax.setLocation(bounds.getMaxX(), pointMax.getY());
		
		if(bounds.getMaxY()>pointMax.getY())
			pointMax.setLocation(pointMax.getX(), bounds.getMaxY());
		
		return bounds;
	}
	
	
	
	protected Rectangle2D setLevelPositions(final ArrayList<EntityView> level, final double x, final double y) {
		Dimension dim 	= new Dimension(0, 0);
		final int size 	= level.size();
		int i			= 0;
		Dimension entityDim;
		EntityView entity;
		double x2 = x;
		final double gapClass = 110;
		
		while(i<size) {
			entity    = level.get(i);
			entityDim = entity.getPreferredSize();
			
			if(entityDim.height>dim.height)
				dim.height = entityDim.height;
			
			entity.setCentre((int)(x2+entityDim.width/2.), (int)(y+entityDim.height/2.));
			x2 += entityDim.width;
			dim.width += entityDim.width;
			
			if((i+1)<size) {
				dim.width 	+= gapClass;
				x2 			+= gapClass;
			}
			
			i++;
		}
		
		return new Rectangle2D.Double(x, y, dim.width, dim.height);
	}
	
	
	
	
	protected void setLevels(EntityView root, ArrayList<ArrayList<EntityView>> levels, Map<EntityView, EntityView> hashMap) {
		if(levels.isEmpty())
			levels.add(new ArrayList<EntityView>());
		
		hashMap.remove(root);
		levels.get(0).add(root);
		setLevels(root, levels, 1, hashMap);
	}
	
	
	
	protected void setLevels(EntityView entity, ArrayList<ArrayList<EntityView>> levels, int level, Map<EntityView, EntityView> hashMap) {
		ArrayList<EntityView> subClasses = getDirectSubClasses(entity, this);

		for(EntityView subClass : subClasses) {
			if(hashMap.get(subClass)!=null) {
				hashMap.remove(subClass);
				
				if((levels.size()-1)<level)
					levels.add(new ArrayList<EntityView>());
					
				levels.get(level).add(subClass);
				setLevels(subClass, levels, level+1, hashMap);
			}
		}
	}
	
	
	
	public static ArrayList<EntityView> getDirectSubClasses(EntityView entity, MetamodelView metamodel) {
		ArrayList<EntityView> sub = new ArrayList<EntityView>();
		
		for(LinkView link : metamodel.links)
			if(link instanceof InheritanceView && ((InheritanceView)link).entityTar==entity)
				sub.add(((InheritanceView)link).entitySrc);
		
		return sub;
	}
	
	
	
	
	public static ArrayList<EntityView> getRootEntities(MetamodelView metamodel) {
		ArrayList<EntityView> roots = new ArrayList<EntityView>();
		boolean again;
		int i;
		final int size = metamodel.links.size();
		LinkView link;
		
		for(EntityView entityView : metamodel.entities) {
			i = 0;
			again = true;
			
			while(again && i<size) {
				link = metamodel.links.get(i);
				
				if(link instanceof InheritanceView && ((InheritanceView)link).entitySrc==entityView)
					again = false;
				
				i++;
			}
			
			if(again && !roots.contains(entityView))
				roots.add(entityView);
		}
		
		return roots;
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
		
		for(EntityView entity : entities)
			if(entity.isVisible()) {
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
	public FloatingText draggedLabel;//TODO to remove!!
	public int startX;
	public int startY;
	
	public void mousePressed(MouseEvent e) {//TODO to remove
		if(MetamodelVizuFrame.hand.isSelected()) {
			draggedLabel = null;
			int i = links.size()-1;
			LinkView link;
			RelationView rel;
			
			while(draggedLabel==null && i>=0) {
				link = links.get(i);
				
				if(link instanceof RelationView && link.isVisible()) {
					rel = (RelationView) link;
					rel.update();
					if(rel.endingSrc.name.contains(e.getX()*zoom, e.getY()*zoom)) {
						draggedLabel = rel.endingSrc.name;
						startX = e.getX();
						startY = e.getY();
					} else if(rel.endingSrc.card.contains(e.getX()*zoom, e.getY()*zoom)) {
						draggedLabel = rel.endingSrc.card;
						startX = e.getX();
						startY = e.getY();
					} else if(rel.endingTar.name.contains(e.getX()*zoom, e.getY()*zoom)) {
						draggedLabel = rel.endingTar.name;
						startX = e.getX();
						startY = e.getY();
					} else if(rel.endingTar.card.contains(e.getX()*zoom, e.getY()*zoom)) {
						draggedLabel = rel.endingTar.card;
						startX = e.getX();
						startY = e.getY();
					}
				}
				i--;
			}
				
			if(draggedLabel==null) {
				draggedShape = null;
				i = entities.size()-1;
				
				while(draggedShape==null && i>=0) {
					if(entities.get(i).isVisible() && entities.get(i).getBorders().contains(e.getX()*zoom, e.getY()*zoom)) {
						draggedShape = entities.get(i);
						startX = e.getX();
						startY = e.getY();
					}
					else
						i--;
				}
			}
			else {
				draggedLabel.setManualPosition(e.getX(), e.getY());
			}
		}
	}


	public void mouseReleased(MouseEvent e) {
		draggedShape = null;
		draggedLabel = null;
		startX = 0;
		startY = 0;
	}


	public void mouseDragged(MouseEvent e) {
		int gapX = e.getX() - startX;
		int gapY = e.getY() - startY;
		
		if(draggedLabel!=null) {
			draggedLabel.setPosition(draggedLabel.getPosition().x + gapX, draggedLabel.getPosition().y + gapY);
			startX = e.getX();
			startY = e.getY();
			
			repaint();
		} else
			if(draggedShape!=null) {
				draggedShape.setCentre((int)draggedShape.getCentre().x + gapX, (int)draggedShape.getCentre().y + gapY);
				startX = e.getX();
				startY = e.getY();
				
				draggedShape.update();
				
				for(LinkView link : links)
					if(link.getEntitySrc()==draggedShape || link.getEntityTar()==draggedShape)
						link.update();
					
				repaint();
				updatePreferredSize();
				revalidate();
			}
	}


	public void mouseMoved(MouseEvent e) {
		// 
	}
}
