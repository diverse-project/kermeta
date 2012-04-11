/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package alfDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unqualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link alfDsl.UnqualifiedName#getName <em>Name</em>}</li>
 *   <li>{@link alfDsl.UnqualifiedName#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see alfDsl.AlfDslPackage#getUnqualifiedName()
 * @model
 * @generated
 */
public interface UnqualifiedName extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see alfDsl.AlfDslPackage#getUnqualifiedName_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link alfDsl.UnqualifiedName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Template Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Binding</em>' containment reference.
	 * @see #setTemplateBinding(TemplateBinding)
	 * @see alfDsl.AlfDslPackage#getUnqualifiedName_TemplateBinding()
	 * @model containment="true"
	 * @generated
	 */
	TemplateBinding getTemplateBinding();

	/**
	 * Sets the value of the '{@link alfDsl.UnqualifiedName#getTemplateBinding <em>Template Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Binding</em>' containment reference.
	 * @see #getTemplateBinding()
	 * @generated
	 */
	void setTemplateBinding(TemplateBinding value);

} // UnqualifiedName
