/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompositionDirective.java,v 1.1.1.1 2008-11-04 08:27:29 mclavreu Exp $
 */
package kompose;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link kompose.CompositionDirective#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see kompose.KomposePackage#getCompositionDirective()
 * @model abstract="true"
 * @generated
 */
public interface CompositionDirective extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Context)
	 * @see kompose.KomposePackage#getCompositionDirective_Context()
	 * @model required="true"
	 * @generated
	 */
	Context getContext();

	/**
	 * Sets the value of the '{@link kompose.CompositionDirective#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(Context value);

} // CompositionDirective
