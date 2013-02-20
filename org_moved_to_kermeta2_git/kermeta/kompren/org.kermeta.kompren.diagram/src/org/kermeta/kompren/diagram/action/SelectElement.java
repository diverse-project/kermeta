package org.kermeta.kompren.diagram.action;

import java.util.ArrayList;
import java.util.List;

import org.kermeta.kompren.diagram.view.interfaces.Selectable;
import org.malai.action.Action;

public class SelectElement extends ModelViewAction {
	protected List<Selectable> elts;

	public SelectElement() {
		super();
		elts = new ArrayList<Selectable>();
	}

	@Override
	public boolean isRegisterable() {
		return false;
	}

	@Override
	protected void doActionBody() {
		canvas.setSelection(elts);
		canvas.refresh();
	}


	@Override
	public void flush() {
		elts.clear();
	}


	public void addSelected(final Selectable elt) {
		if(elt!=null)
			elts.add(elt);
	}


	@Override
	public boolean cancelledBy(final Action action) {
		return action instanceof SelectElement;
	}


	@Override
	public boolean canDo() {
		return super.canDo();
	}
}
