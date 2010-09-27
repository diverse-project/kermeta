package org.kermeta.ki.kompren.view;

import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;
import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;

public abstract class ClassDiagramViewExtern {
	public static RuntimeObject isOperationsVisible(final RuntimeObject mmRO) {
		return ((ClassDiagramView)Source2TargetMap.MAP.getTargetObject(mmRO)).isOperationsVisible() ? 
				mmRO.getFactory().getMemory().trueINSTANCE : mmRO.getFactory().getMemory().falseINSTANCE;
	}
	
	
	
	public static RuntimeObject isPropertiesVisible(final RuntimeObject mmRO) {
		return ((ClassDiagramView)Source2TargetMap.MAP.getTargetObject(mmRO)).isPropertiesVisible() ? 
				mmRO.getFactory().getMemory().trueINSTANCE : mmRO.getFactory().getMemory().falseINSTANCE;
	}
	
	
	
	public static RuntimeObject setOperationsVisible(final RuntimeObject mmRO, final RuntimeObject visibleRO) {
		((ClassDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO)).setOperationsVisible(
									fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(visibleRO));
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject setPropertiesVisible(final RuntimeObject mmRO, final RuntimeObject visibleRO) {
		((ClassDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO)).setPropertiesVisible(
									fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(visibleRO));
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject onEntityAdded(RuntimeObject mmRO, RuntimeObject entityRO, RuntimeObject isAspectRO, RuntimeObject positionRO, RuntimeObject nameRO) {
		final Object obj		  	= Source2TargetMap.MAP.getTargetObject(entityRO);
		final String name		  	= fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(nameRO);
		final ClassDiagramView mmView 	= (ClassDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO);
		final int position 	  		= fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(positionRO);
		final boolean isAspect  	= fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(isAspectRO);
		final IEntityView view 		= obj instanceof IEntityView ? (IEntityView)obj : mmView.addEntity(name, position, isAspect); 
		
		Source2TargetMap.MAP.add(entityRO, view);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject onRelationAdded(RuntimeObject mmRO, RuntimeObject linkRO, RuntimeObject compositionRO, RuntimeObject srcClassRO, 
											RuntimeObject tarClassRO, RuntimeObject srcNameRO, RuntimeObject srcCardRO, RuntimeObject tarNameRO,
											RuntimeObject tarCardRO, RuntimeObject positionRO, RuntimeObject compositionAtSourceRO) {
		ClassDiagramView mmView = (ClassDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO);
		int position		  	= fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(positionRO);
		IEntityView srcClass    = (IEntityView) Source2TargetMap.MAP.getTargetObject(srcClassRO);
		IEntityView tarClass    = (IEntityView) Source2TargetMap.MAP.getTargetObject(tarClassRO);
		String srcRole			= srcNameRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(srcNameRO);
		String targetRole		= tarNameRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(tarNameRO);
		String srcCard			= srcCardRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(srcCardRO);
		String targetCard		= tarCardRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(tarCardRO);
		boolean isComposition	= Boolean.getValue(compositionRO);
		boolean compoAtSrc		= fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(compositionAtSourceRO);
		final IRelationView view= mmView.addRelation(srcClass, tarClass, isComposition, compoAtSrc, srcRole, targetRole, srcCard, targetCard, position);
		
		if(view!=null)
			Source2TargetMap.MAP.add(linkRO, view);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}

	
	
	public static RuntimeObject onInheritanceRemoved(final RuntimeObject mmRO, final RuntimeObject srcClassRO, final RuntimeObject tarClassRO) {
		((ClassDiagramView)Source2TargetMap.MAP.getTargetObject(mmRO)).removeInheritanceView(
								(IEntityView)Source2TargetMap.MAP.getTargetObject(srcClassRO), 
								(IEntityView)Source2TargetMap.MAP.getTargetObject(tarClassRO));
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject onInheritanceAdded(final RuntimeObject mmRO, final RuntimeObject srcClassRO, 
									final RuntimeObject tarClassRO, final RuntimeObject positionRO) {
		((ClassDiagramView)Source2TargetMap.MAP.getTargetObject(mmRO)).addInheritanceView(
								(IEntityView)Source2TargetMap.MAP.getTargetObject(srcClassRO),
								(IEntityView)Source2TargetMap.MAP.getTargetObject(tarClassRO), 
								fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(positionRO));
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}

}
