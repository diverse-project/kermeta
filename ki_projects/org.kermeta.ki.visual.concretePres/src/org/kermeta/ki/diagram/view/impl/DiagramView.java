package org.kermeta.ki.diagram.view.impl;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.kermeta.ki.diagram.view.interfaces.IDiagramView;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;

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
	
	
	/**
	 * Initialises the diagram.
	 */
	public DiagramView() {
		super();
		
		zoom 		= 1.;
		entities 	= new ArrayList<IEntityView>();
		relations	= new ArrayList<IRelationView>();
	}
	
	
	@Override
	public List<IEntityView> getEntities() {
		return entities;
	}

	
	@Override
	public void paint(final Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
		g2.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
		g2.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
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
}
