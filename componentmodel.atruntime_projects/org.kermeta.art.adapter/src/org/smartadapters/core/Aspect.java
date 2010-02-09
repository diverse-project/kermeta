/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import patternframework.ModelPattern;
import patternframework.PModel;
import patternframework.PObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smartadapters.core.Aspect#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.smartadapters.core.Aspect#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.smartadapters.core.Aspect#getPersistent <em>Persistent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smartadapters.core.SmartAdapters4DiVAPackage#getAspect()
 * @model
 * @generated
 */
public interface Aspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference.
	 * @see #setTemplate(ModelPattern)
	 * @see org.smartadapters.core.SmartAdapters4DiVAPackage#getAspect_Template()
	 * @model containment="true"
	 * @generated
	 */
	ModelPattern getTemplate();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.Aspect#getTemplate <em>Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' containment reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(ModelPattern value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(PModel)
	 * @see org.smartadapters.core.SmartAdapters4DiVAPackage#getAspect_Structure()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PModel getStructure();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.Aspect#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(PModel value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' reference list.
	 * The list contents are of type {@link patternframework.PObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' reference list.
	 * @see org.smartadapters.core.SmartAdapters4DiVAPackage#getAspect_Persistent()
	 * @model annotation="kermeta documentation='/**\r\n   persistent refers to aspectual PObject that must not be\r\n   cloned between two bindings\r\n   TODO : contraints...\r\n   \052/'"
	 * @generated
	 */
	EList<PObject> getPersistent();

} // Aspect
