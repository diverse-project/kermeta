/**
 * <copyright>
 * </copyright>
 *
 * $Id: FsmResourceFactoryImpl.java,v 1.2 2007-07-11 15:15:58 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.samples.fsm.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.kermeta.samples.fsm.util.FsmResourceImpl
 * @generated
 */
public class FsmResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "IRISA/INRIA";

	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FsmResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new FsmResourceImpl(uri);
		return result;
	}

} //FsmResourceFactoryImpl
