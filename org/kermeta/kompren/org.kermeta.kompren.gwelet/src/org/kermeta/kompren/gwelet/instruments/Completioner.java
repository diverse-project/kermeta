package org.kermeta.kompren.gwelet.instruments;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoundedRangeModel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import org.kermeta.kompren.gwelet.actions.SetCompletionItems;
import org.kermeta.kompren.gwelet.model.ModelUtils;
import org.kermeta.kompren.gwelet.ui.GweletFrame;
import org.kermeta.kompren.gwelet.ui.TextFieldCompletion;
import org.kermeta.kompren.gwelet.view.ClassView;
import org.kermeta.kompren.gwelet.view.MetamodelView;
import org.kermeta.kompren.gwelet.view.ModelViewMapper;
import org.kermeta.language.structure.ClassDefinition;
import org.malai.action.library.MoveCamera;
import org.malai.instrument.Link;
import org.malai.instrument.WidgetInstrument;
import org.malai.instrument.library.BasicZoomer;
import org.malai.interaction.library.MenuItemPressed;
import org.malai.interaction.library.TextChanged;
import org.malai.ui.UIComposer;
import org.malai.widget.MPopupMenu;

public class Completioner extends WidgetInstrument {
	protected TextFieldCompletion textField;

	protected BasicZoomer zoomer;

	protected List<String> database;


	public Completioner(final UIComposer<?> composer, final BasicZoomer zoomer) {
		super(composer);

		this.zoomer = zoomer;
		database = new ArrayList<String>();
		initialiseWidgets();
		addEventable((MPopupMenu)textField.getComponentPopupMenu());
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
			addLink(new MenuItem2ZoomOn(this));
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}



	private class MenuItem2ZoomOn extends Link<MoveCamera, MenuItemPressed, Completioner> {
		public MenuItem2ZoomOn(final Completioner ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, MoveCamera.class, MenuItemPressed.class);
		}


		@Override
		public void initAction() {
			final ClassView cv = ModelViewMapper.getMapper().getClassView(interaction.getMenuItem().getText());

			if(cv!=null) {
				MetamodelView canvas = ((GweletFrame)instrument.getComposer().getWidget()).getCanvas();
				JScrollPane pane = canvas.getScrollpane();
				double zoom = zoomer.getZoomable().getZoom();

				action.setScrollPane(pane);

				final Point2D centre = cv.getCentre();
				final JScrollBar vertSB  = pane.getVerticalScrollBar();
				final JScrollBar horizSB = pane.getHorizontalScrollBar();

				if(vertSB.isVisible()) {
					final BoundedRangeModel model = vertSB.getModel();
					final int value	= model.getValue();
					final int cy 	= pane.getHeight()/2 + value;
					int newValue 	= value+(int)(centre.getY()*zoom)-cy;

					if(newValue>model.getMaximum())
						newValue = model.getMaximum();
					else if(newValue<model.getMinimum())
						newValue = model.getMinimum();

					action.setPy(newValue);
				}

				if(horizSB.isVisible()) {
					final BoundedRangeModel model = horizSB.getModel();
					final int value	= model.getValue();
					final int cx 	= pane.getWidth()/2 + value;
					int newValue 	= value+(int)(centre.getX()*zoom)-cx;

					if(newValue>model.getMaximum())
						newValue = model.getMaximum();
					else if(newValue<model.getMinimum())
						newValue = model.getMinimum();

					action.setPx(newValue);
				}
			}
		}


		@Override
		public boolean isConditionRespected() {
			JPopupMenu menu = instrument.textField.getComponentPopupMenu();
			return menu!=null && menu.getComponentIndex(interaction.getMenuItem())!=-1;
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
