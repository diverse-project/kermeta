/*******************************************************************************
 * $Id: AssignmentModelerProvider.java,v 1.1 2007-02-06 17:45:46 cfaucher Exp $
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 ******************************************************************************/
package fr.irisa.triskell.kermeta.graphicaleditor.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EAttribute;
import org.topcased.modeler.providers.ILabelFeatureProvider;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;

/**
 * This is the item provider adpater for a {@link fr.irisa.triskell.kermeta.language.behavior.Assignment} object.
 *
 * @generated
 */
public class AssignmentModelerProvider extends ExpressionModelerProvider
		implements ILabelFeatureProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 *
	 * @param adapterFactory the adapter factory
	 * @generated
	 */
	public AssignmentModelerProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @see org.topcased.modeler.providers.ILabelFeatureProvider#getLabelFeature(java.lang.Object)
	 * @generated
	 */
	public EAttribute getLabelFeature(Object object) {
		return BehaviorPackage.eINSTANCE.getAssignment_IsCast();
	}
}