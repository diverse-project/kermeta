package org.kermeta.ki.visual;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;
import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;

public abstract class MetamodelVizuFrameExtern {
	public static RuntimeObject initialiseToolbar(RuntimeObject toolbarRO, RuntimeObject undoButRO, RuntimeObject redoButRO, 
			RuntimeObject prunerButRO, RuntimeObject flattenerButRO, RuntimeObject hierarcherButRO, 
			RuntimeObject handButRO, RuntimeObject prunerGrayButRO, RuntimeObject prunerHideButRO, RuntimeObject radiusRO, RuntimeObject cardRO,
			RuntimeObject showOpButRO, RuntimeObject showAttrButRO, RuntimeObject tfRO) {

			MetamodelVizuFrame.initialiseToolbar((JPanel)Source2TargetMap.MAP.getTargetObject(toolbarRO), 
					(AbstractButton)Source2TargetMap.MAP.getTargetObject(undoButRO), 
					(AbstractButton)Source2TargetMap.MAP.getTargetObject(redoButRO),
					(AbstractButton)Source2TargetMap.MAP.getTargetObject(prunerButRO),
					(AbstractButton)Source2TargetMap.MAP.getTargetObject(flattenerButRO),
					(AbstractButton)Source2TargetMap.MAP.getTargetObject(hierarcherButRO),
					(AbstractButton)Source2TargetMap.MAP.getTargetObject(handButRO),
					(AbstractButton)Source2TargetMap.MAP.getTargetObject(prunerGrayButRO),
					(AbstractButton)Source2TargetMap.MAP.getTargetObject(prunerHideButRO),
					(JSpinner)Source2TargetMap.MAP.getTargetObject(radiusRO),
					(AbstractButton)Source2TargetMap.MAP.getTargetObject(showOpButRO),
					(AbstractButton)Source2TargetMap.MAP.getTargetObject(showAttrButRO),
					(JCheckBox)Source2TargetMap.MAP.getTargetObject(cardRO),
					(JTextField)Source2TargetMap.MAP.getTargetObject(tfRO));
			
			return toolbarRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject organise(final RuntimeObject appliRO) {
		((MetamodelVizuFrame)Source2TargetMap.MAP.getTargetObject(appliRO)).organise();
		return appliRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject initialise(RuntimeObject appliRO, RuntimeObject mmRO, RuntimeObject tbRO, RuntimeObject viewPanelRO, RuntimeObject emwRO) {
			EventManagerWrapper emw 	= (EventManagerWrapper) Source2TargetMap.MAP.getTargetObject(emwRO);
			JPanel toolbar 				= (JPanel) Source2TargetMap.MAP.getTargetObject(tbRO);
			MetamodelVizuFrame canvasIS = new MetamodelVizuFrame(emw, toolbar);
			
			Source2TargetMap.MAP.add(appliRO, canvasIS);
			Source2TargetMap.MAP.add(viewPanelRO, canvasIS.mmView);
			Source2TargetMap.MAP.add(mmRO, canvasIS.mmView);
			
			return appliRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject setVisible(final RuntimeObject appliRO, final RuntimeObject visibleRO) {
		((MetamodelVizuFrame)Source2TargetMap.MAP.getTargetObject(appliRO)).setVisible(Boolean.getValue(visibleRO));
		return appliRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject refreshView(final RuntimeObject appliRO) {
		((MetamodelVizuFrame) Source2TargetMap.MAP.getTargetObject(appliRO)).refreshView();		
		return appliRO.getFactory().getMemory().voidINSTANCE;
	}
}
