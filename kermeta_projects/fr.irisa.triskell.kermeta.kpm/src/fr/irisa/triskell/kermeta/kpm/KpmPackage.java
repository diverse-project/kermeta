/**
 * <copyright>
 * </copyright>
 *
 * $Id: KpmPackage.java,v 1.1 2006-12-01 12:23:38 ftanguy Exp $
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
	String eNS_URI = "plugin:/resource/fr.irisa.triskell.kermeta.kpm/model/kpm.ecore";

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
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.KPMImpl <em>KPM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KPMImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getKPM()
	 * @generated
	 */
	int KPM = 0;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM__UNITS = 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM__DEPENDENCIES = 1;

	/**
	 * The number of structural features of the '<em>KPM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KPM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.UnitImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__PATH = 1;

	/**
	 * The feature id for the '<em><b>Last Time Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__LAST_TIME_MODIFIED = 2;

	/**
	 * The feature id for the '<em><b>Kpm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__KPM = 3;

	/**
	 * The feature id for the '<em><b>Owned Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__OWNED_DEPENDENCIES = 4;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__PROJECT = 5;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.FileImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = UNIT__NAME;

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
	 * The feature id for the '<em><b>Kpm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__KPM = UNIT__KPM;

	/**
	 * The feature id for the '<em><b>Owned Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__OWNED_DEPENDENCIES = UNIT__OWNED_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PROJECT = UNIT__PROJECT;

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
	int DIRECTORY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__NAME = FILE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__PATH = FILE__PATH;

	/**
	 * The feature id for the '<em><b>Last Time Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__LAST_TIME_MODIFIED = FILE__LAST_TIME_MODIFIED;

	/**
	 * The feature id for the '<em><b>Kpm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__KPM = FILE__KPM;

	/**
	 * The feature id for the '<em><b>Owned Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__OWNED_DEPENDENCIES = FILE__OWNED_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__PROJECT = FILE__PROJECT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__CONTAINER = FILE__CONTAINER;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__CONTENTS = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_FEATURE_COUNT = FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.ProjectImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = DIRECTORY__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PATH = DIRECTORY__PATH;

	/**
	 * The feature id for the '<em><b>Last Time Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LAST_TIME_MODIFIED = DIRECTORY__LAST_TIME_MODIFIED;

	/**
	 * The feature id for the '<em><b>Kpm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__KPM = DIRECTORY__KPM;

	/**
	 * The feature id for the '<em><b>Owned Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OWNED_DEPENDENCIES = DIRECTORY__OWNED_DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT = DIRECTORY__PROJECT;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONTAINER = DIRECTORY__CONTAINER;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONTENTS = DIRECTORY__CONTENTS;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = DIRECTORY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.DependencyImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__EVENT = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__FROM = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TO = 4;

	/**
	 * The feature id for the '<em><b>Kpm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__KPM = 5;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.TypeImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.ActionImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

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
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.kpm.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.EventImpl
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 8;

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
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getString()
	 * @generated
	 */
	int STRING = 9;


	/**
	 * The meta object id for the '<em>boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getboolean()
	 * @generated
	 */
	int BOOLEAN = 10;


	/**
	 * The meta object id for the '<em>IFile</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFile
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getIFile()
	 * @generated
	 */
	int IFILE = 11;


	/**
	 * The meta object id for the '<em>IFolder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IFolder
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getIFolder()
	 * @generated
	 */
	int IFOLDER = 12;

	/**
	 * The meta object id for the '<em>IProject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IProject
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getIProject()
	 * @generated
	 */
	int IPROJECT = 13;


	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 14;


	/**
	 * The meta object id for the '<em>Array List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.ArrayList
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getArrayList()
	 * @generated
	 */
	int ARRAY_LIST = 15;


	/**
	 * The meta object id for the '<em>Hash Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.HashSet
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getHashSet()
	 * @generated
	 */
	int HASH_SET = 16;


	/**
	 * The meta object id for the '<em>Enum Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.EnumSet
	 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getEnumSet()
	 * @generated
	 */
	int ENUM_SET = 17;


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
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit
	 * @generated
	 */
	EClass getUnit();

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
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.kpm.Unit#getKpm <em>Kpm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kpm</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getKpm()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Kpm();

	/**
	 * Returns the meta object for the reference list '{@link fr.irisa.triskell.kermeta.kpm.Unit#getOwnedDependencies <em>Owned Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Dependencies</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getOwnedDependencies()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_OwnedDependencies();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.kpm.Unit#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Project</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Unit#getProject()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_Project();

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
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.kpm.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency#getType()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Type();

	/**
	 * Returns the meta object for the containment reference '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency#getEvent()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency#getActions()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Actions();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency#getFrom()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_From();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency#getTo()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_To();

	/**
	 * Returns the meta object for the container reference '{@link fr.irisa.triskell.kermeta.kpm.Dependency#getKpm <em>Kpm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Kpm</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Dependency#getKpm()
	 * @see #getDependency()
	 * @generated
	 */
	EReference getDependency_Kpm();

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
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.kpm.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irisa.triskell.kermeta.kpm.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

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
	 * Returns the meta object for data type '{@link java.util.HashSet <em>Hash Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Hash Set</em>'.
	 * @see java.util.HashSet
	 * @model instanceClass="java.util.HashSet"
	 * @generated
	 */
	EDataType getHashSet();

	/**
	 * Returns the meta object for data type '{@link java.util.EnumSet <em>Enum Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Enum Set</em>'.
	 * @see java.util.EnumSet
	 * @model instanceClass="java.util.EnumSet"
	 * @generated
	 */
	EDataType getEnumSet();

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
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KPM__DEPENDENCIES = eINSTANCE.getKPM_Dependencies();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__NAME = eINSTANCE.getUnit_Name();

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
		 * The meta object literal for the '<em><b>Kpm</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__KPM = eINSTANCE.getUnit_Kpm();

		/**
		 * The meta object literal for the '<em><b>Owned Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__OWNED_DEPENDENCIES = eINSTANCE.getUnit_OwnedDependencies();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__PROJECT = eINSTANCE.getUnit_Project();

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
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.kpm.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.kpm.impl.DependencyImpl
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__TYPE = eINSTANCE.getDependency_Type();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__EVENT = eINSTANCE.getDependency_Event();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__ACTIONS = eINSTANCE.getDependency_Actions();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__FROM = eINSTANCE.getDependency_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__TO = eINSTANCE.getDependency_To();

		/**
		 * The meta object literal for the '<em><b>Kpm</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCY__KPM = eINSTANCE.getDependency_Kpm();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

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
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();


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
		 * The meta object literal for the '<em>Array List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.ArrayList
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getArrayList()
		 * @generated
		 */
		EDataType ARRAY_LIST = eINSTANCE.getArrayList();

		/**
		 * The meta object literal for the '<em>Hash Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.HashSet
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getHashSet()
		 * @generated
		 */
		EDataType HASH_SET = eINSTANCE.getHashSet();

		/**
		 * The meta object literal for the '<em>Enum Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.EnumSet
		 * @see fr.irisa.triskell.kermeta.kpm.impl.KpmPackageImpl#getEnumSet()
		 * @generated
		 */
		EDataType ENUM_SET = eINSTANCE.getEnumSet();

	}

} //KpmPackage
