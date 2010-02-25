/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package patternframework.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pattern.art.ArtPackage;

import pattern.art.group.GroupPackage;

import pattern.art.group.impl.GroupPackageImpl;

import pattern.art.impl.ArtPackageImpl;

import pattern.art.implem.ImplemPackage;

import pattern.art.implem.impl.ImplemPackageImpl;

import pattern.art.instance.InstancePackage;

import pattern.art.instance.impl.InstancePackageImpl;

import pattern.art.type.TypePackage;

import pattern.art.type.impl.TypePackageImpl;

import patternframework.ModelPattern;
import patternframework.PConstraint;
import patternframework.PConstraintLanguage;
import patternframework.PModel;
import patternframework.PObject;
import patternframework.PRole;
import patternframework.PatternframeworkFactory;
import patternframework.PatternframeworkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternframeworkPackageImpl extends EPackageImpl implements PatternframeworkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pConstraintLanguageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pExpressionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pLabelEDataType = null;

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
	 * @see patternframework.PatternframeworkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PatternframeworkPackageImpl() {
		super(eNS_URI, PatternframeworkFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PatternframeworkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PatternframeworkPackage init() {
		if (isInited) return (PatternframeworkPackage)EPackage.Registry.INSTANCE.getEPackage(PatternframeworkPackage.eNS_URI);

		// Obtain or create and register package
		PatternframeworkPackageImpl thePatternframeworkPackage = (PatternframeworkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternframeworkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternframeworkPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ArtPackageImpl theArtPackage = (ArtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ArtPackage.eNS_URI) instanceof ArtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ArtPackage.eNS_URI) : ArtPackage.eINSTANCE);
		InstancePackageImpl theInstancePackage = (InstancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) instanceof InstancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InstancePackage.eNS_URI) : InstancePackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		ImplemPackageImpl theImplemPackage = (ImplemPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ImplemPackage.eNS_URI) instanceof ImplemPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ImplemPackage.eNS_URI) : ImplemPackage.eINSTANCE);
		GroupPackageImpl theGroupPackage = (GroupPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GroupPackage.eNS_URI) instanceof GroupPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GroupPackage.eNS_URI) : GroupPackage.eINSTANCE);

		// Create package meta-data objects
		thePatternframeworkPackage.createPackageContents();
		theArtPackage.createPackageContents();
		theInstancePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theImplemPackage.createPackageContents();
		theGroupPackage.createPackageContents();

		// Initialize created meta-data
		thePatternframeworkPackage.initializePackageContents();
		theArtPackage.initializePackageContents();
		theInstancePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theImplemPackage.initializePackageContents();
		theGroupPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePatternframeworkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PatternframeworkPackage.eNS_URI, thePatternframeworkPackage);
		return thePatternframeworkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelPattern() {
		return modelPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelPattern_Pattern() {
		return (EReference)modelPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelPattern_Constraints() {
		return (EReference)modelPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelPattern_FeatureIdentifier() {
		return (EAttribute)modelPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelPattern_Falsepositivepatterns() {
		return (EReference)modelPatternEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPModel() {
		return pModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPModel_Content() {
		return (EReference)pModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPModel_Roles() {
		return (EReference)pModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPObject() {
		return pObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPConstraint() {
		return pConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPConstraint_Expression() {
		return (EAttribute)pConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPConstraint_Language() {
		return (EAttribute)pConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPRole() {
		return pRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPRole_Name() {
		return (EAttribute)pRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPRole_Player() {
		return (EReference)pRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPConstraintLanguage() {
		return pConstraintLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPExpression() {
		return pExpressionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPLabel() {
		return pLabelEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternframeworkFactory getPatternframeworkFactory() {
		return (PatternframeworkFactory)getEFactoryInstance();
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
		modelPatternEClass = createEClass(MODEL_PATTERN);
		createEReference(modelPatternEClass, MODEL_PATTERN__PATTERN);
		createEReference(modelPatternEClass, MODEL_PATTERN__CONSTRAINTS);
		createEAttribute(modelPatternEClass, MODEL_PATTERN__FEATURE_IDENTIFIER);
		createEReference(modelPatternEClass, MODEL_PATTERN__FALSEPOSITIVEPATTERNS);

		pModelEClass = createEClass(PMODEL);
		createEReference(pModelEClass, PMODEL__CONTENT);
		createEReference(pModelEClass, PMODEL__ROLES);

		pObjectEClass = createEClass(POBJECT);

		pConstraintEClass = createEClass(PCONSTRAINT);
		createEAttribute(pConstraintEClass, PCONSTRAINT__EXPRESSION);
		createEAttribute(pConstraintEClass, PCONSTRAINT__LANGUAGE);

		pRoleEClass = createEClass(PROLE);
		createEAttribute(pRoleEClass, PROLE__NAME);
		createEReference(pRoleEClass, PROLE__PLAYER);

		// Create enums
		pConstraintLanguageEEnum = createEEnum(PCONSTRAINT_LANGUAGE);

		// Create data types
		pExpressionEDataType = createEDataType(PEXPRESSION);
		pLabelEDataType = createEDataType(PLABEL);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(modelPatternEClass, ModelPattern.class, "ModelPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelPattern_Pattern(), this.getPModel(), null, "pattern", null, 0, 1, ModelPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelPattern_Constraints(), this.getPConstraint(), null, "constraints", null, 0, 1, ModelPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelPattern_FeatureIdentifier(), this.getPLabel(), "featureIdentifier", null, 0, -1, ModelPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelPattern_Falsepositivepatterns(), this.getPModel(), null, "falsepositivepatterns", null, 0, -1, ModelPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(modelPatternEClass, this.getPObject(), "getRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPLabel(), "roleName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pModelEClass, PModel.class, "PModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPModel_Content(), this.getPObject(), null, "content", null, 0, -1, PModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPModel_Roles(), this.getPRole(), null, "roles", null, 0, -1, PModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pObjectEClass, PObject.class, "PObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pConstraintEClass, PConstraint.class, "PConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPConstraint_Expression(), this.getPExpression(), "expression", null, 0, 1, PConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPConstraint_Language(), this.getPConstraintLanguage(), "language", null, 0, 1, PConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pRoleEClass, PRole.class, "PRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPRole_Name(), this.getPLabel(), "name", null, 1, 1, PRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPRole_Player(), this.getPObject(), null, "player", null, 1, 1, PRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(pConstraintLanguageEEnum, PConstraintLanguage.class, "PConstraintLanguage");
		addEEnumLiteral(pConstraintLanguageEEnum, PConstraintLanguage.KERMETA);
		addEEnumLiteral(pConstraintLanguageEEnum, PConstraintLanguage.OCL);

		// Initialize data types
		initEDataType(pExpressionEDataType, String.class, "PExpression", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pLabelEDataType, String.class, "PLabel", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		addAnnotation
		  (modelPatternEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "do\r\n\tvar rol : patternframework::PRole init pattern.roles.detect{r | r.name.equals(roleName)}\r\n\tresult := if rol.isVoid.~not then\r\n\t\trol.player\r\n\r\n\telse\r\n\t\tvoid\r\n\r\n\tend\r\nend"
		   });		
		addAnnotation
		  (getModelPattern_FeatureIdentifier(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getPConstraint_Expression(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getPConstraint_Language(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getPRole_Name(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });
	}

} //PatternframeworkPackageImpl
