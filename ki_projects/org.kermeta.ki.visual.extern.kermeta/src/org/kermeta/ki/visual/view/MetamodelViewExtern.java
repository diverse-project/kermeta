package org.kermeta.ki.visual.view;

import org.kermeta.ki.malai.kermetaMap.RuntimeObject2JavaMap;

import fr.irisa.triskell.kermeta.runtime.RuntimeObject;
import fr.irisa.triskell.kermeta.runtime.basetypes.Boolean;

public abstract class MetamodelViewExtern {
	public static RuntimeObject focusOnTypeDefinition(final RuntimeObject mmRO, final RuntimeObject typeDefRO) {
		final MetamodelView mm = (MetamodelView) mmRO.getUserData();
		final Object typeDef   = typeDefRO.getUserData();
		
		if(typeDef instanceof EntityView)
			mm.focusOnTypeDefinition((EntityView) typeDef);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	public static RuntimeObject isOperationsVisible(final RuntimeObject mmRO) {
		return ((MetamodelView)mmRO.getUserData()).isOperationsVisible() ? 
				mmRO.getFactory().getMemory().trueINSTANCE : mmRO.getFactory().getMemory().falseINSTANCE;
	}
	
	
	
	public static RuntimeObject isPropertiesVisible(final RuntimeObject mmRO) {
		return ((MetamodelView)mmRO.getUserData()).isPropertiesVisible() ? 
				mmRO.getFactory().getMemory().trueINSTANCE : mmRO.getFactory().getMemory().falseINSTANCE;
	}
	
	
	public static RuntimeObject setOperationsVisible(final RuntimeObject mmRO, final RuntimeObject visibleRO) {
		((MetamodelView) mmRO.getUserData()).setOperationsVisible(fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(visibleRO));
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject setPropertiesVisible(final RuntimeObject mmRO, final RuntimeObject visibleRO) {
		((MetamodelView) mmRO.getUserData()).setPropertiesVisible(fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(visibleRO));
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject refresh(final RuntimeObject mmRO) {
		((MetamodelView) mmRO.getUserData()).repaint();
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject updateArrows(final RuntimeObject mmRO) {
		((MetamodelView) mmRO.getUserData()).updateArrows();
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject onEntityRemoved(final RuntimeObject mmRO, final RuntimeObject entityRO) {
		final MetamodelView metamodelView 	= (MetamodelView) mmRO.getUserData();
		final EntityView view   			= (EntityView) entityRO.getUserData();
		
		metamodelView.removeEntity(view);
		RuntimeObject2JavaMap.MAP.remove(view);
		// We do not release the user data.
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject onEntityAdded(RuntimeObject mmRO, RuntimeObject entityRO, RuntimeObject isAspectRO, RuntimeObject positionRO, RuntimeObject nameRO) {
		final Object obj		  	= entityRO.getUserData();
		final String name		  	= fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(nameRO);
		final MetamodelView mmView 	= (MetamodelView) mmRO.getUserData();
		final int position 	  		= fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(positionRO);
		final boolean isAspect  	= fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(isAspectRO);
		final EntityView view 		= obj instanceof EntityView ? (EntityView)obj : mmView.addEntity(name, position, isAspect); 
		
		if(view!=null) {
			entityRO.setUserData(view);
			
			if(RuntimeObject2JavaMap.MAP.get(view)==null)
				RuntimeObject2JavaMap.MAP.put(view, entityRO);
		}
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject onRelationAdded(RuntimeObject mmRO, RuntimeObject linkRO, RuntimeObject compositionRO, RuntimeObject srcClassRO, 
											RuntimeObject tarClassRO, RuntimeObject srcNameRO, RuntimeObject srcCardRO, RuntimeObject tarNameRO,
											RuntimeObject tarCardRO, RuntimeObject positionRO, RuntimeObject compositionAtSourceRO) {
		MetamodelView mmView 	= (MetamodelView) mmRO.getUserData();
		int position		  	= fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(positionRO);
		EntityView srcClass    	= (EntityView) srcClassRO.getUserData();
		EntityView tarClass    	= (EntityView) tarClassRO.getUserData();
		String srcRole			= srcNameRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(srcNameRO);
		String targetRole		= tarNameRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(tarNameRO);
		String srcCard			= srcCardRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(srcCardRO);
		String targetCard		= tarCardRO==null ? null : fr.irisa.triskell.kermeta.runtime.basetypes.String.getValue(tarCardRO);
		boolean isComposition	= Boolean.getValue(compositionRO);
		boolean compoAtSrc		= fr.irisa.triskell.kermeta.runtime.basetypes.Boolean.getValue(compositionAtSourceRO);
		final LinkView view		= mmView.addRelation(srcClass, tarClass, isComposition, compoAtSrc, srcRole, targetRole, srcCard, targetCard, position);
		
		if(view!=null)
			linkRO.setUserData(view);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}

	
	
	public static RuntimeObject onLinkRemoved(final RuntimeObject mmRO, final RuntimeObject linkRO) {
		((MetamodelView) mmRO.getUserData()).removeLink((LinkView) linkRO.getUserData());
		linkRO.setUserData(null);
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject onInheritanceRemoved(final RuntimeObject mmRO, final RuntimeObject srcClassRO, final RuntimeObject tarClassRO) {
		((MetamodelView)mmRO.getUserData()).removeInheritanceView((EntityView)srcClassRO.getUserData(), (EntityView)tarClassRO.getUserData());
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	
	public static RuntimeObject onInheritanceAdded(final RuntimeObject mmRO, final RuntimeObject srcClassRO, 
									final RuntimeObject tarClassRO, final RuntimeObject positionRO) {
		((MetamodelView)mmRO.getUserData()).addInheritanceView((EntityView)srcClassRO.getUserData(), 
								(EntityView) tarClassRO.getUserData(), fr.irisa.triskell.kermeta.runtime.basetypes.Integer.getValue(positionRO));
		
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
	
	
	
	public static RuntimeObject update(final RuntimeObject mmRO) {
		((MetamodelView) mmRO.getUserData()).update();
		return mmRO.getFactory().getMemory().voidINSTANCE;
	}
}
