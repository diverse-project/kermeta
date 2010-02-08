/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.smartadapters.core.adaptations;

import org.eclipse.emf.common.util.EList;

import org.smartadapters.core.setAdaptation;

import pattern.art.instance.CompositeInstance;
import pattern.art.instance.PrimitiveInstance;
import pattern.art.instance.TransmissionBinding;
import pattern.art.instance.ValuedAttribute;

import pattern.art.type.ComponentType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setruntimeinstance Primitive Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getPrimitiveInstanceToSet <em>Primitive Instance To Set</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getReftype <em>Reftype</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefstate <em>Refstate</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefsuperComponent <em>Refsuper Component</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefattribute <em>Refattribute</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefbinding <em>Refbinding</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefcontrollerDesc <em>Refcontroller Desc</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefcontentDesc <em>Refcontent Desc</em>}</li>
 *   <li>{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefname <em>Refname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstancePrimitiveInstance()
 * @model
 * @generated
 */
public interface SetruntimeinstancePrimitiveInstance extends setAdaptation {
	/**
	 * Returns the value of the '<em><b>Primitive Instance To Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Instance To Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Instance To Set</em>' reference.
	 * @see #setPrimitiveInstanceToSet(PrimitiveInstance)
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstancePrimitiveInstance_PrimitiveInstanceToSet()
	 * @model
	 * @generated
	 */
	PrimitiveInstance getPrimitiveInstanceToSet();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getPrimitiveInstanceToSet <em>Primitive Instance To Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Instance To Set</em>' reference.
	 * @see #getPrimitiveInstanceToSet()
	 * @generated
	 */
	void setPrimitiveInstanceToSet(PrimitiveInstance value);

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
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstancePrimitiveInstance_Reftype()
	 * @model
	 * @generated
	 */
	ComponentType getReftype();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getReftype <em>Reftype</em>}' reference.
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
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstancePrimitiveInstance_Refstate()
	 * @model dataType="pattern.art.String"
	 *        annotation="kermeta isComposite='false'"
	 * @generated
	 */
	String getRefstate();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefstate <em>Refstate</em>}' attribute.
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
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstancePrimitiveInstance_RefsuperComponent()
	 * @model
	 * @generated
	 */
	CompositeInstance getRefsuperComponent();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefsuperComponent <em>Refsuper Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refsuper Component</em>' reference.
	 * @see #getRefsuperComponent()
	 * @generated
	 */
	void setRefsuperComponent(CompositeInstance value);

	/**
	 * Returns the value of the '<em><b>Refattribute</b></em>' reference list.
	 * The list contents are of type {@link pattern.art.instance.ValuedAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refattribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refattribute</em>' reference list.
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstancePrimitiveInstance_Refattribute()
	 * @model
	 * @generated
	 */
	EList<ValuedAttribute> getRefattribute();

	/**
	 * Returns the value of the '<em><b>Refbinding</b></em>' reference list.
	 * The list contents are of type {@link pattern.art.instance.TransmissionBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refbinding</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refbinding</em>' reference list.
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstancePrimitiveInstance_Refbinding()
	 * @model
	 * @generated
	 */
	EList<TransmissionBinding> getRefbinding();

	/**
	 * Returns the value of the '<em><b>Refcontroller Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refcontroller Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refcontroller Desc</em>' attribute.
	 * @see #setRefcontrollerDesc(String)
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstancePrimitiveInstance_RefcontrollerDesc()
	 * @model dataType="pattern.art.String"
	 *        annotation="kermeta isComposite='false'"
	 * @generated
	 */
	String getRefcontrollerDesc();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefcontrollerDesc <em>Refcontroller Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refcontroller Desc</em>' attribute.
	 * @see #getRefcontrollerDesc()
	 * @generated
	 */
	void setRefcontrollerDesc(String value);

	/**
	 * Returns the value of the '<em><b>Refcontent Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refcontent Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refcontent Desc</em>' attribute.
	 * @see #setRefcontentDesc(String)
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstancePrimitiveInstance_RefcontentDesc()
	 * @model dataType="pattern.art.String"
	 *        annotation="kermeta isComposite='false'"
	 * @generated
	 */
	String getRefcontentDesc();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefcontentDesc <em>Refcontent Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refcontent Desc</em>' attribute.
	 * @see #getRefcontentDesc()
	 * @generated
	 */
	void setRefcontentDesc(String value);

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
	 * @see org.smartadapters.core.adaptations.AdaptationsPackage#getSetruntimeinstancePrimitiveInstance_Refname()
	 * @model dataType="pattern.art.String"
	 *        annotation="kermeta isComposite='false'"
	 * @generated
	 */
	String getRefname();

	/**
	 * Sets the value of the '{@link org.smartadapters.core.adaptations.SetruntimeinstancePrimitiveInstance#getRefname <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refname</em>' attribute.
	 * @see #getRefname()
	 * @generated
	 */
	void setRefname(String value);

} // SetruntimeinstancePrimitiveInstance
