/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package art_relaxed.group_relaxed;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see art_relaxed.group_relaxed.Group_relaxedPackage
 * @generated
 */
public interface Group_relaxedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Group_relaxedFactory eINSTANCE = art_relaxed.group_relaxed.impl.Group_relaxedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Type Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Group</em>'.
	 * @generated
	 */
	TypeGroup createTypeGroup();

	/**
	 * Returns a new object of class '<em>Instance Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Group</em>'.
	 * @generated
	 */
	InstanceGroup createInstanceGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Group_relaxedPackage getGroup_relaxedPackage();

} //Group_relaxedFactory
