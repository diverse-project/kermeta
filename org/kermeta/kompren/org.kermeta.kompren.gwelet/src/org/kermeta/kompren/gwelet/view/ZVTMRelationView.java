package org.kermeta.kompren.gwelet.view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.kompren.diagram.view.impl.RelationView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.ISegmentView;

import fr.inria.zvtm.glyphs.Composite;
import fr.inria.zvtm.glyphs.VSegment;

public class ZVTMRelationView extends RelationView {
	protected Composite glyphRelation;

	protected List<VSegment> glyphSegment;

	public ZVTMRelationView(final IEntityView src, final IEntityView target) {
		super(src, target);

		glyphRelation = new Composite();
		glyphSegment = new ArrayList<VSegment>();
	}


	public Composite getGlyph() {
		return glyphRelation;
	}


	@Override
	public void update() {
		final int size = segments.size();
		ISegmentView seg;
		VSegment vseg;

		while(glyphSegment.size()>size)
			glyphRelation.removeChild(glyphSegment.remove(0));

		while(glyphSegment.size()<size) {
			vseg = new VSegment(0, 0, 1, 1, 0, Color.BLACK);
			glyphSegment.add(vseg);
			glyphRelation.addChild(vseg);
		}

		for(int i=0; i<size; i++) {
			seg = segments.get(i);
			glyphSegment.get(i).setEndPoints(seg.getPointSource().getX(), seg.getPointSource().getY(), seg.getPointTarget().getX(), seg.getPointTarget().getY());
			glyphSegment.get(i).setColor(getLineColor());
		}
	}


	@Override
	public void translate(final double tx, final double ty) {
		super.translate(tx, ty);
		update();
	}
}
