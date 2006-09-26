/**
 * <copyright>
 * </copyright>
 *
 * $Id: StsFactory.java,v 1.1 2006-09-26 15:28:31 dtouzet Exp $
 */
package sts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see sts.StsPackage
 * @generated
 */
public interface StsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StsFactory eINSTANCE = sts.impl.StsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Iteration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iteration</em>'.
	 * @generated
	 */
	Iteration createIteration();

	/**
	 * Returns a new object of class '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative</em>'.
	 * @generated
	 */
	Alternative createAlternative();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Terminal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminal</em>'.
	 * @generated
	 */
	Terminal createTerminal();

	/**
	 * Returns a new object of class '<em>Object Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Reference</em>'.
	 * @generated
	 */
	ObjectReference createObjectReference();

	/**
	 * Returns a new object of class '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template</em>'.
	 * @generated
	 */
	Template createTemplate();

	/**
	 * Returns a new object of class '<em>Polymorphic Cond</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Polymorphic Cond</em>'.
	 * @generated
	 */
	PolymorphicCond createPolymorphicCond();

	/**
	 * Returns a new object of class '<em>Custom Cond</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Cond</em>'.
	 * @generated
	 */
	CustomCond createCustomCond();

	/**
	 * Returns a new object of class '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value</em>'.
	 * @generated
	 */
	StringValue createStringValue();

	/**
	 * Returns a new object of class '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value</em>'.
	 * @generated
	 */
	IntegerValue createIntegerValue();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>Rule Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule Ref</em>'.
	 * @generated
	 */
	RuleRef createRuleRef();

	/**
	 * Returns a new object of class '<em>Adornment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adornment</em>'.
	 * @generated
	 */
	Adornment createAdornment();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	Constant createConstant();

	/**
	 * Returns a new object of class '<em>URI Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URI Value</em>'.
	 * @generated
	 */
	URIValue createURIValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StsPackage getStsPackage();

} //StsFactory
