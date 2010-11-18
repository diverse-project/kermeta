/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.traceability.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.kermeta.traceability.FileReference;
import org.kermeta.traceability.Message;
import org.kermeta.traceability.ModelReference;
import org.kermeta.traceability.QualifiedNameReference;
import org.kermeta.traceability.Reference;
import org.kermeta.traceability.TextReference;
import org.kermeta.traceability.Trace;
import org.kermeta.traceability.TraceModel;
import org.kermeta.traceability.TraceabilityFactory;
import org.kermeta.traceability.TraceabilityPackage;
import org.kermeta.traceability.XMLReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TraceabilityPackageImpl extends EPackageImpl implements TraceabilityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifiedNameReferenceEClass = null;

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
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objectEDataType = null;

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
	 * @see org.kermeta.traceability.TraceabilityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TraceabilityPackageImpl() {
		super(eNS_URI, TraceabilityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TraceabilityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TraceabilityPackage init() {
		if (isInited) return (TraceabilityPackage)EPackage.Registry.INSTANCE.getEPackage(TraceabilityPackage.eNS_URI);

		// Obtain or create and register package
		TraceabilityPackageImpl theTraceabilityPackage = (TraceabilityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TraceabilityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TraceabilityPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTraceabilityPackage.createPackageContents();

		// Initialize created meta-data
		theTraceabilityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTraceabilityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TraceabilityPackage.eNS_URI, theTraceabilityPackage);
		return theTraceabilityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceModel() {
		return traceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceModel_Traces() {
		return (EReference)traceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceModel_References() {
		return (EReference)traceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceModel_Messages() {
		return (EReference)traceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Language() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Type() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Value() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Traces() {
		return (EReference)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_TraceMdl() {
		return (EReference)messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_SourceReferences() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_TargetReferences() {
		return (EReference)traceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Description() {
		return (EReference)traceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_TraceMdl() {
		return (EReference)traceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_TargetTraces() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_SourceTraces() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_TraceMdl() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileReference() {
		return fileReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileReference_FileURI() {
		return (EAttribute)fileReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextReference() {
		return textReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextReference_CharBeginOffset() {
		return (EAttribute)textReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextReference_CharEndOffset() {
		return (EAttribute)textReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLReference() {
		return xmlReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLReference_XPointer() {
		return (EAttribute)xmlReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelReference() {
		return modelReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelReference_RefObject() {
		return (EReference)modelReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifiedNameReference() {
		return qualifiedNameReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualifiedNameReference_QualifiedName() {
		return (EAttribute)qualifiedNameReferenceEClass.getEStructuralFeatures().get(0);
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
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceabilityFactory getTraceabilityFactory() {
		return (TraceabilityFactory)getEFactoryInstance();
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
		traceModelEClass = createEClass(TRACE_MODEL);
		createEReference(traceModelEClass, TRACE_MODEL__TRACES);
		createEReference(traceModelEClass, TRACE_MODEL__REFERENCES);
		createEReference(traceModelEClass, TRACE_MODEL__MESSAGES);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__LANGUAGE);
		createEAttribute(messageEClass, MESSAGE__TYPE);
		createEAttribute(messageEClass, MESSAGE__VALUE);
		createEReference(messageEClass, MESSAGE__TRACES);
		createEReference(messageEClass, MESSAGE__TRACE_MDL);

		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__SOURCE_REFERENCES);
		createEReference(traceEClass, TRACE__TARGET_REFERENCES);
		createEReference(traceEClass, TRACE__DESCRIPTION);
		createEReference(traceEClass, TRACE__TRACE_MDL);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__TARGET_TRACES);
		createEReference(referenceEClass, REFERENCE__SOURCE_TRACES);
		createEReference(referenceEClass, REFERENCE__TRACE_MDL);

		fileReferenceEClass = createEClass(FILE_REFERENCE);
		createEAttribute(fileReferenceEClass, FILE_REFERENCE__FILE_URI);

		textReferenceEClass = createEClass(TEXT_REFERENCE);
		createEAttribute(textReferenceEClass, TEXT_REFERENCE__CHAR_BEGIN_OFFSET);
		createEAttribute(textReferenceEClass, TEXT_REFERENCE__CHAR_END_OFFSET);

		xmlReferenceEClass = createEClass(XML_REFERENCE);
		createEAttribute(xmlReferenceEClass, XML_REFERENCE__XPOINTER);

		modelReferenceEClass = createEClass(MODEL_REFERENCE);
		createEReference(modelReferenceEClass, MODEL_REFERENCE__REF_OBJECT);

		qualifiedNameReferenceEClass = createEClass(QUALIFIED_NAME_REFERENCE);
		createEAttribute(qualifiedNameReferenceEClass, QUALIFIED_NAME_REFERENCE__QUALIFIED_NAME);

		// Create data types
		stringEDataType = createEDataType(STRING);
		integerEDataType = createEDataType(INTEGER);
		objectEDataType = createEDataType(OBJECT);
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
		fileReferenceEClass.getESuperTypes().add(this.getReference());
		textReferenceEClass.getESuperTypes().add(this.getFileReference());
		xmlReferenceEClass.getESuperTypes().add(this.getFileReference());
		modelReferenceEClass.getESuperTypes().add(this.getReference());
		qualifiedNameReferenceEClass.getESuperTypes().add(this.getReference());

		// Initialize classes and features; add operations and parameters
		initEClass(traceModelEClass, TraceModel.class, "TraceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraceModel_Traces(), this.getTrace(), this.getTrace_TraceMdl(), "traces", null, 0, -1, TraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTraceModel_References(), this.getReference(), this.getReference_TraceMdl(), "references", null, 0, -1, TraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTraceModel_Messages(), this.getMessage(), this.getMessage_TraceMdl(), "messages", null, 0, -1, TraceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Language(), this.getString(), "language", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Type(), this.getString(), "type", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Value(), this.getString(), "value", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Traces(), this.getTrace(), this.getTrace_Description(), "traces", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_TraceMdl(), this.getTraceModel(), this.getTraceModel_Messages(), "traceMdl", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_SourceReferences(), this.getReference(), this.getReference_TargetTraces(), "sourceReferences", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_TargetReferences(), this.getReference(), this.getReference_SourceTraces(), "targetReferences", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_Description(), this.getMessage(), this.getMessage_Traces(), "description", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrace_TraceMdl(), this.getTraceModel(), this.getTraceModel_Traces(), "traceMdl", null, 1, 1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_TargetTraces(), this.getTrace(), this.getTrace_SourceReferences(), "targetTraces", null, 0, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_SourceTraces(), this.getTrace(), this.getTrace_TargetReferences(), "sourceTraces", null, 0, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_TraceMdl(), this.getTraceModel(), this.getTraceModel_References(), "traceMdl", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileReferenceEClass, FileReference.class, "FileReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileReference_FileURI(), this.getString(), "fileURI", null, 1, 1, FileReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textReferenceEClass, TextReference.class, "TextReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextReference_CharBeginOffset(), this.getInteger(), "charBeginOffset", null, 1, 1, TextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextReference_CharEndOffset(), this.getInteger(), "charEndOffset", null, 1, 1, TextReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlReferenceEClass, XMLReference.class, "XMLReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLReference_XPointer(), this.getString(), "xPointer", null, 1, 1, XMLReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelReferenceEClass, ModelReference.class, "ModelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelReference_RefObject(), ecorePackage.getEObject(), null, "refObject", null, 1, 1, ModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qualifiedNameReferenceEClass, QualifiedNameReference.class, "QualifiedNameReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualifiedNameReference_QualifiedName(), this.getString(), "qualifiedName", null, 1, 1, QualifiedNameReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, Integer.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// kermeta.req
		createKermetaAnnotations();
		// kermeta
		createKermeta_1Annotations();
		// kermeta.inv
		createKermeta_2Annotations();
	}

	/**
	 * Initializes the annotations for <b>kermeta.req</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermetaAnnotations() {
		String source = "kermeta.req";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km", "platform:/plugin/fr.irisa.triskell.kermeta/lib/framework.km"
		   });																												
	}

	/**
	 * Initializes the annotations for <b>kermeta</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermeta_1Annotations() {
		String source = "kermeta";			
		addAnnotation
		  (traceModelEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\r\n * This class represents a trace model.\r\n * This is a set of traces, references and messages.\r\n */"
		   });		
		addAnnotation
		  (getTraceModel_Traces(), 
		   source, 
		   new String[] {
			 "documentation", "/** Set of traces contained by the trace model */"
		   });		
		addAnnotation
		  (getTraceModel_References(), 
		   source, 
		   new String[] {
			 "documentation", "/** Set of references to the traced objects of the trace model */"
		   });		
		addAnnotation
		  (getTraceModel_Messages(), 
		   source, 
		   new String[] {
			 "documentation", "/** Set of messages contained by the trace model */"
		   });		
		addAnnotation
		  (messageEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\r\n * This class represents a trace message, used to add some information to traces.\r\n * Typically, in order to known what had generated a given trace or provide a user\r\n * friendly message to the user.\r\n */"
		   });		
		addAnnotation
		  (getMessage_Language(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** Language of the message (english, french, etc.) */"
		   });		
		addAnnotation
		  (getMessage_Type(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** Message kind */"
		   });		
		addAnnotation
		  (getMessage_Value(), 
		   source, 
		   new String[] {
			 "isComposite", "true"
		   });		
		addAnnotation
		  (getMessage_Traces(), 
		   source, 
		   new String[] {
			 "documentation", "/** Link to the traces the message is associated with */"
		   });		
		addAnnotation
		  (getMessage_TraceMdl(), 
		   source, 
		   new String[] {
			 "documentation", "/** Link to the containing trace model */"
		   });		
		addAnnotation
		  (traceEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\r\n * This class represents a trace element\r\n */"
		   });		
		addAnnotation
		  (getTrace_SourceReferences(), 
		   source, 
		   new String[] {
			 "documentation", "/** Link to the references to the trace incoming elements */"
		   });		
		addAnnotation
		  (getTrace_TargetReferences(), 
		   source, 
		   new String[] {
			 "documentation", "/** Link to the references to the trace outgoing elements */"
		   });		
		addAnnotation
		  (getTrace_Description(), 
		   source, 
		   new String[] {
			 "documentation", "/** Link to the messages describing the trace */"
		   });		
		addAnnotation
		  (getTrace_TraceMdl(), 
		   source, 
		   new String[] {
			 "documentation", "/** Link to the containing trace model */"
		   });		
		addAnnotation
		  (referenceEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\r\n * This abstract class represents a reference to a concrete object\r\n */"
		   });		
		addAnnotation
		  (getReference_TargetTraces(), 
		   source, 
		   new String[] {
			 "documentation", "/** Link to the reference target traces */"
		   });		
		addAnnotation
		  (getReference_SourceTraces(), 
		   source, 
		   new String[] {
			 "documentation", "/** Link to the reference source traces */"
		   });		
		addAnnotation
		  (getReference_TraceMdl(), 
		   source, 
		   new String[] {
			 "documentation", "/** Link to the containing trace model */"
		   });		
		addAnnotation
		  (fileReferenceEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\r\n * This class represents a reference to a concrete object contained by a file\r\n */"
		   });		
		addAnnotation
		  (getFileReference_FileURI(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** URI of the file containing the referred concrete object */"
		   });		
		addAnnotation
		  (textReferenceEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\r\n * This class represents a reference to a textual file concrete object\r\n */"
		   });			
		addAnnotation
		  (getTextReference_CharBeginOffset(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** Starting line number */"
		   });		
		addAnnotation
		  (getTextReference_CharEndOffset(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** Starting character number */"
		   });		
		addAnnotation
		  (xmlReferenceEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\r\n * This class represents a reference to a XML concrete object\r\n */"
		   });		
		addAnnotation
		  (getXMLReference_XPointer(), 
		   source, 
		   new String[] {
			 "isComposite", "true",
			 "documentation", "/** XML link to the referred XML concrete object */"
		   });		
		addAnnotation
		  (modelReferenceEClass, 
		   source, 
		   new String[] {
			 "documentation", "/**\r\n * This class represents a reference to a model element\r\n */"
		   });
	}

	/**
	 * Initializes the annotations for <b>kermeta.inv</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createKermeta_2Annotations() {
		String source = "kermeta.inv";																									
		addAnnotation
		  (textReferenceEClass, 
		   source, 
		   new String[] {
			 "validTextRef", "do\n\tlineEndAt.isGreater(lineBeginAt).~or(lineBeginAt.equals(lineEndAt).~and(charEndAt.isGreaterOrEqual(charBeginAt)))\nend"
		   });					
	}

} //TraceabilityPackageImpl
