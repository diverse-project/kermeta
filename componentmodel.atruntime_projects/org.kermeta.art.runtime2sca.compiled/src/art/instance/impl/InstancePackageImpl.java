/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package art.instance.impl;

import art.ArtPackage;

import art.impl.ArtPackageImpl;

import art.implem.ImplemPackage;

import art.implem.impl.ImplemPackageImpl;

import art.instance.Binding;
import art.instance.ComponentInstance;
import art.instance.CompositeInstance;
import art.instance.DelegationBinding;
import art.instance.InstanceFactory;
import art.instance.InstancePackage;
import art.instance.InstanceState;
import art.instance.PrimitiveInstance;
import art.instance.TransmissionBinding;
import art.instance.ValuedAttribute;

import art.type.TypePackage;

import art.type.impl.TypePackageImpl;

import kermeta.KermetaPackage;

import kermeta.ecore.EcorePackage;

import kermeta.ecore.impl.EcorePackageImpl;

import kermeta.exceptions.ExceptionsPackage;

import kermeta.exceptions.impl.ExceptionsPackageImpl;

import kermeta.impl.KermetaPackageImpl;

import kermeta.interpreter.InterpreterPackage;

import kermeta.interpreter.impl.InterpreterPackageImpl;

import kermeta.io.IoPackage;

import kermeta.io.impl.IoPackageImpl;

import kermeta.kunit.KunitPackage;

import kermeta.kunit.impl.KunitPackageImpl;

import kermeta.language.LanguagePackage;

import kermeta.language.behavior.BehaviorPackage;

import kermeta.language.behavior.impl.BehaviorPackageImpl;

import kermeta.language.impl.LanguagePackageImpl;

import kermeta.language.structure.StructurePackage;

import kermeta.language.structure.impl.StructurePackageImpl;

import kermeta.persistence.PersistencePackage;

import kermeta.persistence.impl.PersistencePackageImpl;

import kermeta.standard.StandardPackage;

import kermeta.standard.impl.StandardPackageImpl;

import kermeta.utils.UtilsPackage;

import kermeta.utils.impl.UtilsPackageImpl;

import kermeta.xmltype.XmltypePackage;

import kermeta.xmltype.impl.XmltypePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import runtime2SCA.Runtime2SCAPackage;

import runtime2SCA.impl.Runtime2SCAPackageImpl;

import sca.ScaPackage;

