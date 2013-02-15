package org.kermeta.kompren.diagram.view.impl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
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
import org.malai.mapping.ActiveArrayList;
import org.malai.mapping.IActiveList;
import org.malai.picking.Pickable;
import org.malai.picking.Picker;
import org.malai.widget.MPanel;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Implements a diagram that contains entities and relations.
 * @author Arnaud Blouin
 */
public class ModelView extends MPanel implements IModelView {
	private static final long serialVersionUID = 1L;

	/** The zoom applied on the diagram. */
	protected double zoom;

	/** The entities of the diagram. */
	protected IActiveList<IEntityView> entities;

	/** The relations of the diagram. */
	protected IActiveList<IRelationView> relations;

	/** The selected objects. */
	protected IActiveList<Selectable> selection;

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
		entities 		= new ActiveArrayList<IEntityView>();
		relations		= new ActiveArrayList<IRelationView>();
		selection		= new ActiveArrayList<Selectable>();
		setDoubleBuffered(true);
	}


	@Override
	public IActiveList<IEntityView> getEntities() {
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
	public void setEnabled(final boolean enabled) {
		super.setEnabled(enabled);
		updatePreferredSize();
		refresh();
	}


	@Override
	public void paint(final Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		Rectangle rec = scrollpane.getViewport().getViewRect();
		g.setClip(rec.x, rec.y, rec.width, rec.height);

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		g2.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

		g2.setColor(Color.WHITE);
		g2.fillRect(0, 0, getWidth(), getHeight());

		if(isEnabled()) {
			g2.scale(zoom, zoom);
			Rectangle scene;

			if(scrollpane==null)
				scene=null;
			else {
				scene = scrollpane.getViewport().getViewRect();
				scene.height /= zoom;
				scene.width /= zoom;
				scene.x /= zoom;
				scene.y /= zoom;
			}

			for(IEntityView entity : entities)
				entity.paint(g2, scene);

			for(IRelationView relation : relations)
				relation.paint(g2, scene);

			g2.scale(1./zoom, 1./zoom);
		}
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
	public IActiveList<IRelationView> getRelations() {
		return relations;
	}


	@Override
	public void updateLayout() {
		if(strategy!=null)
			strategy.updateLayout();
	}



	protected void updateModelElements() {
		for(final IEntityView entity : entities)
			entity.update();

		for(final IRelationView relation : relations)
			relation.update();
	}



	@Override
	public void update() {
		updateModelElements();
		updatePreferredSize();
		refresh();
	}



	@Override
	public void recentre() {
		Rectangle2D rec;
		double xMin = Double.MAX_VALUE;
		double yMin = Double.MAX_VALUE;
		final double gap = 4000;

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

		xMin = gap-xMin;
		yMin = gap-yMin;

		for(IEntityView entity : entities) {
			entity.translate(xMin, yMin);
			entity.update();
		}
	}



	@Override
	public void updatePreferredSize() {
		if(isEnabled()) {
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

			setPreferredSize(new Dimension((int)(maxX*zoom)+2000, (int)(maxY*zoom)+2000));
		}
		else setPreferredSize(new Dimension(0, 0));
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
	public IActiveList<Selectable> getSelection() {
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
		final double x2 = x/zoom;
		final double y2 = y/zoom;
		Pickable pk = null;
		IEntityView ent;

		for(int i=0, size=entities.size(); i<size && pk==null; i++) {
			ent = entities.get(i);
			if(ent.isSelectable() && ent.contains(x2, y2))
				pk = ent;
		}

		if(pk==null)
			for(int i=0, size=relations.size(); i<size && pk==null; i++)
				if(relations.get(i).isVisible() && relations.get(i).contains(x2, y2))
					pk = relations.get(i);

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
		if(zoomingLevel<=getMaxZoom() && zoomingLevel>=getMinZoom() && zoomingLevel!=zoom) {
			final double dx = (zoomingLevel-zoom)*x/zoom;
			final double dy = (zoomingLevel-zoom)*y/zoom;
			final Point pt = scrollpane.getViewport().getViewPosition();
			pt.x += dx;
			pt.y += dy;
			this.zoom = zoomingLevel;

			updateModelElements();
			updatePreferredSize();
			getScrollpane().getViewport().setViewPosition(pt);
			revalidate();
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


	@Override
	public void save(final boolean generalPreferences, final String nsURI, final Document document, final Element root) {
		// TODO Auto-generated method stub

	}


	@Override
	public void load(final boolean generalPreferences, final String nsURI, final Element meta) {
		// TODO Auto-generated method stub
	}


	@Override
	public void setModified(final boolean modified) {
		// TODO Auto-generated method stub
	}


	@Override
	public boolean isModified() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void reinit() {
		// TODO Auto-generated method stub
	}


	@Override
	public double getZoomIncrement() {
		return 0.05;
	}


	@Override
	public double getMaxZoom() {
		return 10;
	}


	@Override
	public double getMinZoom() {
		return 0.1;
	}
}
