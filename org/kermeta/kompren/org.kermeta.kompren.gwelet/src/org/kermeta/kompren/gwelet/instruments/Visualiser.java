package org.kermeta.kompren.gwelet.instruments;

import javax.swing.ImageIcon;

import org.kermeta.kompren.gwelet.actions.ShowHierarchy;
import org.kermeta.kompren.gwelet.ui.GweletFrame;
import org.kermeta.kompren.gwelet.visualisation.GweletSlicer;
import org.malai.instrument.Link;
import org.malai.instrument.WidgetInstrument;
import org.malai.interaction.library.ButtonPressed;
import org.malai.ui.UIComposer;
import org.malai.widget.MButton;

public class Visualiser extends WidgetInstrument {

	protected MButton superClasses;

	protected MButton lowerClasses;

	protected MButton pruning;

	protected MButton reinit;

	protected MButton flat;

	protected GweletFrame frame;

	protected GweletSlicer slicer;


	public Visualiser(final UIComposer<?> composer) {
		super(composer);
		initialiseWidgets();
		frame 	= (GweletFrame) composer.getWidget();
		slicer 	= new GweletSlicer(frame.getCanvas(), frame.getViewBuilder());
	}


	@Override
	protected void initialiseWidgets() {
		superClasses 	= new MButton(new ImageIcon("resources/hierar.png"));
		pruning 		= new MButton(new ImageIcon("resources/prune.png"));
		flat 			= new MButton(new ImageIcon("resources/flat.png"));
		lowerClasses 	= new MButton("subCl");
		reinit 			= new MButton("Reinit");
	}

	@Override
	protected void initialiseLinks() {
		try {
			addLink(new Button2ShowHierarchy(this));
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}


	public MButton getSuperClasses() {
		return superClasses;
	}


	public MButton getLowerClasses() {
		return lowerClasses;
	}


	public MButton getPruning() {
		return pruning;
	}


	public MButton getReinit() {
		return reinit;
	}


	public MButton getFlat() {
		return flat;
	}



	private class Button2ShowHierarchy extends Link<ShowHierarchy, ButtonPressed, Visualiser> {
		public Button2ShowHierarchy(final Visualiser ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, ShowHierarchy.class, ButtonPressed.class);
		}

		@Override
		public void initAction() {
			action.setModelView(instrument.frame.getCanvas());
			action.setBuilder(instrument.frame.getViewBuilder());
			action.setSlicer(instrument.slicer);
			action.setSuperTypes(interaction.getButton()==instrument.superClasses);
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getButton()==instrument.superClasses || interaction.getButton()==instrument.lowerClasses;
		}
	}
}
