/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferenceFactory.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.reference;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see emf.spoon.reflect.reference.ReferencePackage
 * @generated
 */
public interface ReferenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReferenceFactory eINSTANCE = emf.spoon.reflect.reference.impl.ReferenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ct Array Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Array Type Reference</em>'.
	 * @generated
	 */
	CtArrayTypeReference createCtArrayTypeReference();

	/**
	 * Returns a new object of class '<em>Ct Executable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Executable Reference</em>'.
	 * @generated
	 */
	CtExecutableReference createCtExecutableReference();

	/**
	 * Returns a new object of class '<em>Ct Field Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Field Reference</em>'.
	 * @generated
	 */
	CtFieldReference createCtFieldReference();

	/**
	 * Returns a new object of class '<em>Ct Generic Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Generic Element Reference</em>'.
	 * @generated
	 */
	CtGenericElementReference createCtGenericElementReference();

	/**
	 * Returns a new object of class '<em>Ct Local Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Local Variable Reference</em>'.
	 * @generated
	 */
	CtLocalVariableReference createCtLocalVariableReference();

	/**
	 * Returns a new object of class '<em>Ct Package Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Package Reference</em>'.
	 * @generated
	 */
	CtPackageReference createCtPackageReference();

	/**
	 * Returns a new object of class '<em>Ct Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Parameter Reference</em>'.
	 * @generated
	 */
	CtParameterReference createCtParameterReference();

	/**
	 * Returns a new object of class '<em>Ct Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Reference</em>'.
	 * @generated
	 */
	CtReference createCtReference();

	/**
	 * Returns a new object of class '<em>Ct Type Parameter Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Type Parameter Reference</em>'.
	 * @generated
	 */
	CtTypeParameterReference createCtTypeParameterReference();

	/**
	 * Returns a new object of class '<em>Ct Type Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Type Reference</em>'.
	 * @generated
	 */
	CtTypeReference createCtTypeReference();

	/**
	 * Returns a new object of class '<em>Ct Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ct Variable Reference</em>'.
	 * @generated
	 */
	CtVariableReference createCtVariableReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReferencePackage getReferencePackage();

} //ReferenceFactory
