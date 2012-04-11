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
 * A representation of the model object '<em><b>Template Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.TemplateBinding#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getTemplateBinding()
 * @model
 * @generated
 */
public interface TemplateBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link alfDsl.NamedTemplateBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see alfDsl.AlfDslPackage#getTemplateBinding_Bindings()
	 * @model type="alfDsl.NamedTemplateBinding" containment="true"
	 * @generated
	 */
	EList getBindings();

} // TemplateBinding
