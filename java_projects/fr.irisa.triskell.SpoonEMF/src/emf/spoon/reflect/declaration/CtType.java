/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtType.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import emf.spoon.factory.EmfSet;
import emf.spoon.reflect.reference.CtTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtType#getMethods <em>Methods</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtType#getSuperinterfaces <em>Superinterfaces</em>}</li>
 *   <li>{@link emf.spoon.reflect.declaration.CtType#getAllMethods <em>All Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtType()
 * @model
 * @generated
 */
public interface CtType extends CtGenericElement, CtSimpleType, spoon.reflect.declaration.CtType {
	/**
	 * Returns the value of the '<em><b>Methods</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.declaration.CtMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Methods</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtType_Methods()
	 * @model type="emf.spoon.reflect.declaration.CtMethod"
	 * @generated
	 */
	EmfSet getMethods();

	/**
	 * Returns the value of the '<em><b>Superinterfaces</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.reference.CtTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superinterfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superinterfaces</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtType_Superinterfaces()
	 * @model type="emf.spoon.reflect.reference.CtTypeReference" changeable="false"
	 * @generated
	 */
	EmfSet getSuperinterfaces();

	/**
	 * Returns the value of the '<em><b>All Methods</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.declaration.CtMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Methods</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Methods</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtType_AllMethods()
	 * @model type="emf.spoon.reflect.declaration.CtMethod" changeable="false"
	 * @generated
	 */
	EmfSet getAllMethods();
	
	CtTypeReference getReference();

} // CtType