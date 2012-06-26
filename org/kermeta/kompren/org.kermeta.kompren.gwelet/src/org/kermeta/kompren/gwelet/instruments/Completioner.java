package org.kermeta.kompren.gwelet.instruments;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoundedRangeModel;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;

import org.kermeta.kompren.gwelet.actions.SelectMenuItem;
import org.kermeta.kompren.gwelet.actions.SetCompletionItems;
import org.kermeta.kompren.gwelet.actions.SetVisibleComponent;
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
import org.malai.interaction.Interaction;
import org.malai.interaction.library.KeyPressure;
import org.malai.interaction.library.MenuItemPressed;
import org.malai.interaction.library.TextChanged;
import org.malai.ui.UIComposer;
import org.malai.widget.MPopupMenu;

public class Completioner extends WidgetInstrument {
	protected TextFieldCompletion textField;

	protected JLabel label;

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
		textField.setToolTipText("Searches a class with its name and zooms on the class corresponding to the selected sub-menu.");
		label = new JLabel("Search:");
	}



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
			addLink(new ArrowPressed2MoveMenu(this));
			addLink(new EnterPressed2ZoomOn(this));
			addLink(new TextChanged2SetCompletion(this));
			addLink(new MenuItem2ZoomOn(this));
			addLink(new EnterEscape2HidePopupMenu(this));
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}



	private class ArrowPressed2MoveMenu extends Link<SelectMenuItem, KeyPressure, Completioner> {
		public ArrowPressed2MoveMenu(final Completioner ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, SelectMenuItem.class, KeyPressure.class);
		}


		@Override
		public void initAction() {
			JPopupMenu menu = instrument.textField.getComponentPopupMenu();
			MenuElement[] elts = MenuSelectionManager.defaultManager().getSelectedPath();
			int index = elts==null || elts.length==0 || !(elts[elts.length-1] instanceof Component) ?
							-1 : menu.getComponentIndex((Component)elts[elts.length-1]);
			boolean isUp = interaction.getKey()==KeyEvent.VK_UP;

			if(isUp)
				switch(index) {
					case -1: index = 0; break;
					case 0:	index = menu.getComponentCount()-1; break;
					default: index -= 1;
				}
			else
				if(index==-1 || index==menu.getComponentCount()-1)
					index = 0;
				else
					index += 1;

			action.setMenu(menu);
			action.setIndex(index);
		}


		@Override
		public boolean isConditionRespected() {
			return (interaction.getKey()==KeyEvent.VK_UP || interaction.getKey()==KeyEvent.VK_DOWN) &&
					instrument.textField.getComponentPopupMenu().getComponentCount()>0;
		}
	}




	private abstract class Interaction2MoveCamera<I extends Interaction> extends Link<MoveCamera, I, Completioner> {
		public Interaction2MoveCamera(final Completioner ins, final Class<I> clazzInteraction) throws InstantiationException, IllegalAccessException {
			super(ins, false, MoveCamera.class, clazzInteraction);
		}


		protected void setAction(final String qualifiedPath) {
			final ClassView cv = ModelViewMapper.getMapper().getClassView(qualifiedPath);

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
	}


	private class EnterEscape2HidePopupMenu extends Link<SetVisibleComponent, KeyPressure, Completioner> {
		public EnterEscape2HidePopupMenu(final Completioner ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, SetVisibleComponent.class, KeyPressure.class);
		}

		@Override
		public void initAction() {
			action.setVisible(false);
			action.setComponent(instrument.textField.getComponentPopupMenu());
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getKey()==KeyEvent.VK_ENTER || interaction.getKey()==KeyEvent.VK_ESCAPE;
		}
	}



	private class EnterPressed2ZoomOn extends Interaction2MoveCamera<KeyPressure> {
		public EnterPressed2ZoomOn(final Completioner ins) throws InstantiationException, IllegalAccessException {
			super(ins, KeyPressure.class);
		}


		@Override
		public void initAction() {
			MenuElement[] elts = MenuSelectionManager.defaultManager().getSelectedPath();
			String name = elts==null || elts.length==0 || !(elts[elts.length-1] instanceof JMenuItem) ?
							"" : ((JMenuItem)elts[elts.length-1]).getText();
			setAction(name);
		}


		@Override
		public boolean isConditionRespected() {
			return interaction.getKey()==KeyEvent.VK_ENTER && instrument.textField.getComponentPopupMenu().getComponentCount()>0;
		}
	}




	private class MenuItem2ZoomOn extends Interaction2MoveCamera<MenuItemPressed> {
		public MenuItem2ZoomOn(final Completioner ins) throws InstantiationException, IllegalAccessException {
			super(ins, MenuItemPressed.class);
		}


		@Override
		public void initAction() {
			setAction(interaction.getMenuItem().getText());
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


	public JLabel getLabel() {
		return label;
	}
}
