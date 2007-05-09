/**
 * <copyright>
 * </copyright>
 *
 * $Id: BehaviorResourceFactoryImpl.java,v 1.1 2007-05-09 08:56:18 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.language.behavior.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.kermeta.language.behavior.util.BehaviorResourceImpl
 * @generated
 */
public class BehaviorResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource(URI uri) {
		Resource result = new BehaviorResourceImpl(uri);
		return result;
	}

} //BehaviorResourceFactoryImpl
