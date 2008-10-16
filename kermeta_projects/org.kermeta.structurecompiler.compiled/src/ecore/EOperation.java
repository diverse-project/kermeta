/**
 * <copyright>
 * </copyright>
 *
 * $Id: EOperation.java,v 1.6 2008-10-16 13:18:09 cfaucher Exp $
 */
package ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EOperation#getEContainingClass <em>EContaining Class</em>}</li>
 *   <li>{@link ecore.EOperation#getEGenericExceptions <em>EGeneric Exceptions</em>}</li>
 *   <li>{@link ecore.EOperation#getEParameters <em>EParameters</em>}</li>
 *   <li>{@link ecore.EOperation#getETypeParameters <em>EType Parameters</em>}</li>
 *   <li>{@link ecore.EOperation#getEExceptions <em>EExceptions</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEOperation()
 * @model
 * @generated
 */
public interface EOperation extends ETypedElement {
	/**
	 * Returns the value of the '<em><b>EContaining Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ecore.EClass#getEOperations <em>EOperations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContaining Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContaining Class</em>' container reference.
	 * @see ecore.EcorePackage#getEOperation_EContainingClass()
	 * @see ecore.EClass#getEOperations
	 * @model opposite="eOperations" changeable="false"
	 *        annotation="kermeta ecore.isTransient='true'"
	 * @generated
	 */
	EClass getEContainingClass();

	/**
	 * Returns the value of the '<em><b>EGeneric Exceptions</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.EGenericType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EGeneric Exceptions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EGeneric Exceptions</em>' containment reference list.
	 * @see ecore.EcorePackage#getEOperation_EGenericExceptions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EGenericType> getEGenericExceptions();

	/**
	 * Returns the value of the '<em><b>EParameters</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.EParameter}.
	 * It is bidirectional and its opposite is '{@link ecore.EParameter#getEOperation <em>EOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EParameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EParameters</em>' containment reference list.
	 * @see ecore.EcorePackage#getEOperation_EParameters()
	 * @see ecore.EParameter#getEOperation
	 * @model opposite="eOperation" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EParameter> getEParameters();

	/**
	 * Returns the value of the '<em><b>EType Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.ETypeParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EType Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EType Parameters</em>' containment reference list.
	 * @see ecore.EcorePackage#getEOperation_ETypeParameters()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ETypeParameter> getETypeParameters();

	/**
	 * Returns the value of the '<em><b>EExceptions</b></em>' reference list.
	 * The list contents are of type {@link ecore.EClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EExceptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EExceptions</em>' reference list.
	 * @see ecore.EcorePackage#getEOperation_EExceptions()
	 * @model
	 * @generated
	 */
	EList<EClassifier> getEExceptions();

} // EOperation
