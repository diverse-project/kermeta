package org.kermeta.ki.malai.widget;

import java.awt.Component;

import javax.swing.JPanel;

import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;
import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;


public abstract class Panel 
{
	public static RuntimeObject initialise(RuntimeObject panelRO, RuntimeObject eventManagerRO) {
		final EventManagerWrapper emw = (EventManagerWrapper) eventManagerRO.getUserData();
		final JPanel panel = new JPanel();
		
		panelRO.setUserData(panel);
		RuntimeObject2JavaMap.MAP.put(panel, panelRO);
		emw.attachTo(panel);
		
		return panelRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject add(RuntimeObject panelRO, RuntimeObject componentRO) {
		Object panel = panelRO.getUserData();
		Object comp  = componentRO.getUserData();
		
		if(panel==null || !(panel instanceof JPanel) || comp==null || !(comp instanceof Component))
			System.out.println("The graphicals objects are null or are not valid: " + panel + " " + comp);
		else
			((JPanel)panel).add((Component)comp);
		
		return panelRO.getFactory().getMemory().voidINSTANCE; 
	}
}
