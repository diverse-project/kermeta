/**
 * <copyright>
 * </copyright>
 *
 * $Id: EEnum.java,v 1.11 2009-01-21 09:16:03 cfaucher Exp $
 */
package ecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ecore.EEnum#getELiterals <em>ELiterals</em>}</li>
 * </ul>
 * </p>
 *
 * @see ecore.EcorePackage#getEEnum()
 * @model
 * @generated
 */
public interface EEnum extends EDataType {
	/**
	 * Returns the value of the '<em><b>ELiterals</b></em>' containment reference list.
	 * The list contents are of type {@link ecore.EEnumLiteral}.
	 * It is bidirectional and its opposite is '{@link ecore.EEnumLiteral#getEEnum <em>EEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELiterals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELiterals</em>' containment reference list.
	 * @see ecore.EcorePackage#getEEnum_ELiterals()
	 * @see ecore.EEnumLiteral#getEEnum
	 * @model opposite="eEnum" containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EEnumLiteral> getELiterals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameDataType="ecore.EString"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ecore.EEnumLiteral result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	EEnumLiteral op_getEEnumLiteral(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model valueDataType="ecore.EInt"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ecore.EEnumLiteral result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	EEnumLiteral getEEnumLiteral(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model literalDataType="ecore.EString"
	 *        annotation="kermeta isAbstract='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='ecore.EEnumLiteral result = null;\n\nreturn result;\n'"
	 * @generated
	 */
	EEnumLiteral getEEnumLiteralByLiteral(String literal);

} // EEnum
