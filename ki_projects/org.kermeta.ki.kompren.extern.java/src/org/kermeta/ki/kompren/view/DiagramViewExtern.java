package org.kermeta.ki.kompren.view;

import org.kermeta.ki.diagram.view.interfaces.IDiagramView;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;
import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class DiagramViewExtern {
	public static void update(final Object mmRO) {
		((IDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO)).update();
	}
	
	
	public static void onRelationRemoved(final Object mmRO, final Object linkRO) {
		((IDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO)).removeRelation((IRelationView)Source2TargetMap.MAP.getTargetObject(linkRO));
		Source2TargetMap.MAP.removeSourceObject(linkRO);
	}
	
	
	public static void organise(final Object mmRO) {
		((IDiagramView)Source2TargetMap.MAP.getTargetObject(mmRO)).updateLayout();
	}
	
	
	
	public static void onEntityRemoved(final Object mmRO, final Object entityRO) {
		final IDiagramView diagramView 	= (IDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO);
		final IEntityView view   		= (IEntityView) Source2TargetMap.MAP.getTargetObject(entityRO);
		
		diagramView.removeEntity(view);
		Source2TargetMap.MAP.removeSourceObject(entityRO);
	}

	
	public static void refresh(final Object mmRO) {
		((IDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO)).refresh();
	}
	
	
	public static void focusOnEntity(final Object mmRO, final Object typeDefRO) {
		final IDiagramView mm = (IDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO);
		final Object typeDef   = Source2TargetMap.MAP.getTargetObject(typeDefRO);
		
		if(typeDef instanceof IEntityView)
			mm.focusOnEntity((IEntityView) typeDef);
	}
}
