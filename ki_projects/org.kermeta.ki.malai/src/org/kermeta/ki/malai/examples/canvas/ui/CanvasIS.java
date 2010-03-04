package org.kermeta.ki.malai.examples.canvas.ui ; 

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.UIManager;

import org.kermeta.ki.malai.examples.canvas.concPres.CanvasUI;
import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;

public class CanvasIS extends JFrame { 
	private static final long serialVersionUID = 1l ; 
	
	protected CanvasUI canvas;
	
	
	
	public static RuntimeObject initialise(RuntimeObject appliRO, RuntimeObject drawingRO, RuntimeObject emwRO) {
		EventManagerWrapper emw = (EventManagerWrapper) emwRO.getUserData();
		CanvasIS canvasIS 		= new CanvasIS(emw);
		appliRO.setUserData(canvasIS);
		drawingRO.setUserData(canvasIS.getCanvas());
		
		return appliRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	public static RuntimeObject setVisible(RuntimeObject appliRO, RuntimeObject visibleRO) {
		boolean visible = Boolean.getValue(visibleRO);
		CanvasIS canvasIS = (CanvasIS) appliRO.getUserData();
		
		canvasIS.setVisible(visible);
		
		return appliRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject refreshView(RuntimeObject appliRO) {
		CanvasIS canvasIS = (CanvasIS) appliRO.getUserData();
		
		canvasIS.canvas.repaint();
		
		return appliRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
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
	
	
	public CanvasUI getCanvas() {
		return canvas;
	}
} 

