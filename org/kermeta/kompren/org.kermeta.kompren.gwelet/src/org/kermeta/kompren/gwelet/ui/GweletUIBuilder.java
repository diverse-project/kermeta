package org.kermeta.kompren.gwelet.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.JPanel;

import org.kermeta.kompren.gwelet.eval.Formular;
import org.kermeta.kompren.gwelet.eval.QuestionsPanel;
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
		QuestionsPanel qpanel = new QuestionsPanel(widget, widget.toolbar);
		Formular formular = new Formular(qpanel, mmv.getScrollpane(), new JPanel(), widget);
		MPieMenu menu = widget.visualiserManager.getMenu();
		menu.add(widget.reiniter.getReinit());
		menu.add(widget.visualiser.getSuperClasses());
//		menu.add(widget.visualiser.getLowerClasses());
		menu.add(widget.visualiser.getPruning());
		menu.add(widget.visualiser.getFlat());
		menu.add(widget.undoredoer.getRedoB());
		menu.add(widget.undoredoer.getUndoB());

		widget.completioner.setActivated(true);
		widget.completioner.addEventable(widget.toolbar);
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
		widget.zoomer.addEventable(widget.toolbar);
		widget.zoomer.setActivated(true);

		TextFieldCompletion field = widget.completioner.getTextField();
		Dimension dim = new Dimension(250, 30);
		field.setPreferredSize(dim);
		field.setMaximumSize(dim);
		widget.toolbar.add(widget.completioner.getLabel());
		widget.toolbar.add(field);
		widget.toolbar.add(widget.visualiser.getRadius().getLabel());
		widget.toolbar.add(widget.visualiser.getRadius());
		field.removeActionListener(widget.toolbar.getEventManager());
		widget.setMinimumSize(new Dimension(800, 600));

		Container pane = widget.getContentPane();
		pane.setLayout(new BorderLayout());
		pane.add(widget.toolbar, BorderLayout.NORTH);
		pane.add(widget.getLayeredPanel(), BorderLayout.CENTER);
		pane.add(qpanel, BorderLayout.EAST);
		pane.add(formular, BorderLayout.SOUTH);
		widget.pack();
		widget.setLocation(200, 200);
		widget.setExtendedState(Frame.MAXIMIZED_BOTH);
		widget.getCanvas().requestFocusInWindow();
	}
}
