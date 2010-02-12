package org.kermeta.ki.malai.examples.canvas.ui ; 

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.UIManager;

import org.kermeta.ki.malai.examples.canvas.concPres.CanvasUI;

public class CanvasIS extends JFrame { 
	private static final long serialVersionUID = 1l ; 
	
	protected CanvasUI canvas;
	
	
	public CanvasIS() { 
		super();
		
		try{ UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); } 
		catch(Exception e) { /* */ }
		
		canvas = new CanvasUI();
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(canvas, BorderLayout.CENTER);
		
		setLocation(200, 100);
		pack();
		canvas.requestFocus();
	} 
} 

