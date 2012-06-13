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
		System.out.println("Java pkg added: " + pkg.getName());
	}



	@Override
	public void onClassDefinitionAdded(final ClassDefinition cl) {
		ModelViewMapper.getMapper().getClassView(cl).setVisibility(IComponentView.Visibility.STANDARD);
	}



	@Override
	public void onEnd() {
		view.updateLayout();
		view.update();
	}



	@Override
	public void onStart() {
		for(IEntityView ent : view.getEntities())
			ent.setVisibility(IComponentView.Visibility.NONE);
	}
}
