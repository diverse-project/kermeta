/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package kompose;

import directives.CompositionDirective;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompose.Directives#getDirectives <em>Directives</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompose.KomposePackage#getDirectives()
 * @model abstract="true"
 * @generated
 */
public interface Directives extends EObject {
	/**
	 * Returns the value of the '<em><b>Directives</b></em>' containment reference list.
	 * The list contents are of type {@link directives.CompositionDirective}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directives</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directives</em>' containment reference list.
	 * @see kompose.KomposePackage#getDirectives_Directives()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompositionDirective> getDirectives();

} // Directives
