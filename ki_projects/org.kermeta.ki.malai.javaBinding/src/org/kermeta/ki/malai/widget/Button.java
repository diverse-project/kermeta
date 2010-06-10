package org.kermeta.ki.malai.widget;

import java.awt.Component;
import java.net.URL;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;

import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;

import fr.irisa.triskell.kermeta.modelhelper.NamedElementHelper;
import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;

public abstract class Button 
{
	public static AbstractButton createButtonInstance(RuntimeObject buttonRO) {
		if(buttonRO==null) return null;
		
		final String className = NamedElementHelper.getQualifiedName(
				((fr.irisa.triskell.kermeta.language.structure.Class)buttonRO.getMetaclass().getKCoreObject()).getTypeDefinition());
		
		if("kermeta::ki::malai::widget::Button".equals(className)) 			  return new JButton();
		else if("kermeta::ki::malai::widget::ToggleButton".equals(className)) return new JToggleButton();
		
		return null;
	}
	
	
	public static RuntimeObject initialise(RuntimeObject buttonRO) {
		final AbstractButton button = createButtonInstance(buttonRO);
		
		button.setText("button");
		
		buttonRO.setUserData(button);
		RuntimeObject2JavaMap.MAP.put(button, buttonRO);
		
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
	
	
	
	public static RuntimeObject initialiseWithURI(RuntimeObject widgetRO, RuntimeObject uriRO) {
		final ImageIcon imageIcon 	= loadImageIcon(fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(uriRO));
		AbstractButton button 		= createButtonInstance(widgetRO);
		
		if(imageIcon!=null)
			button.setIcon(imageIcon);
		
		widgetRO.setUserData(button);
		RuntimeObject2JavaMap.MAP.put(button, widgetRO);
		
		return widgetRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject initialiseWithText(RuntimeObject widgetRO, RuntimeObject textRO) {
		final AbstractButton button = createButtonInstance(widgetRO);
		
		button.setText(fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(textRO));
		
		widgetRO.setUserData(button);
		RuntimeObject2JavaMap.MAP.put(button, widgetRO);
		
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
