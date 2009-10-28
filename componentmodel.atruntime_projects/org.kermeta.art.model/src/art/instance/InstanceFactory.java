/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art.instance;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see art.instance.InstancePackage
 * @generated
 */
public interface InstanceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstanceFactory eINSTANCE = art.instance.impl.InstanceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Primitive Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Instance</em>'.
	 * @generated
	 */
	PrimitiveInstance createPrimitiveInstance();

	/**
	 * Returns a new object of class '<em>Composite Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Instance</em>'.
	 * @generated
	 */
	CompositeInstance createCompositeInstance();

	/**
	 * Returns a new object of class '<em>Valued Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valued Attribute</em>'.
	 * @generated
	 */
	ValuedAttribute createValuedAttribute();

	/**
	 * Returns a new object of class '<em>Transmission Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transmission Binding</em>'.
	 * @generated
	 */
	TransmissionBinding createTransmissionBinding();

	/**
	 * Returns a new object of class '<em>Delegation Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegation Binding</em>'.
	 * @generated
	 */
	DelegationBinding createDelegationBinding();

	/**
	 * Returns a new object of class '<em>Dictionary Valued Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dictionary Valued Attribute</em>'.
	 * @generated
	 */
	DictionaryValuedAttribute createDictionaryValuedAttribute();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	Entry createEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InstancePackage getInstancePackage();

} //InstanceFactory
