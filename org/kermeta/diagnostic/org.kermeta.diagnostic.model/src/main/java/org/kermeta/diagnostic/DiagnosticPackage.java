/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.diagnostic;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.kermeta.diagnostic.DiagnosticFactory
 * @model kind="package"
 * @generated
 */
public interface DiagnosticPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diagnostic";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://diagnostic/1.0/org/kermeta/diagnostic";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org_kermeta_diagnostic";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagnosticPackage eINSTANCE = org.kermeta.diagnostic.impl.DiagnosticPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.diagnostic.impl.DiagnosticModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.diagnostic.impl.DiagnosticModelImpl
	 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getDiagnosticModel()
	 * @generated
	 */
	int DIAGNOSTIC_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Diagnostics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_MODEL__DIAGNOSTICS = 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_MODEL__REFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_MODEL__CONSTRAINTS = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.kermeta.diagnostic.impl.ConstraintDiagnosticImpl <em>Constraint Diagnostic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.diagnostic.impl.ConstraintDiagnosticImpl
	 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getConstraintDiagnostic()
	 * @generated
	 */
	int CONSTRAINT_DIAGNOSTIC = 1;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DIAGNOSTIC__APPLIES_TO = 0;

	/**
	 * The feature id for the '<em><b>Failed Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DIAGNOSTIC__FAILED_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Is Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DIAGNOSTIC__IS_WARNING = 2;

	/**
	 * The number of structural features of the '<em>Constraint Diagnostic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_DIAGNOSTIC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.kermeta.diagnostic.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.diagnostic.impl.ReferenceImpl
	 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 2;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.kermeta.diagnostic.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.diagnostic.impl.ModelReferenceImpl
	 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getModelReference()
	 * @generated
	 */
	int MODEL_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Referenced Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__REFERENCED_OBJECT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.diagnostic.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.diagnostic.impl.ConstraintImpl
	 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 4;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.kermeta.diagnostic.impl.InvariantImpl <em>Invariant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.diagnostic.impl.InvariantImpl
	 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getInvariant()
	 * @generated
	 */
	int INVARIANT = 5;

	/**
	 * The number of structural features of the '<em>Invariant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.diagnostic.impl.PreConditionImpl <em>Pre Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.diagnostic.impl.PreConditionImpl
	 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getPreCondition()
	 * @generated
	 */
	int PRE_CONDITION = 6;

	/**
	 * The number of structural features of the '<em>Pre Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.diagnostic.impl.PostConditionImpl <em>Post Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.diagnostic.impl.PostConditionImpl
	 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getPostCondition()
	 * @generated
	 */
	int POST_CONDITION = 7;

	/**
	 * The number of structural features of the '<em>Post Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.diagnostic.impl.InvariantProxyImpl <em>Invariant Proxy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.diagnostic.impl.InvariantProxyImpl
	 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getInvariantProxy()
	 * @generated
	 */
	int INVARIANT_PROXY = 8;

	/**
	 * The feature id for the '<em><b>Metaclass Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_PROXY__METACLASS_QUALIFIED_NAME = INVARIANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invariant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_PROXY__INVARIANT_NAME = INVARIANT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mm Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_PROXY__MM_URI = INVARIANT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_PROXY__MESSAGE = INVARIANT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Invariant Proxy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVARIANT_PROXY_FEATURE_COUNT = INVARIANT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getString()
	 * @generated
	 */
	int STRING = 9;


	/**
	 * Returns the meta object for class '{@link org.kermeta.diagnostic.DiagnosticModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.kermeta.diagnostic.DiagnosticModel
	 * @generated
	 */
	EClass getDiagnosticModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.diagnostic.DiagnosticModel#getDiagnostics <em>Diagnostics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagnostics</em>'.
	 * @see org.kermeta.diagnostic.DiagnosticModel#getDiagnostics()
	 * @see #getDiagnosticModel()
	 * @generated
	 */
	EReference getDiagnosticModel_Diagnostics();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.diagnostic.DiagnosticModel#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see org.kermeta.diagnostic.DiagnosticModel#getReferences()
	 * @see #getDiagnosticModel()
	 * @generated
	 */
	EReference getDiagnosticModel_References();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.diagnostic.DiagnosticModel#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Constraints</em>'.
	 * @see org.kermeta.diagnostic.DiagnosticModel#getConstraints()
	 * @see #getDiagnosticModel()
	 * @generated
	 */
	EReference getDiagnosticModel_Constraints();

	/**
	 * Returns the meta object for class '{@link org.kermeta.diagnostic.ConstraintDiagnostic <em>Constraint Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Diagnostic</em>'.
	 * @see org.kermeta.diagnostic.ConstraintDiagnostic
	 * @generated
	 */
	EClass getConstraintDiagnostic();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.diagnostic.ConstraintDiagnostic#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applies To</em>'.
	 * @see org.kermeta.diagnostic.ConstraintDiagnostic#getAppliesTo()
	 * @see #getConstraintDiagnostic()
	 * @generated
	 */
	EReference getConstraintDiagnostic_AppliesTo();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.diagnostic.ConstraintDiagnostic#getFailedConstraint <em>Failed Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failed Constraint</em>'.
	 * @see org.kermeta.diagnostic.ConstraintDiagnostic#getFailedConstraint()
	 * @see #getConstraintDiagnostic()
	 * @generated
	 */
	EReference getConstraintDiagnostic_FailedConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.diagnostic.ConstraintDiagnostic#isIsWarning <em>Is Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Warning</em>'.
	 * @see org.kermeta.diagnostic.ConstraintDiagnostic#isIsWarning()
	 * @see #getConstraintDiagnostic()
	 * @generated
	 */
	EAttribute getConstraintDiagnostic_IsWarning();

	/**
	 * Returns the meta object for class '{@link org.kermeta.diagnostic.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.kermeta.diagnostic.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for class '{@link org.kermeta.diagnostic.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Reference</em>'.
	 * @see org.kermeta.diagnostic.ModelReference
	 * @generated
	 */
	EClass getModelReference();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.diagnostic.ModelReference#getReferencedObject <em>Referenced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Object</em>'.
	 * @see org.kermeta.diagnostic.ModelReference#getReferencedObject()
	 * @see #getModelReference()
	 * @generated
	 */
	EReference getModelReference_ReferencedObject();

	/**
	 * Returns the meta object for class '{@link org.kermeta.diagnostic.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.kermeta.diagnostic.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link org.kermeta.diagnostic.Invariant <em>Invariant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invariant</em>'.
	 * @see org.kermeta.diagnostic.Invariant
	 * @generated
	 */
	EClass getInvariant();

	/**
	 * Returns the meta object for class '{@link org.kermeta.diagnostic.PreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Condition</em>'.
	 * @see org.kermeta.diagnostic.PreCondition
	 * @generated
	 */
	EClass getPreCondition();

	/**
	 * Returns the meta object for class '{@link org.kermeta.diagnostic.PostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Condition</em>'.
	 * @see org.kermeta.diagnostic.PostCondition
	 * @generated
	 */
	EClass getPostCondition();

	/**
	 * Returns the meta object for class '{@link org.kermeta.diagnostic.InvariantProxy <em>Invariant Proxy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invariant Proxy</em>'.
	 * @see org.kermeta.diagnostic.InvariantProxy
	 * @generated
	 */
	EClass getInvariantProxy();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.diagnostic.InvariantProxy#getMetaclassQualifiedName <em>Metaclass Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metaclass Qualified Name</em>'.
	 * @see org.kermeta.diagnostic.InvariantProxy#getMetaclassQualifiedName()
	 * @see #getInvariantProxy()
	 * @generated
	 */
	EAttribute getInvariantProxy_MetaclassQualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.diagnostic.InvariantProxy#getInvariantName <em>Invariant Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invariant Name</em>'.
	 * @see org.kermeta.diagnostic.InvariantProxy#getInvariantName()
	 * @see #getInvariantProxy()
	 * @generated
	 */
	EAttribute getInvariantProxy_InvariantName();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.diagnostic.InvariantProxy#getMmUri <em>Mm Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mm Uri</em>'.
	 * @see org.kermeta.diagnostic.InvariantProxy#getMmUri()
	 * @see #getInvariantProxy()
	 * @generated
	 */
	EAttribute getInvariantProxy_MmUri();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.diagnostic.InvariantProxy#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.kermeta.diagnostic.InvariantProxy#getMessage()
	 * @see #getInvariantProxy()
	 * @generated
	 */
	EAttribute getInvariantProxy_Message();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiagnosticFactory getDiagnosticFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.kermeta.diagnostic.impl.DiagnosticModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.diagnostic.impl.DiagnosticModelImpl
		 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getDiagnosticModel()
		 * @generated
		 */
		EClass DIAGNOSTIC_MODEL = eINSTANCE.getDiagnosticModel();

		/**
		 * The meta object literal for the '<em><b>Diagnostics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGNOSTIC_MODEL__DIAGNOSTICS = eINSTANCE.getDiagnosticModel_Diagnostics();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGNOSTIC_MODEL__REFERENCES = eINSTANCE.getDiagnosticModel_References();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGNOSTIC_MODEL__CONSTRAINTS = eINSTANCE.getDiagnosticModel_Constraints();

		/**
		 * The meta object literal for the '{@link org.kermeta.diagnostic.impl.ConstraintDiagnosticImpl <em>Constraint Diagnostic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.diagnostic.impl.ConstraintDiagnosticImpl
		 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getConstraintDiagnostic()
		 * @generated
		 */
		EClass CONSTRAINT_DIAGNOSTIC = eINSTANCE.getConstraintDiagnostic();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_DIAGNOSTIC__APPLIES_TO = eINSTANCE.getConstraintDiagnostic_AppliesTo();

		/**
		 * The meta object literal for the '<em><b>Failed Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_DIAGNOSTIC__FAILED_CONSTRAINT = eINSTANCE.getConstraintDiagnostic_FailedConstraint();

		/**
		 * The meta object literal for the '<em><b>Is Warning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_DIAGNOSTIC__IS_WARNING = eINSTANCE.getConstraintDiagnostic_IsWarning();

		/**
		 * The meta object literal for the '{@link org.kermeta.diagnostic.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.diagnostic.impl.ReferenceImpl
		 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '{@link org.kermeta.diagnostic.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.diagnostic.impl.ModelReferenceImpl
		 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getModelReference()
		 * @generated
		 */
		EClass MODEL_REFERENCE = eINSTANCE.getModelReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REFERENCE__REFERENCED_OBJECT = eINSTANCE.getModelReference_ReferencedObject();

		/**
		 * The meta object literal for the '{@link org.kermeta.diagnostic.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.diagnostic.impl.ConstraintImpl
		 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link org.kermeta.diagnostic.impl.InvariantImpl <em>Invariant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.diagnostic.impl.InvariantImpl
		 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getInvariant()
		 * @generated
		 */
		EClass INVARIANT = eINSTANCE.getInvariant();

		/**
		 * The meta object literal for the '{@link org.kermeta.diagnostic.impl.PreConditionImpl <em>Pre Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.diagnostic.impl.PreConditionImpl
		 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getPreCondition()
		 * @generated
		 */
		EClass PRE_CONDITION = eINSTANCE.getPreCondition();

		/**
		 * The meta object literal for the '{@link org.kermeta.diagnostic.impl.PostConditionImpl <em>Post Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.diagnostic.impl.PostConditionImpl
		 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getPostCondition()
		 * @generated
		 */
		EClass POST_CONDITION = eINSTANCE.getPostCondition();

		/**
		 * The meta object literal for the '{@link org.kermeta.diagnostic.impl.InvariantProxyImpl <em>Invariant Proxy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.diagnostic.impl.InvariantProxyImpl
		 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getInvariantProxy()
		 * @generated
		 */
		EClass INVARIANT_PROXY = eINSTANCE.getInvariantProxy();

		/**
		 * The meta object literal for the '<em><b>Metaclass Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVARIANT_PROXY__METACLASS_QUALIFIED_NAME = eINSTANCE.getInvariantProxy_MetaclassQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Invariant Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVARIANT_PROXY__INVARIANT_NAME = eINSTANCE.getInvariantProxy_InvariantName();

		/**
		 * The meta object literal for the '<em><b>Mm Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVARIANT_PROXY__MM_URI = eINSTANCE.getInvariantProxy_MmUri();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVARIANT_PROXY__MESSAGE = eINSTANCE.getInvariantProxy_Message();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.kermeta.diagnostic.impl.DiagnosticPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

	}

} //DiagnosticPackage
