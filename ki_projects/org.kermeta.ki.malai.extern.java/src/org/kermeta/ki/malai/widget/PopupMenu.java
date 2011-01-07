package org.kermeta.ki.malai.widget;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class PopupMenu {
	public static void initialise(final Object popupMenuRO) {
		Source2TargetMap.MAP.add(popupMenuRO, new JPopupMenu());
	}

	
	public static void setVisible(Object widgetRO, boolean visible) {
		Object obj = Source2TargetMap.MAP.getTargetObject(widgetRO);

		if(!(obj instanceof JPopupMenu))
			System.out.println("The graphical object is null or is not a Component: " + obj + " " + widgetRO);
		else {
			final JPopupMenu popup = (JPopupMenu) obj;
			
			popup.setVisible(visible);

			if (visible && popup.getComponentCount() > 0) {
				popup.getSelectionModel().setSelectedIndex(0);
	        	try {
	            	MenuSelectionManager.defaultManager().setSelectedPath(new MenuElement[]{popup, popup.getSubElements()[0]});
	        	}catch(Exception e) { /* */ }
				popup.repaint();
			}
		}
	}

	
	
	public static int getSelectedIndex(final Object popupMenuRO) {
		final JPopupMenu popup = (JPopupMenu) Source2TargetMap.MAP.getTargetObject(popupMenuRO);

		return popup.getSelectionModel().getSelectedIndex();
	}

	
	
	public static int getNbMenuItems(final Object popupMenuRO) {
		final JPopupMenu popup = (JPopupMenu) Source2TargetMap.MAP.getTargetObject(popupMenuRO);

		return popup.getComponentCount();
	}

	
	
	public static void setSelectedIndex(final Object popupMenuRO, final int newIndex) {
		final JPopupMenu popup = (JPopupMenu) Source2TargetMap.MAP.getTargetObject(popupMenuRO);
		
    	try {
    		MenuSelectionManager.defaultManager().setSelectedPath(new MenuElement[]{popup, popup.getSubElements()[newIndex]});
        }catch(Exception e) { /* */ }
		
        popup.getSelectionModel().setSelectedIndex(newIndex);
		popup.repaint();
	}

	
	
	public static void addMenuItem(final Object popupMenuRO, final Object menuItemRO) {
		final JPopupMenu popup = (JPopupMenu) Source2TargetMap.MAP.getTargetObject(popupMenuRO);

		popup.add((JMenuItem) Source2TargetMap.MAP.getTargetObject(menuItemRO));
		popup.pack();
		popup.repaint();
	}

	
	
	
	public static void removeAllMenuItems(final Object popupMenuRO) {
		final JPopupMenu popup = (JPopupMenu) Source2TargetMap.MAP.getTargetObject(popupMenuRO);

		popup.removeAll();
		popup.pack();
		popup.repaint();
	}
}
