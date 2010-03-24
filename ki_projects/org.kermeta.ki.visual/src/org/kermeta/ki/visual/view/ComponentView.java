package org.kermeta.ki.visual.view;

import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public abstract class ComponentView {
	protected GeneralPath path;
	
	protected boolean visible;
	
	
	public static RuntimeObject onPruning(RuntimeObject prunedObjectRO) {
		Object prunedObject = prunedObjectRO.getUserData();

		if(prunedObject==null) {
			System.err.println("No associated Java object to the Kermeta object: " + prunedObjectRO);
			return prunedObjectRO.getFactory().getMemory().voidINSTANCE;
		}

		if(prunedObject instanceof EntityView)
			((EntityView)prunedObject).visible = false;
		
		return prunedObjectRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	public abstract void paint(Graphics2D g);
	
	
	public boolean isVisible() {
		return visible;
	}


	public void setVisible(boolean visible) {
		this.visible = visible;
	}


	public abstract void update();
}
