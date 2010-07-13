/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kompose;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see kompose.KomposePackage
 * @generated
 */
public interface KomposeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KomposeFactory eINSTANCE = kompose.impl.KomposeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Matcher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matcher</em>'.
	 * @generated
	 */
	Matcher createMatcher();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Merger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merger</em>'.
	 * @generated
	 */
	Merger createMerger();

	/**
	 * Returns a new object of class '<em>Composer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composer</em>'.
	 * @generated
	 */
	Composer createComposer();

	/**
	 * Returns a new object of class '<em>Engine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Engine</em>'.
	 * @generated
	 */
	Engine createEngine();

	/**
	 * Returns a new object of class '<em>Conflict Resolver</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conflict Resolver</em>'.
	 * @generated
	 */
	ConflictResolver createConflictResolver();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KomposePackage getKomposePackage();

} //KomposeFactory
