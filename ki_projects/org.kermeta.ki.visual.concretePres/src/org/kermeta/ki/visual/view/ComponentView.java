package org.kermeta.ki.visual.view;

import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;


public abstract class ComponentView {
	public static enum Visibility {STANDARD, NONE, GRAYED } 
	
	protected GeneralPath path;
	
	protected Visibility visibility;
	
	
	public ComponentView() {
		super();
		
		visibility = Visibility.STANDARD;
	}
	
	
	
	/**
	 * Actions to do when the component view must be pruned.
	 */
	public abstract void onPruning(final boolean isHidePolicy);
	
	
	
	public boolean isPruned() {
		return visibility!=Visibility.STANDARD;
	}
	
	
	
	public abstract void paint(Graphics2D g);
	
	
	
	public boolean isVisible() {
		return visibility!=Visibility.NONE;
	}


	public abstract void update();
}
