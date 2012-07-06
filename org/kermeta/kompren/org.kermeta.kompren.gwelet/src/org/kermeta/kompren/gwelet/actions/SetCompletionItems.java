package org.kermeta.kompren.gwelet.actions;

import java.util.ArrayList;
import java.util.List;

import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;

import org.kermeta.kompren.gwelet.ui.TextFieldCompletion;
import org.malai.action.Action;

public class SetCompletionItems extends Action {
	protected List<String> database;

	protected TextFieldCompletion textField;

	protected String textReference;


	public SetCompletionItems() {
		super();
	}


	@Override
	public boolean isRegisterable() {
		return false;
	}


	@Override
	protected void doActionBody() {
		if(textReference==null || textReference.length()==0) {
			textField.setCompletionItems(new ArrayList<String>());
			textField.setVisibleCompletionMenu(false);
		}else {
			List<String> items = new ArrayList<String>();

			for(String dbItem : database)
				if(dbItem.toLowerCase().contains(textReference.toLowerCase()))
					items.add(dbItem);

			textField.setCompletionItems(items);
			textField.setVisibleCompletionMenu(!items.isEmpty());
	    	try {
	    		MenuSelectionManager.defaultManager().setSelectedPath(
	    				new MenuElement[]{textField.getComponentPopupMenu(), textField.getComponentPopupMenu().getSubElements()[0]});
	        }catch(Exception e) { /* */ }
		}
		done();
	}


	@Override
	public boolean canDo() {
		return database!=null && textReference!=null && textField!=null;
	}


	public void setDatabase(final List<String> database) {
		this.database = database;
	}


	public void setTextField(final TextFieldCompletion textField) {
		this.textField = textField;
	}


	public void setTextReference(final String textReference) {
		this.textReference = textReference;
	}
}
