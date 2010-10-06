package org.kermeta.ki.kompren.view;

import java.util.ArrayList;
import java.util.List;

import org.kermeta.ki.diagram.view.impl.DiagramView;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;
import org.kermeta.ki.kompren.view.RoleView.Cardinality;

public class ClassDiagramView extends DiagramView {
	private static final long serialVersionUID = 1L;

	protected boolean operationsVisible;
	
	protected boolean propertiesVisible;
	
	
	public ClassDiagramView(final boolean withScrollPane) {
		super(withScrollPane);
		
		operationsVisible = true;
		propertiesVisible = true;
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
	

	public InheritanceView addInheritanceView(final IEntityView src, final IEntityView tar, final int position) {
		final InheritanceView view = new InheritanceView(src, tar);
		
//		view.setVisibility(Visibility.STANDARD);
		addRelation(position, view);
		
		return view;
	}
	
	
	
	
	public IRelationView addRelation(final IEntityView srcClass, final IEntityView tarClass, final boolean isComposition, final boolean isCompoAtSrc, 
						final String srcRole, final String targetRole, final String srcCard, final String targetCard, final int position) {
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
					
					if(role!=null && role.name.text.equals(srcRole) && role.card.text.equals(srcCard))
						again = false;
				}
				
				i++;
			}
			
			if(!again)
				return null;
		}
		
		final IRelationView view = new RelationClassView(srcClass, tarClass, isComposition, isCompoAtSrc, srcRole, targetRole, 
										Cardinality.getCardinality(srcCard), Cardinality.getCardinality(targetCard));
//		view.visibility = Visibility.STANDARD;
		addRelation(position, view);
		
		return view;
	}
	
	
	public IEntityView addEntity(final String name, final int position, final boolean isAspect) {
		IEntityView view = null;
		
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
