/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtParameterReference.java,v 1.1 2007/02/14 20:38:03 barais Exp $
 */
package emf.spoon.reflect.reference;

import emf.spoon.reflect.declaration.CtParameter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Parameter Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.reference.CtParameterReference#getDeclaringExecutable <em>Declaring Executable</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.reference.ReferencePackage#getCtParameterReference()
 * @model
 * @generated
 */
public interface CtParameterReference extends CtVariableReference, spoon.reflect.reference.CtParameterReference {
	/**
	 * Returns the value of the '<em><b>Declaring Executable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaring Executable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaring Executable</em>' reference.
	 * @see #setDeclaringExecutable(CtExecutableReference)
	 * @see emf.spoon.reflect.reference.ReferencePackage#getCtParameterReference_DeclaringExecutable()
	 * @model
	 * @generated
	 */
	CtExecutableReference getDeclaringExecutable();

	/**
	 * Sets the value of the '{@link emf.spoon.reflect.reference.CtParameterReference#getDeclaringExecutable <em>Declaring Executable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaring Executable</em>' reference.
	 * @see #getDeclaringExecutable()
	 * @generated
	 */
	void setDeclaringExecutable(CtExecutableReference value);
	
	CtParameter getDeclaration();

} // CtParameterReference