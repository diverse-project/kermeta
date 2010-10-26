package org.kermeta.ki.kompren.view;

import org.kermeta.ki.diagram.view.interfaces.IEntityView;
import org.kermeta.ki.diagram.view.interfaces.IRelationView;
import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class ClassDiagramViewExtern {
	public static boolean isOperationsVisible(final Object mmRO) {
		return ((ClassDiagramView)Source2TargetMap.MAP.getTargetObject(mmRO)).isOperationsVisible();
	}
	
	
	
	public static boolean isPropertiesVisible(final Object mmRO) {
		return ((ClassDiagramView)Source2TargetMap.MAP.getTargetObject(mmRO)).isPropertiesVisible();
	}
	
	
	
	public static void setOperationsVisible(final Object mmRO, final boolean visible) {
		((ClassDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO)).setOperationsVisible(visible);
	}
	
	
	
	public static void setPropertiesVisible(final Object mmRO, final boolean visible) {
		((ClassDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO)).setPropertiesVisible(visible);
	}
	
	
	
	public static void onEntityAdded(Object mmRO, Object entityRO, boolean isAspect, int position, String name) {
		final Object obj		  	= Source2TargetMap.MAP.getTargetObject(entityRO);
		final ClassDiagramView mmView 	= (ClassDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO);
		final IEntityView view 		= obj instanceof IEntityView ? (IEntityView)obj : mmView.addEntity(name, position, isAspect); 
		
		Source2TargetMap.MAP.add(entityRO, view);
	}
	
	
	
	public static void onRelationAdded(Object mmRO, Object linkRO, boolean composition, Object srcClassRO, 
										Object tarClassRO, String srcRole, String srcCard, String tarRole,
										String tarCard, int position, boolean compositionAtSrc) {
		ClassDiagramView mmView = (ClassDiagramView) Source2TargetMap.MAP.getTargetObject(mmRO);
		IEntityView srcClass    = (IEntityView) Source2TargetMap.MAP.getTargetObject(srcClassRO);
		IEntityView tarClass    = (IEntityView) Source2TargetMap.MAP.getTargetObject(tarClassRO);
		final IRelationView view= mmView.addRelation(srcClass, tarClass, composition, compositionAtSrc, srcRole, tarRole, srcCard, tarCard, position);
		
		if(view!=null)
			Source2TargetMap.MAP.add(linkRO, view);
	}

	
	
	public static void onInheritanceRemoved(final Object mmRO, final Object srcClassRO, final Object tarClassRO) {
		((ClassDiagramView)Source2TargetMap.MAP.getTargetObject(mmRO)).removeInheritanceView(
								(IEntityView)Source2TargetMap.MAP.getTargetObject(srcClassRO), 
								(IEntityView)Source2TargetMap.MAP.getTargetObject(tarClassRO));
	}
	
	
	
	
	public static void onInheritanceAdded(final Object mmRO, final Object srcClassRO, final Object tarClassRO, final int position) {
		((ClassDiagramView)Source2TargetMap.MAP.getTargetObject(mmRO)).addInheritanceView(
								(IEntityView)Source2TargetMap.MAP.getTargetObject(srcClassRO),
								(IEntityView)Source2TargetMap.MAP.getTargetObject(tarClassRO), position);
	}
}
