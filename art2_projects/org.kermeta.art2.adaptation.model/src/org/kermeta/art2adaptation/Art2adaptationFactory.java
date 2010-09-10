/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kermeta.art2adaptation.Art2adaptationPackage
 * @generated
 */
public interface Art2adaptationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Art2adaptationFactory eINSTANCE = org.kermeta.art2adaptation.impl.Art2adaptationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Adaptation Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adaptation Primitive</em>'.
	 * @generated
	 */
	AdaptationPrimitive createAdaptationPrimitive();

	/**
	 * Returns a new object of class '<em>Adaptation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adaptation Model</em>'.
	 * @generated
	 */
	AdaptationModel createAdaptationModel();

	/**
	 * Returns a new object of class '<em>Component Type Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Type Adaptation</em>'.
	 * @generated
	 */
	ComponentTypeAdaptation createComponentTypeAdaptation();

	/**
	 * Returns a new object of class '<em>Component Instance Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance Adaptation</em>'.
	 * @generated
	 */
	ComponentInstanceAdaptation createComponentInstanceAdaptation();

	/**
	 * Returns a new object of class '<em>Add Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Component Type</em>'.
	 * @generated
	 */
	AddComponentType createAddComponentType();

	/**
	 * Returns a new object of class '<em>Remove Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Component Type</em>'.
	 * @generated
	 */
	RemoveComponentType createRemoveComponentType();

	/**
	 * Returns a new object of class '<em>Add Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Component Instance</em>'.
	 * @generated
	 */
	AddComponentInstance createAddComponentInstance();

	/**
	 * Returns a new object of class '<em>Remove Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Component Instance</em>'.
	 * @generated
	 */
	RemoveComponentInstance createRemoveComponentInstance();

	/**
	 * Returns a new object of class '<em>Third Party Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Third Party Adaptation</em>'.
	 * @generated
	 */
	ThirdPartyAdaptation createThirdPartyAdaptation();

	/**
	 * Returns a new object of class '<em>Add Third Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Third Party</em>'.
	 * @generated
	 */
	AddThirdParty createAddThirdParty();

	/**
	 * Returns a new object of class '<em>Remove Third Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Third Party</em>'.
	 * @generated
	 */
	RemoveThirdParty createRemoveThirdParty();

	/**
	 * Returns a new object of class '<em>Binding Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Adaptation</em>'.
	 * @generated
	 */
	BindingAdaptation createBindingAdaptation();

	/**
	 * Returns a new object of class '<em>Add Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Binding</em>'.
	 * @generated
	 */
	AddBinding createAddBinding();

	/**
	 * Returns a new object of class '<em>Remove Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Binding</em>'.
	 * @generated
	 */
	RemoveBinding createRemoveBinding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Art2adaptationPackage getArt2adaptationPackage();

} //Art2adaptationFactory
