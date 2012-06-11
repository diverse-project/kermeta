package org.kermeta.kompren.gwelet.ui;

import java.awt.Frame;

import org.kermeta.kompren.gwelet.visualisation.MPieMenu;
import org.malai.ui.UIComposer;
import org.malai.widget.MProgressBar;

public class GweletUIBuilder extends UIComposer<GweletFrame> {

	public GweletUIBuilder(final GweletFrame frame) {
		super();
		widget = frame;
	}


	@Override
	public void compose(final MProgressBar progressBar) {
		MPieMenu menu = widget.visualiserManager.getMenu();
		menu.add(widget.visualiser.getReinit());
		menu.add(widget.visualiser.getSuperClasses());
		menu.add(widget.visualiser.getLowerClasses());
		menu.add(widget.visualiser.getPruning());
		menu.add(widget.visualiser.getFlat());

		widget.getContentPane().add(widget.getLayeredPanel());
		widget.pack();
		widget.setExtendedState(Frame.MAXIMIZED_BOTH);
		widget.getCanvas().requestFocusInWindow();
	}
}
