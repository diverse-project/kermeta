/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package directives;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link directives.ElementDirective#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see directives.DirectivesPackage#getElementDirective()
 * @model abstract="true"
 * @generated
 */
public interface ElementDirective extends CompositionDirective {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(ElementRef)
	 * @see directives.DirectivesPackage#getElementDirective_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementRef getTarget();

	/**
	 * Sets the value of the '{@link directives.ElementDirective#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ElementRef value);

} // ElementDirective
