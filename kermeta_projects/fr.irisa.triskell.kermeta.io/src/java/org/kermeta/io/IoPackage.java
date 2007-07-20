/**
 * <copyright>
 * </copyright>
 *
 * $Id: IoPackage.java,v 1.2 2007-07-20 15:08:08 ftanguy Exp $
 */
package org.kermeta.io;

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
 * @see org.kermeta.io.IoFactory
 * @model kind="package"
 * @generated
 */
public interface IoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "io";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://io";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "io";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IoPackage eINSTANCE = org.kermeta.io.impl.IoPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.io.impl.KermetaUnitImpl <em>Kermeta Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.impl.KermetaUnitImpl
	 * @see org.kermeta.io.impl.IoPackageImpl#getKermetaUnit()
	 * @generated
	 */
	int KERMETA_UNIT = 0;

	/**
	 * The feature id for the '<em><b>Storer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT__STORER = 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT__URI = 1;

	/**
	 * The feature id for the '<em><b>Modeling Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT__MODELING_UNIT = 2;

	/**
	 * The feature id for the '<em><b>Internal Package Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT__INTERNAL_PACKAGE_ENTRIES = 3;

	/**
	 * The feature id for the '<em><b>External Package Entries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT__EXTERNAL_PACKAGE_ENTRIES = 4;

	/**
	 * The feature id for the '<em><b>Imported Kermeta Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT__IMPORTED_KERMETA_UNITS = 5;

	/**
	 * The feature id for the '<em><b>Importers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT__IMPORTERS = 6;

	/**
	 * The feature id for the '<em><b>Building State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT__BUILDING_STATE = 7;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT__MESSAGES = 8;

	/**
	 * The feature id for the '<em><b>Need AST Traces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT__NEED_AST_TRACES = 9;

	/**
	 * The feature id for the '<em><b>Type Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT__TYPE_CHECKED = 10;

	/**
	 * The feature id for the '<em><b>Framework</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT__FRAMEWORK = 11;

	/**
	 * The feature id for the '<em><b>Tracer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT__TRACER = 12;

	/**
	 * The feature id for the '<em><b>Constraint Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT__CONSTRAINT_CHECKED = 13;

	/**
	 * The number of structural features of the '<em>Kermeta Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.kermeta.io.impl.KermetaUnitStorerImpl <em>Kermeta Unit Storer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.impl.KermetaUnitStorerImpl
	 * @see org.kermeta.io.impl.IoPackageImpl#getKermetaUnitStorer()
	 * @generated
	 */
	int KERMETA_UNIT_STORER = 2;

	/**
	 * The meta object id for the '{@link org.kermeta.io.impl.PackageEntryImpl <em>Package Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.impl.PackageEntryImpl
	 * @see org.kermeta.io.impl.IoPackageImpl#getPackageEntry()
	 * @generated
	 */
	int PACKAGE_ENTRY = 3;

	/**
	 * The meta object id for the '{@link org.kermeta.io.impl.IBuildingStateImpl <em>IBuilding State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.impl.IBuildingStateImpl
	 * @see org.kermeta.io.impl.IoPackageImpl#getIBuildingState()
	 * @generated
	 */
	int IBUILDING_STATE = 1;

	/**
	 * The number of structural features of the '<em>IBuilding State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBUILDING_STATE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Kermeta Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT_STORER__KERMETA_UNITS = 0;

	/**
	 * The number of structural features of the '<em>Kermeta Unit Storer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT_STORER_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ENTRY__QUALIFIED_NAME = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ENTRY__PACKAGE = 1;

	/**
	 * The number of structural features of the '<em>Package Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.kermeta.io.KermetaUnitLoader <em>Kermeta Unit Loader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.KermetaUnitLoader
	 * @see org.kermeta.io.impl.IoPackageImpl#getKermetaUnitLoader()
	 * @generated
	 */
	int KERMETA_UNIT_LOADER = 4;

	/**
	 * The feature id for the '<em><b>Kermeta Units</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT_LOADER__KERMETA_UNITS = 0;

	/**
	 * The number of structural features of the '<em>Kermeta Unit Loader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_UNIT_LOADER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.kermeta.io.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.impl.MessageImpl
	 * @see org.kermeta.io.impl.IoPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.kermeta.io.impl.ErrorMessageImpl <em>Error Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.impl.ErrorMessageImpl
	 * @see org.kermeta.io.impl.IoPackageImpl#getErrorMessage()
	 * @generated
	 */
	int ERROR_MESSAGE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE__VALUE = MESSAGE__VALUE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE__TARGET = MESSAGE__TARGET;

	/**
	 * The number of structural features of the '<em>Error Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.io.impl.WarningMessageImpl <em>Warning Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.impl.WarningMessageImpl
	 * @see org.kermeta.io.impl.IoPackageImpl#getWarningMessage()
	 * @generated
	 */
	int WARNING_MESSAGE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_MESSAGE__VALUE = MESSAGE__VALUE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_MESSAGE__TARGET = MESSAGE__TARGET;

	/**
	 * The number of structural features of the '<em>Warning Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.io.impl.ParseErrorMessageImpl <em>Parse Error Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.impl.ParseErrorMessageImpl
	 * @see org.kermeta.io.impl.IoPackageImpl#getParseErrorMessage()
	 * @generated
	 */
	int PARSE_ERROR_MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_ERROR_MESSAGE__VALUE = ERROR_MESSAGE__VALUE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_ERROR_MESSAGE__TARGET = ERROR_MESSAGE__TARGET;

	/**
	 * The feature id for the '<em><b>Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_ERROR_MESSAGE__NODE = ERROR_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parse Error Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSE_ERROR_MESSAGE_FEATURE_COUNT = ERROR_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.io.impl.ParsingErrorImpl <em>Parsing Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.impl.ParsingErrorImpl
	 * @see org.kermeta.io.impl.IoPackageImpl#getParsingError()
	 * @generated
	 */
	int PARSING_ERROR = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSING_ERROR__VALUE = ERROR_MESSAGE__VALUE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSING_ERROR__TARGET = ERROR_MESSAGE__TARGET;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSING_ERROR__OFFSET = ERROR_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSING_ERROR__LENGTH = ERROR_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parsing Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSING_ERROR_FEATURE_COUNT = ERROR_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Set
	 * @see org.kermeta.io.impl.IoPackageImpl#getSet()
	 * @generated
	 */
	int SET = 10;


	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.kermeta.io.impl.IoPackageImpl#getList()
	 * @generated
	 */
	int LIST = 11;


	/**
	 * The meta object id for the '<em>Tracer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.traceability.helper.Tracer
	 * @see org.kermeta.io.impl.IoPackageImpl#getTracer()
	 * @generated
	 */
	int TRACER = 12;


	/**
	 * The meta object id for the '<em>AST Node</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ibm.eclipse.ldt.core.ast.ASTNode
	 * @see org.kermeta.io.impl.IoPackageImpl#getASTNode()
	 * @generated
	 */
	int AST_NODE = 13;


	/**
	 * The meta object id for the '<em>Recognition Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see antlr.RecognitionException
	 * @see org.kermeta.io.impl.IoPackageImpl#getRecognitionException()
	 * @generated
	 */
	int RECOGNITION_EXCEPTION = 14;


	/**
	 * The meta object id for the '<em>IO Plugin</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.io.plugin.IOPlugin
	 * @see org.kermeta.io.impl.IoPackageImpl#getIOPlugin()
	 * @generated
	 */
	int IO_PLUGIN = 15;


	/**
	 * Returns the meta object for class '{@link org.kermeta.io.KermetaUnit <em>Kermeta Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kermeta Unit</em>'.
	 * @see org.kermeta.io.KermetaUnit
	 * @generated
	 */
	EClass getKermetaUnit();

	/**
	 * Returns the meta object for the container reference '{@link org.kermeta.io.KermetaUnit#getStorer <em>Storer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Storer</em>'.
	 * @see org.kermeta.io.KermetaUnit#getStorer()
	 * @see #getKermetaUnit()
	 * @generated
	 */
	EReference getKermetaUnit_Storer();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.KermetaUnit#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.kermeta.io.KermetaUnit#getUri()
	 * @see #getKermetaUnit()
	 * @generated
	 */
	EAttribute getKermetaUnit_Uri();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.io.KermetaUnit#getModelingUnit <em>Modeling Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modeling Unit</em>'.
	 * @see org.kermeta.io.KermetaUnit#getModelingUnit()
	 * @see #getKermetaUnit()
	 * @generated
	 */
	EReference getKermetaUnit_ModelingUnit();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.io.KermetaUnit#getInternalPackageEntries <em>Internal Package Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Internal Package Entries</em>'.
	 * @see org.kermeta.io.KermetaUnit#getInternalPackageEntries()
	 * @see #getKermetaUnit()
	 * @generated
	 */
	EReference getKermetaUnit_InternalPackageEntries();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.io.KermetaUnit#getExternalPackageEntries <em>External Package Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Package Entries</em>'.
	 * @see org.kermeta.io.KermetaUnit#getExternalPackageEntries()
	 * @see #getKermetaUnit()
	 * @generated
	 */
	EReference getKermetaUnit_ExternalPackageEntries();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.io.KermetaUnit#getImportedKermetaUnits <em>Imported Kermeta Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Kermeta Units</em>'.
	 * @see org.kermeta.io.KermetaUnit#getImportedKermetaUnits()
	 * @see #getKermetaUnit()
	 * @generated
	 */
	EReference getKermetaUnit_ImportedKermetaUnits();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.io.KermetaUnit#getImporters <em>Importers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Importers</em>'.
	 * @see org.kermeta.io.KermetaUnit#getImporters()
	 * @see #getKermetaUnit()
	 * @generated
	 */
	EReference getKermetaUnit_Importers();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.io.KermetaUnit#getBuildingState <em>Building State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Building State</em>'.
	 * @see org.kermeta.io.KermetaUnit#getBuildingState()
	 * @see #getKermetaUnit()
	 * @generated
	 */
	EReference getKermetaUnit_BuildingState();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.io.KermetaUnit#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Messages</em>'.
	 * @see org.kermeta.io.KermetaUnit#getMessages()
	 * @see #getKermetaUnit()
	 * @generated
	 */
	EReference getKermetaUnit_Messages();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.KermetaUnit#isNeedASTTraces <em>Need AST Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need AST Traces</em>'.
	 * @see org.kermeta.io.KermetaUnit#isNeedASTTraces()
	 * @see #getKermetaUnit()
	 * @generated
	 */
	EAttribute getKermetaUnit_NeedASTTraces();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.KermetaUnit#isTypeChecked <em>Type Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Checked</em>'.
	 * @see org.kermeta.io.KermetaUnit#isTypeChecked()
	 * @see #getKermetaUnit()
	 * @generated
	 */
	EAttribute getKermetaUnit_TypeChecked();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.KermetaUnit#isFramework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Framework</em>'.
	 * @see org.kermeta.io.KermetaUnit#isFramework()
	 * @see #getKermetaUnit()
	 * @generated
	 */
	EAttribute getKermetaUnit_Framework();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.KermetaUnit#getTracer <em>Tracer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracer</em>'.
	 * @see org.kermeta.io.KermetaUnit#getTracer()
	 * @see #getKermetaUnit()
	 * @generated
	 */
	EAttribute getKermetaUnit_Tracer();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.KermetaUnit#isConstraintChecked <em>Constraint Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Checked</em>'.
	 * @see org.kermeta.io.KermetaUnit#isConstraintChecked()
	 * @see #getKermetaUnit()
	 * @generated
	 */
	EAttribute getKermetaUnit_ConstraintChecked();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.KermetaUnitStorer <em>Kermeta Unit Storer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kermeta Unit Storer</em>'.
	 * @see org.kermeta.io.KermetaUnitStorer
	 * @generated
	 */
	EClass getKermetaUnitStorer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.io.KermetaUnitStorer#getKermetaUnits <em>Kermeta Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kermeta Units</em>'.
	 * @see org.kermeta.io.KermetaUnitStorer#getKermetaUnits()
	 * @see #getKermetaUnitStorer()
	 * @generated
	 */
	EReference getKermetaUnitStorer_KermetaUnits();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.PackageEntry <em>Package Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package Entry</em>'.
	 * @see org.kermeta.io.PackageEntry
	 * @generated
	 */
	EClass getPackageEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.PackageEntry#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see org.kermeta.io.PackageEntry#getQualifiedName()
	 * @see #getPackageEntry()
	 * @generated
	 */
	EAttribute getPackageEntry_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.io.PackageEntry#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see org.kermeta.io.PackageEntry#getPackage()
	 * @see #getPackageEntry()
	 * @generated
	 */
	EReference getPackageEntry_Package();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.IBuildingState <em>IBuilding State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBuilding State</em>'.
	 * @see org.kermeta.io.IBuildingState
	 * @generated
	 */
	EClass getIBuildingState();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.KermetaUnitLoader <em>Kermeta Unit Loader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kermeta Unit Loader</em>'.
	 * @see org.kermeta.io.KermetaUnitLoader
	 * @generated
	 */
	EClass getKermetaUnitLoader();

	/**
	 * Returns the meta object for the reference list '{@link org.kermeta.io.KermetaUnitLoader#getKermetaUnits <em>Kermeta Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Kermeta Units</em>'.
	 * @see org.kermeta.io.KermetaUnitLoader#getKermetaUnits()
	 * @see #getKermetaUnitLoader()
	 * @generated
	 */
	EReference getKermetaUnitLoader_KermetaUnits();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see org.kermeta.io.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.Message#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.kermeta.io.Message#getValue()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.Message#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.kermeta.io.Message#getTarget()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Target();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.ErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Message</em>'.
	 * @see org.kermeta.io.ErrorMessage
	 * @generated
	 */
	EClass getErrorMessage();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.WarningMessage <em>Warning Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warning Message</em>'.
	 * @see org.kermeta.io.WarningMessage
	 * @generated
	 */
	EClass getWarningMessage();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.ParseErrorMessage <em>Parse Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parse Error Message</em>'.
	 * @see org.kermeta.io.ParseErrorMessage
	 * @generated
	 */
	EClass getParseErrorMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.ParseErrorMessage#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node</em>'.
	 * @see org.kermeta.io.ParseErrorMessage#getNode()
	 * @see #getParseErrorMessage()
	 * @generated
	 */
	EAttribute getParseErrorMessage_Node();

	/**
	 * Returns the meta object for class '{@link org.kermeta.io.ParsingError <em>Parsing Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parsing Error</em>'.
	 * @see org.kermeta.io.ParsingError
	 * @generated
	 */
	EClass getParsingError();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.ParsingError#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see org.kermeta.io.ParsingError#getOffset()
	 * @see #getParsingError()
	 * @generated
	 */
	EAttribute getParsingError_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.io.ParsingError#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.kermeta.io.ParsingError#getLength()
	 * @see #getParsingError()
	 * @generated
	 */
	EAttribute getParsingError_Length();

	/**
	 * Returns the meta object for data type '{@link java.util.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Set</em>'.
	 * @see java.util.Set
	 * @model instanceClass="java.util.Set"
	 * @generated
	 */
	EDataType getSet();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link fr.irisa.triskell.traceability.helper.Tracer <em>Tracer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tracer</em>'.
	 * @see fr.irisa.triskell.traceability.helper.Tracer
	 * @model instanceClass="fr.irisa.triskell.traceability.helper.Tracer"
	 * @generated
	 */
	EDataType getTracer();

	/**
	 * Returns the meta object for data type '{@link com.ibm.eclipse.ldt.core.ast.ASTNode <em>AST Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>AST Node</em>'.
	 * @see com.ibm.eclipse.ldt.core.ast.ASTNode
	 * @model instanceClass="com.ibm.eclipse.ldt.core.ast.ASTNode"
	 * @generated
	 */
	EDataType getASTNode();

	/**
	 * Returns the meta object for data type '{@link antlr.RecognitionException <em>Recognition Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Recognition Exception</em>'.
	 * @see antlr.RecognitionException
	 * @model instanceClass="antlr.RecognitionException"
	 * @generated
	 */
	EDataType getRecognitionException();

	/**
	 * Returns the meta object for data type '{@link org.kermeta.io.plugin.IOPlugin <em>IO Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IO Plugin</em>'.
	 * @see org.kermeta.io.plugin.IOPlugin
	 * @model instanceClass="org.kermeta.io.plugin.IOPlugin"
	 * @generated
	 */
	EDataType getIOPlugin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IoFactory getIoFactory();

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
	interface Literals  {
		/**
		 * The meta object literal for the '{@link org.kermeta.io.impl.KermetaUnitImpl <em>Kermeta Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.impl.KermetaUnitImpl
		 * @see org.kermeta.io.impl.IoPackageImpl#getKermetaUnit()
		 * @generated
		 */
		EClass KERMETA_UNIT = eINSTANCE.getKermetaUnit();

		/**
		 * The meta object literal for the '<em><b>Storer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_UNIT__STORER = eINSTANCE.getKermetaUnit_Storer();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERMETA_UNIT__URI = eINSTANCE.getKermetaUnit_Uri();

		/**
		 * The meta object literal for the '<em><b>Modeling Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_UNIT__MODELING_UNIT = eINSTANCE.getKermetaUnit_ModelingUnit();

		/**
		 * The meta object literal for the '<em><b>Internal Package Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_UNIT__INTERNAL_PACKAGE_ENTRIES = eINSTANCE.getKermetaUnit_InternalPackageEntries();

		/**
		 * The meta object literal for the '<em><b>External Package Entries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_UNIT__EXTERNAL_PACKAGE_ENTRIES = eINSTANCE.getKermetaUnit_ExternalPackageEntries();

		/**
		 * The meta object literal for the '<em><b>Imported Kermeta Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_UNIT__IMPORTED_KERMETA_UNITS = eINSTANCE.getKermetaUnit_ImportedKermetaUnits();

		/**
		 * The meta object literal for the '<em><b>Importers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_UNIT__IMPORTERS = eINSTANCE.getKermetaUnit_Importers();

		/**
		 * The meta object literal for the '<em><b>Building State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_UNIT__BUILDING_STATE = eINSTANCE.getKermetaUnit_BuildingState();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_UNIT__MESSAGES = eINSTANCE.getKermetaUnit_Messages();

		/**
		 * The meta object literal for the '<em><b>Need AST Traces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERMETA_UNIT__NEED_AST_TRACES = eINSTANCE.getKermetaUnit_NeedASTTraces();

		/**
		 * The meta object literal for the '<em><b>Type Checked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERMETA_UNIT__TYPE_CHECKED = eINSTANCE.getKermetaUnit_TypeChecked();

		/**
		 * The meta object literal for the '<em><b>Framework</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERMETA_UNIT__FRAMEWORK = eINSTANCE.getKermetaUnit_Framework();

		/**
		 * The meta object literal for the '<em><b>Tracer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERMETA_UNIT__TRACER = eINSTANCE.getKermetaUnit_Tracer();

		/**
		 * The meta object literal for the '<em><b>Constraint Checked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERMETA_UNIT__CONSTRAINT_CHECKED = eINSTANCE.getKermetaUnit_ConstraintChecked();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.impl.KermetaUnitStorerImpl <em>Kermeta Unit Storer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.impl.KermetaUnitStorerImpl
		 * @see org.kermeta.io.impl.IoPackageImpl#getKermetaUnitStorer()
		 * @generated
		 */
		EClass KERMETA_UNIT_STORER = eINSTANCE.getKermetaUnitStorer();

		/**
		 * The meta object literal for the '<em><b>Kermeta Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_UNIT_STORER__KERMETA_UNITS = eINSTANCE.getKermetaUnitStorer_KermetaUnits();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.impl.PackageEntryImpl <em>Package Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.impl.PackageEntryImpl
		 * @see org.kermeta.io.impl.IoPackageImpl#getPackageEntry()
		 * @generated
		 */
		EClass PACKAGE_ENTRY = eINSTANCE.getPackageEntry();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE_ENTRY__QUALIFIED_NAME = eINSTANCE.getPackageEntry_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE_ENTRY__PACKAGE = eINSTANCE.getPackageEntry_Package();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.impl.IBuildingStateImpl <em>IBuilding State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.impl.IBuildingStateImpl
		 * @see org.kermeta.io.impl.IoPackageImpl#getIBuildingState()
		 * @generated
		 */
		EClass IBUILDING_STATE = eINSTANCE.getIBuildingState();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.KermetaUnitLoader <em>Kermeta Unit Loader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.KermetaUnitLoader
		 * @see org.kermeta.io.impl.IoPackageImpl#getKermetaUnitLoader()
		 * @generated
		 */
		EClass KERMETA_UNIT_LOADER = eINSTANCE.getKermetaUnitLoader();

		/**
		 * The meta object literal for the '<em><b>Kermeta Units</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_UNIT_LOADER__KERMETA_UNITS = eINSTANCE.getKermetaUnitLoader_KermetaUnits();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.impl.MessageImpl
		 * @see org.kermeta.io.impl.IoPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__VALUE = eINSTANCE.getMessage_Value();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__TARGET = eINSTANCE.getMessage_Target();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.impl.ErrorMessageImpl <em>Error Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.impl.ErrorMessageImpl
		 * @see org.kermeta.io.impl.IoPackageImpl#getErrorMessage()
		 * @generated
		 */
		EClass ERROR_MESSAGE = eINSTANCE.getErrorMessage();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.impl.WarningMessageImpl <em>Warning Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.impl.WarningMessageImpl
		 * @see org.kermeta.io.impl.IoPackageImpl#getWarningMessage()
		 * @generated
		 */
		EClass WARNING_MESSAGE = eINSTANCE.getWarningMessage();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.impl.ParseErrorMessageImpl <em>Parse Error Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.impl.ParseErrorMessageImpl
		 * @see org.kermeta.io.impl.IoPackageImpl#getParseErrorMessage()
		 * @generated
		 */
		EClass PARSE_ERROR_MESSAGE = eINSTANCE.getParseErrorMessage();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARSE_ERROR_MESSAGE__NODE = eINSTANCE.getParseErrorMessage_Node();

		/**
		 * The meta object literal for the '{@link org.kermeta.io.impl.ParsingErrorImpl <em>Parsing Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.impl.ParsingErrorImpl
		 * @see org.kermeta.io.impl.IoPackageImpl#getParsingError()
		 * @generated
		 */
		EClass PARSING_ERROR = eINSTANCE.getParsingError();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARSING_ERROR__OFFSET = eINSTANCE.getParsingError_Offset();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARSING_ERROR__LENGTH = eINSTANCE.getParsingError_Length();

		/**
		 * The meta object literal for the '<em>Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Set
		 * @see org.kermeta.io.impl.IoPackageImpl#getSet()
		 * @generated
		 */
		EDataType SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.kermeta.io.impl.IoPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Tracer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.traceability.helper.Tracer
		 * @see org.kermeta.io.impl.IoPackageImpl#getTracer()
		 * @generated
		 */
		EDataType TRACER = eINSTANCE.getTracer();

		/**
		 * The meta object literal for the '<em>AST Node</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ibm.eclipse.ldt.core.ast.ASTNode
		 * @see org.kermeta.io.impl.IoPackageImpl#getASTNode()
		 * @generated
		 */
		EDataType AST_NODE = eINSTANCE.getASTNode();

		/**
		 * The meta object literal for the '<em>Recognition Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see antlr.RecognitionException
		 * @see org.kermeta.io.impl.IoPackageImpl#getRecognitionException()
		 * @generated
		 */
		EDataType RECOGNITION_EXCEPTION = eINSTANCE.getRecognitionException();

		/**
		 * The meta object literal for the '<em>IO Plugin</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.io.plugin.IOPlugin
		 * @see org.kermeta.io.impl.IoPackageImpl#getIOPlugin()
		 * @generated
		 */
		EDataType IO_PLUGIN = eINSTANCE.getIOPlugin();

	}

} //IoPackage
