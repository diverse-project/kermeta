package org.kermeta.kompren.gwelet.actions;

import org.kermeta.kompren.diagram.view.interfaces.IComponentView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;

public class ReinitView extends VisualisationAction {
	public ReinitView() {
		super();
	}

	@Override
	public String getUndoName() {
		return "Reinit the view";
	}

	@Override
	protected void doVisualisation() {
		for(IEntityView ent : canvas.getEntities())
			ent.setVisibility(IComponentView.Visibility.STANDARD);
		canvas.updateLayout();
		canvas.update();
		done();
	}
}
