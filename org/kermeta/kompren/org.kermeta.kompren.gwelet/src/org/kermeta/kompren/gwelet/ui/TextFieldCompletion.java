package org.kermeta.kompren.gwelet.ui;

import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.KeyStroke;

import org.malai.widget.MMenuItem;
import org.malai.widget.MPopupMenu;
import org.malai.widget.MTextField;

public class TextFieldCompletion extends MTextField {
	private static final long serialVersionUID = 1L;

	protected MPopupMenu popupMenu;


	public TextFieldCompletion() {
		super(true);

		popupMenu = new MPopupMenu(true);
		setComponentPopupMenu(popupMenu);
		popupMenu.setInvoker(this);
		popupMenu.setFocusable(false);

		getInputMap().remove(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));
		getActionMap().remove(getActionForKeyStroke(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0)));
	}


	public void setVisibleCompletionMenu(final boolean visible) {
		if(isVisible()) {
			if(visible)
				popupMenu.setLocation((int)getLocationOnScreen().getX(), (int)(getLocationOnScreen().getY()+getHeight()));
			popupMenu.setVisible(visible);
		}
	}


	@Override
	public void setVisible(final boolean visible) {
		if(!visible)
			popupMenu.setVisible(false);
	}


	public void setCompletionItems(final List<String> items) {
		popupMenu.removeAll();
		MMenuItem menuItem;

		for(String item : items) {
			menuItem = new MMenuItem();
			menuItem.setText(item);
			popupMenu.add(menuItem);
		}
		popupMenu.pack();
		popupMenu.repaint();
	}
}
