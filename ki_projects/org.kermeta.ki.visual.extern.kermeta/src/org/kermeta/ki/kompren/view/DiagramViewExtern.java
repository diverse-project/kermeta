package org.kermeta.ki.kompren.view;

import org.kermeta.ki.diagram.view.interfaces.IDiagramView;
import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;
import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;

public abstract class DiagramViewExtern {
	public static RuntimeObject update(final RuntimeObject mmRO) {
		((IDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO)).update();
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	public static RuntimeObject onRelationRemoved(final RuntimeObject mmRO, final RuntimeObject linkRO) {
		((IDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO)).removeRelation((IRelationView)Source2TargetMap.MAP.getTargetObject(linkRO));
		Source2TargetMap.MAP.removeSourceObject(linkRO);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	public static RuntimeObject organise(final RuntimeObject mmRO) {
		((IDiagramView)Source2TargetMap.MAP.getTargetObject(mmRO)).updateLayout();
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject onEntityRemoved(final RuntimeObject mmRO, final RuntimeObject entityRO) {
		final IDiagramView diagramView 	= (IDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO);
		final IEntityView view   		= (IEntityView) Source2TargetMap.MAP.getTargetObject(entityRO);
		
		diagramView.removeEntity(view);
		
		Source2TargetMap.MAP.removeSourceObject(entityRO);
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}

	
	public static RuntimeObject refresh(final RuntimeObject mmRO) {
		((IDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO)).refresh();
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject updateRelations(final RuntimeObject mmRO) {
		((IDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO)).updateRelations();
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	public static RuntimeObject focusOnEntity(final RuntimeObject mmRO, final RuntimeObject typeDefRO) {
		final IDiagramView mm = (IDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO);
		final Object typeDef   = Source2TargetMap.MAP.getTargetObject(typeDefRO);
		
		if(typeDef instanceof IEntityView)
			mm.focusOnEntity((IEntityView) typeDef);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
}
