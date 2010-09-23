package org.kermeta.ki.kompren.view;

import java.awt.Graphics2D;

import org.kermeta.ki.diagram.view.impl.RelationView;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.kompren.view.RoleView.Cardinality;

/**
 * Defines a relation established between two classes.
 * @author Arnaud Blouin
 */
public class RelationClassView extends RelationView {
	/** The role of the beginning of the relation. */
	protected RoleView roleSrc;
	
	/** The role of the beginning of the relation. */
	protected RoleView roleTar;
	
	
	/**
	 * @see RelationView
	 */
	public RelationClassView(final IEntityView src, final IEntityView target, final boolean isComposition, final boolean compositionAtStart,
							final String srcRole, final String targetRole, final Cardinality srcCard, final Cardinality targetCard) {
		super(src, target);
		
		if(isComposition)
			if(compositionAtStart)
				setSourceDecoration(new CompositionDecorationView(this));
			else
				setSourceDecoration(new CompositionDecorationView(this));
		
		if(srcRole==null)
			setTargetDecoration(new RelationDecorationView(this));
		
		if(srcRole!=null)
			roleSrc = new RoleView(srcRole, srcCard, this, true, isComposition && !compositionAtStart);
		
		if(targetRole!=null)
			roleTar = new RoleView(targetRole, targetCard, this, false, isComposition && compositionAtStart);
	}

	
	
	@Override
	public void paint(final Graphics2D g) {
		super.paint(g);
		
		if(roleSrc!=null)
			roleSrc.paint(g);
		
		if(roleTar!=null)
			roleTar.paint(g);
	}
	
	
	@Override
	public void update() {
		super.update();
		
		if(roleSrc!=null)
			roleSrc.update();
		
		if(roleTar!=null)
			roleTar.update();
	}
}
