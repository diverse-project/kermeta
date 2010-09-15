/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.art2adaptation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.kermeta.art2adaptation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Art2adaptationFactoryImpl extends EFactoryImpl implements Art2adaptationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Art2adaptationFactory init() {
		try {
			Art2adaptationFactory theArt2adaptationFactory = (Art2adaptationFactory)EPackage.Registry.INSTANCE.getEFactory("http://art2adaptation/1.0"); 
			if (theArt2adaptationFactory != null) {
				return theArt2adaptationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Art2adaptationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Art2adaptationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Art2adaptationPackage.ADAPTATION_PRIMITIVE: return createAdaptationPrimitive();
			case Art2adaptationPackage.ADAPTATION_MODEL: return createAdaptationModel();
			case Art2adaptationPackage.TYPE_ADAPTATION: return createTypeAdaptation();
			case Art2adaptationPackage.INSTANCE_ADAPTATION: return createInstanceAdaptation();
			case Art2adaptationPackage.ADD_TYPE: return createAddType();
			case Art2adaptationPackage.REMOVE_TYPE: return createRemoveType();
			case Art2adaptationPackage.ADD_INSTANCE: return createAddInstance();
			case Art2adaptationPackage.REMOVE_INSTANCE: return createRemoveInstance();
			case Art2adaptationPackage.THIRD_PARTY_ADAPTATION: return createThirdPartyAdaptation();
			case Art2adaptationPackage.ADD_THIRD_PARTY: return createAddThirdParty();
			case Art2adaptationPackage.REMOVE_THIRD_PARTY: return createRemoveThirdParty();
			case Art2adaptationPackage.BINDING_ADAPTATION: return createBindingAdaptation();
			case Art2adaptationPackage.ADD_BINDING: return createAddBinding();
			case Art2adaptationPackage.REMOVE_BINDING: return createRemoveBinding();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationPrimitive createAdaptationPrimitive() {
		AdaptationPrimitiveImpl adaptationPrimitive = new AdaptationPrimitiveImpl();
		return adaptationPrimitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdaptationModel createAdaptationModel() {
		AdaptationModelImpl adaptationModel = new AdaptationModelImpl();
		return adaptationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAdaptation createTypeAdaptation() {
		TypeAdaptationImpl typeAdaptation = new TypeAdaptationImpl();
		return typeAdaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceAdaptation createInstanceAdaptation() {
		InstanceAdaptationImpl instanceAdaptation = new InstanceAdaptationImpl();
		return instanceAdaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddType createAddType() {
		AddTypeImpl addType = new AddTypeImpl();
		return addType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveType createRemoveType() {
		RemoveTypeImpl removeType = new RemoveTypeImpl();
		return removeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddInstance createAddInstance() {
		AddInstanceImpl addInstance = new AddInstanceImpl();
		return addInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveInstance createRemoveInstance() {
		RemoveInstanceImpl removeInstance = new RemoveInstanceImpl();
		return removeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThirdPartyAdaptation createThirdPartyAdaptation() {
		ThirdPartyAdaptationImpl thirdPartyAdaptation = new ThirdPartyAdaptationImpl();
		return thirdPartyAdaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddThirdParty createAddThirdParty() {
		AddThirdPartyImpl addThirdParty = new AddThirdPartyImpl();
		return addThirdParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveThirdParty createRemoveThirdParty() {
		RemoveThirdPartyImpl removeThirdParty = new RemoveThirdPartyImpl();
		return removeThirdParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingAdaptation createBindingAdaptation() {
		BindingAdaptationImpl bindingAdaptation = new BindingAdaptationImpl();
		return bindingAdaptation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddBinding createAddBinding() {
		AddBindingImpl addBinding = new AddBindingImpl();
		return addBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveBinding createRemoveBinding() {
		RemoveBindingImpl removeBinding = new RemoveBindingImpl();
		return removeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Art2adaptationPackage getArt2adaptationPackage() {
		return (Art2adaptationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Art2adaptationPackage getPackage() {
		return Art2adaptationPackage.eINSTANCE;
	}

} //Art2adaptationFactoryImpl
