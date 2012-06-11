package org.kermeta.kompren.gwelet.ui;

import java.awt.Frame;

import org.malai.ui.UIComposer;
import org.malai.widget.MProgressBar;

public class GweletUIBuilder extends UIComposer<GweletFrame> {

	public GweletUIBuilder(final GweletFrame frame) {
		super();
		widget = frame;
	}


	@Override
	public void compose(final MProgressBar progressBar) {
		widget.getContentPane().add(widget.getLayeredPanel());
		widget.pack();
		widget.setExtendedState(Frame.MAXIMIZED_BOTH);
		widget.getCanvas().requestFocusInWindow();
	}
}
