/**
 * <copyright>
 * </copyright>
 *
 * $Id: UiFactory.java,v 1.1 2007-04-04 13:25:29 ftanguy Exp $
 */
package fr.irisa.triskell.kermeta.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.kermeta.ui.UiPackage
 * @generated
 */
public interface UiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiFactory eINSTANCE = fr.irisa.triskell.kermeta.ui.impl.UiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File Dependency Tree Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Dependency Tree Item</em>'.
	 * @generated
	 */
	FileDependencyTreeItem createFileDependencyTreeItem();

	/**
	 * Returns a new object of class '<em>Dependent File Tree Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependent File Tree Item</em>'.
	 * @generated
	 */
	DependentFileTreeItem createDependentFileTreeItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UiPackage getUiPackage();

} //UiFactory
