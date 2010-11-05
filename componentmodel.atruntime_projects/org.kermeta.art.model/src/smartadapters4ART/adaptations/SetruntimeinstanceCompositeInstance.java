/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package smartadapters4ART.adaptations;

import art_relaxed.instance_relaxed.ComponentInstance;
import art_relaxed.instance_relaxed.CompositeInstance;
import art_relaxed.instance_relaxed.DelegationBinding;
import art_relaxed.instance_relaxed.TransmissionBinding;
import art_relaxed.instance_relaxed.ValuedAttribute;

import art_relaxed.type_relaxed.ComponentType;

import org.eclipse.emf.common.util.EList;

import smartadapters4ART.SetAdaptation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setruntimeinstance Composite Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getCompositeInstanceToSet <em>Composite Instance To Set</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefsubComponent <em>Refsub Component</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefdelegation <em>Refdelegation</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getReftype <em>Reftype</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefstate <em>Refstate</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefsuperComponent <em>Refsuper Component</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefattribute <em>Refattribute</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefbinding <em>Refbinding</em>}</li>
 *   <li>{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefname <em>Refname</em>}</li>
 * </ul>
 * </p>
 *
 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceCompositeInstance()
 * @model
 * @generated
 */
public interface SetruntimeinstanceCompositeInstance extends SetAdaptation {
	/**
	 * Returns the value of the '<em><b>Composite Instance To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Instance To Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Instance To Set</em>' reference.
	 * @see #setCompositeInstanceToSet(CompositeInstance)
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceCompositeInstance_CompositeInstanceToSet()
	 * @model
	 * @generated
	 */
	CompositeInstance getCompositeInstanceToSet();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getCompositeInstanceToSet <em>Composite Instance To Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Instance To Set</em>' reference.
	 * @see #getCompositeInstanceToSet()
	 * @generated
	 */
	void setCompositeInstanceToSet(CompositeInstance value);

	/**
	 * Returns the value of the '<em><b>Refsub Component</b></em>' reference list.
	 * The list contents are of type {@link art_relaxed.instance_relaxed.ComponentInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refsub Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refsub Component</em>' reference list.
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceCompositeInstance_RefsubComponent()
	 * @model
	 * @generated
	 */
	EList<ComponentInstance> getRefsubComponent();

	/**
	 * Returns the value of the '<em><b>Refdelegation</b></em>' reference list.
	 * The list contents are of type {@link art_relaxed.instance_relaxed.DelegationBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refdelegation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refdelegation</em>' reference list.
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceCompositeInstance_Refdelegation()
	 * @model
	 * @generated
	 */
	EList<DelegationBinding> getRefdelegation();

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
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceCompositeInstance_Reftype()
	 * @model
	 * @generated
	 */
	ComponentType getReftype();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getReftype <em>Reftype</em>}' reference.
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
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceCompositeInstance_Refstate()
	 * @model dataType="smartadapters4ART.String"
	 *        annotation="kermeta isComposite='false'"
	 * @generated
	 */
	String getRefstate();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefstate <em>Refstate</em>}' attribute.
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
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceCompositeInstance_RefsuperComponent()
	 * @model
	 * @generated
	 */
	CompositeInstance getRefsuperComponent();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefsuperComponent <em>Refsuper Component</em>}' reference.
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
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceCompositeInstance_Refattribute()
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
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceCompositeInstance_Refbinding()
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
	 * @see smartadapters4ART.adaptations.AdaptationsPackage#getSetruntimeinstanceCompositeInstance_Refname()
	 * @model dataType="smartadapters4ART.String"
	 *        annotation="kermeta isComposite='false'"
	 * @generated
	 */
	String getRefname();

	/**
	 * Sets the value of the '{@link smartadapters4ART.adaptations.SetruntimeinstanceCompositeInstance#getRefname <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refname</em>' attribute.
	 * @see #getRefname()
	 * @generated
	 */
	void setRefname(String value);

} // SetruntimeinstanceCompositeInstance
