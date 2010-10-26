package org.kermeta.ki.kompren.view;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class ClassViewExtern {
	public static void onAttributeAdded(final Object entityRO, final Object propertyRO, final String name, final String typeName) {
		final ClassView view 	= (ClassView) Source2TargetMap.MAP.getTargetObject(entityRO);
		
		Source2TargetMap.MAP.add(propertyRO, view.addAttribute(name, typeName));
	}
	
	
	
	public static void onAttributeRemoved(final Object entityRO, final Object propertyRO) {
		((ClassView)Source2TargetMap.MAP.getTargetObject(entityRO)).removeAttribute((AttributeView)Source2TargetMap.MAP.getTargetObject(propertyRO));
		Source2TargetMap.MAP.removeSourceObject(propertyRO);
	}
	
	
	
	public static void onOperationAdded(final Object entityRO, final Object opRO, final String name, final String typeName, final boolean isAbstract) {
		final ClassView view = (ClassView) Source2TargetMap.MAP.getTargetObject(entityRO);
		Source2TargetMap.MAP.add(opRO, view.addOperation(name, typeName, isAbstract));
	}
	
	
	
	public static void onOperationRemoved(final Object entityRO, final Object opRO) {
		((ClassView)Source2TargetMap.MAP.getTargetObject(entityRO)).removeOperation((OperationView)Source2TargetMap.MAP.getTargetObject(opRO));
		Source2TargetMap.MAP.removeSourceObject(opRO);
	}
	
	
	
	public static void update(final Object entityRO, final String newName, final boolean isAbstract) {
		final ClassView view 	= (ClassView) Source2TargetMap.MAP.getTargetObject(entityRO);
		view.setName(newName);
		view.setIsAbstract(isAbstract);
		view.update();
	}
}
