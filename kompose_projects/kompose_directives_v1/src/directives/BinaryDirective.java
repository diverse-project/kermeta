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
 * A representation of the model object '<em><b>Binary Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link directives.BinaryDirective#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see directives.DirectivesPackage#getBinaryDirective()
 * @model abstract="true"
 * @generated
 */
public interface BinaryDirective extends ElementDirective {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link directives.ElementRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see directives.DirectivesPackage#getBinaryDirective_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ElementRef> getValue();

} // BinaryDirective
