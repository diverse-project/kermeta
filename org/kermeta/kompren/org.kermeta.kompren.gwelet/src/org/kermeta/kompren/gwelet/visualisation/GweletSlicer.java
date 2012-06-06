package org.kermeta.kompren.gwelet.visualisation;

import org.kermeta.kompren.org.kermeta.kompren.gwelet.slicer.org.kermeta.language.structure.RichVisualiserKermetaModel;
import org.kermeta.language.structure.Package;

public class GweletSlicer extends RichVisualiserKermetaModel {

	public GweletSlicer() {
		super();
	}



	@Override
	public void onPackageAdded(final Package pkg) {
		System.out.println("Java pkg added: " + pkg.getName());
	}
}
