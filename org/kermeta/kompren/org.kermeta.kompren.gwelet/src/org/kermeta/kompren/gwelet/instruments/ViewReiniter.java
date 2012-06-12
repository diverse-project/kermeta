package org.kermeta.kompren.gwelet.instruments;

import org.malai.instrument.WidgetInstrument;
import org.malai.ui.UIComposer;
import org.malai.widget.MButton;

public class ViewReiniter extends WidgetInstrument {
	protected MButton reinit;


	public ViewReiniter(final UIComposer<?> composer) {
		super(composer);
		initialiseWidgets();
	}

	@Override
	protected void initialiseWidgets() {
		reinit = new MButton("Reinit");
	}

	@Override
	protected void initialiseLinks() {
		//
	}

	public MButton getReinit() {
		return reinit;
	}
}
