/**
 * <copyright>
 * </copyright>
 *
 * $Id: KtrFactory.java,v 1.1 2007-06-05 09:55:10 dtouzet Exp $
 */
package fr.irisa.triskell.ktr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.irisa.triskell.ktr.KtrPackage
 * @generated
 */
public interface KtrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KtrFactory eINSTANCE = fr.irisa.triskell.ktr.impl.KtrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interpretation Pattern Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interpretation Pattern Model</em>'.
	 * @generated
	 */
	InterpretationPatternModel createInterpretationPatternModel();

	/**
	 * Returns a new object of class '<em>Interpretation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interpretation Rule</em>'.
	 * @generated
	 */
	InterpretationRule createInterpretationRule();

	/**
	 * Returns a new object of class '<em>Rule Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Variable</em>'.
	 * @generated
	 */
	RuleVariable createRuleVariable();

	/**
	 * Returns a new object of class '<em>Rule Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Pattern</em>'.
	 * @generated
	 */
	RulePattern createRulePattern();

	/**
	 * Returns a new object of class '<em>Rule Production</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Production</em>'.
	 * @generated
	 */
	RuleProduction createRuleProduction();

	/**
	 * Returns a new object of class '<em>Singleton Rule Production</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Singleton Rule Production</em>'.
	 * @generated
	 */
	SingletonRuleProduction createSingletonRuleProduction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KtrPackage getKtrPackage();

} //KtrFactory
