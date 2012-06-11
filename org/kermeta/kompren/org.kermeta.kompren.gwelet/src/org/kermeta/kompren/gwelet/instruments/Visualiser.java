package org.kermeta.kompren.gwelet.instruments;

import javax.swing.ImageIcon;

import org.malai.instrument.WidgetInstrument;
import org.malai.ui.UIComposer;
import org.malai.widget.MButton;

public class Visualiser extends WidgetInstrument {

	protected MButton superClasses;

	protected MButton lowerClasses;

	protected MButton pruning;

	protected MButton reinit;

	protected MButton flat;


	public Visualiser(final UIComposer<?> composer) {
		super(composer);
		initialiseWidgets();
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
		// TODO Auto-generated method stub

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

}
