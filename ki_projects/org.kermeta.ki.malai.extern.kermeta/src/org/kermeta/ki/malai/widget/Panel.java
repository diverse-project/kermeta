package org.kermeta.ki.malai.widget;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;
import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;


public abstract class Panel 
{
	public static RuntimeObject initialise(RuntimeObject panelRO, RuntimeObject eventManagerRO) {
		final JPanel panel = new JPanel();
		
		Source2TargetMap.MAP.add(panelRO, panel);
		
		if(eventManagerRO!=null && Source2TargetMap.MAP.getTargetObject(eventManagerRO)!=null)
			((EventManagerWrapper) Source2TargetMap.MAP.getTargetObject(eventManagerRO)).attachTo(panel);
		
		return panelRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject add(RuntimeObject panelRO, RuntimeObject componentRO) {
		Object panel = Source2TargetMap.MAP.getTargetObject(panelRO);
		Object comp  = Source2TargetMap.MAP.getTargetObject(componentRO);
		
		if(panel==null || !(panel instanceof JPanel) || comp==null || !(comp instanceof Component))
			System.out.println("The graphicals objects are null or are not valid: " + panel + " " + comp);
		else
			((JPanel)panel).add((Component)comp);
		
		return panelRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	
	public static RuntimeObject hasScrollbars(RuntimeObject panelRO) {
		boolean ok = hasScrollbars((JPanel) Source2TargetMap.MAP.getTargetObject(panelRO));
		
		return ok ? panelRO.getFactory().getMemory().trueINSTANCE :  panelRO.getFactory().getMemory().falseINSTANCE;
	}
	
	
	
	
	
	public static RuntimeObject isVerticalScrollbarVisible(RuntimeObject panelRO) {
		JScrollBar sb = getScrollbar((JPanel) Source2TargetMap.MAP.getTargetObject(panelRO), true);
		
		return sb==null || ! sb.isVisible() ? panelRO.getFactory().getMemory().falseINSTANCE :  
							panelRO.getFactory().getMemory().trueINSTANCE;
	}
	
	
	
	
	public static RuntimeObject isHorizontalScrollbarVisible(RuntimeObject panelRO) {
		JScrollBar sb = getScrollbar((JPanel) Source2TargetMap.MAP.getTargetObject(panelRO), false);
		
		return sb==null || ! sb.isVisible() ? panelRO.getFactory().getMemory().falseINSTANCE :  
							panelRO.getFactory().getMemory().trueINSTANCE;
	}
	
	
	
	
	public static RuntimeObject scrollVertically(RuntimeObject panelRO, RuntimeObject incrementR0) {
		scroll(panelRO, incrementR0, true);
		return panelRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject scrollHorizontally(RuntimeObject panelRO, RuntimeObject incrementR0) {
		scroll(panelRO, incrementR0, false);
		return panelRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static void scroll(RuntimeObject panelRO, RuntimeObject incrementR0, boolean vertical) {
		JScrollBar bar = getScrollbar((JPanel) Source2TargetMap.MAP.getTargetObject(panelRO), vertical);
		int increment  = Integer.getValue(incrementR0);
		
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
