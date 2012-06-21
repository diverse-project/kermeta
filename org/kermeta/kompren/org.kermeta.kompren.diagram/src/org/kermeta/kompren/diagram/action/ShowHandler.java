package org.kermeta.kompren.diagram.action;

import org.kermeta.kompren.diagram.view.interfaces.IRelationView;

public class ShowHandler extends ModelViewAction {
	protected IRelationView rel;

	public ShowHandler() {
		super();
	}


	@Override
	public boolean isRegisterable() {
		return false;
	}

	@Override
	protected void doActionBody() {
		for(IRelationView r : canvas.getRelations())
			r.setHandlersVisible(false);

		if(rel!=null)
			rel.setHandlersVisible(true);
		canvas.refresh();
	}


	public void setRel(final IRelationView rel) {
		this.rel = rel;
	}
}
