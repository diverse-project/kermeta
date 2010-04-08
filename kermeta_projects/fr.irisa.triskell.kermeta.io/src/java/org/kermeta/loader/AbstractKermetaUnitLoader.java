

/*$Id: AbstractKermetaUnitLoader.java,v 1.14 2008-04-28 11:50:17 ftanguy Exp $
* Project : io
* File : 	KermetaUnitLoader.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 6 juin 07
* Authors : paco
*/

package org.kermeta.loader;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.kermeta.io.KermetaUnit;
import org.kermeta.io.KermetaUnitLoader;
import org.kermeta.model.KermetaModelHelper;

import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.AbstractBuildingState;
import fr.irisa.triskell.kermeta.loader.kmt.kmt2km.KMSymbol;
import fr.irisa.triskell.kermeta.modelhelper.KermetaUnitHelper;


public class AbstractKermetaUnitLoader implements KermetaUnitLoader {

	protected Map<String, Object> options = null;
	
	protected IProgressMonitor monitor;
	
	protected AbstractKermetaUnitLoader(Map<String, Object> options, IProgressMonitor monitor) {
		this.monitor = monitor;
		this.options = options;
	}
	
/*	public void constructAspectsListsForAll(KermetaUnit kermetaUnit) {
		
		AbstractBuildingState state = (AbstractBuildingState) kermetaUnit.getBuildingState();
		
		if ( state.aspectsDone ) return;
		state.loading = true;
		
		constructAspectsLists(kermetaUnit);
		state.aspectsDone = true;
*/		
		/*
		 * 
		 * Loading the structure for the imported units.
		 * 
		 */
/*		Iterator <KermetaUnit> iterator = kermetaUnit.getImportedKermetaUnits().iterator();
		while ( iterator.hasNext() ) {
			KermetaUnit currentUnit = iterator.next();
			
			AbstractBuildingState currentState = (AbstractBuildingState) currentUnit.getBuildingState();
			if ( ! currentState.loading )
				constructAspectsListsForAll( currentUnit );
		}
	
		state.loading = false;
		
	}
	
	public void constructAspectsLists(KermetaUnit kermetaUnit) {	
		for ( TypeDefinition t : KermetaUnitHelper.getInternalTypeDefinitions(kermetaUnit) ) {
			if ( t.isIsAspect() ) {
				String qualifiedName = KermetaModelHelper.NamedElement.qualifiedName(t);
				for ( KermetaUnit importedUnit : KermetaUnitHelper.getAllImportedKermetaUnits(kermetaUnit) ) {
					for ( TypeDefinition tdef : KermetaUnitHelper.getInternalTypeDefinitions(importedUnit) ) {
						if ( ! tdef.isIsAspect() ) {
							String s = KermetaModelHelper.NamedElement.qualifiedName(tdef);
							if ( qualifiedName.equals(s) ) {
								EList<TypeDefinition> l = importedUnit.getAspects().get(tdef);
								if ( l == null ) {
									l = new UniqueEList<TypeDefinition>();
									importedUnit.getAspects().put(tdef, l);
								}
								l.add( t );
								l = kermetaUnit.getBaseAspects().get(t);
								if ( l == null ) {
									l = new UniqueEList<TypeDefinition>();
									kermetaUnit.getBaseAspects().put(t, l);
								}
								l.add( tdef );
							}
						}
					}
				}
			}
			
	*/		
		/*	EList<TypeDefinition> l = KermetaUnitHelper.getAspects(kermetaUnit, t);
			if ( ! l.isEmpty() )
				kermetaUnit.getAspects().put( t, l);*/
/*		}
	}
	
	*/
	
	protected Hashtable <KermetaUnit, LoadingContext> context = new Hashtable <KermetaUnit, LoadingContext> ();
	
	public LoadingContext getLoadingContext(KermetaUnit kermetaUnit) {
		LoadingContext result = context.get( kermetaUnit );
		if ( result == null ) {
			result = new LoadingContext();
			context.put(kermetaUnit, result);
		}
		return result;
	}
	
	public TypeVariable typeVariableLookup(KermetaUnit unit, String name) {
		if ( context.get(unit) == null )
			context.put(unit, new LoadingContext() );
		return context.get(unit).typeVariableLookup(name);
	}
	
	public KMSymbol symbolLookup(KermetaUnit unit, String symbol) {
		if ( context.get(unit) == null )
			context.put(unit, new LoadingContext() );
		return context.get(unit).symbolLookup(symbol);
	}
	
	public void addTypeVar(KermetaUnit unit, TypeVariable var){
		if ( context.get(unit) == null )
			context.put(unit, new LoadingContext() );
		context.get(unit).addTypeVar(var);
	}
	
	public void addSymbol(KermetaUnit unit, KMSymbol s) {
		if ( context.get(unit) == null )
			context.put(unit, new LoadingContext() );
		context.get(unit).addSymbol(s);
	}
	
	public void popContext(KermetaUnit unit) {
		if ( context.get(unit) == null )
			context.put(unit, new LoadingContext() );
		context.get(unit).popContext();
	}
	
	public void pushContext(KermetaUnit unit) {
		if ( context.get(unit) == null )
			context.put(unit, new LoadingContext() );
		context.get(unit).pushContext();
	}
	
	
	
	public EList<KermetaUnit> getKermetaUnits() {
		return null;
	}

	public KermetaUnit load(String uri) {return null;}

	public TreeIterator<EObject> eAllContents() {
		return null;
	}

	public EClass eClass() {
		return null;
	}

	public EObject eContainer() {
		return null;
	}

	public EStructuralFeature eContainingFeature() {
		return null;
	}

	public EReference eContainmentFeature() {
		return null;
	}

	public EList<EObject> eContents() {
		return null;
	}

	public EList<EObject> eCrossReferences() {
		return null;
	}

	public Object eGet(EStructuralFeature arg0) {
		return null;
	}

	public Object eGet(EStructuralFeature arg0, boolean arg1) {
		return null;
	}

	public boolean eIsProxy() {
		return false;
	}

	public boolean eIsSet(EStructuralFeature arg0) {
		return false;
	}

	public Resource eResource() {
		return null;
	}

	public void eSet(EStructuralFeature arg0, Object arg1) {}

	public void eUnset(EStructuralFeature arg0) {}

	public EList<Adapter> eAdapters() {
		return null;
	}

	public boolean eDeliver() {
		return false;
	}

	public void eNotify(Notification arg0) {}

	public void eSetDeliver(boolean arg0) {}

}


