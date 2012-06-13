package org.kermeta.kompren.gwelet.actions;

import javax.swing.JComponent;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;

import org.malai.action.Action;

public class SelectMenuItem extends Action {
	protected MenuElement menu;

	protected int index;


	public SelectMenuItem() {
		super();
	}


	@Override
	public void doActionBody() {
    	try {
    		MenuSelectionManager.defaultManager().setSelectedPath(new MenuElement[]{menu, menu.getSubElements()[index]});
        }catch(Exception e) { /* */ }

        if(menu instanceof JComponent)
        	((JComponent)menu).repaint();

		done();
	}



	@Override
	public boolean isRegisterable() {
		return false;
	}


	@Override
	public boolean canDo() {
		return menu!=null && index>=0 && index<menu.getSubElements().length;
	}


	public void setMenu(final MenuElement menu) {
		this.menu = menu;
	}


	public void setIndex(final int index) {
		this.index = index;
	}
}
