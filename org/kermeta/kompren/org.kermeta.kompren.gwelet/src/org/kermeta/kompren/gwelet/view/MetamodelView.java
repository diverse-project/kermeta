package org.kermeta.kompren.gwelet.view;

import java.util.ArrayList;
import java.util.List;

import org.kermeta.kompren.diagram.view.impl.ModelView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.kermeta.kompren.gwelet.view.RoleView.Cardinality;

public class MetamodelView extends ModelView {
	private static final long serialVersionUID = 1L;

	protected boolean operationsVisible;

	protected boolean propertiesVisible;


	public MetamodelView(final boolean withScrollPane) {
		super(withScrollPane);

		operationsVisible = true;
		propertiesVisible = true;
		FooHand foo = new FooHand(this);
		addMouseListener(foo);
		addMouseMotionListener(foo);
	}



	@Override
	public List<IEntityView> getRootEntities() {
		List<IEntityView> roots = new ArrayList<IEntityView>();
		boolean again;
		int i;
		final int size = relations.size();
		IRelationView relation;

		for(IEntityView entityView : entities)
			if(entityView.isVisible()) {
				i = 0;
				again = true;

				while(again && i<size) {
					relation = relations.get(i);

					if(relation instanceof InheritanceView && relation.getEntitySrc()==entityView && relation.getEntityTar().isVisible())
						again = false;

					i++;
				}

				if(again && !roots.contains(entityView))
					roots.add(entityView);
			}

		return roots;
	}


	public void setPropertiesVisible(final boolean visible) {
		propertiesVisible = visible;

		for(final IEntityView entity : entities)
			if(entity instanceof ClassView)
				((ClassView)entity).setPropertiesVisible(visible);
	}


	public void setOperationsVisible(final boolean visible) {
		operationsVisible = visible;

		for(final IEntityView entity : entities)
			if(entity instanceof ClassView)
				((ClassView)entity).setOperationsVisible(visible);
	}



	public InheritanceView removeInheritanceView(final IEntityView src, final IEntityView tar) {
		InheritanceView view = null;
		boolean again	= true;
		final int size	= relations.size();
		int i			= 0;
		IRelationView link;

		while(again && i<size) {
			link = relations.get(i);

			if(link instanceof InheritanceView) {
				view = (InheritanceView) link;

				if(view.getEntitySrc()==src && view.getEntityTar()==tar) {
					relations.remove(link);
					again = false;
				}
			}

			i++;
		}

		return again ? null : view;
	}


	public InheritanceView addInheritanceView(final IEntityView src, final IEntityView tar) {
		final InheritanceView view = new InheritanceView(src, tar);
		addRelation(view);
		return view;
	}




	public IRelationView addRelation(final IEntityView srcClass, final IEntityView tarClass, final boolean isComposition, final boolean isCompoAtSrc,
						final String srcRole, final String targetRole, final String srcCard, final String targetCard) {
		if(targetRole!=null) {
			//checking if the target relation has been already added by its opposite.
			boolean again 	= true;
			int i 			= 0;
			final int size 	= relations.size();
			IRelationView link;
			RoleView role;

			while(again && i<size) {
				link = relations.get(i);

				if(link.getEntitySrc()==tarClass && link.getEntityTar()==srcClass && link instanceof RelationClassView) {
					role = ((RelationClassView)link).getRoleTar();

					if(role!=null && role.name.text.equals(srcRole) && role.cardText.text.equals(srcCard))
						again = false;
				}

				i++;
			}

			if(!again)
				return null;
		}

		final IRelationView view = new RelationClassView(srcClass, tarClass, isComposition, isCompoAtSrc, srcRole, targetRole,
														 Cardinality.getCardinality(srcCard), Cardinality.getCardinality(targetCard));
		addRelation(view);

		return view;
	}


	public IEntityView addEntity(final String name, final int position, final boolean isAspect) {
		IEntityView view = null;
		double xMax = -Double.MAX_VALUE;
		double x;
		IEntityView maxEntity = null;

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

		view = new ClassView(name);

		// entities must not located at the same position. Otherwise it may have problem
		// during the anchoring of relations.
		// So we search to maximal X-coordinate.
		for(final IEntityView entityView : entities) {
			x = entityView.getCentre().getX();

			if(x>xMax) {
				xMax 		= x;
				maxEntity 	= entityView;
			}
		}

		// The max coordinate plus a value is set to the view to be located
		// at a unique position.
		view.move(maxEntity==null ? 0. : xMax+maxEntity.getWidth(), view.getCentre().getY());
		addEntity(position, view);

		return view;
	}


	public boolean isOperationsVisible() {
		return operationsVisible;
	}


	public boolean isPropertiesVisible() {
		return propertiesVisible;
	}
}
