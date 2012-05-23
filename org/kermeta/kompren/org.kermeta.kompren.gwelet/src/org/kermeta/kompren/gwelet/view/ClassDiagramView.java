package org.kermeta.kompren.gwelet.view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.kermeta.kompren.diagram.view.impl.DiagramView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IRelationView;
import org.kermeta.kompren.gwelet.view.RoleView.Cardinality;
import org.malai.presentation.ConcretePresentation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import fr.inria.zvtm.engine.Camera;
import fr.inria.zvtm.engine.View;
import fr.inria.zvtm.engine.VirtualSpace;
import fr.inria.zvtm.engine.VirtualSpaceManager;
import fr.inria.zvtm.engine.portals.OverviewPortal;

public class ClassDiagramView extends DiagramView implements ConcretePresentation {
	private static final long serialVersionUID = 1L;

	protected boolean operationsVisible;

	protected boolean propertiesVisible;

	protected VirtualSpace vs;

	protected View view;


	public ClassDiagramView(final boolean withScrollPane) {
		super(withScrollPane);

		operationsVisible = true;
		propertiesVisible = true;

		vs = VirtualSpaceManager.INSTANCE.addVirtualSpace("Gwelet");
		List<Camera> cameras = new ArrayList<Camera>();
		Camera detailCam = vs.addCamera();
		Camera overviewCam = vs.addCamera();
		cameras.add(detailCam);
		view = VirtualSpaceManager.INSTANCE.addFrameView(cameras, "Gwelet", View.STD_VIEW, 800, 600, true);
		view.setBackgroundColor(Color.WHITE);
		view.setAntialiasing(true);

		overviewCam.setAltitude(800f, true);
		OverviewPortal p = new OverviewPortal(0, 0, 200, 150, overviewCam, detailCam);
		p.setBorder(Color.BLACK);
		VirtualSpaceManager.INSTANCE.addPortal(p, view);

		ClassView cv = new ClassView("foo");
		cv.addAttribute("attr1", "String");
		cv.addAttribute("attr2", "Boolean");
		cv.addOperation("op1", "Void", true);
		cv.addOperation("operation2", "Boolean", false);
		addEntity(cv);

		ClassView cv2 = new ClassView("FOOOOoooooo");
		cv2.addAttribute("attr1", "String");
		cv2.addOperation("operation1", "Boolean", false);
		addEntity(cv2);

		InheritanceView inhe = new InheritanceView(cv, cv2);
		addRelation(inhe);

		setLayoutStrategy(new ClassModelBasicStrategy(this));
		updateLayout();
	}


	@Override
	public void addRelation(final IRelationView relation) {
		super.addRelation(relation);

		if(relation instanceof InheritanceView)
			vs.addGlyph(((InheritanceView)relation).getGlyph());
	}


	@Override
	public void addEntity(final IEntityView entity) {
		if(entity!=null) {
			entities.add(entity);
			if(entity instanceof ClassView)
				vs.addGlyph(((ClassView)entity).getGlyph());
		}
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
		InheritanceView inView = null;
		boolean again	= true;
		final int size	= relations.size();
		int i			= 0;
		IRelationView link;

		while(again && i<size) {
			link = relations.get(i);

			if(link instanceof InheritanceView) {
				inView = (InheritanceView) link;

				if(inView.getEntitySrc()==src && inView.getEntityTar()==tar) {
					relations.remove(link);
					vs.removeGlyph(inView.getGlyph());
					again = false;
				}
			}

			i++;
		}

		return again ? null : inView;
	}


	public InheritanceView addInheritanceView(final IEntityView src, final IEntityView tar, final int position) {
		final InheritanceView inView = new InheritanceView(src, tar);

		if(position==-1 || position==relations.size())
			addRelation(inView);
		else
			addRelation(position, inView);

		vs.addGlyph(inView.getGlyph());

		return inView;
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

		final IRelationView relView = new RelationClassView(srcClass, tarClass, isComposition, isCompoAtSrc, srcRole, targetRole,
														 Cardinality.getCardinality(srcCard), Cardinality.getCardinality(targetCard));
		if(position==-1 || position==relations.size())
			addRelation(relView);
		else
			addRelation(position, relView);

		return relView;
	}


	public IEntityView addEntity(final String name, final int position, final boolean isAspect) {
		IEntityView entView = null;
		double xMax = -Double.MAX_VALUE;
		double x;
		IEntityView maxEntity = null;

		if(isAspect) {
			int i = 0;
			final int size = entities.size();

			while(entView==null && i<size) {
				if(entities.get(i).getName().equals(name))
					entView = entities.get(i);
				else
					i++;
			}

			if(entView==null)
				System.err.println("ERROR: aspect added but not its reference class");

			return entView;
		}

		ClassView clView = new ClassView(name);

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
		clView.move(maxEntity==null ? 0. : xMax+maxEntity.getWidth(), clView.getCentre().getY());
		addEntity(position, clView);
		vs.addGlyph(clView.getGlyph());

		return entView;
	}


	public boolean isOperationsVisible() {
		return operationsVisible;
	}


	public boolean isPropertiesVisible() {
		return propertiesVisible;
	}


	@Override
	public void save(final boolean generalPreferences, final String nsURI, final Document document, final Element root) {
		// Nothing to do.
	}

	@Override
	public void load(final boolean generalPreferences, final String nsURI, final Element meta) {
		// Nothing to do.
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
	public void update() {
		// TODO Auto-generated method stub
	}



	public VirtualSpace getVs() {
		return vs;
	}



	public View getView() {
		return view;
	}
}
