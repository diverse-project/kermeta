/**
 * <copyright>
 * </copyright>
 *
 * $Id: KmResourceFactoryImpl.java,v 1.1 2007-05-09 08:56:17 cfaucher Exp $
 */
package fr.irisa.triskell.kermeta.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.kermeta.util.KmResourceImpl
 * @generated
 */
public class KmResourceFactoryImpl extends ResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KmResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource(URI uri) {
		Resource result = new KmResourceImpl(uri);
		return result;
	}

} //KmResourceFactoryImpl
