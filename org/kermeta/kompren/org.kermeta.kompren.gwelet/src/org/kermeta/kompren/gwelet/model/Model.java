package org.kermeta.kompren.gwelet.model;

import org.kermeta.language.structure.ModelingUnit;
import org.malai.presentation.AbstractPresentation;

public class Model implements AbstractPresentation {
	protected ModelingUnit unit;


	public Model() {
		super();
	}


	@Override
	public void setModified(final boolean modified) {
		// Nothing to do.
	}


	@Override
	public boolean isModified() {
		return false;
	}

	@Override
	public void reinit() {
		// Nothing to do.
	}


	public ModelingUnit getUnit() {
		return unit;
	}


	public void setUnit(final ModelingUnit unit) {
		this.unit = unit;
	}
}
