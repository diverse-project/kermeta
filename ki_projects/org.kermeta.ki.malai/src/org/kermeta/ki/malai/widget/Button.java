package org.kermeta.ki.malai.widget;

import java.awt.Component;
import java.net.URL;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;
import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;

public abstract class Button 
{
	public static void attachToEventManager(EventManagerWrapper manager, AbstractButton button) {
		manager.attachTo(button);
	}
	
	
	public static RuntimeObject initialise(RuntimeObject buttonRO, RuntimeObject eventManagerRO) {
		final EventManagerWrapper emw = (EventManagerWrapper) eventManagerRO.getUserData();
		final JButton button 			= new JButton("button");
		
		buttonRO.setUserData(button);
		RuntimeObject2JavaMap.MAP.put(button, buttonRO);
		attachToEventManager(emw, button);
		
		return buttonRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	public static RuntimeObject setSelected(RuntimeObject widgetRO, RuntimeObject selectedRO) {
		final Object obj = widgetRO.getUserData();
		
		if(obj==null || !(obj instanceof AbstractButton))
			System.out.println("The graphical object is null or is not an AbstractButton: " + obj + " " + widgetRO);
		else
			((AbstractButton)obj).setSelected(Boolean.getValue(selectedRO));
		
		return widgetRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject initialiseWithURI(RuntimeObject widgetRO, RuntimeObject uriRO, RuntimeObject eventManagerRO) {
		final EventManagerWrapper emw = (EventManagerWrapper) eventManagerRO.getUserData();
		final ImageIcon imageIcon = loadImageIcon(fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(uriRO));
		JButton button;
		
		if(imageIcon==null)
			button = new JButton();
		else
			button = new JButton(imageIcon);
		
		widgetRO.setUserData(button);
		RuntimeObject2JavaMap.MAP.put(button, widgetRO);
		attachToEventManager(emw, button);
		
		return widgetRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject initialiseWithText(RuntimeObject widgetRO, RuntimeObject textRO, RuntimeObject eventManagerRO) {
		final EventManagerWrapper emw = (EventManagerWrapper) eventManagerRO.getUserData();
		final JButton button = new JButton(textRO.getPrimitiveType());
		
		widgetRO.setUserData(button);
		RuntimeObject2JavaMap.MAP.put(button, widgetRO);
		attachToEventManager(emw, button);
		
		return widgetRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject getActionCommand(RuntimeObject widgetRO) {
		final Object obj = widgetRO.getUserData();
		String ac;
		
		if(obj==null || !(obj instanceof Component)) {
			System.out.println("The graphical object is null or is not a widget: " + obj + " " + widgetRO);
			ac = "";
		}
		else ac = ((AbstractButton)obj).getActionCommand();
		
		return fr.irisa.triskell.kermeta.runtime.basetypes.String.create(ac, widgetRO.getFactory());
	}
	
	
	
	public static ImageIcon loadImageIcon(String path) {
		final URL url = Button.class.getResource(path);
		return url==null ? null : new ImageIcon(url);
	}
}
