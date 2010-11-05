/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.adaptations;

import art_relaxed.instance_relaxed.ComponentInstance;
import art_relaxed.instance_relaxed.CompositeInstance;
import art_relaxed.instance_relaxed.TransmissionBinding;
import art_relaxed.instance_relaxed.ValuedAttribute;

import art_relaxed.type_relaxed.ComponentType;

import org.eclipse.emf.common.util.EList;

import smartadapters4ART.SetAdaptation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setruntimeinstance Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getComponentInstanceToSet <em>Component Instance To Set</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getReftype <em>Reftype</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefstate <em>Refstate</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefsuperComponent <em>Refsuper Component</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefattribute <em>Refattribute</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefbinding <em>Refbinding</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefname <em>Refname</em>}</li>
 * </ul>
 * </p>
 *
 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceComponentInstance()
 * @model
 * @generated
 */
public interface SetruntimeinstanceComponentInstance extends SetAdaptation {
	/**
	 * Returns the value of the '<em><b>Component Instance To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Instance To Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Instance To Set</em>' reference.
	 * @see #setComponentInstanceToSet(ComponentInstance)
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceComponentInstance_ComponentInstanceToSet()
	 * @model
	 * @generated
	 */
	ComponentInstance getComponentInstanceToSet();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getComponentInstanceToSet <em>Component Instance To Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Instance To Set</em>' reference.
	 * @see #getComponentInstanceToSet()
	 * @generated
	 */
	void setComponentInstanceToSet(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Reftype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reftype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reftype</em>' reference.
	 * @see #setReftype(ComponentType)
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceComponentInstance_Reftype()
	 * @model
	 * @generated
	 */
	ComponentType getReftype();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getReftype <em>Reftype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reftype</em>' reference.
	 * @see #getReftype()
	 * @generated
	 */
	void setReftype(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Refstate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refstate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refstate</em>' attribute.
	 * @see #setRefstate(String)
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceComponentInstance_Refstate()
	 * @model dataType="smartadapters4ART.String"
	 *        annotation="kermeta isComposite='false'"
	 * @generated
	 */
	String getRefstate();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefstate <em>Refstate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refstate</em>' attribute.
	 * @see #getRefstate()
	 * @generated
	 */
	void setRefstate(String value);

	/**
	 * Returns the value of the '<em><b>Refsuper Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refsuper Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refsuper Component</em>' reference.
	 * @see #setRefsuperComponent(CompositeInstance)
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceComponentInstance_RefsuperComponent()
	 * @model
	 * @generated
	 */
	CompositeInstance getRefsuperComponent();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefsuperComponent <em>Refsuper Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refsuper Component</em>' reference.
	 * @see #getRefsuperComponent()
	 * @generated
	 */
	void setRefsuperComponent(CompositeInstance value);

	/**
	 * Returns the value of the '<em><b>Refattribute</b></em>' reference list.
	 * The list contents are of type {@link art_relaxed.instance_relaxed.ValuedAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refattribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refattribute</em>' reference list.
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceComponentInstance_Refattribute()
	 * @model
	 * @generated
	 */
	EList<ValuedAttribute> getRefattribute();

	/**
	 * Returns the value of the '<em><b>Refbinding</b></em>' reference list.
	 * The list contents are of type {@link art_relaxed.instance_relaxed.TransmissionBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refbinding</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refbinding</em>' reference list.
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceComponentInstance_Refbinding()
	 * @model
	 * @generated
	 */
	EList<TransmissionBinding> getRefbinding();

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
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceComponentInstance_Refname()
	 * @model dataType="smartadapters4ART.String"
	 *        annotation="kermeta isComposite='false'"
	 * @generated
	 */
	String getRefname();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeinstanceComponentInstance#getRefname <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refname</em>' attribute.
	 * @see #getRefname()
	 * @generated
	 */
	void setRefname(String value);

} // SetruntimeinstanceComponentInstance
