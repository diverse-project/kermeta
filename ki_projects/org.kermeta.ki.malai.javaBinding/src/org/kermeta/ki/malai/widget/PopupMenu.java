package org.kermeta.ki.malai.widget;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;

import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;
import fr.irisa.triskell.kermeta.runtime.basetypes.Integer;

public abstract class PopupMenu {
	public static RuntimeObject initialise(final RuntimeObject popupMenuRO) {
		final JPopupMenu popup = new JPopupMenu();

		popupMenuRO.setUserData(popup);
		RuntimeObject2JavaMap.MAP.put(popup, popupMenuRO);

		return popupMenuRO.getFactory().getMemory().voidINSTANCE;
	}

	
	public static RuntimeObject setVisible(RuntimeObject widgetRO, RuntimeObject visibleRO) {
		Object obj = widgetRO.getUserData();

		if(obj == null || !(obj instanceof JPopupMenu))
			System.out.println("The graphical object is null or is not a Component: " + obj + " " + widgetRO);
		else {
			final JPopupMenu popup = (JPopupMenu) obj;
			final boolean visible = Boolean.getValue(visibleRO);
			
			popup.setVisible(visible);

			if (visible && popup.getComponentCount() > 0) {
				popup.getSelectionModel().setSelectedIndex(0);
	        	try {
	            	MenuSelectionManager.defaultManager().setSelectedPath(new MenuElement[]{popup, popup.getSubElements()[0]});
	        	}catch(Exception e) { /* */ }
				popup.repaint();
			}
		}

		return widgetRO.getFactory().getMemory().voidINSTANCE;
	}

	
	
	public static RuntimeObject getSelectedIndex(final RuntimeObject popupMenuRO) {
		final JPopupMenu popup = (JPopupMenu) popupMenuRO.getUserData();

		return Integer.create(popup.getSelectionModel().getSelectedIndex(), popupMenuRO.getFactory());
	}

	
	
	public static RuntimeObject getNbMenuItems(final RuntimeObject popupMenuRO) {
		final JPopupMenu popup = (JPopupMenu) popupMenuRO.getUserData();

		return Integer.create(popup.getComponentCount(), popupMenuRO.getFactory());
	}

	
	
	public static RuntimeObject setSelectedIndex(final RuntimeObject popupMenuRO, final RuntimeObject indexRO) {
		final JPopupMenu popup = (JPopupMenu) popupMenuRO.getUserData();
		final int newIndex	   = Integer.getValue(indexRO);
		
    	try {
    		MenuSelectionManager.defaultManager().setSelectedPath(new MenuElement[]{popup, popup.getSubElements()[newIndex]});
        }catch(Exception e) { /* */ }
		
        popup.getSelectionModel().setSelectedIndex(newIndex);
		popup.repaint();
		
		return popupMenuRO.getFactory().getMemory().voidINSTANCE; 
	}

	
	
	public static RuntimeObject addMenuItem(final RuntimeObject popupMenuRO, final RuntimeObject menuItemRO) {
		final JPopupMenu popup = (JPopupMenu) popupMenuRO.getUserData();

		popup.add((JMenuItem) menuItemRO.getUserData());
		popup.pack();
		popup.repaint();

		return popupMenuRO.getFactory().getMemory().voidINSTANCE;
	}

	
	
	
	public static RuntimeObject removeAllMenuItems(final RuntimeObject popupMenuRO) {
		final JPopupMenu popup = (JPopupMenu) popupMenuRO.getUserData();

		popup.removeAll();
		popup.pack();
		popup.repaint();

		return popupMenuRO.getFactory().getMemory().voidINSTANCE;
	}
}
