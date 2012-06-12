package org.kermeta.kompren.gwelet.mapping;

import java.util.List;

import org.kermeta.kompren.diagram.view.interfaces.Selectable;
import org.kermeta.kompren.gwelet.instruments.Visualiser;
import org.malai.mapping.IUnary;
import org.malai.mapping.List2ObjectMapping;

public class Selection2VisualiserMapping extends List2ObjectMapping<Selectable, Visualiser> {

	public Selection2VisualiserMapping(final List<Selectable> source, final Visualiser target) {
		super(source, target);
	}


	@Override
	public void onObjectAdded(final Object list, final Object object, final int index) {
		target.setActivated(true);
	}

	@Override
	public void onObjectRemoved(final Object list, final Object object, final int index) {
		if(source.isEmpty())
			target.setActivated(false);
	}

	@Override
	public void onListCleaned(final Object list) {
		target.setActivated(false);
	}

	@Override
	public void onObjectMoved(final Object list, final Object object, final int srcIndex, final int targetIndex) {
		//
	}

	@Override
	public void onObjectReplaced(final IUnary<?> object, final Object replacedObject) {
		//
	}

	@Override
	public void onObjectModified(final Object object) {
		//
	}

	@Override
	public void init() {
		target.setActivated(source.isEmpty());
	}
}
