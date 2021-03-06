/**
 * License: EPL
 * Copyright: IRISA / INRIA / Universite de Rennes 1
 * 
 * Generated with Kermeta <http://www.kermeta.org>
 *
 * $Id$
 */
package ecore.impl;

import ecore.EAnnotation;
import ecore.EClassifier;
import ecore.EEnum;
import ecore.EEnumLiteral;
import ecore.EFactory;
import ecore.EModelElement;
import ecore.ENamedElement;
import ecore.EObject;
import ecore.EParameter;
import ecore.EStringToStringMapEntry;
import ecore.EStructuralFeature;
import ecore.ETypeParameter;
import ecore.ETypedElement;
import ecore.EcoreFactory;
import ecore.EcorePackage;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Date;
import java.util.Map;

import kermeta.KermetaPackage;

import kermeta.compiler.CompilerPackage;

import kermeta.compiler.impl.CompilerPackageImpl;

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

import km2ecore.Km2ecorePackage;

import km2ecore.common.CommonPackage;

import km2ecore.common.exception.ExceptionPackage;

import km2ecore.common.exception.impl.ExceptionPackageImpl;

import km2ecore.common.impl.CommonPackageImpl;

import km2ecore.helper.java.JavaPackage;

import km2ecore.helper.java.impl.JavaPackageImpl;

