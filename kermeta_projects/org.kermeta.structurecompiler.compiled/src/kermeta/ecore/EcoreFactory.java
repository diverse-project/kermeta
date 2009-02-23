/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: EcoreFactory.java,v 1.12 2009-02-23 15:27:04 cfaucher Exp $
 */
package kermeta.ecore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kermeta.ecore.EcorePackage
 * @generated
 */
public interface EcoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreFactory eINSTANCE = kermeta.ecore.impl.EcoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EFeature Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFeature Map Entry</em>'.
	 * @generated
	 */
	EFeatureMapEntry createEFeatureMapEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcorePackage getEcorePackage();

} //EcoreFactory
