package org.kermeta.ki.visual;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;
import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;


public abstract class MetamodelVizuFrameExtern {
	public static void initialiseToolbar(Object toolbarRO, Object undoButRO, Object redoButRO, 
			Object prunerButRO, Object flattenerButRO, Object hierarcherButRO, 
			Object handButRO, Object prunerGrayButRO, Object prunerHideButRO, Object radiusRO, Object cardRO,
			Object showOpButRO, Object showAttrButRO, Object tfRO) {

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
	}
	
	
	
	public static void organise(final Object appliRO) {
		((MetamodelVizuFrame)Source2TargetMap.MAP.getTargetObject(appliRO)).organise();
	}
	
	
	
	
	public static void initialise(final Object appliRO, final Object mmRO, final Object tbRO, final Object viewPanelRO, final Object emwRO) {
		EventManagerWrapper emw 	= (EventManagerWrapper) Source2TargetMap.MAP.getTargetObject(emwRO);
		JPanel toolbar 				= (JPanel) Source2TargetMap.MAP.getTargetObject(tbRO);
		MetamodelVizuFrame canvasIS = new MetamodelVizuFrame(emw, toolbar);
		
		Source2TargetMap.MAP.add(appliRO, canvasIS);
		Source2TargetMap.MAP.add(viewPanelRO, canvasIS.mmView);
		Source2TargetMap.MAP.add(mmRO, canvasIS.mmView);
	}
	
	
	
	public static void setVisible(final Object appliRO, final boolean visible) {
		((MetamodelVizuFrame)Source2TargetMap.MAP.getTargetObject(appliRO)).setVisible(visible);
	}
	
	
	public static void refreshView(final Object appliRO) {
		((MetamodelVizuFrame) Source2TargetMap.MAP.getTargetObject(appliRO)).refreshView();	
	}
}

