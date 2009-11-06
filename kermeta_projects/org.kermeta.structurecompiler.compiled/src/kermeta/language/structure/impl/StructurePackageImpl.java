/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package kermeta.language.structure.impl;

import kermeta.KermetaPackage;

import kermeta.compiler.CompilerPackage;

import kermeta.compiler.impl.CompilerPackageImpl;

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
import kermeta.language.structure.LinkSetterForTypedElement;
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
import kermeta.language.structure.PropertyConstraint;
import kermeta.language.structure.Require;
import kermeta.language.structure.StructureFactory;
import kermeta.language.structure.StructurePackage;
import kermeta.language.structure.Tag;
import kermeta.language.structure.Traceability;
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

import km2ecore.Km2ecorePackage;

import km2ecore.common.CommonPackage;

import km2ecore.common.exception.ExceptionPackage;

import km2ecore.common.exception.impl.ExceptionPackageImpl;

import km2ecore.common.impl.CommonPackageImpl;

import km2ecore.helper.java.JavaPackage;

import km2ecore.helper.java.impl.JavaPackageImpl;

import km2ecore.impl.Km2ecorePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import simk.SimkPackage;

import simk.impl.SimkPackageImpl;

import traceability.TraceabilityPackage;

import traceability.impl.TraceabilityPackageImpl;

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
	private EClass constraintEClass = null;

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
	private EClass packageEClass = null;

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
	private EClass enumerationEClass = null;

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
	private EClass classDefinitionEClass = null;

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
	private EClass parameterEClass = null;

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
	private EClass objectTypeVariableEClass = null;

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
	private EClass objectEClass = null;

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
	private EClass multiplicityElementEClass = null;

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
	private EClass traceabilityEClass = null;

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
	private EClass functionTypeEClass = null;

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
	private EClass linkSetterForTypedElementEClass = null;

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
	private EClass voidTypeEClass = null;

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
	private EClass typeContainerEClass = null;

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
	private EClass typeVariableEClass = null;

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
	private EClass modelEClass = null;

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
	private EClass typeDefinitionContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyConstraintEClass = null;

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
		StandardPackageImpl theStandardPackage = (StandardPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI) instanceof StandardPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI)
				: StandardPackage.eINSTANCE);
		UtilsPackageImpl theUtilsPackage = (UtilsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI) instanceof UtilsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(UtilsPackage.eNS_URI)
				: UtilsPackage.eINSTANCE);
		XmltypePackageImpl theXmltypePackage = (XmltypePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(XmltypePackage.eNS_URI) instanceof XmltypePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(XmltypePackage.eNS_URI)
				: XmltypePackage.eINSTANCE);
		CompilerPackageImpl theCompilerPackage = (CompilerPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI) instanceof CompilerPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CompilerPackage.eNS_URI)
				: CompilerPackage.eINSTANCE);
		KunitPackageImpl theKunitPackage = (KunitPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI) instanceof KunitPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(KunitPackage.eNS_URI)
				: KunitPackage.eINSTANCE);
		ExceptionsPackageImpl theExceptionsPackage = (ExceptionsPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI) instanceof ExceptionsPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI)
				: ExceptionsPackage.eINSTANCE);
		InterpreterPackageImpl theInterpreterPackage = (InterpreterPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI) instanceof InterpreterPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(InterpreterPackage.eNS_URI)
				: InterpreterPackage.eINSTANCE);
		PersistencePackageImpl thePersistencePackage = (PersistencePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI) instanceof PersistencePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI)
				: PersistencePackage.eINSTANCE);
		EcorePackageImpl theEcorePackage = (EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(EcorePackage.eNS_URI)
				: EcorePackage.eINSTANCE);
		IoPackageImpl theIoPackage = (IoPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI) instanceof IoPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(IoPackage.eNS_URI)
				: IoPackage.eINSTANCE);
		Km2ecorePackageImpl theKm2ecorePackage = (Km2ecorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI) instanceof Km2ecorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI)
				: Km2ecorePackage.eINSTANCE);
		km2ecore.helper.kermeta.impl.KermetaPackageImpl theKermetaPackage_1 = (km2ecore.helper.kermeta.impl.KermetaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.kermeta.KermetaPackage.eNS_URI) instanceof km2ecore.helper.kermeta.impl.KermetaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.kermeta.KermetaPackage.eNS_URI)
				: km2ecore.helper.kermeta.KermetaPackage.eINSTANCE);
		km2ecore.helper.ecore.impl.EcorePackageImpl theEcorePackage_1 = (km2ecore.helper.ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.ecore.EcorePackage.eNS_URI) instanceof km2ecore.helper.ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(km2ecore.helper.ecore.EcorePackage.eNS_URI)
				: km2ecore.helper.ecore.EcorePackage.eINSTANCE);
		JavaPackageImpl theJavaPackage = (JavaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(JavaPackage.eNS_URI) instanceof JavaPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(JavaPackage.eNS_URI)
				: JavaPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(CommonPackage.eNS_URI)
				: CommonPackage.eINSTANCE);
		ExceptionPackageImpl theExceptionPackage = (ExceptionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ExceptionPackage.eNS_URI) instanceof ExceptionPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ExceptionPackage.eNS_URI)
				: ExceptionPackage.eINSTANCE);
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(TraceabilityPackage.eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(TraceabilityPackage.eNS_URI)
				: TraceabilityPackage.eINSTANCE);
		ecore.impl.EcorePackageImpl theEcorePackage_2 = (ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI) instanceof ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI)
				: ecore.EcorePackage.eINSTANCE);
		SimkPackageImpl theSimkPackage = (SimkPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI) instanceof SimkPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI)
				: SimkPackage.eINSTANCE);

		// Create package meta-data objects
		theStructurePackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theXmltypePackage.createPackageContents();
		theCompilerPackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theEcorePackage.createPackageContents();
		theIoPackage.createPackageContents();
		theKm2ecorePackage.createPackageContents();
		theKermetaPackage_1.createPackageContents();
		theEcorePackage_1.createPackageContents();
		theJavaPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theExceptionPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();
		theEcorePackage_2.createPackageContents();
		theSimkPackage.createPackageContents();

		// Initialize created meta-data
		theStructurePackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theXmltypePackage.initializePackageContents();
		theCompilerPackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theEcorePackage.initializePackageContents();
		theIoPackage.initializePackageContents();
		theKm2ecorePackage.initializePackageContents();
		theKermetaPackage_1.initializePackageContents();
		theEcorePackage_1.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();
		theEcorePackage_2.initializePackageContents();
		theSimkPackage.initializePackageContents();

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
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Id() {
		return (EAttribute) constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Body() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_PreOwner() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Stereotype() {
		return (EAttribute) constraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_PostOwner() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraint_Language() {
		return (EAttribute) constraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_InvOwner() {
		return (EReference) constraintEClass.getEStructuralFeatures().get(6);
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
	public EReference getModelingUnit_EcorePackages() {
		return (EReference) modelingUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_Usings() {
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
	public EReference getModelingUnit_IncludeFilters() {
		return (EReference) modelingUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_SuperOperationsToCompileInHelper() {
		return (EReference) modelingUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_ExcludeFilters() {
		return (EReference) modelingUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_ReferencedModelingUnits() {
		return (EReference) modelingUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_Requires() {
		return (EReference) modelingUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelingUnit_EntryPoints() {
		return (EReference) modelingUnitEClass.getEStructuralFeatures().get(8);
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
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestingPackage() {
		return (EReference) packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_GenModelBasePackage() {
		return (EAttribute) packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestedPackage() {
		return (EReference) packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Uri() {
		return (EAttribute) packageEClass.getEStructuralFeatures().get(3);
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
	public EReference getClassDefinition_SubClassDefinitions() {
		return (EReference) classDefinitionEClass.getEStructuralFeatures().get(
				4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDefinition_OwnedAttribute() {
		return (EReference) classDefinitionEClass.getEStructuralFeatures().get(
				5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDefinition_EcoreDataType() {
		return (EReference) classDefinitionEClass.getEStructuralFeatures().get(
				6);
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
	public EAttribute getOperation_Cuid() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_OwnedParameter() {
		return (EReference) operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsAbstract() {
		return (EAttribute) operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Post() {
		return (EReference) operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_RaisedException() {
		return (EReference) operationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Pre() {
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
	public EReference getOperation_LambdaExpression() {
		return (EReference) operationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_OwningClass() {
		return (EReference) operationEClass.getEStructuralFeatures().get(10);
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
	public EAttribute getProperty_IsComposite() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsGetterAbstract() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(10);
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
	public EReference getObject_File() {
		return (EReference) objectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_FileName() {
		return (EAttribute) objectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_LineNumber() {
		return (EAttribute) objectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_OwnedTags() {
		return (EReference) objectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObject_Oid() {
		return (EAttribute) objectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObject_InternalContainingResource() {
		return (EReference) objectEClass.getEStructuralFeatures().get(6);
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
	public EClass getTraceability() {
		return traceabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceability_EcoreModelElement() {
		return (EReference) traceabilityEClass.getEStructuralFeatures().get(0);
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
	public EClass getFunctionType() {
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_Left() {
		return (EReference) functionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_Right() {
		return (EReference) functionTypeEClass.getEStructuralFeatures().get(1);
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
	public EClass getLinkSetterForTypedElement() {
		return linkSetterForTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkSetterForTypedElement_ForceVoidTypeLink() {
		return (EAttribute) linkSetterForTypedElementEClass
				.getEStructuralFeatures().get(0);
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
	public EClass getVoidType() {
		return voidTypeEClass;
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
	public EClass getPropertyConstraint() {
		return propertyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyConstraint_Property() {
		return (EReference) propertyConstraintEClass.getEStructuralFeatures()
				.get(0);
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
		constraintEClass = createEClass(CONSTRAINT);
		createEAttribute(constraintEClass, CONSTRAINT__ID);
		createEReference(constraintEClass, CONSTRAINT__BODY);
		createEReference(constraintEClass, CONSTRAINT__PRE_OWNER);
		createEAttribute(constraintEClass, CONSTRAINT__STEREOTYPE);
		createEReference(constraintEClass, CONSTRAINT__POST_OWNER);
		createEAttribute(constraintEClass, CONSTRAINT__LANGUAGE);
		createEReference(constraintEClass, CONSTRAINT__INV_OWNER);

		modelingUnitEClass = createEClass(MODELING_UNIT);
		createEReference(modelingUnitEClass, MODELING_UNIT__ECORE_PACKAGES);
		createEReference(modelingUnitEClass, MODELING_UNIT__USINGS);
		createEReference(modelingUnitEClass, MODELING_UNIT__PACKAGES);
		createEReference(modelingUnitEClass, MODELING_UNIT__INCLUDE_FILTERS);
		createEReference(modelingUnitEClass,
				MODELING_UNIT__SUPER_OPERATIONS_TO_COMPILE_IN_HELPER);
		createEReference(modelingUnitEClass, MODELING_UNIT__EXCLUDE_FILTERS);
		createEReference(modelingUnitEClass,
				MODELING_UNIT__REFERENCED_MODELING_UNITS);
		createEReference(modelingUnitEClass, MODELING_UNIT__REQUIRES);
		createEReference(modelingUnitEClass, MODELING_UNIT__ENTRY_POINTS);

		requireEClass = createEClass(REQUIRE);
		createEAttribute(requireEClass, REQUIRE__URI);

		usingEClass = createEClass(USING);
		createEAttribute(usingEClass, USING__QUALIFIED_NAME);

		packageEClass = createEClass(PACKAGE);
		createEReference(packageEClass, PACKAGE__NESTING_PACKAGE);
		createEAttribute(packageEClass, PACKAGE__GEN_MODEL_BASE_PACKAGE);
		createEReference(packageEClass, PACKAGE__NESTED_PACKAGE);
		createEAttribute(packageEClass, PACKAGE__URI);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEReference(primitiveTypeEClass, PRIMITIVE_TYPE__INSTANCE_TYPE);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__OWNED_LITERAL);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEReference(enumerationLiteralEClass,
				ENUMERATION_LITERAL__ENUMERATION);

		classDefinitionEClass = createEClass(CLASS_DEFINITION);
		createEReference(classDefinitionEClass,
				CLASS_DEFINITION__OWNED_OPERATION);
		createEAttribute(classDefinitionEClass, CLASS_DEFINITION__IS_ABSTRACT);
		createEReference(classDefinitionEClass, CLASS_DEFINITION__SUPER_TYPE);
		createEReference(classDefinitionEClass, CLASS_DEFINITION__INV);
		createEReference(classDefinitionEClass,
				CLASS_DEFINITION__SUB_CLASS_DEFINITIONS);
		createEReference(classDefinitionEClass,
				CLASS_DEFINITION__OWNED_ATTRIBUTE);
		createEReference(classDefinitionEClass,
				CLASS_DEFINITION__ECORE_DATA_TYPE);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__TYPE_PARAMETER);
		createEReference(operationEClass, OPERATION__BODY);
		createEAttribute(operationEClass, OPERATION__CUID);
		createEReference(operationEClass, OPERATION__OWNED_PARAMETER);
		createEAttribute(operationEClass, OPERATION__IS_ABSTRACT);
		createEReference(operationEClass, OPERATION__POST);
		createEReference(operationEClass, OPERATION__RAISED_EXCEPTION);
		createEReference(operationEClass, OPERATION__PRE);
		createEReference(operationEClass, OPERATION__SUPER_OPERATION);
		createEReference(operationEClass, OPERATION__LAMBDA_EXPRESSION);
		createEReference(operationEClass, OPERATION__OWNING_CLASS);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__OPERATION);

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
		createEAttribute(propertyEClass, PROPERTY__IS_COMPOSITE);
		createEAttribute(propertyEClass, PROPERTY__IS_GETTER_ABSTRACT);

		objectTypeVariableEClass = createEClass(OBJECT_TYPE_VARIABLE);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);
		createEAttribute(tagEClass, TAG__VALUE);
		createEReference(tagEClass, TAG__OBJECT);

		objectEClass = createEClass(OBJECT);
		createEReference(objectEClass, OBJECT__TAG);
		createEReference(objectEClass, OBJECT__FILE);
		createEAttribute(objectEClass, OBJECT__FILE_NAME);
		createEAttribute(objectEClass, OBJECT__LINE_NUMBER);
		createEReference(objectEClass, OBJECT__OWNED_TAGS);
		createEAttribute(objectEClass, OBJECT__OID);
		createEReference(objectEClass, OBJECT__INTERNAL_CONTAINING_RESOURCE);

		genericTypeDefinitionEClass = createEClass(GENERIC_TYPE_DEFINITION);
		createEReference(genericTypeDefinitionEClass,
				GENERIC_TYPE_DEFINITION__TYPE_PARAMETER);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEAttribute(multiplicityElementEClass,
				MULTIPLICITY_ELEMENT__IS_ORDERED);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER);
		createEAttribute(multiplicityElementEClass,
				MULTIPLICITY_ELEMENT__IS_UNIQUE);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__TYPE_CONTAINER);

		traceabilityEClass = createEClass(TRACEABILITY);
		createEReference(traceabilityEClass, TRACEABILITY__ECORE_MODEL_ELEMENT);

		classEClass = createEClass(CLASS);

		functionTypeEClass = createEClass(FUNCTION_TYPE);
		createEReference(functionTypeEClass, FUNCTION_TYPE__LEFT);
		createEReference(functionTypeEClass, FUNCTION_TYPE__RIGHT);

		parameterizedTypeEClass = createEClass(PARAMETERIZED_TYPE);
		createEReference(parameterizedTypeEClass,
				PARAMETERIZED_TYPE__TYPE_PARAM_BINDING);
		createEReference(parameterizedTypeEClass,
				PARAMETERIZED_TYPE__TYPE_DEFINITION);
		createEReference(parameterizedTypeEClass,
				PARAMETERIZED_TYPE__VIRTUAL_TYPE_BINDING);

		linkSetterForTypedElementEClass = createEClass(LINK_SETTER_FOR_TYPED_ELEMENT);
		createEAttribute(linkSetterForTypedElementEClass,
				LINK_SETTER_FOR_TYPED_ELEMENT__FORCE_VOID_TYPE_LINK);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		voidTypeEClass = createEClass(VOID_TYPE);

		productTypeEClass = createEClass(PRODUCT_TYPE);
		createEReference(productTypeEClass, PRODUCT_TYPE__TYPE);

		typeContainerEClass = createEClass(TYPE_CONTAINER);
		createEReference(typeContainerEClass, TYPE_CONTAINER__CONTAINED_TYPE);

		typeVariableBindingEClass = createEClass(TYPE_VARIABLE_BINDING);
		createEReference(typeVariableBindingEClass, TYPE_VARIABLE_BINDING__TYPE);
		createEReference(typeVariableBindingEClass,
				TYPE_VARIABLE_BINDING__VARIABLE);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		typeDefinitionEClass = createEClass(TYPE_DEFINITION);
		createEAttribute(typeDefinitionEClass, TYPE_DEFINITION__IS_ASPECT);

		dataTypeEClass = createEClass(DATA_TYPE);

		typeVariableEClass = createEClass(TYPE_VARIABLE);
		createEReference(typeVariableEClass, TYPE_VARIABLE__SUPERTYPE);

		modelTypeEClass = createEClass(MODEL_TYPE);
		createEReference(modelTypeEClass, MODEL_TYPE__INCLUDED_TYPE_DEFINITION);

		modelTypeVariableEClass = createEClass(MODEL_TYPE_VARIABLE);
		createEReference(modelTypeVariableEClass,
				MODEL_TYPE_VARIABLE__VIRTUAL_TYPE);

		virtualTypeEClass = createEClass(VIRTUAL_TYPE);
		createEReference(virtualTypeEClass, VIRTUAL_TYPE__MODEL_TYPE);
		createEReference(virtualTypeEClass, VIRTUAL_TYPE__TYPE_PARAM_BINDING);
		createEReference(virtualTypeEClass, VIRTUAL_TYPE__CLASS_DEFINITION);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__CONTENTS);

		filterEClass = createEClass(FILTER);
		createEAttribute(filterEClass, FILTER__QUALIFIED_NAME);

		typeDefinitionContainerEClass = createEClass(TYPE_DEFINITION_CONTAINER);
		createEReference(typeDefinitionContainerEClass,
				TYPE_DEFINITION_CONTAINER__OWNED_TYPE_DEFINITION);

		propertyConstraintEClass = createEClass(PROPERTY_CONSTRAINT);
		createEReference(propertyConstraintEClass,
				PROPERTY_CONSTRAINT__PROPERTY);

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
		ecore.EcorePackage theEcorePackage_2 = (ecore.EcorePackage) EPackage.Registry.INSTANCE
				.getEPackage(ecore.EcorePackage.eNS_URI);
		StandardPackage theStandardPackage = (StandardPackage) EPackage.Registry.INSTANCE
				.getEPackage(StandardPackage.eNS_URI);
		BehaviorPackage theBehaviorPackage = (BehaviorPackage) EPackage.Registry.INSTANCE
				.getEPackage(BehaviorPackage.eNS_URI);
		Km2ecorePackage theKm2ecorePackage = (Km2ecorePackage) EPackage.Registry.INSTANCE
				.getEPackage(Km2ecorePackage.eNS_URI);
		TraceabilityPackage theTraceabilityPackage = (TraceabilityPackage) EPackage.Registry.INSTANCE
				.getEPackage(TraceabilityPackage.eNS_URI);
		PersistencePackage thePersistencePackage = (PersistencePackage) EPackage.Registry.INSTANCE
				.getEPackage(PersistencePackage.eNS_URI);
		ExceptionsPackage theExceptionsPackage = (ExceptionsPackage) EPackage.Registry.INSTANCE
				.getEPackage(ExceptionsPackage.eNS_URI);

		// Create type parameters
		ETypeParameter traceabilityEClass_X = addETypeParameter(
				traceabilityEClass, "X");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getTraceability());
		EGenericType g2 = createEGenericType(theEcorePackage_2.getEAnnotation());
		g1.getETypeArguments().add(g2);
		constraintEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNamedElement());
		constraintEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTraceability());
		g2 = createEGenericType(theEcorePackage_2.getEAnnotation());
		g1.getETypeArguments().add(g2);
		modelingUnitEClass.getEGenericSuperTypes().add(g1);
		requireEClass.getESuperTypes().add(this.getObject());
		usingEClass.getESuperTypes().add(this.getObject());
		g1 = createEGenericType(this.getTraceability());
		g2 = createEGenericType(theEcorePackage_2.getEPackage());
		g1.getETypeArguments().add(g2);
		packageEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNamedElement());
		packageEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTypeDefinitionContainer());
		packageEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTraceability());
		g2 = createEGenericType(theEcorePackage_2.getEDataType());
		g1.getETypeArguments().add(g2);
		primitiveTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataType());
		primitiveTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTypeContainer());
		primitiveTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTraceability());
		g2 = createEGenericType(theEcorePackage_2.getEEnum());
		g1.getETypeArguments().add(g2);
		enumerationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDataType());
		enumerationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTraceability());
		g2 = createEGenericType(theEcorePackage_2.getEEnumLiteral());
		g1.getETypeArguments().add(g2);
		enumerationLiteralEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getNamedElement());
		enumerationLiteralEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTraceability());
		g2 = createEGenericType(theEcorePackage_2.getEClass());
		g1.getETypeArguments().add(g2);
		classDefinitionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getGenericTypeDefinition());
		classDefinitionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTypeContainer());
		classDefinitionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTraceability());
		g2 = createEGenericType(theEcorePackage_2.getEOperation());
		g1.getETypeArguments().add(g2);
		operationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultiplicityElement());
		operationEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTraceability());
		g2 = createEGenericType(theEcorePackage_2.getEParameter());
		g1.getETypeArguments().add(g2);
		parameterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultiplicityElement());
		parameterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTraceability());
		g2 = createEGenericType(theEcorePackage_2.getEStructuralFeature());
		g1.getETypeArguments().add(g2);
		propertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMultiplicityElement());
		propertyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTraceability());
		g2 = createEGenericType(theEcorePackage_2.getETypeParameter());
		g1.getETypeArguments().add(g2);
		objectTypeVariableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTypeVariable());
		objectTypeVariableEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTraceability());
		g2 = createEGenericType(theEcorePackage_2.getEAnnotation());
		g1.getETypeArguments().add(g2);
		tagEClass.getEGenericSuperTypes().add(g1);
		genericTypeDefinitionEClass.getESuperTypes().add(
				this.getTypeDefinition());
		multiplicityElementEClass.getESuperTypes().add(this.getTypedElement());
		typeEClass.getESuperTypes().add(this.getObject());
		traceabilityEClass.getESuperTypes().add(this.getObject());
		g1 = createEGenericType(this.getParameterizedType());
		classEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTraceability());
		g2 = createEGenericType(theEcorePackage_2.getEGenericType());
		g1.getETypeArguments().add(g2);
		classEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTypeContainer());
		functionTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getType());
		functionTypeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getTraceability());
		g2 = createEGenericType(theEcorePackage_2.getEAnnotation());
		g1.getETypeArguments().add(g2);
		functionTypeEClass.getEGenericSuperTypes().add(g1);
		parameterizedTypeEClass.getESuperTypes().add(this.getType());
		linkSetterForTypedElementEClass.getESuperTypes().add(this.getObject());
		namedElementEClass.getESuperTypes().add(this.getObject());
		voidTypeEClass.getESuperTypes().add(this.getType());
		productTypeEClass.getESuperTypes().add(this.getTypeContainer());
		productTypeEClass.getESuperTypes().add(this.getType());
		typeContainerEClass.getESuperTypes().add(this.getObject());
		typeVariableBindingEClass.getESuperTypes().add(this.getTypeContainer());
		typedElementEClass.getESuperTypes().add(this.getTypeContainer());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());
		typeDefinitionEClass.getESuperTypes().add(this.getNamedElement());
		dataTypeEClass.getESuperTypes().add(this.getType());
		dataTypeEClass.getESuperTypes().add(this.getTypeDefinition());
		typeVariableEClass.getESuperTypes().add(this.getTypeContainer());
		typeVariableEClass.getESuperTypes().add(this.getType());
		typeVariableEClass.getESuperTypes().add(this.getNamedElement());
		modelTypeEClass.getESuperTypes().add(this.getType());
		modelTypeEClass.getESuperTypes().add(this.getTypeDefinition());
		modelTypeVariableEClass.getESuperTypes().add(this.getTypeVariable());
		virtualTypeEClass.getESuperTypes().add(this.getObjectTypeVariable());
		modelEClass.getESuperTypes().add(this.getObject());
		filterEClass.getESuperTypes().add(this.getObject());
		typeDefinitionContainerEClass.getESuperTypes().add(
				this.getNamedElement());
		propertyConstraintEClass.getESuperTypes().add(this.getConstraint());

		// Initialize classes and features; add operations and parameters
		initEClass(constraintEClass, Constraint.class, "Constraint",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstraint_Id(), theStandardPackage.getJavaString(),
				"id", null, 0, 1, Constraint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
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

		EOperation op = addEOperation(constraintEClass, theStandardPackage
				.getJavaString(), "createBehaviorJava", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(constraintEClass, null, "setSimkForInvariant", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(constraintEClass, null, "applyPass1", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(constraintEClass, null, "applyPass2", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(constraintEClass,
				theEcorePackage_2.getEAnnotation(), "createEcoreModelElement",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(constraintEClass, theStandardPackage
				.getJavaBoolean(), "isPre", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConstraint(), "c", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(constraintEClass, null, "applyPass2BehaviorJava", 0,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(constraintEClass, theStandardPackage
				.getJavaBoolean(), "isPost", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConstraint(), "c", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(modelingUnitEClass, ModelingUnit.class, "ModelingUnit",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelingUnit_EcorePackages(), theEcorePackage_2
				.getEPackage(), null, "ecorePackages", null, 0, -1,
				ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getModelingUnit_Usings(), this.getUsing(), null,
				"usings", null, 0, -1, ModelingUnit.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingUnit_Packages(), this.getPackage(), null,
				"packages", null, 0, -1, ModelingUnit.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelingUnit_IncludeFilters(), this.getFilter(),
				null, "includeFilters", null, 0, -1, ModelingUnit.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getModelingUnit_SuperOperationsToCompileInHelper(), this
				.getOperation(), null, "superOperationsToCompileInHelper",
				null, 0, -1, ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
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
		initEReference(getModelingUnit_EntryPoints(), theEcorePackage_2
				.getEAnnotation(), null, "entryPoints", null, 0, -1,
				ModelingUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(modelingUnitEClass, this.getPackage(),
				"retrievePackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "qname", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelingUnitEClass, null, "createKRuntimeError", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelingUnitEClass, null, "applyPass1", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelingUnitEClass, null, "compileSuperOperation",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelingUnitEClass, null, "postprocess", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelingUnitEClass, theEcorePackage_2
				.getEClassifier(), "getEClassifierByQualifiedName", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "qname", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(modelingUnitEClass, null, "cleanEObject", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelingUnitEClass, null, "preprocess", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelingUnitEClass, null, "compileStaticOperation",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getOperation(), "op", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelingUnitEClass, theEcorePackage_2
				.getEAnnotation(), "createEcoreModelElement", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelingUnitEClass, null, "getAllPackages", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getOrderedSet());
		g2 = createEGenericType(this.getPackage());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(modelingUnitEClass, this.getTypeDefinition(),
				"getTypeDefinitionByQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "qname", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(modelingUnitEClass, null, "applyPass2BehaviorJava",
				0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(requireEClass, Require.class, "Require", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequire_Uri(), theStandardPackage.getJavaString(),
				"uri", null, 0, 1, Require.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = addEOperation(requireEClass, null, "applyPass1", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(requireEClass, theEcorePackage_2.getEAnnotation(),
				"createEcoreModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(usingEClass, Using.class, "Using", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsing_QualifiedName(), theStandardPackage
				.getJavaString(), "qualifiedName", null, 0, 1, Using.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(usingEClass, null, "applyPass1", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(usingEClass, theEcorePackage_2.getEAnnotation(),
				"createEcoreModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(packageEClass, kermeta.language.structure.Package.class,
				"Package", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackage_NestingPackage(), this.getPackage(), this
				.getPackage_NestedPackage(), "nestingPackage", null, 0, 1,
				kermeta.language.structure.Package.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_GenModelBasePackage(), theStandardPackage
				.getJavaString(), "genModelBasePackage", null, 0, 1,
				kermeta.language.structure.Package.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPackage_NestedPackage(), this.getPackage(), this
				.getPackage_NestingPackage(), "nestedPackage", null, 0, -1,
				kermeta.language.structure.Package.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPackage_Uri(), theStandardPackage.getJavaString(),
				"uri", null, 0, 1, kermeta.language.structure.Package.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(packageEClass, null, "applyPass1", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(packageEClass, theEcorePackage_2.getEPackage(),
				"createEcoreModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(packageEClass, null, "getAllSubPackages", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getOrderedSet());
		g2 = createEGenericType(this.getPackage());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(packageEClass, null, "applyPass2BehaviorJava", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveType_InstanceType(), this.getType(), null,
				"instanceType", null, 0, 1, PrimitiveType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(primitiveTypeEClass, theStandardPackage
				.getJavaString(), "createBehaviorJava", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(primitiveTypeEClass, null, "applyPass1", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(primitiveTypeEClass, theEcorePackage_2
				.getEDataType(), "createEcoreModelElement", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

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

		op = addEOperation(enumerationEClass, theStandardPackage
				.getJavaString(), "createBehaviorJava", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(enumerationEClass, null, "applyPass1", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(enumerationEClass, theEcorePackage_2.getEEnum(),
				"createEcoreModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class,
				"EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationLiteral_Enumeration(), this
				.getEnumeration(), this.getEnumeration_OwnedLiteral(),
				"enumeration", null, 0, 1, EnumerationLiteral.class,
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = addEOperation(enumerationLiteralEClass, null, "applyPass1", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(enumerationLiteralEClass, theEcorePackage_2
				.getEEnumLiteral(), "createEcoreModelElement", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

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
		initEReference(getClassDefinition_SubClassDefinitions(), this
				.getClassDefinition(), null, "subClassDefinitions", null, 0,
				-1, ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDefinition_OwnedAttribute(), this.getProperty(),
				this.getProperty_OwningClass(), "ownedAttribute", null, 0, -1,
				ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDefinition_EcoreDataType(), theEcorePackage_2
				.getEDataType(), null, "ecoreDataType", null, 0, 1,
				ClassDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(classDefinitionEClass, theStandardPackage
				.getJavaBoolean(), "isMappedToJavaRawType", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(classDefinitionEClass, null, "initEmfNeedProperty",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(classDefinitionEClass, null, "applyPass1", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(classDefinitionEClass, null, "applyPass2", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classDefinitionEClass, theStandardPackage
				.getJavaBoolean(), "isValueType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(classDefinitionEClass, null, "setLinks", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classDefinitionEClass, null,
				"setSubClassDefinitionToSuperTypes", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(classDefinitionEClass, theStandardPackage
				.getJavaBoolean(), "isAddedValueType", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(classDefinitionEClass, null, "allSuperTypes", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getSet());
		g2 = createEGenericType(this.getType());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(classDefinitionEClass, theStandardPackage
				.getJavaBoolean(), "isSubTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(),
				"superType_qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classDefinitionEClass, theStandardPackage
				.getJavaBoolean(), "isIterator", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classDefinitionEClass, theStandardPackage
				.getJavaBoolean(), "isCollection", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(classDefinitionEClass,
				theEcorePackage_2.getEClass(), "createEcoreModelElement", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(classDefinitionEClass, null,
				"applyPass2BehaviorJava", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classDefinitionEClass, this.getOperation(),
				"getterAllOperation", 0, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(classDefinitionEClass, this.getProperty(),
				"getterAllAttribute", 0, -1, IS_UNIQUE, !IS_ORDERED);

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
		initEAttribute(getOperation_Cuid(), theStandardPackage.getJavaString(),
				"cuid", null, 0, 1, Operation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_OwnedParameter(), this.getParameter(), this
				.getParameter_Operation(), "ownedParameter", null, 0, -1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_IsAbstract(), theStandardPackage
				.getJavaBoolean(), "isAbstract", "false", 0, 1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Post(), this.getConstraint(), this
				.getConstraint_PostOwner(), "post", null, 0, -1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_RaisedException(), this.getType(), null,
				"raisedException", null, 0, -1, Operation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Pre(), this.getConstraint(), this
				.getConstraint_PreOwner(), "pre", null, 0, -1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getOperation_SuperOperation(), this.getOperation(),
				null, "superOperation", null, 0, 1, Operation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getOperation_LambdaExpression(), theBehaviorPackage
				.getLambdaExpression(), null, "lambdaExpression", null, 0, 1,
				Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_OwningClass(), this.getClassDefinition(),
				this.getClassDefinition_OwnedOperation(), "owningClass", null,
				0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(operationEClass, theStandardPackage.getJavaString(),
				"createBehaviorJava", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(operationEClass, theStandardPackage.getJavaBoolean(),
				"isRunnable", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(operationEClass, theStandardPackage.getJavaBoolean(),
				"mustBeCompiled", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(operationEClass, theStandardPackage.getJavaString(),
				"getOptimizedStaticCall", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(operationEClass, theStandardPackage.getJavaString(),
				"createBehaviorJavaFromPost", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(operationEClass, null, "applyPass1", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(operationEClass, null, "applyPass2", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(operationEClass, null, "setLinks", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(operationEClass, theStandardPackage.getJavaBoolean(),
				"ownedByValueType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(operationEClass, theStandardPackage.getJavaBoolean(),
				"isFunctionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(operationEClass, null, "compilingInSimkMode", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(operationEClass, theStandardPackage.getJavaBoolean(),
				"mustBeDuplicated", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(operationEClass, theStandardPackage.getJavaString(),
				"createBehaviorJavaFromPre", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(operationEClass, null, "getFunctionTypeParameter",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getSequence());
		g2 = createEGenericType(this.getParameter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(operationEClass,
				theStandardPackage.getJavaBoolean(), "isVoidType", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "type_label", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(operationEClass, theEcorePackage_2.getEOperation(),
				"createEcoreModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(operationEClass, theStandardPackage.getJavaBoolean(),
				"hasAValueTypedParameter", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(operationEClass, null, "applyPass2BehaviorJava", 0,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Operation(), this.getOperation(), this
				.getOperation_OwnedParameter(), "operation", null, 0, 1,
				Parameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		addEOperation(parameterEClass, theStandardPackage.getJavaBoolean(),
				"isRunnable", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass,
				theStandardPackage.getJavaBoolean(), "isBooleanFunctionType",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, null, "applyPass1", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, null, "applyPass2", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, theEcorePackage_2.getEParameter(),
				"createEcoreModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, null, "setLinks", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(parameterEClass, theStandardPackage.getJavaBoolean(),
				"isFunctionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(parameterEClass, null, "applyPass2BehaviorJava", 0,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

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
		initEAttribute(getProperty_IsComposite(), theStandardPackage
				.getJavaBoolean(), "isComposite", "false", 0, 1,
				Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsGetterAbstract(), theStandardPackage
				.getJavaBoolean(), "isGetterAbstract", "false", 0, 1,
				Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(propertyEClass, theStandardPackage.getJavaString(),
				"createBehaviorJava", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyEClass, null, "applyPass1", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyEClass, theEcorePackage_2
				.getEStructuralFeature(), "createEcoreModelElement", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyEClass, null, "applyPass2", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyEClass, theStandardPackage.getJavaString(),
				"printGetAccessor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyEClass, theStandardPackage.getJavaString(),
				"printSetAccessor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyEClass, null, "setLinks", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(propertyEClass, null, "applyPass2BehaviorJava", 0,
				1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectTypeVariableEClass, ObjectTypeVariable.class,
				"ObjectTypeVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(objectTypeVariableEClass, theStandardPackage
				.getJavaString(), "createBehaviorJava", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectTypeVariableEClass, null, "applyPass1", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectTypeVariableEClass, theEcorePackage_2
				.getETypeParameter(), "createEcoreModelElement", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

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

		op = addEOperation(tagEClass, null, "applyPass1", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(tagEClass, theEcorePackage_2.getEAnnotation(),
				"createEcoreModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectEClass, kermeta.language.structure.Object.class,
				"Object", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObject_Tag(), this.getTag(), this.getTag_Object(),
				"tag", null, 0, -1, kermeta.language.structure.Object.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getObject_File(), theTraceabilityPackage.getFile(),
				null, "file", null, 0, 1,
				kermeta.language.structure.Object.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObject_FileName(),
				theStandardPackage.getJavaString(), "fileName", null, 0, 1,
				kermeta.language.structure.Object.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getObject_LineNumber(), theStandardPackage
				.getJavaInteger(), "lineNumber", null, 0, 1,
				kermeta.language.structure.Object.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
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

		op = addEOperation(objectEClass, this.getObject(),
				"getContainerAsTypeIn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getType(), "stop_type", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(objectEClass, null, "applyPass1", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, null, "applyPass2", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaString(),
				"getEMFInstanceClassName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, null, "getTagValues", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "key", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getOrderedSet());
		g2 = createEGenericType(theStandardPackage.getJavaString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(objectEClass, null, "checkAllInvariants", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaString(),
				"getWrapperValueTypeSelfExpression", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(objectEClass, null, "applyPass2BehaviorJava", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, null, "getEMFNeedProperty", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getOrderedSet());
		g2 = createEGenericType(theStandardPackage.getJavaString());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(objectEClass, theStandardPackage.getJavaString(),
				"getDeprecated", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"isSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProperty(), "property", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"mustBeAssigned", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaString(),
				"getWrapperValueTypeReturnType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, this.getObject(), "get", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getProperty(), "property", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "element", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"getEMFIsTransient", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theExceptionsPackage
				.getConstraintsDiagnostic(), "getViolatedConstraints", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"getEMFEDataTypeIsSerializable", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, this.getObject(), "container", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, null, "unset", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getProperty(), "property", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(objectEClass, thePersistencePackage.getResource(),
				"containingResource", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaString(),
				"toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, null, "checkInvariant", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getConstraint(), "invariant", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(objectEClass, theStandardPackage.getJavaString(),
				"createBehaviorJava", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"interpretBooleanTag", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "str_tag", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"isKindOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getClass_(), "cl", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, this.getClass_(), "getMetaClass", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, null, "set", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getProperty(), "property", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getObject(), "element", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaString(),
				"getEMFEDataTypeInstanceClassName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, this.getProperty(),
				"getPropertyValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "propertyName",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, null, "checkInvariants", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaString(),
				"getEMFDefaultConstructor", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"isVoid", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaInteger(), "oid",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"isInstanceOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaString(),
				"getCompiledJavaExtern", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, null, "applyPass2BehaviorKmt", 0, 1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"isFrozen", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaInteger(),
				"hashcode", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"callsFunctionType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, this.getPackage(), "getRootPackage", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, theStandardPackage.getJavaString(),
				"getUniqueTagValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaString(), "key", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaString(),
				"getFinalJavaClassQN", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, this.getObject(),
				"getContainerAsType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, theStandardPackage.getJavaBoolean(),
				"isNotEqual", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "element", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(objectEClass, null, "freeze", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(objectEClass, theStandardPackage.getJavaString(),
				"getEMFEDataTypeETypeParameters", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(objectEClass, this.getObject(), "asType", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getClass_(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(genericTypeDefinitionEClass, GenericTypeDefinition.class,
				"GenericTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericTypeDefinition_TypeParameter(), this
				.getTypeVariable(), null, "typeParameter", null, 0, -1,
				GenericTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
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

		addEOperation(multiplicityElementEClass, theStandardPackage
				.getJavaString(), "getRecopyInValueTypes", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(multiplicityElementEClass, theStandardPackage
				.getJavaString(), "getFinalName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(multiplicityElementEClass, theStandardPackage
				.getJavaString(), "getEMFRenameAs", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(multiplicityElementEClass, theStandardPackage
				.getJavaString(), "ppReturnResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_TypeContainer(), this.getTypeContainer(), this
				.getTypeContainer_ContainedType(), "typeContainer", null, 0, 1,
				Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		addEOperation(typeEClass, theStandardPackage.getJavaBoolean(),
				"isMappedToJavaRawType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(typeEClass, theStandardPackage.getJavaString(),
				"createBehaviorJava", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(typeEClass, this.getObject(), "clone", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "objectToClone", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(typeEClass, this.getObject(), "deepClone", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "objectToClone", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(typeEClass, theStandardPackage.getJavaBoolean(),
				"isBooleanTypeDef", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(typeEClass, this.getClass_(),
				"getClassFromPrimitiveType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(typeEClass, theStandardPackage.getJavaBoolean(),
				"isValueType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(typeEClass, theStandardPackage.getJavaString(),
				"getTypeName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(typeEClass, theStandardPackage.getJavaBoolean(),
				"isNumericalTypeDef", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(typeEClass, theStandardPackage.getJavaString(),
				"getTypeQName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(typeEClass, theStandardPackage.getJavaBoolean(),
				"isPrimitiveType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(typeEClass, theStandardPackage.getJavaBoolean(),
				"isSubTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getType(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(typeEClass, theStandardPackage.getJavaBoolean(),
				"isEDataType", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(typeEClass, theStandardPackage.getJavaBoolean(),
				"isInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "element", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(typeEClass, theStandardPackage.getJavaBoolean(),
				"isSuperTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getType(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(typeEClass, theStandardPackage.getJavaBoolean(),
				"isEnumeration", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(traceabilityEClass, Traceability.class, "Traceability",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(traceabilityEClass_X);
		initEReference(getTraceability_EcoreModelElement(), g1, null,
				"ecoreModelElement", null, 0, 1, Traceability.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(classEClass, kermeta.language.structure.Class.class,
				"Class", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(classEClass, this.getObject(), "clone", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "objectToClone", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(classEClass, this.getObject(), "_new", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(classEClass, this.getObject(), "deepClone", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "objectToClone", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(classEClass, null, "allSuperClasses", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getSet());
		g2 = createEGenericType(this.getClass_());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(classEClass, null, "allAttributes", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		g1 = createEGenericType(theStandardPackage.getSet());
		g2 = createEGenericType(this.getProperty());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = addEOperation(classEClass, theStandardPackage.getJavaBoolean(),
				"equals", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "other", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(classEClass, theStandardPackage.getJavaString(),
				"toString", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(classEClass, null, "setLinks", 0, 1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classEClass, this.getOperation(), "getterOwnedOperation",
				0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classEClass, this.getClass_(), "getterSuperClass", 0, -1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(classEClass, theStandardPackage.getJavaBoolean(),
				"getterIsAbstract", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classEClass, theStandardPackage.getJavaString(),
				"getterName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classEClass, this.getClassDefinition(),
				"getterClassDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(classEClass, this.getProperty(), "getterOwnedAttribute",
				0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(functionTypeEClass, FunctionType.class, "FunctionType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionType_Left(), this.getType(), null, "left",
				null, 0, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionType_Right(), this.getType(), null, "right",
				null, 0, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(functionTypeEClass, theStandardPackage
				.getJavaString(), "createBehaviorJava", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parameterizedTypeEClass, ParameterizedType.class,
				"ParameterizedType", !IS_ABSTRACT, !IS_INTERFACE,
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

		op = addEOperation(parameterizedTypeEClass, theStandardPackage
				.getJavaString(), "createBehaviorJava", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(parameterizedTypeEClass, this.getClassDefinition(),
				"getClassDefinitionAsTyped", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkSetterForTypedElementEClass,
				LinkSetterForTypedElement.class, "LinkSetterForTypedElement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkSetterForTypedElement_ForceVoidTypeLink(),
				theStandardPackage.getJavaBoolean(), "forceVoidTypeLink",
				"false", 0, 1, LinkSetterForTypedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		addEOperation(linkSetterForTypedElementEClass, theStandardPackage
				.getJavaBoolean(), "mustForceVoidTypeLink", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(linkSetterForTypedElementEClass, null, "setLinks",
				0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getTypedElement(), "element", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, theEcorePackage_2.getETypedElement(),
				"ecoreModelElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), theStandardPackage
				.getJavaString(), "name", null, 1, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(namedElementEClass, theStandardPackage.getJavaString(),
				"getGenModelQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(namedElementEClass, theStandardPackage.getJavaString(),
				"getJavaQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(namedElementEClass, theStandardPackage.getJavaString(),
				"qualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(namedElementEClass, theStandardPackage.getJavaString(),
				"getGenModelJavaQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(voidTypeEClass, VoidType.class, "VoidType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(voidTypeEClass, theStandardPackage.getJavaString(),
				"createBehaviorJava", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theKm2ecorePackage.getKM2EcoreContext(), "context",
				0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(productTypeEClass, ProductType.class, "ProductType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductType_Type(), this.getType(), null, "type",
				null, 0, -1, ProductType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(productTypeEClass, this.getType(), "getTypeByIndex",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theStandardPackage.getJavaInteger(), "index", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(typeContainerEClass, TypeContainer.class, "TypeContainer",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeContainer_ContainedType(), this.getType(), this
				.getType_TypeContainer(), "containedType", null, 0, -1,
				TypeContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(typeVariableEClass, TypeVariable.class, "TypeVariable",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeVariable_Supertype(), this.getType(), null,
				"supertype", null, 0, 1, TypeVariable.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilter_QualifiedName(), theStandardPackage
				.getJavaString(), "qualifiedName", null, 0, 1, Filter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionContainerEClass,
				TypeDefinitionContainer.class, "TypeDefinitionContainer",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDefinitionContainer_OwnedTypeDefinition(), this
				.getTypeDefinition(), null, "ownedTypeDefinition", null, 0, -1,
				TypeDefinitionContainer.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyConstraintEClass, PropertyConstraint.class,
				"PropertyConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyConstraint_Property(), this.getProperty(),
				null, "property", null, 0, 1, PropertyConstraint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

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
						"/**\r\n * This Modeling Unit is used to define and store the traceability during the Km to Ecore process\r\n */" });
		addAnnotation(this, source, new String[] { "usage", "traceability" });
		addAnnotation(this, source, new String[] { "ecore", "true" });
		addAnnotation(
				this,
				source,
				new String[] {
						"documentation",
						"/**\n * Contains the concrete implementation (including the operation bodies) \n * of the classes of the <code>kermeta::reflection</code> package.\n * If you need more documentation, please take a look at the\n * <code>kermeta::reflection</code> package which is more complete.\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/language_structure_package.png\"/>\n * <img src=\"platform:/plugin/fr.irisa.triskell.kermeta.documentation/src/figures/language_structure_visitor_view.png\"/>\n */" });
		addAnnotation(constraintEClass, source, new String[] { "documentation",
				"/**\r\n *\r\n */" });
		addAnnotation(constraintEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(
				constraintEClass,
				source,
				new String[] {
						"documentation",
						"Constraint is part of a contract implementation in a Class definition or an operation.\nThree kinds of constraints are available : pre, post, and inv (invariant constraint)" });
		addAnnotation(constraintEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(constraintEClass.getEOperations().get(2), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(constraintEClass.getEOperations().get(3), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(constraintEClass.getEOperations().get(5), source,
				new String[] { "documentation",
						"/**\r\n\t * Not used for the moment\r\n\t */" });
		addAnnotation(constraintEClass.getEOperations().get(6), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(constraintEClass.getEOperations().get(7), source,
				new String[] { "documentation",
						"/**\r\n\t * Not used for the moment\r\n\t */" });
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
		addAnnotation(modelingUnitEClass, source, new String[] {
				"documentation", "/**\r\n *\r\n */" });
		addAnnotation(modelingUnitEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				modelingUnitEClass,
				source,
				new String[] {
						"documentation",
						"The modeling unit is the root of any kermeta model. It contains packages, requires and usings.\nIt also reference others modeling unit." });
		addAnnotation(
				modelingUnitEClass.getEOperations().get(1),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * We cannot use an Alias to define this indiretion because the concept of KRuntimeError does not exist\r\n\t * in framework.ecore, thus we create in this operation a new EDataType that targets the KRuntimeError Java Impl\r\n\t */" });
		addAnnotation(modelingUnitEClass.getEOperations().get(2), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(
				modelingUnitEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Compilation of super operations is only mandatory when kermeta code is using super methods from classes converted into Java interfaces\r\n\t * Super operation are declared static in Java code\r\n\t */" });
		addAnnotation(
				modelingUnitEClass.getEOperations().get(5),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get a EClassifer contained in the given Modeling Unit by qualifiedName\r\n\t */" });
		addAnnotation(
				modelingUnitEClass.getEOperations().get(6),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Remove the operations from the Ecore metamodel for the EClass ecore::EObject => avoid many conflicts\r\n\t */" });
		addAnnotation(
				modelingUnitEClass.getEOperations().get(11),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get a TypeDefinition contained in the given Modeling Unit by qualifiedName\r\n\t */" });
		addAnnotation(modelingUnitEClass.getEOperations().get(12), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(getModelingUnit_Usings(), source, new String[] { "ecore",
				"true" });
		addAnnotation(
				getModelingUnit_Usings(),
				source,
				new String[] {
						"documentation",
						"Set of \"using\" statement associated with this ModelingUnit. Ie. list of \"syntatic shortcut\"\nthat can be used within this unit." });
		addAnnotation(getModelingUnit_Packages(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getModelingUnit_Packages(), source,
				new String[] { "documentation",
						"root packages contained by this ModelingUnit" });
		addAnnotation(getModelingUnit_IncludeFilters(), source, new String[] {
				"ecore", "true" });
		addAnnotation(
				getModelingUnit_IncludeFilters(),
				source,
				new String[] {
						"documentation",
						"list of filters that apply to this modeling unit.\nThis means that if the same unit was loaded without this filters, it would have loaded more content\nonly element whose qualified name begins with one of these filter will be loaded in the unit" });
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
		addAnnotation(requireEClass, source, new String[] { "documentation",
				"/**\r\n * \r\n */" });
		addAnnotation(requireEClass, source, new String[] { "ecore", "true" });
		addAnnotation(requireEClass, source, new String[] { "documentation",
				"To be written" });
		addAnnotation(requireEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(getRequire_Uri(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getRequire_Uri(), source, new String[] { "documentation",
				"To be written" });
		addAnnotation(usingEClass, source, new String[] { "documentation",
				"/**\r\n * \r\n */" });
		addAnnotation(usingEClass, source, new String[] { "ecore", "true" });
		addAnnotation(usingEClass, source, new String[] { "documentation",
				"To be written" });
		addAnnotation(usingEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(getUsing_QualifiedName(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getUsing_QualifiedName(), source, new String[] {
				"documentation", "To be written" });
		addAnnotation(packageEClass, source, new String[] { "documentation",
				"/**\r\n *\r\n */" });
		addAnnotation(packageEClass, source, new String[] { "ecore", "true" });
		addAnnotation(
				packageEClass,
				source,
				new String[] { "documentation",
						"Package in kermeta. Each kermeta model must have a root package. " });
		addAnnotation(packageEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(packageEClass.getEOperations().get(3), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(getPackage_NestingPackage(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getPackage_NestingPackage(), source, new String[] {
				"ecore.isTransient", "true" });
		addAnnotation(getPackage_NestingPackage(), source, new String[] {
				"documentation", "Owning Package, if any" });
		addAnnotation(getPackage_NestedPackage(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getPackage_NestedPackage(), source, new String[] {
				"documentation", "Nested Packages contained by the Package" });
		addAnnotation(getPackage_Uri(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getPackage_Uri(), source, new String[] { "documentation",
				"Uri of the Package" });
		addAnnotation(primitiveTypeEClass, source, new String[] {
				"documentation", "/**\r\n *\r\n */" });
		addAnnotation(primitiveTypeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				primitiveTypeEClass,
				source,
				new String[] {
						"documentation",
						"The class definition for kermeta aliases. Above statement defines a primitive\r\ntype called MyString, which instanceType is <code>kermeta::standard::String</code>\r\n<pre>alias MyString : kermeta::standard::String</pre>. Another example could be: <code>root::apackage::AClass</code>\r\n<pre>alias MyClass : root::apackage::AClass</pre>, thus a primitive type may be not a subtype of ValueType (ValueType is a concept from the Kermeta framework)." });
		addAnnotation(primitiveTypeEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(primitiveTypeEClass.getEOperations().get(1), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(getPrimitiveType_InstanceType(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getPrimitiveType_InstanceType(), source, new String[] {
				"documentation", "The type the primitive type is linked with" });
		addAnnotation(enumerationEClass, source, new String[] {
				"documentation", "/**\r\n *\r\n */" });
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
		addAnnotation(enumerationEClass.getEOperations().get(1), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(enumerationEClass.getEOperations().get(2), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(getEnumeration_OwnedLiteral(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEnumeration_OwnedLiteral(), source, new String[] {
				"documentation", "Owned items in an Enumeration" });
		addAnnotation(enumerationLiteralEClass, source, new String[] {
				"documentation", "/**\r\n *\r\n */" });
		addAnnotation(enumerationLiteralEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(enumerationLiteralEClass, source, new String[] {
				"documentation", "Item definition for enumeration" });
		addAnnotation(enumerationLiteralEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(getEnumerationLiteral_Enumeration(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getEnumerationLiteral_Enumeration(), source,
				new String[] { "ecore.isTransient", "true" });
		addAnnotation(getEnumerationLiteral_Enumeration(), source,
				new String[] { "documentation", "Owning Enumeration" });
		addAnnotation(classDefinitionEClass, source, new String[] {
				"documentation", "/**\r\n *\r\n */" });
		addAnnotation(classDefinitionEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				classDefinitionEClass,
				source,
				new String[] {
						"documentation",
						"The definition of a class definition :)\n <pre>class A\n{ \n  attribute s : String\n}\n  </pre> is a class definition; in :\n<pre>\nmain() : A is do end\n</pre>\nA is a <b>Class</b> : it corresponds to the <b>use</b> of the class definition of A" });
		addAnnotation(classDefinitionEClass.getEOperations().get(2), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(classDefinitionEClass.getEOperations().get(3), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(
				classDefinitionEClass.getEOperations().get(7),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t\t * FIXME CF Should be optimized via the context to avoid the re-creation everytime\r\n\t\t * the ValueTypes should be discovered at runtime\r\n\t\t */" });
		addAnnotation(
				classDefinitionEClass.getEOperations().get(8),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns all the types directly and indirectly inherited by this ClasDefinition \n\t */" });
		addAnnotation(classDefinitionEClass.getEOperations().get(13), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
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
		addAnnotation(operationEClass, source, new String[] { "documentation",
				"/**\r\n *\r\n */" });
		addAnnotation(
				operationEClass,
				source,
				new String[] {
						"documentation",
						"/** We have to visit operation in order to print the result initialization and the return statement */" });
		addAnnotation(operationEClass, source, new String[] { "ecore", "true" });
		addAnnotation(operationEClass, source, new String[] { "documentation",
				"Every one knows what an operation is." });
		addAnnotation(operationEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(
				operationEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Helper method to determine if an operation has to be compiled\r\n\t */" });
		addAnnotation(operationEClass.getEOperations().get(5), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(operationEClass.getEOperations().get(6), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(
				operationEClass.getEOperations().get(9),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Return true if the given operation is a FunctionType\r\n\t */" });
		addAnnotation(
				operationEClass.getEOperations().get(10),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Compiling in Simk mode all the methods (inherited methods included) from ValueType\r\n\t */" });
		addAnnotation(operationEClass.getEOperations().get(11), source,
				new String[] { "documentation",
						"/**\r\n\t * Unused for the moment\r\n\t */" });
		addAnnotation(operationEClass.getEOperations().get(11), source,
				new String[] { "deprecated", "" });
		addAnnotation(
				operationEClass.getEOperations().get(16),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * The given operation has at least a parameter having ValueType as type\r\n\t */" });
		addAnnotation(operationEClass.getEOperations().get(17), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(getOperation_TypeParameter(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_TypeParameter(), source, new String[] {
				"documentation", "TypeParameters of the Operation" });
		addAnnotation(getOperation_Body(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getOperation_Body(), source, new String[] {
				"documentation",
				"Body of the Operation, expressed as a KerMeta expression" });
		addAnnotation(getOperation_OwnedParameter(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_OwnedParameter(), source, new String[] {
				"documentation", "Parameters of the Operation" });
		addAnnotation(getOperation_IsAbstract(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_IsAbstract(), source, new String[] {
				"documentation",
				"Boolean stating whether the Operation is abstract" });
		addAnnotation(getOperation_Post(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getOperation_Post(), source, new String[] {
				"documentation", "Post-conditions of the Operation" });
		addAnnotation(getOperation_RaisedException(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_RaisedException(), source, new String[] {
				"documentation", "Exceptions raised by the Operation" });
		addAnnotation(getOperation_Pre(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getOperation_Pre(), source, new String[] {
				"documentation", "Pre-conditions of the Operation" });
		addAnnotation(getOperation_SuperOperation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_SuperOperation(), source, new String[] {
				"documentation", "Super-operation of the Operation, if any" });
		addAnnotation(getOperation_OwningClass(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getOperation_OwningClass(), source, new String[] {
				"documentation", "ClassDefinition owning the Operation" });
		addAnnotation(parameterEClass, source, new String[] { "documentation",
				"/**\r\n *\r\n */" });
		addAnnotation(parameterEClass, source, new String[] { "ecore", "true" });
		addAnnotation(parameterEClass, source, new String[] { "documentation",
				"Definition for operation parameter" });
		addAnnotation(parameterEClass.getEOperations().get(2), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(parameterEClass.getEOperations().get(3), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(
				parameterEClass.getEOperations().get(6),
				source,
				new String[] { "documentation",
						"/**\r\n\t * Return true if the given operation is a FunctionType\r\n\t */" });
		addAnnotation(parameterEClass.getEOperations().get(7), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(getParameter_Operation(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getParameter_Operation(), source, new String[] {
				"ecore.isTransient", "true" });
		addAnnotation(getParameter_Operation(), source, new String[] {
				"documentation", "Owning operation" });
		addAnnotation(propertyEClass, source, new String[] { "documentation",
				"/**\r\n *\r\n */" });
		addAnnotation(
				propertyEClass,
				source,
				new String[] {
						"documentation",
						"/** We have to visit property in order to print the behavior of the getter and setter */" });
		addAnnotation(propertyEClass, source, new String[] { "ecore", "true" });
		addAnnotation(
				propertyEClass,
				source,
				new String[] {
						"documentation",
						"Class representing the property definition. Kermeta<->Ecore equivalence:\n - Property with isComposite == true or with type is a base type (String, Integer, Boolean)  : EAttribute\n - Property with isComposite == false : EReference" });
		addAnnotation(propertyEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(propertyEClass.getEOperations().get(1), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(propertyEClass.getEOperations().get(3), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(propertyEClass.getEOperations().get(7), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
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
		addAnnotation(getProperty_IsComposite(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getProperty_IsComposite(), source, new String[] {
				"documentation",
				"Boolean stating whether the Property has a containment role" });
		addAnnotation(getProperty_IsGetterAbstract(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getProperty_IsGetterAbstract(), source, new String[] {
				"documentation",
				"Boolean stating wether the getter is abstract." });
		addAnnotation(objectTypeVariableEClass, source, new String[] {
				"documentation", "/**\r\n *\r\n */" });
		addAnnotation(objectTypeVariableEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(objectTypeVariableEClass, source, new String[] {
				"documentation", "To be written" });
		addAnnotation(objectTypeVariableEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(objectTypeVariableEClass.getEOperations().get(1), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(tagEClass, source, new String[] { "documentation",
				"/**\r\n *\r\n */" });
		addAnnotation(tagEClass, source, new String[] { "ecore", "true" });
		addAnnotation(
				tagEClass,
				source,
				new String[] {
						"documentation",
						"Tag is intended to be used to add documentation on a  model element,\nor add some textual information that cannot be expressed with any\nmodel element definition." });
		addAnnotation(tagEClass.getEOperations().get(0), source, new String[] {
				"superOperation", "kermeta::language::structure::Object" });
		addAnnotation(getTag_Name(), source, new String[] { "ecore", "true" });
		addAnnotation(getTag_Name(), source, new String[] { "documentation",
				"Name of the Tag" });
		addAnnotation(getTag_Value(), source, new String[] { "ecore", "true" });
		addAnnotation(getTag_Value(), source, new String[] { "documentation",
				"String value of the Tag" });
		addAnnotation(getTag_Object(), source, new String[] { "ecore", "true" });
		addAnnotation(getTag_Object(), source, new String[] { "documentation",
				"Objects to which the Tag is attached to" });
		addAnnotation(objectEClass, source, new String[] { "EMF_needProperty",
				"name=oid javaClass=java.lang.Integer" });
		addAnnotation(
				objectEClass,
				source,
				new String[] {
						"EMF_needProperty",
						"name=internalContainingResource classDefinitionQN=kermeta::persistence::Resource" });
		addAnnotation(
				objectEClass,
				source,
				new String[] {
						"documentation",
						"/**\r\n *\r\n * TraceSource aspect keeps track of source information like the file name \r\n * and the line number where objects are declared. This is used for Java generation.\r\n * At runtime this information can be used for debug purpose or stack printing. \r\n *\r\n */" });
		addAnnotation(objectEClass, source, new String[] { "ecore", "true" });
		addAnnotation(
				objectEClass,
				source,
				new String[] {
						"documentation",
						"Object definition: all entities of Kermeta metamodel explicitly inherit from Object" });
		addAnnotation(
				objectEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the instanceClassName\r\n\t * \r\n\t * This is used to convert ValueTypes in EDataType and so fill the instanceClassName attribute\r\n\t *\r\n\t * The value of the tag must be a Java Class Qualified Name, eg: java.lang.String\r\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the values for the tags having as key: <key : String>\r\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(5),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Recursively runs checking of invariants defined for the metaclass of the Object\n\t * and its supertypes\n\t * Ignores derived attributes. \n\t */" });
		addAnnotation(objectEClass.getEOperations().get(5), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(6),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the Wrapprings of ValueType\'s SelfExpression for tackle the  eplacing the current one\r\n\t * \r\n\t * For ValueType Wrapper methods, if needed that is able to precise the type of self expression\r\n\t * the self expression is added by default in the Wrapper method signature\r\n\t *\r\n\t * Value is like this: java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object\r\n\t * A binding must be defined for each ValueType\r\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(8),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the EMF_needProperty\r\n\t *\r\n\t * Better solution than creating aspects because end-user should not have knowledge of that through reflexivity\r\n\t * Properties are then created in the Ecore file only\r\n\t *\r\n\t * This tag is complex, i.e.: with 2 values: name and javaClass/classDefinitionQN\r\n\t * - javaClass is used when the expected type is a Java CLass\r\n\t * - classDefinitionQN is used when the expected type is a ClassDefinition\r\n\t *\r\n\t * Example with javaClass: the Collection class definition needs a new reference for representing a Java Native collection\r\n\t * the tag is like: @EMF_needProperty \"name=values javaClass=org.eclipse.emf.common.util.EList\"\r\n\t * \r\n\t * Example with classDefinitionQN: the Object class definition needs at runtime a reference for storing the internalContainingResource\r\n\t * the tag is like: @EMF_needProperty \"name=internalContainingResource classDefinitionQN=kermeta::persistence::Resource\"\r\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(9),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the deprecated tag\r\n\t * Specific method for detecting the deprecated model elements\r\n\t * \r\n\t * Not really used in the rest of the impl.\r\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(10), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(10),
				source,
				new String[] {
						"documentation",
						"/**\n\t * True if the <code>~property</code> of the object has been set\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(12),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the Wrapprings of ValueType\'s ReturnType for tackle the  eplacing the current one\r\n\t * \r\n\t * For ValueType Wrapper methods, if needed that is able to precise the return type\r\n\t *\r\n\t * Value is like this: java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object\r\n\t * A binding must be defined for each ValueType\r\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(13),
				source,
				new String[] {
						"WrapperValueTypeReturnType",
						"java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object" });
		addAnnotation(objectEClass.getEOperations().get(13), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(13),
				source,
				new String[] {
						"documentation",
						"/** \n\t * Returns the instances of the given property for this Object.\n\t *\n\t * Example : \n\t * <pre>\n\t * class A { reference attr : String }\n\t * </pre>\n\t * Using A :\n\t * <pre>\n\t * operation getAProp() is do\n\t *    var a : A\n\t *    var s : String\n\t *    var the_attr : Property init self.getMetaClass.ownedAttribute.one\n\t *    s ?= a.get(the_attr)\n\t * end\n\t * </pre>\n\t * The user has to cast\n\t * the result of this method according to the type and the upper multiplicity\n\t * of this property. If upper multiplicity > 1, than the effective type of the \n\t * result is a Sequence<ThePropertyName>. Otherwise, the type corresponds to \n\t * the name of the given Property (i.e the type of the property instance).\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(14),
				source,
				new String[] {
						"documentation",
						"/**\n\t * semantic equality,\n\t * if you wish to test for object identity you need to use the method oid\n\t * ex: x.oid == y.oid\n\t * by default, (ie. if not overloaded), the equals method for class Object implements \n\t * the most discriminating possible equivalence relation on objects; that is, for any non-null \n\t * reference values x and y, this method returns true if and only if x and y refer to the same \n\t * object (x.oid == y.oid has the value true). \n\t *\n\t * note1: the operator == is mapped to this \n\t * note2: overloading this operation have some impact on the behavior on collection and hashtable that rely on it\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(14), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(15),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the isTransient\r\n\t *\r\n\t * Value is true or false\r\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(16),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Checks all the invariants for this object and return a complete diagnostic.\n\t * This also includes the structural constraints associated to the properties.\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(17),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the EDataType_isSerializable\r\n\t *\r\n\t * Value is true or false\r\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(18),
				source,
				new String[] {
						"WrapperValueTypeReturnType",
						"java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object" });
		addAnnotation(objectEClass.getEOperations().get(18), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(18),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns the Object that contains current Object, void if the Object has\n\t * no container\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(19), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(19),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Remove the element set as the <code>~property</code> of the object.\n\t * The <code>isSet(~property)</code> method will then return False\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(20),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns the Resource currently containing (directly or indirectly) the Object \n\t * or void if the object belongs to no Resource\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(20), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(objectEClass.getEOperations().get(21), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(21),
				source,
				new String[] {
						"documentation",
						"/**\n \t * Implements Object.toString()\n \t * Returns a String of form [qn:oid] where \'qn\' is the qualified name of\n \t * the object type, and oid the unique ID of the object\n \t */" });
		addAnnotation(
				objectEClass.getEOperations().get(22),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Checks a constraint invariant defined for the metaclass of the Object\n\t * You can use PropertyConstraint for checking structural constraints associated to a property\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(23), source,
				new String[] { "documentation", "/** Super method */" });
		addAnnotation(
				objectEClass.getEOperations().get(24),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Interpret boolean tags, thus retruns true or false the given tag has got a value like: \"true\" or \"false\"\r\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(25), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(25),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a Boolean stating whether the current Object is an instance of the given Class\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(26),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns the Class object that is the metaclass of current Object\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(26), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(27),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Sets the <code>element</code> to the <code>~property</code> of the object \n\t */" });
		addAnnotation(objectEClass.getEOperations().get(27), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(28),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the EDataType_instanceClassName\r\n\t * \r\n\t * This used to declare if the element is an EDataType in the Ecore model side\r\n\t *\r\n\t * The value of the tag must be a Java Class Qualified Name, eg: java.lang.String\r\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(30),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Runs checking of invariants defined for the metaclass of the Object\n\t * Also check the multiplicity of attributes (except derived and transient attributes)\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(30), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(31),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the defaultConstructor\r\n\t * \r\n\t * For Value Types the default constructor are not in general TheType() like for Integer: Integer(0),\r\n\t * thus we cannot have at priori a predefined way for generating these constructors\r\n\t *\r\n\t * The value of the tag must be a Java Class Qualified Name, eg: java.lang.String\r\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(32), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(32),
				source,
				new String[] { "documentation",
						"/**\n\t * Returns a Boolean stating whether the Object is Void\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(33),
				source,
				new String[] { "documentation",
						"/**\n\t * Returns the unique Oid of the Object\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(33), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(objectEClass.getEOperations().get(34), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(34),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a Boolean stating whether the current Object conforms to given Type\n\t * This means: is this object an instance of this type, or is it an instance of its subtype \n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(35),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the compiledJavaExtern call for replacing the current one\r\n\t * \r\n\t * Represents the static call in compiled mode\r\n\t *\r\n\t * The value of the tag must be like a Java Static Call, eg: org.kermeta.compil.runtime.helper.basetypes.CollectionUtil.add(this, element)\r\n\t * without the \";\" at the end, \";\" is added automatically\r\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(37), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(37),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a Boolean stating whether the Object is currently in a\n\t * frozen state\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(38), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(38),
				source,
				new String[] {
						"documentation",
						"/**\n\t * code used in hashtable in order to identify an object in the hashtable keys\n\t * This system is similar to the hashcode used in java. Please refer to java documentation\n\t * for more information about hashcode\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(41),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the values for the tags having as key: <key : String>\r\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(42),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the the final Java Class Qualified Name\r\n\t *\r\n\t * Used for the POJO creation\r\n\t * \r\n\t * Value is like this: a Java Class Qualified Name\r\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(44), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(44),
				source,
				new String[] { "documentation",
						"/**\n\t * See kermeta::language::structure::Object.equals(Object)\n\t */" });
		addAnnotation(objectEClass.getEOperations().get(45), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(objectEClass.getEOperations().get(45), source,
				new String[] { "documentation",
						"/**\n\t * Freeze the Object\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(46),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the EDataType_eTypeParameters\r\n\t * \r\n\t * This used to store the ETypeParameters in the Ecore model side\r\n\t * \r\n\t * The value of the tag must be ETypeParameters separated by \" , \"\r\n\t */" });
		addAnnotation(
				objectEClass.getEOperations().get(47),
				source,
				new String[] {
						"WrapperValueTypeReturnType",
						"java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object" });
		addAnnotation(
				objectEClass.getEOperations().get(47),
				source,
				new String[] {
						"WrapperValueTypeSelfExpression",
						"java.lang.String=kermeta.language.structure.Object java.lang.Boolean=kermeta.language.structure.Object java.lang.Integer=kermeta.language.structure.Object java.lang.Double=kermeta.language.structure.Object java.lang.Character=kermeta.language.structure.Object java.lang.Number=kermeta.language.structure.Object" });
		addAnnotation(objectEClass.getEOperations().get(47), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				objectEClass.getEOperations().get(47),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Implementation of OCL like cast. It returns self if the object object conforms to the type given as parameter.\n\t */" });
		addAnnotation(getObject_Tag(), source, new String[] { "ecore", "true" });
		addAnnotation(
				getObject_Tag(),
				source,
				new String[] {
						"documentation",
						"An Object can be tagged by a Tag. \nThey are typically used to put comments/documentation on the object" });
		addAnnotation(getObject_File(), source, new String[] { "documentation",
				"/** The calculated kmt file */" });
		addAnnotation(getObject_FileName(), source, new String[] {
				"documentation",
				"/** The kmt file that declares the object. */" });
		addAnnotation(
				getObject_LineNumber(),
				source,
				new String[] { "documentation",
						"/** The line number where the object is declared in the source file. */" });
		addAnnotation(getObject_OwnedTags(), source, new String[] { "ecore",
				"true" });
		addAnnotation(
				getObject_OwnedTags(),
				source,
				new String[] {
						"documentation",
						"An object can contains a Tag.  \nBe careful, owning a tag doesn\'t means that the tag applies to the Object\nTo know which Tags apply to the object use the \"tag\" reference" });
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
		addAnnotation(multiplicityElementEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(
				multiplicityElementEClass,
				source,
				new String[] { "documentation",
						" Model elements with a multiplicity [lower..upper] inherit this class" });
		addAnnotation(
				multiplicityElementEClass.getEOperations().get(0),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the RecopyInValueTypes reference of an Operation\r\n\t * \r\n\t * For example, recopy the behavior from Object.getMetaClass() in the ValueType Wrapper.\r\n\t * This is needed because the super operation call is broken by the usage of Java primitive types instead of kermeta::standard types\r\n\t * (Java primitive types do not inherit from kermeta::language::structure::Object)\r\n\t */" });
		addAnnotation(
				multiplicityElementEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Get the EMFRenameAs reference of an Operation\r\n\t * \r\n\t * This tag is used to rename the operation at compilation time if its name is conflicting\r\n\t * with EMF name, i.e.: if the user is using a property named \"log\" and operations named \"getLog\" or \"setLog\",\r\n\t * thus the operation\'s names will conflict with the generated getter and setter for log by EMF, i.e.: \"getLog\" and \"setLog\"\r\n\t * This tag is taking into account if the user defines it, but if a potential conflict is present then\r\n\t * the Kermeta loader adds automatically this tag\r\n\t */" });
		addAnnotation(
				multiplicityElementEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/** Generation of the String representing the end of a method: return of the result value */" });
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
		addAnnotation(typeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(typeEClass, source, new String[] { "documentation",
				"Alias to kermeta::standard::Integer" });
		addAnnotation(typeEClass, source, new String[] { "documentation",
				"Base class definition for the <b>use</b> of a type." });
		addAnnotation(typeEClass.getEOperations().get(1), source, new String[] {
				"superOperation", "kermeta::language::structure::Object" });
		addAnnotation(typeEClass.getEOperations().get(2), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(
				typeEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a copy of passed Object built by recursively copying attribute\n\t * properties, and referencing original reference properties values\n\t */" });
		addAnnotation(typeEClass.getEOperations().get(3), source, new String[] {
				"isAbstract", "true" });
		addAnnotation(
				typeEClass.getEOperations().get(3),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns a copy of passed Object built by recursively copying values of\n\t * all properties, no matter the property kind\n\t */" });
		addAnnotation(
				typeEClass.getEOperations().get(4),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Tests whether the Type t corresponds to the Kermeta Boolean type, which can be encoded\r\n\t * either as the Boolean PrimitiveType or the Boolean class.\r\n\t * @param t : Type\r\n\t * @return true or false\r\n\t */" });
		addAnnotation(
				typeEClass.getEOperations().get(8),
				source,
				new String[] {
						"documentation",
						"/**\r\n\t * Tests whether the Type t corresponds to a Kermeta numerical type, which can be encoded\r\n\t * either as the Integer/Real PrimitiveType or the Integer/Real class.\r\n\t * @param t : Type\r\n\t * @return true or false\r\n\t */" });
		addAnnotation(typeEClass.getEOperations().get(11), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				typeEClass.getEOperations().get(11),
				source,
				new String[] {
						"documentation",
						"/**\n \t * Implements Type.isSubTypeOf(Type)\n \t * For technical reason, the current implementation works only with Type that comes from a kermeta declaration (ie. in a require)\n \t * it won\'t work with Type created programmaticaly by the user. If you need that, please ask to the kermeta developpers\n \t * to extend it.\n \t */" });
		addAnnotation(typeEClass.getEOperations().get(13), source,
				new String[] { "documentation",
						"/**\n\t * Implements Type.isInstance(Object)\n\t */" });
		addAnnotation(typeEClass.getEOperations().get(13), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(typeEClass.getEOperations().get(14), source,
				new String[] { "RecopyInValueTypes", "true" });
		addAnnotation(
				typeEClass.getEOperations().get(14),
				source,
				new String[] {
						"documentation",
						"/**\n \t * Implements Type.isSuperTypeOf(Type)\n \t * For technical reason, the current implementation works only with Type that comes from a kermeta declaration (ie. in a require)\n \t * it won\'t work with Type created programmaticaly by the user. If you need that, please ask to the kermeta developpers\n \t * to extend it.\n \t */" });
		addAnnotation(getType_TypeContainer(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getType_TypeContainer(), source, new String[] {
				"documentation", "Owning TypeContainer, if any" });
		addAnnotation(classEClass, source, new String[] { "ecore", "true" });
		addAnnotation(
				classEClass,
				source,
				new String[] {
						"documentation",
						"Returns the Attributes, References, and derived Properties owned by\nthe ClassDefinition of this Class." });
		addAnnotation(classEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Type" });
		addAnnotation(
				classEClass.getEOperations().get(1),
				source,
				new String[] { "documentation",
						"/**\n\t * Instantiates a new occurence for this Class\n\t */" });
		addAnnotation(classEClass.getEOperations().get(2), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Type" });
		addAnnotation(classEClass.getEOperations().get(3), source,
				new String[] { "documentation",
						"/** Never used for the moment */" });
		addAnnotation(classEClass.getEOperations().get(4), source,
				new String[] { "documentation",
						"/** Never used for the moment */" });
		addAnnotation(classEClass.getEOperations().get(5), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(
				classEClass.getEOperations().get(6),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns the String representation of this class. \n\t *  Note : throws an exception if this class has no classDefinition\n\t *  or if the classDefinition is not well constructed.\n\t */" });
		addAnnotation(classEClass.getEOperations().get(6), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Object" });
		addAnnotation(functionTypeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				functionTypeEClass,
				source,
				new String[] {
						"documentation",
						"Type used to define the use of lambda expressions.\n Uses :\n <pre>operation forAll(func : <G -> Boolean>) : Boolean is do\n     var test : Boolean init true\n     from var it : Iterator<G> init iterator\n     until it.isOff\n     loop\n        test := test and func(it.next)\n     end\n     result := test\n end\n </pre>\n *\n In the above example, &lt;G -> Boolean&gt; is a function type f(G) -&gt; \n Boolean, with a parameter of type G and a return type of type Boolean\n The operation <code>forAll</code> takes a lambda expression as parameter." });
		addAnnotation(functionTypeEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Type" });
		addAnnotation(getFunctionType_Left(), source, new String[] { "ecore",
				"true" });
		addAnnotation(
				getFunctionType_Left(),
				source,
				new String[] { "documentation",
						"Parameters of the function (a ProductType for multiple parameters)" });
		addAnnotation(getFunctionType_Right(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getFunctionType_Right(), source, new String[] {
				"documentation", "Result type of the function" });
		addAnnotation(parameterizedTypeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				parameterizedTypeEClass,
				source,
				new String[] { "documentation",
						"Abstraction for Parameterized types, namely, Class and ModelType" });
		addAnnotation(parameterizedTypeEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Type" });
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
		addAnnotation(namedElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(
				namedElementEClass,
				source,
				new String[] {
						"documentation",
						"Any element that contain a  name (example : Operation, Property) inherit this\nclass." });
		addAnnotation(
				namedElementEClass.getEOperations().get(2),
				source,
				new String[] {
						"documentation",
						"/**\n\t * Returns the qualified name of this named element. Qualified name is \n\t * the list of the names of the packages hierarchically ordered, delimited by\n\t * a \"::\", followed by the name of this named element.\n\t */" });
		addAnnotation(getNamedElement_Name(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getNamedElement_Name(), source, new String[] {
				"documentation", "Name of this named element" });
		addAnnotation(voidTypeEClass, source, new String[] { "documentation",
				"/** Complete */" });
		addAnnotation(voidTypeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(voidTypeEClass, source, new String[] { "documentation",
				"Class definition for the <pre>Void</pre> type" });
		addAnnotation(voidTypeEClass.getEOperations().get(0), source,
				new String[] { "superOperation",
						"kermeta::language::structure::Type" });
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
		addAnnotation(stringEDataType, source, new String[] { "alias",
				"kermeta::standard::String" });
		addAnnotation(stringEDataType, source, new String[] { "ecore", "true" });
		addAnnotation(booleanEDataType, source, new String[] { "alias",
				"kermeta::standard::Boolean" });
		addAnnotation(booleanEDataType, source,
				new String[] { "ecore", "true" });
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
		addAnnotation(constraintTypeEEnum, source, new String[] { "ecore",
				"true" });
		addAnnotation(constraintLanguageEEnum, source, new String[] { "ecore",
				"true" });
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
		addAnnotation(
				getPropertyConstraint_Property(),
				source,
				new String[] {
						"documentation",
						"/**\n\t * The property that is checked by this constraint\n\t * Typically, it will check the lower and upper bounds\n\t */" });
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
