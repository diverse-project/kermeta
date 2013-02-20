package org.kermeta.kompren.diagram.action;

import org.kermeta.kompren.diagram.view.interfaces.IModelView;
import org.malai.action.Action;

public abstract class ModelViewAction extends Action {
	protected IModelView canvas;


	public ModelViewAction() {
		super();
	}


	@Override
	public boolean isRegisterable() {
		return false;
	}


	@Override
	public boolean canDo() {
		return canvas!=null;
	}


	public void setModelView(final IModelView view) {
		canvas = view;
	}


	public IModelView getCanvas() {
		return canvas;
	}
}
