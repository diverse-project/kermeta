/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtTypeParameter.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtTypeParameter#getName <em>Name</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtTypeParameter#getBounds <em>Bounds</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtTypeParameter()
 * @model
 * @generated
 */
public interface CtTypeParameter extends CtElement, spoon.reflect.declaration.CtTypeParameter {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtTypeParameter_Name()
	 * @model dataType="emf.spoon.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.declaration.CtTypeParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.reference.CtTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtTypeParameter_Bounds()
	 * @model type="emf.spoon.reflect.reference.CtTypeReference"
	 * @generated
	 */
	List getBounds();

} // CtTypeParameter