package org.kermeta.ki.malai.widget;

import java.awt.Component;

import javax.swing.JComponent;
import javax.swing.JPopupMenu;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class GraphicalComponent {
	public static int getWidth(final Object widgetRO) {
		Object obj = Source2TargetMap.MAP.getTargetObject(widgetRO);
		return obj instanceof Component ? ((Component)obj).getWidth() : 0;
	}
	
	
	public static int getHeight(final Object widgetRO) {
		Object obj = Source2TargetMap.MAP.getTargetObject(widgetRO);
		return obj instanceof Component ? ((Component)obj).getHeight() : 0;
	}
	
	
	
	public static void setPopupMenu(final Object compRO, final Object popupRO) {
		Object obj1 = Source2TargetMap.MAP.getTargetObject(compRO);
		Object obj2 = Source2TargetMap.MAP.getTargetObject(popupRO);
		
		if(obj1 instanceof JComponent && obj2 instanceof JPopupMenu)
			((JComponent)obj1).setComponentPopupMenu((JPopupMenu) obj2);
	}
	
	
	
	public static void setPosition(final Object compRO, final int x, final int y) {
		((Component)Source2TargetMap.MAP.getTargetObject(compRO)).setLocation(x, y);
	}
	
	
	
	public static int getXOnScreen(final Object widgetRO) {
		Object obj = Source2TargetMap.MAP.getTargetObject(widgetRO);
		return obj==null || !(obj instanceof Component) ? 0 : ((Component)obj).getLocationOnScreen().x;
	}
	
	
	
	public static int getYOnScreen(final Object widgetRO) {
		Object obj = Source2TargetMap.MAP.getTargetObject(widgetRO);
		return obj==null || !(obj instanceof Component) ? 0 : ((Component)obj).getLocationOnScreen().y;
	}
	
	
	
	public static int getX(final Object widgetRO) {
		Object obj = Source2TargetMap.MAP.getTargetObject(widgetRO);
		return obj==null || !(obj instanceof Component) ? 0 : ((Component)obj).getX();
	}
	
	
	
	public static int getY(final Object widgetRO) {
		Object obj = Source2TargetMap.MAP.getTargetObject(widgetRO);
		return obj==null || !(obj instanceof Component) ? 0 : ((Component)obj).getY();
	}
	
	
	
	public static void setVisible(final Object widgetRO, final boolean visible) {
		Object obj = Source2TargetMap.MAP.getTargetObject(widgetRO);
		
		if(obj==null || !(obj instanceof Component))
			System.out.println("The graphical object is null or is not a Component: " + obj + " " + widgetRO);
		else
			((Component)obj).setVisible(visible);
	}
	
	
	
	public static void setEnable(final Object widgetRO, final boolean enable) {
		Object obj = Source2TargetMap.MAP.getTargetObject(widgetRO);
		
		if(obj==null || !(obj instanceof Component))
			System.out.println("The graphical object is null or is not a widget: " + obj + " " + widgetRO);
		else
			((Component)obj).setEnabled(enable);
	}
	
	
	
	public static boolean contains(final Object widgetRO, final double px, final double py) {
		Object obj = Source2TargetMap.MAP.getTargetObject(widgetRO);
		boolean contains;
		
		if(obj==null || !(obj instanceof Component))
			contains = false;
		else
			contains = ((Component)obj).getBounds().contains(px, py);
		
		return contains;
	}
}
