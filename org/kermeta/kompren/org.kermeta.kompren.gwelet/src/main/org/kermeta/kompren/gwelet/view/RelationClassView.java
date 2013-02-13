package org.kermeta.kompren.gwelet.view;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import org.kermeta.kompren.diagram.view.impl.RelationView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.gwelet.view.RoleView.Cardinality;

/**
 * Defines a relation established between two classes.
 * @author Arnaud Blouin
 */
public class RelationClassView extends RelationView {
	/** The role of the beginning of the relation. */
	protected RoleView roleSrc;

	/** The role of the beginning of the relation. */
	protected RoleView roleTar;

	protected boolean isComposition;


	/**
	 * @see RelationView
	 */
	public RelationClassView(final IEntityView src, final IEntityView target, final boolean isComposition, final boolean compositionAtStart,
							final String srcRole, final String targetRole, final Cardinality srcCard, final Cardinality targetCard) {
		super(src, target);

		this.isComposition = isComposition;

		if(isComposition)
			if(compositionAtStart)
				setSourceDecoration(new CompositionDecorationView(this, getFirstSegment(), true));
			else
				setTargetDecoration(new CompositionDecorationView(this, getLastSegment(), false));

		if(targetRole==null || srcRole==null || targetRole.length()==0 || srcRole.length()==0)
			setTargetDecoration(new RelationDecorationView(this, getLastSegment(), false));

		if(srcRole!=null && srcRole.length()>0 && srcCard!=null)
			roleSrc = new RoleView(srcRole, srcCard, this, false, isComposition && !compositionAtStart);

		if(targetRole!=null && targetRole.length()>0 && targetCard!=null)
			roleTar = new RoleView(targetRole, targetCard, this, true, isComposition && compositionAtStart);
	}


	public boolean equalsValue(final RelationClassView rcv) {
		if(rcv==null) return false;

		boolean eq;

		if(roleSrc==null)
			eq = rcv.getRoleSrc()==null;
		else
			eq = roleSrc.equalsValue(rcv.getRoleSrc());

		if(eq)
			if(roleTar==null)
				eq = rcv.getRoleTar()==null;
			else
				eq = roleTar.equalsValue(rcv.getRoleTar());

		return eq;
	}


	@Override
	public Rectangle2D getBorders() {
		Rectangle2D rec = super.getBorders();

		rec = getBordersWithRole(rec, roleSrc);
		rec = getBordersWithRole(rec, roleTar);

		return rec;
	}


	private static Rectangle2D getBordersWithRole(final Rectangle2D sourceBorder, final RoleView role) {
		Rectangle2D rec = sourceBorder;

		if(role!=null) {
			Rectangle2D roleBorder = role.getBorders();

			if(roleBorder!=null)
				rec = rec.createUnion(roleBorder);
		}

		return rec;
	}



	@Override
	public boolean contains(final double x, final double y) {
		boolean contains = super.contains(x, y);

		if(!contains) {
			if(roleSrc!=null)
				contains = roleSrc.getBorders().contains(x, y);
			if(!contains && roleTar!=null)
				contains = roleTar.getBorders().contains(x, y);
		}

		return contains;
	}


	@Override
	public void paint(final Graphics2D g) {
		super.paint(g);

		g.setColor(getLineColor());

		if(roleSrc!=null)
			roleSrc.paint(g);

		if(roleTar!=null)
			roleTar.paint(g);
	}


	public RoleView getRoleSrc() {
		return roleSrc;
	}


	public RoleView getRoleTar() {
		return roleTar;
	}


	public void reinitRoles() {
		if(roleSrc!=null)
			roleSrc.reinitTextPositions();

		if(roleTar!=null)
			roleTar.reinitTextPositions();
	}


	public boolean isComposition() {
		return isComposition;
	}


	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
