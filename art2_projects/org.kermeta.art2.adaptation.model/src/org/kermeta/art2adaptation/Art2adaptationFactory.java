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
	 * Returns a new object of class '<em>Type Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Adaptation</em>'.
	 * @generated
	 */
	TypeAdaptation createTypeAdaptation();

	/**
	 * Returns a new object of class '<em>Instance Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Adaptation</em>'.
	 * @generated
	 */
	InstanceAdaptation createInstanceAdaptation();

	/**
	 * Returns a new object of class '<em>Add Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Type</em>'.
	 * @generated
	 */
	AddType createAddType();

	/**
	 * Returns a new object of class '<em>Remove Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Type</em>'.
	 * @generated
	 */
	RemoveType createRemoveType();

	/**
	 * Returns a new object of class '<em>Add Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Instance</em>'.
	 * @generated
	 */
	AddInstance createAddInstance();

	/**
	 * Returns a new object of class '<em>Remove Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Instance</em>'.
	 * @generated
	 */
	RemoveInstance createRemoveInstance();

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
	 * Returns a new object of class '<em>Fragment Binding Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fragment Binding Adaptation</em>'.
	 * @generated
	 */
	FragmentBindingAdaptation createFragmentBindingAdaptation();

	/**
	 * Returns a new object of class '<em>Add Fragment Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Fragment Binding</em>'.
	 * @generated
	 */
	AddFragmentBinding createAddFragmentBinding();

	/**
	 * Returns a new object of class '<em>Remove Fragment Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Fragment Binding</em>'.
	 * @generated
	 */
	RemoveFragmentBinding createRemoveFragmentBinding();

	/**
	 * Returns a new object of class '<em>Update Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Instance</em>'.
	 * @generated
	 */
	UpdateInstance createUpdateInstance();

	/**
	 * Returns a new object of class '<em>Update Dictionary Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Dictionary Instance</em>'.
	 * @generated
	 */
	UpdateDictionaryInstance createUpdateDictionaryInstance();

	/**
	 * Returns a new object of class '<em>Update Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Type</em>'.
	 * @generated
	 */
	UpdateType createUpdateType();

	/**
	 * Returns a new object of class '<em>Deploy Unit Adaptation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deploy Unit Adaptation</em>'.
	 * @generated
	 */
	DeployUnitAdaptation createDeployUnitAdaptation();

	/**
	 * Returns a new object of class '<em>Add Deploy Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Deploy Unit</em>'.
	 * @generated
	 */
	AddDeployUnit createAddDeployUnit();

	/**
	 * Returns a new object of class '<em>Remove Deploy Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Deploy Unit</em>'.
	 * @generated
	 */
	RemoveDeployUnit createRemoveDeployUnit();

	/**
	 * Returns a new object of class '<em>Update Deploy Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Deploy Unit</em>'.
	 * @generated
	 */
	UpdateDeployUnit createUpdateDeployUnit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Art2adaptationPackage getArt2adaptationPackage();

} //Art2adaptationFactory
