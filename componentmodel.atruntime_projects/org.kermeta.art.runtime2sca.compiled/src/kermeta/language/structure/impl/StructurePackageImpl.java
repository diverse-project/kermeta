/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generating with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.structure.impl;

import art.ArtPackage;

import art.impl.ArtPackageImpl;

import art.implem.ImplemPackage;

import art.implem.impl.ImplemPackageImpl;

import art.instance.InstancePackage;

import art.instance.impl.InstancePackageImpl;

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

import kermeta.language.structure.ClassDefinition;
import kermeta.language.structure.Constraint;
import kermeta.language.structure.ConstraintLanguage;
import kermeta.language.structure.ConstraintType;
import kermeta.language.structure.DataType;
import kermeta.language.structure.Enumeration;
import kermeta.language.structure.EnumerationLiteral;
import kermeta.language.structure.Filter;
import kermeta.language.structure.FunctionType;
import kermeta.language.structure.GenericTypeDefinition;
import kermeta.language.structure.Model;
import kermeta.language.structure.ModelType;
import kermeta.language.structure.ModelTypeVariable;
import kermeta.language.structure.ModelingUnit;
import kermeta.language.structure.MultiplicityElement;
import kermeta.language.structure.NamedElement;
import kermeta.language.structure.ObjectTypeVariable;
import kermeta.language.structure.Operation;
import kermeta.language.structure.Parameter;
import kermeta.language.structure.ParameterizedType;
import kermeta.language.structure.PrimitiveType;
import kermeta.language.structure.ProductType;
import kermeta.language.structure.Property;
import kermeta.language.structure.Require;
import kermeta.language.structure.StructureFactory;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Tag;
import kermeta.language.structure.Type;
import kermeta.language.structure.TypeContainer;
import kermeta.language.structure.TypeDefinition;
import kermeta.language.structure.TypeDefinitionContainer;
import kermeta.language.structure.TypeVariable;
import kermeta.language.structure.TypeVariableBinding;
import kermeta.language.structure.TypedElement;
import kermeta.language.structure.Using;
import kermeta.language.structure.VirtualType;
import kermeta.language.structure.VoidType;

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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
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
public class StructurePackageImpl extends EPackageImpl implements
		StructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeVariableBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterizedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypeVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelingUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintLanguageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unlimitedNaturalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kermetaProperty_Object_oidEDataType = null;

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
	 * @see kermeta.language.structure.StructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructurePackageImpl() {
		super(eNS_URI, StructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructurePackage init() {
		if (isInited)
			return (StructurePackage) EPackage.Registry.INSTANCE
					.getEPackage(StructurePackage.eNS_URI);

		// Obtain or create and register package
		StructurePackageImpl theStructurePackage = (StructurePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new StructurePackageImpl());

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
		InstancePackageImpl theInstancePackage = (InstancePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InstancePackage.eNS_URI)
				: InstancePackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TypePackage.eNS_URI)
				: TypePackage.eINSTANCE);
		ImplemPackageImpl theImplemPackage = (ImplemPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ImplemPackage.eNS_URI) instanceof ImplemPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ImplemPackage.eNS_URI)
				: ImplemPackage.eINSTANCE);

		// Create package meta-data objects
		theStructurePackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
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
		theInstancePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theImplemPackage.createPackageContents();

		// Initialize created meta-data
		theStructurePackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
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
		theInstancePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theImplemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructurePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructurePackage.eNS_URI,
				theStructurePackage);
		return theStructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObject() {
		return objectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_Tag() {
		return (EReference) objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_OwnedTags() {
		return (EReference) objectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_Oid() {
		return (EAttribute) objectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_InternalContainingResource() {
		return (EReference) objectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_TypeContainer() {
		return (EReference) typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelType() {
		return modelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_IncludedTypeDefinition() {
		return (EReference) modelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDefinition() {
		return classDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDefinition_OwnedOperation() {
		return (EReference) classDefinitionEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDefinition_IsAbstract() {
		return (EAttribute) classDefinitionEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDefinition_SuperType() {
		return (EReference) classDefinitionEClass.getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDefinition_Inv() {
		return (EReference) classDefinitionEClass.getEStructuralFeatures().get(
				3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDefinition_OwnedAttribute() {
		return (EReference) classDefinitionEClass.getEStructuralFeatures().get(
				4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Contents() {
		return (EReference) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_OwnedLiteral() {
		return (EReference) enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionType() {
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_Right() {
		return (EReference) functionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_Left() {
		return (EReference) functionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_TypeParameter() {
		return (EReference) operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Body() {
		return (EReference) operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Pre() {
		return (EReference) operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_OwningClass() {
		return (EReference) operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Post() {
		return (EReference) operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsAbstract() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_OwnedParameter() {
		return (EReference) operationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_RaisedException() {
		return (EReference) operationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_SuperOperation() {
		return (EReference) operationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty__default() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Opposite() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerived() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_GetterBody() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsReadOnly() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_SetterBody() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsSetterAbstract() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsID() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_OwningClass() {
		return (EReference) propertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsGetterAbstract() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsComposite() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeContainer() {
		return typeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeContainer_ContainedType() {
		return (EReference) typeContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationLiteral_Enumeration() {
		return (EReference) enumerationLiteralEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeVariableBinding() {
		return typeVariableBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeVariableBinding_Type() {
		return (EReference) typeVariableBindingEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeVariableBinding_Variable() {
		return (EReference) typeVariableBindingEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityElement() {
		return multiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsOrdered() {
		return (EAttribute) multiplicityElementEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Upper() {
		return (EAttribute) multiplicityElementEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Lower() {
		return (EAttribute) multiplicityElementEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsUnique() {
		return (EAttribute) multiplicityElementEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_Type() {
		return (EReference) typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinition() {
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeDefinition_IsAspect() {
		return (EAttribute) typeDefinitionEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestedPackage() {
		return (EReference) packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestingPackage() {
		return (EReference) packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Uri() {
		return (EAttribute) packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Operation() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveType_InstanceType() {
		return (EReference) primitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Name() {
		return (EAttribute) tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Value() {
		return (EAttribute) tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTag_Object() {
		return (EReference) tagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Body() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_PreOwner() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Stereotype() {
		return (EAttribute) constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_PostOwner() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Language() {
		return (EAttribute) constraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_InvOwner() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericTypeDefinition() {
		return genericTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericTypeDefinition_TypeParameter() {
		return (EReference) genericTypeDefinitionEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterizedType() {
		return parameterizedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedType_TypeParamBinding() {
		return (EReference) parameterizedTypeEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedType_TypeDefinition() {
		return (EReference) parameterizedTypeEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedType_VirtualTypeBinding() {
		return (EReference) parameterizedTypeEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeVariable() {
		return typeVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeVariable_Supertype() {
		return (EReference) typeVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTypeVariable() {
		return objectTypeVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelTypeVariable() {
		return modelTypeVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelTypeVariable_VirtualType() {
		return (EReference) modelTypeVariableEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualType() {
		return virtualTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualType_ModelType() {
		return (EReference) virtualTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualType_TypeParamBinding() {
		return (EReference) virtualTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualType_ClassDefinition() {
		return (EReference) virtualTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelingUnit() {
		return modelingUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_Usings() {
		return (EReference) modelingUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_IncludeFilters() {
		return (EReference) modelingUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_Packages() {
		return (EReference) modelingUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_ExcludeFilters() {
		return (EReference) modelingUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_ReferencedModelingUnits() {
		return (EReference) modelingUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_Requires() {
		return (EReference) modelingUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequire() {
		return requireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequire_Uri() {
		return (EAttribute) requireEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsing() {
		return usingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsing_QualifiedName() {
		return (EAttribute) usingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_QualifiedName() {
		return (EAttribute) filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductType() {
		return productTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductType_Type() {
		return (EReference) productTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVoidType() {
		return voidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinitionContainer() {
		return typeDefinitionContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinitionContainer_OwnedTypeDefinition() {
		return (EReference) typeDefinitionContainerEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintType() {
		return constraintTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintLanguage() {
		return constraintLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnlimitedNatural() {
		return unlimitedNaturalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKermetaProperty_Object_oid() {
		return kermetaProperty_Object_oidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureFactory getStructureFactory() {
		return (StructureFactory) getEFactoryInstance();
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
		objectEClass = createEClass(OBJECT);
		createEReference(objectEClass, OBJECT__TAG);
		createEReference(objectEClass, OBJECT__OWNED_TAGS);
		createEAttribute(objectEClass, OBJECT__OID);
		createEReference(objectEClass, OBJECT__INTERNAL_CONTAINING_RESOURCE);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__TYPE_CONTAINER);

		modelTypeEClass = createEClass(MODEL_TYPE);
		createEReference(modelTypeEClass, MODEL_TYPE__INCLUDED_TYPE_DEFINITION);

		classEClass = createEClass(CLASS);

		classDefinitionEClass = createEClass(CLASS_DEFINITION);
		createEReference(classDefinitionEClass,
				CLASS_DEFINITION__OWNED_OPERATION);
		createEAttribute(classDefinitionEClass, CLASS_DEFINITION__IS_ABSTRACT);
		createEReference(classDefinitionEClass, CLASS_DEFINITION__SUPER_TYPE);
		createEReference(classDefinitionEClass, CLASS_DEFINITION__INV);
		createEReference(classDefinitionEClass,
				CLASS_DEFINITION__OWNED_ATTRIBUTE);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__CONTENTS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__OWNED_LITERAL);

		functionTypeEClass = createEClass(FUNCTION_TYPE);
		createEReference(functionTypeEClass, FUNCTION_TYPE__RIGHT);
		createEReference(functionTypeEClass, FUNCTION_TYPE__LEFT);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__TYPE_PARAMETER);
		createEReference(operationEClass, OPERATION__BODY);
		createEReference(operationEClass, OPERATION__PRE);
		createEReference(operationEClass, OPERATION__OWNING_CLASS);
		createEReference(operationEClass, OPERATION__POST);
		createEAttribute(operationEClass, OPERATION__IS_ABSTRACT);
		createEReference(operationEClass, OPERATION__OWNED_PARAMETER);
		createEReference(operationEClass, OPERATION__RAISED_EXCEPTION);
		createEReference(operationEClass, OPERATION__SUPER_OPERATION);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__DEFAULT);
		createEReference(propertyEClass, PROPERTY__OPPOSITE);
		createEAttribute(propertyEClass, PROPERTY__IS_DERIVED);
		createEReference(propertyEClass, PROPERTY__GETTER_BODY);
		createEAttribute(propertyEClass, PROPERTY__IS_READ_ONLY);
		createEReference(propertyEClass, PROPERTY__SETTER_BODY);
		createEAttribute(propertyEClass, PROPERTY__IS_SETTER_ABSTRACT);
		createEAttribute(propertyEClass, PROPERTY__IS_ID);
		createEReference(propertyEClass, PROPERTY__OWNING_CLASS);
		createEAttribute(propertyEClass, PROPERTY__IS_GETTER_ABSTRACT);
		createEAttribute(propertyEClass, PROPERTY__IS_COMPOSITE);

		typeContainerEClass = createEClass(TYPE_CONTAINER);
		createEReference(typeContainerEClass, TYPE_CONTAINER__CONTAINED_TYPE);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEReference(enumerationLiteralEClass,
				ENUMERATION_LITERAL__ENUMERATION);

		typeVariableBindingEClass = createEClass(TYPE_VARIABLE_BINDING);
		createEReference(typeVariableBindingEClass, TYPE_VARIABLE_BINDING__TYPE);
		createEReference(typeVariableBindingEClass,
				TYPE_VARIABLE_BINDING__VARIABLE);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEAttribute(multiplicityElementEClass,
				MULTIPLICITY_ELEMENT__IS_ORDERED);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER);
		createEAttribute(multiplicityElementEClass,
				MULTIPLICITY_ELEMENT__IS_UNIQUE);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		typeDefinitionEClass = createEClass(TYPE_DEFINITION);
		createEAttribute(typeDefinitionEClass, TYPE_DEFINITION__IS_ASPECT);

		dataTypeEClass = createEClass(DATA_TYPE);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__NESTED_PACKAGE);
		createEReference(packageEClass, PACKAGE__NESTING_PACKAGE);
		createEAttribute(packageEClass, PACKAGE__URI);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__OPERATION);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEReference(primitiveTypeEClass, PRIMITIVE_TYPE__INSTANCE_TYPE);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);
		createEAttribute(tagEClass, TAG__VALUE);
		createEReference(tagEClass, TAG__OBJECT);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__BODY);
		createEReference(constraintEClass, CONSTRAINT__PRE_OWNER);
		createEAttribute(constraintEClass, CONSTRAINT__STEREOTYPE);
		createEReference(constraintEClass, CONSTRAINT__POST_OWNER);
		createEAttribute(constraintEClass, CONSTRAINT__LANGUAGE);
		createEReference(constraintEClass, CONSTRAINT__INV_OWNER);

		genericTypeDefinitionEClass = createEClass(GENERIC_TYPE_DEFINITION);
		createEReference(genericTypeDefinitionEClass,
				GENERIC_TYPE_DEFINITION__TYPE_PARAMETER);

		parameterizedTypeEClass = createEClass(PARAMETERIZED_TYPE);
		createEReference(parameterizedTypeEClass,
				PARAMETERIZED_TYPE__TYPE_PARAM_BINDING);
		createEReference(parameterizedTypeEClass,
				PARAMETERIZED_TYPE__TYPE_DEFINITION);
		createEReference(parameterizedTypeEClass,
				PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING);

		typeVariableEClass = createEClass(TYPE_VARIABLE);
		createEReference(typeVariableEClass, TYPE_VARIABLE__SUPERTYPE);

		objectTypeVariableEClass = createEClass(OBJECT_TYPE_VARIABLE);

		modelTypeVariableEClass = createEClass(MODEL_TYPE_VARIABLE);
		createEReference(modelTypeVariableEClass,
				MODEL_TYPE_VARIABLE__VIRTUAL_TYPE);

		virtualTypeEClass = createEClass(VIRTUAL_TYPE);
		createEReference(virtualTypeEClass, VIRTUAL_TYPE__MODEL_TYPE);
		createEReference(virtualTypeEClass, VIRTUAL_TYPE__TYPE_PARAM_BINDING);
		createEReference(virtualTypeEClass, VIRTUAL_TYPE__CLASS_DEFINITION);

		modelingUnitEClass = createEClass(MODELING_UNIT);
		createEReference(modelingUnitEClass, MODELING_UNIT__USINGS);
		createEReference(modelingUnitEClass, MODELING_UNIT__INCLUDE_FILTERS);
		createEReference(modelingUnitEClass, MODELING_UNIT__PACKAGES);
		createEReference(modelingUnitEClass, MODELING_UNIT__EXCLUDE_FILTERS);
		createEReference(modelingUnitEClass,
				MODELING_UNIT__REFERENCED_MODELING_UNITS);
		createEReference(modelingUnitEClass, MODELING_UNIT__REQUIRES);

		requireEClass = createEClass(REQUIRE);
		createEAttribute(requireEClass, REQUIRE__URI);

		usingEClass = createEClass(USING);
		createEAttribute(usingEClass, USING__QUALIFIED_NAME);

		filterEClass = createEClass(FILTER);
		createEAttribute(filterEClass, FILTER__QUALIFIED_NAME);

		productTypeEClass = createEClass(PRODUCT_TYPE);
		createEReference(productTypeEClass, PRODUCT_TYPE__TYPE);

		voidTypeEClass = createEClass(VOID_TYPE);

		typeDefinitionContainerEClass = createEClass(TYPE_DEFINITION_CONTAINER);
		createEReference(typeDefinitionContainerEClass,
				TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION);

		// Create enums
		constraintTypeEEnum = createEEnum(CONSTRAINT_TYPE);
		constraintLanguageEEnum = createEEnum(CONSTRAINT_LANGUAGE);

		// Create data types
		stringEDataType = createEDataType(STRING);
		booleanEDataType = createEDataType(BOOLEAN);
		integerEDataType = createEDataType(INTEGER);
		unlimitedNaturalEDataType = createEDataType(UNLIMITED_NATURAL);
		kermetaProperty_Object_oidEDataType = createEDataType(KERMETA_PROPERTY_OBJECT_OID);
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
		PersistencePackage thePersistencePackage = (PersistencePackage) EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI);
		StandardPackage theStandardPackage = (StandardPackage) EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage) EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		typeEClass.getESuperTypes().add(this.getObject());
		modelTypeEClass.getESuperTypes().add(this.getType());
		modelTypeEClass.getESuperTypes().add(this.getTypeDefinition());
		classEClass.getESuperTypes().add(this.getParameterizedType());
		classDefinitionEClass.getESuperTypes().add(
				this.getGenericTypeDefinition());
		classDefinitionEClass.getESuperTypes().add(this.getTypeContainer());
		modelEClass.getESuperTypes().add(this.getObject());
		namedElementEClass.getESuperTypes().add(this.getObject());
		enumerationEClass.getESuperTypes().add(this.getDataType());
		functionTypeEClass.getESuperTypes().add(this.getTypeContainer());
		functionTypeEClass.getESuperTypes().add(this.getType());
		operationEClass.getESuperTypes().add(this.getMultiplicityElement());
		propertyEClass.getESuperTypes().add(this.getMultiplicityElement());
		typeContainerEClass.getESuperTypes().add(this.getObject());
		enumerationLiteralEClass.getESuperTypes().add(this.getNamedElement());
		typeVariableBindingEClass.getESuperTypes().add(this.getTypeContainer());
		multiplicityElementEClass.getESuperTypes().add(this.getTypedElement());
		typedElementEClass.getESuperTypes().add(this.getTypeContainer());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());
		typeDefinitionEClass.getESuperTypes().add(this.getNamedElement());
		dataTypeEClass.getESuperTypes().add(this.getType());
		dataTypeEClass.getESuperTypes().add(this.getTypeDefinition());
		packageEClass.getESuperTypes().add(this.getNamedElement());
		packageEClass.getESuperTypes().add(this.getTypeDefinitionContainer());
		parameterEClass.getESuperTypes().add(this.getMultiplicityElement());
		primitiveTypeEClass.getESuperTypes().add(this.getDataType());
		primitiveTypeEClass.getESuperTypes().add(this.getTypeContainer());
		tagEClass.getESuperTypes().add(this.getObject());
		constraintEClass.getESuperTypes().add(this.getNamedElement());
		genericTypeDefinitionEClass.getESuperTypes().add(
				this.getTypeDefinition());
		parameterizedTypeEClass.getESuperTypes().add(this.getType());
		typeVariableEClass.getESuperTypes().add(this.getTypeContainer());
		typeVariableEClass.getESuperTypes().add(this.getType());
		typeVariableEClass.getESuperTypes().add(this.getNamedElement());
		objectTypeVariableEClass.getESuperTypes().add(this.getTypeVariable());
		modelTypeVariableEClass.getESuperTypes().add(this.getTypeVariable());
		virtualTypeEClass.getESuperTypes().add(this.getObjectTypeVariable());
		modelingUnitEClass.getESuperTypes().add(this.getObject());
		requireEClass.getESuperTypes().add(this.getObject());
		usingEClass.getESuperTypes().add(this.getObject());
		filterEClass.getESuperTypes().add(this.getObject());
		productTypeEClass.getESuperTypes().add(this.getTypeContainer());
		productTypeEClass.getESuperTypes().add(this.getType());
		voidTypeEClass.getESuperTypes().add(this.getType());
		typeDefinitionContainerEClass.getESuperTypes().add(
				this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(objectEClass, kermeta.language.structure.Object.class,
				"Object", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObject_Tag(), this.getTag(), this.getTag_Object(),
				"tag", null, 0, -1, kermeta.language.structure.Object.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getObject_OwnedTags(), this.getTag(), null, "ownedTags",
				null, 0, -1, kermeta.language.structure.Object.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getObject_Oid(), this.getKermetaProperty_Object_oid(),
				"oid", null, 0, 1, kermeta.language.structure.Object.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_InternalContainingResource(),
				thePersistencePackage.getResource(), null,
				"internalContainingResource", null, 0, 1,
				kermeta.language.structure.Object.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"isVoid", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(objectEClass, theStandardPackage
				.getJavaBoolean(), "isInstanceOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, this.getObject(), "container", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "element", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(objectEClass, this.getClass_(), "getMetaClass", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"isNotEqual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "element", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(objectEClass, this.getObject(), "asType", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getClass_(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaInteger(), "oid",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaString(),
				"toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"isKindOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getClass_(), "cl", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, this.getObject(), "get", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProperty(), "property", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"isSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProperty(), "property", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(objectEClass, null, "set", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getProperty(), "property", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getObject(), "element", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"isFrozen", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaInteger(),
				"hashcode", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, null, "checkInvariants", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(objectEClass, null, "freeze", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, null, "unset", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getProperty(), "property", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(objectEClass, thePersistencePackage.getResource(),
				"containingResource", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, null, "checkAllInvariants", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_TypeContainer(), this.getTypeContainer(), this
				.getTypeContainer_ContainedType(), "typeContainer", null, 0, 1,
				Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(typeEClass, this.getObject(), "clone", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "objectToClone", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(typeEClass, this.getObject(), "deepClone", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "objectToClone", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(typeEClass, theStandardPackage.getJavaBoolean(),
				"isSuperTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getType(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(typeEClass, theStandardPackage.getJavaBoolean(),
				"isInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "element", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(typeEClass, theStandardPackage.getJavaBoolean(),
				"isSubTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getType(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modelTypeEClass, ModelType.class, "ModelType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelType_IncludedTypeDefinition(), this
				.getTypeDefinition(), null, "includedTypeDefinition", null, 0,
				-1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(modelTypeEClass, this.getModel(), "_new", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelTypeEClass,
				theStandardPackage.getJavaBoolean(), "isModelTypeOf", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getModel(), "m", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(classEClass, kermeta.language.structure.Class.class,
				"Class", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		addEOperation(classEClass, this.getObject(), "_new", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(classEClass, theStandardPackage.getJavaBoolean(),
				"equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "other", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(classEClass, this.getObject(), "clone", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "objectToClone", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(classEClass, this.getObject(), "deepClone", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "objectToClone", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(classEClass, theStandardPackage.getJavaString(),
				"toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classEClass, this.getOperation(), "getterOwnedOperation",
				0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(classEClass, this.getClass_(), "getterSuperClass", 0, -1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(classEClass, theStandardPackage.getJavaBoolean(),
				"getterIsAbstract", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classEClass, theStandardPackage.getJavaString(),
				"getterName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classEClass, this.getClassDefinition(),
				"getterClassDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classEClass, this.getProperty(), "getterOwnedAttribute",
				0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(classDefinitionEClass, ClassDefinition.class,
				"ClassDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassDefinition_OwnedOperation(),
				this.getOperation(), this.getOperation_OwningClass(),
				"ownedOperation", null, 0, -1, ClassDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getClassDefinition_IsAbstract(), theStandardPackage
				.getJavaBoolean(), "isAbstract", "false", 0, 1,
				ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getClassDefinition_SuperType(), this.getType(), null,
				"superType", null, 0, -1, ClassDefinition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDefinition_Inv(), this.getConstraint(), this
				.getConstraint_InvOwner(), "inv", null, 0, -1,
				ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDefinition_OwnedAttribute(), this.getProperty(),
				this.getProperty_OwningClass(), "ownedAttribute", null, 0, -1,
				ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(classDefinitionEClass, null, "allSuperTypes", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theStandardPackage.getSet());
		EGenericType g2 = createEGenericType(this.getType());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(classDefinitionEClass, this.getOperation(),
				"getterAllOperation", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(classDefinitionEClass, this.getProperty(),
				"getterAllAttribute", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Contents(), this.getObject(), null, "contents",
				null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(modelEClass, this.getObject(), "addCompatible", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "objectToAdd", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(modelEClass, null, "remove", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getObject(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelEClass, null, "addAllCompatible", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getCollection());
		g2 = createEGenericType(this.getObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "objectsToAdd", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getCollection());
		g2 = createEGenericType(this.getObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(modelEClass, null, "add", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getObject(), "obj", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelEClass, null, "filter", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getType(), "typeName", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getSet());
		g2 = createEGenericType(this.getObject());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theStandardPackage
				.getJavaString(), "name", null, 1, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(namedElementEClass, theStandardPackage.getJavaString(),
				"qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_OwnedLiteral(), this
				.getEnumerationLiteral(), this
				.getEnumerationLiteral_Enumeration(), "ownedLiteral", null, 0,
				-1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(enumerationEClass, this.getObject(), "clone", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "objectToClone", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(functionTypeEClass, FunctionType.class, "FunctionType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionType_Right(), this.getType(), null, "right",
				null, 0, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionType_Left(), this.getType(), null, "left",
				null, 0, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_TypeParameter(), this.getTypeVariable(),
				null, "typeParameter", null, 0, -1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getOperation_Body(), theBehaviorPackage.getExpression(),
				null, "body", null, 0, 1, Operation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Pre(), this.getConstraint(), this
				.getConstraint_PreOwner(), "pre", null, 0, -1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getOperation_OwningClass(), this.getClassDefinition(),
				this.getClassDefinition_OwnedOperation(), "owningClass", null,
				0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Post(), this.getConstraint(), this
				.getConstraint_PostOwner(), "post", null, 0, -1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_IsAbstract(), theStandardPackage
				.getJavaBoolean(), "isAbstract", "false", 0, 1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_OwnedParameter(), this.getParameter(), this
				.getParameter_Operation(), "ownedParameter", null, 0, -1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_RaisedException(), this.getType(), null,
				"raisedException", null, 0, -1, Operation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_SuperOperation(), this.getOperation(),
				null, "superOperation", null, 0, 1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty__default(), theStandardPackage
				.getJavaString(), "_default", null, 0, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Opposite(), this.getProperty(), null,
				"opposite", null, 0, 1, Property.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsDerived(), theStandardPackage
				.getJavaBoolean(), "isDerived", "false", 0, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_GetterBody(), theBehaviorPackage
				.getExpression(), null, "getterBody", null, 0, 1,
				Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsReadOnly(), theStandardPackage
				.getJavaBoolean(), "isReadOnly", "false", 0, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_SetterBody(), theBehaviorPackage
				.getExpression(), null, "setterBody", null, 0, 1,
				Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsSetterAbstract(), theStandardPackage
				.getJavaBoolean(), "isSetterAbstract", "false", 0, 1,
				Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsID(), theStandardPackage.getJavaBoolean(),
				"isID", "false", 0, 1, Property.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_OwningClass(), this.getClassDefinition(),
				this.getClassDefinition_OwnedAttribute(), "owningClass", null,
				0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsGetterAbstract(), theStandardPackage
				.getJavaBoolean(), "isGetterAbstract", "false", 0, 1,
				Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsComposite(), theStandardPackage
				.getJavaBoolean(), "isComposite", "false", 0, 1,
				Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeContainerEClass, TypeContainer.class, "TypeContainer",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeContainer_ContainedType(), this.getType(), this
				.getType_TypeContainer(), "containedType", null, 0, -1,
				TypeContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class,
				"EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationLiteral_Enumeration(), this
				.getEnumeration(), this.getEnumeration_OwnedLiteral(),
				"enumeration", null, 0, 1, EnumerationLiteral.class,
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(typeVariableBindingEClass, TypeVariableBinding.class,
				"TypeVariableBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeVariableBinding_Type(), this.getType(), null,
				"type", null, 1, 1, TypeVariableBinding.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeVariableBinding_Variable(), this
				.getTypeVariable(), null, "variable", null, 1, 1,
				TypeVariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityElementEClass, MultiplicityElement.class,
				"MultiplicityElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityElement_IsOrdered(), theStandardPackage
				.getJavaBoolean(), "isOrdered", "false", 0, 1,
				MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMultiplicityElement_Upper(), theStandardPackage
				.getJavaInteger(), "upper", null, 0, 1,
				MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMultiplicityElement_Lower(), theStandardPackage
				.getJavaInteger(), "lower", null, 0, 1,
				MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMultiplicityElement_IsUnique(), theStandardPackage
				.getJavaBoolean(), "isUnique", "true", 0, 1,
				MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getType(), null, "type",
				null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionEClass, TypeDefinition.class,
				"TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDefinition_IsAspect(), theStandardPackage
				.getJavaBoolean(), "isAspect", "false", 0, 1,
				TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageEClass, kermeta.language.structure.Package.class,
				"Package", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_NestedPackage(), this.getPackage(), this
				.getPackage_NestingPackage(), "nestedPackage", null, 0, -1,
				kermeta.language.structure.Package.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_NestingPackage(), this.getPackage(), this
				.getPackage_NestedPackage(), "nestingPackage", null, 0, 1,
				kermeta.language.structure.Package.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Uri(), theStandardPackage.getJavaString(),
				"uri", null, 0, 1, kermeta.language.structure.Package.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Operation(), this.getOperation(), this
				.getOperation_OwnedParameter(), "operation", null, 0, 1,
				Parameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveType_InstanceType(), this.getType(), null,
				"instanceType", null, 0, 1, PrimitiveType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Name(), theStandardPackage.getJavaString(),
				"name", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTag_Value(), theStandardPackage.getJavaString(),
				"value", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTag_Object(), this.getObject(), this.getObject_Tag(),
				"object", null, 1, -1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Body(),
				theBehaviorPackage.getExpression(), null, "body", null, 1, 1,
				Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraint_PreOwner(), this.getOperation(), this
				.getOperation_Pre(), "preOwner", null, 0, 1, Constraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getConstraint_Stereotype(), this.getConstraintType(),
				"stereotype", null, 0, 1, Constraint.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_PostOwner(), this.getOperation(), this
				.getOperation_Post(), "postOwner", null, 0, 1,
				Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_Language(), this.getConstraintLanguage(),
				"language", null, 0, 1, Constraint.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_InvOwner(), this.getClassDefinition(),
				this.getClassDefinition_Inv(), "invOwner", null, 0, 1,
				Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(genericTypeDefinitionEClass, GenericTypeDefinition.class,
				"GenericTypeDefinition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericTypeDefinition_TypeParameter(), this
				.getTypeVariable(), null, "typeParameter", null, 0, -1,
				GenericTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterizedTypeEClass, ParameterizedType.class,
				"ParameterizedType", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterizedType_TypeParamBinding(), this
				.getTypeVariableBinding(), null, "typeParamBinding", null, 0,
				-1, ParameterizedType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterizedType_TypeDefinition(), this
				.getGenericTypeDefinition(), null, "typeDefinition", null, 1,
				1, ParameterizedType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterizedType_VirtualTypeBinding(), this
				.getTypeVariableBinding(), null, "virtualTypeBinding", null, 0,
				-1, ParameterizedType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeVariableEClass, TypeVariable.class, "TypeVariable",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeVariable_Supertype(), this.getType(), null,
				"supertype", null, 0, 1, TypeVariable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectTypeVariableEClass, ObjectTypeVariable.class,
				"ObjectTypeVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelTypeVariableEClass, ModelTypeVariable.class,
				"ModelTypeVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelTypeVariable_VirtualType(), this
				.getVirtualType(), this.getVirtualType_ModelType(),
				"virtualType", null, 0, -1, ModelTypeVariable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(virtualTypeEClass, VirtualType.class, "VirtualType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualType_ModelType(), this.getModelTypeVariable(),
				this.getModelTypeVariable_VirtualType(), "modelType", null, 1,
				1, VirtualType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualType_TypeParamBinding(), this
				.getTypeVariableBinding(), null, "typeParamBinding", null, 0,
				-1, VirtualType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualType_ClassDefinition(), this
				.getClassDefinition(), null, "classDefinition", null, 1, 1,
				VirtualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(modelingUnitEClass, ModelingUnit.class, "ModelingUnit",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelingUnit_Usings(), this.getUsing(), null,
				"usings", null, 0, -1, ModelingUnit.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingUnit_IncludeFilters(), this.getFilter(),
				null, "includeFilters", null, 0, -1, ModelingUnit.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getModelingUnit_Packages(), this.getPackage(), null,
				"packages", null, 0, -1, ModelingUnit.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingUnit_ExcludeFilters(), this.getFilter(),
				null, "excludeFilters", null, 0, -1, ModelingUnit.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getModelingUnit_ReferencedModelingUnits(), this
				.getModelingUnit(), null, "referencedModelingUnits", null, 0,
				-1, ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingUnit_Requires(), this.getRequire(), null,
				"requires", null, 0, -1, ModelingUnit.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requireEClass, Require.class, "Require", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequire_Uri(), theStandardPackage.getJavaString(),
				"uri", null, 0, 1, Require.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(usingEClass, Using.class, "Using", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsing_QualifiedName(), theStandardPackage
				.getJavaString(), "qualifiedName", null, 0, 1, Using.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilter_QualifiedName(), theStandardPackage
				.getJavaString(), "qualifiedName", null, 0, 1, Filter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productTypeEClass, ProductType.class, "ProductType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductType_Type(), this.getType(), null, "type",
				null, 0, -1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voidTypeEClass, VoidType.class, "VoidType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeDefinitionContainerEClass,
				TypeDefinitionContainer.class, "TypeDefinitionContainer",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDefinitionContainer_OwnedTypeDefinition(), this
				.getTypeDefinition(), null, "ownedTypeDefinition", null, 0, -1,
				TypeDefinitionContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(constraintTypeEEnum, ConstraintType.class, "ConstraintType");
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.INV);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.PRE);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.POST);

		initEEnum(constraintLanguageEEnum, ConstraintLanguage.class,
				"ConstraintLanguage");
		addEEnumLiteral(constraintLanguageEEnum, ConstraintLanguage.KERMETA);
		addEEnumLiteral(constraintLanguageEEnum, ConstraintLanguage.OCL);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, Boolean.class, "Boolean",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, Integer.class, "Integer",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unlimitedNaturalEDataType, Integer.class,
				"UnlimitedNatural", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kermetaProperty_Object_oidEDataType, Integer.class,
				"KermetaProperty_Object_oid", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

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
		addAnnotation(
				this,
				source,
				new String[] { "ecoreUri",
						"http://www.kermeta.org/kermeta/1_2_0//kermeta/language/structure" });
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"/**\n * Contains the concrete implementation (including the operation bodies) \n * of the classes of the <code>kermeta::reflection</code> package.\n * If you need more documentation, please take a look at the\n * <code>kermeta::reflection</code> package which is more complete.\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/language_structure_package.png\"/>\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/language_structure_visitor_view.png\"/>\n */" });
		addAnnotation(this, source, new String[] { "ecore", "true" });
		addAnnotation(objectEClass, source, new String[] { "EMF_needProperty",
				"name=oid javaClass=java.lang.Integer" });
		addAnnotation(
				objectEClass,
				source,
				new String[] {
						"EMF_needProperty",
						"name=internalContainingResource classDefinitionQN=kermeta::persistence::Resource" });
		addAnnotation(objectEClass, source, new String[] { "ecore", "true" });
		addAnnotation(
				objectEClass,
				source,
				new String[] {
						"documentation",
						"Object definition: all entities of Kermeta metamodel explicitly inherit from Object" });
		addAnnotation(
				objectEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/**\n\t * Returns a Boolean stating whether the Object is Void\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(0), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(objectEClass.getEOperations().get(1), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a Boolean stating whether the current Object conforms to given Type\n\t * This means: is this object an instance of this type, or is it an instance of its subtype \n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns the Object that contains current Object, void if the Object has\n\t * no container\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(2),
				source,
				new String[] {
						"WrapperValueTypeReturnType",
						"java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object" });
		addAnnotation(objectEClass.getEOperations().get(2), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(objectEClass.getEOperations().get(3), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n\t * semantic equality,\n\t * if you wish to test for object identity you need to use the method oid\n\t * ex: x.oid == y.oid\n\t * by default, (ie. if not overloaded), the equals method for class Object implements \n\t * the most discriminating possible equivalence relation on objects; that is, for any non-null \n\t * reference values x and y, this method returns true if and only if x and y refer to the same \n\t * object (x.oid == y.oid has the value true). \n\t *\n\t * note1: the operator == is mapped to this \n\t * note2: overloading this operation have some impact on the behavior on collection and hashtable that rely on it\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns the Class object that is the metaclass of current Object\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(4), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(objectEClass.getEOperations().get(5), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(5),
				source,
				new String[] { "documentation",
						"/**\n\t * See kermeta::language::structure::Object.equals(Object)\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(6),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Implementation of OCL like cast. It returns self if the object object conforms to the type given as parameter.\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(6),
				source,
				new String[] {
						"WrapperValueTypeReturnType",
						"java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object" });
		addAnnotation(
				objectEClass.getEOperations().get(6),
				source,
				new String[] {
						"WrapperValueTypeSelfExpression",
						"java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object" });
		addAnnotation(objectEClass.getEOperations().get(6), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(objectEClass.getEOperations().get(7), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(7),
				source,
				new String[] { "documentation",
						"/**\n\t * Returns the unique Oid of the Object\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(8), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(8),
				source,
				new String[] {
						"documentation",
						"/**\n \t * Implements Object.toString()\n \t * Returns a String of form [qn:oid] where \'qn\' is the qualified name of\n \t * the object type, and oid the unique ID of the object\n \t */" });
		addAnnotation(
				objectEClass.getEOperations().get(9),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a Boolean stating whether the current Object is an instance of the given Class\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(9), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(10),
				source,
				new String[] {
						"WrapperValueTypeReturnType",
						"java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object" });
		addAnnotation(objectEClass.getEOperations().get(10), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(10),
				source,
				new String[] {
						"documentation",
						"/** \n\t * Returns the instances of the given property for this Object.\n\t *\n\t * Example : \n\t * <pre>\n\t * class A { reference attr : String }\n\t * </pre>\n\t * Using A :\n\t * <pre>\n\t * operation getAProp() is do\n\t *    var a : A\n\t *    var s : String\n\t *    var the_attr : Property init self.getMetaClass.ownedAttribute.one\n\t *    s ?= a.get(the_attr)\n\t * end\n\t * </pre>\n\t * The user has to cast\n\t * the result of this method according to the type and the upper multiplicity\n\t * of this property. If upper multiplicity > 1, than the effective type of the \n\t * result is a Sequence<ThePropertyName>. Otherwise, the type corresponds to \n\t * the name of the given Property (i.e the type of the property instance).\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(11),
				source,
				new String[] {
						"documentation",
						"/**\n\t * True if the <code>~property</code> of the object has been set\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(11), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(objectEClass.getEOperations().get(12), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(12),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Sets the <code>element</code> to the <code>~property</code> of the object \n\t */" });
		addAnnotation(objectEClass.getEOperations().get(13), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(13),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a Boolean stating whether the Object is currently in a\n\t * frozen state\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(14), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(14),
				source,
				new String[] {
						"documentation",
						"/**\n\t * code used in hashtable in order to identify an object in the hashtable keys\n\t * This system is similar to the hashcode used in java. Please refer to java documentation\n\t * for more information about hashcode\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(15),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Runs checking of invariants defined for the metaclass of the Object\n\t * Also check the multiplicity of attributes (except derived and transient attributes)\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(15), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(objectEClass.getEOperations().get(16), source,
				new String[] { "documentation",
						"/**\n\t * Freeze the Object\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(16), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(objectEClass.getEOperations().get(17), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(17),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Remove the element set as the <code>~property</code> of the object.\n\t * The <code>isSet(~property)</code> method will then return False\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(18), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(18),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns the Resource currently containing (directly or indirectly) the Object \n\t * or void if the object belongs to no Resource\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(19), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(19),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Recursively runs checking of invariants defined for the metaclass of the Object\n\t * and its supertypes\n\t * Ignores derived attributes. \n\t */" });
		addAnnotation(getObject_Tag(), source, new String[] { "ecore", "true" });
		addAnnotation(
				getObject_Tag(),
				source,
				new String[] {
						"documentation",
						"An Object can be tagged by a Tag. \nThey are typically used to put comments/documentation on the object" });
		addAnnotation(getObject_OwnedTags(), source, new String[] { "ecore",
				"true" });
		addAnnotation(
				getObject_OwnedTags(),
				source,
				new String[] {
						"documentation",
						"An object can contains a Tag.  \nBe careful, owning a tag doesn\'t means that the tag applies to the Object\nTo know which Tags apply to the object use the \"tag\" reference" });
		addAnnotation(typeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(typeEClass, source, new String[] { "documentation",
				"Alias to kermeta::standard::Integer" });
		addAnnotation(typeEClass, source, new String[] { "documentation",
				"Base class definition for the <b>use</b> of a type." });
		addAnnotation(typeEClass.getEOperations().get(0), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(
				typeEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a copy of passed Object built by recursively copying attribute\n\t * properties, and referencing original reference properties values\n\t */" });
		addAnnotation(typeEClass.getEOperations().get(1), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(
				typeEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a copy of passed Object built by recursively copying values of\n\t * all properties, no matter the property kind\n\t */" });
		addAnnotation(
				typeEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n \t * Implements Type.isSuperTypeOf(Type)\n \t * For technical reason, the current implementation works only with Type that comes from a kermeta declaration (ie. in a require)\n \t * it won\'t work with Type created programmaticaly by the user. If you need that, please ask to the kermeta developpers\n \t * to extend it.\n \t */" });
		addAnnotation(typeEClass.getEOperations().get(2), source, new String[] {
				"RecopyInValueTypes", "true" });
		addAnnotation(typeEClass.getEOperations().get(3), source, new String[] {
				"RecopyInValueTypes", "true" });
		addAnnotation(typeEClass.getEOperations().get(3), source, new String[] {
				"documentation",
				"/**\n\t * Implements Type.isInstance(Object)\n\t */" });
		addAnnotation(typeEClass.getEOperations().get(4), source, new String[] {
				"RecopyInValueTypes", "true" });
		addAnnotation(
				typeEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\n \t * Implements Type.isSubTypeOf(Type)\n \t * For technical reason, the current implementation works only with Type that comes from a kermeta declaration (ie. in a require)\n \t * it won\'t work with Type created programmaticaly by the user. If you need that, please ask to the kermeta developpers\n \t * to extend it.\n \t */" });
		addAnnotation(getType_TypeContainer(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getType_TypeContainer(), source, new String[] {
				"documentation", "Owning TypeContainer, if any" });
		addAnnotation(modelTypeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(
				modelTypeEClass,
				source,
				new String[] { "documentation",
						"Type of a model, consisting of a set of included type definitions" });
		addAnnotation(
				modelTypeEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/**\n\t * To be written ##########################################\n\t */" });
		addAnnotation(
				modelTypeEClass.getEOperations().get(1),
				source,
				new String[] { "documentation",
						"/**\n\t * To be written ##########################################\n\t */" });
		addAnnotation(getModelType_IncludedTypeDefinition(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getModelType_IncludedTypeDefinition(), source,
				new String[] { "documentation", "To be written" });
		addAnnotation(classEClass, source, new String[] { "ecore", "true" });
		addAnnotation(
				classEClass,
				source,
				new String[] {
						"documentation",
						"Returns the Attributes, References, and derived Properties owned by\nthe ClassDefinition of this Class." });
		addAnnotation(
				classEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/**\n\t * Instantiates a new occurence for this Class\n\t */" });
		addAnnotation(classEClass.getEOperations().get(1), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(classEClass.getEOperations().get(2), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Type" });
		addAnnotation(classEClass.getEOperations().get(3), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Type" });
		addAnnotation(
				classEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns the String representation of this class. \n\t *  Note : throws an exception if this class has no classDefinition\n\t *  or if the classDefinition is not well constructed.\n\t */" });
		addAnnotation(classEClass.getEOperations().get(4), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(classDefinitionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				classDefinitionEClass,
				source,
				new String[] {
						"documentation",
						"The definition of a class definition :)\n <pre>class A\n{ \n  attribute s : String\n}\n  </pre> is a class definition; in :\n<pre>\nmain() : A is do end\n</pre>\nA is a <b>Class</b> : it corresponds to the <b>use</b> of the class definition of A" });
		addAnnotation(
				classDefinitionEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns all the types directly and indirectly inherited by this ClasDefinition \n\t */" });
		addAnnotation(getClassDefinition_OwnedOperation(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getClassDefinition_OwnedOperation(), source,
				new String[] { "documentation",
						"Operations owned by this ClassDefinition." });
		addAnnotation(getClassDefinition_IsAbstract(), source, new String[] {
				"ecore", "true" });
		addAnnotation(
				getClassDefinition_IsAbstract(),
				source,
				new String[] {
						"documentation",
						"Boolean stating whether the ClassDefinition is abstract (which means that\nno instance can be allocated)" });
		addAnnotation(getClassDefinition_SuperType(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getClassDefinition_SuperType(), source, new String[] {
				"documentation",
				"Classes from which this ClassDefinition inherits." });
		addAnnotation(getClassDefinition_Inv(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getClassDefinition_Inv(), source,
				new String[] { "documentation",
						"Invariants defined for this ClassDefinition" });
		addAnnotation(getClassDefinition_OwnedAttribute(), source,
				new String[] { "ecore", "true" });
		addAnnotation(
				getClassDefinition_OwnedAttribute(),
				source,
				new String[] { "documentation",
						"Attributes, References, and derived Properties owned by this ClassDefinition." });
		addAnnotation(modelEClass, source, new String[] { "ecore", "true" });
		addAnnotation(
				modelEClass,
				source,
				new String[] {
						"documentation",
						"Is the holder of a set of model elements (Object) that are compatible with the ModelType that has \ninstantiated this Model." });
		addAnnotation(
				modelEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n \t * Add the Object if it is copmpatible with the ModelDefinition. Other objects are ignored.\n \t * Returns the object if it has been added (One can check that some element have been ignored or not)\n \t * return Void if not added\n \t */" });
		addAnnotation(modelEClass.getEOperations().get(1), source,
				new String[] { "documentation",
						"/**\n \t * Remove an object from the model\n \t */" });
		addAnnotation(
				modelEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n \t * Add all the Object of the collection that are copmpatible with the ModelDefinition. Other objects are ignored.\n \t * Returns the list of Object that have been added (One can check that some element have been ignored or not)\n \t */" });
		addAnnotation(
				modelEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n \t * Add an object to the model. According to the ModelType, the typechecker will statically verify if the object can be added or not\n \t */" });
		addAnnotation(
				modelEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\n \t * Returns a set of all the elements of the model that are instance of the given Type\n \t */" });
		addAnnotation(getModel_Contents(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getModel_Contents(), source, new String[] {
				"documentation", "Contents of this model..." });
		addAnnotation(namedElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				namedElementEClass,
				source,
				new String[] {
						"documentation",
						"Any element that contain a  name (example : Operation, Property) inherit this\nclass." });
		addAnnotation(
				namedElementEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns the qualified name of this named element. Qualified name is \n\t * the list of the names of the packages hierarchically ordered, delimited by\n\t * a \"::\", followed by the name of this named element.\n\t */" });
		addAnnotation(getNamedElement_Name(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getNamedElement_Name(), source, new String[] {
				"documentation", "Name of this named element" });
		addAnnotation(enumerationEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(enumerationEClass, source, new String[] {
				"documentation", "Definition for Enumeration" });
		addAnnotation(
				enumerationEClass.getEOperations().get(0),
				source,
				new String[] { "documentation",
						"/**\n\t * Implements kermeta::language::structure::Type.clone(Object)\n\t */" });
		addAnnotation(enumerationEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Type" });
		addAnnotation(getEnumeration_OwnedLiteral(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEnumeration_OwnedLiteral(), source, new String[] {
				"documentation", "Owned items in an Enumeration" });
		addAnnotation(functionTypeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				functionTypeEClass,
				source,
				new String[] {
						"documentation",
						"Type used to define the use of lambda expressions.\n Uses :\n <pre>operation forAll(func : <G -> Boolean>) : Boolean is do\n     var test : Boolean init true\n     from var it : Iterator<G> init iterator\n     until it.isOff\n     loop\n        test := test and func(it.next)\n     end\n     result := test\n end\n </pre>\n *\n In the above example, &lt;G -> Boolean&gt; is a function type f(G) -&gt; \n Boolean, with a parameter of type G and a return type of type Boolean\n The operation <code>forAll</code> takes a lambda expression as parameter." });
		addAnnotation(getFunctionType_Right(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getFunctionType_Right(), source, new String[] {
				"documentation", "Result type of the function" });
		addAnnotation(getFunctionType_Left(), source, new String[] { "ecore",
				"true" });
		addAnnotation(
				getFunctionType_Left(),
				source,
				new String[] { "documentation",
						"Parameters of the function (a ProductType for multiple parameters)" });
		addAnnotation(stringEDataType, source, new String[] { "alias",
				"kermeta::standard::String" });
		addAnnotation(stringEDataType, source, new String[] { "ecore", "true" });
		addAnnotation(booleanEDataType, source, new String[] { "alias",
				"kermeta::standard::Boolean" });
		addAnnotation(booleanEDataType, source,
				new String[] { "ecore", "true" });
		addAnnotation(operationEClass, source, new String[] { "ecore", "true" });
		addAnnotation(operationEClass, source, new String[] { "documentation",
				"Every one knows what an operation is." });
		addAnnotation(getOperation_TypeParameter(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_TypeParameter(), source, new String[] {
				"documentation", "TypeParameters of the Operation" });
		addAnnotation(getOperation_Body(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getOperation_Body(), source, new String[] {
				"documentation",
				"Body of the Operation, expressed as a KerMeta expression" });
		addAnnotation(getOperation_Pre(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getOperation_Pre(), source, new String[] {
				"documentation", "Pre-conditions of the Operation" });
		addAnnotation(getOperation_OwningClass(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_OwningClass(), source, new String[] {
				"documentation", "ClassDefinition owning the Operation" });
		addAnnotation(getOperation_Post(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getOperation_Post(), source, new String[] {
				"documentation", "Post-conditions of the Operation" });
		addAnnotation(getOperation_IsAbstract(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_IsAbstract(), source, new String[] {
				"documentation",
				"Boolean stating whether the Operation is abstract" });
		addAnnotation(getOperation_OwnedParameter(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_OwnedParameter(), source, new String[] {
				"documentation", "Parameters of the Operation" });
		addAnnotation(getOperation_RaisedException(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_RaisedException(), source, new String[] {
				"documentation", "Exceptions raised by the Operation" });
		addAnnotation(getOperation_SuperOperation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_SuperOperation(), source, new String[] {
				"documentation", "Super-operation of the Operation, if any" });
		addAnnotation(propertyEClass, source, new String[] { "ecore", "true" });
		addAnnotation(
				propertyEClass,
				source,
				new String[] {
						"documentation",
						"Class representing the property definition. Kermeta<->Ecore equivalence:\n - Property with isComposite == true or with type is a base type (String, Integer, Boolean)  : EAttribute\n - Property with isComposite == false : EReference" });
		addAnnotation(getProperty__default(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getProperty__default(), source, new String[] {
				"documentation", "To be written" });
		addAnnotation(getProperty_Opposite(), source, new String[] { "ecore",
				"true" });
		addAnnotation(
				getProperty_Opposite(),
				source,
				new String[] { "documentation",
						"Opposite Property of the Property, void if the Property has no opposite" });
		addAnnotation(getProperty_IsDerived(), source, new String[] { "ecore",
				"true" });
		addAnnotation(
				getProperty_IsDerived(),
				source,
				new String[] {
						"documentation",
						"If True, the value of the property is not stored but computed from other properties" });
		addAnnotation(getProperty_GetterBody(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getProperty_GetterBody(), source, new String[] {
				"documentation", "To be written" });
		addAnnotation(getProperty_IsReadOnly(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getProperty_IsReadOnly(), source, new String[] {
				"documentation",
				"Boolean stating whether the Property is read-only" });
		addAnnotation(getProperty_SetterBody(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getProperty_SetterBody(), source, new String[] {
				"documentation", "To be written" });
		addAnnotation(getProperty_IsSetterAbstract(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getProperty_IsSetterAbstract(), source, new String[] {
				"documentation",
				"Boolean stating wether the setter is abstract." });
		addAnnotation(getProperty_IsID(), source, new String[] { "ecore",
				"true" });
		addAnnotation(
				getProperty_IsID(),
				source,
				new String[] { "documentation",
						"Boolean stating whether the property allows to identify its containing Object" });
		addAnnotation(getProperty_OwningClass(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getProperty_OwningClass(), source, new String[] {
				"documentation", "ClassDefinition that owns the Property" });
		addAnnotation(getProperty_IsGetterAbstract(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getProperty_IsGetterAbstract(), source, new String[] {
				"documentation",
				"Boolean stating wether the getter is abstract." });
		addAnnotation(getProperty_IsComposite(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getProperty_IsComposite(), source, new String[] {
				"documentation",
				"Boolean stating whether the Property has a containment role" });
		addAnnotation(typeContainerEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				typeContainerEClass,
				source,
				new String[] {
						"documentation",
						"Phantom class : EMF reflexive editors need that any element of a metamodel \nhas a direct or indirect containment relationship with the root model element of\nthe metamodel. This class resolves this technical requirement." });
		addAnnotation(getTypeContainer_ContainedType(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getTypeContainer_ContainedType(), source, new String[] {
				"documentation", "Contained types" });
		addAnnotation(enumerationLiteralEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(enumerationLiteralEClass, source, new String[] {
				"documentation", "Item definition for enumeration" });
		addAnnotation(getEnumerationLiteral_Enumeration(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getEnumerationLiteral_Enumeration(), source,
				new String[] { "ecore.isTransient", "true" });
		addAnnotation(getEnumerationLiteral_Enumeration(), source,
				new String[] { "documentation", "Owning Enumeration" });
		addAnnotation(typeVariableBindingEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(typeVariableBindingEClass, source, new String[] {
				"documentation",
				"Definition of a binding between a TypeVariable and a Type" });
		addAnnotation(getTypeVariableBinding_Type(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getTypeVariableBinding_Type(), source, new String[] {
				"documentation", "Assigned Type" });
		addAnnotation(getTypeVariableBinding_Variable(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getTypeVariableBinding_Variable(), source, new String[] {
				"documentation", "TypeVariable" });
		addAnnotation(integerEDataType, source, new String[] { "alias",
				"kermeta::standard::Integer" });
		addAnnotation(integerEDataType, source,
				new String[] { "ecore", "true" });
		addAnnotation(multiplicityElementEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(
				multiplicityElementEClass,
				source,
				new String[] { "documentation",
						" Model elements with a multiplicity [lower..upper] inherit this class" });
		addAnnotation(getMultiplicityElement_IsOrdered(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getMultiplicityElement_IsOrdered(), source, new String[] {
				"documentation",
				"Boolean stating whether the element is ordered" });
		addAnnotation(getMultiplicityElement_Upper(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getMultiplicityElement_Upper(), source, new String[] {
				"documentation",
				"Max cardinality of the element, \'-1\' for \'*\'" });
		addAnnotation(getMultiplicityElement_Lower(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getMultiplicityElement_Lower(), source, new String[] {
				"documentation", "Min cardinality of the element" });
		addAnnotation(getMultiplicityElement_IsUnique(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getMultiplicityElement_IsUnique(), source, new String[] {
				"documentation",
				"Boolean stating whether duplicated elements are allowed" });
		addAnnotation(unlimitedNaturalEDataType, source, new String[] {
				"alias", "kermeta::standard::Integer" });
		addAnnotation(unlimitedNaturalEDataType, source, new String[] {
				"ecore", "true" });
		addAnnotation(typedElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				typedElementEClass,
				source,
				new String[] {
						"documentation",
						"Abstraction of the notion of typed element : each element \nthat is typed inherits this class." });
		addAnnotation(getTypedElement_Type(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getTypedElement_Type(), source, new String[] {
				"documentation", "Type of the model element" });
		addAnnotation(typeDefinitionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				typeDefinitionEClass,
				source,
				new String[] {
						"documentation",
						"This boolean allows to tell if this Type definition is an aspect or not\nIf it is an aspect, then at runtime, its definition will be merged with the definition of another\nTypeDefinition that has exactly the same qualified name" });
		addAnnotation(
				typeDefinitionEClass,
				source,
				new String[] {
						"documentation",
						"Abstraction for type definitions (ClassDefinition, ModelTypeDefinition, DataType inherit\nthis class)" });
		addAnnotation(getTypeDefinition_IsAspect(), source, new String[] {
				"ecore", "true" });
		addAnnotation(dataTypeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(dataTypeEClass, source, new String[] { "documentation",
				"Special type definition for Enumeration, PrimitiveType" });
		addAnnotation(packageEClass, source, new String[] { "ecore", "true" });
		addAnnotation(
				packageEClass,
				source,
				new String[] { "documentation",
						"Package in kermeta. Each kermeta model must have a root package. " });
		addAnnotation(getPackage_NestedPackage(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getPackage_NestedPackage(), source, new String[] {
				"documentation", "Nested Packages contained by the Package" });
		addAnnotation(getPackage_NestingPackage(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getPackage_NestingPackage(), source, new String[] {
				"ecore.isTransient", "true" });
		addAnnotation(getPackage_NestingPackage(), source, new String[] {
				"documentation", "Owning Package, if any" });
		addAnnotation(getPackage_Uri(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getPackage_Uri(), source, new String[] { "documentation",
				"Uri of the Package" });
		addAnnotation(parameterEClass, source, new String[] { "ecore", "true" });
		addAnnotation(parameterEClass, source, new String[] { "documentation",
				"Definition for operation parameter" });
		addAnnotation(getParameter_Operation(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getParameter_Operation(), source, new String[] {
				"ecore.isTransient", "true" });
		addAnnotation(getParameter_Operation(), source, new String[] {
				"documentation", "Owning operation" });
		addAnnotation(primitiveTypeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				primitiveTypeEClass,
				source,
				new String[] {
						"documentation",
						"The class definition for kermeta aliases. Above statement defines a primitive\r\ntype called MyString, which instanceType is <code>kermeta::standard::String</code>\r\n<pre>alias MyString : kermeta::standard::String</pre>. Another example could be: <code>root::apackage::AClass</code>\r\n<pre>alias MyClass : root::apackage::AClass</pre>, thus a primitive type may be not a subtype of ValueType (ValueType is a concept from the Kermeta framework)." });
		addAnnotation(getPrimitiveType_InstanceType(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getPrimitiveType_InstanceType(), source, new String[] {
				"documentation", "The type the primitive type is linked with" });
		addAnnotation(tagEClass, source, new String[] { "ecore", "true" });
		addAnnotation(
				tagEClass,
				source,
				new String[] {
						"documentation",
						"Tag is intended to be used to add documentation on a  model element,\nor add some textual information that cannot be expressed with any\nmodel element definition." });
		addAnnotation(getTag_Name(), source, new String[] { "ecore", "true" });
		addAnnotation(getTag_Name(), source, new String[] { "documentation",
				"Name of the Tag" });
		addAnnotation(getTag_Value(), source, new String[] { "ecore", "true" });
		addAnnotation(getTag_Value(), source, new String[] { "documentation",
				"String value of the Tag" });
		addAnnotation(getTag_Object(), source, new String[] { "ecore", "true" });
		addAnnotation(getTag_Object(), source, new String[] { "documentation",
				"Objects to which the Tag is attached to" });
		addAnnotation(constraintEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(
				constraintEClass,
				source,
				new String[] {
						"documentation",
						"Constraint is part of a contract implementation in a Class definition or an operation.\nThree kinds of constraints are available : pre, post, and inv (invariant constraint)" });
		addAnnotation(getConstraint_Body(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getConstraint_Body(), source, new String[] {
				"documentation",
				"Body of the constraint, expressed as a KerMeta expression" });
		addAnnotation(getConstraint_PreOwner(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getConstraint_PreOwner(), source, new String[] {
				"documentation",
				"Owning Operation if Constraint corresponds to pre-condition" });
		addAnnotation(getConstraint_Stereotype(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getConstraint_Stereotype(), source, new String[] {
				"documentation",
				"Type of the Constraint (precond/postcond/inv)" });
		addAnnotation(getConstraint_PostOwner(), source, new String[] {
				"ecore", "true" });
		addAnnotation(
				getConstraint_PostOwner(),
				source,
				new String[] { "documentation",
						"Owning Operation if Constraint corresponds to post-condition" });
		addAnnotation(getConstraint_Language(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getConstraint_Language(), source, new String[] {
				"documentation",
				"Language in which the constraint is expressed" });
		addAnnotation(getConstraint_InvOwner(), source, new String[] { "ecore",
				"true" });
		addAnnotation(
				getConstraint_InvOwner(),
				source,
				new String[] { "documentation",
						"Owning ClassDefinition if Constraint corresponds to invariant" });
		addAnnotation(constraintTypeEEnum, source, new String[] { "ecore",
				"true" });
		addAnnotation(constraintLanguageEEnum, source, new String[] { "ecore",
				"true" });
		addAnnotation(genericTypeDefinitionEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(
				genericTypeDefinitionEClass,
				source,
				new String[] {
						"documentation",
						"Abstracts the definition of generic type definitions (i.e. type definitions that\ncan be parameterized), namely, for ClassDefinition and ModelTypeDefinition." });
		addAnnotation(getGenericTypeDefinition_TypeParameter(), source,
				new String[] { "ecore", "true" });
		addAnnotation(
				getGenericTypeDefinition_TypeParameter(),
				source,
				new String[] { "documentation",
						"Type variables defined for the GenericTypeDefinition" });
		addAnnotation(parameterizedTypeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				parameterizedTypeEClass,
				source,
				new String[] { "documentation",
						"Abstraction for Parameterized types, namely, Class and ModelType" });
		addAnnotation(getParameterizedType_TypeParamBinding(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getParameterizedType_TypeParamBinding(), source,
				new String[] { "documentation",
						"Bindings between type variables and provided types " });
		addAnnotation(getParameterizedType_TypeDefinition(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getParameterizedType_TypeDefinition(), source,
				new String[] { "documentation", "Definition of the Type" });
		addAnnotation(getParameterizedType_VirtualTypeBinding(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getParameterizedType_VirtualTypeBinding(), source,
				new String[] { "documentation", "To be written" });
		addAnnotation(typeVariableEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				typeVariableEClass,
				source,
				new String[] {
						"documentation",
						"Definition of a type variable for generic types :  \nin class definition <pre>class AClass<X,Y> {}</pre>, X and Y are type variables." });
		addAnnotation(getTypeVariable_Supertype(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getTypeVariable_Supertype(), source, new String[] {
				"documentation", "Reference to the supertype, if any" });
		addAnnotation(objectTypeVariableEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(objectTypeVariableEClass, source, new String[] {
				"documentation", "To be written" });
		addAnnotation(modelTypeVariableEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(modelTypeVariableEClass, source, new String[] {
				"documentation", "To be written" });
		addAnnotation(getModelTypeVariable_VirtualType(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getModelTypeVariable_VirtualType(), source, new String[] {
				"documentation", "To be written" });
		addAnnotation(virtualTypeEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(virtualTypeEClass, source, new String[] {
				"documentation", "To be written" });
		addAnnotation(getVirtualType_ModelType(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getVirtualType_ModelType(), source, new String[] {
				"documentation", "To be written" });
		addAnnotation(getVirtualType_TypeParamBinding(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getVirtualType_TypeParamBinding(), source, new String[] {
				"documentation", "To be written" });
		addAnnotation(getVirtualType_ClassDefinition(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getVirtualType_ClassDefinition(), source, new String[] {
				"documentation", "To be written" });
		addAnnotation(modelingUnitEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				modelingUnitEClass,
				source,
				new String[] {
						"documentation",
						"The modeling unit is the root of any kermeta model. It contains packages, requires and usings.\nIt also reference others modeling unit." });
		addAnnotation(getModelingUnit_Usings(), source, new String[] { "ecore",
				"true" });
		addAnnotation(
				getModelingUnit_Usings(),
				source,
				new String[] {
						"documentation",
						"Set of \"using\" statement associated with this ModelingUnit. Ie. list of \"syntatic shortcut\"\nthat can be used within this unit." });
		addAnnotation(getModelingUnit_IncludeFilters(), source, new String[] {
				"ecore", "true" });
		addAnnotation(
				getModelingUnit_IncludeFilters(),
				source,
				new String[] {
						"documentation",
						"list of filters that apply to this modeling unit.\nThis means that if the same unit was loaded without this filters, it would have loaded more content\nonly element whose qualified name begins with one of these filter will be loaded in the unit" });
		addAnnotation(getModelingUnit_Packages(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getModelingUnit_Packages(), source,
				new String[] { "documentation",
						"root packages contained by this ModelingUnit" });
		addAnnotation(getModelingUnit_ExcludeFilters(), source, new String[] {
				"ecore", "true" });
		addAnnotation(
				getModelingUnit_ExcludeFilters(),
				source,
				new String[] {
						"documentation",
						"list of filters that apply to this modeling unit.\nThis means that if the same unit was loaded without this filters, it would have loaded more content\nelement whose qualified name begins with one of these filter will NOT be loaded in the unit" });
		addAnnotation(getModelingUnit_ReferencedModelingUnits(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getModelingUnit_ReferencedModelingUnits(), source,
				new String[] { "documentation", "To be written" });
		addAnnotation(getModelingUnit_Requires(), source, new String[] {
				"ecore", "true" });
		addAnnotation(
				getModelingUnit_Requires(),
				source,
				new String[] {
						"documentation",
						"Set of \"require\" statements associated with this ModelingUnit. Ie. list of the other\nfiles required to run this unit" });
		addAnnotation(requireEClass, source, new String[] { "ecore", "true" });
		addAnnotation(requireEClass, source, new String[] { "documentation",
				"To be written" });
		addAnnotation(getRequire_Uri(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getRequire_Uri(), source, new String[] { "documentation",
				"To be written" });
		addAnnotation(usingEClass, source, new String[] { "ecore", "true" });
		addAnnotation(usingEClass, source, new String[] { "documentation",
				"To be written" });
		addAnnotation(getUsing_QualifiedName(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getUsing_QualifiedName(), source, new String[] {
				"documentation", "To be written" });
		addAnnotation(filterEClass, source, new String[] { "ecore", "true" });
		addAnnotation(
				filterEClass,
				source,
				new String[] {
						"documentation",
						"Filter is the class that represent a filter on a ModelingUnit.\nthe qualifiedName represent the beginning of the matched names" });
		addAnnotation(getFilter_QualifiedName(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getFilter_QualifiedName(), source, new String[] {
				"documentation", "To be written" });
		addAnnotation(productTypeEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(
				productTypeEClass,
				source,
				new String[] {
						"documentation",
						"Type corresponding to a set of Types\nOnly used in the context of FunctionType" });
		addAnnotation(getProductType_Type(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getProductType_Type(), source, new String[] {
				"documentation", "Types " });
		addAnnotation(voidTypeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(voidTypeEClass, source, new String[] { "documentation",
				"Class definition for the <pre>Void</pre> type" });
		addAnnotation(typeDefinitionContainerEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(
				typeDefinitionContainerEClass,
				source,
				new String[] {
						"documentation",
						"Abstraction of the notion of containment for type definitions. Now, kermeta metamodel contains one container\nelement, that is Package. In a later release, ModelTypeDefinition will be the main container for type and\npackage definition." });
		addAnnotation(getTypeDefinitionContainer_OwnedTypeDefinition(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getTypeDefinitionContainer_OwnedTypeDefinition(), source,
				new String[] { "documentation", "Contained TypeDefinitions" });
	}

	/**
	 * Initializes the annotations for <b>kermeta.inv</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermeta_1Annotations() {
		String source = "kermeta.inv";
		addAnnotation(functionTypeEClass, source, new String[] {
				"resultType_must_not_be_a_ProductType", "" });
	}

} //StructurePackageImpl
