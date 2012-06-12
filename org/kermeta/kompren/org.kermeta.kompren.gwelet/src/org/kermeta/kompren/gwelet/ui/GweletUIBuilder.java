package org.kermeta.kompren.gwelet.ui;

import java.awt.Frame;

import org.kermeta.kompren.gwelet.view.MetamodelView;
import org.malai.ui.UIComposer;
import org.malai.widget.MProgressBar;

public class GweletUIBuilder extends UIComposer<GweletFrame> {

	public GweletUIBuilder(final GweletFrame frame) {
		super();
		widget = frame;
	}


	@Override
	public void compose(final MProgressBar progressBar) {
		MetamodelView mmv = widget.getCanvas();
		MPieMenu menu = widget.visualiserManager.getMenu();
		menu.add(widget.reiniter.getReinit());
		menu.add(widget.visualiser.getSuperClasses());
		menu.add(widget.visualiser.getLowerClasses());
		menu.add(widget.visualiser.getPruning());
		menu.add(widget.visualiser.getFlat());
		menu.add(widget.undoredoer.getRedoB());
		menu.add(widget.undoredoer.getUndoB());

		widget.undoredoer.setActivated(true);
		widget.scroller.addEventable(mmv);
		widget.scroller.setActivated(true);
		widget.hand.addEventable(mmv);
		widget.hand.setActivated(true);
		widget.visualiserManager.addEventable(mmv);
		widget.visualiserManager.setActivated(true);
		widget.visualiser.addEventable(widget.visualiserManager.getMenu());
		widget.visualiser.setActivated(true);
		widget.reiniter.addEventable(widget.visualiserManager.getMenu());
		widget.reiniter.setActivated(true);
		widget.undoredoer.addEventable(widget.visualiserManager.getMenu());
		widget.zoomer.addEventable(mmv);
		widget.zoomer.setActivated(true);

		widget.getContentPane().add(widget.getLayeredPanel());
		widget.pack();
		widget.setExtendedState(Frame.MAXIMIZED_BOTH);
		widget.getCanvas().requestFocusInWindow();
	}
}
