package org.kermeta.ki.kompren;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import org.kermeta.ki.kompren.view.ClassModelBasicStrategy;
import org.kermeta.ki.kompren.view.KomprenFrame;
import org.kermeta.ki.malai.interaction.eventWrapper.EventManagerWrapper;
import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class KomprenFrameExtern {
	public static void initialiseToolbar(Object toolbarRO, Object undoButRO, Object redoButRO, 
			Object prunerButRO, Object flattenerButRO, Object hierarcherButRO, 
			Object handButRO, Object prunerGrayButRO, Object prunerHideButRO, Object radiusRO, Object cardRO,
			Object showOpButRO, Object showAttrButRO, Object tfRO) {

			KomprenFrame.initialiseToolbar((JPanel)Source2TargetMap.MAP.getTargetObject(toolbarRO), 
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
		((KomprenFrame)Source2TargetMap.MAP.getTargetObject(appliRO)).organise();
	}
	
	
	
	
	public static void initialise(final Object appliRO, final Object mmRO, final Object tbRO, final Object viewPanelRO, 
									final Object emwRO, final Object handButRO) {
		EventManagerWrapper emw 	= (EventManagerWrapper) Source2TargetMap.MAP.getTargetObject(emwRO);
		JPanel toolbar 				= (JPanel) Source2TargetMap.MAP.getTargetObject(tbRO);
		KomprenFrame kompren 		= new KomprenFrame(emw, toolbar);
			
		kompren.getDiagramView().setLayoutStrategy(new ClassModelBasicStrategy(kompren.getDiagramView()));
		kompren.getDiagramView().getHand().setHandButton((AbstractButton)Source2TargetMap.MAP.getTargetObject(handButRO));
		Source2TargetMap.MAP.add(appliRO, kompren);
		Source2TargetMap.MAP.add(viewPanelRO, kompren.getDiagramView());
		Source2TargetMap.MAP.add(mmRO, kompren.getDiagramView());
	}
	
	
	
	public static void setVisible(final Object appliRO, final boolean visible) {
		((KomprenFrame)Source2TargetMap.MAP.getTargetObject(appliRO)).setVisible(visible);
	}
	
	
	
	
	public static void refreshView(final Object appliRO) {
		((KomprenFrame) Source2TargetMap.MAP.getTargetObject(appliRO)).refreshView();		
	}
}
