/**
 * <copyright>
 * </copyright>
 *
 * $Id: StructurePackageImpl.java,v 1.23 2008-02-14 07:13:02 uid21732 Exp $
 */
package fr.irisa.triskell.kermeta.language.structure.impl;

import fr.irisa.triskell.kermeta.KmPackage;

import fr.irisa.triskell.kermeta.impl.KmPackageImpl;

import fr.irisa.triskell.kermeta.language.LanguagePackage;

import fr.irisa.triskell.kermeta.language.behavior.BehaviorPackage;

import fr.irisa.triskell.kermeta.language.behavior.impl.BehaviorPackageImpl;

import fr.irisa.triskell.kermeta.language.impl.LanguagePackageImpl;

import fr.irisa.triskell.kermeta.language.structure.ClassDefinition;
import fr.irisa.triskell.kermeta.language.structure.Constraint;
import fr.irisa.triskell.kermeta.language.structure.ConstraintLanguage;
import fr.irisa.triskell.kermeta.language.structure.ConstraintType;
import fr.irisa.triskell.kermeta.language.structure.DataType;
import fr.irisa.triskell.kermeta.language.structure.Enumeration;
import fr.irisa.triskell.kermeta.language.structure.EnumerationLiteral;
import fr.irisa.triskell.kermeta.language.structure.Filter;
import fr.irisa.triskell.kermeta.language.structure.FunctionType;
import fr.irisa.triskell.kermeta.language.structure.GenericTypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.Model;
import fr.irisa.triskell.kermeta.language.structure.ModelType;
import fr.irisa.triskell.kermeta.language.structure.ModelTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.ModelingUnit;
import fr.irisa.triskell.kermeta.language.structure.MultiplicityElement;
import fr.irisa.triskell.kermeta.language.structure.NamedElement;
import fr.irisa.triskell.kermeta.language.structure.ObjectTypeVariable;
import fr.irisa.triskell.kermeta.language.structure.Operation;
import fr.irisa.triskell.kermeta.language.structure.Parameter;
import fr.irisa.triskell.kermeta.language.structure.ParameterizedType;
import fr.irisa.triskell.kermeta.language.structure.PrimitiveType;
import fr.irisa.triskell.kermeta.language.structure.ProductType;
import fr.irisa.triskell.kermeta.language.structure.Property;
import fr.irisa.triskell.kermeta.language.structure.Require;
import fr.irisa.triskell.kermeta.language.structure.StructureFactory;
import fr.irisa.triskell.kermeta.language.structure.StructurePackage;
import fr.irisa.triskell.kermeta.language.structure.Tag;
import fr.irisa.triskell.kermeta.language.structure.Type;
import fr.irisa.triskell.kermeta.language.structure.TypeContainer;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinition;
import fr.irisa.triskell.kermeta.language.structure.TypeDefinitionContainer;
import fr.irisa.triskell.kermeta.language.structure.TypeVariable;
import fr.irisa.triskell.kermeta.language.structure.TypeVariableBinding;
import fr.irisa.triskell.kermeta.language.structure.TypedElement;
import fr.irisa.triskell.kermeta.language.structure.Using;
import fr.irisa.triskell.kermeta.language.structure.VirtualType;
import fr.irisa.triskell.kermeta.language.structure.VirtualTypeContainer;
import fr.irisa.triskell.kermeta.language.structure.VoidType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructurePackageImpl extends EPackageImpl implements StructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "IRISA / INRIA / Universite de Rennes 1";

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
	private EClass multiplicityElementEClass = null;

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
	private EClass typeEClass = null;

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
	private EClass classEClass = null;

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
	private EClass modelTypeEClass = null;

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
	private EClass namedElementEClass = null;

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
	private EClass classDefinitionEClass = null;

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
	private EClass productTypeEClass = null;

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
	private EClass typeDefinitionEClass = null;

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
	private EClass dataTypeEClass = null;

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
	private EClass genericTypeDefinitionEClass = null;

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
	private EClass typeVariableEClass = null;

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
	private EClass modelingUnitEClass = null;

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
	private EClass enumerationEClass = null;

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
	private EClass virtualTypeContainerEClass = null;

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
	private EEnum constraintLanguageEEnum = null;

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
	 * @see fr.irisa.triskell.kermeta.language.structure.StructurePackage#eNS_URI
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
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructurePackage init() {
		if (isInited) return (StructurePackage)EPackage.Registry.INSTANCE.getEPackage(StructurePackage.eNS_URI);

		// Obtain or create and register package
		StructurePackageImpl theStructurePackage = (StructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof StructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new StructurePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KmPackageImpl theKmPackage = (KmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KmPackage.eNS_URI) instanceof KmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KmPackage.eNS_URI) : KmPackage.eINSTANCE);
		LanguagePackageImpl theLanguagePackage = (LanguagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) instanceof LanguagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LanguagePackage.eNS_URI) : LanguagePackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);

		// Create package meta-data objects
		theStructurePackage.createPackageContents();
		theKmPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();

		// Initialize created meta-data
		theStructurePackage.initializePackageContents();
		theKmPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructurePackage.freeze();

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
		return (EReference)objectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_OwnedTags() {
		return (EReference)objectEClass.getEStructuralFeatures().get(1);
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
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsUnique() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Lower() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Upper() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(3);
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
	public EReference getOperation_Body() {
		return (EReference)operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_SuperOperation() {
		return (EReference)operationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_OwningClass() {
		return (EReference)operationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_TypeParameter() {
		return (EReference)operationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_RaisedException() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_OwnedParameter() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Pre() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Post() {
		return (EReference)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsAbstract() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
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
	public EReference getProperty_GetterBody() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_SetterBody() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsGetterAbstract() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsSetterAbstract() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_OwningClass() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Opposite() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsReadOnly() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Default() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsComposite() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerived() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsID() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
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
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
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
		return (EReference)typeContainerEClass.getEStructuralFeatures().get(0);
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
		return (EReference)enumerationLiteralEClass.getEStructuralFeatures().get(0);
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
	public EReference getTypeVariableBinding_Variable() {
		return (EReference)typeVariableBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeVariableBinding_Type() {
		return (EReference)typeVariableBindingEClass.getEStructuralFeatures().get(1);
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
	public EReference getClass_OwnedAttribute() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedOperation() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SuperClass() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IsAbstract() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Name() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(4);
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
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
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
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
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
		return (EReference)typedElementEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getClassDefinition_IsAbstract() {
		return (EAttribute)classDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDefinition_OwnedAttribute() {
		return (EReference)classDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDefinition_OwnedOperation() {
		return (EReference)classDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDefinition_SuperType() {
		return (EReference)classDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDefinition_Inv() {
		return (EReference)classDefinitionEClass.getEStructuralFeatures().get(0);
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
	public EReference getFunctionType_Left() {
		return (EReference)functionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_Right() {
		return (EReference)functionTypeEClass.getEStructuralFeatures().get(1);
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
		return (EReference)productTypeEClass.getEStructuralFeatures().get(0);
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
		return (EReference)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestingPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Uri() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(2);
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
		return (EAttribute)typeDefinitionEClass.getEStructuralFeatures().get(0);
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
	public EClass getDataType() {
		return dataTypeEClass;
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
		return (EReference)parameterizedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedType_TypeDefinition() {
		return (EReference)parameterizedTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterizedType_VirtualTypeBinding() {
		return (EReference)parameterizedTypeEClass.getEStructuralFeatures().get(0);
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
		return (EReference)genericTypeDefinitionEClass.getEStructuralFeatures().get(0);
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
		return (EReference)typeDefinitionContainerEClass.getEStructuralFeatures().get(0);
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
		return (EReference)typeVariableEClass.getEStructuralFeatures().get(0);
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
		return (EAttribute)requireEClass.getEStructuralFeatures().get(0);
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
		return (EAttribute)usingEClass.getEStructuralFeatures().get(0);
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
	public EReference getModelingUnit_Packages() {
		return (EReference)modelingUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_Requires() {
		return (EReference)modelingUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_Usings() {
		return (EReference)modelingUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_ReferencedModelingUnits() {
		return (EReference)modelingUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_IncludeFilters() {
		return (EReference)modelingUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_ExcludeFilters() {
		return (EReference)modelingUnitEClass.getEStructuralFeatures().get(5);
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
		return (EAttribute)filterEClass.getEStructuralFeatures().get(0);
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
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
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
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
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
		return (EReference)primitiveTypeEClass.getEStructuralFeatures().get(0);
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
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Value() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTag_Object() {
		return (EReference)tagEClass.getEStructuralFeatures().get(2);
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
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Stereotype() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Language() {
		return (EAttribute)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_InvOwner() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_PreOwner() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_PostOwner() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualTypeContainer() {
		return virtualTypeContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualTypeContainer_VirtualType() {
		return (EReference)virtualTypeContainerEClass.getEStructuralFeatures().get(0);
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
	public EClass getVirtualType() {
		return virtualTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualType_ClassDefinition() {
		return (EReference)virtualTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualType_ModelType() {
		return (EReference)virtualTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualType_TypeParamBinding() {
		return (EReference)virtualTypeEClass.getEStructuralFeatures().get(2);
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
	public EEnum getConstraintType() {
		return constraintTypeEEnum;
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
	public StructureFactory getStructureFactory() {
		return (StructureFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__IS_ABSTRACT);
		createEReference(operationEClass, OPERATION__RAISED_EXCEPTION);
		createEReference(operationEClass, OPERATION__OWNED_PARAMETER);
		createEReference(operationEClass, OPERATION__PRE);
		createEReference(operationEClass, OPERATION__POST);
		createEReference(operationEClass, OPERATION__BODY);
		createEReference(operationEClass, OPERATION__SUPER_OPERATION);
		createEReference(operationEClass, OPERATION__OWNING_CLASS);
		createEReference(operationEClass, OPERATION__TYPE_PARAMETER);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__OPPOSITE);
		createEAttribute(propertyEClass, PROPERTY__IS_READ_ONLY);
		createEAttribute(propertyEClass, PROPERTY__DEFAULT);
		createEAttribute(propertyEClass, PROPERTY__IS_COMPOSITE);
		createEAttribute(propertyEClass, PROPERTY__IS_DERIVED);
		createEAttribute(propertyEClass, PROPERTY__IS_ID);
		createEReference(propertyEClass, PROPERTY__GETTER_BODY);
		createEReference(propertyEClass, PROPERTY__SETTER_BODY);
		createEAttribute(propertyEClass, PROPERTY__IS_GETTER_ABSTRACT);
		createEAttribute(propertyEClass, PROPERTY__IS_SETTER_ABSTRACT);
		createEReference(propertyEClass, PROPERTY__OWNING_CLASS);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__TYPE_CONTAINER);

		typeContainerEClass = createEClass(TYPE_CONTAINER);
		createEReference(typeContainerEClass, TYPE_CONTAINER__CONTAINED_TYPE);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEReference(enumerationLiteralEClass, ENUMERATION_LITERAL__ENUMERATION);

		typeVariableBindingEClass = createEClass(TYPE_VARIABLE_BINDING);
		createEReference(typeVariableBindingEClass, TYPE_VARIABLE_BINDING__VARIABLE);
		createEReference(typeVariableBindingEClass, TYPE_VARIABLE_BINDING__TYPE);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__OWNED_ATTRIBUTE);
		createEReference(classEClass, CLASS__OWNED_OPERATION);
		createEReference(classEClass, CLASS__SUPER_CLASS);
		createEAttribute(classEClass, CLASS__IS_ABSTRACT);
		createEAttribute(classEClass, CLASS__NAME);

		objectEClass = createEClass(OBJECT);
		createEReference(objectEClass, OBJECT__TAG);
		createEReference(objectEClass, OBJECT__OWNED_TAGS);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__CONTENTS);

		modelTypeEClass = createEClass(MODEL_TYPE);
		createEReference(modelTypeEClass, MODEL_TYPE__INCLUDED_TYPE_DEFINITION);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__IS_ORDERED);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__IS_UNIQUE);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER);

		typeDefinitionEClass = createEClass(TYPE_DEFINITION);
		createEAttribute(typeDefinitionEClass, TYPE_DEFINITION__IS_ASPECT);

		dataTypeEClass = createEClass(DATA_TYPE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__OWNED_LITERAL);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__NESTED_PACKAGE);
		createEReference(packageEClass, PACKAGE__NESTING_PACKAGE);
		createEAttribute(packageEClass, PACKAGE__URI);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__OPERATION);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEReference(primitiveTypeEClass, PRIMITIVE_TYPE__INSTANCE_TYPE);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);
		createEAttribute(tagEClass, TAG__VALUE);
		createEReference(tagEClass, TAG__OBJECT);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__BODY);
		createEAttribute(constraintEClass, CONSTRAINT__STEREOTYPE);
		createEAttribute(constraintEClass, CONSTRAINT__LANGUAGE);
		createEReference(constraintEClass, CONSTRAINT__INV_OWNER);
		createEReference(constraintEClass, CONSTRAINT__PRE_OWNER);
		createEReference(constraintEClass, CONSTRAINT__POST_OWNER);

		classDefinitionEClass = createEClass(CLASS_DEFINITION);
		createEReference(classDefinitionEClass, CLASS_DEFINITION__INV);
		createEAttribute(classDefinitionEClass, CLASS_DEFINITION__IS_ABSTRACT);
		createEReference(classDefinitionEClass, CLASS_DEFINITION__OWNED_ATTRIBUTE);
		createEReference(classDefinitionEClass, CLASS_DEFINITION__OWNED_OPERATION);
		createEReference(classDefinitionEClass, CLASS_DEFINITION__SUPER_TYPE);

		genericTypeDefinitionEClass = createEClass(GENERIC_TYPE_DEFINITION);
		createEReference(genericTypeDefinitionEClass, GENERIC_TYPE_DEFINITION__TYPE_PARAMETER);

		parameterizedTypeEClass = createEClass(PARAMETERIZED_TYPE);
		createEReference(parameterizedTypeEClass, PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING);
		createEReference(parameterizedTypeEClass, PARAMETERIZED_TYPE__TYPE_PARAM_BINDING);
		createEReference(parameterizedTypeEClass, PARAMETERIZED_TYPE__TYPE_DEFINITION);

		typeVariableEClass = createEClass(TYPE_VARIABLE);
		createEReference(typeVariableEClass, TYPE_VARIABLE__SUPERTYPE);

		objectTypeVariableEClass = createEClass(OBJECT_TYPE_VARIABLE);

		virtualTypeContainerEClass = createEClass(VIRTUAL_TYPE_CONTAINER);
		createEReference(virtualTypeContainerEClass, VIRTUAL_TYPE_CONTAINER__VIRTUAL_TYPE);

		modelTypeVariableEClass = createEClass(MODEL_TYPE_VARIABLE);

		virtualTypeEClass = createEClass(VIRTUAL_TYPE);
		createEReference(virtualTypeEClass, VIRTUAL_TYPE__CLASS_DEFINITION);
		createEReference(virtualTypeEClass, VIRTUAL_TYPE__MODEL_TYPE);
		createEReference(virtualTypeEClass, VIRTUAL_TYPE__TYPE_PARAM_BINDING);

		modelingUnitEClass = createEClass(MODELING_UNIT);
		createEReference(modelingUnitEClass, MODELING_UNIT__PACKAGES);
		createEReference(modelingUnitEClass, MODELING_UNIT__REQUIRES);
		createEReference(modelingUnitEClass, MODELING_UNIT__USINGS);
		createEReference(modelingUnitEClass, MODELING_UNIT__REFERENCED_MODELING_UNITS);
		createEReference(modelingUnitEClass, MODELING_UNIT__INCLUDE_FILTERS);
		createEReference(modelingUnitEClass, MODELING_UNIT__EXCLUDE_FILTERS);

		requireEClass = createEClass(REQUIRE);
		createEAttribute(requireEClass, REQUIRE__URI);

		usingEClass = createEClass(USING);
		createEAttribute(usingEClass, USING__QUALIFIED_NAME);

		filterEClass = createEClass(FILTER);
		createEAttribute(filterEClass, FILTER__QUALIFIED_NAME);

		productTypeEClass = createEClass(PRODUCT_TYPE);
		createEReference(productTypeEClass, PRODUCT_TYPE__TYPE);

		functionTypeEClass = createEClass(FUNCTION_TYPE);
		createEReference(functionTypeEClass, FUNCTION_TYPE__LEFT);
		createEReference(functionTypeEClass, FUNCTION_TYPE__RIGHT);

		voidTypeEClass = createEClass(VOID_TYPE);

		typeDefinitionContainerEClass = createEClass(TYPE_DEFINITION_CONTAINER);
		createEReference(typeDefinitionContainerEClass, TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION);

		// Create enums
		constraintLanguageEEnum = createEEnum(CONSTRAINT_LANGUAGE);
		constraintTypeEEnum = createEEnum(CONSTRAINT_TYPE);

		// Create data types
		stringEDataType = createEDataType(STRING);
		booleanEDataType = createEDataType(BOOLEAN);
		integerEDataType = createEDataType(INTEGER);
		unlimitedNaturalEDataType = createEDataType(UNLIMITED_NATURAL);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BehaviorPackage theBehaviorPackage = (BehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		operationEClass.getESuperTypes().add(this.getMultiplicityElement());
		propertyEClass.getESuperTypes().add(this.getMultiplicityElement());
		typeEClass.getESuperTypes().add(this.getObject());
		typeContainerEClass.getESuperTypes().add(this.getObject());
		enumerationLiteralEClass.getESuperTypes().add(this.getNamedElement());
		typeVariableBindingEClass.getESuperTypes().add(this.getTypeContainer());
		typeVariableBindingEClass.getESuperTypes().add(this.getObject());
		classEClass.getESuperTypes().add(this.getParameterizedType());
		modelEClass.getESuperTypes().add(this.getObject());
		modelTypeEClass.getESuperTypes().add(this.getType());
		modelTypeEClass.getESuperTypes().add(this.getTypeDefinition());
		multiplicityElementEClass.getESuperTypes().add(this.getTypedElement());
		typeDefinitionEClass.getESuperTypes().add(this.getNamedElement());
		dataTypeEClass.getESuperTypes().add(this.getType());
		dataTypeEClass.getESuperTypes().add(this.getTypeDefinition());
		enumerationEClass.getESuperTypes().add(this.getDataType());
		namedElementEClass.getESuperTypes().add(this.getObject());
		packageEClass.getESuperTypes().add(this.getNamedElement());
		packageEClass.getESuperTypes().add(this.getTypeDefinitionContainer());
		parameterEClass.getESuperTypes().add(this.getMultiplicityElement());
		primitiveTypeEClass.getESuperTypes().add(this.getDataType());
		primitiveTypeEClass.getESuperTypes().add(this.getTypeContainer());
		typedElementEClass.getESuperTypes().add(this.getTypeContainer());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());
		tagEClass.getESuperTypes().add(this.getObject());
		constraintEClass.getESuperTypes().add(this.getNamedElement());
		classDefinitionEClass.getESuperTypes().add(this.getGenericTypeDefinition());
		classDefinitionEClass.getESuperTypes().add(this.getTypeContainer());
		genericTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		parameterizedTypeEClass.getESuperTypes().add(this.getType());
		typeVariableEClass.getESuperTypes().add(this.getTypeContainer());
		typeVariableEClass.getESuperTypes().add(this.getType());
		typeVariableEClass.getESuperTypes().add(this.getNamedElement());
		objectTypeVariableEClass.getESuperTypes().add(this.getTypeVariable());
		modelTypeVariableEClass.getESuperTypes().add(this.getVirtualTypeContainer());
		modelTypeVariableEClass.getESuperTypes().add(this.getTypeVariable());
		virtualTypeEClass.getESuperTypes().add(this.getObjectTypeVariable());
		modelingUnitEClass.getESuperTypes().add(this.getObject());
		requireEClass.getESuperTypes().add(this.getObject());
		usingEClass.getESuperTypes().add(this.getObject());
		filterEClass.getESuperTypes().add(this.getObject());
		productTypeEClass.getESuperTypes().add(this.getTypeContainer());
		productTypeEClass.getESuperTypes().add(this.getType());
		functionTypeEClass.getESuperTypes().add(this.getTypeContainer());
		functionTypeEClass.getESuperTypes().add(this.getType());
		voidTypeEClass.getESuperTypes().add(this.getType());
		typeDefinitionContainerEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_IsAbstract(), this.getBoolean(), "isAbstract", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_RaisedException(), this.getType(), null, "raisedException", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_OwnedParameter(), this.getParameter(), this.getParameter_Operation(), "ownedParameter", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Pre(), this.getConstraint(), this.getConstraint_PreOwner(), "pre", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Post(), this.getConstraint(), this.getConstraint_PostOwner(), "post", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Body(), theBehaviorPackage.getExpression(), null, "body", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_SuperOperation(), this.getOperation(), null, "superOperation", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_OwningClass(), this.getClassDefinition(), this.getClassDefinition_OwnedOperation(), "owningClass", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_TypeParameter(), this.getTypeVariable(), null, "typeParameter", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Opposite(), this.getProperty(), null, "opposite", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsReadOnly(), this.getBoolean(), "isReadOnly", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Default(), this.getString(), "default", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsComposite(), this.getBoolean(), "isComposite", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsDerived(), this.getBoolean(), "isDerived", "false", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsID(), this.getBoolean(), "isID", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_GetterBody(), theBehaviorPackage.getExpression(), null, "getterBody", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_SetterBody(), theBehaviorPackage.getExpression(), null, "setterBody", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsGetterAbstract(), this.getBoolean(), "isGetterAbstract", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsSetterAbstract(), this.getBoolean(), "isSetterAbstract", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_OwningClass(), this.getClassDefinition(), this.getClassDefinition_OwnedAttribute(), "owningClass", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_TypeContainer(), this.getTypeContainer(), this.getTypeContainer_ContainedType(), "typeContainer", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeContainerEClass, TypeContainer.class, "TypeContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeContainer_ContainedType(), this.getType(), this.getType_TypeContainer(), "containedType", null, 0, -1, TypeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationLiteral_Enumeration(), this.getEnumeration(), this.getEnumeration_OwnedLiteral(), "enumeration", null, 0, 1, EnumerationLiteral.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeVariableBindingEClass, TypeVariableBinding.class, "TypeVariableBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeVariableBinding_Variable(), this.getTypeVariable(), null, "variable", null, 1, 1, TypeVariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeVariableBinding_Type(), this.getType(), null, "type", null, 1, 1, TypeVariableBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classEClass, fr.irisa.triskell.kermeta.language.structure.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_OwnedAttribute(), this.getProperty(), null, "ownedAttribute", null, 0, -1, fr.irisa.triskell.kermeta.language.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClass_OwnedOperation(), this.getOperation(), null, "ownedOperation", null, 0, -1, fr.irisa.triskell.kermeta.language.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClass_SuperClass(), this.getClass_(), null, "superClass", null, 0, -1, fr.irisa.triskell.kermeta.language.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_IsAbstract(), this.getBoolean(), "isAbstract", "false", 0, 1, fr.irisa.triskell.kermeta.language.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getClass_Name(), this.getString(), "name", null, 0, 1, fr.irisa.triskell.kermeta.language.structure.Class.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(classEClass, this.getObject(), "_new", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectEClass, fr.irisa.triskell.kermeta.language.structure.Object.class, "Object", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObject_Tag(), this.getTag(), this.getTag_Object(), "tag", null, 0, -1, fr.irisa.triskell.kermeta.language.structure.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObject_OwnedTags(), this.getTag(), null, "ownedTags", null, 0, -1, fr.irisa.triskell.kermeta.language.structure.Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Contents(), this.getObject(), null, "contents", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelTypeEClass, ModelType.class, "ModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelType_IncludedTypeDefinition(), this.getTypeDefinition(), null, "includedTypeDefinition", null, 0, -1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(modelTypeEClass, this.getModel(), "_new", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityElement_IsOrdered(), this.getBoolean(), "isOrdered", "false", 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_IsUnique(), this.getBoolean(), "isUnique", "true", 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_Lower(), this.getInteger(), "lower", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiplicityElement_Upper(), this.getUnlimitedNatural(), "upper", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeDefinition_IsAspect(), this.getBoolean(), "isAspect", null, 0, 1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_OwnedLiteral(), this.getEnumerationLiteral(), this.getEnumerationLiteral_Enumeration(), "ownedLiteral", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), this.getString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packageEClass, fr.irisa.triskell.kermeta.language.structure.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_NestedPackage(), this.getPackage(), this.getPackage_NestingPackage(), "nestedPackage", null, 0, -1, fr.irisa.triskell.kermeta.language.structure.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_NestingPackage(), this.getPackage(), this.getPackage_NestedPackage(), "nestingPackage", null, 0, 1, fr.irisa.triskell.kermeta.language.structure.Package.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Uri(), this.getString(), "uri", null, 0, 1, fr.irisa.triskell.kermeta.language.structure.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Operation(), this.getOperation(), this.getOperation_OwnedParameter(), "operation", null, 0, 1, Parameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveType_InstanceType(), this.getType(), null, "instanceType", null, 0, 1, PrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getType(), null, "type", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Name(), this.getString(), "name", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTag_Value(), this.getString(), "value", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTag_Object(), this.getObject(), this.getObject_Tag(), "object", null, 1, -1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Body(), theBehaviorPackage.getExpression(), null, "body", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConstraint_Stereotype(), this.getConstraintType(), "stereotype", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraint_Language(), this.getConstraintLanguage(), "language", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_InvOwner(), this.getClassDefinition(), this.getClassDefinition_Inv(), "invOwner", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_PreOwner(), this.getOperation(), this.getOperation_Pre(), "preOwner", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_PostOwner(), this.getOperation(), this.getOperation_Post(), "postOwner", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classDefinitionEClass, ClassDefinition.class, "ClassDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassDefinition_Inv(), this.getConstraint(), this.getConstraint_InvOwner(), "inv", null, 0, -1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClassDefinition_IsAbstract(), this.getBoolean(), "isAbstract", null, 0, 1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDefinition_OwnedAttribute(), this.getProperty(), this.getProperty_OwningClass(), "ownedAttribute", null, 0, -1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDefinition_OwnedOperation(), this.getOperation(), this.getOperation_OwningClass(), "ownedOperation", null, 0, -1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDefinition_SuperType(), this.getType(), null, "superType", null, 0, -1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericTypeDefinitionEClass, GenericTypeDefinition.class, "GenericTypeDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericTypeDefinition_TypeParameter(), this.getTypeVariable(), null, "typeParameter", null, 0, -1, GenericTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterizedTypeEClass, ParameterizedType.class, "ParameterizedType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterizedType_VirtualTypeBinding(), this.getTypeVariableBinding(), null, "virtualTypeBinding", null, 0, -1, ParameterizedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterizedType_TypeParamBinding(), this.getTypeVariableBinding(), null, "typeParamBinding", null, 0, -1, ParameterizedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterizedType_TypeDefinition(), this.getGenericTypeDefinition(), null, "typeDefinition", null, 1, 1, ParameterizedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeVariableEClass, TypeVariable.class, "TypeVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeVariable_Supertype(), this.getType(), null, "supertype", null, 0, 1, TypeVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectTypeVariableEClass, ObjectTypeVariable.class, "ObjectTypeVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualTypeContainerEClass, VirtualTypeContainer.class, "VirtualTypeContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualTypeContainer_VirtualType(), this.getVirtualType(), this.getVirtualType_ModelType(), "virtualType", null, 0, -1, VirtualTypeContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelTypeVariableEClass, ModelTypeVariable.class, "ModelTypeVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(virtualTypeEClass, VirtualType.class, "VirtualType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualType_ClassDefinition(), this.getClassDefinition(), null, "classDefinition", null, 1, 1, VirtualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualType_ModelType(), this.getVirtualTypeContainer(), this.getVirtualTypeContainer_VirtualType(), "modelType", null, 1, 1, VirtualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVirtualType_TypeParamBinding(), this.getTypeVariableBinding(), null, "typeParamBinding", null, 0, -1, VirtualType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelingUnitEClass, ModelingUnit.class, "ModelingUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelingUnit_Packages(), this.getPackage(), null, "packages", null, 0, -1, ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingUnit_Requires(), this.getRequire(), null, "requires", null, 0, -1, ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingUnit_Usings(), this.getUsing(), null, "usings", null, 0, -1, ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingUnit_ReferencedModelingUnits(), this.getModelingUnit(), null, "referencedModelingUnits", null, 0, -1, ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingUnit_IncludeFilters(), this.getFilter(), null, "includeFilters", null, 0, -1, ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingUnit_ExcludeFilters(), this.getFilter(), null, "excludeFilters", null, 0, -1, ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requireEClass, Require.class, "Require", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequire_Uri(), this.getString(), "uri", null, 0, 1, Require.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usingEClass, Using.class, "Using", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsing_QualifiedName(), this.getString(), "qualifiedName", null, 0, 1, Using.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilter_QualifiedName(), this.getString(), "qualifiedName", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productTypeEClass, ProductType.class, "ProductType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductType_Type(), this.getType(), null, "type", null, 0, -1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionTypeEClass, FunctionType.class, "FunctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionType_Left(), this.getType(), null, "left", null, 0, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionType_Right(), this.getType(), null, "right", null, 0, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(voidTypeEClass, VoidType.class, "VoidType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeDefinitionContainerEClass, TypeDefinitionContainer.class, "TypeDefinitionContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDefinitionContainer_OwnedTypeDefinition(), this.getTypeDefinition(), null, "ownedTypeDefinition", null, 0, -1, TypeDefinitionContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(constraintLanguageEEnum, ConstraintLanguage.class, "ConstraintLanguage");
		addEEnumLiteral(constraintLanguageEEnum, ConstraintLanguage.KERMETA_LITERAL);
		addEEnumLiteral(constraintLanguageEEnum, ConstraintLanguage.OCL_LITERAL);

		initEEnum(constraintTypeEEnum, ConstraintType.class, "ConstraintType");
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.INV_LITERAL);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.PRE_LITERAL);
		addEEnumLiteral(constraintTypeEEnum, ConstraintType.POST_LITERAL);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(booleanEDataType, boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, int.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unlimitedNaturalEDataType, int.class, "UnlimitedNatural", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "GenModel";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Contains all the abstract classes used in the reflection mechanism. Implements the <b>derived\n * properties</b> contained in the classes; declares the abstract operations.\n * Concrete implementation is in kermeta.language.structure.\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/reflection_package.png\">\n */"
		   });		
		addAnnotation
		  (getOperation_IsAbstract(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Boolean stating whether the Operation is abstract\n */"
		   });		
		addAnnotation
		  (getOperation_RaisedException(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Exceptions raised by the Operation\n */"
		   });		
		addAnnotation
		  (getOperation_OwnedParameter(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Parameters of the Operation\n */\n"
		   });		
		addAnnotation
		  (getOperation_Pre(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Pre-conditions of the Operation\n */"
		   });		
		addAnnotation
		  (getOperation_Post(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Post-conditions of the Operation\n */"
		   });		
		addAnnotation
		  (getOperation_Body(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Body of the Operation, expressed as a KerMeta expression\n */"
		   });		
		addAnnotation
		  (getOperation_SuperOperation(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Super-operation of the Operation, if any\n */\t"
		   });		
		addAnnotation
		  (getOperation_OwningClass(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * ClassDefinition owning the Operation\n */"
		   });		
		addAnnotation
		  (getOperation_TypeParameter(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * TypeParameters of the Operation\n */"
		   });		
		addAnnotation
		  (getProperty_Opposite(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Opposite Property of the Property, void if the Property has no opposite\n */"
		   });		
		addAnnotation
		  (getProperty_IsReadOnly(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Boolean stating whether the Property is read-only\n */"
		   });		
		addAnnotation
		  (getProperty_Default(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written #######################################\n */"
		   });		
		addAnnotation
		  (getProperty_IsComposite(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Boolean stating whether the Property has a containment role\n */"
		   });		
		addAnnotation
		  (getProperty_IsDerived(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * If True, the value of the property is not stored but computed from other properties\n */"
		   });		
		addAnnotation
		  (getProperty_IsID(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Boolean stating whether the property allows to identify its containing Object\n */"
		   });		
		addAnnotation
		  (getProperty_GetterBody(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written ################################\n */"
		   });		
		addAnnotation
		  (getProperty_SetterBody(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written ####################################\n */\n"
		   });		
		addAnnotation
		  (getProperty_IsGetterAbstract(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Boolean stating wether the getter is abstract.\n */"
		   });		
		addAnnotation
		  (getProperty_IsSetterAbstract(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Boolean stating wether the setter is abstract.\n */"
		   });		
		addAnnotation
		  (getProperty_OwningClass(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * ClassDefinition that owns the Property\n */"
		   });		
		addAnnotation
		  (getType_TypeContainer(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Owning TypeContainer, if any\n */"
		   });		
		addAnnotation
		  (getTypeContainer_ContainedType(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Contained types\n */"
		   });		
		addAnnotation
		  (getEnumerationLiteral_Enumeration(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Owning Enumeration\n */"
		   });		
		addAnnotation
		  (getTypeVariableBinding_Variable(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * TypeVariable\n */"
		   });		
		addAnnotation
		  (getTypeVariableBinding_Type(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Assigned Type\n */"
		   });		
		addAnnotation
		  (getClass_OwnedAttribute(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Returns the Attributes, References, and derived Properties owned by\n * the ClassDefinition of this Class.\n */"
		   });		
		addAnnotation
		  (getClass_OwnedOperation(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Returns the Operations owned by the ClassDefinition of this Class.\n */"
		   });		
		addAnnotation
		  (getClass_SuperClass(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Returns the Classes of which the ClassDefinition of this Class inherits.\n */"
		   });		
		addAnnotation
		  (getClass_IsAbstract(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Returns a Boolean stating whether ClassDefinition of this Class is abstract.\n */ \n"
		   });		
		addAnnotation
		  (getClass_Name(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Returns the name of the ClassDefinition of this Class\n */"
		   });		
		addAnnotation
		  (getObject_Tag(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * An Object can be tagged by a Tag. \n * They are typically used to put comments/documentation on the object\n */"
		   });		
		addAnnotation
		  (getObject_OwnedTags(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * An object can contains a Tag.  \n * Be careful, owning a tag doesn\'t means that the tag applies to the Object\n * To know which Tags apply to the object use the \"tag\" reference\n */"
		   });		
		addAnnotation
		  (getModel_Contents(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Contents of this model ...\n */\n"
		   });		
		addAnnotation
		  (getModelType_IncludedTypeDefinition(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written #######################################\n */\n"
		   });		
		addAnnotation
		  (getMultiplicityElement_IsOrdered(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Boolean stating whether the element is ordered\n */"
		   });		
		addAnnotation
		  (getMultiplicityElement_IsUnique(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Boolean stating whether duplicated elements are allowed\n */"
		   });		
		addAnnotation
		  (getMultiplicityElement_Lower(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Min cardinality of the element\n */"
		   });		
		addAnnotation
		  (getMultiplicityElement_Upper(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Max cardinality of the element, \'-1\' for \'*\'\n */"
		   });		
		addAnnotation
		  (typeDefinitionEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * This boolean allows to tell if this Type definition is an aspect or not\n * If it is an aspect, then at runtime, its definition will be merged with the definition of another\n * TypeDefinition that has exactly the same qualified name\n */"
		   });		
		addAnnotation
		  (dataTypeEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Special type definition for Enumeration, PrimitiveType\n */"
		   });		
		addAnnotation
		  (enumerationEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Definition for Enumeration\n */"
		   });		
		addAnnotation
		  (getEnumeration_OwnedLiteral(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Owned items in an Enumeration\n */"
		   });		
		addAnnotation
		  (namedElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Any element that contain a  name (example : Operation, Property) inherit this\n * class.\n */"
		   });		
		addAnnotation
		  (getNamedElement_Name(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Name of this named element\n */"
		   });		
		addAnnotation
		  (packageEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Package in kermeta. Each kermeta model must have a root package. \n */"
		   });		
		addAnnotation
		  (getPackage_NestedPackage(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Nested Packages contained by the Package\n */"
		   });		
		addAnnotation
		  (getPackage_NestingPackage(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Owning Package, if any\n */"
		   });		
		addAnnotation
		  (getPackage_Uri(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Uri of the Package\n */"
		   });		
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Definition for operation parameter\n */"
		   });		
		addAnnotation
		  (getParameter_Operation(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Owning operation\n */"
		   });		
		addAnnotation
		  (primitiveTypeEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * The class definition for kermeta aliases. Above statement defines a primitive\n * type called MyString, which instanceType is <code>kermeta::standard::String</code>\n * <pre>alias MyString : kermeta::standard::String</pre>\n */"
		   });		
		addAnnotation
		  (getPrimitiveType_InstanceType(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * The type the primitive type is linked with\n */"
		   });		
		addAnnotation
		  (typedElementEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Abstraction of the notion of typed element : each element \n * that is typed inherits this class.\n */"
		   });		
		addAnnotation
		  (getTypedElement_Type(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Type of the model element\n */"
		   });		
		addAnnotation
		  (unlimitedNaturalEDataType, 
		   source, 
		   new String[] {
			 "documentation", "/** Alias to kermeta::standard::UnlimitedNatural */"
		   });		
		addAnnotation
		  (tagEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Tag is intended to be used to add documentation on a  model element,\n * or add some textual information that cannot be expressed with any\n * model element definition.\n */"
		   });		
		addAnnotation
		  (getTag_Name(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Name of the Tag\n */"
		   });		
		addAnnotation
		  (getTag_Value(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * String value of the Tag\n */"
		   });		
		addAnnotation
		  (getTag_Object(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Objects to which the Tag is attached to\n */"
		   });		
		addAnnotation
		  (constraintEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Constraint is part of a contract implementation in a Class definition or an operation.\n * Three kinds of constraints are available : pre, post, and inv (invariant constraint)\n */"
		   });		
		addAnnotation
		  (getConstraint_Body(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Body of the constraint, expressed as a KerMeta expression\n */"
		   });		
		addAnnotation
		  (getConstraint_Stereotype(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Type of the Constraint (precond/postcond/inv)\n */"
		   });		
		addAnnotation
		  (getConstraint_Language(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Language in which the constraint is expressed\n */"
		   });		
		addAnnotation
		  (getConstraint_InvOwner(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Owning ClassDefinition if Constraint corresponds to invariant\n */"
		   });		
		addAnnotation
		  (getConstraint_PreOwner(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Owning Operation if Constraint corresponds to pre-condition\n */"
		   });		
		addAnnotation
		  (getConstraint_PostOwner(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Owning Operation if Constraint corresponds to post-condition\n */"
		   });		
		addAnnotation
		  (constraintLanguageEEnum, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Enumeration listing supported constraint languages\n */"
		   });		
		addAnnotation
		  (getClassDefinition_Inv(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Invariants defined for this ClassDefinition\n */"
		   });		
		addAnnotation
		  (getClassDefinition_IsAbstract(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Boolean stating whether the ClassDefinition is abstract (which means that\n * no instance can be allocated)\n */"
		   });		
		addAnnotation
		  (getClassDefinition_OwnedAttribute(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Attributes, References, and derived Properties owned by this ClassDefinition.\n */"
		   });		
		addAnnotation
		  (getClassDefinition_OwnedOperation(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Operations owned by this ClassDefinition.\n */\n"
		   });		
		addAnnotation
		  (getClassDefinition_SuperType(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Classes from which this ClassDefinition inherits.\n */"
		   });		
		addAnnotation
		  (constraintTypeEEnum, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Enumeration liting the different kinds of constraints\n */"
		   });		
		addAnnotation
		  (getGenericTypeDefinition_TypeParameter(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Type variables defined for the GenericTypeDefinition\n */"
		   });		
		addAnnotation
		  (getParameterizedType_VirtualTypeBinding(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written #################################\n */"
		   });		
		addAnnotation
		  (getParameterizedType_TypeParamBinding(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Bindings between type variables and provided types \n */"
		   });		
		addAnnotation
		  (getParameterizedType_TypeDefinition(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Definition of the Type\n */"
		   });		
		addAnnotation
		  (getTypeVariable_Supertype(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Reference to the supertype, if any\n */"
		   });		
		addAnnotation
		  (virtualTypeContainerEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written #################################\n */"
		   });		
		addAnnotation
		  (getVirtualTypeContainer_VirtualType(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written #################################\n */"
		   });		
		addAnnotation
		  (modelTypeVariableEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written #################################\n */"
		   });		
		addAnnotation
		  (virtualTypeEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written #################################\n */"
		   });		
		addAnnotation
		  (getVirtualType_ClassDefinition(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written #################################\n */"
		   });		
		addAnnotation
		  (getVirtualType_ModelType(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written #################################\n */"
		   });		
		addAnnotation
		  (getVirtualType_TypeParamBinding(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written #################################\n */"
		   });		
		addAnnotation
		  (modelingUnitEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * The modeling unit is the root of any kermeta model. It contains packages, requires and usings.\n * It also reference others modeling unit.\n */"
		   });		
		addAnnotation
		  (getModelingUnit_Packages(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * root packages contained by this ModelingUnit\n */"
		   });		
		addAnnotation
		  (getModelingUnit_Requires(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Set of \"require\" statements associated with this ModelingUnit. Ie. list of the other\n * files required to run this unit\n */"
		   });		
		addAnnotation
		  (getModelingUnit_Usings(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Set of \"using\" statement associated with this ModelingUnit. Ie. list of \"syntatic shortcut\"\n * that can be used within this unit.\n */"
		   });		
		addAnnotation
		  (getModelingUnit_ReferencedModelingUnits(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written\n */"
		   });		
		addAnnotation
		  (getModelingUnit_IncludeFilters(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * list of filters that apply to this modeling unit.\n * This means that if the same unit was loaded without this filters, it would have loaded more content\n * only element whose qualified name begins with one of these filter will be loaded in the unit\n */"
		   });		
		addAnnotation
		  (getModelingUnit_ExcludeFilters(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * list of filters that apply to this modeling unit.\n * This means that if the same unit was loaded without this filters, it would have loaded more content\n * element whose qualified name begins with one of these filter will NOT be loaded in the unit\n */"
		   });		
		addAnnotation
		  (requireEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written\n */"
		   });		
		addAnnotation
		  (getRequire_Uri(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written\n */"
		   });		
		addAnnotation
		  (usingEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written\n */"
		   });		
		addAnnotation
		  (getUsing_QualifiedName(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written\n */"
		   });		
		addAnnotation
		  (filterEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Filter is the class that represent a filter on a ModelingUnit.\n * the qualifiedName represent the beginning of the matched names\n */"
		   });		
		addAnnotation
		  (getFilter_QualifiedName(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * To be written\n */"
		   });		
		addAnnotation
		  (getProductType_Type(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Types \n */"
		   });		
		addAnnotation
		  (getFunctionType_Left(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Parameters of the function (a ProductType for multiple parameters)\n */"
		   });		
		addAnnotation
		  (getFunctionType_Right(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Result type of the function\n */"
		   });		
		addAnnotation
		  (voidTypeEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Class definition for the <pre>Void</pre> type\n */"
		   });		
		addAnnotation
		  (typeDefinitionContainerEClass, 
		   source, 
		   new String[] {
			 "documentation", "/** \n * Abstraction of the notion of containment for type definitions. Now, kermeta metamodel contains one container\n * element, that is Package. In a later release, ModelTypeDefinition will be the main container for type and\n * package definition.\n */"
		   });		
		addAnnotation
		  (getTypeDefinitionContainer_OwnedTypeDefinition(), 
		   source, 
		   new String[] {
			 "documentation", "/**\n * Contained TypeDefinitions\n */"
		   });
	}

} //StructurePackageImpl
