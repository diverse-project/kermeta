package org.kermeta.kompren.gwelet.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.UIManager;

import org.kermeta.kompren.diagram.view.interfaces.IDiagramView;

public class KomprenFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	/** The displayed diagram. */
	protected ClassDiagramView diagram;


	/**
	 * Initialises the toolbar of the viewer.
	 */
	public static void initialiseToolbar(final JPanel toolbar, final AbstractButton undoBut, final AbstractButton redoBut, final AbstractButton prunerBut, final AbstractButton flattenerBut,
			final AbstractButton hierarcherBut, final AbstractButton handBut, final AbstractButton grayedBut, final AbstractButton hideBut, final JSpinner radiusSpin,
			final AbstractButton showOpBut, final AbstractButton showAttrBut, final JCheckBox cardCB, final JTextField tf) {
		ButtonGroup groupSelector 	= new ButtonGroup();
		ButtonGroup groupPruner 	= new ButtonGroup();

		toolbar.setLayout(new BoxLayout(toolbar, BoxLayout.LINE_AXIS));
		toolbar.add(undoBut);
		toolbar.add(redoBut);
		toolbar.add(Box.createHorizontalStrut(30));
		toolbar.add(prunerBut);
		toolbar.add(hierarcherBut);
		toolbar.add(flattenerBut);
		toolbar.add(handBut);

		toolbar.add(Box.createHorizontalStrut(50));
		toolbar.add(hideBut);
		toolbar.add(grayedBut);
		toolbar.add(radiusSpin);
		toolbar.add(cardCB);
		toolbar.add(Box.createHorizontalStrut(50));
		toolbar.add(showOpBut);
		toolbar.add(showAttrBut);
		toolbar.add(Box.createHorizontalStrut(50));
		toolbar.add(tf);

		groupSelector.add(prunerBut);
		groupSelector.add(hierarcherBut);
		groupSelector.add(flattenerBut);
		groupSelector.add(handBut);

		groupPruner.add(hideBut);
		groupPruner.add(grayedBut);
	}



	public KomprenFrame(final JPanel toolbar) {
		super("Kompren");

		try{ UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); }
		catch(Exception e) { /* */ }

		getContentPane().setLayout(new BorderLayout());
		diagram = new ClassDiagramView(true);
		JScrollPane sp = diagram.getScrollPane();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int width  = (int)(screen.width*0.85);
		int height = (int)(screen.height*0.8);
		sp.setPreferredSize(new Dimension(width, height));
		getContentPane().add(sp, BorderLayout.CENTER);
		getContentPane().add(toolbar, BorderLayout.NORTH);
		setLocation((screen.width-width)/2, (screen.height-height)/2);
		pack();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}





	/**
	 * Updates the layout of the class diagram that the viewer displays.
	 */
	public void organise() {
		diagram.updateLayout();
	}



	/**
	 * Refreshes the viewer (scrollbars, canvas, etc.).
	 */
	public void refreshView() {
		diagram.refresh();
	}





	public IDiagramView getDiagramView() {
		return diagram;
	}
}
