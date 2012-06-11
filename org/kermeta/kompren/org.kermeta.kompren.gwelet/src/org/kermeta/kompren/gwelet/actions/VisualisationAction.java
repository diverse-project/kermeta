package org.kermeta.kompren.gwelet.actions;

import java.util.ArrayList;
import java.util.List;

import org.kermeta.kompren.diagram.action.ModelViewAction;
import org.kermeta.kompren.diagram.view.interfaces.IComponentView;
import org.kermeta.kompren.diagram.view.interfaces.IEntityView;
import org.malai.undo.Undoable;

public abstract class VisualisationAction extends ModelViewAction implements Undoable {
	protected List<IComponentView.Visibility> viewStates;

	protected int xScrollbarPos;

	protected int yScrollbarPos;


	public VisualisationAction() {
		super();
	}


	@Override
	protected void doActionBody() {
		viewStates = new ArrayList<IComponentView.Visibility>();

		for(IEntityView ent : canvas.getEntities())
			viewStates.add(ent.getVisibility());

		xScrollbarPos = canvas.getScrollpane().getHorizontalScrollBar().getValue();
		yScrollbarPos = canvas.getScrollpane().getVerticalScrollBar().getValue();

		doVisualisation();
		done();
	}


	protected abstract void doVisualisation();


	@Override
	public boolean isRegisterable() {
		return true;
	}


	@Override
	public void undo() {
		int i=0;
		for(IEntityView ent : canvas.getEntities()) {
			ent.setVisibility(viewStates.get(i));
			i++;
		}
		canvas.updateLayout();
		canvas.update();

		canvas.getScrollpane().getHorizontalScrollBar().setValue(xScrollbarPos);
		canvas.getScrollpane().getVerticalScrollBar().setValue(yScrollbarPos);
	}


	@Override
	public void redo() {
		doVisualisation();
	}
}
