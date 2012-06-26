package org.kermeta.kompren.gwelet.instruments;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import org.kermeta.kompren.gwelet.actions.Flat;
import org.kermeta.kompren.gwelet.actions.Prune;
import org.kermeta.kompren.gwelet.actions.ShowHierarchy;
import org.kermeta.kompren.gwelet.ui.GweletFrame;
import org.kermeta.kompren.gwelet.visualisation.GweletSlicer;
import org.malai.instrument.Link;
import org.malai.instrument.WidgetInstrument;
import org.malai.interaction.library.ButtonPressed;
import org.malai.ui.UIComposer;
import org.malai.widget.MButton;
import org.malai.widget.MSpinner;

public class Visualiser extends WidgetInstrument {

	protected MButton superClasses;

	protected MButton lowerClasses;

	protected MButton pruning;

	protected MButton flat;

	protected GweletFrame frame;

	protected GweletSlicer slicer;

	protected MSpinner radius;


	public Visualiser(final UIComposer<?> composer) {
		super(composer);
		initialiseWidgets();
		frame 	= (GweletFrame) composer.getWidget();
		slicer 	= new GweletSlicer(frame.getCanvas());
	}


	@Override
	protected void initialiseWidgets() {
		superClasses 	= new MButton(new ImageIcon("resources/hierar.png"));
		pruning 		= new MButton(new ImageIcon("resources/prune.png"));
		flat 			= new MButton(new ImageIcon("resources/flat.png"));
		lowerClasses 	= new MButton("subCl");
		radius 			= new MSpinner(new MSpinner.MSpinnerNumberModel(0, 0, 1000, 1), new JLabel("Radius:"));

		superClasses.setToolTipText("Shows the super classes of the selected class.");
		pruning.setToolTipText("Shows the classes in relation with the selected class.");
		flat.setToolTipText("Shows all the inherited and native properties and operations of the selected class (by flattening its hierarchy).");
		radius.setToolTipText("Sets the radius of the hierarchy and pruning slicing: 0, there is no radius; 1, only the direct classes are kept; etc.");
	}

	@Override
	protected void initialiseLinks() {
		try {
			addLink(new Button2ShowHierarchy(this));
			addLink(new Button2Prune(this));
			addLink(new Button2Flat(this));
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


	public MSpinner getRadius() {
		return radius;
	}



	private class Button2Flat extends Link<Flat, ButtonPressed, Visualiser> {
		public Button2Flat(final Visualiser ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, Flat.class, ButtonPressed.class);
		}

		@Override
		public void initAction() {
			action.setModelView(instrument.frame.getCanvas());
			action.setSlicer(instrument.slicer);
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getButton()==instrument.flat;
		}
	}



	private class Button2Prune extends Link<Prune, ButtonPressed, Visualiser> {
		public Button2Prune(final Visualiser ins) throws InstantiationException, IllegalAccessException {
			super(ins, false, Prune.class, ButtonPressed.class);
		}

		@Override
		public void initAction() {
			action.setModelView(instrument.frame.getCanvas());
			action.setSlicer(instrument.slicer);
			action.setRadius((Integer)instrument.radius.getValue());
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
			action.setSlicer(instrument.slicer);
			action.setSuperTypes(interaction.getButton()==instrument.superClasses);
			action.setRadius((Integer)instrument.radius.getValue());
		}

		@Override
		public boolean isConditionRespected() {
			return interaction.getButton()==instrument.superClasses || interaction.getButton()==instrument.lowerClasses;
		}
	}
}
