package org.kermeta.ki.kompren.view;

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

import org.kermeta.ki.diagram.view.interfaces.IDiagramView;

public class KomprenFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	/** The displayed diagram. */
	protected ClassDiagramView diagram;
	
	
	/**
	 * Initialises the toolbar of the viewer.
	 */
	public static void initialiseToolbar(JPanel toolbar, AbstractButton undoBut, AbstractButton redoBut, AbstractButton prunerBut, AbstractButton flattenerBut,
			AbstractButton hierarcherBut, AbstractButton handBut, AbstractButton grayedBut, AbstractButton hideBut, JSpinner radiusSpin,
			AbstractButton showOpBut, AbstractButton showAttrBut, JCheckBox cardCB, JTextField tf) {
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
		getContentPane().add(toolbar, BorderLayout.NORTH);
		
		diagram 						= new ClassDiagramView(true);
		JScrollPane sp 					= diagram.getScrollPane();
		Dimension screen 				= Toolkit.getDefaultToolkit().getScreenSize();
		int width  	= (int)(screen.width*0.7);
		int height 	= (int)(screen.height*0.8);
		sp.setPreferredSize(new Dimension(width, height));
		getContentPane().add(sp, BorderLayout.CENTER);

		QuestionsPanel questionsPanel 	= new QuestionsPanel(diagram, toolbar);
		getContentPane().add(questionsPanel, BorderLayout.EAST);
		
		Formular formular 				= new Formular(questionsPanel, sp, toolbar, this);
		getContentPane().add(formular, BorderLayout.SOUTH);
		
		pack();
		setLocation((screen.width-getWidth())/2, (screen.height-getHeight())/2);
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
