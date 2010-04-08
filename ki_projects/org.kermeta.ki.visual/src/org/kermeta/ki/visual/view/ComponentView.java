package org.kermeta.ki.visual.view;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;


public abstract class ComponentView {
	public static enum Visibility {STANDARD, NONE, GRAYED } 
	
	
	protected GeneralPath path;
	
	protected Visibility visibility;
	
	
	public static RuntimeObject onPruning(RuntimeObject isHidePolicyRO, RuntimeObject prunedObjectRO) {
		Object prunedObject  = prunedObjectRO.getUserData();
		boolean isHidePolicy = Boolean.getValue(isHidePolicyRO);

		if(prunedObject==null) {
//			System.err.println("No associated Java object to the Kermeta object: " + prunedObjectRO);
			return prunedObjectRO.getFactory().getMemory().voidINSTANCE;
		}

		if(prunedObject instanceof EntityView) {
			EntityView entity   = (EntityView)prunedObject;
			entity.visibility   = isHidePolicy ? Visibility.NONE : Visibility.GRAYED;
			
			if(!isHidePolicy) {
				entity.fillingColor = new Color(210, 210, 210, 180);
				entity.lineColor    = new Color(210, 210, 210, 180);
				entity.setScale(0.6);
				entity.update();
			}
		}
		else if(prunedObject instanceof AttributeView) {
			AttributeView attr = (AttributeView) prunedObject;
			attr.visibility    = isHidePolicy ? Visibility.NONE : Visibility.GRAYED;
		}
		
		return prunedObjectRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject isPruned(RuntimeObject entityRO) {
		Object obj = entityRO.getUserData();
		boolean ok;
		
		if(obj!=null && obj instanceof ComponentView) {
			ok = ((ComponentView)obj).visibility!=Visibility.STANDARD;
		}
		else ok = false;
		
		return ok ? entityRO.getFactory().getMemory().trueINSTANCE : entityRO.getFactory().getMemory().falseINSTANCE;
	}
	
	
	
	public static RuntimeObject isVisible(RuntimeObject entityRO) {
		Object obj = entityRO.getUserData();
		boolean ok;
		
		if(obj!=null && obj instanceof ComponentView) {
			ok = ((ComponentView)obj).isVisible();
		}
		else ok = false;
		
		return ok ? entityRO.getFactory().getMemory().trueINSTANCE : entityRO.getFactory().getMemory().falseINSTANCE;
	}
	
	
	
	
	public ComponentView() {
		super();
		
		visibility = Visibility.STANDARD;
	}
	
	
	public abstract void paint(Graphics2D g);
	
	
	public boolean isVisible() {
		return visibility!=Visibility.NONE;
	}


	public abstract void update();
}
