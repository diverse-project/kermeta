/**
 * <copyright>
 * </copyright>
 *
 */
package org.kermeta.alf.xtext.alf;

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
 *   <li>{@link org.kermeta.alf.xtext.alf.TemplateBinding#getBindings <em>Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.alf.xtext.alf.AlfPackage#getTemplateBinding()
 * @model
 * @generated
 */
public interface TemplateBinding extends EObject
{
  /**
   * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
   * The list contents are of type {@link org.kermeta.alf.xtext.alf.NamedTemplateBinding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bindings</em>' containment reference list.
   * @see org.kermeta.alf.xtext.alf.AlfPackage#getTemplateBinding_Bindings()
   * @model containment="true"
   * @generated
   */
  EList<NamedTemplateBinding> getBindings();

} // TemplateBinding
