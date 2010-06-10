package org.kermeta.ki.visual.view;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Real;

public abstract class EntityViewExtern {
	public static RuntimeObject onAttributeAdded(final RuntimeObject entityRO, final RuntimeObject propertyRO, 
												final RuntimeObject nameRO, final RuntimeObject typeNameRO) {
		final EntityView view 	= (EntityView) Source2TargetMap.MAP.getTargetObject(entityRO);
		final String name		= fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(nameRO);
		final String typeName	= fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(typeNameRO);
		
		Source2TargetMap.MAP.add(propertyRO, view.addAttribute(name, typeName));
		
		return entityRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject onAttributeRemoved(final RuntimeObject entityRO, final RuntimeObject propertyRO) {
		((EntityView)Source2TargetMap.MAP.getTargetObject(entityRO)).removeAttribute((AttributeView)Source2TargetMap.MAP.getTargetObject(propertyRO));
		Source2TargetMap.MAP.removeSourceObject(propertyRO);
		
		return entityRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject onOperationAdded(final RuntimeObject entityRO, final RuntimeObject opRO, 
												final RuntimeObject nameRO, final RuntimeObject typeNameRO, final RuntimeObject abstractRO) {
		final EntityView view  	= (EntityView) Source2TargetMap.MAP.getTargetObject(entityRO);
		final String name		= fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(nameRO);
		final String typeName	= fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(typeNameRO);
		final Boolean isAbs	 	= fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(abstractRO);
		
		Source2TargetMap.MAP.add(opRO, view.addOperation(name, typeName, isAbs));
		
		return entityRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject onOperationRemoved(final RuntimeObject entityRO, final RuntimeObject opRO) {
		((EntityView)Source2TargetMap.MAP.getTargetObject(entityRO)).removeOperation((OperationView)Source2TargetMap.MAP.getTargetObject(opRO));
		Source2TargetMap.MAP.removeSourceObject(opRO);
		
		return entityRO.getFactory().getMemory().voidINSTANCE; 
	}
	
	
	
	public static RuntimeObject contains(final RuntimeObject entityRO, final RuntimeObject xRO, final RuntimeObject yRO) {
		final boolean contains = ((EntityView)Source2TargetMap.MAP.getTargetObject(entityRO)).contains(Real.getValue(xRO), Real.getValue(yRO));
		return contains ? entityRO.getFactory().getMemory().trueINSTANCE : entityRO.getFactory().getMemory().falseINSTANCE; 
	}
	
	
	
	public static RuntimeObject unprune(final RuntimeObject entityRO) {
		((EntityView)Source2TargetMap.MAP.getTargetObject(entityRO)).unprune();
		return entityRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject update(final RuntimeObject entityRO, final RuntimeObject newNameRO, final RuntimeObject abstractRO) {
		final EntityView view 	= (EntityView) Source2TargetMap.MAP.getTargetObject(entityRO);
		final String newName  	= fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(newNameRO);
		final Boolean isAbstract= fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(abstractRO);
		
		view.update(newName, isAbstract);
		
		return entityRO.getFactory().getMemory().voidINSTANCE;
	}
}
