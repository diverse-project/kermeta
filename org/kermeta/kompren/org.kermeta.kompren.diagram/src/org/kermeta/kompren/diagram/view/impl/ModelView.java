package org.kermeta.kompren.diagram.view.impl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoundedRangeModel;
import javax.swing.JScrollBar;

import org.kermeta.kompren.diagram.layout.ILayoutStrategy;
import org.kermeta.kompren.diagram.view.interfaces.IAnchor;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IModelView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.kermeta.kompren.diagram.view.interfaces.Selectable;
import org.malai.picking.Pickable;
import org.malai.picking.Picker;
import org.malai.properties.Zoomable;
import org.malai.widget.MPanel;

/**
 * Implements a diagram that contains entities and relations.
 * @author Arnaud Blouin
 */
public class ModelView extends MPanel implements IModelView {
	private static final long serialVersionUID = 1L;

	/** The zoom applied on the diagram. */
	protected double zoom;

	/** The entities of the diagram. */
	protected List<IEntityView> entities;

	/** The relations of the diagram. */
	protected List<IRelationView> relations;

	/** The selected objects. */
	protected List<Selectable> selection;

	/** The name of the font to use. */
	protected String fontName;

	/** The strategy used to layout the diagram. */
	protected ILayoutStrategy strategy;


	/**
	 * Initialises the diagram.
	 */
	public ModelView(final boolean withScrollPane) {
		super(withScrollPane, true);
		zoom 			= 1.;
		entities 		= new ArrayList<IEntityView>();
		relations		= new ArrayList<IRelationView>();
		selection		= new ArrayList<Selectable>();
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
		final JScrollBar vertSB  = getScrollpane().getVerticalScrollBar();
		final JScrollBar horizSB = getScrollpane().getHorizontalScrollBar();

		if(vertSB.isVisible()) {
			final BoundedRangeModel model = vertSB.getModel();
			final int value	= model.getValue();
			final int cy 	= getScrollpane().getHeight()/2 + value;
			int newValue 	= value+(int)(centre.getY()*zoom)-cy;

			if(newValue>model.getMaximum())
				newValue = model.getMaximum();
			else if(newValue<model.getMinimum())
				newValue = model.getMinimum();

			model.setValue(newValue);
		}

		if(horizSB.isVisible()) {
			final BoundedRangeModel model = horizSB.getModel();
			final int value	= model.getValue();
			final int cx 	= getScrollpane().getWidth()/2 + value;
			int newValue 	= value+(int)(centre.getX()*zoom)-cx;

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

		g2.scale(1./zoom, 1./zoom);
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

		for(IEntityView entity : entities) {
			entity.translate(xMin, yMin);
			entity.update();
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
	public void addToSelection(final IEntityView entity) {
		if(entity!=null) {
			selection.add(entity);
			entity.setSelected(true);
		}
	}


	@Override
	public void addToSelection(final List<IEntityView> newSelection) {
		if(newSelection!=null)
			for(IEntityView entity : newSelection)
				if(entity!=null) {
					selection.add(entity);
					entity.setSelected(true);
				}
	}


	@Override
	public List<Selectable> getSelection() {
		return selection;
	}


	@Override
	public void removeFromSelection(final Selectable entity) {
		if(entity!=null) {
			selection.remove(entity);
			entity.setSelected(false);
		}
	}


	@Override
	public void removeSelection() {
		for(Selectable sel : selection)
			sel.setSelected(false);

		selection.clear();
	}


	@Override
	public void setSelection(final Selectable sel) {
		removeSelection();

		if(sel!=null) {
			selection.add(sel);
			sel.setSelected(true);
		}
	}


	@Override
	public void setSelection(final List<Selectable> newSelection) {
		removeSelection();

		if(newSelection!=null)
			for(Selectable sel : newSelection) {
				selection.add(sel);
				sel.setSelected(true);
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
	public Pickable getPickableAt(final double x, final double y) {
		Pickable pk = null;
		IEntityView ent;

		for(int i=0, size=entities.size(); i<size && pk==null; i++) {
			ent = entities.get(i);
			if(ent.isSelectable() && ent.contains(x, y))
				pk = ent;
		}

		return pk;
	}


	@Override
	public Picker getPickerAt(final double x, final double y) {
		return null;
	}


	@Override
	public boolean contains(final Object obj) {
		return entities.contains(obj) || relations.contains(obj);
	}



	@Override
	public void setZoom(final double x, final double y, final double zoomingLevel) {
		if(zoomingLevel<=Zoomable.MAX_ZOOM && zoomingLevel>=Zoomable.MIN_ZOOM) {
			this.zoom = zoomingLevel;
			update();
		}
	}


	@Override
	public Point2D getZoomedPoint(final double x, final double y) {
		return new Point2D.Double(x/zoom, y/zoom);
	}


	@Override
	public Point2D getZoomedPoint(final Point pt) {
		return pt==null ? new Point2D.Double() : getZoomedPoint(pt.x, pt.y);
	}
}