import sca.impl.ScaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstancePackageImpl extends EPackageImpl implements
		InstancePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transmissionBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegationBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum instanceStateEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see art.instance.InstancePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InstancePackageImpl() {
		super(eNS_URI, InstanceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link InstancePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InstancePackage init() {
		if (isInited)
			return (InstancePackage) EPackage.Registry.INSTANCE
					.getEPackage(InstancePackage.eNS_URI);

		// Obtain or create and register package
		InstancePackageImpl theInstancePackage = (InstancePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new InstancePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KermetaPackageImpl theKermetaPackage = (KermetaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI) instanceof KermetaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KermetaPackage.eNS_URI)
				: KermetaPackage.eINSTANCE);
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(LanguagePackage.eNS_URI)
				: LanguagePackage.eINSTANCE);
		StructurePackageImpl theStructurePackage = (StructurePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI)
				: StructurePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI)
				: BehaviorPackage.eINSTANCE);
		XmltypePackageImpl theXmltypePackage = (XmltypePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(XmltypePackage.eNS_URI) instanceof XmltypePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(XmltypePackage.eNS_URI)
				: XmltypePackage.eINSTANCE);
		InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI)
				: InterpreterPackage.eINSTANCE);
		StandardPackageImpl theStandardPackage = (StandardPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI)
				: StandardPackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI)
				: IoPackage.eINSTANCE);
		ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI)
				: ExceptionsPackage.eINSTANCE);
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI)
				: PersistencePackage.eINSTANCE);
		KunitPackageImpl theKunitPackage = (KunitPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI)
				: KunitPackage.eINSTANCE);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI)
				: UtilsPackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI)
				: EcorePackage.eINSTANCE);
		Runtime2SCAPackageImpl theRuntime2SCAPackage = (Runtime2SCAPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Runtime2SCAPackage.eNS_URI) instanceof Runtime2SCAPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(Runtime2SCAPackage.eNS_URI)
				: Runtime2SCAPackage.eINSTANCE);
		ScaPackageImpl theScaPackage = (ScaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ScaPackage.eNS_URI) instanceof ScaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ScaPackage.eNS_URI)
				: ScaPackage.eINSTANCE);
		ArtPackageImpl theArtPackage = (ArtPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ArtPackage.eNS_URI) instanceof ArtPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ArtPackage.eNS_URI)
				: ArtPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TypePackage.eNS_URI)
				: TypePackage.eINSTANCE);
		ImplemPackageImpl theImplemPackage = (ImplemPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ImplemPackage.eNS_URI) instanceof ImplemPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ImplemPackage.eNS_URI)
				: ImplemPackage.eINSTANCE);

		// Create package meta-data objects
		theInstancePackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theXmltypePackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theIoPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theRuntime2SCAPackage.createPackageContents();
		theScaPackage.createPackageContents();
		theArtPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theImplemPackage.createPackageContents();

		// Initialize created meta-data
		theInstancePackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theXmltypePackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theRuntime2SCAPackage.initializePackageContents();
		theScaPackage.initializePackageContents();
		theArtPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theImplemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInstancePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InstancePackage.eNS_URI,
				theInstancePackage);
		return theInstancePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentInstance() {
		return componentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Binding() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_SuperComponent() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Type() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentInstance_State() {
		return (EAttribute) componentInstanceEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Attribute() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentInstance_Implem() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveInstance() {
		return primitiveInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeInstance() {
		return compositeInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeInstance_SubComponent() {
		return (EReference) compositeInstanceEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeInstance_Delegation() {
		return (EReference) compositeInstanceEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuedAttribute() {
		return valuedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValuedAttribute_Value() {
		return (EAttribute) valuedAttributeEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuedAttribute_Attribute() {
		return (EReference) valuedAttributeEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_ServerInstance() {
		return (EReference) bindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_Id() {
		return (EAttribute) bindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransmissionBinding() {
		return transmissionBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmissionBinding_Server() {
		return (EReference) transmissionBindingEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmissionBinding_Client() {
		return (EReference) transmissionBindingEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelegationBinding() {
		return delegationBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationBinding_Source() {
		return (EReference) delegationBindingEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDelegationBinding_Exported() {
		return (EReference) delegationBindingEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInstanceState() {
		return instanceStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceFactory getInstanceFactory() {
		return (InstanceFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		componentInstanceEClass = createEClass(COMPONENT_INSTANCE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__BINDING);
		createEReference(componentInstanceEClass,
				COMPONENT_INSTANCE__SUPER_COMPONENT);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__TYPE);
		createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__STATE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__ATTRIBUTE);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__IMPLEM);

		primitiveInstanceEClass = createEClass(PRIMITIVE_INSTANCE);

		compositeInstanceEClass = createEClass(COMPOSITE_INSTANCE);
		createEReference(compositeInstanceEClass,
				COMPOSITE_INSTANCE__SUB_COMPONENT);
		createEReference(compositeInstanceEClass,
				COMPOSITE_INSTANCE__DELEGATION);

		valuedAttributeEClass = createEClass(VALUED_ATTRIBUTE);
		createEAttribute(valuedAttributeEClass, VALUED_ATTRIBUTE__VALUE);
		createEReference(valuedAttributeEClass, VALUED_ATTRIBUTE__ATTRIBUTE);

		bindingEClass = createEClass(BINDING);
		createEReference(bindingEClass, BINDING__SERVER_INSTANCE);
		createEAttribute(bindingEClass, BINDING__ID);

		transmissionBindingEClass = createEClass(TRANSMISSION_BINDING);
		createEReference(transmissionBindingEClass,
				TRANSMISSION_BINDING__SERVER);
		createEReference(transmissionBindingEClass,
				TRANSMISSION_BINDING__CLIENT);

		delegationBindingEClass = createEClass(DELEGATION_BINDING);
		createEReference(delegationBindingEClass, DELEGATION_BINDING__SOURCE);
		createEReference(delegationBindingEClass, DELEGATION_BINDING__EXPORTED);

		// Create enums
		instanceStateEEnum = createEEnum(INSTANCE_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ArtPackage theArtPackage = (ArtPackage) EPackage.Registry.INSTANCE
				.getEPackage(ArtPackage.eNS_URI);
		TypePackage theTypePackage = (TypePackage) EPackage.Registry.INSTANCE
				.getEPackage(TypePackage.eNS_URI);
		ImplemPackage theImplemPackage = (ImplemPackage) EPackage.Registry.INSTANCE
				.getEPackage(ImplemPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentInstanceEClass.getESuperTypes().add(
				theArtPackage.getModelElement());
		componentInstanceEClass.getESuperTypes().add(
				theArtPackage.getAddElement());
		componentInstanceEClass.getESuperTypes().add(
				theArtPackage.getRemoveElement());
		componentInstanceEClass.getESuperTypes().add(
				theArtPackage.getUpdateElement());
		primitiveInstanceEClass.getESuperTypes().add(
				this.getComponentInstance());
		compositeInstanceEClass.getESuperTypes().add(
				this.getComponentInstance());
		valuedAttributeEClass.getESuperTypes().add(
				theArtPackage.getUpdateElement());
		bindingEClass.getESuperTypes().add(theArtPackage.getAddElement());
		bindingEClass.getESuperTypes().add(theArtPackage.getRemoveElement());
		bindingEClass.getESuperTypes().add(theArtPackage.getUpdateElement());
		transmissionBindingEClass.getESuperTypes().add(this.getBinding());
		delegationBindingEClass.getESuperTypes().add(this.getBinding());

		// Initialize classes and features; add operations and parameters
		initEClass(componentInstanceEClass, ComponentInstance.class,
				"ComponentInstance", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentInstance_Binding(), this
				.getTransmissionBinding(), null, "binding", null, 0, -1,
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_SuperComponent(), this
				.getCompositeInstance(), this
				.getCompositeInstance_SubComponent(), "superComponent", null,
				0, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Type(), theTypePackage
				.getComponentType(), null, "type", null, 1, 1,
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentInstance_State(), theArtPackage.getString(),
				"state", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Attribute(), this
				.getValuedAttribute(), null, "attribute", null, 0, -1,
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Implem(), theImplemPackage
				.getComponentImplementation(), null, "implem", null, 0, 1,
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(componentInstanceEClass, theTypePackage.getOperation(),
				"getOperationEMF_renameAs", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(componentInstanceEClass, this.getTransmissionBinding(),
				"getterGetAllBindings", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(componentInstanceEClass, theTypePackage.getOperation(),
				"getterOperation", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(componentInstanceEClass, theArtPackage.getString(),
				"getterOperationAsString", 0, -1, !IS_UNIQUE, IS_ORDERED);

		addEOperation(componentInstanceEClass, this.getComponentInstance(),
				"getterDependentComponents", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(primitiveInstanceEClass, PrimitiveInstance.class,
				"PrimitiveInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		addEOperation(primitiveInstanceEClass, theTypePackage.getOperation(),
				"getOperationEMF_renameAs", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(compositeInstanceEClass, CompositeInstance.class,
				"CompositeInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeInstance_SubComponent(), this
				.getComponentInstance(), this
				.getComponentInstance_SuperComponent(), "subComponent", null,
				0, -1, CompositeInstance.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeInstance_Delegation(), this
				.getDelegationBinding(), null, "delegation", null, 0, -1,
				CompositeInstance.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(compositeInstanceEClass, theTypePackage.getOperation(),
				"getOperationEMF_renameAs", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(valuedAttributeEClass, ValuedAttribute.class,
				"ValuedAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValuedAttribute_Value(), theArtPackage.getString(),
				"value", null, 0, 1, ValuedAttribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getValuedAttribute_Attribute(), theTypePackage
				.getAttribute(), null, "attribute", null, 0, 1,
				ValuedAttribute.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinding_ServerInstance(),
				this.getComponentInstance(), null, "serverInstance", null, 1,
				1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinding_Id(), theArtPackage.getString(), "id", null,
				0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(transmissionBindingEClass, TransmissionBinding.class,
				"TransmissionBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransmissionBinding_Server(), theTypePackage
				.getPort(), null, "server", null, 0, 1,
				TransmissionBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransmissionBinding_Client(), theTypePackage
				.getPort(), null, "client", null, 0, 1,
				TransmissionBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegationBindingEClass, DelegationBinding.class,
				"DelegationBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegationBinding_Source(), theTypePackage.getPort(),
				null, "source", null, 1, 1, DelegationBinding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDelegationBinding_Exported(), theTypePackage
				.getPort(), null, "exported", null, 1, 1,
				DelegationBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(instanceStateEEnum, InstanceState.class, "InstanceState");
		addEEnumLiteral(instanceStateEEnum, InstanceState.OFF);
		addEEnumLiteral(instanceStateEEnum, InstanceState.ON);

		// Create annotations
		// kermeta
		createKermetaAnnotations();
		// kermeta.inv
		createKermeta_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>kermeta</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermetaAnnotations() {
		String source = "kermeta";
		addAnnotation(this, source, new String[] { "ecoreUri",
				"http://art/instance" });
		addAnnotation(this, source, new String[] { "ecore", "true" });
		addAnnotation(componentInstanceEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(componentInstanceEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(componentInstanceEClass.getEOperations().get(0), source,
				new String[] { "EMF_renameAs", "getOperationEMF_renameAs" });
		addAnnotation(getComponentInstance_Binding(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getComponentInstance_SuperComponent(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getComponentInstance_Type(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getComponentInstance_State(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getComponentInstance_Attribute(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getComponentInstance_Implem(), source, new String[] {
				"ecore", "true" });
		addAnnotation(primitiveInstanceEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(primitiveInstanceEClass.getEOperations().get(0), source,
				new String[] { "EMF_renameAs", "getOperationEMF_renameAs" });
		addAnnotation(primitiveInstanceEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"art::instance::ComponentInstance" });
		addAnnotation(compositeInstanceEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(compositeInstanceEClass.getEOperations().get(0), source,
				new String[] { "EMF_renameAs", "getOperationEMF_renameAs" });
		addAnnotation(compositeInstanceEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"art::instance::ComponentInstance" });
		addAnnotation(getCompositeInstance_SubComponent(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getCompositeInstance_Delegation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(instanceStateEEnum, source, new String[] { "ecore",
				"true" });
		addAnnotation(valuedAttributeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getValuedAttribute_Value(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getValuedAttribute_Attribute(), source, new String[] {
				"ecore", "true" });
		addAnnotation(bindingEClass, source, new String[] { "ecore", "true" });
		addAnnotation(getBinding_ServerInstance(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getBinding_Id(), source, new String[] { "ecore", "true" });
		addAnnotation(transmissionBindingEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(getTransmissionBinding_Server(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getTransmissionBinding_Client(), source, new String[] {
				"ecore", "true" });
		addAnnotation(delegationBindingEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getDelegationBinding_Source(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getDelegationBinding_Exported(), source, new String[] {
				"ecore", "true" });
	}

	/**
	 * Initializes the annotations for <b>kermeta.inv</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermeta_1Annotations() {
		String source = "kermeta.inv";
		addAnnotation(componentInstanceEClass, source, new String[] {
				"mandatoryClientPortBound", "" });
		addAnnotation(compositeInstanceEClass, source, new String[] {
				"completeDelegationBindings", "" });
		addAnnotation(bindingEClass, source, new String[] {
				"wellFormedBinding", "" });
		addAnnotation(transmissionBindingEClass, source, new String[] {
				"wellFormedTransmissionBinding", "" });
		addAnnotation(delegationBindingEClass, source, new String[] {
				"wellFormedDelegationBinding", "" });
	}

} //InstancePackageImpl
