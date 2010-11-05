/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.instance_relaxed;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see art_relaxed.instance_relaxed.Instance_relaxedPackage
 * @generated
 */
public interface Instance_relaxedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Instance_relaxedFactory eINSTANCE = art_relaxed.instance_relaxed.impl.Instance_relaxedFactoryImpl.init();

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
	 * Returns a new object of class '<em>Valued Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valued Attribute</em>'.
	 * @generated
	 */
	ValuedAttribute createValuedAttribute();

	/**
	 * Returns a new object of class '<em>Dictionary Valued Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dictionary Valued Attribute</em>'.
	 * @generated
	 */
	DictionaryValuedAttribute createDictionaryValuedAttribute();

	/**
	 * Returns a new object of class '<em>Default Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Entry</em>'.
	 * @generated
	 */
	DefaultEntry createDefaultEntry();

	/**
	 * Returns a new object of class '<em>Other Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Entry</em>'.
	 * @generated
	 */
	OtherEntry createOtherEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Instance_relaxedPackage getInstance_relaxedPackage();

} //Instance_relaxedFactory
