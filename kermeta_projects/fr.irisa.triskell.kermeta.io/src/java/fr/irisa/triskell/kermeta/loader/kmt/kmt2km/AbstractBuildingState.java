

/*$Id: AbstractBuildingState.java,v 1.4 2008-04-28 11:50:13 ftanguy Exp $
* Project : io
* File : 	AbstractBuildingState.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 6 juin 07
* Authors : paco
*/

package fr.irisa.triskell.kermeta.loader.kmt.kmt2km;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.kermeta.io.IBuildingState;
import org.kermeta.kermetaunitloader.AbstractLoader;


public class AbstractBuildingState implements IBuildingState {
	
	public boolean loaded = false;
	
	public boolean loading = false;
	
	public boolean aspectsDone = false;
	

	/** used to know if all the require of this unit have been resolved (doesn't take into account indirect require */
	public boolean allRequiresResolved = false;

	public boolean allRequiredUnitImported = false;
	public boolean allRequireErrorPropagated = false;
	public boolean allAspectBuilt = false;
	public boolean allTypeSet = false;
	
	/** activate the cache for KermetaUnitHelper.getAllImportedKermetaUnits() */
	public boolean allImportedUnitCacheActivated = false;
	
	/**
	 * loader used for creating this unit
	 * This is used when restarting an unfinished load (typically during cyclic dependencies)
	 * Once the unit is loaded, this loader can be discarded
	 */
	public AbstractLoader kermetaUnitLoader= null;
	
	public TreeIterator eAllContents() {
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

	public EList eContents() {
		return null;
	}

	public EList eCrossReferences() {
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

	public EList eAdapters() {
		return null;
	}

	public boolean eDeliver() {
		return false;
	}

	public void eNotify(Notification arg0) {}

	public void eSetDeliver(boolean arg0) {}

}


