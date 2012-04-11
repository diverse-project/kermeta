/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualified Name Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.QualifiedNamePath#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getQualifiedNamePath()
 * @model
 * @generated
 */
public interface QualifiedNamePath extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.UnqualifiedName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getQualifiedNamePath_Namespace()
	 * @model type="alfDsl.UnqualifiedName" containment="true"
	 * @generated
	 */
	EList getNamespace();

} // QualifiedNamePath
