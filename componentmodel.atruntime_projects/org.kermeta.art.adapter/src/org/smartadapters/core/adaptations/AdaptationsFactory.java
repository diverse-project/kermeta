/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.adaptations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.smartadapters.core.adaptations.AdaptationsPackage
 * @generated
 */
public interface AdaptationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdaptationsFactory eINSTANCE = org.smartadapters.core.adaptations.impl.AdaptationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Setruntime System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setruntime System</em>'.
	 * @generated
	 */
	SetruntimeSystem createSetruntimeSystem();

	/**
	 * Returns a new object of class '<em>Setruntimeinstance Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setruntimeinstance Component Instance</em>'.
	 * @generated
	 */
	SetruntimeinstanceComponentInstance createSetruntimeinstanceComponentInstance();

	/**
	 * Returns a new object of class '<em>Setruntimeinstance Primitive Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setruntimeinstance Primitive Instance</em>'.
	 * @generated
	 */
	SetruntimeinstancePrimitiveInstance createSetruntimeinstancePrimitiveInstance();

	/**
	 * Returns a new object of class '<em>Setruntimeinstance Composite Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setruntimeinstance Composite Instance</em>'.
	 * @generated
	 */
	SetruntimeinstanceCompositeInstance createSetruntimeinstanceCompositeInstance();

	/**
	 * Returns a new object of class '<em>Setruntimeinstance Transmission Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Setruntimeinstance Transmission Binding</em>'.
	 * @generated
	 */
	SetruntimeinstanceTransmissionBinding createSetruntimeinstanceTransmissionBinding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdaptationsPackage getAdaptationsPackage();

} //AdaptationsFactory
