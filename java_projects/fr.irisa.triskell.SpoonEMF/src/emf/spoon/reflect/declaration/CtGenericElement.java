/**
 * <copyright>
 * </copyright>
 *
 * $Id: CtGenericElement.java,v 1.1 2007/02/14 20:38:02 barais Exp $
 */
package emf.spoon.reflect.declaration;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ct Generic Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.spoon.reflect.declaration.CtGenericElement#getFormalTypeParameters <em>Formal Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtGenericElement()
 * @model
 * @generated
 */
public interface CtGenericElement extends CtElement, spoon.reflect.declaration.CtGenericElement {
	/**
	 * Returns the value of the '<em><b>Formal Type Parameters</b></em>' reference list.
	 * The list contents are of type {@link emf.spoon.reflect.reference.CtTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Type Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Type Parameters</em>' reference list.
	 * @see emf.spoon.reflect.declaration.DeclarationPackage#getCtGenericElement_FormalTypeParameters()
	 * @model type="emf.spoon.reflect.reference.CtTypeReference"
	 * @generated
	 */
	List getFormalTypeParameters();

} // CtGenericElement