/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.adaptations;

import org.eclipse.emf.common.util.EList;

import org.smartadapters.core.setAdaptation;

import pattern.art.DataType;

import pattern.art.instance.CompositeInstance;

import pattern.art.type.ComponentType;
import pattern.art.type.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setruntime System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeSystem#getSystemToSet <em>System To Set</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeSystem#getRefroot <em>Refroot</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeSystem#getRefservices <em>Refservices</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeSystem#getReftypes <em>Reftypes</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeSystem#getRefdataTypes <em>Refdata Types</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeSystem#getRefname <em>Refname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeSystem()
 * @model
 * @generated
 */
public interface SetruntimeSystem extends setAdaptation {
	/**
	 * Returns the value of the '<em><b>System To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System To Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System To Set</em>' reference.
	 * @see #setSystemToSet(pattern.art.System)
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeSystem_SystemToSet()
	 * @model
	 * @generated
	 */
	pattern.art.System getSystemToSet();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.adaptations.SetruntimeSystem#getSystemToSet <em>System To Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System To Set</em>' reference.
	 * @see #getSystemToSet()
	 * @generated
	 */
	void setSystemToSet(pattern.art.System value);

	/**
	 * Returns the value of the '<em><b>Refroot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refroot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refroot</em>' reference.
	 * @see #setRefroot(CompositeInstance)
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeSystem_Refroot()
	 * @model
	 * @generated
	 */
	CompositeInstance getRefroot();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.adaptations.SetruntimeSystem#getRefroot <em>Refroot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refroot</em>' reference.
	 * @see #getRefroot()
	 * @generated
	 */
	void setRefroot(CompositeInstance value);

	/**
	 * Returns the value of the '<em><b>Refservices</b></em>' reference list.
	 * The list contents are of type {@link pattern.art.type.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refservices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refservices</em>' reference list.
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeSystem_Refservices()
	 * @model
	 * @generated
	 */
	EList<Service> getRefservices();

	/**
	 * Returns the value of the '<em><b>Reftypes</b></em>' reference list.
	 * The list contents are of type {@link pattern.art.type.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reftypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reftypes</em>' reference list.
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeSystem_Reftypes()
	 * @model
	 * @generated
	 */
	EList<ComponentType> getReftypes();

	/**
	 * Returns the value of the '<em><b>Refdata Types</b></em>' reference list.
	 * The list contents are of type {@link pattern.art.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refdata Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refdata Types</em>' reference list.
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeSystem_RefdataTypes()
	 * @model
	 * @generated
	 */
	EList<DataType> getRefdataTypes();

	/**
	 * Returns the value of the '<em><b>Refname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refname</em>' attribute.
	 * @see #setRefname(String)
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeSystem_Refname()
	 * @model dataType="pattern.art.String"
	 *        annotation="kermeta isComposite='false'"
	 * @generated
	 */
	String getRefname();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.adaptations.SetruntimeSystem#getRefname <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refname</em>' attribute.
	 * @see #getRefname()
	 * @generated
	 */
	void setRefname(String value);

} // SetruntimeSystem
