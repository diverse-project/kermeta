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
import org.kermeta.ki.diagram.view.interfaces.IAnchor;
import org.kermeta.ki.diagram.view.interfaces.IDiagramView;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;
import org.kermeta.ki.diagram.view.interfaces.ISelectable;

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
	
	/** The selected objects. */
	protected List<ISelectable> selection;
	
	/** The name of the font to use. */
	protected String fontName;
	
	/** The strategy used to layout the diagram. */
	protected ILayoutStrategy strategy;
	
	
	/**
	 * Initialises the diagram.
	 */
	public DiagramView(final boolean withScrollPane) {
		super();
		
		zoom 			= 1.;
		entities 		= new ArrayList<IEntityView>();
		relations		= new ArrayList<IRelationView>();
		selection		= new ArrayList<ISelectable>();
		
		if(withScrollPane)
			scrollPane = new JScrollPane(this);
	}
	
	
	@Override
	public List<IEntityView> getEntities() {
		return entities;
	}

	
	
	@Override
	public int getNbEntities() {
		return entities.size();
	}
	
	
	@Override
	public int getNbRelations() {
		return relations.size();
	}
	
	
	@Override
	public IEntityView getEntityAt(final int i) {
		return entities.get(i);
	}
	
	
	@Override
	public IRelationView getRelationAt(final int i) {
		return relations.get(i);
	}
	
	
	
	@Override
	public void focusOnEntity(final IEntityView view) {
		final Point2D centre = view.getCentre();
		final JScrollBar vertSB  = scrollPane.getVerticalScrollBar();
		final JScrollBar horizSB = scrollPane.getHorizontalScrollBar();

		if(vertSB.isVisible()) {
			final BoundedRangeModel model = vertSB.getModel();
			final int value	= model.getValue();
			final int cy 	= scrollPane.getHeight()/2 + value;
			int newValue 	= value+((int)(centre.getY()*zoom))-cy;
			
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
			int newValue 	= value+((int)(centre.getX()*zoom))-cx;
			
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
		
		for(final IRelationView relation : relations)
			relation.update();
		
		updatePreferredSize();
		refresh();
	}
	
	
	
	@Override
	public void recentre() {
		Rectangle2D rec;
		double xMin = Double.MAX_VALUE;
		double yMin = Double.MAX_VALUE;

		for(final IEntityView entity : entities) {
			rec = entity.getBorders();
			if(rec.getMinX() < xMin) xMin = rec.getMinX();
			if(rec.getMinY() < yMin) yMin = rec.getMinY();
		}
		
		for(final IRelationView relation : relations) {
			rec = relation.getBorders();
			if(rec.getMinX() < xMin) xMin = rec.getMinX();
			if(rec.getMinY() < yMin) yMin = rec.getMinY();
		}

		xMin = 10-xMin;
		yMin = 10-yMin;
		
		for(IEntityView entity : entities)
			entity.translate(xMin, yMin);
		
		for(IRelationView relation : relations) {
			relation.translate(xMin, yMin);
			relation.update();
		}
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
		return new ArrayList<IEntityView>();
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
	public void addRelation(final int position, final IRelationView relation) {
		if(relation!=null && position<entities.size() && position>=0) {
			relations.add(position, relation);
			anchorRelation(relation);
		}
	}
	
	
	@Override
	public void addRelation(final IRelationView relation) {
		if(relation!=null) {
			relations.add(relation);
			anchorRelation(relation);
		}
	}
	
	
	
	protected static void anchorRelation(final IRelationView relation) {
		relation.getEntitySrc().anchorRelation(relation, relation.getEntityTar(), false);
		relation.getEntityTar().anchorRelation(relation, relation.getEntitySrc(), true);
	}
	
	
	
	@Override
	public void addEntity(final int position, final IEntityView entity) {
		if(entity!=null && position<entities.size() && position>=0)
			entities.add(position, entity);
		else
			if((position==-1 || position==entities.size()) && entity!=null)
				entities.add(entity);
	}


	@Override
	public double getZoom() {
		return zoom;
	}


	@Override
	public void setZoom(final double zoom) {
		if(zoom>0)
			this.zoom = zoom;
	}


	@Override
	public void zoomDefault() {
		zoom = 1.;
	}


	@Override
	public void zoomIn(final double increment) {
		zoom += increment;
	}


	@Override
	public void zoomOut(final double decrement) {
		if((zoom-decrement)>0.)
			zoom -= decrement;
	}
	
	
	@Override
	public void addToSelection(final IEntityView entity) {
		if(entity!=null)
			selection.add(entity);
	}


	@Override
	public void addToSelection(final List<IEntityView> newSelection) {
		if(newSelection!=null)
			for(IEntityView sh : newSelection)
				if(sh!=null)
					selection.add(sh);
	}


	@Override
	public List<ISelectable> getSelection() {
		return selection;
	}


	@Override
	public void removeFromSelection(final ISelectable entity) {
		if(entity!=null)
			selection.remove(entity);
	}


	@Override
	public void removeSelection() {
		selection.clear();
	}


	@Override
	public void setSelection(final ISelectable sel) {
		selection.clear();

		if(sel!=null)
			selection.add(sel);
	}


	@Override
	public void setSelection(final List<ISelectable> newSelection) {
		selection.clear();

		if(newSelection!=null)
			for(ISelectable sel : newSelection)
				if(sel!=null)
					selection.add(sel);
	}
	
	
	@Override
	public void moveEntity(final IEntityView entity, final double x, final double y) {
		if(entity!=null)
			translateEntity(entity, x-entity.getX(), y-entity.getY());
	}
	
	
	@Override
	public void translateEntity(final IEntityView entity, final double tx, final double ty) {
		if(entity!=null) {
			Point2D pt;
			
			entity.translate(tx, ty);
			
			for(final IRelationView rel : relations)
				if(rel.getEntitySrc()==entity || rel.getEntityTar()==entity) {
					for(int i=0, nbSeg=rel.getNbSegment(); i<(nbSeg-1); i++) {
						pt = rel.getSegment(i).getPointTarget();
						pt.setLocation(pt.getX()+tx, pt.getY()+ty);
					}
					
					rel.update();
				}
		}
	}
	
	
	@Override
	public void relayoutRelations() {
		for(final IEntityView entity : entities)
			for(final IAnchor anchor : entity.getAnchors())
				anchor.setFree(true);
		
		for(final IRelationView relation : relations) {
			anchorRelation(relation);
			relation.update();
		}
	}


	@Override
	public void setZoom(final int x, final int y, final double zoomLevel) {
		if(zoomLevel>0)
			zoom = zoomLevel;
	}
}
