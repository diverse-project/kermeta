/**
 * <copyright>
 * </copyright>
 *
 * $Id: KpmPackage.java,v 1.4 2006-12-12 16:06:11 ftanguy Exp $
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
	String eNS_URI = "plugin:/resource/fr.irisa.triskell.kermeta.kpm/model/Kpm.ecore";

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
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.AbstractUnitImpl <em>Abstract Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.AbstractUnitImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getAbstractUnit()
	 * @generated
	 */
	int ABSTRACT_UNIT = 5;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UNIT__TYPE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_UNIT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.AbstractFileImpl <em>Abstract File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.AbstractFileImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getAbstractFile()
	 * @generated
	 */
	int ABSTRACT_FILE = 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FILE__TYPE_NAME = ABSTRACT_UNIT__TYPE_NAME;

	/**
	 * The number of structural features of the '<em>Abstract File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FILE_FEATURE_COUNT = ABSTRACT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.AbstractDirectoryImpl <em>Abstract Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.AbstractDirectoryImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getAbstractDirectory()
	 * @generated
	 */
	int ABSTRACT_DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIRECTORY__TYPE_NAME = ABSTRACT_UNIT__TYPE_NAME;

	/**
	 * The number of structural features of the '<em>Abstract Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DIRECTORY_FEATURE_COUNT = ABSTRACT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.AbstractProjectImpl <em>Abstract Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.AbstractProjectImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getAbstractProject()
	 * @generated
	 */
	int ABSTRACT_PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROJECT__TYPE_NAME = ABSTRACT_UNIT__TYPE_NAME;

	/**
	 * The number of structural features of the '<em>Abstract Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROJECT_FEATURE_COUNT = ABSTRACT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.FilterImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 3;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.NameFilterImpl <em>Name Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.NameFilterImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getNameFilter()
	 * @generated
	 */
	int NAME_FILTER = 4;

	/**
	 * The feature id for the '<em><b>Regex In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FILTER__REGEX_IN = FILTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Regex Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FILTER__REGEX_OUT = FILTER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Name Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.DependencyImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__EVENT = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__IN = 3;

	/**
	 * The feature id for the '<em><b>Outs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__OUTS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = 5;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyTypeImpl <em>Dependency Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.DependencyTypeImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getDependencyType()
	 * @generated
	 */
	int DEPENDENCY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Dependency Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyEventImpl <em>Dependency Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.DependencyEventImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getDependencyEvent()
	 * @generated
	 */
	int DEPENDENCY_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EVENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Dependency Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_EVENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ExistFilterImpl <em>Exist Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.ExistFilterImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getExistFilter()
	 * @generated
	 */
	int EXIST_FILTER = 9;

	/**
	 * The number of structural features of the '<em>Exist Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIST_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.TypeFilterImpl <em>Type Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.TypeFilterImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getTypeFilter()
	 * @generated
	 */
	int TYPE_FILTER = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FILTER__TYPE = FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.UnitImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 14;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__TYPE_NAME = ABSTRACT_UNIT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__DEPENDENCIES = ABSTRACT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kpm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__KPM = ABSTRACT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = ABSTRACT_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__DEPENDENTS = ABSTRACT_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__PATH = ABSTRACT_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Last Time Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__LAST_TIME_MODIFIED = ABSTRACT_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = ABSTRACT_UNIT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.FileImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 11;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TYPE_NAME = UNIT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DEPENDENCIES = UNIT__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Kpm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__KPM = UNIT__KPM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = UNIT__NAME;


	/**
	 * The feature id for the '<em><b>Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DEPENDENTS = UNIT__DEPENDENTS;


	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = UNIT__PATH;

	/**
	 * The feature id for the '<em><b>Last Time Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__LAST_TIME_MODIFIED = UNIT__LAST_TIME_MODIFIED;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONTAINER = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.DirectoryImpl <em>Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.DirectoryImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getDirectory()
	 * @generated
	 */
	int DIRECTORY = 12;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__TYPE_NAME = UNIT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__DEPENDENCIES = UNIT__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Kpm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__KPM = UNIT__KPM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__DEPENDENTS = UNIT__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__PATH = UNIT__PATH;

	/**
	 * The feature id for the '<em><b>Last Time Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__LAST_TIME_MODIFIED = UNIT__LAST_TIME_MODIFIED;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__CONTENTS = UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_FEATURE_COUNT = UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.ProjectImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 13;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TYPE_NAME = UNIT__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DEPENDENCIES = UNIT__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Kpm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__KPM = UNIT__KPM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DEPENDENTS = UNIT__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PATH = UNIT__PATH;

	/**
	 * The feature id for the '<em><b>Last Time Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LAST_TIME_MODIFIED = UNIT__LAST_TIME_MODIFIED;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl <em>KPM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KPMImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getKPM()
	 * @generated
	 */
	int KPM = 15;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM__EVENTS = 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM__DEPENDENCIES = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM__ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Filters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM__FILTERS = 3;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM__TYPES = 4;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM__EXPRESSIONS = 5;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM__UNITS = 6;

	/**
	 * The number of structural features of the '<em>KPM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.ActionImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.AbstractExpressionImpl <em>Abstract Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.AbstractExpressionImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getAbstractExpression()
	 * @generated
	 */
	int ABSTRACT_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION__FILTER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION__ID = 1;

	/**
	 * The number of structural features of the '<em>Abstract Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.ExpressionImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__FILTER = ABSTRACT_EXPRESSION__FILTER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ID = ABSTRACT_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Sub Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__SUB_EXPRESSIONS = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.AndImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 18;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__FILTER = ABSTRACT_EXPRESSION__FILTER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__ID = ABSTRACT_EXPRESSION__ID;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.OrImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getOr()
	 * @generated
	 */
	int OR = 19;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__FILTER = ABSTRACT_EXPRESSION__FILTER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__ID = ABSTRACT_EXPRESSION__ID;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.SuitedExpressionImpl <em>Suited Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.SuitedExpressionImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getSuitedExpression()
	 * @generated
	 */
	int SUITED_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITED_EXPRESSION__FILTER = ABSTRACT_EXPRESSION__FILTER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITED_EXPRESSION__ID = ABSTRACT_EXPRESSION__ID;

	/**
	 * The number of structural features of the '<em>Suited Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITED_EXPRESSION_FEATURE_COUNT = ABSTRACT_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getString()
	 * @generated
	 */
	int STRING = 22;


	/**
	 * The meta object id for the '<em>Array List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.ArrayList
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getArrayList()
	 * @generated
	 */
	int ARRAY_LIST = 23;


	/**
	 * The meta object id for the '<em>boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getboolean()
	 * @generated
	 */
	int BOOLEAN = 24;


	/**
	 * The meta object id for the '<em>IFile</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFile
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getIFile()
	 * @generated
	 */
	int IFILE = 25;

	/**
	 * The meta object id for the '<em>IFolder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFolder
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getIFolder()
	 * @generated
	 */
	int IFOLDER = 26;

	/**
	 * The meta object id for the '<em>IProject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IProject
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getIProject()
	 * @generated
	 */
	int IPROJECT = 27;


	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 28;


	/**
	 * The meta object id for the '<em>IResource</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IResource
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getIResource()
	 * @generated
	 */
	int IRESOURCE = 29;


	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.AbstractFile <em>Abstract File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract File</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.AbstractFile
	 * @generated
	 */
	EClass getAbstractFile();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.AbstractDirectory <em>Abstract Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Directory</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.AbstractDirectory
	 * @generated
	 */
	EClass getAbstractDirectory();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.AbstractProject <em>Abstract Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Project</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.AbstractProject
	 * @generated
	 */
	EClass getAbstractProject();

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
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.NameFilter <em>Name Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Filter</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.NameFilter
	 * @generated
	 */
	EClass getNameFilter();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.NameFilter#getRegexIn <em>Regex In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex In</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.NameFilter#getRegexIn()
	 * @see #getNameFilter()
	 * @generated
	 */
	EAttribute getNameFilter_RegexIn();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.NameFilter#getRegexOut <em>Regex Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex Out</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.NameFilter#getRegexOut()
	 * @see #getNameFilter()
	 * @generated
	 */
	EAttribute getNameFilter_RegexOut();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.AbstractUnit <em>Abstract Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Unit</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.AbstractUnit
	 * @generated
	 */
	EClass getAbstractUnit();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.AbstractUnit#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.AbstractUnit#getTypeName()
	 * @see #getAbstractUnit()
	 * @generated
	 */
	EAttribute getAbstractUnit_TypeName();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency#getType()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Type();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency#getEvent()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Event();

	/**
	 * Returns the meta object for the reference list '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actions</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency#getActions()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Actions();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency#getIn()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_In();

	/**
	 * Returns the meta object for the reference list '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getOuts <em>Outs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outs</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency#getOuts()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Outs();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency#getName()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Name();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.DependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Type</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.DependencyType
	 * @generated
	 */
	EClass getDependencyType();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.DependencyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.DependencyType#getName()
	 * @see #getDependencyType()
	 * @generated
	 */
	EAttribute getDependencyType_Name();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.DependencyEvent <em>Dependency Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Event</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.DependencyEvent
	 * @generated
	 */
	EClass getDependencyEvent();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.DependencyEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.DependencyEvent#getName()
	 * @see #getDependencyEvent()
	 * @generated
	 */
	EAttribute getDependencyEvent_Name();

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
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.TypeFilter <em>Type Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Filter</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.TypeFilter
	 * @generated
	 */
	EClass getTypeFilter();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.kpm.TypeFilter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.TypeFilter#getType()
	 * @see #getTypeFilter()
	 * @generated
	 */
	EReference getTypeFilter_Type();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.kpm.File#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.File#getContainer()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Container();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directory</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Directory
	 * @generated
	 */
	EClass getDirectory();

	/**
	 * Returns the meta object for the reference list '{@link fr.irisa.triskell.kermeta.kpm.Directory#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contents</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Directory#getContents()
	 * @see #getDirectory()
	 * @generated
	 */
	EReference getDirectory_Contents();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Project
	 * @generated
	 */
	EClass getProject();

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
	 * Returns the meta object for the reference list '{@link fr.irisa.triskell.kermeta.kpm.Unit#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getDependencies()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Dependencies();

	/**
	 * Returns the meta object for the container reference '{@link fr.irisa.triskell.kermeta.kpm.Unit#getKpm <em>Kpm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Kpm</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getKpm()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Kpm();

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
	 * Returns the meta object for the reference list '{@link fr.irisa.triskell.kermeta.kpm.Unit#getDependents <em>Dependents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependents</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getDependents()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Dependents();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.Unit#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getPath()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Path();

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
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.KPM <em>KPM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>KPM</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.KPM
	 * @generated
	 */
	EClass getKPM();

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
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.kpm.KPM#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.KPM#getDependencies()
	 * @see #getKPM()
	 * @generated
	 */
	EReference getKPM_Dependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.kpm.KPM#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.KPM#getActions()
	 * @see #getKPM()
	 * @generated
	 */
	EReference getKPM_Actions();

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
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.kpm.KPM#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.KPM#getExpressions()
	 * @see #getKPM()
	 * @generated
	 */
	EReference getKPM_Expressions();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

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
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.kpm.Expression#getSubExpressions <em>Sub Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Expressions</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Expression#getSubExpressions()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_SubExpressions();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.AbstractExpression <em>Abstract Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Expression</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.AbstractExpression
	 * @generated
	 */
	EClass getAbstractExpression();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.triskell.kermeta.kpm.AbstractExpression#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.AbstractExpression#getFilter()
	 * @see #getAbstractExpression()
	 * @generated
	 */
	EReference getAbstractExpression_Filter();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.AbstractExpression#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.AbstractExpression#getId()
	 * @see #getAbstractExpression()
	 * @generated
	 */
	EAttribute getAbstractExpression_Id();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.SuitedExpression <em>Suited Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suited Expression</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.SuitedExpression
	 * @generated
	 */
	EClass getSuitedExpression();

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
	 * Returns the meta object for data type '{@link java.util.ArrayList <em>Array List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Array List</em>'.
	 * @see java.util.ArrayList
	 * @model instanceClass="java.util.ArrayList"
	 * @generated
	 */
	EDataType getArrayList();

	/**
	 * Returns the meta object for data type '<em>boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>boolean</em>'.
	 * @model instanceClass="boolean"
	 * @generated
	 */
	EDataType getboolean();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IFile <em>IFile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IFile</em>'.
	 * @see org.eclipse.core.resources.IFile
	 * @model instanceClass="org.eclipse.core.resources.IFile"
	 * @generated
	 */
	EDataType getIFile();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IFolder <em>IFolder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IFolder</em>'.
	 * @see org.eclipse.core.resources.IFolder
	 * @model instanceClass="org.eclipse.core.resources.IFolder"
	 * @generated
	 */
	EDataType getIFolder();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IProject <em>IProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProject</em>'.
	 * @see org.eclipse.core.resources.IProject
	 * @model instanceClass="org.eclipse.core.resources.IProject"
	 * @generated
	 */
	EDataType getIProject();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IResource <em>IResource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IResource</em>'.
	 * @see org.eclipse.core.resources.IResource
	 * @model instanceClass="org.eclipse.core.resources.IResource"
	 * @generated
	 */
	EDataType getIResource();

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
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.AbstractFileImpl <em>Abstract File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.AbstractFileImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getAbstractFile()
		 * @generated
		 */
		EClass ABSTRACT_FILE = eINSTANCE.getAbstractFile();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.AbstractDirectoryImpl <em>Abstract Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.AbstractDirectoryImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getAbstractDirectory()
		 * @generated
		 */
		EClass ABSTRACT_DIRECTORY = eINSTANCE.getAbstractDirectory();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.AbstractProjectImpl <em>Abstract Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.AbstractProjectImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getAbstractProject()
		 * @generated
		 */
		EClass ABSTRACT_PROJECT = eINSTANCE.getAbstractProject();

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
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.NameFilterImpl <em>Name Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.NameFilterImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getNameFilter()
		 * @generated
		 */
		EClass NAME_FILTER = eINSTANCE.getNameFilter();

		/**
		 * The meta object literal for the '<em><b>Regex In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_FILTER__REGEX_IN = eINSTANCE.getNameFilter_RegexIn();

		/**
		 * The meta object literal for the '<em><b>Regex Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_FILTER__REGEX_OUT = eINSTANCE.getNameFilter_RegexOut();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.AbstractUnitImpl <em>Abstract Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.AbstractUnitImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getAbstractUnit()
		 * @generated
		 */
		EClass ABSTRACT_UNIT = eINSTANCE.getAbstractUnit();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_UNIT__TYPE_NAME = eINSTANCE.getAbstractUnit_TypeName();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.DependencyImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__TYPE = eINSTANCE.getDependency_Type();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__EVENT = eINSTANCE.getDependency_Event();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__ACTIONS = eINSTANCE.getDependency_Actions();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__IN = eINSTANCE.getDependency_In();

		/**
		 * The meta object literal for the '<em><b>Outs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__OUTS = eINSTANCE.getDependency_Outs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__NAME = eINSTANCE.getDependency_Name();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyTypeImpl <em>Dependency Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.DependencyTypeImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getDependencyType()
		 * @generated
		 */
		EClass DEPENDENCY_TYPE = eINSTANCE.getDependencyType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_TYPE__NAME = eINSTANCE.getDependencyType_Name();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyEventImpl <em>Dependency Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.DependencyEventImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getDependencyEvent()
		 * @generated
		 */
		EClass DEPENDENCY_EVENT = eINSTANCE.getDependencyEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_EVENT__NAME = eINSTANCE.getDependencyEvent_Name();

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
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.TypeFilterImpl <em>Type Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.TypeFilterImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getTypeFilter()
		 * @generated
		 */
		EClass TYPE_FILTER = eINSTANCE.getTypeFilter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_FILTER__TYPE = eINSTANCE.getTypeFilter_Type();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.FileImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__CONTAINER = eINSTANCE.getFile_Container();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.DirectoryImpl <em>Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.DirectoryImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getDirectory()
		 * @generated
		 */
		EClass DIRECTORY = eINSTANCE.getDirectory();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTORY__CONTENTS = eINSTANCE.getDirectory_Contents();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.ProjectImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

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
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__DEPENDENCIES = eINSTANCE.getUnit_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Kpm</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__KPM = eINSTANCE.getUnit_Kpm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__NAME = eINSTANCE.getUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Dependents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__DEPENDENTS = eINSTANCE.getUnit_Dependents();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__PATH = eINSTANCE.getUnit_Path();

		/**
		 * The meta object literal for the '<em><b>Last Time Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__LAST_TIME_MODIFIED = eINSTANCE.getUnit_LastTimeModified();

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
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPM__UNITS = eINSTANCE.getKPM_Units();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPM__EVENTS = eINSTANCE.getKPM_Events();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPM__DEPENDENCIES = eINSTANCE.getKPM_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPM__ACTIONS = eINSTANCE.getKPM_Actions();

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
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPM__EXPRESSIONS = eINSTANCE.getKPM_Expressions();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.ActionImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

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
		 * The meta object literal for the '<em><b>Sub Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__SUB_EXPRESSIONS = eINSTANCE.getExpression_SubExpressions();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.AndImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.OrImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.AbstractExpressionImpl <em>Abstract Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.AbstractExpressionImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getAbstractExpression()
		 * @generated
		 */
		EClass ABSTRACT_EXPRESSION = eINSTANCE.getAbstractExpression();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_EXPRESSION__FILTER = eINSTANCE.getAbstractExpression_Filter();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EXPRESSION__ID = eINSTANCE.getAbstractExpression_Id();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.SuitedExpressionImpl <em>Suited Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.SuitedExpressionImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getSuitedExpression()
		 * @generated
		 */
		EClass SUITED_EXPRESSION = eINSTANCE.getSuitedExpression();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Array List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.ArrayList
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getArrayList()
		 * @generated
		 */
		EDataType ARRAY_LIST = eINSTANCE.getArrayList();

		/**
		 * The meta object literal for the '<em>boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getboolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getboolean();

		/**
		 * The meta object literal for the '<em>IFile</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFile
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getIFile()
		 * @generated
		 */
		EDataType IFILE = eINSTANCE.getIFile();

		/**
		 * The meta object literal for the '<em>IFolder</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IFolder
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getIFolder()
		 * @generated
		 */
		EDataType IFOLDER = eINSTANCE.getIFolder();

		/**
		 * The meta object literal for the '<em>IProject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IProject
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getIProject()
		 * @generated
		 */
		EDataType IPROJECT = eINSTANCE.getIProject();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>IResource</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IResource
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getIResource()
		 * @generated
		 */
		EDataType IRESOURCE = eINSTANCE.getIResource();

	}

} //KpmPackage
