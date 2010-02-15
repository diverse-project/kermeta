/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see art2.Art2Package
 * @generated
 */
public interface Art2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Art2Factory eINSTANCE = art2.impl.Art2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance</em>'.
	 * @generated
	 */
	ComponentInstance createComponentInstance();

	/**
	 * Returns a new object of class '<em>Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Type</em>'.
	 * @generated
	 */
	ComponentType createComponentType();

	/**
	 * Returns a new object of class '<em>Container Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Node</em>'.
	 * @generated
	 */
	ContainerNode createContainerNode();

	/**
	 * Returns a new object of class '<em>Container Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Root</em>'.
	 * @generated
	 */
	ContainerRoot createContainerRoot();

	/**
	 * Returns a new object of class '<em>Port Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Type</em>'.
	 * @generated
	 */
	PortType createPortType();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Namespace</em>'.
	 * @generated
	 */
	Namespace createNamespace();

	/**
	 * Returns a new object of class '<em>Port Service Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Service Impl</em>'.
	 * @generated
	 */
	PortServiceImpl createPortServiceImpl();

	/**
	 * Returns a new object of class '<em>Port Actor Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Actor Impl</em>'.
	 * @generated
	 */
	PortActorImpl createPortActorImpl();

	/**
	 * Returns a new object of class '<em>Port Message Impl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Message Impl</em>'.
	 * @generated
	 */
	PortMessageImpl createPortMessageImpl();

	/**
	 * Returns a new object of class '<em>Dictionary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dictionary</em>'.
	 * @generated
	 */
	Dictionary createDictionary();

	/**
	 * Returns a new object of class '<em>Dictionary Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dictionary Type</em>'.
	 * @generated
	 */
	DictionaryType createDictionaryType();

	/**
	 * Returns a new object of class '<em>Dictionary Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dictionary Attribute</em>'.
	 * @generated
	 */
	DictionaryAttribute createDictionaryAttribute();

	/**
	 * Returns a new object of class '<em>Dictionary Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dictionary Value</em>'.
	 * @generated
	 */
	DictionaryValue createDictionaryValue();

	/**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
	Binding createBinding();

	/**
	 * Returns a new object of class '<em>Composite Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Type</em>'.
	 * @generated
	 */
	CompositeType createCompositeType();

	/**
	 * Returns a new object of class '<em>Port Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Type Ref</em>'.
	 * @generated
	 */
	PortTypeRef createPortTypeRef();

	/**
	 * Returns a new object of class '<em>Wire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wire</em>'.
	 * @generated
	 */
	Wire createWire();

	/**
	 * Returns a new object of class '<em>Service Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Data Type</em>'.
	 * @generated
	 */
	ServiceDataType createServiceDataType();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Typed Element</em>'.
	 * @generated
	 */
	TypedElement createTypedElement();

	/**
	 * Returns a new object of class '<em>Message Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Data Type</em>'.
	 * @generated
	 */
	MessageDataType createMessageDataType();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	Repository createRepository();

	/**
	 * Returns a new object of class '<em>Component Type Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Type Library</em>'.
	 * @generated
	 */
	ComponentTypeLibrary createComponentTypeLibrary();

	/**
	 * Returns a new object of class '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Integration Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integration Pattern</em>'.
	 * @generated
	 */
	IntegrationPattern createIntegrationPattern();

	/**
	 * Returns a new object of class '<em>Extra Fonctional Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extra Fonctional Property</em>'.
	 * @generated
	 */
	ExtraFonctionalProperty createExtraFonctionalProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Art2Package getArt2Package();

} //Art2Factory
