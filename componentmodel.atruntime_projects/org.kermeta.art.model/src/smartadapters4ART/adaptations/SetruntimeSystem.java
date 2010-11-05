/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.adaptations;

import art_relaxed.DataType;

import art_relaxed.instance_relaxed.CompositeInstance;

import art_relaxed.type_relaxed.ComponentType;
import art_relaxed.type_relaxed.Service;

import org.eclipse.emf.common.util.EList;

import smartadapters4ART.SetAdaptation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setruntime System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeSystem#getSystemToSet <em>System To Set</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeSystem#getRefroot <em>Refroot</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeSystem#getRefservices <em>Refservices</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeSystem#getReftypes <em>Reftypes</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeSystem#getRefdataTypes <em>Refdata Types</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeSystem#getRefname <em>Refname</em>}</li>
 * </ul>
 * </p>
 *
 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeSystem()
 * @model
 * @generated
 */
public interface SetruntimeSystem extends SetAdaptation {
	/**
	 * Returns the value of the '<em><b>System To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System To Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System To Set</em>' reference.
	 * @see #setSystemToSet(art_relaxed.System)
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeSystem_SystemToSet()
	 * @model
	 * @generated
	 */
	art_relaxed.System getSystemToSet();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeSystem#getSystemToSet <em>System To Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System To Set</em>' reference.
	 * @see #getSystemToSet()
	 * @generated
	 */
	void setSystemToSet(art_relaxed.System value);

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
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeSystem_Refroot()
	 * @model
	 * @generated
	 */
	CompositeInstance getRefroot();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeSystem#getRefroot <em>Refroot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refroot</em>' reference.
	 * @see #getRefroot()
	 * @generated
	 */
	void setRefroot(CompositeInstance value);

	/**
	 * Returns the value of the '<em><b>Refservices</b></em>' reference list.
	 * The list contents are of type {@link art_relaxed.type_relaxed.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refservices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refservices</em>' reference list.
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeSystem_Refservices()
	 * @model
	 * @generated
	 */
	EList<Service> getRefservices();

	/**
	 * Returns the value of the '<em><b>Reftypes</b></em>' reference list.
	 * The list contents are of type {@link art_relaxed.type_relaxed.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reftypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reftypes</em>' reference list.
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeSystem_Reftypes()
	 * @model
	 * @generated
	 */
	EList<ComponentType> getReftypes();

	/**
	 * Returns the value of the '<em><b>Refdata Types</b></em>' reference list.
	 * The list contents are of type {@link art_relaxed.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refdata Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refdata Types</em>' reference list.
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeSystem_RefdataTypes()
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
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeSystem_Refname()
	 * @model dataType="smartadapters4ART.String"
	 *        annotation="kermeta isComposite='false'"
	 * @generated
	 */
	String getRefname();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeSystem#getRefname <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refname</em>' attribute.
	 * @see #getRefname()
	 * @generated
	 */
	void setRefname(String value);

} // SetruntimeSystem
