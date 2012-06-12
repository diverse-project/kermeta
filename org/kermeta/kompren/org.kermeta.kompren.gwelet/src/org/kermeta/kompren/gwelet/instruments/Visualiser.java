package org.kermeta.kompren.gwelet.instruments;

import javax.swing.ImageIcon;

import org.kermeta.kompren.gwelet.actions.Prune;
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
	}

	@Override
	protected void initialiseLinks() {
		try {
			addLink(new Button2ShowHierarchy(this));
			addLink(new Button2Prune(this));
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void setActivated(final boolean activated) {
		super.setActivated(activated);

		superClasses.setEnabled(activated);
		lowerClasses.setEnabled(activated);
		pruning.setEnabled(activated);
		flat.setEnabled(activated);
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


	public MButton getFlat() {
		return flat;
	}


	private class Button2Prune extends Link<Prune, ButtonPressed, Visualiser> {
		public Button2Prune(final Visualiser ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, Prune.class, ButtonPressed.class);
		}

		@Override
		public void initAction() {
			action.setModelView(instrument.frame.getCanvas());
			action.setBuilder(instrument.frame.getViewBuilder());
			action.setSlicer(instrument.slicer);
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getButton()==instrument.pruning;
		}
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
