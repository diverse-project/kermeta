package org.kermeta.ki.visual;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;
import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;
import org.kermeta.ki.visual.MetamodelVizuFrame;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;

public abstract class MetamodelVizuFrameExtern {
	public static RuntimeObject initialiseToolbar(RuntimeObject toolbarRO, RuntimeObject undoButRO, RuntimeObject redoButRO, 
			RuntimeObject prunerButRO, RuntimeObject flattenerButRO, RuntimeObject hierarcherButRO, 
			RuntimeObject handButRO, RuntimeObject prunerGrayButRO, RuntimeObject prunerHideButRO, RuntimeObject radiusRO, RuntimeObject cardRO,
			RuntimeObject showOpButRO, RuntimeObject showAttrButRO, RuntimeObject tfRO) {

			MetamodelVizuFrame.initialiseToolbar((JPanel)toolbarRO.getUserData(), (AbstractButton)undoButRO.getUserData(), (AbstractButton)redoButRO.getUserData(), 
			(AbstractButton)prunerButRO.getUserData(), (AbstractButton)flattenerButRO.getUserData(), (AbstractButton)hierarcherButRO.getUserData(), 
			(AbstractButton)handButRO.getUserData(), (AbstractButton)prunerGrayButRO.getUserData(), (AbstractButton)prunerHideButRO.getUserData(), 
			(JSpinner)radiusRO.getUserData(), (AbstractButton)showOpButRO.getUserData(), (AbstractButton)showAttrButRO.getUserData(), 
			(JCheckBox)cardRO.getUserData(), (JTextField) tfRO.getUserData());
			
			return toolbarRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject organise(RuntimeObject appliRO) {
		((MetamodelVizuFrame)appliRO.getUserData()).organise();
		return appliRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject initialise(RuntimeObject appliRO, RuntimeObject mmRO, RuntimeObject tbRO, RuntimeObject viewPanelRO, RuntimeObject emwRO) {
			EventManagerWrapper emw 	= (EventManagerWrapper) emwRO.getUserData();
			JPanel toolbar 				= (JPanel) tbRO.getUserData();
			MetamodelVizuFrame canvasIS = new MetamodelVizuFrame(emw, toolbar);
			
			appliRO.setUserData(canvasIS);//TODO hashmap
			viewPanelRO.setUserData(canvasIS.mmView);
			mmRO.setUserData(canvasIS.mmView);
			RuntimeObject2JavaMap.MAP.put(canvasIS, appliRO);
			RuntimeObject2JavaMap.MAP.put(canvasIS.mmView, mmRO);
			
			return appliRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject setVisible(RuntimeObject appliRO, RuntimeObject visibleRO) {
		((MetamodelVizuFrame)appliRO.getUserData()).setVisible(Boolean.getValue(visibleRO));
		return appliRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject refreshView(RuntimeObject appliRO) {
		((MetamodelVizuFrame) appliRO.getUserData()).refreshView();		
		return appliRO.getFactory().getMemory().voidINSTANCE;
	}
}
