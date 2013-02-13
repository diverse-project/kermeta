package org.kermeta.kompren.diagram.view.impl;

import java.awt.Rectangle;
import java.awt.geom.GeneralPath;

import org.kermeta.kompren.diagram.view.interfaces.IView;

public abstract class View implements IView {
	/** The path of the component. */
	protected GeneralPath path;

	protected Rectangle bound;


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
