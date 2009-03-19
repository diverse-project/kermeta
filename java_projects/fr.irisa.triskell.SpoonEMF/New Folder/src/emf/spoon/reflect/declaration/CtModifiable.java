/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtModifiable.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import org.eclipse.emf.ecore.EObject;

import emf.spoon.factory.EmfSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Modifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtModifiable#getModifiers <em>Modifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtModifiable()
 * @model
 * @generated
 */
public interface CtModifiable extends EObject, spoon.reflect.declaration.CtModifiable {
	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' attribute list.
	 * The list contents are of type {@link spoon.reflect.declaration.ModifierKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifiers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' attribute list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtModifiable_Modifiers()
	 * @model type="spoon.reflect.declaration.ModifierKind" dataType="emf.spoon.ModifierKind"
	 * @generated
	 */
	EmfSet getModifiers();

} // CtModifiable