/**
 * <copyright>
 * </copyright>
 *
 * $Id: UiPackage.java,v 1.1 2007-04-04 13:25:29 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.ui;

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
 * @see fr.irisa.triskell.kermeta.ui.UiFactory
 * @model kind="package"
 * @generated
 */
public interface UiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://kermeta/ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiPackage eINSTANCE = fr.irisa.triskell.kermeta.ui.impl.UiPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.ui.impl.TreeItemImpl <em>Tree Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.ui.impl.TreeItemImpl
	 * @see fr.irisa.triskell.kermeta.ui.impl.UiPackageImpl#getTreeItem()
	 * @generated
	 */
	int TREE_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM__CHILDREN = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Tree Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.ui.impl.FileDependencyTreeItemImpl <em>File Dependency Tree Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.ui.impl.FileDependencyTreeItemImpl
	 * @see fr.irisa.triskell.kermeta.ui.impl.UiPackageImpl#getFileDependencyTreeItem()
	 * @generated
	 */
	int FILE_DEPENDENCY_TREE_ITEM = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEPENDENCY_TREE_ITEM__CHILDREN = TREE_ITEM__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEPENDENCY_TREE_ITEM__PARENT = TREE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEPENDENCY_TREE_ITEM__VALUE = TREE_ITEM__VALUE;

	/**
	 * The number of structural features of the '<em>File Dependency Tree Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEPENDENCY_TREE_ITEM_FEATURE_COUNT = TREE_ITEM_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link fr.irisa.triskell.kermeta.ui.impl.DependentFileTreeItemImpl <em>Dependent File Tree Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.irisa.triskell.kermeta.ui.impl.DependentFileTreeItemImpl
	 * @see fr.irisa.triskell.kermeta.ui.impl.UiPackageImpl#getDependentFileTreeItem()
	 * @generated
	 */
	int DEPENDENT_FILE_TREE_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_FILE_TREE_ITEM__CHILDREN = TREE_ITEM__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_FILE_TREE_ITEM__PARENT = TREE_ITEM__PARENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_FILE_TREE_ITEM__VALUE = TREE_ITEM__VALUE;

	/**
	 * The number of structural features of the '<em>Dependent File Tree Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_FILE_TREE_ITEM_FEATURE_COUNT = TREE_ITEM_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.ui.TreeItem <em>Tree Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Item</em>'.
	 * @see fr.irisa.triskell.kermeta.ui.TreeItem
	 * @generated
	 */
	EClass getTreeItem();

	/**
	 * Returns the meta object for the reference list '{@link fr.irisa.triskell.kermeta.ui.TreeItem#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see fr.irisa.triskell.kermeta.ui.TreeItem#getChildren()
	 * @see #getTreeItem()
	 * @generated
	 */
	EReference getTreeItem_Children();

	/**
	 * Returns the meta object for the reference '{@link fr.irisa.triskell.kermeta.ui.TreeItem#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see fr.irisa.triskell.kermeta.ui.TreeItem#getParent()
	 * @see #getTreeItem()
	 * @generated
	 */
	EReference getTreeItem_Parent();

	/**
	 * Returns the meta object for the attribute '{@link fr.irisa.triskell.kermeta.ui.TreeItem#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.irisa.triskell.kermeta.ui.TreeItem#getValue()
	 * @see #getTreeItem()
	 * @generated
	 */
	EAttribute getTreeItem_Value();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.ui.FileDependencyTreeItem <em>File Dependency Tree Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Dependency Tree Item</em>'.
	 * @see fr.irisa.triskell.kermeta.ui.FileDependencyTreeItem
	 * @generated
	 */
	EClass getFileDependencyTreeItem();

	/**
	 * Returns the meta object for class '{@link fr.irisa.triskell.kermeta.ui.DependentFileTreeItem <em>Dependent File Tree Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent File Tree Item</em>'.
	 * @see fr.irisa.triskell.kermeta.ui.DependentFileTreeItem
	 * @generated
	 */
	EClass getDependentFileTreeItem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiFactory getUiFactory();

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
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.ui.impl.TreeItemImpl <em>Tree Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.ui.impl.TreeItemImpl
		 * @see fr.irisa.triskell.kermeta.ui.impl.UiPackageImpl#getTreeItem()
		 * @generated
		 */
		EClass TREE_ITEM = eINSTANCE.getTreeItem();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_ITEM__CHILDREN = eINSTANCE.getTreeItem_Children();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_ITEM__PARENT = eINSTANCE.getTreeItem_Parent();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_ITEM__VALUE = eINSTANCE.getTreeItem_Value();

		/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.ui.impl.FileDependencyTreeItemImpl <em>File Dependency Tree Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.ui.impl.FileDependencyTreeItemImpl
		 * @see fr.irisa.triskell.kermeta.ui.impl.UiPackageImpl#getFileDependencyTreeItem()
		 * @generated
		 */
		EClass FILE_DEPENDENCY_TREE_ITEM = eINSTANCE.getFileDependencyTreeItem();

			/**
		 * The meta object literal for the '{@link fr.irisa.triskell.kermeta.ui.impl.DependentFileTreeItemImpl <em>Dependent File Tree Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.irisa.triskell.kermeta.ui.impl.DependentFileTreeItemImpl
		 * @see fr.irisa.triskell.kermeta.ui.impl.UiPackageImpl#getDependentFileTreeItem()
		 * @generated
		 */
		EClass DEPENDENT_FILE_TREE_ITEM = eINSTANCE.getDependentFileTreeItem();

	}

} //UiPackage
