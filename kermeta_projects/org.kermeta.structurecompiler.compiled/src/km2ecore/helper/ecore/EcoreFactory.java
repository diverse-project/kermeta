/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id: EcoreFactory.java,v 1.11 2009-02-10 17:51:58 cfaucher Exp $
 */
package km2ecore.helper.ecore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see km2ecore.helper.ecore.EcorePackage
 * @generated
 */
public interface EcoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreFactory eINSTANCE = km2ecore.helper.ecore.impl.EcoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ENamed Element Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ENamed Element Helper</em>'.
	 * @generated
	 */
	ENamedElementHelper createENamedElementHelper();

	/**
	 * Returns a new object of class '<em>Model Element Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element Helper</em>'.
	 * @generated
	 */
	EcoreModelElementHelper createEcoreModelElementHelper();

	/**
	 * Returns a new object of class '<em>EAnnotation Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAnnotation Helper</em>'.
	 * @generated
	 */
	EAnnotationHelper createEAnnotationHelper();

	/**
	 * Returns a new object of class '<em>Model Analizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Analizer</em>'.
	 * @generated
	 */
	ModelAnalizer createModelAnalizer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcorePackage getEcorePackage();

} //EcoreFactory
