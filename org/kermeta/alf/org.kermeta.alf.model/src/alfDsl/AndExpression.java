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
 * A representation of the model object '<em><b>And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.AndExpression#getExp <em>Exp</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getAndExpression()
 * @model
 * @generated
 */
public interface AndExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Exp</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.EqualityExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getAndExpression_Exp()
	 * @model type="alfDsl.EqualityExpression" containment="true"
	 * @generated
	 */
	EList getExp();

} // AndExpression
