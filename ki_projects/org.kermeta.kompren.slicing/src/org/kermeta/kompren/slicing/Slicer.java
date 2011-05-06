/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.kompren.slicing;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slicer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.kompren.slicing.Slicer#getName <em>Name</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.Slicer#getUriMetamodel <em>Uri Metamodel</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.Slicer#isActive <em>Active</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.Slicer#isStrict <em>Strict</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.Slicer#getHelper <em>Helper</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.Slicer#getOnStart <em>On Start</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.Slicer#getOnEnd <em>On End</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.Slicer#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.Slicer#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.Slicer#getSlicedElements <em>Sliced Elements</em>}</li>
 *   <li>{@link org.kermeta.kompren.slicing.Slicer#getInputClasses <em>Input Classes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.kompren.slicing.SlicingPackage#getSlicer()
 * @model
 * @generated
 */
public interface Slicer extends EObject {
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
	 * @see org.kermeta.kompren.slicing.SlicingPackage#getSlicer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.kermeta.kompren.slicing.Slicer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uri Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Metamodel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Metamodel</em>' attribute.
	 * @see #setUriMetamodel(String)
	 * @see org.kermeta.kompren.slicing.SlicingPackage#getSlicer_UriMetamodel()
	 * @model required="true"
	 * @generated
	 */
	String getUriMetamodel();

	/**
	 * Sets the value of the '{@link org.kermeta.kompren.slicing.Slicer#getUriMetamodel <em>Uri Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Metamodel</em>' attribute.
	 * @see #getUriMetamodel()
	 * @generated
	 */
	void setUriMetamodel(String value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see org.kermeta.kompren.slicing.SlicingPackage#getSlicer_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link org.kermeta.kompren.slicing.Slicer#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strict</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strict</em>' attribute.
	 * @see #setStrict(boolean)
	 * @see org.kermeta.kompren.slicing.SlicingPackage#getSlicer_Strict()
	 * @model
	 * @generated
	 */
	boolean isStrict();

	/**
	 * Sets the value of the '{@link org.kermeta.kompren.slicing.Slicer#isStrict <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strict</em>' attribute.
	 * @see #isStrict()
	 * @generated
	 */
	void setStrict(boolean value);

	/**
	 * Returns the value of the '<em><b>Helper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Helper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helper</em>' attribute.
	 * @see #setHelper(String)
	 * @see org.kermeta.kompren.slicing.SlicingPackage#getSlicer_Helper()
	 * @model
	 * @generated
	 */
	String getHelper();

	/**
	 * Sets the value of the '{@link org.kermeta.kompren.slicing.Slicer#getHelper <em>Helper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Helper</em>' attribute.
	 * @see #getHelper()
	 * @generated
	 */
	void setHelper(String value);

	/**
	 * Returns the value of the '<em><b>On Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Start</em>' attribute.
	 * @see #setOnStart(String)
	 * @see org.kermeta.kompren.slicing.SlicingPackage#getSlicer_OnStart()
	 * @model
	 * @generated
	 */
	String getOnStart();

	/**
	 * Sets the value of the '{@link org.kermeta.kompren.slicing.Slicer#getOnStart <em>On Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Start</em>' attribute.
	 * @see #getOnStart()
	 * @generated
	 */
	void setOnStart(String value);

	/**
	 * Returns the value of the '<em><b>On End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On End</em>' attribute.
	 * @see #setOnEnd(String)
	 * @see org.kermeta.kompren.slicing.SlicingPackage#getSlicer_OnEnd()
	 * @model
	 * @generated
	 */
	String getOnEnd();

	/**
	 * Sets the value of the '{@link org.kermeta.kompren.slicing.Slicer#getOnEnd <em>On End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On End</em>' attribute.
	 * @see #getOnEnd()
	 * @generated
	 */
	void setOnEnd(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.kompren.slicing.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.kermeta.kompren.slicing.SlicingPackage#getSlicer_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' containment reference.
	 * @see #setRadius(Radius)
	 * @see org.kermeta.kompren.slicing.SlicingPackage#getSlicer_Radius()
	 * @model containment="true"
	 * @generated
	 */
	Radius getRadius();

	/**
	 * Sets the value of the '{@link org.kermeta.kompren.slicing.Slicer#getRadius <em>Radius</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' containment reference.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(Radius value);

	/**
	 * Returns the value of the '<em><b>Sliced Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.kompren.slicing.SlicedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sliced Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sliced Elements</em>' containment reference list.
	 * @see org.kermeta.kompren.slicing.SlicingPackage#getSlicer_SlicedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SlicedElement> getSlicedElements();

	/**
	 * Returns the value of the '<em><b>Input Classes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Classes</em>' reference list.
	 * @see org.kermeta.kompren.slicing.SlicingPackage#getSlicer_InputClasses()
	 * @model required="true"
	 * @generated
	 */
	EList<EClass> getInputClasses();

} // Slicer
