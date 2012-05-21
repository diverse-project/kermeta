package org.kermeta.kompren.gwelet.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.malai.presentation.AbstractPresentation;

public class Model implements AbstractPresentation {
	protected List<EPackage> pkgs;

	
	public Model() {
		super();
		pkgs = new ArrayList<EPackage>();
	}
	
	
	@Override
	public void setModified(boolean modified) {
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
}
