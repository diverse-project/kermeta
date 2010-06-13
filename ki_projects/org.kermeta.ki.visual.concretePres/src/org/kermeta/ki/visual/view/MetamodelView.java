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

import javax.swing.BoundedRangeModel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.Scrollable;
import javax.swing.SwingConstants;

import org.kermeta.ki.malai.Zoomable;
import org.kermeta.ki.visual.MetamodelVizuFrame;
import org.kermeta.ki.visual.view.ComponentView.Visibility;

public class MetamodelView extends JPanel implements Scrollable, Zoomable, MouseListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;

	protected List<EntityView> entities;
	
	protected List<LinkView> links;
	
	protected double zoom;
	
	protected boolean operationsVisible;
	
	protected boolean attributesVisible;
	
	protected JScrollPane scrollPane;
	
	
	
	public void focusOnTypeDefinition(final EntityView view) {
		final Point2D.Double centre = view.getCentre();
		final JScrollBar vertSB  = scrollPane.getVerticalScrollBar();
		final JScrollBar horizSB = scrollPane.getHorizontalScrollBar();

		if(vertSB.isVisible()) {
			final BoundedRangeModel model = vertSB.getModel();
			final int value	= model.getValue();
			final int cy 	= scrollPane.getHeight()/2 + value;
			int newValue 	= value+((int)(centre.y*zoom))-cy;
			
			if(newValue>model.getMaximum())
				newValue = model.getMaximum();
			else if(newValue<model.getMinimum())
				newValue = model.getMinimum();
			
			model.setValue(newValue);
		}
		
		if(horizSB.isVisible()) {
			final BoundedRangeModel model = horizSB.getModel();
			final int value	= model.getValue();
			final int cx 	= scrollPane.getWidth()/2 + value;
			int newValue 	= value+((int)(centre.x*zoom))-cx;
			
			if(newValue>model.getMaximum())
				newValue = model.getMaximum();
			else if(newValue<model.getMinimum())
				newValue = model.getMinimum();
			
			model.setValue(newValue);
		}
	}
	
	
	public boolean isOperationsVisible() {
		return operationsVisible;
	}
	
	
	public boolean isPropertiesVisible() {
		return attributesVisible;
	}
	
	
	public void setOperationsVisible(final boolean visible) {
		operationsVisible = visible;
	}
	
	
	public void setPropertiesVisible(final boolean visible) {
		attributesVisible = visible;
	}
	
	
	
	public void updateArrows() {
		for(LinkView link : links)
			link.update();
		
		repaint();
	}
	

	
	public void removeEntity(final EntityView view) {
		entities.remove(view);
	}
	
	
	public EntityView addEntity(final String name, final int position, final boolean isAspect) {
		EntityView view = null;
		
		if(isAspect) {
			int i = 0;
			final int size = entities.size();
			
			while(view==null && i<size) {
				if(entities.get(i).getName().equals(name))
					view = entities.get(i);
				else
					i++;
			}
			
			if(view==null)
				System.err.println("ERROR KI: aspect added but not its reference class");
			
			return view;
		}
		
		view = new ClassView(name, this);
		addEntity(position, view);
		
		return view;
	}
	
	
	
	public LinkView addRelation(final EntityView srcClass, final EntityView tarClass, final boolean isComposition, final boolean isCompoAtSrc, 
						final String srcRole, final String targetRole, final String srcCard, final String targetCard, final int position) {
		if(targetRole!=null) {
			//checking if the target relation has been already added by its opposite.
			boolean again 	= true;
			int i 			= 0;
			final int size 	= links.size();
			LinkView link;
			RelationView rel;
			
			while(again && i<size) {
				link = links.get(i);
				
				if(link.entitySrc==tarClass && link.entityTar==srcClass && link instanceof RelationView) {
					rel = (RelationView)link;
					
					if(rel.endingTar.name.text.equals(srcRole) && rel.endingTar.card.text.equals(srcCard))
						again = false;
				}
				
				i++;
			}
			
			if(!again)
				return null;
		}
		
		final LinkView view = new RelationView(srcClass, tarClass, isComposition, isCompoAtSrc, srcRole, targetRole, srcCard, targetCard);
		view.visibility = Visibility.STANDARD;
		addLink(position, view);
		
		return view;
	}
	
	
	
	public void removeLink(final LinkView link) {
		links.remove(link);
	}
	
	
	
	public InheritanceView removeInheritanceView(final EntityView src, final EntityView tar) {
		InheritanceView view = null;
		boolean again	= true;
		final int size	= links.size();
		int i			= 0;
		LinkView link;
		
		while(again && i<size) {
			link = links.get(i);
			
			if(link instanceof InheritanceView) {
				view = (InheritanceView) link;
				
				if(view.entitySrc==src && view.entityTar==tar) {
					links.remove(link);
					again = false;
				}
			}
			
			i++;
		}
		
		return again ? null : view;
	}
	
	

	public InheritanceView addInheritanceView(final EntityView src, final EntityView tar, final int position) {
		final InheritanceView view = new InheritanceView(src, tar);
		
		view.visibility = Visibility.STANDARD;
		addLink(position, view);
		
		return view;
	}
	
	
	public void update() {
		for(final EntityView entity : entities)
			entity.update();
		
		recentre();
		
		for(final LinkView link : links)
			link.update();
		
		repaint();
		updatePreferredSize();
		revalidate();
	}
	
	
	
	public MetamodelView() {
		super();

		operationsVisible = true;
		attributesVisible = true;
		entities  	 = new ArrayList<EntityView>();
		links 		 = new ArrayList<LinkView>();
		zoom		 = 1.;
		
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
		
		g2.scale(zoom, zoom);

		for(EntityView entity : entities)
			entity.paint(g2);
		
		for(LinkView link : links)
			link.paint(g2);
	}
	
	
	public void addClassView(String name) {
		entities.add(new ClassView(name, this));
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

	
	
	public void setScrollPane(final JScrollPane scrollPane) {
		if(scrollPane!=null)
			this.scrollPane = scrollPane;
	}
	

	public EntityView draggedShape;//TODO to remove!!
	public FloatingText draggedLabel;//TODO to remove!!
	public double startX;
	public double startY;
	
	public void mousePressed(MouseEvent e) {//TODO to remove
		if(MetamodelVizuFrame.hand.isSelected()) {
			draggedLabel = null;
			int i = links.size()-1;
			LinkView link;
			RelationView rel;
			final double px = e.getX()/zoom;
			final double py = e.getY()/zoom;
			
			while(draggedLabel==null && i>=0) {
				link = links.get(i);
				
				if(link instanceof RelationView && link.isVisible()) {
					rel = (RelationView) link;
					rel.update();
					if(rel.endingSrc.name.contains(px, py)) {
						draggedLabel = rel.endingSrc.name;
						startX = px;
						startY = py;
					} else if(rel.endingSrc.card.contains(px, py)) {
						draggedLabel = rel.endingSrc.card;
						startX = px;
						startY = py;
					} else if(rel.endingTar.name.contains(px, py)) {
						draggedLabel = rel.endingTar.name;
						startX = px;
						startY = py;
					} else if(rel.endingTar.card.contains(px, py)) {
						draggedLabel = rel.endingTar.card;
						startX = px;
						startY = py;
					}
				}
				i--;
			}
				
			if(draggedLabel==null) {
				draggedShape = null;
				i = entities.size()-1;
				
				while(draggedShape==null && i>=0) {
					if(entities.get(i).isVisible() && entities.get(i).getBorders().contains(px, py)) {
						draggedShape = entities.get(i);
						startX = px;
						startY = py;
					}
					else
						i--;
				}
			}
			else {
				draggedLabel.setManualPosition(px, py);
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
		final double gapX = e.getX()/zoom - startX;
		final double gapY = e.getY()/zoom - startY;
		
		if(draggedLabel!=null) {
			draggedLabel.setPosition(draggedLabel.getPosition().x + gapX, draggedLabel.getPosition().y + gapY);
			startX = e.getX()/zoom;
			startY = e.getY()/zoom;
			
			repaint();
		} else
			if(draggedShape!=null) {
				draggedShape.setCentre((int)(draggedShape.getCentre().x + gapX), (int)(draggedShape.getCentre().y + gapY));
				startX = e.getX()/zoom;
				startY = e.getY()/zoom;
				
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