import km2ecore.impl.Km2ecorePackageImpl;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.FeatureMap;

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
public class EcorePackageImpl extends EPackageImpl implements EcorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFactoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStringToStringMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eGenericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eTypeParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBooleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eJavaClassEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eJavaObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eEnumeratorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBigDecimalEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBigIntegerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eBooleanObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eByteObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eCharEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eCharacterObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDateEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDiagnosticChainEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDoubleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDoubleObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eeListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFeatureMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFeatureMapEntryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFloatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eFloatObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eIntegerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eLongEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eLongObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eMapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eResourceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eResourceSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eShortEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eShortObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eTreeIteratorEDataType = null;

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
	 * @see ecore.EcorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcorePackageImpl() {
		super(eNS_URI, EcoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EcorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcorePackage init() {
		if (isInited)
			return (EcorePackage) EPackage.Registry.INSTANCE
					.getEPackage(EcorePackage.eNS_URI);

		// Obtain or create and register package
		EcorePackageImpl theEcorePackage = (EcorePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof EcorePackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI)
				: new EcorePackageImpl());

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
		kermeta.ecore.impl.EcorePackageImpl theEcorePackage_1 = (kermeta.ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(kermeta.ecore.EcorePackage.eNS_URI) instanceof kermeta.ecore.impl.EcorePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(kermeta.ecore.EcorePackage.eNS_URI)
				: kermeta.ecore.EcorePackage.eINSTANCE);
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
		km2ecore.helper.ecore.impl.EcorePackageImpl theEcorePackage_2 = (km2ecore.helper.ecore.impl.EcorePackageImpl) (EPackage.Registry.INSTANCE
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
		SimkPackageImpl theSimkPackage = (SimkPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI) instanceof SimkPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(SimkPackage.eNS_URI)
				: SimkPackage.eINSTANCE);

		// Create package meta-data objects
		theEcorePackage.createPackageContents();
		theKermetaPackage.createPackageContents();
		theLanguagePackage.createPackageContents();
		theStructurePackage.createPackageContents();
		theBehaviorPackage.createPackageContents();
		theStandardPackage.createPackageContents();
		theUtilsPackage.createPackageContents();
		theXmltypePackage.createPackageContents();
		theCompilerPackage.createPackageContents();
		theKunitPackage.createPackageContents();
		theExceptionsPackage.createPackageContents();
		theInterpreterPackage.createPackageContents();
		thePersistencePackage.createPackageContents();
		theEcorePackage_1.createPackageContents();
		theIoPackage.createPackageContents();
		theKm2ecorePackage.createPackageContents();
		theKermetaPackage_1.createPackageContents();
		theEcorePackage_2.createPackageContents();
		theJavaPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theExceptionPackage.createPackageContents();
		theTraceabilityPackage.createPackageContents();
		theSimkPackage.createPackageContents();

		// Initialize created meta-data
		theEcorePackage.initializePackageContents();
		theKermetaPackage.initializePackageContents();
		theLanguagePackage.initializePackageContents();
		theStructurePackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();
		theStandardPackage.initializePackageContents();
		theUtilsPackage.initializePackageContents();
		theXmltypePackage.initializePackageContents();
		theCompilerPackage.initializePackageContents();
		theKunitPackage.initializePackageContents();
		theExceptionsPackage.initializePackageContents();
		theInterpreterPackage.initializePackageContents();
		thePersistencePackage.initializePackageContents();
		theEcorePackage_1.initializePackageContents();
		theIoPackage.initializePackageContents();
		theKm2ecorePackage.initializePackageContents();
		theKermetaPackage_1.initializePackageContents();
		theEcorePackage_2.initializePackageContents();
		theJavaPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theExceptionPackage.initializePackageContents();
		theTraceabilityPackage.initializePackageContents();
		theSimkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, theEcorePackage);
		return theEcorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAttribute() {
		return eAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAttribute_ID() {
		return (EAttribute) eAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAnnotation() {
		return eAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_References() {
		return (EReference) eAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAnnotation_Source() {
		return (EAttribute) eAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_Details() {
		return (EReference) eAnnotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_Contents() {
		return (EReference) eAnnotationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAnnotation_EModelElement() {
		return (EReference) eAnnotationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return eClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EStructuralFeatures() {
		return (EReference) eClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClass__abstract() {
		return (EAttribute) eClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EOperations() {
		return (EReference) eClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClass__interface() {
		return (EAttribute) eClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_ESuperTypes() {
		return (EReference) eClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClass_EGenericSuperTypes() {
		return (EReference) eClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClassifier() {
		return eClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassifier_InstanceClassName() {
		return (EAttribute) eClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassifier_EPackage() {
		return (EReference) eClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEClassifier_ETypeParameters() {
		return (EReference) eClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEClassifier_InstanceTypeName() {
		return (EAttribute) eClassifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDataType() {
		return eDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDataType_Serializable() {
		return (EAttribute) eDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEnum() {
		return eEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEnum_ELiterals() {
		return (EReference) eEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEEnumLiteral() {
		return eEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEEnumLiteral_EEnum() {
		return (EReference) eEnumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEnumLiteral_Value() {
		return (EAttribute) eEnumLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEnumLiteral_Instance() {
		return (EAttribute) eEnumLiteralEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEEnumLiteral_Literal() {
		return (EAttribute) eEnumLiteralEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFactory() {
		return eFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFactory_EPackage() {
		return (EReference) eFactoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEModelElement() {
		return eModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEModelElement_EAnnotations() {
		return (EReference) eModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENamedElement() {
		return eNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENamedElement_Name() {
		return (EAttribute) eNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEObject() {
		return eObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEOperation() {
		return eOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EContainingClass() {
		return (EReference) eOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EGenericExceptions() {
		return (EReference) eOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EParameters() {
		return (EReference) eOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_ETypeParameters() {
		return (EReference) eOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEOperation_EExceptions() {
		return (EReference) eOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPackage() {
		return ePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPackage_NsURI() {
		return (EAttribute) ePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_ESubpackages() {
		return (EReference) ePackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_ESuperPackage() {
		return (EReference) ePackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPackage_NsPrefix() {
		return (EAttribute) ePackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_EFactoryInstance() {
		return (EReference) ePackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEPackage_EClassifiers() {
		return (EReference) ePackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEParameter() {
		return eParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEParameter_EOperation() {
		return (EReference) eParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEReference() {
		return eReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference_EOpposite() {
		return (EReference) eReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReference_ResolveProxies() {
		return (EAttribute) eReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference_EKeys() {
		return (EReference) eReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEReference_Containment() {
		return (EAttribute) eReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStructuralFeature() {
		return eStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature__volatile() {
		return (EAttribute) eStructuralFeatureEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_DefaultValueLiteral() {
		return (EAttribute) eStructuralFeatureEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStructuralFeature_EContainingClass() {
		return (EReference) eStructuralFeatureEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature__transient() {
		return (EAttribute) eStructuralFeatureEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Unsettable() {
		return (EAttribute) eStructuralFeatureEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Derived() {
		return (EAttribute) eStructuralFeatureEClass.getEStructuralFeatures()
				.get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStructuralFeature_Changeable() {
		return (EAttribute) eStructuralFeatureEClass.getEStructuralFeatures()
				.get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETypedElement() {
		return eTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_LowerBound() {
		return (EAttribute) eTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_Unique() {
		return (EAttribute) eTypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETypedElement_EType() {
		return (EReference) eTypedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_Ordered() {
		return (EAttribute) eTypedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getETypedElement_UpperBound() {
		return (EAttribute) eTypedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETypedElement_EGenericType() {
		return (EReference) eTypedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStringToStringMapEntry() {
		return eStringToStringMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToStringMapEntry_Value() {
		return (EAttribute) eStringToStringMapEntryEClass
				.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToStringMapEntry_Key() {
		return (EAttribute) eStringToStringMapEntryEClass
				.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEGenericType() {
		return eGenericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_EUpperBound() {
		return (EReference) eGenericTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_ETypeArguments() {
		return (EReference) eGenericTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_EClassifier() {
		return (EReference) eGenericTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_ETypeParameter() {
		return (EReference) eGenericTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEGenericType_ELowerBound() {
		return (EReference) eGenericTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getETypeParameter() {
		return eTypeParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getETypeParameter_EBounds() {
		return (EReference) eTypeParameterEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBoolean() {
		return eBooleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEString() {
		return eStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEJavaClass() {
		return eJavaClassEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEJavaObject() {
		return eJavaObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEInt() {
		return eIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEEnumerator() {
		return eEnumeratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBigDecimal() {
		return eBigDecimalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBigInteger() {
		return eBigIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEBooleanObject() {
		return eBooleanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEByte() {
		return eByteEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEByteArray() {
		return eByteArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEByteObject() {
		return eByteObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEChar() {
		return eCharEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getECharacterObject() {
		return eCharacterObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDate() {
		return eDateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDiagnosticChain() {
		return eDiagnosticChainEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDouble() {
		return eDoubleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDoubleObject() {
		return eDoubleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEEList() {
		return eeListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFeatureMap() {
		return eFeatureMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFeatureMapEntry() {
		return eFeatureMapEntryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFloat() {
		return eFloatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEFloatObject() {
		return eFloatObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEIntegerObject() {
		return eIntegerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getELong() {
		return eLongEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getELongObject() {
		return eLongObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEMap() {
		return eMapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEResource() {
		return eResourceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEResourceSet() {
		return eResourceSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEShort() {
		return eShortEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEShortObject() {
		return eShortObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getETreeIterator() {
		return eTreeIteratorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreFactory getEcoreFactory() {
		return (EcoreFactory) getEFactoryInstance();
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
		eAttributeEClass = createEClass(EATTRIBUTE);
		createEAttribute(eAttributeEClass, EATTRIBUTE__ID);

		eAnnotationEClass = createEClass(EANNOTATION);
		createEReference(eAnnotationEClass, EANNOTATION__REFERENCES);
		createEAttribute(eAnnotationEClass, EANNOTATION__SOURCE);
		createEReference(eAnnotationEClass, EANNOTATION__DETAILS);
		createEReference(eAnnotationEClass, EANNOTATION__CONTENTS);
		createEReference(eAnnotationEClass, EANNOTATION__EMODEL_ELEMENT);

		eClassEClass = createEClass(ECLASS);
		createEReference(eClassEClass, ECLASS__ESTRUCTURAL_FEATURES);
		createEAttribute(eClassEClass, ECLASS__ABSTRACT);
		createEReference(eClassEClass, ECLASS__EOPERATIONS);
		createEAttribute(eClassEClass, ECLASS__INTERFACE);
		createEReference(eClassEClass, ECLASS__ESUPER_TYPES);
		createEReference(eClassEClass, ECLASS__EGENERIC_SUPER_TYPES);

		eClassifierEClass = createEClass(ECLASSIFIER);
		createEAttribute(eClassifierEClass, ECLASSIFIER__INSTANCE_CLASS_NAME);
		createEReference(eClassifierEClass, ECLASSIFIER__EPACKAGE);
		createEReference(eClassifierEClass, ECLASSIFIER__ETYPE_PARAMETERS);
		createEAttribute(eClassifierEClass, ECLASSIFIER__INSTANCE_TYPE_NAME);

		eDataTypeEClass = createEClass(EDATA_TYPE);
		createEAttribute(eDataTypeEClass, EDATA_TYPE__SERIALIZABLE);

		eEnumEClass = createEClass(EENUM);
		createEReference(eEnumEClass, EENUM__ELITERALS);

		eEnumLiteralEClass = createEClass(EENUM_LITERAL);
		createEReference(eEnumLiteralEClass, EENUM_LITERAL__EENUM);
		createEAttribute(eEnumLiteralEClass, EENUM_LITERAL__VALUE);
		createEAttribute(eEnumLiteralEClass, EENUM_LITERAL__INSTANCE);
		createEAttribute(eEnumLiteralEClass, EENUM_LITERAL__LITERAL);

		eFactoryEClass = createEClass(EFACTORY);
		createEReference(eFactoryEClass, EFACTORY__EPACKAGE);

		eModelElementEClass = createEClass(EMODEL_ELEMENT);
		createEReference(eModelElementEClass, EMODEL_ELEMENT__EANNOTATIONS);

		eNamedElementEClass = createEClass(ENAMED_ELEMENT);
		createEAttribute(eNamedElementEClass, ENAMED_ELEMENT__NAME);

		eObjectEClass = createEClass(EOBJECT);

		eOperationEClass = createEClass(EOPERATION);
		createEReference(eOperationEClass, EOPERATION__ECONTAINING_CLASS);
		createEReference(eOperationEClass, EOPERATION__EGENERIC_EXCEPTIONS);
		createEReference(eOperationEClass, EOPERATION__EPARAMETERS);
		createEReference(eOperationEClass, EOPERATION__ETYPE_PARAMETERS);
		createEReference(eOperationEClass, EOPERATION__EEXCEPTIONS);

		ePackageEClass = createEClass(EPACKAGE);
		createEAttribute(ePackageEClass, EPACKAGE__NS_URI);
		createEReference(ePackageEClass, EPACKAGE__ESUBPACKAGES);
		createEReference(ePackageEClass, EPACKAGE__ESUPER_PACKAGE);
		createEAttribute(ePackageEClass, EPACKAGE__NS_PREFIX);
		createEReference(ePackageEClass, EPACKAGE__EFACTORY_INSTANCE);
		createEReference(ePackageEClass, EPACKAGE__ECLASSIFIERS);

		eParameterEClass = createEClass(EPARAMETER);
		createEReference(eParameterEClass, EPARAMETER__EOPERATION);

		eReferenceEClass = createEClass(EREFERENCE);
		createEReference(eReferenceEClass, EREFERENCE__EOPPOSITE);
		createEAttribute(eReferenceEClass, EREFERENCE__RESOLVE_PROXIES);
		createEReference(eReferenceEClass, EREFERENCE__EKEYS);
		createEAttribute(eReferenceEClass, EREFERENCE__CONTAINMENT);

		eStructuralFeatureEClass = createEClass(ESTRUCTURAL_FEATURE);
		createEAttribute(eStructuralFeatureEClass,
				ESTRUCTURAL_FEATURE__VOLATILE);
		createEAttribute(eStructuralFeatureEClass,
				ESTRUCTURAL_FEATURE__DEFAULT_VALUE_LITERAL);
		createEReference(eStructuralFeatureEClass,
				ESTRUCTURAL_FEATURE__ECONTAINING_CLASS);
		createEAttribute(eStructuralFeatureEClass,
				ESTRUCTURAL_FEATURE__TRANSIENT);
		createEAttribute(eStructuralFeatureEClass,
				ESTRUCTURAL_FEATURE__UNSETTABLE);
		createEAttribute(eStructuralFeatureEClass, ESTRUCTURAL_FEATURE__DERIVED);
		createEAttribute(eStructuralFeatureEClass,
				ESTRUCTURAL_FEATURE__CHANGEABLE);

		eTypedElementEClass = createEClass(ETYPED_ELEMENT);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__LOWER_BOUND);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__UNIQUE);
		createEReference(eTypedElementEClass, ETYPED_ELEMENT__ETYPE);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__ORDERED);
		createEAttribute(eTypedElementEClass, ETYPED_ELEMENT__UPPER_BOUND);
		createEReference(eTypedElementEClass, ETYPED_ELEMENT__EGENERIC_TYPE);

		eStringToStringMapEntryEClass = createEClass(ESTRING_TO_STRING_MAP_ENTRY);
		createEAttribute(eStringToStringMapEntryEClass,
				ESTRING_TO_STRING_MAP_ENTRY__VALUE);
		createEAttribute(eStringToStringMapEntryEClass,
				ESTRING_TO_STRING_MAP_ENTRY__KEY);

		eGenericTypeEClass = createEClass(EGENERIC_TYPE);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__EUPPER_BOUND);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__ETYPE_ARGUMENTS);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__ECLASSIFIER);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__ETYPE_PARAMETER);
		createEReference(eGenericTypeEClass, EGENERIC_TYPE__ELOWER_BOUND);

		eTypeParameterEClass = createEClass(ETYPE_PARAMETER);
		createEReference(eTypeParameterEClass, ETYPE_PARAMETER__EBOUNDS);

		// Create data types
		eBooleanEDataType = createEDataType(EBOOLEAN);
		eStringEDataType = createEDataType(ESTRING);
		eJavaClassEDataType = createEDataType(EJAVA_CLASS);
		eJavaObjectEDataType = createEDataType(EJAVA_OBJECT);
		eIntEDataType = createEDataType(EINT);
		eEnumeratorEDataType = createEDataType(EENUMERATOR);
		eBigDecimalEDataType = createEDataType(EBIG_DECIMAL);
		eBigIntegerEDataType = createEDataType(EBIG_INTEGER);
		eBooleanObjectEDataType = createEDataType(EBOOLEAN_OBJECT);
		eByteEDataType = createEDataType(EBYTE);
		eByteArrayEDataType = createEDataType(EBYTE_ARRAY);
		eByteObjectEDataType = createEDataType(EBYTE_OBJECT);
		eCharEDataType = createEDataType(ECHAR);
		eCharacterObjectEDataType = createEDataType(ECHARACTER_OBJECT);
		eDateEDataType = createEDataType(EDATE);
		eDiagnosticChainEDataType = createEDataType(EDIAGNOSTIC_CHAIN);
		eDoubleEDataType = createEDataType(EDOUBLE);
		eDoubleObjectEDataType = createEDataType(EDOUBLE_OBJECT);
		eeListEDataType = createEDataType(EE_LIST);
		eFeatureMapEDataType = createEDataType(EFEATURE_MAP);
		eFeatureMapEntryEDataType = createEDataType(EFEATURE_MAP_ENTRY);
		eFloatEDataType = createEDataType(EFLOAT);
		eFloatObjectEDataType = createEDataType(EFLOAT_OBJECT);
		eIntegerObjectEDataType = createEDataType(EINTEGER_OBJECT);
		eLongEDataType = createEDataType(ELONG);
		eLongObjectEDataType = createEDataType(ELONG_OBJECT);
		eMapEDataType = createEDataType(EMAP);
		eResourceEDataType = createEDataType(ERESOURCE);
		eResourceSetEDataType = createEDataType(ERESOURCE_SET);
		eShortEDataType = createEDataType(ESHORT);
		eShortObjectEDataType = createEDataType(ESHORT_OBJECT);
		eTreeIteratorEDataType = createEDataType(ETREE_ITERATOR);
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
		StructurePackage theStructurePackage = (StructurePackage) EPackage.Registry.INSTANCE
				.getEPackage(StructurePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(eJavaClassEDataType, "T");
		addETypeParameter(eeListEDataType, "E");
		addETypeParameter(eMapEDataType, "K");
		addETypeParameter(eMapEDataType, "V");
		addETypeParameter(eTreeIteratorEDataType, "E");

		// Set bounds for type parameters

		// Add supertypes to classes
		eAttributeEClass.getESuperTypes().add(this.getEStructuralFeature());
		eAnnotationEClass.getESuperTypes().add(this.getEModelElement());
		eClassEClass.getESuperTypes().add(this.getEClassifier());
		eClassifierEClass.getESuperTypes().add(this.getENamedElement());
		eDataTypeEClass.getESuperTypes().add(this.getEClassifier());
		eEnumEClass.getESuperTypes().add(this.getEDataType());
		eEnumLiteralEClass.getESuperTypes().add(this.getENamedElement());
		eFactoryEClass.getESuperTypes().add(this.getEModelElement());
		eModelElementEClass.getESuperTypes().add(this.getEObject());
		eNamedElementEClass.getESuperTypes().add(this.getEModelElement());
		eObjectEClass.getESuperTypes().add(theStructurePackage.getObject());
		eOperationEClass.getESuperTypes().add(this.getETypedElement());
		ePackageEClass.getESuperTypes().add(this.getENamedElement());
		eParameterEClass.getESuperTypes().add(this.getETypedElement());
		eReferenceEClass.getESuperTypes().add(this.getEStructuralFeature());
		eStructuralFeatureEClass.getESuperTypes().add(this.getETypedElement());
		eTypedElementEClass.getESuperTypes().add(this.getENamedElement());
		eStringToStringMapEntryEClass.getESuperTypes().add(
				theStructurePackage.getObject());
		eGenericTypeEClass.getESuperTypes().add(this.getEObject());
		eTypeParameterEClass.getESuperTypes().add(this.getENamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(eAttributeEClass, ecore.EAttribute.class, "EAttribute",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEAttribute_ID(), ecorePackage.getEBoolean(), "iD",
				"false", 0, 1, ecore.EAttribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		addEOperation(eAttributeEClass, this.getEDataType(),
				"getterEAttributeType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eAnnotationEClass, EAnnotation.class, "EAnnotation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAnnotation_References(), this.getEObject(), null,
				"references", null, 0, -1, EAnnotation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEAnnotation_Source(), ecorePackage.getEString(),
				"source", null, 0, 1, EAnnotation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEAnnotation_Details(), this
				.getEStringToStringMapEntry(), null, "details", null, 0, -1,
				EAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEAnnotation_Contents(), this.getEObject(), null,
				"contents", null, 0, -1, EAnnotation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAnnotation_EModelElement(), this.getEModelElement(),
				this.getEModelElement_EAnnotations(), "eModelElement", null, 0,
				1, EAnnotation.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassEClass, ecore.EClass.class, "EClass", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClass_EStructuralFeatures(), this
				.getEStructuralFeature(), this
				.getEStructuralFeature_EContainingClass(),
				"eStructuralFeatures", null, 0, -1, ecore.EClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEClass__abstract(), ecorePackage.getEBoolean(),
				"_abstract", "false", 0, 1, ecore.EClass.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EOperations(), this.getEOperation(), this
				.getEOperation_EContainingClass(), "eOperations", null, 0, -1,
				ecore.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClass__interface(), ecorePackage.getEBoolean(),
				"_interface", "false", 0, 1, ecore.EClass.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_ESuperTypes(), this.getEClass(), null,
				"eSuperTypes", null, 0, -1, ecore.EClass.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_EGenericSuperTypes(), this.getEGenericType(),
				null, "eGenericSuperTypes", null, 0, -1, ecore.EClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		EOperation op = addEOperation(eClassEClass, this
				.getEStructuralFeature(), "getEStructuralFeature", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "featureName", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eClassEClass, ecorePackage.getEInt(),
				"getFeatureID", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEStructuralFeature(), "feature", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eClassEClass, ecorePackage.getEBoolean(),
				"isSuperTypeOf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEClass(), "someClass", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(eClassEClass, ecorePackage.getEInt(), "getFeatureCount",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eClassEClass, this.getEStructuralFeature(),
				"op_getEStructuralFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "featureID", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(eClassEClass, this.getEAttribute(),
				"getterEAllAttributes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eClassEClass, this.getEReference(), "getterEReferences",
				0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eClassEClass, this.getEReference(),
				"getterEAllReferences", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eClassEClass, this.getEReference(),
				"getterEAllContainments", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eClassEClass, this.getEGenericType(),
				"getterEAllGenericSuperTypes", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eClassEClass, this.getEAttribute(), "getterEAttributes",
				0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eClassEClass, this.getEAttribute(), "getterEIDAttribute",
				0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eClassEClass, this.getEOperation(),
				"getterEAllOperations", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eClassEClass, this.getEStructuralFeature(),
				"getterEAllStructuralFeatures", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eClassEClass, this.getEClass(), "getterEAllSuperTypes",
				0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(eClassifierEClass, EClassifier.class, "EClassifier",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEClassifier_InstanceClassName(), ecorePackage
				.getEString(), "instanceClassName", null, 0, 1,
				EClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClassifier_EPackage(), this.getEPackage(), this
				.getEPackage_EClassifiers(), "ePackage", null, 0, 1,
				EClassifier.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEClassifier_ETypeParameters(), this
				.getETypeParameter(), null, "eTypeParameters", null, 0, -1,
				EClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClassifier_InstanceTypeName(), ecorePackage
				.getEString(), "instanceTypeName", null, 0, 1,
				EClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eClassifierEClass, ecorePackage.getEBoolean(),
				"isInstance", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		addEOperation(eClassifierEClass, ecorePackage.getEInt(),
				"getClassifierID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eClassifierEClass, null, "getterInstanceClass", 0,
				1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(eClassifierEClass, ecorePackage.getEJavaObject(),
				"getterDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eDataTypeEClass, ecore.EDataType.class, "EDataType",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDataType_Serializable(), ecorePackage.getEBoolean(),
				"serializable", "true", 0, 1, ecore.EDataType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eEnumEClass, EEnum.class, "EEnum", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEnum_ELiterals(), this.getEEnumLiteral(), this
				.getEEnumLiteral_EEnum(), "eLiterals", null, 0, -1,
				EEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(eEnumEClass, this.getEEnumLiteral(),
				"op_getEEnumLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(eEnumEClass, this.getEEnumLiteral(),
				"getEEnumLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "value", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(eEnumEClass, this.getEEnumLiteral(),
				"getEEnumLiteralByLiteral", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "literal", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(eEnumLiteralEClass, EEnumLiteral.class, "EEnumLiteral",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEEnumLiteral_EEnum(), this.getEEnum(), this
				.getEEnum_ELiterals(), "eEnum", null, 0, 1, EEnumLiteral.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEEnumLiteral_Value(), ecorePackage.getEInt(),
				"value", null, 0, 1, EEnumLiteral.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEnumLiteral_Instance(), this.getEEnumerator(),
				"instance", null, 0, 1, EEnumLiteral.class, IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEEnumLiteral_Literal(), ecorePackage.getEString(),
				"literal", null, 0, 1, EEnumLiteral.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eFactoryEClass, EFactory.class, "EFactory", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEFactory_EPackage(), this.getEPackage(), this
				.getEPackage_EFactoryInstance(), "ePackage", null, 1, 1,
				EFactory.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = addEOperation(eFactoryEClass, ecorePackage.getEJavaObject(),
				"createFromString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEDataType(), "eDataType", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "literalValue", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eFactoryEClass, ecorePackage.getEString(),
				"convertToString", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEDataType(), "eDataType", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "instanceValue", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eFactoryEClass, this.getEObject(), "create", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEClass(), "eClass", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(eModelElementEClass, EModelElement.class, "EModelElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEModelElement_EAnnotations(), this.getEAnnotation(),
				this.getEAnnotation_EModelElement(), "eAnnotations", null, 0,
				-1, EModelElement.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(eModelElementEClass, this.getEAnnotation(),
				"getEAnnotation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "source", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(eNamedElementEClass, ENamedElement.class, "ENamedElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getENamedElement_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, ENamedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eObjectEClass, EObject.class, "EObject", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eOperationEClass, ecore.EOperation.class, "EOperation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEOperation_EContainingClass(), this.getEClass(), this
				.getEClass_EOperations(), "eContainingClass", null, 0, 1,
				ecore.EOperation.class, IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEOperation_EGenericExceptions(), this
				.getEGenericType(), null, "eGenericExceptions", null, 0, -1,
				ecore.EOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEOperation_EParameters(), this.getEParameter(), this
				.getEParameter_EOperation(), "eParameters", null, 0, -1,
				ecore.EOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEOperation_ETypeParameters(), this
				.getETypeParameter(), null, "eTypeParameters", null, 0, -1,
				ecore.EOperation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEOperation_EExceptions(), this.getEClassifier(),
				null, "eExceptions", null, 0, -1, ecore.EOperation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(ePackageEClass, ecore.EPackage.class, "EPackage",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPackage_NsURI(), ecorePackage.getEString(), "nsURI",
				null, 0, 1, ecore.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEPackage_ESubpackages(), this.getEPackage(), this
				.getEPackage_ESuperPackage(), "eSubpackages", null, 0, -1,
				ecore.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_ESuperPackage(), this.getEPackage(), this
				.getEPackage_ESubpackages(), "eSuperPackage", null, 0, 1,
				ecore.EPackage.class, IS_TRANSIENT, !IS_VOLATILE,
				!IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPackage_NsPrefix(), ecorePackage.getEString(),
				"nsPrefix", null, 0, 1, ecore.EPackage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_EFactoryInstance(), this.getEFactory(), this
				.getEFactory_EPackage(), "eFactoryInstance", null, 1, 1,
				ecore.EPackage.class, IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEPackage_EClassifiers(), this.getEClassifier(), this
				.getEClassifier_EPackage(), "eClassifiers", null, 0, -1,
				ecore.EPackage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(ePackageEClass, this.getEClassifier(),
				"getEClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(eParameterEClass, EParameter.class, "EParameter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEParameter_EOperation(), this.getEOperation(), this
				.getEOperation_EParameters(), "eOperation", null, 0, 1,
				EParameter.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eReferenceEClass, ecore.EReference.class, "EReference",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEReference_EOpposite(), this.getEReference(), null,
				"eOpposite", null, 0, 1, ecore.EReference.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReference_ResolveProxies(), ecorePackage
				.getEBoolean(), "resolveProxies", "true", 0, 1,
				ecore.EReference.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEReference_EKeys(), this.getEAttribute(), null,
				"eKeys", null, 0, -1, ecore.EReference.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEReference_Containment(), ecorePackage.getEBoolean(),
				"containment", "false", 0, 1, ecore.EReference.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(eReferenceEClass, this.getEClass(),
				"getterEReferenceType", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eReferenceEClass, ecorePackage.getEBoolean(),
				"getterContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eStructuralFeatureEClass, EStructuralFeature.class,
				"EStructuralFeature", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStructuralFeature__volatile(), this.getEBoolean(),
				"_volatile", "false", 0, 1, EStructuralFeature.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStructuralFeature_DefaultValueLiteral(), this
				.getEString(), "defaultValueLiteral", null, 0, 1,
				EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEStructuralFeature_EContainingClass(), this
				.getEClass(), this.getEClass_EStructuralFeatures(),
				"eContainingClass", null, 0, 1, EStructuralFeature.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEStructuralFeature__transient(), ecorePackage
				.getEBoolean(), "_transient", "false", 0, 1,
				EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEStructuralFeature_Unsettable(), ecorePackage
				.getEBoolean(), "unsettable", "false", 0, 1,
				EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEStructuralFeature_Derived(), ecorePackage
				.getEBoolean(), "derived", "false", 0, 1,
				EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEStructuralFeature_Changeable(), ecorePackage
				.getEBoolean(), "changeable", "true", 0, 1,
				EStructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(eStructuralFeatureEClass, this.getEInt(), "getFeatureID",
				0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(eStructuralFeatureEClass, null, "getContainerClass",
				0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		addEOperation(eStructuralFeatureEClass, this.getEJavaObject(),
				"getterDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eTypedElementEClass, ETypedElement.class, "ETypedElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getETypedElement_LowerBound(), ecorePackage.getEInt(),
				"lowerBound", null, 0, 1, ETypedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getETypedElement_Unique(), ecorePackage.getEBoolean(),
				"unique", "true", 0, 1, ETypedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getETypedElement_EType(), this.getEClassifier(), null,
				"eType", null, 0, 1, ETypedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getETypedElement_Ordered(), ecorePackage.getEBoolean(),
				"ordered", "true", 0, 1, ETypedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getETypedElement_UpperBound(), ecorePackage.getEInt(),
				"upperBound", "1", 0, 1, ETypedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getETypedElement_EGenericType(), this.getEGenericType(),
				null, "eGenericType", null, 0, 1, ETypedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(eTypedElementEClass, ecorePackage.getEBoolean(),
				"getterMany", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(eTypedElementEClass, ecorePackage.getEBoolean(),
				"getterRequired", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eStringToStringMapEntryEClass,
				EStringToStringMapEntry.class, "EStringToStringMapEntry",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStringToStringMapEntry_Value(), ecorePackage
				.getEString(), "value", null, 0, 1,
				EStringToStringMapEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEStringToStringMapEntry_Key(), ecorePackage
				.getEString(), "key", null, 0, 1,
				EStringToStringMapEntry.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eGenericTypeEClass, ecore.EGenericType.class,
				"EGenericType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEGenericType_EUpperBound(), this.getEGenericType(),
				null, "eUpperBound", null, 0, 1, ecore.EGenericType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEGenericType_ETypeArguments(),
				this.getEGenericType(), null, "eTypeArguments", null, 0, -1,
				ecore.EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGenericType_EClassifier(), this.getEClassifier(),
				null, "eClassifier", null, 0, 1, ecore.EGenericType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEGenericType_ETypeParameter(), this
				.getETypeParameter(), null, "eTypeParameter", null, 0, 1,
				ecore.EGenericType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEGenericType_ELowerBound(), this.getEGenericType(),
				null, "eLowerBound", null, 0, 1, ecore.EGenericType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		addEOperation(eGenericTypeEClass, this.getEClassifier(),
				"getterERawType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eTypeParameterEClass, ETypeParameter.class,
				"ETypeParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getETypeParameter_EBounds(), this.getEGenericType(),
				null, "eBounds", null, 0, -1, ETypeParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize data types
		initEDataType(eBooleanEDataType, boolean.class, "EBoolean",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eStringEDataType, String.class, "EString",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eJavaClassEDataType, Class.class, "EJavaClass",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eJavaObjectEDataType, Object.class, "EJavaObject",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eIntEDataType, int.class, "EInt", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eEnumeratorEDataType, Enumerator.class, "EEnumerator",
				!IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eBigDecimalEDataType, BigDecimal.class, "EBigDecimal",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eBigIntegerEDataType, BigInteger.class, "EBigInteger",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eBooleanObjectEDataType, Boolean.class, "EBooleanObject",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eByteEDataType, byte.class, "EByte", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eByteArrayEDataType, byte[].class, "EByteArray",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eByteObjectEDataType, Byte.class, "EByteObject",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eCharEDataType, char.class, "EChar", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eCharacterObjectEDataType, Character.class,
				"ECharacterObject", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eDateEDataType, Date.class, "EDate", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eDiagnosticChainEDataType, DiagnosticChain.class,
				"EDiagnosticChain", !IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eDoubleEDataType, double.class, "EDouble",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eDoubleObjectEDataType, Double.class, "EDoubleObject",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eeListEDataType, EList.class, "EEList", !IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eFeatureMapEDataType, FeatureMap.class, "EFeatureMap",
				!IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eFeatureMapEntryEDataType, FeatureMap.Entry.class,
				"EFeatureMapEntry", !IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eFloatEDataType, float.class, "EFloat", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eFloatObjectEDataType, Float.class, "EFloatObject",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eIntegerObjectEDataType, Integer.class, "EIntegerObject",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eLongEDataType, long.class, "ELong", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eLongObjectEDataType, Long.class, "ELongObject",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eMapEDataType, Map.class, "EMap", !IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eResourceEDataType, Resource.class, "EResource",
				!IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eResourceSetEDataType, ResourceSet.class, "EResourceSet",
				!IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eShortEDataType, short.class, "EShort", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eShortObjectEDataType, Short.class, "EShortObject",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eTreeIteratorEDataType, TreeIterator.class,
				"ETreeIterator", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// kermeta
		createKermetaAnnotations();
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
				"http://www.eclipse.org/emf/2002/Ecore" });
		addAnnotation(this, source, new String[] { "ecore", "true" });
		addAnnotation(eAttributeEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getEAttribute_ID(), source, new String[] { "ecore",
				"true" });
		addAnnotation(eBooleanEDataType, source, new String[] { "alias",
				"kermeta::standard::Boolean" });
		addAnnotation(eBooleanEDataType, source,
				new String[] { "ecore", "true" });
		addAnnotation(eBooleanEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "boolean" });
		addAnnotation(eBooleanEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eAnnotationEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getEAnnotation_References(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEAnnotation_Source(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getEAnnotation_Details(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getEAnnotation_Contents(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEAnnotation_EModelElement(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEAnnotation_EModelElement(), source, new String[] {
				"ecore.isTransient", "true" });
		addAnnotation(eStringEDataType, source, new String[] { "alias",
				"kermeta::standard::String" });
		addAnnotation(eStringEDataType, source,
				new String[] { "ecore", "true" });
		addAnnotation(eStringEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.lang.String" });
		addAnnotation(eStringEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eClassEClass, source, new String[] { "ecore", "true" });
		addAnnotation(eClassEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eClassEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(eClassEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eClassEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(eClassEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eClassEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(eClassEClass.getEOperations().get(3), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eClassEClass.getEOperations().get(3), source,
				new String[] { "ecore", "true" });
		addAnnotation(eClassEClass.getEOperations().get(4), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eClassEClass.getEOperations().get(4), source,
				new String[] { "ecore", "true" });
		addAnnotation(getEClass_EStructuralFeatures(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEClass__abstract(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getEClass_EOperations(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getEClass__interface(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getEClass_ESuperTypes(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getEClass_EGenericSuperTypes(), source, new String[] {
				"ecore", "true" });
		addAnnotation(eClassifierEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(eClassifierEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eClassifierEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(eClassifierEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eClassifierEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getEClassifier_InstanceClassName(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEClassifier_EPackage(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEClassifier_EPackage(), source, new String[] {
				"ecore.isTransient", "true" });
		addAnnotation(getEClassifier_ETypeParameters(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEClassifier_InstanceTypeName(), source, new String[] {
				"ecore", "true" });
		addAnnotation(eJavaClassEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eJavaClassEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eJavaClassEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.lang.Class" });
		addAnnotation(eJavaClassEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eJavaClassEDataType, source, new String[] {
				"ecore.EDataType_eTypeParameters", "T" });
		addAnnotation(eJavaObjectEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eJavaObjectEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eJavaObjectEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.lang.Object" });
		addAnnotation(eJavaObjectEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eDataTypeEClass, source, new String[] { "ecore", "true" });
		addAnnotation(getEDataType_Serializable(), source, new String[] {
				"ecore", "true" });
		addAnnotation(eEnumEClass, source, new String[] { "ecore", "true" });
		addAnnotation(eEnumEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eEnumEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(eEnumEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eEnumEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(eEnumEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eEnumEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getEEnum_ELiterals(), source, new String[] { "ecore",
				"true" });
		addAnnotation(eEnumLiteralEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getEEnumLiteral_EEnum(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getEEnumLiteral_EEnum(), source, new String[] {
				"ecore.isTransient", "true" });
		addAnnotation(getEEnumLiteral_Value(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getEEnumLiteral_Instance(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEEnumLiteral_Instance(), source, new String[] {
				"ecore.isTransient", "true" });
		addAnnotation(getEEnumLiteral_Literal(), source, new String[] {
				"ecore", "true" });
		addAnnotation(eIntEDataType, source, new String[] { "alias",
				"kermeta::standard::Integer" });
		addAnnotation(eIntEDataType, source, new String[] { "ecore", "true" });
		addAnnotation(eIntEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "int" });
		addAnnotation(eIntEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eEnumeratorEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eEnumeratorEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eEnumeratorEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName",
				"org.eclipse.emf.common.util.Enumerator" });
		addAnnotation(eFactoryEClass, source, new String[] { "ecore", "true" });
		addAnnotation(eFactoryEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eFactoryEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(eFactoryEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eFactoryEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(eFactoryEClass.getEOperations().get(2), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eFactoryEClass.getEOperations().get(2), source,
				new String[] { "ecore", "true" });
		addAnnotation(getEFactory_EPackage(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getEFactory_EPackage(), source, new String[] {
				"ecore.isTransient", "true" });
		addAnnotation(eModelElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(eModelElementEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eModelElementEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getEModelElement_EAnnotations(), source, new String[] {
				"ecore", "true" });
		addAnnotation(eNamedElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getENamedElement_Name(), source, new String[] { "ecore",
				"true" });
		addAnnotation(eObjectEClass, source, new String[] { "ecore", "true" });
		addAnnotation(eOperationEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getEOperation_EContainingClass(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEOperation_EContainingClass(), source, new String[] {
				"ecore.isTransient", "true" });
		addAnnotation(getEOperation_EGenericExceptions(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEOperation_EParameters(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEOperation_ETypeParameters(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEOperation_EExceptions(), source, new String[] {
				"ecore", "true" });
		addAnnotation(ePackageEClass, source, new String[] { "ecore", "true" });
		addAnnotation(ePackageEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(ePackageEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(getEPackage_NsURI(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getEPackage_ESubpackages(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEPackage_ESuperPackage(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEPackage_ESuperPackage(), source, new String[] {
				"ecore.isTransient", "true" });
		addAnnotation(getEPackage_NsPrefix(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getEPackage_EFactoryInstance(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEPackage_EFactoryInstance(), source, new String[] {
				"ecore.isTransient", "true" });
		addAnnotation(getEPackage_EClassifiers(), source, new String[] {
				"ecore", "true" });
		addAnnotation(eParameterEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getEParameter_EOperation(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEParameter_EOperation(), source, new String[] {
				"ecore.isTransient", "true" });
		addAnnotation(eReferenceEClass, source,
				new String[] { "ecore", "true" });
		addAnnotation(getEReference_EOpposite(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEReference_ResolveProxies(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEReference_EKeys(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getEReference_Containment(), source, new String[] {
				"ecore", "true" });
		addAnnotation(eStructuralFeatureEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(eStructuralFeatureEClass.getEOperations().get(0), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eStructuralFeatureEClass.getEOperations().get(0), source,
				new String[] { "ecore", "true" });
		addAnnotation(eStructuralFeatureEClass.getEOperations().get(1), source,
				new String[] { "isAbstract", "true" });
		addAnnotation(eStructuralFeatureEClass.getEOperations().get(1), source,
				new String[] { "ecore", "true" });
		addAnnotation(getEStructuralFeature__volatile(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEStructuralFeature_DefaultValueLiteral(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getEStructuralFeature_EContainingClass(), source,
				new String[] { "ecore", "true" });
		addAnnotation(getEStructuralFeature_EContainingClass(), source,
				new String[] { "ecore.isTransient", "true" });
		addAnnotation(getEStructuralFeature__transient(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEStructuralFeature_Unsettable(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEStructuralFeature_Derived(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEStructuralFeature_Changeable(), source, new String[] {
				"ecore", "true" });
		addAnnotation(eTypedElementEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getETypedElement_LowerBound(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getETypedElement_Unique(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getETypedElement_EType(), source, new String[] { "ecore",
				"true" });
		addAnnotation(getETypedElement_Ordered(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getETypedElement_UpperBound(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getETypedElement_EGenericType(), source, new String[] {
				"ecore", "true" });
		addAnnotation(eStringToStringMapEntryEClass, source, new String[] {
				"ecore", "true" });
		addAnnotation(getEStringToStringMapEntry_Value(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEStringToStringMapEntry_Key(), source, new String[] {
				"ecore", "true" });
		addAnnotation(eGenericTypeEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getEGenericType_EUpperBound(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEGenericType_ETypeArguments(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEGenericType_EClassifier(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEGenericType_ETypeParameter(), source, new String[] {
				"ecore", "true" });
		addAnnotation(getEGenericType_ELowerBound(), source, new String[] {
				"ecore", "true" });
		addAnnotation(eTypeParameterEClass, source, new String[] { "ecore",
				"true" });
		addAnnotation(getETypeParameter_EBounds(), source, new String[] {
				"ecore", "true" });
		addAnnotation(eBigDecimalEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eBigDecimalEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eBigDecimalEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.math.BigDecimal" });
		addAnnotation(eBigDecimalEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eBigIntegerEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eBigIntegerEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eBigIntegerEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.math.BigInteger" });
		addAnnotation(eBigIntegerEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eBooleanObjectEDataType, source, new String[] { "alias",
				"kermeta::standard::Boolean" });
		addAnnotation(eBooleanObjectEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eBooleanObjectEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.lang.Boolean" });
		addAnnotation(eBooleanObjectEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eByteEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eByteEDataType, source, new String[] { "ecore", "true" });
		addAnnotation(eByteEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "byte" });
		addAnnotation(eByteEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eByteArrayEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eByteArrayEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eByteArrayEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "byte[]" });
		addAnnotation(eByteArrayEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eByteObjectEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eByteObjectEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eByteObjectEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.lang.Byte" });
		addAnnotation(eByteObjectEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eCharEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eCharEDataType, source, new String[] { "ecore", "true" });
		addAnnotation(eCharEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "char" });
		addAnnotation(eCharEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eCharacterObjectEDataType, source, new String[] {
				"alias", "kermeta::language::structure::Object" });
		addAnnotation(eCharacterObjectEDataType, source, new String[] {
				"ecore", "true" });
		addAnnotation(eCharacterObjectEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.lang.Character" });
		addAnnotation(eCharacterObjectEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eDateEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eDateEDataType, source, new String[] { "ecore", "true" });
		addAnnotation(eDateEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.util.Date" });
		addAnnotation(eDateEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eDiagnosticChainEDataType, source, new String[] {
				"alias", "kermeta::language::structure::Object" });
		addAnnotation(eDiagnosticChainEDataType, source, new String[] {
				"ecore", "true" });
		addAnnotation(eDiagnosticChainEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName",
				"org.eclipse.emf.common.util.DiagnosticChain" });
		addAnnotation(eDoubleEDataType, source, new String[] { "alias",
				"kermeta::standard::Real" });
		addAnnotation(eDoubleEDataType, source,
				new String[] { "ecore", "true" });
		addAnnotation(eDoubleEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "double" });
		addAnnotation(eDoubleEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eDoubleObjectEDataType, source, new String[] { "alias",
				"kermeta::standard::Real" });
		addAnnotation(eDoubleObjectEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eDoubleObjectEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.lang.Double" });
		addAnnotation(eDoubleObjectEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eeListEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eeListEDataType, source, new String[] { "ecore", "true" });
		addAnnotation(eeListEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName",
				"org.eclipse.emf.common.util.EList" });
		addAnnotation(eeListEDataType, source, new String[] {
				"ecore.EDataType_eTypeParameters", "E" });
		addAnnotation(eFeatureMapEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eFeatureMapEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eFeatureMapEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName",
				"org.eclipse.emf.ecore.util.FeatureMap" });
		addAnnotation(eFeatureMapEntryEDataType, source, new String[] {
				"alias", "kermeta::ecore::EFeatureMapEntry" });
		addAnnotation(eFeatureMapEntryEDataType, source, new String[] {
				"ecore", "true" });
		addAnnotation(eFeatureMapEntryEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName",
				"org.eclipse.emf.ecore.util.FeatureMap$Entry" });
		addAnnotation(eFloatEDataType, source, new String[] { "alias",
				"kermeta::standard::Real" });
		addAnnotation(eFloatEDataType, source, new String[] { "ecore", "true" });
		addAnnotation(eFloatEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "float" });
		addAnnotation(eFloatEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eFloatObjectEDataType, source, new String[] { "alias",
				"kermeta::standard::Real" });
		addAnnotation(eFloatObjectEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eFloatObjectEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.lang.Float" });
		addAnnotation(eFloatObjectEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eIntegerObjectEDataType, source, new String[] { "alias",
				"kermeta::standard::Integer" });
		addAnnotation(eIntegerObjectEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eIntegerObjectEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.lang.Integer" });
		addAnnotation(eIntegerObjectEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eLongEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eLongEDataType, source, new String[] { "ecore", "true" });
		addAnnotation(eLongEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "long" });
		addAnnotation(eLongEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eLongObjectEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eLongObjectEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eLongObjectEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.lang.Long" });
		addAnnotation(eLongObjectEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eMapEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eMapEDataType, source, new String[] { "ecore", "true" });
		addAnnotation(eMapEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.util.Map" });
		addAnnotation(eMapEDataType, source, new String[] {
				"ecore.EDataType_eTypeParameters", "K , V" });
		addAnnotation(eResourceEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eResourceEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eResourceEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName",
				"org.eclipse.emf.ecore.resource.Resource" });
		addAnnotation(eResourceSetEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eResourceSetEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eResourceSetEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName",
				"org.eclipse.emf.ecore.resource.ResourceSet" });
		addAnnotation(eShortEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eShortEDataType, source, new String[] { "ecore", "true" });
		addAnnotation(eShortEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "short" });
		addAnnotation(eShortEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eShortObjectEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eShortObjectEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eShortObjectEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName", "java.lang.Short" });
		addAnnotation(eShortObjectEDataType, source, new String[] {
				"ecore.EDataType_isSerializable", "true" });
		addAnnotation(eTreeIteratorEDataType, source, new String[] { "alias",
				"kermeta::language::structure::Object" });
		addAnnotation(eTreeIteratorEDataType, source, new String[] { "ecore",
				"true" });
		addAnnotation(eTreeIteratorEDataType, source, new String[] {
				"ecore.EDataType_instanceClassName",
				"org.eclipse.emf.common.util.TreeIterator" });
		addAnnotation(eTreeIteratorEDataType, source, new String[] {
				"ecore.EDataType_eTypeParameters", "E" });
	}

} //EcorePackageImpl
