/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package patternframework;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see patternframework.PatternframeworkPackage
 * @generated
 */
public interface PatternframeworkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PatternframeworkFactory eINSTANCE = patternframework.impl.PatternframeworkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Pattern</em>'.
	 * @generated
	 */
	ModelPattern createModelPattern();

	/**
	 * Returns a new object of class '<em>PModel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PModel</em>'.
	 * @generated
	 */
	PModel createPModel();

	/**
	 * Returns a new object of class '<em>PObject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PObject</em>'.
	 * @generated
	 */
	PObject createPObject();

	/**
	 * Returns a new object of class '<em>PConstraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PConstraint</em>'.
	 * @generated
	 */
	PConstraint createPConstraint();

	/**
	 * Returns a new object of class '<em>PRole</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PRole</em>'.
	 * @generated
	 */
	PRole createPRole();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PatternframeworkPackage getPatternframeworkPackage();

} //PatternframeworkFactory
