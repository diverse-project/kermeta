package org.kermeta.ki.malai.widget;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;
import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;


public abstract class Panel 
{
	public static void initialise(final Object panelRO, final Object eventManagerRO) {
		final JPanel panel = new JPanel();
		
		Source2TargetMap.MAP.add(panelRO, panel);
		
		if(eventManagerRO!=null && Source2TargetMap.MAP.getTargetObject(eventManagerRO)!=null)
			((EventManagerWrapper) Source2TargetMap.MAP.getTargetObject(eventManagerRO)).attachTo(panel);
	}
	
	
	
	public static void add(final Object panelRO, final Object componentRO) {
		Object panel = Source2TargetMap.MAP.getTargetObject(panelRO);
		Object comp  = Source2TargetMap.MAP.getTargetObject(componentRO);
		
		if(panel==null || !(panel instanceof JPanel) || comp==null || !(comp instanceof Component))
			System.out.println("The graphicals objects are null or are not valid: " + panel + " " + comp);
		else
			((JPanel)panel).add((Component)comp);
	}
	
	
	
	
	public static boolean hasScrollbars(final Object panelRO) {
		return hasScrollbars((JPanel) Source2TargetMap.MAP.getTargetObject(panelRO));
	}
	
	
	
	
	
	public static boolean isVerticalScrollbarVisible(final Object panelRO) {
		JScrollBar sb = getScrollbar((JPanel) Source2TargetMap.MAP.getTargetObject(panelRO), true);
		
		return sb==null || ! sb.isVisible();
	}
	
	
	
	
	public static boolean isHorizontalScrollbarVisible(final Object panelRO) {
		JScrollBar sb = getScrollbar((JPanel) Source2TargetMap.MAP.getTargetObject(panelRO), false);
		
		return sb==null || ! sb.isVisible();
	}
	
	
	
	
	public static void scrollVertically(final Object panelRO, int incrementR0) {
		scroll(panelRO, incrementR0, true);
	}
	
	
	
	public static void scrollHorizontally(Object panelRO, int incrementR0) {
		scroll(panelRO, incrementR0, false);
	}
	
	
	
	public static void scroll(final Object panelRO, int increment, boolean vertical) {
		JScrollBar bar = getScrollbar((JPanel) Source2TargetMap.MAP.getTargetObject(panelRO), vertical);
		
		if(bar!=null && bar.isVisible())
			bar.setValue(bar.getValue() - increment);
	}
	
	
	
	public static JScrollBar getScrollbar(JPanel panel, boolean vertical) {
		if(hasScrollbars(panel)) {
			JScrollPane sp = (JScrollPane)panel.getParent().getParent();
			
			return vertical ? sp.getVerticalScrollBar() : sp.getHorizontalScrollBar();
		}
			
		return null;
	}
	
	
	public static boolean hasScrollbars(JPanel panel) {
		Container container = panel.getParent();
		return container!=null && container.getParent() instanceof JScrollPane;
	}
}
