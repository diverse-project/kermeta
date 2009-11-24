/**
 * <copyright>
 * </copyright>
 *
 * $Id: KpmPackage.java,v 1.14 2008-06-12 07:13:49 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.kpm;

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
 * @see fr.irisa.triskell.kermeta.kpm.KpmFactory
 * @model kind="package"
 * @generated
 */
public interface KpmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kpm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kermeta.org/kpm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kpm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KpmPackage eINSTANCE = fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.OutImpl <em>Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.OutImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getOut()
	 * @generated
	 */
	int OUT = 1;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.FilterImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 2;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.ExpressionImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 3;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.NestedExpressionImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getNestedExpression()
	 * @generated
	 */
	int NESTED_EXPRESSION = 4;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ORExpressionImpl <em>OR Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.ORExpressionImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getORExpression()
	 * @generated
	 */
	int OR_EXPRESSION = 5;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ANDExpressionImpl <em>AND Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.ANDExpressionImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getANDExpression()
	 * @generated
	 */
	int AND_EXPRESSION = 6;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.SimpleExpressionImpl <em>Simple Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.SimpleExpressionImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getSimpleExpression()
	 * @generated
	 */
	int SIMPLE_EXPRESSION = 13;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.FilterExpressionImpl <em>Filter Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.FilterExpressionImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getFilterExpression()
	 * @generated
	 */
	int FILTER_EXPRESSION = 7;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.TypeFilterImpl <em>Type Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.TypeFilterImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getTypeFilter()
	 * @generated
	 */
	int TYPE_FILTER = 8;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.NameFilterImpl <em>Name Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.NameFilterImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getNameFilter()
	 * @generated
	 */
	int NAME_FILTER = 9;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.TypeImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 10;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.NullExpressionImpl <em>Null Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.NullExpressionImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getNullExpression()
	 * @generated
	 */
	int NULL_EXPRESSION = 11;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.EventImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 12;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl <em>KPM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KPMImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getKPM()
	 * @generated
	 */
	int KPM = 14;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.RuleImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.UnitImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 15;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ExistFilterImpl <em>Exist Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.ExistFilterImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getExistFilter()
	 * @generated
	 */
	int EXIST_FILTER = 16;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Outs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__OUTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PRECONDITION = 3;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT__RULE = 0;

	/**
	 * The feature id for the '<em><b>Independant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT__INDEPENDANT = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT__PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>Extension Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT__EXTENSION_POINT = 3;

	/**
	 * The number of structural features of the '<em>Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_FEATURE_COUNT = 4;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Nested Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__RIGHT = NESTED_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION__LEFT = NESTED_EXPRESSION__LEFT;

	/**
	 * The number of structural features of the '<em>OR Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_EXPRESSION_FEATURE_COUNT = NESTED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__RIGHT = NESTED_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION__LEFT = NESTED_EXPRESSION__LEFT;

	/**
	 * The number of structural features of the '<em>AND Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPRESSION_FEATURE_COUNT = NESTED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_EXPRESSION__FILTER = SIMPLE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_EXPRESSION_FEATURE_COUNT = SIMPLE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Java Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FILTER__JAVA_CLASS_NAME = FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FILTER__REGEX = FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Null Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION_FEATURE_COUNT = SIMPLE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM__FILTERS = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM__TYPES = 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM__RULES = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM__EVENTS = 3;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM__UNITS = 4;

	/**
	 * The number of structural features of the '<em>KPM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__RULES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Last Time Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__LAST_TIME_MODIFIED = 3;

	/**
	 * The feature id for the '<em><b>Used Usages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__USED_USAGES = 4;

	/**
	 * The feature id for the '<em><b>Used By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__USED_BY = 5;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 6;

	/**
	 * The number of structural features of the '<em>Exist Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIST_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.UsageImpl <em>Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.UsageImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getUsage()
	 * @generated
	 */
	int USAGE = 17;

	/**
	 * The feature id for the '<em><b>Used Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__USED_UNIT = 0;

	/**
	 * The feature id for the '<em><b>User Unit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__USER_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.ParameterImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '<em>IProgress Monitor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getIProgressMonitor()
	 * @generated
	 */
	int IPROGRESS_MONITOR = 19;


	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getList()
	 * @generated
	 */
	int LIST = 20;


	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Out <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Out
	 * @generated
	 */
	EClass getOut();

	/**
	 * Returns the meta object for the container reference '{@link fr.irisa.triskell.kermeta.kpm.Out#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Out#getRule()
	 * @see #getOut()
	 * @generated
	 */
	EReference getOut_Rule();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.Out#isIndependant <em>Independant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Independant</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Out#isIndependant()
	 * @see #getOut()
	 * @generated
	 */
	EAttribute getOut_Independant();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.kpm.Out#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Out#getParameters()
	 * @see #getOut()
	 * @generated
	 */
	EReference getOut_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.Out#getExtensionPoint <em>Extension Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Point</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Out#getExtensionPoint()
	 * @see #getOut()
	 * @generated
	 */
	EAttribute getOut_ExtensionPoint();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.NestedExpression <em>Nested Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Expression</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.NestedExpression
	 * @generated
	 */
	EClass getNestedExpression();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.triskell.kermeta.kpm.NestedExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.NestedExpression#getRight()
	 * @see #getNestedExpression()
	 * @generated
	 */
	EReference getNestedExpression_Right();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.triskell.kermeta.kpm.NestedExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.NestedExpression#getLeft()
	 * @see #getNestedExpression()
	 * @generated
	 */
	EReference getNestedExpression_Left();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.ORExpression <em>OR Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OR Expression</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.ORExpression
	 * @generated
	 */
	EClass getORExpression();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.ANDExpression <em>AND Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AND Expression</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.ANDExpression
	 * @generated
	 */
	EClass getANDExpression();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.FilterExpression <em>Filter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Expression</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.FilterExpression
	 * @generated
	 */
	EClass getFilterExpression();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.kpm.FilterExpression#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.FilterExpression#getFilter()
	 * @see #getFilterExpression()
	 * @generated
	 */
	EReference getFilterExpression_Filter();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.TypeFilter <em>Type Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Filter</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.TypeFilter
	 * @generated
	 */
	EClass getTypeFilter();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.TypeFilter#getJavaClassName <em>Java Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Class Name</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.TypeFilter#getJavaClassName()
	 * @see #getTypeFilter()
	 * @generated
	 */
	EAttribute getTypeFilter_JavaClassName();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.NameFilter <em>Name Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Filter</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.NameFilter
	 * @generated
	 */
	EClass getNameFilter();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.NameFilter#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.NameFilter#getRegex()
	 * @see #getNameFilter()
	 * @generated
	 */
	EAttribute getNameFilter_Regex();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.Type#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Type#getValue()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Value();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.NullExpression <em>Null Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Expression</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.NullExpression
	 * @generated
	 */
	EClass getNullExpression();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.SimpleExpression <em>Simple Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Expression</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.SimpleExpression
	 * @generated
	 */
	EClass getSimpleExpression();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.KPM <em>KPM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KPM</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.KPM
	 * @generated
	 */
	EClass getKPM();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.kpm.KPM#getFilters <em>Filters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filters</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.KPM#getFilters()
	 * @see #getKPM()
	 * @generated
	 */
	EReference getKPM_Filters();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.kpm.KPM#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.KPM#getTypes()
	 * @see #getKPM()
	 * @generated
	 */
	EReference getKPM_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.kpm.KPM#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.KPM#getRules()
	 * @see #getKPM()
	 * @generated
	 */
	EReference getKPM_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.kpm.KPM#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.KPM#getEvents()
	 * @see #getKPM()
	 * @generated
	 */
	EReference getKPM_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.kpm.KPM#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.KPM#getUnits()
	 * @see #getKPM()
	 * @generated
	 */
	EReference getKPM_Units();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.kpm.Rule#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Rule#getEvent()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.kpm.Rule#getOuts <em>Outs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outs</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Rule#getOuts()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Outs();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.triskell.kermeta.kpm.Rule#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Rule#getPrecondition()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Precondition();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.kpm.Unit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getType()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Type();

	/**
	 * Returns the meta object for the reference list '{@link fr.irisa.triskell.kermeta.kpm.Unit#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rules</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getRules()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Rules();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.Unit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getName()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.Unit#getLastTimeModified <em>Last Time Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Time Modified</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getLastTimeModified()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_LastTimeModified();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.kpm.Unit#getUsedUsages <em>Used Usages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Used Usages</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getUsedUsages()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_UsedUsages();

	/**
	 * Returns the meta object for the reference list '{@link fr.irisa.triskell.kermeta.kpm.Unit#getUsedBy <em>Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used By</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getUsedBy()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_UsedBy();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.ExistFilter <em>Exist Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exist Filter</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.ExistFilter
	 * @generated
	 */
	EClass getExistFilter();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Usage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Usage
	 * @generated
	 */
	EClass getUsage();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.kpm.Usage#getUsedUnit <em>Used Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Used Unit</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Usage#getUsedUnit()
	 * @see #getUsage()
	 * @generated
	 */
	EReference getUsage_UsedUnit();

	/**
	 * Returns the meta object for the container reference '{@link fr.irisa.triskell.kermeta.kpm.Usage#getUserUnit <em>User Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>User Unit</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Usage#getUserUnit()
	 * @see #getUsage()
	 * @generated
	 */
	EReference getUsage_UserUnit();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.Usage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Usage#getType()
	 * @see #getUsage()
	 * @generated
	 */
	EAttribute getUsage_Type();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IProgressMonitor <em>IProgress Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProgress Monitor</em>'.
	 * @see org.eclipse.core.runtime.IProgressMonitor
	 * @model instanceClass="org.eclipse.core.runtime.IProgressMonitor"
	 * @generated
	 */
	EDataType getIProgressMonitor();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KpmFactory getKpmFactory();

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
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.ParameterImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.OutImpl <em>Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.OutImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getOut()
		 * @generated
		 */
		EClass OUT = eINSTANCE.getOut();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT__RULE = eINSTANCE.getOut_Rule();

		/**
		 * The meta object literal for the '<em><b>Independant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT__INDEPENDANT = eINSTANCE.getOut_Independant();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT__PARAMETERS = eINSTANCE.getOut_Parameters();

		/**
		 * The meta object literal for the '<em><b>Extension Point</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUT__EXTENSION_POINT = eINSTANCE.getOut_ExtensionPoint();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.FilterImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.ExpressionImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.NestedExpressionImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getNestedExpression()
		 * @generated
		 */
		EClass NESTED_EXPRESSION = eINSTANCE.getNestedExpression();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_EXPRESSION__RIGHT = eINSTANCE.getNestedExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_EXPRESSION__LEFT = eINSTANCE.getNestedExpression_Left();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ORExpressionImpl <em>OR Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.ORExpressionImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getORExpression()
		 * @generated
		 */
		EClass OR_EXPRESSION = eINSTANCE.getORExpression();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ANDExpressionImpl <em>AND Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.ANDExpressionImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getANDExpression()
		 * @generated
		 */
		EClass AND_EXPRESSION = eINSTANCE.getANDExpression();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.FilterExpressionImpl <em>Filter Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.FilterExpressionImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getFilterExpression()
		 * @generated
		 */
		EClass FILTER_EXPRESSION = eINSTANCE.getFilterExpression();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_EXPRESSION__FILTER = eINSTANCE.getFilterExpression_Filter();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.TypeFilterImpl <em>Type Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.TypeFilterImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getTypeFilter()
		 * @generated
		 */
		EClass TYPE_FILTER = eINSTANCE.getTypeFilter();

		/**
		 * The meta object literal for the '<em><b>Java Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_FILTER__JAVA_CLASS_NAME = eINSTANCE.getTypeFilter_JavaClassName();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.NameFilterImpl <em>Name Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.NameFilterImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getNameFilter()
		 * @generated
		 */
		EClass NAME_FILTER = eINSTANCE.getNameFilter();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_FILTER__REGEX = eINSTANCE.getNameFilter_Regex();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.TypeImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__VALUE = eINSTANCE.getType_Value();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.NullExpressionImpl <em>Null Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.NullExpressionImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getNullExpression()
		 * @generated
		 */
		EClass NULL_EXPRESSION = eINSTANCE.getNullExpression();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.EventImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.SimpleExpressionImpl <em>Simple Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.SimpleExpressionImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getSimpleExpression()
		 * @generated
		 */
		EClass SIMPLE_EXPRESSION = eINSTANCE.getSimpleExpression();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl <em>KPM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KPMImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getKPM()
		 * @generated
		 */
		EClass KPM = eINSTANCE.getKPM();

		/**
		 * The meta object literal for the '<em><b>Filters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPM__FILTERS = eINSTANCE.getKPM_Filters();


		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPM__TYPES = eINSTANCE.getKPM_Types();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPM__RULES = eINSTANCE.getKPM_Rules();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPM__EVENTS = eINSTANCE.getKPM_Events();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPM__UNITS = eINSTANCE.getKPM_Units();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.RuleImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__EVENT = eINSTANCE.getRule_Event();

		/**
		 * The meta object literal for the '<em><b>Outs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__OUTS = eINSTANCE.getRule_Outs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PRECONDITION = eINSTANCE.getRule_Precondition();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.UnitImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__TYPE = eINSTANCE.getUnit_Type();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__RULES = eINSTANCE.getUnit_Rules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__NAME = eINSTANCE.getUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Last Time Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__LAST_TIME_MODIFIED = eINSTANCE.getUnit_LastTimeModified();

		/**
		 * The meta object literal for the '<em><b>Used Usages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__USED_USAGES = eINSTANCE.getUnit_UsedUsages();

		/**
		 * The meta object literal for the '<em><b>Used By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__USED_BY = eINSTANCE.getUnit_UsedBy();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ExistFilterImpl <em>Exist Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.ExistFilterImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getExistFilter()
		 * @generated
		 */
		EClass EXIST_FILTER = eINSTANCE.getExistFilter();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.UsageImpl <em>Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.UsageImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getUsage()
		 * @generated
		 */
		EClass USAGE = eINSTANCE.getUsage();

		/**
		 * The meta object literal for the '<em><b>Used Unit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE__USED_UNIT = eINSTANCE.getUsage_UsedUnit();

		/**
		 * The meta object literal for the '<em><b>User Unit</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE__USER_UNIT = eINSTANCE.getUsage_UserUnit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE__TYPE = eINSTANCE.getUsage_Type();

		/**
		 * The meta object literal for the '<em>IProgress Monitor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IProgressMonitor
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getIProgressMonitor()
		 * @generated
		 */
		EDataType IPROGRESS_MONITOR = eINSTANCE.getIProgressMonitor();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

	}

} //KpmPackage
