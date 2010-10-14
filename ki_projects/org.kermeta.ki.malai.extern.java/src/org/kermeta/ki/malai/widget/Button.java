package org.kermeta.ki.malai.widget;

import java.awt.Component;
import java.net.URL;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class Button 
{
	public static AbstractButton createButtonInstance(final Object buttonRO) {
		if(buttonRO==null) return null;

		final String className = buttonRO.getClass().getName();

		if("kermeta.ki.malai.widget.RichButton".equals(className)) 			  return new JButton();
		else if("kermeta.ki.malai.widget.RichToggleButton".equals(className)) return new JToggleButton();
		
		return null;
	}
	
	
	public static void initialise(Object buttonRO) {
		final AbstractButton button = createButtonInstance(buttonRO);
		
		button.setText("button");
		Source2TargetMap.MAP.add(buttonRO, button);
	}
	
	
	public static void setSelected(Object widgetRO, boolean selected) {
		final Object obj = Source2TargetMap.MAP.getTargetObject(widgetRO);
		
		if(obj==null || !(obj instanceof AbstractButton))
			System.out.println("The graphical object is null or is not an AbstractButton: " + obj + " " + widgetRO);
		else
			((AbstractButton)obj).setSelected(selected);
	}
	
	
	
	public static void initialiseWithURI(final Object widgetRO, String uriRO) {
		final ImageIcon imageIcon 	= loadImageIcon(uriRO);
		AbstractButton button 		= createButtonInstance(widgetRO);
		
		if(imageIcon!=null)
			button.setIcon(imageIcon);
		
		Source2TargetMap.MAP.add(widgetRO, button);
	}
	
	
	
	public static void initialiseWithText(final Object widgetRO, String textRO) {
		final AbstractButton button = createButtonInstance(widgetRO);
		
		button.setText(textRO);
		Source2TargetMap.MAP.add(widgetRO, button);
	}
	
	
	
	public static String getActionCommand(final Object widgetRO) {
		final Object obj = Source2TargetMap.MAP.getTargetObject(widgetRO);
		String ac;
		
		if(obj==null || !(obj instanceof Component)) {
			System.out.println("The graphical object is null or is not a widget: " + obj + " " + widgetRO);
			ac = "";
		}
		else ac = ((AbstractButton)obj).getActionCommand();
		
		return ac;
	}
	
	
	
	public static ImageIcon loadImageIcon(final String path) {
		final URL url = Button.class.getResource(path);
		return url==null ? null : new ImageIcon(url);
	}
}
