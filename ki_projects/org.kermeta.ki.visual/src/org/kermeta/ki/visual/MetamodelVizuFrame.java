package org.kermeta.ki.visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractButton;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;
import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;
import org.kermeta.ki.visual.view.MetamodelView;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;

public class MetamodelVizuFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	protected MetamodelView mmView;
	
	
	
	public static RuntimeObject initialiseToolbar(RuntimeObject toolbarRO, RuntimeObject undoButRO, RuntimeObject redoButRO, 
							RuntimeObject prunerButRO, RuntimeObject prunerGrayButRO, RuntimeObject prunerHideButRO) {
		JPanel toolbar = (JPanel) toolbarRO.getUserData();
		AbstractButton undoBut 		= (AbstractButton)undoButRO.getUserData();
		AbstractButton redoBut 		= (AbstractButton)redoButRO.getUserData();
		AbstractButton prunerBut 	= (AbstractButton)prunerButRO.getUserData();
		AbstractButton grayedBut 	= (AbstractButton)prunerGrayButRO.getUserData();
		AbstractButton hideBut 		= (AbstractButton)prunerHideButRO.getUserData();
		ButtonGroup groupSelector 	= new ButtonGroup();
		ButtonGroup groupPruner 	= new ButtonGroup();
		
		toolbar.setLayout(new BoxLayout(toolbar, BoxLayout.LINE_AXIS));
		toolbar.add(undoBut);
		toolbar.add(redoBut);
		toolbar.add(Box.createHorizontalStrut(30));
		toolbar.add(prunerBut);
		toolbar.add(Box.createHorizontalStrut(50));
		toolbar.add(hideBut);
		toolbar.add(grayedBut);
		
		groupSelector.add(prunerBut);
		
		groupPruner.add(hideBut);
		groupPruner.add(grayedBut);
		
		return toolbarRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject organise(RuntimeObject appliRO) {
		MetamodelVizuFrame interactiveSys = (MetamodelVizuFrame) appliRO.getUserData();
		interactiveSys.mmView.initialiseForest();
		interactiveSys.mmView.setTreeLayout();
		
		return appliRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	public static RuntimeObject initialise(RuntimeObject appliRO, RuntimeObject mmRO, RuntimeObject tbRO, 
											RuntimeObject viewPanelRO, RuntimeObject emwRO) {
		EventManagerWrapper emw 	= (EventManagerWrapper) emwRO.getUserData();
		JPanel toolbar 				= (JPanel) tbRO.getUserData();
		MetamodelVizuFrame canvasIS = new MetamodelVizuFrame(emw, toolbar);
		
		appliRO.setUserData(canvasIS);
		viewPanelRO.setUserData(canvasIS.mmView);
		mmRO.setUserData(canvasIS.mmView);
		RuntimeObject2JavaMap.MAP.put(canvasIS, appliRO);
		RuntimeObject2JavaMap.MAP.put(canvasIS.mmView, mmRO);
		
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
	
	
	
	
	
	
	public MetamodelVizuFrame(EventManagerWrapper emw, JPanel toolbar) { 
		super("Metamodel visualisation");
		
//		try{ UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel"); } 
//		catch(Exception e) { /* */ }
		
		getContentPane().setLayout(new BorderLayout());
		mmView = new MetamodelView(emw);
		JScrollPane sp = new JScrollPane(mmView);
		sp.setPreferredSize(new Dimension(1000, 800));
		getContentPane().add(sp, BorderLayout.CENTER);
		getContentPane().add(toolbar, BorderLayout.NORTH);
		setLocation(100, 100);
		pack();
		
     	addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if(mmView.getEventManager()!=null)
					mmView.getEventManager().onExitEvent();
            }});
     
		new FileDrop(mmView, new FileDrop.Listener()
        {   public void filesDropped( java.io.File[] files )
            {   for( int i = 0; i < files.length; i++ )
                {  
            		System.out.println(files[i].getAbsolutePath());
                }   // end for: through each dropped file
            }   // end filesDropped
        }); // end Fi
	}
}
