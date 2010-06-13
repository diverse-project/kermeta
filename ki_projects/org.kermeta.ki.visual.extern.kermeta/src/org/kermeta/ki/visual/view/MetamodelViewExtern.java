package org.kermeta.ki.visual.view;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;

public abstract class MetamodelViewExtern {
	public static RuntimeObject focusOnTypeDefinition(final RuntimeObject mmRO, final RuntimeObject typeDefRO) {
		final MetamodelView mm = (MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO);
		final Object typeDef   = Source2TargetMap.MAP.getTargetObject(typeDefRO);
		
		if(typeDef instanceof EntityView)
			mm.focusOnTypeDefinition((EntityView) typeDef);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	public static RuntimeObject isOperationsVisible(final RuntimeObject mmRO) {
		return ((MetamodelView)Source2TargetMap.MAP.getTargetObject(mmRO)).isOperationsVisible() ? 
				mmRO.getFactory().getMemory().trueINSTANCE : mmRO.getFactory().getMemory().falseINSTANCE;
	}
	
	
	
	public static RuntimeObject isPropertiesVisible(final RuntimeObject mmRO) {
		return ((MetamodelView)Source2TargetMap.MAP.getTargetObject(mmRO)).isPropertiesVisible() ? 
				mmRO.getFactory().getMemory().trueINSTANCE : mmRO.getFactory().getMemory().falseINSTANCE;
	}
	
	
	public static RuntimeObject setOperationsVisible(final RuntimeObject mmRO, final RuntimeObject visibleRO) {
		((MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO)).setOperationsVisible(
									fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(visibleRO));
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject setPropertiesVisible(final RuntimeObject mmRO, final RuntimeObject visibleRO) {
		((MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO)).setPropertiesVisible(
									fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(visibleRO));
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject refresh(final RuntimeObject mmRO) {
		((MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO)).repaint();
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject updateArrows(final RuntimeObject mmRO) {
		((MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO)).updateArrows();
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject onEntityRemoved(final RuntimeObject mmRO, final RuntimeObject entityRO) {
		final MetamodelView metamodelView 	= (MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO);
		final EntityView view   			= (EntityView) Source2TargetMap.MAP.getTargetObject(entityRO);
		
		metamodelView.removeEntity(view);
		
		Source2TargetMap.MAP.removeSourceObject(entityRO);
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject onEntityAdded(RuntimeObject mmRO, RuntimeObject entityRO, RuntimeObject isAspectRO, RuntimeObject positionRO, RuntimeObject nameRO) {
		final Object obj		  	= Source2TargetMap.MAP.getTargetObject(entityRO);
		final String name		  	= fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(nameRO);
		final MetamodelView mmView 	= (MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO);
		final int position 	  		= fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(positionRO);
		final boolean isAspect  	= fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(isAspectRO);
		final EntityView view 		= obj instanceof EntityView ? (EntityView)obj : mmView.addEntity(name, position, isAspect); 
		
		Source2TargetMap.MAP.add(entityRO, view);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject organise(final RuntimeObject mmRO) {
		((MetamodelView)Source2TargetMap.MAP.getTargetObject(mmRO)).updateLayout();
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject onRelationAdded(RuntimeObject mmRO, RuntimeObject linkRO, RuntimeObject compositionRO, RuntimeObject srcClassRO, 
											RuntimeObject tarClassRO, RuntimeObject srcNameRO, RuntimeObject srcCardRO, RuntimeObject tarNameRO,
											RuntimeObject tarCardRO, RuntimeObject positionRO, RuntimeObject compositionAtSourceRO) {
		MetamodelView mmView 	= (MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO);
		int position		  	= fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(positionRO);
		EntityView srcClass    	= (EntityView) Source2TargetMap.MAP.getTargetObject(srcClassRO);
		EntityView tarClass    	= (EntityView) Source2TargetMap.MAP.getTargetObject(tarClassRO);
		String srcRole			= srcNameRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(srcNameRO);
		String targetRole		= tarNameRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(tarNameRO);
		String srcCard			= srcCardRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(srcCardRO);
		String targetCard		= tarCardRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(tarCardRO);
		boolean isComposition	= Boolean.getValue(compositionRO);
		boolean compoAtSrc		= fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(compositionAtSourceRO);
		final LinkView view		= mmView.addRelation(srcClass, tarClass, isComposition, compoAtSrc, srcRole, targetRole, srcCard, targetCard, position);
		
		if(view!=null)
			Source2TargetMap.MAP.add(linkRO, view);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}

	
	
	public static RuntimeObject onLinkRemoved(final RuntimeObject mmRO, final RuntimeObject linkRO) {
		((MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO)).removeLink((LinkView)Source2TargetMap.MAP.getTargetObject(linkRO));
		Source2TargetMap.MAP.removeSourceObject(linkRO);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject onInheritanceRemoved(final RuntimeObject mmRO, final RuntimeObject srcClassRO, final RuntimeObject tarClassRO) {
		((MetamodelView)Source2TargetMap.MAP.getTargetObject(mmRO)).removeInheritanceView(
								(EntityView)Source2TargetMap.MAP.getTargetObject(srcClassRO), 
								(EntityView)Source2TargetMap.MAP.getTargetObject(tarClassRO));
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject onInheritanceAdded(final RuntimeObject mmRO, final RuntimeObject srcClassRO, 
									final RuntimeObject tarClassRO, final RuntimeObject positionRO) {
		((MetamodelView)Source2TargetMap.MAP.getTargetObject(mmRO)).addInheritanceView(
								(EntityView)Source2TargetMap.MAP.getTargetObject(srcClassRO),
								(EntityView)Source2TargetMap.MAP.getTargetObject(tarClassRO), 
								fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(positionRO));
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject update(final RuntimeObject mmRO) {
		((MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO)).update();
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
}
