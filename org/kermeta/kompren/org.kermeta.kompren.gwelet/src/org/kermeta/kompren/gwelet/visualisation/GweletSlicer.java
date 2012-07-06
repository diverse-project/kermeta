package org.kermeta.kompren.gwelet.visualisation;

import org.kermeta.kompren.diagram.view.interfaces.IComponentView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.kermeta.kompren.diagram.view.interfaces.IModelView;
import org.kermeta.kompren.gwelet.view.ModelViewMapper;
import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicer.org.kermeta.language.structure.RichVisualiserKermetaModel;
import org.kermeta.language.structure.ClassDefinition;
import org.kermeta.language.structure.Package;

public class GweletSlicer extends RichVisualiserKermetaModel {
	protected IModelView view;

	public GweletSlicer(final IModelView view) {
		super();
		this.view = view;
	}



	@Override
	public void onPackageAdded(final Package pkg) {
//		String qname = ModelUtils.INSTANCE.getQualifiedName(pkg);
//		if(!qname.startsWith("org.kermeta") && !qname.startsWith("kermeta"))
//			System.out.println("Java pkg added: " + pkg.getName());
	}



	@Override
	public void onClassDefinitionAdded(final ClassDefinition cl) {
//		String qname = ModelUtils.INSTANCE.getQualifiedName(cl);// EVAL
		if(//!qname.startsWith("org.kermeta") && !qname.startsWith("kermeta") &&
			ModelViewMapper.getMapper().getClassView(cl).getVisibility()==IComponentView.Visibility.HIDE_START)
				ModelViewMapper.getMapper().getClassView(cl).setVisibility(IComponentView.Visibility.STANDARD);
	}



	@Override
	public void onEnd() {
		for(IEntityView ent : view.getEntities())
			if(ent.getVisibility()==IComponentView.Visibility.HIDE_START)
				ent.setVisibility(IComponentView.Visibility.NONE);

		view.updateLayout();
		view.update();
	}



	@Override
	public void onStart() {
		for(IEntityView ent : view.getEntities())
			if(ent.getVisibility()==IComponentView.Visibility.STANDARD)
				ent.setVisibility(IComponentView.Visibility.HIDE_START);
	}
}
