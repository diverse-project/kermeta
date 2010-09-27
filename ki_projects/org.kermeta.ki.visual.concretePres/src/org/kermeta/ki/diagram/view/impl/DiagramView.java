package org.kermeta.ki.diagram.view.impl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoundedRangeModel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.SwingConstants;

import org.kermeta.ki.diagram.layout.ILayoutStrategy;
import org.kermeta.ki.diagram.view.interfaces.IDiagramView;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;
import org.kermeta.ki.visual.view.InheritanceView;

/**
 * Implements a diagram that contains entities and relations.
 * @author Arnaud Blouin
 */
public class DiagramView extends JPanel implements IDiagramView {
	private static final long serialVersionUID = 1L;

	/** The zoom applied on the diagram. */
	protected double zoom;
	
	/** The scroll pane providing scrool bars. */
	protected JScrollPane scrollPane;
	
	/** The entities of the diagram. */
	protected List<IEntityView> entities;
	
	/** The relations of the diagram. */
	protected List<IRelationView> relations;
	
	/** The name of the font to use. */
	protected String fontName;
	
	/** The strategy used to layout the diagram. */
	protected ILayoutStrategy strategy;
	
	
	/**
	 * Initialises the diagram.
	 */
	public DiagramView(final boolean withScrollPane) {
		super();
		
		zoom 		= 1.;
		entities 	= new ArrayList<IEntityView>();
		relations	= new ArrayList<IRelationView>();
		
		if(withScrollPane)
			scrollPane = new JScrollPane(this);
	}
	
	
	@Override
	public void updateRelations() {
		for(IRelationView relation : relations)
			relation.update();
		
		repaint();
	}
	
	
	@Override
	public List<IEntityView> getEntities() {
		return entities;
	}

	
	
	
	@Override
	public void focusOnEntity(final IEntityView view) {
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

	
	
	
	@Override
	public void paint(final Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		g2.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		
		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, getWidth(), getHeight());
		
		g2.scale(zoom, zoom);

		for(IEntityView entity : entities)
			entity.paint(g2);

		for(IRelationView relation : relations)
			relation.paint(g2);
	}
	
	

	@Override
	public String getFontName() {
		return fontName;
	}


	@Override
	public void setFontName(final String fontName) {
		if(fontName!=null) {
			this.fontName = fontName;
			
			for(IEntityView entity : entities)
				entity.setFontName(fontName);
		}
	}


	@Override
	public void addEntity(final IEntityView entity) {
		if(entity!=null)
			entities.add(entity);
	}


	@Override
	public void refresh() {
		revalidate();
		repaint();
	}


	@Override
	public List<IRelationView> getRelations() {
		return relations;
	}


	@Override
	public void addRelation(final IRelationView relation) {
		if(relation!=null)
			relations.add(relation);
	}


	@Override
	public void updateLayout() {
		if(strategy!=null)
			strategy.updateLayout();
	}


	@Override
	public Dimension getPreferredScrollableViewportSize() {	
		return new Dimension(-100, 100);
	}

	
	@Override
	public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
        return (orientation == SwingConstants.VERTICAL) ? visibleRect.height : visibleRect.width;
	}
	
	
	@Override
	public boolean getScrollableTracksViewportHeight() {
		return getParent() instanceof JViewport ? ((JViewport)getParent()).getHeight() > getPreferredSize().height : false;
	}
	

	@Override
	public boolean getScrollableTracksViewportWidth() {
		return getParent() instanceof JViewport ? ((JViewport)getParent()).getWidth() > getPreferredSize().width : false;
	}

	
	@Override
	public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
		return 4;
	}


	@Override
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	
	
	@Override
	public void update() {
		for(final IEntityView entity : entities)
			entity.update();
		
		recentre();
		
		for(final IRelationView relation : relations)
			relation.update();
		
		updatePreferredSize();
		refresh();
	}
	
	
	
	@Override
	public void recentre() {
		double xMin, yMin;
		Point2D centre;
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
		
		for(IEntityView e : entities) {
			centre = e.getCentre();
			centre.setLocation(centre.getX()+xMin, centre.getY()+yMin);
			e.update();
		}
		
		for(IRelationView relation : relations)
			relation.update();
	}
	
	
	
	@Override
	public void updatePreferredSize() {
		double maxX = Double.MIN_VALUE;
		double maxY = Double.MIN_VALUE;
		Rectangle2D dim;
		
		for(IEntityView entity : entities)
			if(entity.isVisible()) {
				dim = entity.getBorders();
				
				if(dim.getMaxX()>maxX)
					maxX = dim.getMaxX();
				if(dim.getMaxY()>maxY)
					maxY = dim.getMaxY();
			}
		
		setPreferredSize(new Dimension((int)(maxX*zoom), (int)(maxY*zoom)));
	}
	
	
	
	@Override
	public List<IEntityView> getRootEntities() {
		List<IEntityView> roots = new ArrayList<IEntityView>();
		boolean again;
		int i;
		final int size = relations.size();
		IRelationView relation;
		
		for(IEntityView entityView : entities) {
			i = 0;
			again = true;
			
			while(again && i<size) {
				relation = relations.get(i);
				
				if(relation instanceof InheritanceView && relation.getEntitySrc()==entityView)
					again = false;
				
				i++;
			}
			
			if(again && !roots.contains(entityView))
				roots.add(entityView);
		}
		
		return roots;
	}


	@Override
	public void setLayoutStrategy(final ILayoutStrategy strategy) {
		this.strategy = strategy;
	}


	@Override
	public ILayoutStrategy getLayoutStrategy() {
		return strategy;
	}
	
	
	@Override
	public boolean removeEntity(final IEntityView entity) {
		return entities.remove(entity);
	}
	
	
	
	@Override
	public boolean removeRelation(final IRelationView relation) {
		return relations.remove(relation);
	}
	

	@Override
	public void addRelation(final int position, final IRelationView link) {
		if(link!=null && position<entities.size() && position>=0)
			relations.add(position, link);
		else
			if((position==-1 || position==entities.size()) && link!=null)
				relations.add(link);
	}
	
	
	
	@Override
	public void addEntity(final int position, final IEntityView entity) {
		if(entity!=null && position<entities.size() && position>=0)
			entities.add(position, entity);
		else
			if((position==-1 || position==entities.size()) && entity!=null)
				entities.add(entity);
	}
}
