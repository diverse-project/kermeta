package org.kermeta.ki.malai.examples.canvas.ui ; 

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.UIManager;

import org.kermeta.ki.malai.examples.canvas.concPres.CanvasUI;
import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;

public class CanvasIS extends JFrame { 
	private static final long serialVersionUID = 1l ; 
	
	protected CanvasUI canvas;
	
	
	public CanvasIS(EventManagerWrapper emw) { 
		super();
		
		try{ UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); } 
		catch(Exception e) { /* */ }
		
		canvas = new CanvasUI(emw);
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(canvas, BorderLayout.CENTER);
		
		setLocation(200, 100);
		pack();
		canvas.requestFocus();
		
     	addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						canvas.getEventManager().onExitEvent();
                    }});  
	} 
} 

