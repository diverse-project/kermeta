package org.kermeta.ki.malai.widget;

import java.awt.Component;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.Real;

public abstract class GraphicalComponent
{
	public static RuntimeObject getX(RuntimeObject widgetRO) {
		Object obj = widgetRO.getUserData();
		int x = obj==null || !(obj instanceof Component) ? 0 : ((Component)obj).getX();
		
		return Integer.create(x, widgetRO.getFactory());
	}
	
	
	
	public static RuntimeObject getY(RuntimeObject widgetRO) {
		Object obj = widgetRO.getUserData();
		int y = obj==null || !(obj instanceof Component) ? 0 : ((Component)obj).getY();
		
		return Integer.create(y, widgetRO.getFactory());
	}
	
	
	
	public static RuntimeObject setVisible(RuntimeObject widgetRO, RuntimeObject visibleRO) {
		Object obj = widgetRO.getUserData();
		
		if(obj==null || !(obj instanceof Component))
			System.out.println("The graphical object is null or is not a Component: " + obj + " " + widgetRO);
		else
			((Component)obj).setVisible(Boolean.getValue(visibleRO));
		
		return widgetRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject setEnable(RuntimeObject widgetRO, RuntimeObject enableRO) {
		Object obj = widgetRO.getUserData();
		
		if(obj==null || !(obj instanceof Component))
			System.out.println("The graphical object is null or is not a widget: " + obj + " " + widgetRO);
		else
			((Component)obj).setEnabled(Boolean.getValue(enableRO));
		
		return widgetRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject contains(RuntimeObject widgetRO, RuntimeObject pxRO, RuntimeObject pyRO) {
		Object obj = widgetRO.getUserData();
		double px  = Real.getValue(pxRO);
		double py  = Real.getValue(pyRO);
		boolean contains;
		
		if(obj==null || !(obj instanceof Component))
			contains = false;
		else
			contains = ((Component)obj).getBounds().contains(px, py);
		
		return contains ? widgetRO.getFactory().getMemory().trueINSTANCE : widgetRO.getFactory().getMemory().falseINSTANCE;
	}
}
