/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.group_relaxed;

import art_relaxed.Art_relaxedPackage;

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
 * @see art_relaxed.group_relaxed.Group_relaxedFactory
 * @model kind="package"
 * @generated
 */
public interface Group_relaxedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "group_relaxed";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://art/group_relaxed";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "group_relaxed";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Group_relaxedPackage eINSTANCE = art_relaxed.group_relaxed.impl.Group_relaxedPackageImpl.init();

	/**
	 * The meta object id for the '{@link art_relaxed.group_relaxed.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.group_relaxed.impl.GroupImpl
	 * @see art_relaxed.group_relaxed.impl.Group_relaxedPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 0;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PID = Art_relaxedPackage.NAMED_ELEMENT__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = Art_relaxedPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = Art_relaxedPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link art_relaxed.group_relaxed.impl.TypeGroupImpl <em>Type Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.group_relaxed.impl.TypeGroupImpl
	 * @see art_relaxed.group_relaxed.impl.Group_relaxedPackageImpl#getTypeGroup()
	 * @generated
	 */
	int TYPE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GROUP__PID = GROUP__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GROUP__NAME = GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GROUP__TYPES = GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GROUP__SUB_GROUPS = GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link art_relaxed.group_relaxed.impl.InstanceGroupImpl <em>Instance Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see art_relaxed.group_relaxed.impl.InstanceGroupImpl
	 * @see art_relaxed.group_relaxed.impl.Group_relaxedPackageImpl#getInstanceGroup()
	 * @generated
	 */
	int INSTANCE_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_GROUP__PID = GROUP__PID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_GROUP__NAME = GROUP__NAME;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_GROUP__INSTANCES = GROUP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_GROUP__SUB_GROUPS = GROUP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_GROUP_FEATURE_COUNT = GROUP_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link art_relaxed.group_relaxed.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see art_relaxed.group_relaxed.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for class '{@link art_relaxed.group_relaxed.TypeGroup <em>Type Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Group</em>'.
	 * @see art_relaxed.group_relaxed.TypeGroup
	 * @generated
	 */
	EClass getTypeGroup();

	/**
	 * Returns the meta object for the reference list '{@link art_relaxed.group_relaxed.TypeGroup#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see art_relaxed.group_relaxed.TypeGroup#getTypes()
	 * @see #getTypeGroup()
	 * @generated
	 */
	EReference getTypeGroup_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link art_relaxed.group_relaxed.TypeGroup#getSubGroups <em>Sub Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Groups</em>'.
	 * @see art_relaxed.group_relaxed.TypeGroup#getSubGroups()
	 * @see #getTypeGroup()
	 * @generated
	 */
	EReference getTypeGroup_SubGroups();

	/**
	 * Returns the meta object for class '{@link art_relaxed.group_relaxed.InstanceGroup <em>Instance Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Group</em>'.
	 * @see art_relaxed.group_relaxed.InstanceGroup
	 * @generated
	 */
	EClass getInstanceGroup();

	/**
	 * Returns the meta object for the reference list '{@link art_relaxed.group_relaxed.InstanceGroup#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see art_relaxed.group_relaxed.InstanceGroup#getInstances()
	 * @see #getInstanceGroup()
	 * @generated
	 */
	EReference getInstanceGroup_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link art_relaxed.group_relaxed.InstanceGroup#getSubGroups <em>Sub Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Groups</em>'.
	 * @see art_relaxed.group_relaxed.InstanceGroup#getSubGroups()
	 * @see #getInstanceGroup()
	 * @generated
	 */
	EReference getInstanceGroup_SubGroups();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Group_relaxedFactory getGroup_relaxedFactory();

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
		 * The meta object literal for the '{@link art_relaxed.group_relaxed.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.group_relaxed.impl.GroupImpl
		 * @see art_relaxed.group_relaxed.impl.Group_relaxedPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '{@link art_relaxed.group_relaxed.impl.TypeGroupImpl <em>Type Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.group_relaxed.impl.TypeGroupImpl
		 * @see art_relaxed.group_relaxed.impl.Group_relaxedPackageImpl#getTypeGroup()
		 * @generated
		 */
		EClass TYPE_GROUP = eINSTANCE.getTypeGroup();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GROUP__TYPES = eINSTANCE.getTypeGroup_Types();

		/**
		 * The meta object literal for the '<em><b>Sub Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_GROUP__SUB_GROUPS = eINSTANCE.getTypeGroup_SubGroups();

		/**
		 * The meta object literal for the '{@link art_relaxed.group_relaxed.impl.InstanceGroupImpl <em>Instance Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see art_relaxed.group_relaxed.impl.InstanceGroupImpl
		 * @see art_relaxed.group_relaxed.impl.Group_relaxedPackageImpl#getInstanceGroup()
		 * @generated
		 */
		EClass INSTANCE_GROUP = eINSTANCE.getInstanceGroup();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_GROUP__INSTANCES = eINSTANCE.getInstanceGroup_Instances();

		/**
		 * The meta object literal for the '<em><b>Sub Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_GROUP__SUB_GROUPS = eINSTANCE.getInstanceGroup_SubGroups();

	}

} //Group_relaxedPackage
