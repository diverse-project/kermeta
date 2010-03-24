package org.kermeta.ki.visual;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;
import org.kermeta.ki.visual.view.MetamodelView;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;

public class MetamodelVizuFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	protected MetamodelView mmView;
	
	
	
	public static RuntimeObject organise(RuntimeObject appliRO) {
		MetamodelVizuFrame interactiveSys = (MetamodelVizuFrame) appliRO.getUserData();
		interactiveSys.organiseModel();
		
		return appliRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	public static RuntimeObject initialise(RuntimeObject appliRO, RuntimeObject mmRO, RuntimeObject emwRO) {
		EventManagerWrapper emw = (EventManagerWrapper) emwRO.getUserData();
		MetamodelVizuFrame canvasIS = new MetamodelVizuFrame(emw);
		appliRO.setUserData(canvasIS);
		mmRO.setUserData(canvasIS.mmView);
		
		return appliRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	public static RuntimeObject setVisible(RuntimeObject appliRO, RuntimeObject visibleRO) {
		boolean visible = Boolean.getValue(visibleRO);
		MetamodelVizuFrame interactiveSys = (MetamodelVizuFrame) appliRO.getUserData();
		
		interactiveSys.setVisible(visible);
		
		return appliRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject refreshView(RuntimeObject appliRO) {
		MetamodelVizuFrame interactiveSys = (MetamodelVizuFrame) appliRO.getUserData();
		
		interactiveSys.mmView.repaint();
		
		return appliRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public MetamodelVizuFrame(EventManagerWrapper emw) { 
		super("Metamodel visualisation");
		
		try{ UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); } 
		catch(Exception e) { /* */ }

		mmView = new MetamodelView(emw);
		JScrollPane sp = new JScrollPane(mmView);
		sp.setPreferredSize(new Dimension(1000, 800));
		getContentPane().add(sp);
		setLocation(100, 100);
		pack();
		
     	addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if(mmView.getEventManager()!=null)
					mmView.getEventManager().onExitEvent();
            }});  
	}
	
	
	
	public void organiseModel() {
		double change1, change2=0.;
		int cpt = 0;
		boolean again = true;
		double gap = 1.;
		
		while(again) {		
			change1 = mmView.reorganise();
			
			if((change2+gap)>=change1 && (change2-gap)<=change1)
				again = false;
			else {
				cpt++;
				
				if(cpt==100)
					again = false;
			}

			change2=change1;
	    }
		
		mmView.recentre();
		mmView.updatePreferredSize();
		mmView.validate();
	}
}
