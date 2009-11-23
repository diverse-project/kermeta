

/*$Id: Initializor.java,v 1.2 2008-06-03 07:43:58 ftanguy Exp $
* Project : fr.irisa.triskell.kermeta.kpm
* File : 	Initializor.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 20 mai 08
* Authors : paco
*/

package org.kermeta.kpm.internal.builder;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;

import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.FilterExpression;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.NameFilter;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Rule;

public class Initializor extends UnitCreator implements IResourceVisitor {

	/**
	 * 
	 * @param kpm
	 */
	public Initializor(KPM kpm, boolean initKpm) {
		super(kpm);
		if ( initKpm )
			addInitialValues();
	}
	
	/**
	 * 
	 */
	private void addInitialValues() {
		/*
		 * 
		 * Adding events.
		 * 
		 */
		Event updateEvent = KpmFactory.eINSTANCE.createEvent();
		updateEvent.setName("update");
		_kpm.getEvents().add(updateEvent);
		
		/*
		 * 
		 * Adding filters.
		 * 
		 */
		NameFilter kmtFilter = KpmFactory.eINSTANCE.createNameFilter();
		kmtFilter.setRegex("*.kmt");
		_kpm.getFilters().add(kmtFilter);
		
		NameFilter kmKilter = KpmFactory.eINSTANCE.createNameFilter();
		kmKilter.setRegex("*.km");
		_kpm.getFilters().add(kmKilter);
		
		NameFilter ecoreFilter = KpmFactory.eINSTANCE.createNameFilter();
		ecoreFilter.setRegex("*.ecore");
		_kpm.getFilters().add(ecoreFilter);
		
		/*
		 * 
		 * Adding rules.
		 * 
		 */
		FilterExpression inExpression = KpmFactory.eINSTANCE.createFilterExpression();
		inExpression.setFilter(kmtFilter);
				
		Out unloadContext = KpmFactory.eINSTANCE.createOut();
		unloadContext.setExtensionPoint("org.kermeta.kpm.actions.unloadcontext");
		unloadContext.setIndependant(false);
		
		Out loadContext = KpmFactory.eINSTANCE.createOut();
		loadContext.setExtensionPoint("org.kermeta.kpm.actions.loadcontext");
		loadContext.setIndependant(false);
		
		Out typecheck = KpmFactory.eINSTANCE.createOut();
		typecheck.setExtensionPoint("org.kermeta.kpm.actions.typecheckcontext");
		typecheck.setIndependant(false);

		Out removeDependencies = KpmFactory.eINSTANCE.createOut();
		removeDependencies.setExtensionPoint("org.kermeta.kpm.actions.removedependencies");
		removeDependencies.setIndependant(false);		
		
		Out addDependencies = KpmFactory.eINSTANCE.createOut();
		addDependencies.setExtensionPoint("org.kermeta.kpm.actions.createdependencies");
		addDependencies.setIndependant(false);
		
		Out addMarkers = KpmFactory.eINSTANCE.createOut();
		addMarkers.setExtensionPoint("org.kermeta.kpm.actions.addmarkers");
		addMarkers.setIndependant(false);
				
		Out finalize = KpmFactory.eINSTANCE.createOut();
		finalize.setExtensionPoint("org.kermeta.kpm.actions.finalizeUpdate");
		finalize.setIndependant(false);
				
		Rule updateKMT = KpmFactory.eINSTANCE.createRule();
		updateKMT.setEvent( updateEvent );
		updateKMT.setPrecondition(inExpression);
		updateKMT.setName( KPMRules.UPDATE_KMT_RULE_ID );
		updateKMT.getOuts().add(unloadContext);
		updateKMT.getOuts().add(loadContext);
		updateKMT.getOuts().add(typecheck);
		updateKMT.getOuts().add(removeDependencies);
		updateKMT.getOuts().add(addDependencies);
		updateKMT.getOuts().add(addMarkers);
		updateKMT.getOuts().add(finalize);
		_kpm.getRules().add(updateKMT);
		KPMRules.UPDATE_KMT_RULE = updateKMT;
		
	}
	
	public boolean visit(IResource resource) throws CoreException {
		switch( resource.getType() ) {
		
		case IResource.PROJECT :
			conditionalGetOrCreateUnit(resource, false);
			break;
			
		case IResource.FOLDER :
			conditionalGetOrCreateUnit(resource, false);
			break;
			
		case IResource.FILE :
			conditionalGetOrCreateUnit(resource, false);
			break;
		
		}
		return true;
	}

}


