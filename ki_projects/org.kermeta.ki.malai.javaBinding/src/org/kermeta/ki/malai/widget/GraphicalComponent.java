package org.kermeta.ki.malai.widget;

import java.awt.Component;

import javax.swing.JComponent;
import javax.swing.JPopupMenu;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;
import fr.irisa.triskell.kermeta.runtime.basetypes.Real;

public abstract class GraphicalComponent {
	public static RuntimeObject getWidth(RuntimeObject widgetRO) {
		Object obj = widgetRO.getUserData();
		int w =obj instanceof Component ? ((Component)obj).getWidth() : 0;
		
		return Integer.create(w, widgetRO.getFactory());
	}
	
	
	public static RuntimeObject getHeight(RuntimeObject widgetRO) {
		Object obj = widgetRO.getUserData();
		int h = obj instanceof Component ? ((Component)obj).getHeight() : 0;
		
		return Integer.create(h, widgetRO.getFactory());
	}
	
	
	
	public static RuntimeObject setPopupMenu(final RuntimeObject compRO, final RuntimeObject popupRO) {
		Object obj1 = compRO.getUserData();
		Object obj2 = popupRO.getUserData();
		
		if(obj1 instanceof JComponent && obj2 instanceof JPopupMenu)
			((JComponent)obj1).setComponentPopupMenu((JPopupMenu) obj2);
		
		return compRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject setPosition(final RuntimeObject compRO, final RuntimeObject xRO, final RuntimeObject yRO) {
		((Component)compRO.getUserData()).setLocation(Integer.getValue(xRO), Integer.getValue(yRO));
		
		return compRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject getXOnScreen(RuntimeObject widgetRO) {
		Object obj = widgetRO.getUserData();
		int x = obj==null || !(obj instanceof Component) ? 0 : ((Component)obj).getLocationOnScreen().x;
		
		return Integer.create(x, widgetRO.getFactory());
	}
	
	
	
	public static RuntimeObject getYOnScreen(RuntimeObject widgetRO) {
		Object obj = widgetRO.getUserData();
		int y = obj==null || !(obj instanceof Component) ? 0 : ((Component)obj).getLocationOnScreen().y;
		
		return Integer.create(y, widgetRO.getFactory());
	}
	
	
	
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
