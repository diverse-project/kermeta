package org.kermeta.kompren.diagram.view.impl;

import java.awt.geom.GeneralPath;

import org.kermeta.kompren.diagram.view.interfaces.IView;

public abstract class View implements IView {
	/** The path of the component. */
	protected GeneralPath path;


	public View() {
		super();

		path = new GeneralPath();
	}


	@Override
	public GeneralPath getPath() {
		return path;
	}


	@Override
	public GeneralPath getBoundPath() {
		return path;
	}
}
