/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.kermeta.kp.KpFactory
 * @model kind="package"
 * @generated
 */
public interface KpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/kp/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.kermeta.kp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KpPackage eINSTANCE = org.kermeta.kp.impl.KpPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.kp.impl.KermetaProjectImpl <em>Kermeta Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kp.impl.KermetaProjectImpl
	 * @see org.kermeta.kp.impl.KpPackageImpl#getKermetaProject()
	 * @generated
	 */
	int KERMETA_PROJECT = 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kp.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kp.impl.NamedElementImpl
	 * @see org.kermeta.kp.impl.KpPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_PROJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_PROJECT__DEPENDENCIES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_PROJECT__SOURCES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Weave Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_PROJECT__WEAVE_DIRECTIVES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_PROJECT__OPTIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_PROJECT__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_PROJECT__GROUP = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Kermeta Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KERMETA_PROJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.kermeta.kp.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kp.impl.DependencyImpl
	 * @see org.kermeta.kp.impl.KpPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__PROJECT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.kp.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kp.impl.SourceImpl
	 * @see org.kermeta.kp.impl.KpPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 3;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kp.impl.SourceFolderImpl <em>Source Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kp.impl.SourceFolderImpl
	 * @see org.kermeta.kp.impl.KpPackageImpl#getSourceFolder()
	 * @generated
	 */
	int SOURCE_FOLDER = 4;

	/**
	 * The number of structural features of the '<em>Source Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FOLDER_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kp.impl.SourceFileImpl <em>Source File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kp.impl.SourceFileImpl
	 * @see org.kermeta.kp.impl.KpPackageImpl#getSourceFile()
	 * @generated
	 */
	int SOURCE_FILE = 5;

	/**
	 * The number of structural features of the '<em>Source File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FILE_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kp.impl.ImportedSourceImpl <em>Imported Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kp.impl.ImportedSourceImpl
	 * @see org.kermeta.kp.impl.KpPackageImpl#getImportedSource()
	 * @generated
	 */
	int IMPORTED_SOURCE = 8;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_SOURCE__FROM = SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imported Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_SOURCE_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.kp.impl.SourceNSURIImpl <em>Source NSURI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kp.impl.SourceNSURIImpl
	 * @see org.kermeta.kp.impl.KpPackageImpl#getSourceNSURI()
	 * @generated
	 */
	int SOURCE_NSURI = 6;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_NSURI__FROM = IMPORTED_SOURCE__FROM;

	/**
	 * The number of structural features of the '<em>Source NSURI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_NSURI_FEATURE_COUNT = IMPORTED_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kp.impl.SourceQueryImpl <em>Source Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kp.impl.SourceQueryImpl
	 * @see org.kermeta.kp.impl.KpPackageImpl#getSourceQuery()
	 * @generated
	 */
	int SOURCE_QUERY = 7;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_QUERY__FROM = IMPORTED_SOURCE__FROM;

	/**
	 * The number of structural features of the '<em>Source Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_QUERY_FEATURE_COUNT = IMPORTED_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kp.impl.WeaveDirectiveImpl <em>Weave Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kp.impl.WeaveDirectiveImpl
	 * @see org.kermeta.kp.impl.KpPackageImpl#getWeaveDirective()
	 * @generated
	 */
	int WEAVE_DIRECTIVE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVE_DIRECTIVE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Mix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVE_DIRECTIVE__MIX = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVE_DIRECTIVE__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Weave Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAVE_DIRECTIVE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.kermeta.kp.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kp.impl.OptionImpl
	 * @see org.kermeta.kp.impl.KpPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.kp.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kp.impl.ExpressionImpl
	 * @see org.kermeta.kp.impl.KpPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 11;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.kermeta.kp.impl.StringExpressionImpl <em>String Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kp.impl.StringExpressionImpl
	 * @see org.kermeta.kp.impl.KpPackageImpl#getStringExpression()
	 * @generated
	 */
	int STRING_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.kermeta.kp.impl.MixExpressionImpl <em>Mix Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.kp.impl.MixExpressionImpl
	 * @see org.kermeta.kp.impl.KpPackageImpl#getMixExpression()
	 * @generated
	 */
	int MIX_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mix Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.kermeta.kp.KermetaProject <em>Kermeta Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kermeta Project</em>'.
	 * @see org.kermeta.kp.KermetaProject
	 * @generated
	 */
	EClass getKermetaProject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.kp.KermetaProject#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see org.kermeta.kp.KermetaProject#getDependencies()
	 * @see #getKermetaProject()
	 * @generated
	 */
	EReference getKermetaProject_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.kp.KermetaProject#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see org.kermeta.kp.KermetaProject#getSources()
	 * @see #getKermetaProject()
	 * @generated
	 */
	EReference getKermetaProject_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.kp.KermetaProject#getWeaveDirectives <em>Weave Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weave Directives</em>'.
	 * @see org.kermeta.kp.KermetaProject#getWeaveDirectives()
	 * @see #getKermetaProject()
	 * @generated
	 */
	EReference getKermetaProject_WeaveDirectives();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.kp.KermetaProject#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.kermeta.kp.KermetaProject#getOptions()
	 * @see #getKermetaProject()
	 * @generated
	 */
	EReference getKermetaProject_Options();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.kp.KermetaProject#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.kermeta.kp.KermetaProject#getVersion()
	 * @see #getKermetaProject()
	 * @generated
	 */
	EAttribute getKermetaProject_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.kp.KermetaProject#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see org.kermeta.kp.KermetaProject#getGroup()
	 * @see #getKermetaProject()
	 * @generated
	 */
	EAttribute getKermetaProject_Group();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kp.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see org.kermeta.kp.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.kp.Dependency#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see org.kermeta.kp.Dependency#getProject()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Project();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kp.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.kermeta.kp.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.kp.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.kermeta.kp.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kp.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see org.kermeta.kp.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kp.SourceFolder <em>Source Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Folder</em>'.
	 * @see org.kermeta.kp.SourceFolder
	 * @generated
	 */
	EClass getSourceFolder();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kp.SourceFile <em>Source File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source File</em>'.
	 * @see org.kermeta.kp.SourceFile
	 * @generated
	 */
	EClass getSourceFile();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kp.SourceNSURI <em>Source NSURI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source NSURI</em>'.
	 * @see org.kermeta.kp.SourceNSURI
	 * @generated
	 */
	EClass getSourceNSURI();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kp.SourceQuery <em>Source Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Query</em>'.
	 * @see org.kermeta.kp.SourceQuery
	 * @generated
	 */
	EClass getSourceQuery();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kp.ImportedSource <em>Imported Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Source</em>'.
	 * @see org.kermeta.kp.ImportedSource
	 * @generated
	 */
	EClass getImportedSource();

	/**
	 * Returns the meta object for the reference '{@link org.kermeta.kp.ImportedSource#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.kermeta.kp.ImportedSource#getFrom()
	 * @see #getImportedSource()
	 * @generated
	 */
	EReference getImportedSource_From();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kp.WeaveDirective <em>Weave Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weave Directive</em>'.
	 * @see org.kermeta.kp.WeaveDirective
	 * @generated
	 */
	EClass getWeaveDirective();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.kp.WeaveDirective#getMix <em>Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mix</em>'.
	 * @see org.kermeta.kp.WeaveDirective#getMix()
	 * @see #getWeaveDirective()
	 * @generated
	 */
	EReference getWeaveDirective_Mix();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.kp.WeaveDirective#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.kermeta.kp.WeaveDirective#getTarget()
	 * @see #getWeaveDirective()
	 * @generated
	 */
	EReference getWeaveDirective_Target();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kp.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see org.kermeta.kp.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.kp.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.kermeta.kp.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kp.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.kermeta.kp.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kp.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Expression</em>'.
	 * @see org.kermeta.kp.StringExpression
	 * @generated
	 */
	EClass getStringExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.kp.StringExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.kermeta.kp.StringExpression#getValue()
	 * @see #getStringExpression()
	 * @generated
	 */
	EAttribute getStringExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.kermeta.kp.MixExpression <em>Mix Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mix Expression</em>'.
	 * @see org.kermeta.kp.MixExpression
	 * @generated
	 */
	EClass getMixExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.kp.MixExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see org.kermeta.kp.MixExpression#getLeft()
	 * @see #getMixExpression()
	 * @generated
	 */
	EReference getMixExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.kp.MixExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see org.kermeta.kp.MixExpression#getRight()
	 * @see #getMixExpression()
	 * @generated
	 */
	EReference getMixExpression_Right();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KpFactory getKpFactory();

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
		 * The meta object literal for the '{@link org.kermeta.kp.impl.KermetaProjectImpl <em>Kermeta Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kp.impl.KermetaProjectImpl
		 * @see org.kermeta.kp.impl.KpPackageImpl#getKermetaProject()
		 * @generated
		 */
		EClass KERMETA_PROJECT = eINSTANCE.getKermetaProject();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_PROJECT__DEPENDENCIES = eINSTANCE.getKermetaProject_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_PROJECT__SOURCES = eINSTANCE.getKermetaProject_Sources();

		/**
		 * The meta object literal for the '<em><b>Weave Directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_PROJECT__WEAVE_DIRECTIVES = eINSTANCE.getKermetaProject_WeaveDirectives();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KERMETA_PROJECT__OPTIONS = eINSTANCE.getKermetaProject_Options();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERMETA_PROJECT__VERSION = eINSTANCE.getKermetaProject_Version();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KERMETA_PROJECT__GROUP = eINSTANCE.getKermetaProject_Group();

		/**
		 * The meta object literal for the '{@link org.kermeta.kp.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kp.impl.DependencyImpl
		 * @see org.kermeta.kp.impl.KpPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__PROJECT = eINSTANCE.getDependency_Project();

		/**
		 * The meta object literal for the '{@link org.kermeta.kp.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kp.impl.NamedElementImpl
		 * @see org.kermeta.kp.impl.KpPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.kermeta.kp.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kp.impl.SourceImpl
		 * @see org.kermeta.kp.impl.KpPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '{@link org.kermeta.kp.impl.SourceFolderImpl <em>Source Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kp.impl.SourceFolderImpl
		 * @see org.kermeta.kp.impl.KpPackageImpl#getSourceFolder()
		 * @generated
		 */
		EClass SOURCE_FOLDER = eINSTANCE.getSourceFolder();

		/**
		 * The meta object literal for the '{@link org.kermeta.kp.impl.SourceFileImpl <em>Source File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kp.impl.SourceFileImpl
		 * @see org.kermeta.kp.impl.KpPackageImpl#getSourceFile()
		 * @generated
		 */
		EClass SOURCE_FILE = eINSTANCE.getSourceFile();

		/**
		 * The meta object literal for the '{@link org.kermeta.kp.impl.SourceNSURIImpl <em>Source NSURI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kp.impl.SourceNSURIImpl
		 * @see org.kermeta.kp.impl.KpPackageImpl#getSourceNSURI()
		 * @generated
		 */
		EClass SOURCE_NSURI = eINSTANCE.getSourceNSURI();

		/**
		 * The meta object literal for the '{@link org.kermeta.kp.impl.SourceQueryImpl <em>Source Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kp.impl.SourceQueryImpl
		 * @see org.kermeta.kp.impl.KpPackageImpl#getSourceQuery()
		 * @generated
		 */
		EClass SOURCE_QUERY = eINSTANCE.getSourceQuery();

		/**
		 * The meta object literal for the '{@link org.kermeta.kp.impl.ImportedSourceImpl <em>Imported Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kp.impl.ImportedSourceImpl
		 * @see org.kermeta.kp.impl.KpPackageImpl#getImportedSource()
		 * @generated
		 */
		EClass IMPORTED_SOURCE = eINSTANCE.getImportedSource();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_SOURCE__FROM = eINSTANCE.getImportedSource_From();

		/**
		 * The meta object literal for the '{@link org.kermeta.kp.impl.WeaveDirectiveImpl <em>Weave Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kp.impl.WeaveDirectiveImpl
		 * @see org.kermeta.kp.impl.KpPackageImpl#getWeaveDirective()
		 * @generated
		 */
		EClass WEAVE_DIRECTIVE = eINSTANCE.getWeaveDirective();

		/**
		 * The meta object literal for the '<em><b>Mix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAVE_DIRECTIVE__MIX = eINSTANCE.getWeaveDirective_Mix();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WEAVE_DIRECTIVE__TARGET = eINSTANCE.getWeaveDirective_Target();

		/**
		 * The meta object literal for the '{@link org.kermeta.kp.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kp.impl.OptionImpl
		 * @see org.kermeta.kp.impl.KpPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '{@link org.kermeta.kp.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kp.impl.ExpressionImpl
		 * @see org.kermeta.kp.impl.KpPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.kermeta.kp.impl.StringExpressionImpl <em>String Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kp.impl.StringExpressionImpl
		 * @see org.kermeta.kp.impl.KpPackageImpl#getStringExpression()
		 * @generated
		 */
		EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_EXPRESSION__VALUE = eINSTANCE.getStringExpression_Value();

		/**
		 * The meta object literal for the '{@link org.kermeta.kp.impl.MixExpressionImpl <em>Mix Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.kp.impl.MixExpressionImpl
		 * @see org.kermeta.kp.impl.KpPackageImpl#getMixExpression()
		 * @generated
		 */
		EClass MIX_EXPRESSION = eINSTANCE.getMixExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIX_EXPRESSION__LEFT = eINSTANCE.getMixExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIX_EXPRESSION__RIGHT = eINSTANCE.getMixExpression_Right();

	}

} //KpPackage
