package org.kermeta.kompren.gwelet.instruments;

import java.util.ArrayList;
import java.util.List;

import org.kermeta.kompren.gwelet.actions.SetCompletionItems;
import org.kermeta.kompren.gwelet.model.ModelUtils;
import org.kermeta.kompren.gwelet.ui.TextFieldCompletion;
import org.kermeta.language.structure.ClassDefinition;
import org.malai.instrument.Link;
import org.malai.instrument.WidgetInstrument;
import org.malai.interaction.library.TextChanged;
import org.malai.ui.UIComposer;

public class Completioner extends WidgetInstrument {
	protected TextFieldCompletion textField;

	protected List<String> database;


	public Completioner(final UIComposer<?> composer) {
		super(composer);

		database = new ArrayList<String>();
		initialiseWidgets();
	}


	public void setDatabase(final List<ClassDefinition> cds) {
		for(ClassDefinition clazz : cds)
			if(!clazz.getIsAspect())
				database.add(ModelUtils.INSTANCE.getQualifiedName(clazz));
	}


	@Override
	protected void initialiseWidgets() {
		textField = new TextFieldCompletion();
	}


//	public void onActionDone(final Link<?,?,?> link, final Action action) {
//		if(link instanceof TextChanged2SearchClasses)
//			if(searchedClasses.size()>0) {
//				final String nameStart  = "<html><font color=\"black\">";
//				final String nameEnd = ")</font></html>";
//				final String color = "</font><font color=\"gray\">";
//				MMenuItem menuItem;
//
//				textField.setVisibleCompletionMenu(false);
//				List<String> items = new ArrayList<String>();
//
//				for(TypeDefinition td : searchedClasses)
//					items.add(nameStart + td.getName() + color + " (" + td.getPackageName() + nameEnd);
//
//				textField.setCompletionItems(items);
//				textField.setVisibleCompletionMenu(true);
//			}
//			else
//				textField.setVisibleCompletionMenu(false);
//	}


	@Override
	public void setActivated(final boolean activated) {
		super.setActivated(activated);
		textField.setVisible(activated);

		if(activated)
			textField.setText("");
	}


	@Override
	protected void initialiseLinks() {
		try {
			addLink(new TextChanged2SetCompletion(this));
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}



	private class TextChanged2SetCompletion extends Link<SetCompletionItems, TextChanged, Completioner> {
		public TextChanged2SetCompletion(final Completioner ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, SetCompletionItems.class, TextChanged.class);
		}

		@Override
		public void initAction() {
			action.setTextField(instrument.textField);
			action.setTextReference(instrument.textField.getText());
			action.setDatabase(instrument.database);
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getTextComp()==instrument.textField;
		}
	}


	public TextFieldCompletion getTextField() {
		return textField;
	}
}












