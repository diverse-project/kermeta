package org.kermeta.ki.visual.view;

import org.kermeta.ki.malai.kermetaMap.Source2TargetMap;

public abstract class MetamodelViewExtern {
	public static void focusOnTypeDefinition(final Object mmRO, final Object typeDefRO) {
		final MetamodelView mm = (MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO);
		final Object typeDef   = Source2TargetMap.MAP.getTargetObject(typeDefRO);
		
		if(typeDef instanceof EntityView)
			mm.focusOnTypeDefinition((EntityView) typeDef);
	}
	
	
	public static boolean isOperationsVisible(final Object mmRO) {
		return ((MetamodelView)Source2TargetMap.MAP.getTargetObject(mmRO)).isOperationsVisible();
	}
	
	
	
	public static boolean isPropertiesVisible(final Object mmRO) {
		return ((MetamodelView)Source2TargetMap.MAP.getTargetObject(mmRO)).isPropertiesVisible();
	}
	
	
	public static void setOperationsVisible(final Object mmRO, final boolean visible) {
		((MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO)).setOperationsVisible(visible);
	}
	
	
	
	public static void setPropertiesVisible(final Object mmRO, final boolean visible) {
		((MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO)).setPropertiesVisible(visible);
	}
	
	
	
	public static void refresh(final Object mmRO) {
		((MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO)).repaint();
	}
	
	
	
	public static void updateArrows(final Object mmRO) {
		((MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO)).updateArrows();
	}
	
	
	
	public static void onEntityRemoved(final Object mmRO, final Object entityRO) {
		final MetamodelView metamodelView 	= (MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO);
		final EntityView view   			= (EntityView) Source2TargetMap.MAP.getTargetObject(entityRO);
		
		metamodelView.removeEntity(view);
		Source2TargetMap.MAP.removeSourceObject(entityRO);
	}
	
	
	
	public static void organise(final Object mmRO) {
		((MetamodelView)Source2TargetMap.MAP.getTargetObject(mmRO)).updateLayout();
	}
	
	
	
	public static void onEntityAdded(Object mmRO, Object entityRO, boolean isAspect, int position, String name) {
		final Object obj		  	= Source2TargetMap.MAP.getTargetObject(entityRO);
		final MetamodelView mmView 	= (MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO);
		final EntityView view 		= obj instanceof EntityView ? (EntityView)obj : mmView.addEntity(name, position, isAspect); 
		
		if(view!=null && Source2TargetMap.MAP.getTargetObject(view)==null)
			Source2TargetMap.MAP.add(entityRO, view);
	}
	
	
	
	
	public static void onRelationAdded(Object mmRO, Object linkRO, boolean composition, Object srcClassRO, 
										Object tarClassRO, String srcRole, String srcCard, String tarRole,
										String tarCard, int position, boolean compositionAtSrc) {
		MetamodelView mmView 	= (MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO);
		EntityView srcClass    	= (EntityView) Source2TargetMap.MAP.getTargetObject(srcClassRO);
		EntityView tarClass    	= (EntityView) Source2TargetMap.MAP.getTargetObject(tarClassRO);
		final LinkView view		= mmView.addRelation(srcClass, tarClass, composition, compositionAtSrc, srcRole, tarRole, srcCard, tarCard, position);
		
		if(view!=null)
			Source2TargetMap.MAP.add(linkRO, view);
	}

	
	
	public static void onLinkRemoved(final Object mmRO, final Object linkRO) {
		((MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO)).removeLink((LinkView)Source2TargetMap.MAP.getTargetObject(linkRO));
		Source2TargetMap.MAP.removeSourceObject(linkRO);
	}
	
	
	
	public static void onInheritanceRemoved(final Object mmRO, final Object srcClassRO, final Object tarClassRO) {
		((MetamodelView)Source2TargetMap.MAP.getTargetObject(mmRO)).removeInheritanceView(
								(EntityView)Source2TargetMap.MAP.getTargetObject(srcClassRO), 
								(EntityView)Source2TargetMap.MAP.getTargetObject(tarClassRO));
	}
	
	
	
	
	public static void onInheritanceAdded(final Object mmRO, final Object srcClassRO, 
									final Object tarClassRO, final int position) {
		((MetamodelView)Source2TargetMap.MAP.getTargetObject(mmRO)).addInheritanceView(
								(EntityView)Source2TargetMap.MAP.getTargetObject(srcClassRO),
								(EntityView)Source2TargetMap.MAP.getTargetObject(tarClassRO), position);
	}
	
	
	
	public static void update(final Object mmRO) {
		((MetamodelView) Source2TargetMap.MAP.getTargetObject(mmRO)).update();
	}
}
